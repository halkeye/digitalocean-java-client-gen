package com.digitalocean.api;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.RegistriesCreateResponse;
import com.digitalocean.api.models.RegistriesDeleteRepositoryManifestResponse;
import com.digitalocean.api.models.RegistriesDeleteRepositoryTagResponse;
import com.digitalocean.api.models.RegistriesDeleteResponse;
import com.digitalocean.api.models.RegistriesGetDockerCredentialsResponse;
import com.digitalocean.api.models.RegistriesGetGarbageCollectionResponse;
import com.digitalocean.api.models.RegistriesGetOptionsResponse;
import com.digitalocean.api.models.RegistriesGetResponse;
import com.digitalocean.api.models.RegistriesGetSubscriptionResponse;
import com.digitalocean.api.models.RegistriesListGarbageCollectionsResponse;
import com.digitalocean.api.models.RegistriesListRepositoriesResponse;
import com.digitalocean.api.models.RegistriesListRepositoriesV2Response;
import com.digitalocean.api.models.RegistriesListRepositoryManifestsResponse;
import com.digitalocean.api.models.RegistriesListRepositoryTagsResponse;
import com.digitalocean.api.models.RegistriesRunGarbageCollectionResponse;
import com.digitalocean.api.models.RegistriesUpdateGarbageCollectionResponse;
import com.digitalocean.api.models.RegistriesUpdateSubscriptionResponse;
import com.digitalocean.api.models.RegistriesValidateNameResponse;
import com.digitalocean.api.models.RegistryCreate;
import com.digitalocean.api.models.UpdateRegistry;
import com.digitalocean.api.models.ValidateRegistry;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Registries. */
public final class Registries {
    /** The proxy service used to perform REST calls. */
    private final RegistriesService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Registries.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Registries(GeneratedClient client) {
        this.service =
                RestProxy.create(RegistriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientRegistries to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientRegis")
    private interface RegistriesService {
        @Get("/v2/registry")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesGetResponse> get(@HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Post("/v2/registry")
        @ExpectedResponses({201, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesCreateResponse> create(
                @HostParam("$host") String host,
                @BodyParam("application/json") RegistryCreate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/registry")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesDeleteResponse> delete(@HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Get("/v2/registry/subscription")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesGetSubscriptionResponse> getSubscription(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Post("/v2/registry/subscription")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesUpdateSubscriptionResponse> updateSubscription(
                @HostParam("$host") String host,
                @BodyParam("application/json")
                        Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/registry/docker-credentials")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesGetDockerCredentialsResponse> getDockerCredentials(
                @HostParam("$host") String host,
                @QueryParam("expiry_seconds") Integer expirySeconds,
                @QueryParam("read_write") Boolean readWrite,
                @HeaderParam("Accept") String accept);

        @Post("/v2/registry/validate-name")
        @ExpectedResponses({204, 401, 409, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesValidateNameResponse> validateName(
                @HostParam("$host") String host,
                @BodyParam("application/json") ValidateRegistry body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/registry/{registry_name}/repositories")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesListRepositoriesResponse> listRepositories(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @PathParam("registry_name") String registryName,
                @HeaderParam("Accept") String accept);

        @Get("/v2/registry/{registry_name}/repositoriesV2")
        @ExpectedResponses({200, 400, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesListRepositoriesV2Response> listRepositoriesV2(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @QueryParam("page_token") String pageToken,
                @PathParam("registry_name") String registryName,
                @HeaderParam("Accept") String accept);

        @Get("/v2/registry/{registry_name}/{repository_name}/tags")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesListRepositoryTagsResponse> listRepositoryTags(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @PathParam("registry_name") String registryName,
                @PathParam("repository_name") String repositoryName,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/registry/{registry_name}/{repository_name}/tags/{repository_tag}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesDeleteRepositoryTagResponse> deleteRepositoryTag(
                @HostParam("$host") String host,
                @PathParam("registry_name") String registryName,
                @PathParam("repository_name") String repositoryName,
                @PathParam("repository_tag") String repositoryTag,
                @HeaderParam("Accept") String accept);

        @Get("/v2/registry/{registry_name}/{repository_name}/digests")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesListRepositoryManifestsResponse> listRepositoryManifests(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @PathParam("registry_name") String registryName,
                @PathParam("repository_name") String repositoryName,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/registry/{registry_name}/{repository_name}/digests/{manifest_digest}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesDeleteRepositoryManifestResponse> deleteRepositoryManifest(
                @HostParam("$host") String host,
                @PathParam("registry_name") String registryName,
                @PathParam("repository_name") String repositoryName,
                @PathParam("manifest_digest") String manifestDigest,
                @HeaderParam("Accept") String accept);

        @Post("/v2/registry/{registry_name}/garbage-collection")
        @ExpectedResponses({201, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesRunGarbageCollectionResponse> runGarbageCollection(
                @HostParam("$host") String host,
                @PathParam("registry_name") String registryName,
                @HeaderParam("Accept") String accept);

        @Get("/v2/registry/{registry_name}/garbage-collection")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesGetGarbageCollectionResponse> getGarbageCollection(
                @HostParam("$host") String host,
                @PathParam("registry_name") String registryName,
                @HeaderParam("Accept") String accept);

        @Get("/v2/registry/{registry_name}/garbage-collections")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesListGarbageCollectionsResponse> listGarbageCollections(
                @HostParam("$host") String host,
                @PathParam("registry_name") String registryName,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);

        @Put("/v2/registry/{registry_name}/garbage-collection/{garbage_collection_uuid}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesUpdateGarbageCollectionResponse> updateGarbageCollection(
                @HostParam("$host") String host,
                @PathParam("registry_name") String registryName,
                @PathParam("garbage_collection_uuid") String garbageCollectionUuid,
                @BodyParam("application/json") UpdateRegistry body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/registry/options")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<RegistriesGetOptionsResponse> getOptions(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);
    }

    /**
     * Get Container Registry Information
     *
     * <p>To get information about your container registry, send a GET request to `/v2/registry`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesGetResponse> getWithResponseAsync() {
        final String accept = "application/json";
        return service.get(this.client.getHost(), accept);
    }

    /**
     * Get Container Registry Information
     *
     * <p>To get information about your container registry, send a GET request to `/v2/registry`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync() {
        return getWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create Container Registry
     *
     * <p>To create your container registry, send a POST request to `/v2/registry`.
     *
     * <p>The `name` becomes part of the URL for images stored in the registry. For example, if your registry is called
     * `example`, an image in it will have the URL `registry.digitalocean.com/example/image:tag`.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesCreateResponse> createWithResponseAsync(RegistryCreate body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), body, accept);
    }

    /**
     * Create Container Registry
     *
     * <p>To create your container registry, send a POST request to `/v2/registry`.
     *
     * <p>The `name` becomes part of the URL for images stored in the registry. For example, if your registry is called
     * `example`, an image in it will have the URL `registry.digitalocean.com/example/image:tag`.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAsync(RegistryCreate body) {
        return createWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete Container Registry
     *
     * <p>To delete your container registry, destroying all container image data stored in it, send a DELETE request to
     * `/v2/registry`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesDeleteResponse> deleteWithResponseAsync() {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), accept);
    }

    /**
     * Delete Container Registry
     *
     * <p>To delete your container registry, destroying all container image data stored in it, send a DELETE request to
     * `/v2/registry`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync() {
        return deleteWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Subscription Information
     *
     * <p>A subscription is automatically created when you configure your container registry. To get information about
     * your subscription, send a GET request to `/v2/registry/subscription`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesGetSubscriptionResponse> getSubscriptionWithResponseAsync() {
        final String accept = "application/json";
        return service.getSubscription(this.client.getHost(), accept);
    }

    /**
     * Get Subscription Information
     *
     * <p>A subscription is automatically created when you configure your container registry. To get information about
     * your subscription, send a GET request to `/v2/registry/subscription`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getSubscriptionAsync() {
        return getSubscriptionWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update Subscription Tier
     *
     * <p>After creating your registry, you can switch to a different subscription tier to better suit your needs. To do
     * this, send a POST request to `/v2/registry/subscription`.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesUpdateSubscriptionResponse> updateSubscriptionWithResponseAsync(
            Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.updateSubscription(this.client.getHost(), body, accept);
    }

    /**
     * Update Subscription Tier
     *
     * <p>After creating your registry, you can switch to a different subscription tier to better suit your needs. To do
     * this, send a POST request to `/v2/registry/subscription`.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateSubscriptionAsync(
            Paths10D0V7IV2RegistrySubscriptionPostRequestbodyContentApplicationJsonSchema body) {
        return updateSubscriptionWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Docker Credentials for Container Registry
     *
     * <p>In order to access your container registry with the Docker client or from a Kubernetes cluster, you will need
     * to configure authentication. The necessary JSON configuration can be retrieved by sending a GET request to
     * `/v2/registry/docker-credentials`.
     *
     * <p>The response will be in the format of a Docker `config.json` file. To use the config in your Kubernetes
     * cluster, create a Secret with:
     *
     * <p>kubectl create secret generic docr \ --from-file=.dockerconfigjson=config.json \
     * --type=kubernetes.io/dockerconfigjson
     *
     * <p>By default, the returned credentials have read-only access to your registry and cannot be used to push images.
     * This is appropriate for most Kubernetes clusters. To retrieve read/write credentials, suitable for use with the
     * Docker client or in a CI system, read_write may be provided as query parameter. For example:
     * `/v2/registry/docker-credentials?read_write=true`
     *
     * <p>By default, the returned credentials will not expire. To retrieve credentials with an expiry set,
     * expiry_seconds may be provided as a query parameter. For example:
     * `/v2/registry/docker-credentials?expiry_seconds=3600` will return credentials that expire after one hour.
     *
     * @param expirySeconds The duration in seconds that the returned registry credentials will be valid. If not set or
     *     0, the credentials will not expire.
     * @param readWrite By default, the registry credentials allow for read-only access. Set this query parameter to
     *     `true` to obtain read-write credentials.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesGetDockerCredentialsResponse> getDockerCredentialsWithResponseAsync(
            Integer expirySeconds, Boolean readWrite) {
        final String accept = "application/json";
        return service.getDockerCredentials(this.client.getHost(), expirySeconds, readWrite, accept);
    }

    /**
     * Get Docker Credentials for Container Registry
     *
     * <p>In order to access your container registry with the Docker client or from a Kubernetes cluster, you will need
     * to configure authentication. The necessary JSON configuration can be retrieved by sending a GET request to
     * `/v2/registry/docker-credentials`.
     *
     * <p>The response will be in the format of a Docker `config.json` file. To use the config in your Kubernetes
     * cluster, create a Secret with:
     *
     * <p>kubectl create secret generic docr \ --from-file=.dockerconfigjson=config.json \
     * --type=kubernetes.io/dockerconfigjson
     *
     * <p>By default, the returned credentials have read-only access to your registry and cannot be used to push images.
     * This is appropriate for most Kubernetes clusters. To retrieve read/write credentials, suitable for use with the
     * Docker client or in a CI system, read_write may be provided as query parameter. For example:
     * `/v2/registry/docker-credentials?read_write=true`
     *
     * <p>By default, the returned credentials will not expire. To retrieve credentials with an expiry set,
     * expiry_seconds may be provided as a query parameter. For example:
     * `/v2/registry/docker-credentials?expiry_seconds=3600` will return credentials that expire after one hour.
     *
     * @param expirySeconds The duration in seconds that the returned registry credentials will be valid. If not set or
     *     0, the credentials will not expire.
     * @param readWrite By default, the registry credentials allow for read-only access. Set this query parameter to
     *     `true` to obtain read-write credentials.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDockerCredentialsAsync(Integer expirySeconds, Boolean readWrite) {
        return getDockerCredentialsWithResponseAsync(expirySeconds, readWrite)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Validate a Container Registry Name
     *
     * <p>To validate that a container registry name is available for use, send a POST request to
     * `/v2/registry/validate-name`.
     *
     * <p>If the name is both formatted correctly and available, the response code will be 204 and contain no body. If
     * the name is already in use, the response will be a 409 Conflict.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesValidateNameResponse> validateNameWithResponseAsync(ValidateRegistry body) {
        final String accept = "application/json";
        return service.validateName(this.client.getHost(), body, accept);
    }

    /**
     * Validate a Container Registry Name
     *
     * <p>To validate that a container registry name is available for use, send a POST request to
     * `/v2/registry/validate-name`.
     *
     * <p>If the name is both formatted correctly and available, the response code will be 204 and contain no body. If
     * the name is already in use, the response will be a 409 Conflict.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> validateNameAsync(ValidateRegistry body) {
        return validateNameWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List All Container Registry Repositories
     *
     * <p>This endpoint has been deprecated in favor of the _List All Container Registry Repositories [V2]_ endpoint.
     *
     * <p>To list all repositories in your container registry, send a GET request to
     * `/v2/registry/$REGISTRY_NAME/repositories`.
     *
     * @param registryName The name of a container registry.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesListRepositoriesResponse> listRepositoriesWithResponseAsync(
            String registryName, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.listRepositories(this.client.getHost(), perPage, page, registryName, accept);
    }

    /**
     * List All Container Registry Repositories
     *
     * <p>This endpoint has been deprecated in favor of the _List All Container Registry Repositories [V2]_ endpoint.
     *
     * <p>To list all repositories in your container registry, send a GET request to
     * `/v2/registry/$REGISTRY_NAME/repositories`.
     *
     * @param registryName The name of a container registry.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listRepositoriesAsync(String registryName, Integer perPage, Integer page) {
        return listRepositoriesWithResponseAsync(registryName, perPage, page)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List All Container Registry Repositories (V2)
     *
     * <p>To list all repositories in your container registry, send a GET request to
     * `/v2/registry/$REGISTRY_NAME/repositoriesV2`.
     *
     * @param registryName The name of a container registry.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return. Ignored when 'page_token' is provided.
     * @param pageToken Token to retrieve of the next or previous set of results more quickly than using 'page'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesListRepositoriesV2Response> listRepositoriesV2WithResponseAsync(
            String registryName, Integer perPage, Integer page, String pageToken) {
        final String accept = "application/json";
        return service.listRepositoriesV2(this.client.getHost(), perPage, page, pageToken, registryName, accept);
    }

    /**
     * List All Container Registry Repositories (V2)
     *
     * <p>To list all repositories in your container registry, send a GET request to
     * `/v2/registry/$REGISTRY_NAME/repositoriesV2`.
     *
     * @param registryName The name of a container registry.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return. Ignored when 'page_token' is provided.
     * @param pageToken Token to retrieve of the next or previous set of results more quickly than using 'page'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listRepositoriesV2Async(String registryName, Integer perPage, Integer page, String pageToken) {
        return listRepositoriesV2WithResponseAsync(registryName, perPage, page, pageToken)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List All Container Registry Repository Tags
     *
     * <p>To list all tags in your container registry repository, send a GET request to
     * `/v2/registry/$REGISTRY_NAME/repositories/$REPOSITORY_NAME/tags`.
     *
     * <p>Note that if your repository name contains `/` characters, it must be URL-encoded in the request URL. For
     * example, to list tags for `registry.digitalocean.com/example/my/repo`, the path would be
     * `/v2/registry/example/repositories/my%2Frepo/tags`.
     *
     * @param registryName The name of a container registry.
     * @param repositoryName The name of a container registry repository. If the name contains `/` characters, they must
     *     be URL-encoded, e.g. `%2F`.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesListRepositoryTagsResponse> listRepositoryTagsWithResponseAsync(
            String registryName, String repositoryName, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.listRepositoryTags(this.client.getHost(), perPage, page, registryName, repositoryName, accept);
    }

    /**
     * List All Container Registry Repository Tags
     *
     * <p>To list all tags in your container registry repository, send a GET request to
     * `/v2/registry/$REGISTRY_NAME/repositories/$REPOSITORY_NAME/tags`.
     *
     * <p>Note that if your repository name contains `/` characters, it must be URL-encoded in the request URL. For
     * example, to list tags for `registry.digitalocean.com/example/my/repo`, the path would be
     * `/v2/registry/example/repositories/my%2Frepo/tags`.
     *
     * @param registryName The name of a container registry.
     * @param repositoryName The name of a container registry repository. If the name contains `/` characters, they must
     *     be URL-encoded, e.g. `%2F`.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listRepositoryTagsAsync(
            String registryName, String repositoryName, Integer perPage, Integer page) {
        return listRepositoryTagsWithResponseAsync(registryName, repositoryName, perPage, page)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete Container Registry Repository Tag
     *
     * <p>To delete a container repository tag, send a DELETE request to
     * `/v2/registry/$REGISTRY_NAME/repositories/$REPOSITORY_NAME/tags/$TAG`.
     *
     * <p>Note that if your repository name contains `/` characters, it must be URL-encoded in the request URL. For
     * example, to delete `registry.digitalocean.com/example/my/repo:mytag`, the path would be
     * `/v2/registry/example/repositories/my%2Frepo/tags/mytag`.
     *
     * <p>A successful request will receive a 204 status code with no body in response. This indicates that the request
     * was processed successfully.
     *
     * @param registryName The name of a container registry.
     * @param repositoryName The name of a container registry repository. If the name contains `/` characters, they must
     *     be URL-encoded, e.g. `%2F`.
     * @param repositoryTag The name of a container registry repository tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesDeleteRepositoryTagResponse> deleteRepositoryTagWithResponseAsync(
            String registryName, String repositoryName, String repositoryTag) {
        final String accept = "application/json";
        return service.deleteRepositoryTag(this.client.getHost(), registryName, repositoryName, repositoryTag, accept);
    }

    /**
     * Delete Container Registry Repository Tag
     *
     * <p>To delete a container repository tag, send a DELETE request to
     * `/v2/registry/$REGISTRY_NAME/repositories/$REPOSITORY_NAME/tags/$TAG`.
     *
     * <p>Note that if your repository name contains `/` characters, it must be URL-encoded in the request URL. For
     * example, to delete `registry.digitalocean.com/example/my/repo:mytag`, the path would be
     * `/v2/registry/example/repositories/my%2Frepo/tags/mytag`.
     *
     * <p>A successful request will receive a 204 status code with no body in response. This indicates that the request
     * was processed successfully.
     *
     * @param registryName The name of a container registry.
     * @param repositoryName The name of a container registry repository. If the name contains `/` characters, they must
     *     be URL-encoded, e.g. `%2F`.
     * @param repositoryTag The name of a container registry repository tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteRepositoryTagAsync(String registryName, String repositoryName, String repositoryTag) {
        return deleteRepositoryTagWithResponseAsync(registryName, repositoryName, repositoryTag)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List All Container Registry Repository Manifests
     *
     * <p>To list all manifests in your container registry repository, send a GET request to
     * `/v2/registry/$REGISTRY_NAME/repositories/$REPOSITORY_NAME/digests`.
     *
     * <p>Note that if your repository name contains `/` characters, it must be URL-encoded in the request URL. For
     * example, to list manifests for `registry.digitalocean.com/example/my/repo`, the path would be
     * `/v2/registry/example/repositories/my%2Frepo/digests`.
     *
     * @param registryName The name of a container registry.
     * @param repositoryName The name of a container registry repository. If the name contains `/` characters, they must
     *     be URL-encoded, e.g. `%2F`.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesListRepositoryManifestsResponse> listRepositoryManifestsWithResponseAsync(
            String registryName, String repositoryName, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.listRepositoryManifests(
                this.client.getHost(), perPage, page, registryName, repositoryName, accept);
    }

    /**
     * List All Container Registry Repository Manifests
     *
     * <p>To list all manifests in your container registry repository, send a GET request to
     * `/v2/registry/$REGISTRY_NAME/repositories/$REPOSITORY_NAME/digests`.
     *
     * <p>Note that if your repository name contains `/` characters, it must be URL-encoded in the request URL. For
     * example, to list manifests for `registry.digitalocean.com/example/my/repo`, the path would be
     * `/v2/registry/example/repositories/my%2Frepo/digests`.
     *
     * @param registryName The name of a container registry.
     * @param repositoryName The name of a container registry repository. If the name contains `/` characters, they must
     *     be URL-encoded, e.g. `%2F`.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listRepositoryManifestsAsync(
            String registryName, String repositoryName, Integer perPage, Integer page) {
        return listRepositoryManifestsWithResponseAsync(registryName, repositoryName, perPage, page)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete Container Registry Repository Manifest
     *
     * <p>To delete a container repository manifest by digest, send a DELETE request to
     * `/v2/registry/$REGISTRY_NAME/repositories/$REPOSITORY_NAME/digests/$MANIFEST_DIGEST`.
     *
     * <p>Note that if your repository name contains `/` characters, it must be URL-encoded in the request URL. For
     * example, to delete `registry.digitalocean.com/example/my/repo@sha256:abcd`, the path would be
     * `/v2/registry/example/repositories/my%2Frepo/digests/sha256:abcd`.
     *
     * <p>A successful request will receive a 204 status code with no body in response. This indicates that the request
     * was processed successfully.
     *
     * @param registryName The name of a container registry.
     * @param repositoryName The name of a container registry repository. If the name contains `/` characters, they must
     *     be URL-encoded, e.g. `%2F`.
     * @param manifestDigest The manifest digest of a container registry repository tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesDeleteRepositoryManifestResponse> deleteRepositoryManifestWithResponseAsync(
            String registryName, String repositoryName, String manifestDigest) {
        final String accept = "application/json";
        return service.deleteRepositoryManifest(
                this.client.getHost(), registryName, repositoryName, manifestDigest, accept);
    }

    /**
     * Delete Container Registry Repository Manifest
     *
     * <p>To delete a container repository manifest by digest, send a DELETE request to
     * `/v2/registry/$REGISTRY_NAME/repositories/$REPOSITORY_NAME/digests/$MANIFEST_DIGEST`.
     *
     * <p>Note that if your repository name contains `/` characters, it must be URL-encoded in the request URL. For
     * example, to delete `registry.digitalocean.com/example/my/repo@sha256:abcd`, the path would be
     * `/v2/registry/example/repositories/my%2Frepo/digests/sha256:abcd`.
     *
     * <p>A successful request will receive a 204 status code with no body in response. This indicates that the request
     * was processed successfully.
     *
     * @param registryName The name of a container registry.
     * @param repositoryName The name of a container registry repository. If the name contains `/` characters, they must
     *     be URL-encoded, e.g. `%2F`.
     * @param manifestDigest The manifest digest of a container registry repository tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteRepositoryManifestAsync(
            String registryName, String repositoryName, String manifestDigest) {
        return deleteRepositoryManifestWithResponseAsync(registryName, repositoryName, manifestDigest)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Start Garbage Collection
     *
     * <p>Garbage collection enables users to clear out unreferenced blobs (layer &amp; manifest data) after deleting
     * one or more manifests from a repository. If there are no unreferenced blobs resulting from the deletion of one or
     * more manifests, garbage collection is effectively a noop. [See here for more
     * information](https://www.digitalocean.com/docs/container-registry/how-to/clean-up-container-registry/) about how
     * and why you should clean up your container registry periodically.
     *
     * <p>To request a garbage collection run on your registry, send a POST request to
     * `/v2/registry/$REGISTRY_NAME/garbage-collection`. This will initiate the following sequence of events on your
     * registry.
     *
     * <p>* Set the registry to read-only mode, meaning no further write-scoped JWTs will be issued to registry clients.
     * Existing write-scoped JWTs will continue to work until they expire which can take up to 15 minutes. * Wait until
     * all existing write-scoped JWTs have expired. * Scan all registry manifests to determine which blobs are
     * unreferenced. * Delete all unreferenced blobs from the registry. * Record the number of blobs deleted and bytes
     * freed, mark the garbage collection status as `success`. * Remove the read-only mode restriction from the
     * registry, meaning write-scoped JWTs will once again be issued to registry clients.
     *
     * @param registryName The name of a container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesRunGarbageCollectionResponse> runGarbageCollectionWithResponseAsync(String registryName) {
        final String accept = "application/json";
        return service.runGarbageCollection(this.client.getHost(), registryName, accept);
    }

    /**
     * Start Garbage Collection
     *
     * <p>Garbage collection enables users to clear out unreferenced blobs (layer &amp; manifest data) after deleting
     * one or more manifests from a repository. If there are no unreferenced blobs resulting from the deletion of one or
     * more manifests, garbage collection is effectively a noop. [See here for more
     * information](https://www.digitalocean.com/docs/container-registry/how-to/clean-up-container-registry/) about how
     * and why you should clean up your container registry periodically.
     *
     * <p>To request a garbage collection run on your registry, send a POST request to
     * `/v2/registry/$REGISTRY_NAME/garbage-collection`. This will initiate the following sequence of events on your
     * registry.
     *
     * <p>* Set the registry to read-only mode, meaning no further write-scoped JWTs will be issued to registry clients.
     * Existing write-scoped JWTs will continue to work until they expire which can take up to 15 minutes. * Wait until
     * all existing write-scoped JWTs have expired. * Scan all registry manifests to determine which blobs are
     * unreferenced. * Delete all unreferenced blobs from the registry. * Record the number of blobs deleted and bytes
     * freed, mark the garbage collection status as `success`. * Remove the read-only mode restriction from the
     * registry, meaning write-scoped JWTs will once again be issued to registry clients.
     *
     * @param registryName The name of a container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> runGarbageCollectionAsync(String registryName) {
        return runGarbageCollectionWithResponseAsync(registryName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Active Garbage Collection
     *
     * <p>To get information about the currently-active garbage collection for a registry, send a GET request to
     * `/v2/registry/$REGISTRY_NAME/garbage-collection`.
     *
     * @param registryName The name of a container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesGetGarbageCollectionResponse> getGarbageCollectionWithResponseAsync(String registryName) {
        final String accept = "application/json";
        return service.getGarbageCollection(this.client.getHost(), registryName, accept);
    }

    /**
     * Get Active Garbage Collection
     *
     * <p>To get information about the currently-active garbage collection for a registry, send a GET request to
     * `/v2/registry/$REGISTRY_NAME/garbage-collection`.
     *
     * @param registryName The name of a container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getGarbageCollectionAsync(String registryName) {
        return getGarbageCollectionWithResponseAsync(registryName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Garbage Collections
     *
     * <p>To get information about past garbage collections for a registry, send a GET request to
     * `/v2/registry/$REGISTRY_NAME/garbage-collections`.
     *
     * @param registryName The name of a container registry.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesListGarbageCollectionsResponse> listGarbageCollectionsWithResponseAsync(
            String registryName, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.listGarbageCollections(this.client.getHost(), registryName, perPage, page, accept);
    }

    /**
     * List Garbage Collections
     *
     * <p>To get information about past garbage collections for a registry, send a GET request to
     * `/v2/registry/$REGISTRY_NAME/garbage-collections`.
     *
     * @param registryName The name of a container registry.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listGarbageCollectionsAsync(String registryName, Integer perPage, Integer page) {
        return listGarbageCollectionsWithResponseAsync(registryName, perPage, page)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update Garbage Collection
     *
     * <p>To cancel the currently-active garbage collection for a registry, send a PUT request to
     * `/v2/registry/$REGISTRY_NAME/garbage-collection/$GC_UUID` and specify one or more of the attributes below.
     *
     * @param registryName The name of a container registry.
     * @param garbageCollectionUuid The UUID of a garbage collection run.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesUpdateGarbageCollectionResponse> updateGarbageCollectionWithResponseAsync(
            String registryName, String garbageCollectionUuid, UpdateRegistry body) {
        final String accept = "application/json";
        return service.updateGarbageCollection(
                this.client.getHost(), registryName, garbageCollectionUuid, body, accept);
    }

    /**
     * Update Garbage Collection
     *
     * <p>To cancel the currently-active garbage collection for a registry, send a PUT request to
     * `/v2/registry/$REGISTRY_NAME/garbage-collection/$GC_UUID` and specify one or more of the attributes below.
     *
     * @param registryName The name of a container registry.
     * @param garbageCollectionUuid The UUID of a garbage collection run.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateGarbageCollectionAsync(
            String registryName, String garbageCollectionUuid, UpdateRegistry body) {
        return updateGarbageCollectionWithResponseAsync(registryName, garbageCollectionUuid, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Registry Options (Subscription Tiers and Available Regions)
     *
     * <p>This endpoint serves to provide additional information as to which option values are available when creating a
     * container registry. There are multiple subscription tiers available for container registry. Each tier allows a
     * different number of image repositories to be created in your registry, and has a different amount of storage and
     * transfer included. There are multiple regions available for container registry and controls where your data is
     * stored. To list the available options, send a GET request to `/v2/registry/options`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RegistriesGetOptionsResponse> getOptionsWithResponseAsync() {
        final String accept = "application/json";
        return service.getOptions(this.client.getHost(), accept);
    }

    /**
     * List Registry Options (Subscription Tiers and Available Regions)
     *
     * <p>This endpoint serves to provide additional information as to which option values are available when creating a
     * container registry. There are multiple subscription tiers available for container registry. Each tier allows a
     * different number of image repositories to be created in your registry, and has a different amount of storage and
     * transfer included. There are multiple regions available for container registry and controls where your data is
     * stored. To list the available options, send a GET request to `/v2/registry/options`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getOptionsAsync() {
        return getOptionsWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
