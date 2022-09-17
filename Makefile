LOCAL_SPEC_FILE=./DigitalOcean-public.v2.yaml
MODELERFOUR_VERSION="4.23.6"
AUTOREST_JAVA_VERSION="4.1.3"
PACKAGE_VERSION?="dev"

ifeq (, $(findstring -m,$(PYTEST_ARGS)))
	PYTEST_EXCLUDE_MARKS=-m "not real_billing"
endif

.PHONY: help
help:
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'; \
	printf "\nNOTE: Run 'SPEC_FILE=path/to/local/spec make generate' to skip the download and use a local spec file.\n"

.PHONY: dev-dependencies
dev-dependencies: ## Install development tooling
	npm install --only=dev

.PHONY: clean
clean: ## Removes all generated code (except _patch.py files)
	@printf "=== Cleaning src directory\n"
	@rm -rf src
	@mkdir -p src

.PHONY: download-spec
download-spec: ## Download Latest DO Spec
	@echo Downloading published spec; \
	touch DigitalOcean-public.v2.yaml && \
	curl https://api-engineering.nyc3.digitaloceanspaces.com/spec-ci/DigitalOcean-public.v2.yaml -o $(LOCAL_SPEC_FILE)

.PHONY: generate
ifndef SPEC_FILE
generate: SPEC_FILE = $(LOCAL_SPEC_FILE)
generate: dev-dependencies download-spec ## Generates the java client using the latest published spec first.
endif
generate: clean dev-dependencies
	@printf "=== Generating client with spec: $(SPEC_FILE)\n\n"; \
	npm run autorest -- client_gen_config.md \
		--generate-samples \
		--generate-tests \
		--use:@autorest/modelerfour@$(MODELERFOUR_VERSION) \
		--use:/home/halkeye/go/src/github.com/jenkinsci/autorest.java \
		--package-version=$(PACKAGE_VERSION) \
		--input-file=$(SPEC_FILE)
# --use:@autorest/java@$(AUTOREST_JAVA_VERSION) \


.PHONY: docker-build
docker-build:
	docker build -t digitalocean-client-java:dev .

.PHONY: docker-java
docker-java: docker-build  ## Runs a java shel within a docker container
	docker run -it --rm --name pydo digitalocean-client-java:dev java
