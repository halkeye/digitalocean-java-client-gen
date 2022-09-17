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
import com.digitalocean.api.models.DropletsCreateResponse;
import com.digitalocean.api.models.DropletsDestroyByTagResponse;
import com.digitalocean.api.models.DropletsDestroyResponse;
import com.digitalocean.api.models.DropletsDestroyRetryWithAssociatedResourcesResponse;
import com.digitalocean.api.models.DropletsDestroyWithAssociatedResourcesDangerousResponse;
import com.digitalocean.api.models.DropletsDestroyWithAssociatedResourcesSelectiveResponse;
import com.digitalocean.api.models.DropletsGetDestroyAssociatedResourcesStatusResponse;
import com.digitalocean.api.models.DropletsGetResponse;
import com.digitalocean.api.models.DropletsListAssociatedResourcesResponse;
import com.digitalocean.api.models.DropletsListBackupsResponse;
import com.digitalocean.api.models.DropletsListFirewallsResponse;
import com.digitalocean.api.models.DropletsListKernelsResponse;
import com.digitalocean.api.models.DropletsListNeighborsIdsResponse;
import com.digitalocean.api.models.DropletsListNeighborsResponse;
import com.digitalocean.api.models.DropletsListResponse;
import com.digitalocean.api.models.DropletsListSnapshotsResponse;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.SelectiveDestroyAssociatedResource;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Droplets. */
public final class Droplets {
    /** The proxy service used to perform REST calls. */
    private final DropletsService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Droplets.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Droplets(GeneratedClient client) {
        this.service = RestProxy.create(DropletsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientDroplets to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientDropl")
    private interface DropletsService {
        @Get("/v2/droplets")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsListResponse> list(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @QueryParam("tag_name") String tagName,
                @QueryParam("name") String name,
                @HeaderParam("Accept") String accept);

        @Post("/v2/droplets")
        @ExpectedResponses({202, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsCreateResponse> create(
                @HostParam("$host") String host,
                @BodyParam("application/json") Object body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/droplets")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsDestroyByTagResponse> destroyByTag(
                @HostParam("$host") String host,
                @QueryParam("tag_name") String tagName,
                @HeaderParam("Accept") String accept);

        @Get("/v2/droplets/{droplet_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsGetResponse> get(
                @HostParam("$host") String host,
                @PathParam("droplet_id") int dropletId,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/droplets/{droplet_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsDestroyResponse> destroy(
                @HostParam("$host") String host,
                @PathParam("droplet_id") int dropletId,
                @HeaderParam("Accept") String accept);

        @Get("/v2/droplets/{droplet_id}/backups")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsListBackupsResponse> listBackups(
                @HostParam("$host") String host,
                @PathParam("droplet_id") int dropletId,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);

        @Get("/v2/droplets/{droplet_id}/snapshots")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsListSnapshotsResponse> listSnapshots(
                @HostParam("$host") String host,
                @PathParam("droplet_id") int dropletId,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);

        @Get("/v2/droplets/{droplet_id}/kernels")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsListKernelsResponse> listKernels(
                @HostParam("$host") String host,
                @PathParam("droplet_id") int dropletId,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);

        @Get("/v2/droplets/{droplet_id}/firewalls")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsListFirewallsResponse> listFirewalls(
                @HostParam("$host") String host,
                @PathParam("droplet_id") int dropletId,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);

        @Get("/v2/droplets/{droplet_id}/neighbors")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsListNeighborsResponse> listNeighbors(
                @HostParam("$host") String host,
                @PathParam("droplet_id") int dropletId,
                @HeaderParam("Accept") String accept);

        @Get("/v2/droplets/{droplet_id}/destroy_with_associated_resources")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsListAssociatedResourcesResponse> listAssociatedResources(
                @HostParam("$host") String host,
                @PathParam("droplet_id") int dropletId,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/droplets/{droplet_id}/destroy_with_associated_resources/selective")
        @ExpectedResponses({202, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsDestroyWithAssociatedResourcesSelectiveResponse> destroyWithAssociatedResourcesSelective(
                @HostParam("$host") String host,
                @PathParam("droplet_id") int dropletId,
                @BodyParam("application/json") SelectiveDestroyAssociatedResource body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/droplets/{droplet_id}/destroy_with_associated_resources/dangerous")
        @ExpectedResponses({202, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsDestroyWithAssociatedResourcesDangerousResponse> destroyWithAssociatedResourcesDangerous(
                @HostParam("$host") String host,
                @PathParam("droplet_id") int dropletId,
                @HeaderParam("X-Dangerous") boolean xDangerous,
                @HeaderParam("Accept") String accept);

        @Get("/v2/droplets/{droplet_id}/destroy_with_associated_resources/status")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsGetDestroyAssociatedResourcesStatusResponse> getDestroyAssociatedResourcesStatus(
                @HostParam("$host") String host,
                @PathParam("droplet_id") int dropletId,
                @HeaderParam("Accept") String accept);

        @Post("/v2/droplets/{droplet_id}/destroy_with_associated_resources/retry")
        @ExpectedResponses({202, 401, 404, 409, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsDestroyRetryWithAssociatedResourcesResponse> destroyRetryWithAssociatedResources(
                @HostParam("$host") String host,
                @PathParam("droplet_id") int dropletId,
                @HeaderParam("Accept") String accept);

        @Get("/v2/reports/droplet_neighbors_ids")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletsListNeighborsIdsResponse> listNeighborsIds(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);
    }

    /**
     * List All Droplets
     *
     * <p>To list all Droplets in your account, send a GET request to `/v2/droplets`.
     *
     * <p>The response body will be a JSON object with a key of `droplets`. This will be set to an array containing
     * objects each representing a Droplet. These will contain the standard Droplet attributes.
     *
     * <p>### Filtering Results by Tag
     *
     * <p>It's possible to request filtered results by including certain query parameters. To only list Droplets
     * assigned to a specific tag, include the `tag_name` query parameter set to the name of the tag in your GET
     * request. For example, `/v2/droplets?tag_name=$TAG_NAME`.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @param tagName Used to filter Droplets by a specific tag. Can not be combined with `name`.
     * @param name Used to filter list response by Droplet name returning only exact matches. It is case-insensitive and
     *     can not be combined with `tag_name`.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsListResponse> listWithResponseAsync(
            Integer perPage, Integer page, String tagName, String name) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), perPage, page, tagName, name, accept);
    }

    /**
     * List All Droplets
     *
     * <p>To list all Droplets in your account, send a GET request to `/v2/droplets`.
     *
     * <p>The response body will be a JSON object with a key of `droplets`. This will be set to an array containing
     * objects each representing a Droplet. These will contain the standard Droplet attributes.
     *
     * <p>### Filtering Results by Tag
     *
     * <p>It's possible to request filtered results by including certain query parameters. To only list Droplets
     * assigned to a specific tag, include the `tag_name` query parameter set to the name of the tag in your GET
     * request. For example, `/v2/droplets?tag_name=$TAG_NAME`.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @param tagName Used to filter Droplets by a specific tag. Can not be combined with `name`.
     * @param name Used to filter list response by Droplet name returning only exact matches. It is case-insensitive and
     *     can not be combined with `tag_name`.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync(Integer perPage, Integer page, String tagName, String name) {
        return listWithResponseAsync(perPage, page, tagName, name).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a New Droplet
     *
     * <p>To create a new Droplet, send a POST request to `/v2/droplets` setting the required attributes.
     *
     * <p>A Droplet will be created using the provided information. The response body will contain a JSON object with a
     * key called `droplet`. The value will be an object containing the standard attributes for your new Droplet. The
     * response code, 202 Accepted, does not indicate the success or failure of the operation, just that the request has
     * been accepted for processing. The `actions` returned as part of the response's `links` object can be used to
     * check the status of the Droplet create event.
     *
     * <p>### Create Multiple Droplets
     *
     * <p>Creating multiple Droplets is very similar to creating a single Droplet. Instead of sending `name` as a
     * string, send `names` as an array of strings. A Droplet will be created for each name you send using the
     * associated information. Up to ten Droplets may be created this way at a time.
     *
     * <p>Rather than returning a single Droplet, the response body will contain a JSON array with a key called
     * `droplets`. This will be set to an array of JSON objects, each of which will contain the standard Droplet
     * attributes. The response code, 202 Accepted, does not indicate the success or failure of any operation, just that
     * the request has been accepted for processing. The array of `actions` returned as part of the response's `links`
     * object can be used to check the status of each individual Droplet create event.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsCreateResponse> createWithResponseAsync(Object body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), body, accept);
    }

    /**
     * Create a New Droplet
     *
     * <p>To create a new Droplet, send a POST request to `/v2/droplets` setting the required attributes.
     *
     * <p>A Droplet will be created using the provided information. The response body will contain a JSON object with a
     * key called `droplet`. The value will be an object containing the standard attributes for your new Droplet. The
     * response code, 202 Accepted, does not indicate the success or failure of the operation, just that the request has
     * been accepted for processing. The `actions` returned as part of the response's `links` object can be used to
     * check the status of the Droplet create event.
     *
     * <p>### Create Multiple Droplets
     *
     * <p>Creating multiple Droplets is very similar to creating a single Droplet. Instead of sending `name` as a
     * string, send `names` as an array of strings. A Droplet will be created for each name you send using the
     * associated information. Up to ten Droplets may be created this way at a time.
     *
     * <p>Rather than returning a single Droplet, the response body will contain a JSON array with a key called
     * `droplets`. This will be set to an array of JSON objects, each of which will contain the standard Droplet
     * attributes. The response code, 202 Accepted, does not indicate the success or failure of any operation, just that
     * the request has been accepted for processing. The array of `actions` returned as part of the response's `links`
     * object can be used to check the status of each individual Droplet create event.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAsync(Object body) {
        return createWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Deleting Droplets by Tag
     *
     * <p>To delete **all** Droplets assigned to a specific tag, include the `tag_name` query parameter set to the name
     * of the tag in your DELETE request. For example, `/v2/droplets?tag_name=$TAG_NAME`.
     *
     * <p>A successful request will receive a 204 status code with no body in response. This indicates that the request
     * was processed successfully.
     *
     * @param tagName Specifies Droplets to be deleted by tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsDestroyByTagResponse> destroyByTagWithResponseAsync(String tagName) {
        final String accept = "application/json";
        return service.destroyByTag(this.client.getHost(), tagName, accept);
    }

    /**
     * Deleting Droplets by Tag
     *
     * <p>To delete **all** Droplets assigned to a specific tag, include the `tag_name` query parameter set to the name
     * of the tag in your DELETE request. For example, `/v2/droplets?tag_name=$TAG_NAME`.
     *
     * <p>A successful request will receive a 204 status code with no body in response. This indicates that the request
     * was processed successfully.
     *
     * @param tagName Specifies Droplets to be deleted by tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> destroyByTagAsync(String tagName) {
        return destroyByTagWithResponseAsync(tagName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Droplet
     *
     * <p>To show information about an individual Droplet, send a GET request to `/v2/droplets/$DROPLET_ID`.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsGetResponse> getWithResponseAsync(int dropletId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), dropletId, accept);
    }

    /**
     * Retrieve an Existing Droplet
     *
     * <p>To show information about an individual Droplet, send a GET request to `/v2/droplets/$DROPLET_ID`.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(int dropletId) {
        return getWithResponseAsync(dropletId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete an Existing Droplet
     *
     * <p>To delete a Droplet, send a DELETE request to `/v2/droplets/$DROPLET_ID`.
     *
     * <p>A successful request will receive a 204 status code with no body in response. This indicates that the request
     * was processed successfully.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsDestroyResponse> destroyWithResponseAsync(int dropletId) {
        final String accept = "application/json";
        return service.destroy(this.client.getHost(), dropletId, accept);
    }

    /**
     * Delete an Existing Droplet
     *
     * <p>To delete a Droplet, send a DELETE request to `/v2/droplets/$DROPLET_ID`.
     *
     * <p>A successful request will receive a 204 status code with no body in response. This indicates that the request
     * was processed successfully.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> destroyAsync(int dropletId) {
        return destroyWithResponseAsync(dropletId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Backups for a Droplet
     *
     * <p>To retrieve any backups associated with a Droplet, send a GET request to `/v2/droplets/$DROPLET_ID/backups`.
     *
     * <p>You will get back a JSON object that has a `backups` key. This will be set to an array of backup objects, each
     * of which contain the standard Droplet backup attributes.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsListBackupsResponse> listBackupsWithResponseAsync(
            int dropletId, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.listBackups(this.client.getHost(), dropletId, perPage, page, accept);
    }

    /**
     * List Backups for a Droplet
     *
     * <p>To retrieve any backups associated with a Droplet, send a GET request to `/v2/droplets/$DROPLET_ID/backups`.
     *
     * <p>You will get back a JSON object that has a `backups` key. This will be set to an array of backup objects, each
     * of which contain the standard Droplet backup attributes.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listBackupsAsync(int dropletId, Integer perPage, Integer page) {
        return listBackupsWithResponseAsync(dropletId, perPage, page).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Snapshots for a Droplet
     *
     * <p>To retrieve the snapshots that have been created from a Droplet, send a GET request to
     * `/v2/droplets/$DROPLET_ID/snapshots`.
     *
     * <p>You will get back a JSON object that has a `snapshots` key. This will be set to an array of snapshot objects,
     * each of which contain the standard Droplet snapshot attributes.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsListSnapshotsResponse> listSnapshotsWithResponseAsync(
            int dropletId, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.listSnapshots(this.client.getHost(), dropletId, perPage, page, accept);
    }

    /**
     * List Snapshots for a Droplet
     *
     * <p>To retrieve the snapshots that have been created from a Droplet, send a GET request to
     * `/v2/droplets/$DROPLET_ID/snapshots`.
     *
     * <p>You will get back a JSON object that has a `snapshots` key. This will be set to an array of snapshot objects,
     * each of which contain the standard Droplet snapshot attributes.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listSnapshotsAsync(int dropletId, Integer perPage, Integer page) {
        return listSnapshotsWithResponseAsync(dropletId, perPage, page)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List All Available Kernels for a Droplet
     *
     * <p>To retrieve a list of all kernels available to a Droplet, send a GET request to
     * `/v2/droplets/$DROPLET_ID/kernels`
     *
     * <p>The response will be a JSON object that has a key called `kernels`. This will be set to an array of `kernel`
     * objects, each of which contain the standard `kernel` attributes.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsListKernelsResponse> listKernelsWithResponseAsync(
            int dropletId, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.listKernels(this.client.getHost(), dropletId, perPage, page, accept);
    }

    /**
     * List All Available Kernels for a Droplet
     *
     * <p>To retrieve a list of all kernels available to a Droplet, send a GET request to
     * `/v2/droplets/$DROPLET_ID/kernels`
     *
     * <p>The response will be a JSON object that has a key called `kernels`. This will be set to an array of `kernel`
     * objects, each of which contain the standard `kernel` attributes.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listKernelsAsync(int dropletId, Integer perPage, Integer page) {
        return listKernelsWithResponseAsync(dropletId, perPage, page).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List all Firewalls Applied to a Droplet
     *
     * <p>To retrieve a list of all firewalls available to a Droplet, send a GET request to
     * `/v2/droplets/$DROPLET_ID/firewalls`
     *
     * <p>The response will be a JSON object that has a key called `firewalls`. This will be set to an array of
     * `firewall` objects, each of which contain the standard `firewall` attributes.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsListFirewallsResponse> listFirewallsWithResponseAsync(
            int dropletId, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.listFirewalls(this.client.getHost(), dropletId, perPage, page, accept);
    }

    /**
     * List all Firewalls Applied to a Droplet
     *
     * <p>To retrieve a list of all firewalls available to a Droplet, send a GET request to
     * `/v2/droplets/$DROPLET_ID/firewalls`
     *
     * <p>The response will be a JSON object that has a key called `firewalls`. This will be set to an array of
     * `firewall` objects, each of which contain the standard `firewall` attributes.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listFirewallsAsync(int dropletId, Integer perPage, Integer page) {
        return listFirewallsWithResponseAsync(dropletId, perPage, page)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Neighbors for a Droplet
     *
     * <p>To retrieve a list of any "neighbors" (i.e. Droplets that are co-located on the same physical hardware) for a
     * specific Droplet, send a GET request to `/v2/droplets/$DROPLET_ID/neighbors`.
     *
     * <p>The results will be returned as a JSON object with a key of `droplets`. This will be set to an array
     * containing objects representing any other Droplets that share the same physical hardware. An empty array
     * indicates that the Droplet is not co-located any other Droplets associated with your account.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsListNeighborsResponse> listNeighborsWithResponseAsync(int dropletId) {
        final String accept = "application/json";
        return service.listNeighbors(this.client.getHost(), dropletId, accept);
    }

    /**
     * List Neighbors for a Droplet
     *
     * <p>To retrieve a list of any "neighbors" (i.e. Droplets that are co-located on the same physical hardware) for a
     * specific Droplet, send a GET request to `/v2/droplets/$DROPLET_ID/neighbors`.
     *
     * <p>The results will be returned as a JSON object with a key of `droplets`. This will be set to an array
     * containing objects representing any other Droplets that share the same physical hardware. An empty array
     * indicates that the Droplet is not co-located any other Droplets associated with your account.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listNeighborsAsync(int dropletId) {
        return listNeighborsWithResponseAsync(dropletId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Associated Resources for a Droplet
     *
     * <p>To list the associated billable resources that can be destroyed along with a Droplet, send a GET request to
     * the `/v2/droplets/$DROPLET_ID/destroy_with_associated_resources` endpoint.
     *
     * <p>The response will be a JSON object containing `snapshots`, `volumes`, and `volume_snapshots` keys. Each will
     * be set to an array of objects containing information about the associated resources.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsListAssociatedResourcesResponse> listAssociatedResourcesWithResponseAsync(int dropletId) {
        final String accept = "application/json";
        return service.listAssociatedResources(this.client.getHost(), dropletId, accept);
    }

    /**
     * List Associated Resources for a Droplet
     *
     * <p>To list the associated billable resources that can be destroyed along with a Droplet, send a GET request to
     * the `/v2/droplets/$DROPLET_ID/destroy_with_associated_resources` endpoint.
     *
     * <p>The response will be a JSON object containing `snapshots`, `volumes`, and `volume_snapshots` keys. Each will
     * be set to an array of objects containing information about the associated resources.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAssociatedResourcesAsync(int dropletId) {
        return listAssociatedResourcesWithResponseAsync(dropletId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Selectively Destroy a Droplet and its Associated Resources
     *
     * <p>To destroy a Droplet along with a sub-set of its associated resources, send a DELETE request to the
     * `/v2/droplets/$DROPLET_ID/destroy_with_associated_resources/selective` endpoint. The JSON body of the request
     * should include `reserved_ips`, `snapshots`, `volumes`, or `volume_snapshots` keys each set to an array of IDs for
     * the associated resources to be destroyed. The IDs can be found by querying the Droplet's associated resources.
     * Any associated resource not included in the request will remain and continue to accrue changes on your account.
     *
     * <p>A successful response will include a 202 response code and no content. Use the status endpoint to check on the
     * success or failure of the destruction of the individual resources.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @param body An object containing information about a resource to be scheduled for deletion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsDestroyWithAssociatedResourcesSelectiveResponse>
            destroyWithAssociatedResourcesSelectiveWithResponseAsync(
                    int dropletId, SelectiveDestroyAssociatedResource body) {
        final String accept = "application/json";
        return service.destroyWithAssociatedResourcesSelective(this.client.getHost(), dropletId, body, accept);
    }

    /**
     * Selectively Destroy a Droplet and its Associated Resources
     *
     * <p>To destroy a Droplet along with a sub-set of its associated resources, send a DELETE request to the
     * `/v2/droplets/$DROPLET_ID/destroy_with_associated_resources/selective` endpoint. The JSON body of the request
     * should include `reserved_ips`, `snapshots`, `volumes`, or `volume_snapshots` keys each set to an array of IDs for
     * the associated resources to be destroyed. The IDs can be found by querying the Droplet's associated resources.
     * Any associated resource not included in the request will remain and continue to accrue changes on your account.
     *
     * <p>A successful response will include a 202 response code and no content. Use the status endpoint to check on the
     * success or failure of the destruction of the individual resources.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @param body An object containing information about a resource to be scheduled for deletion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> destroyWithAssociatedResourcesSelectiveAsync(
            int dropletId, SelectiveDestroyAssociatedResource body) {
        return destroyWithAssociatedResourcesSelectiveWithResponseAsync(dropletId, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Destroy a Droplet and All of its Associated Resources (Dangerous)
     *
     * <p>To destroy a Droplet along with all of its associated resources, send a DELETE request to the
     * `/v2/droplets/$DROPLET_ID/destroy_with_associated_resources/dangerous` endpoint. The headers of this request must
     * include an `X-Dangerous` key set to `true`. To preview which resources will be destroyed, first query the
     * Droplet's associated resources. This operation _can not_ be reverse and should be used with caution.
     *
     * <p>A successful response will include a 202 response code and no content. Use the status endpoint to check on the
     * success or failure of the destruction of the individual resources.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @param xDangerous Acknowledge this action will destroy the Droplet and all associated resources and _can not_ be
     *     reversed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsDestroyWithAssociatedResourcesDangerousResponse>
            destroyWithAssociatedResourcesDangerousWithResponseAsync(int dropletId, boolean xDangerous) {
        final String accept = "application/json";
        return service.destroyWithAssociatedResourcesDangerous(this.client.getHost(), dropletId, xDangerous, accept);
    }

    /**
     * Destroy a Droplet and All of its Associated Resources (Dangerous)
     *
     * <p>To destroy a Droplet along with all of its associated resources, send a DELETE request to the
     * `/v2/droplets/$DROPLET_ID/destroy_with_associated_resources/dangerous` endpoint. The headers of this request must
     * include an `X-Dangerous` key set to `true`. To preview which resources will be destroyed, first query the
     * Droplet's associated resources. This operation _can not_ be reverse and should be used with caution.
     *
     * <p>A successful response will include a 202 response code and no content. Use the status endpoint to check on the
     * success or failure of the destruction of the individual resources.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @param xDangerous Acknowledge this action will destroy the Droplet and all associated resources and _can not_ be
     *     reversed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> destroyWithAssociatedResourcesDangerousAsync(int dropletId, boolean xDangerous) {
        return destroyWithAssociatedResourcesDangerousWithResponseAsync(dropletId, xDangerous)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Check Status of a Droplet Destroy with Associated Resources Request
     *
     * <p>To check on the status of a request to destroy a Droplet with its associated resources, send a GET request to
     * the `/v2/droplets/$DROPLET_ID/destroy_with_associated_resources/status` endpoint.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an objects containing information about a resources scheduled for deletion on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsGetDestroyAssociatedResourcesStatusResponse>
            getDestroyAssociatedResourcesStatusWithResponseAsync(int dropletId) {
        final String accept = "application/json";
        return service.getDestroyAssociatedResourcesStatus(this.client.getHost(), dropletId, accept);
    }

    /**
     * Check Status of a Droplet Destroy with Associated Resources Request
     *
     * <p>To check on the status of a request to destroy a Droplet with its associated resources, send a GET request to
     * the `/v2/droplets/$DROPLET_ID/destroy_with_associated_resources/status` endpoint.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an objects containing information about a resources scheduled for deletion on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDestroyAssociatedResourcesStatusAsync(int dropletId) {
        return getDestroyAssociatedResourcesStatusWithResponseAsync(dropletId)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retry a Droplet Destroy with Associated Resources Request
     *
     * <p>If the status of a request to destroy a Droplet with its associated resources reported any errors, it can be
     * retried by sending a POST request to the `/v2/droplets/$DROPLET_ID/destroy_with_associated_resources/retry`
     * endpoint.
     *
     * <p>Only one destroy can be active at a time per Droplet. If a retry is issued while another destroy is in
     * progress for the Droplet a 409 status code will be returned. A successful response will include a 202 response
     * code and no content.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsDestroyRetryWithAssociatedResourcesResponse>
            destroyRetryWithAssociatedResourcesWithResponseAsync(int dropletId) {
        final String accept = "application/json";
        return service.destroyRetryWithAssociatedResources(this.client.getHost(), dropletId, accept);
    }

    /**
     * Retry a Droplet Destroy with Associated Resources Request
     *
     * <p>If the status of a request to destroy a Droplet with its associated resources reported any errors, it can be
     * retried by sending a POST request to the `/v2/droplets/$DROPLET_ID/destroy_with_associated_resources/retry`
     * endpoint.
     *
     * <p>Only one destroy can be active at a time per Droplet. If a retry is issued while another destroy is in
     * progress for the Droplet a 409 status code will be returned. A successful response will include a 202 response
     * code and no content.
     *
     * @param dropletId A unique identifier for a Droplet instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> destroyRetryWithAssociatedResourcesAsync(int dropletId) {
        return destroyRetryWithAssociatedResourcesWithResponseAsync(dropletId)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List All Droplet Neighbors
     *
     * <p>To retrieve a list of all Droplets that are co-located on the same physical hardware, send a GET request to
     * `/v2/reports/droplet_neighbors_ids`.
     *
     * <p>The results will be returned as a JSON object with a key of `neighbor_ids`. This will be set to an array of
     * arrays. Each array will contain a set of Droplet IDs for Droplets that share a physical server. An empty array
     * indicates that all Droplets associated with your account are located on separate physical hardware.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletsListNeighborsIdsResponse> listNeighborsIdsWithResponseAsync() {
        final String accept = "application/json";
        return service.listNeighborsIds(this.client.getHost(), accept);
    }

    /**
     * List All Droplet Neighbors
     *
     * <p>To retrieve a list of all Droplets that are co-located on the same physical hardware, send a GET request to
     * `/v2/reports/droplet_neighbors_ids`.
     *
     * <p>The results will be returned as a JSON object with a key of `neighbor_ids`. This will be set to an array of
     * arrays. Each array will contain a set of Droplet IDs for Droplets that share a physical server. An empty array
     * indicates that all Droplets associated with your account are located on separate physical hardware.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listNeighborsIdsAsync() {
        return listNeighborsIdsWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
