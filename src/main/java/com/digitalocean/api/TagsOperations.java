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
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.Tags;
import com.digitalocean.api.models.TagsAssignResourcesResponse;
import com.digitalocean.api.models.TagsCreateResponse;
import com.digitalocean.api.models.TagsDeleteResponse;
import com.digitalocean.api.models.TagsGetResponse;
import com.digitalocean.api.models.TagsListResponse;
import com.digitalocean.api.models.TagsResource;
import com.digitalocean.api.models.TagsUnassignResourcesResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in TagsOperations. */
public final class TagsOperations {
    /** The proxy service used to perform REST calls. */
    private final TagsService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of TagsOperations.
     *
     * @param client the instance of the service client containing this operation class.
     */
    TagsOperations(GeneratedClient client) {
        this.service = RestProxy.create(TagsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientTagsOperations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientTagsO")
    private interface TagsService {
        @Get("/v2/tags")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<TagsListResponse> list(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);

        @Post("/v2/tags")
        @ExpectedResponses({201, 400, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<TagsCreateResponse> create(
                @HostParam("$host") String host,
                @BodyParam("application/json") Tags body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/tags/{tag_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<TagsGetResponse> get(
                @HostParam("$host") String host,
                @PathParam("tag_id") String tagId,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/tags/{tag_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<TagsDeleteResponse> delete(
                @HostParam("$host") String host,
                @PathParam("tag_id") String tagId,
                @HeaderParam("Accept") String accept);

        @Post("/v2/tags/{tag_id}/resources")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<TagsAssignResourcesResponse> assignResources(
                @HostParam("$host") String host,
                @PathParam("tag_id") String tagId,
                @BodyParam("application/json") TagsResource body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/tags/{tag_id}/resources")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<TagsUnassignResourcesResponse> unassignResources(
                @HostParam("$host") String host,
                @PathParam("tag_id") String tagId,
                @BodyParam("application/json") TagsResource body,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List All Tags
     *
     * <p>To list all of your tags, you can send a GET request to `/v2/tags`.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TagsListResponse> listWithResponseAsync(Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), perPage, page, accept);
    }

    /**
     * List All Tags
     *
     * <p>To list all of your tags, you can send a GET request to `/v2/tags`.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync(Integer perPage, Integer page) {
        return listWithResponseAsync(perPage, page).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a New Tag
     *
     * <p>To create a tag you can send a POST request to `/v2/tags` with a `name` attribute.
     *
     * @param body A tag is a label that can be applied to a resource (currently Droplets, Images, Volumes, Volume
     *     Snapshots, and Database clusters) in order to better organize or facilitate the lookups and actions on it.
     *     Tags have two attributes: a user defined `name` attribute and an embedded `resources` attribute with
     *     information about resources that have been tagged.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TagsCreateResponse> createWithResponseAsync(Tags body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), body, accept);
    }

    /**
     * Create a New Tag
     *
     * <p>To create a tag you can send a POST request to `/v2/tags` with a `name` attribute.
     *
     * @param body A tag is a label that can be applied to a resource (currently Droplets, Images, Volumes, Volume
     *     Snapshots, and Database clusters) in order to better organize or facilitate the lookups and actions on it.
     *     Tags have two attributes: a user defined `name` attribute and an embedded `resources` attribute with
     *     information about resources that have been tagged.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAsync(Tags body) {
        return createWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve a Tag
     *
     * <p>To retrieve an individual tag, you can send a `GET` request to `/v2/tags/$TAG_NAME`.
     *
     * @param tagId The name of the tag. Tags may contain letters, numbers, colons, dashes, and underscores. There is a
     *     limit of 255 characters per tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TagsGetResponse> getWithResponseAsync(String tagId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), tagId, accept);
    }

    /**
     * Retrieve a Tag
     *
     * <p>To retrieve an individual tag, you can send a `GET` request to `/v2/tags/$TAG_NAME`.
     *
     * @param tagId The name of the tag. Tags may contain letters, numbers, colons, dashes, and underscores. There is a
     *     limit of 255 characters per tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(String tagId) {
        return getWithResponseAsync(tagId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete a Tag
     *
     * <p>A tag can be deleted by sending a `DELETE` request to `/v2/tags/$TAG_NAME`. Deleting a tag also untags all the
     * resources that have previously been tagged by the Tag.
     *
     * @param tagId The name of the tag. Tags may contain letters, numbers, colons, dashes, and underscores. There is a
     *     limit of 255 characters per tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TagsDeleteResponse> deleteWithResponseAsync(String tagId) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), tagId, accept);
    }

    /**
     * Delete a Tag
     *
     * <p>A tag can be deleted by sending a `DELETE` request to `/v2/tags/$TAG_NAME`. Deleting a tag also untags all the
     * resources that have previously been tagged by the Tag.
     *
     * @param tagId The name of the tag. Tags may contain letters, numbers, colons, dashes, and underscores. There is a
     *     limit of 255 characters per tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync(String tagId) {
        return deleteWithResponseAsync(tagId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Tag a Resource
     *
     * <p>Resources can be tagged by sending a POST request to `/v2/tags/$TAG_NAME/resources` with an array of json
     * objects containing `resource_id` and `resource_type` attributes. Currently only tagging of Droplets, Databases,
     * Images, Volumes, and Volume Snapshots is supported. `resource_type` is expected to be the string `droplet`,
     * `database`, `image`, `volume` or `volume_snapshot`. `resource_id` is expected to be the ID of the resource as a
     * string.
     *
     * @param tagId The name of the tag. Tags may contain letters, numbers, colons, dashes, and underscores. There is a
     *     limit of 255 characters per tag.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TagsAssignResourcesResponse> assignResourcesWithResponseAsync(String tagId, TagsResource body) {
        final String accept = "application/json";
        return service.assignResources(this.client.getHost(), tagId, body, accept);
    }

    /**
     * Tag a Resource
     *
     * <p>Resources can be tagged by sending a POST request to `/v2/tags/$TAG_NAME/resources` with an array of json
     * objects containing `resource_id` and `resource_type` attributes. Currently only tagging of Droplets, Databases,
     * Images, Volumes, and Volume Snapshots is supported. `resource_type` is expected to be the string `droplet`,
     * `database`, `image`, `volume` or `volume_snapshot`. `resource_id` is expected to be the ID of the resource as a
     * string.
     *
     * @param tagId The name of the tag. Tags may contain letters, numbers, colons, dashes, and underscores. There is a
     *     limit of 255 characters per tag.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> assignResourcesAsync(String tagId, TagsResource body) {
        return assignResourcesWithResponseAsync(tagId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Untag a Resource
     *
     * <p>Resources can be tagged by sending a DELETE request to `/v2/tags/$TAG_NAME/resources` with an array of json
     * objects containing `resource_id` and `resource_type` attributes. Currently only untagging of Droplets, Databases,
     * Images, Volumes, and Volume Snapshots is supported. `resource_type` is expected to be the string `droplet`,
     * `database`, `image`, `volume` or `volume_snapshot`. `resource_id` is expected to be the ID of the resource as a
     * string.
     *
     * @param tagId The name of the tag. Tags may contain letters, numbers, colons, dashes, and underscores. There is a
     *     limit of 255 characters per tag.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TagsUnassignResourcesResponse> unassignResourcesWithResponseAsync(String tagId, TagsResource body) {
        final String accept = "application/json";
        return service.unassignResources(this.client.getHost(), tagId, body, accept);
    }

    /**
     * Untag a Resource
     *
     * <p>Resources can be tagged by sending a DELETE request to `/v2/tags/$TAG_NAME/resources` with an array of json
     * objects containing `resource_id` and `resource_type` attributes. Currently only untagging of Droplets, Databases,
     * Images, Volumes, and Volume Snapshots is supported. `resource_type` is expected to be the string `droplet`,
     * `database`, `image`, `volume` or `volume_snapshot`. `resource_id` is expected to be the ID of the resource as a
     * string.
     *
     * @param tagId The name of the tag. Tags may contain letters, numbers, colons, dashes, and underscores. There is a
     *     limit of 255 characters per tag.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> unassignResourcesAsync(String tagId, TagsResource body) {
        return unassignResourcesWithResponseAsync(tagId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
