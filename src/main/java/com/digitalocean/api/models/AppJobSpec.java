package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The AppJobSpec model.
 */
@Fluent
public final class AppJobSpec extends AppComponentBase {
    /*
     * - UNSPECIFIED: Default job type, will auto-complete to POST_DEPLOY kind.
     * - PRE_DEPLOY: Indicates a job that runs before an app deployment.
     * - POST_DEPLOY: Indicates a job that runs after an app deployment.
     * - FAILED_DEPLOY: Indicates a job that runs after a component fails to deploy.
     */
    @JsonProperty(value = "kind")
    private AppJobSpecKind kind;

    /*
     * The amount of instances that this component should be scaled to. Default: 1
     */
    @JsonProperty(value = "instance_count")
    private Long instanceCount;

    /*
     * The instance size to use for this component. Default: `basic-xxs`
     */
    @JsonProperty(value = "instance_size_slug")
    private AppComponentInstanceBaseInstanceSizeSlug instanceSizeSlug;

    /**
     * Get the kind property: - UNSPECIFIED: Default job type, will auto-complete to POST_DEPLOY kind.
     * - PRE_DEPLOY: Indicates a job that runs before an app deployment.
     * - POST_DEPLOY: Indicates a job that runs after an app deployment.
     * - FAILED_DEPLOY: Indicates a job that runs after a component fails to deploy.
     * 
     * @return the kind value.
     */
    public AppJobSpecKind getKind() {
        return this.kind;
    }

    /**
     * Set the kind property: - UNSPECIFIED: Default job type, will auto-complete to POST_DEPLOY kind.
     * - PRE_DEPLOY: Indicates a job that runs before an app deployment.
     * - POST_DEPLOY: Indicates a job that runs after an app deployment.
     * - FAILED_DEPLOY: Indicates a job that runs after a component fails to deploy.
     * 
     * @param kind the kind value to set.
     * @return the AppJobSpec object itself.
     */
    public AppJobSpec setKind(AppJobSpecKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the instanceCount property: The amount of instances that this component should be scaled to. Default: 1.
     * 
     * @return the instanceCount value.
     */
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: The amount of instances that this component should be scaled to. Default: 1.
     * 
     * @param instanceCount the instanceCount value to set.
     * @return the AppJobSpec object itself.
     */
    public AppJobSpec setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Get the instanceSizeSlug property: The instance size to use for this component. Default: `basic-xxs`.
     * 
     * @return the instanceSizeSlug value.
     */
    public AppComponentInstanceBaseInstanceSizeSlug getInstanceSizeSlug() {
        return this.instanceSizeSlug;
    }

    /**
     * Set the instanceSizeSlug property: The instance size to use for this component. Default: `basic-xxs`.
     * 
     * @param instanceSizeSlug the instanceSizeSlug value to set.
     * @return the AppJobSpec object itself.
     */
    public AppJobSpec setInstanceSizeSlug(AppComponentInstanceBaseInstanceSizeSlug instanceSizeSlug) {
        this.instanceSizeSlug = instanceSizeSlug;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppJobSpec setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppJobSpec setGit(AppsGitSourceSpec git) {
        super.setGit(git);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppJobSpec setGithub(AppsGithubSourceSpec github) {
        super.setGithub(github);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppJobSpec setGitlab(AppsGitlabSourceSpec gitlab) {
        super.setGitlab(gitlab);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppJobSpec setImage(AppsImageSourceSpec image) {
        super.setImage(image);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppJobSpec setDockerfilePath(String dockerfilePath) {
        super.setDockerfilePath(dockerfilePath);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppJobSpec setBuildCommand(String buildCommand) {
        super.setBuildCommand(buildCommand);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppJobSpec setRunCommand(String runCommand) {
        super.setRunCommand(runCommand);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppJobSpec setSourceDir(String sourceDir) {
        super.setSourceDir(sourceDir);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppJobSpec setEnvs(List<AppVariableDefinition> envs) {
        super.setEnvs(envs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppJobSpec setEnvironmentSlug(String environmentSlug) {
        super.setEnvironmentSlug(environmentSlug);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppJobSpec setLogDestinations(AppLogDestinationDefinition logDestinations) {
        super.setLogDestinations(logDestinations);
        return this;
    }
}
