package com.digitalocean.api;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.digitalocean.api.models.Enum89;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.SnapshotsDeleteResponse;
import com.digitalocean.api.models.SnapshotsGetResponse;
import com.digitalocean.api.models.SnapshotsListResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SnapshotsOperations. */
public final class SnapshotsOperations {
    /** The proxy service used to perform REST calls. */
    private final SnapshotsService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of SnapshotsOperations.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SnapshotsOperations(GeneratedClient client) {
        this.service =
                RestProxy.create(SnapshotsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientSnapshotsOperations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientSnaps")
    private interface SnapshotsService {
        @Get("/v2/snapshots")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SnapshotsListResponse> list(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @QueryParam("resource_type") Enum89 resourceType,
                @HeaderParam("Accept") String accept);

        @Get("/v2/snapshots/{snapshot_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SnapshotsGetResponse> get(
                @HostParam("$host") String host,
                @PathParam("snapshot_id") Object snapshotId,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/snapshots/{snapshot_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SnapshotsDeleteResponse> delete(
                @HostParam("$host") String host,
                @PathParam("snapshot_id") Object snapshotId,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List All Snapshots
     *
     * <p>To list all of the snapshots available on your account, send a GET request to `/v2/snapshots`.
     *
     * <p>The response will be a JSON object with a key called `snapshots`. This will be set to an array of `snapshot`
     * objects, each of which will contain the standard snapshot attributes.
     *
     * <p>### Filtering Results by Resource Type
     *
     * <p>It's possible to request filtered results by including certain query parameters.
     *
     * <p>#### List Droplet Snapshots
     *
     * <p>To retrieve only snapshots based on Droplets, include the `resource_type` query parameter set to `droplet`.
     * For example, `/v2/snapshots?resource_type=droplet`.
     *
     * <p>#### List Volume Snapshots
     *
     * <p>To retrieve only snapshots based on volumes, include the `resource_type` query parameter set to `volume`. For
     * example, `/v2/snapshots?resource_type=volume`.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @param resourceType Used to filter snapshots by a resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SnapshotsListResponse> listWithResponseAsync(Integer perPage, Integer page, Enum89 resourceType) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), perPage, page, resourceType, accept);
    }

    /**
     * List All Snapshots
     *
     * <p>To list all of the snapshots available on your account, send a GET request to `/v2/snapshots`.
     *
     * <p>The response will be a JSON object with a key called `snapshots`. This will be set to an array of `snapshot`
     * objects, each of which will contain the standard snapshot attributes.
     *
     * <p>### Filtering Results by Resource Type
     *
     * <p>It's possible to request filtered results by including certain query parameters.
     *
     * <p>#### List Droplet Snapshots
     *
     * <p>To retrieve only snapshots based on Droplets, include the `resource_type` query parameter set to `droplet`.
     * For example, `/v2/snapshots?resource_type=droplet`.
     *
     * <p>#### List Volume Snapshots
     *
     * <p>To retrieve only snapshots based on volumes, include the `resource_type` query parameter set to `volume`. For
     * example, `/v2/snapshots?resource_type=volume`.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @param resourceType Used to filter snapshots by a resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync(Integer perPage, Integer page, Enum89 resourceType) {
        return listWithResponseAsync(perPage, page, resourceType).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Snapshot
     *
     * <p>To retrieve information about a snapshot, send a GET request to `/v2/snapshots/$SNAPSHOT_ID`.
     *
     * <p>The response will be a JSON object with a key called `snapshot`. The value of this will be an snapshot object
     * containing the standard snapshot attributes.
     *
     * @param snapshotId Either the ID of an existing snapshot. This will be an integer for a Droplet snapshot or a
     *     string for a volume snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SnapshotsGetResponse> getWithResponseAsync(Object snapshotId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), snapshotId, accept);
    }

    /**
     * Retrieve an Existing Snapshot
     *
     * <p>To retrieve information about a snapshot, send a GET request to `/v2/snapshots/$SNAPSHOT_ID`.
     *
     * <p>The response will be a JSON object with a key called `snapshot`. The value of this will be an snapshot object
     * containing the standard snapshot attributes.
     *
     * @param snapshotId Either the ID of an existing snapshot. This will be an integer for a Droplet snapshot or a
     *     string for a volume snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(Object snapshotId) {
        return getWithResponseAsync(snapshotId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete a Snapshot
     *
     * <p>Both Droplet and volume snapshots are managed through the `/v2/snapshots/` endpoint. To delete a snapshot,
     * send a DELETE request to `/v2/snapshots/$SNAPSHOT_ID`.
     *
     * <p>A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * @param snapshotId Either the ID of an existing snapshot. This will be an integer for a Droplet snapshot or a
     *     string for a volume snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SnapshotsDeleteResponse> deleteWithResponseAsync(Object snapshotId) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), snapshotId, accept);
    }

    /**
     * Delete a Snapshot
     *
     * <p>Both Droplet and volume snapshots are managed through the `/v2/snapshots/` endpoint. To delete a snapshot,
     * send a DELETE request to `/v2/snapshots/$SNAPSHOT_ID`.
     *
     * <p>A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * @param snapshotId Either the ID of an existing snapshot. This will be an integer for a Droplet snapshot or a
     *     string for a volume snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync(Object snapshotId) {
        return deleteWithResponseAsync(snapshotId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
