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
import com.azure.core.util.Context;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.VolumeSnapshotsCreateResponse;
import com.digitalocean.api.models.VolumeSnapshotsDeleteByIdResponse;
import com.digitalocean.api.models.VolumeSnapshotsGetByIdResponse;
import com.digitalocean.api.models.VolumeSnapshotsListResponse;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in VolumeSnapshots.
 */
public final class VolumeSnapshots {
    /**
     * The proxy service used to perform REST calls.
     */
    private final VolumeSnapshotsService service;

    /**
     * The service client containing this operation class.
     */
    private final GeneratedClient client;

    /**
     * Initializes an instance of VolumeSnapshots.
     * 
     * @param client the instance of the service client containing this operation class.
     */
     VolumeSnapshots(GeneratedClient client) {
        this.service = RestProxy.create(VolumeSnapshotsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientVolumeSnapshots to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientVolum")
    private interface VolumeSnapshotsService {
        @Get("/v2/volumes/snapshots/{snapshot_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VolumeSnapshotsGetByIdResponse> getById(@HostParam("$host") String host, @PathParam("snapshot_id") Object snapshotId, @HeaderParam("Accept") String accept);

        @Delete("/v2/volumes/snapshots/{snapshot_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VolumeSnapshotsDeleteByIdResponse> deleteById(@HostParam("$host") String host, @PathParam("snapshot_id") Object snapshotId, @HeaderParam("Accept") String accept);

        @Get("/v2/volumes/{volume_id}/snapshots")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VolumeSnapshotsListResponse> list(@HostParam("$host") String host, @PathParam("volume_id") UUID volumeId, @QueryParam("per_page") Integer perPage, @QueryParam("page") Integer page, @HeaderParam("Accept") String accept);

        @Post("/v2/volumes/{volume_id}/snapshots")
        @ExpectedResponses({201, 400, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VolumeSnapshotsCreateResponse> create(@HostParam("$host") String host, @PathParam("volume_id") UUID volumeId, @BodyParam("application/json") Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);
    }

    /**
     * Retreive an Existing Volume Snapshot
     * 
     * To retrieve the details of a snapshot that has been created from a volume, send a GET request to `/v2/volumes/snapshots/$SNAPSHOT_ID`.
     * 
     * @param snapshotId Either the ID of an existing snapshot. This will be an integer for a Droplet snapshot or a string for a volume snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumeSnapshotsGetByIdResponse> getByIdWithResponseAsync(Object snapshotId) {
        final String accept = "application/json";
        return service.getById(this.client.getHost(), snapshotId, accept);
    }

    /**
     * Retreive an Existing Volume Snapshot
     * 
     * To retrieve the details of a snapshot that has been created from a volume, send a GET request to `/v2/volumes/snapshots/$SNAPSHOT_ID`.
     * 
     * @param snapshotId Either the ID of an existing snapshot. This will be an integer for a Droplet snapshot or a string for a volume snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getByIdAsync(Object snapshotId) {
        return getByIdWithResponseAsync(snapshotId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Delete a Volume Snapshot
     * 
     * To delete a volume snapshot, send a DELETE request to
     * `/v2/snapshots/$SNAPSHOT_ID`.
     * 
     * A status of 204 will be given. This indicates that the request was processed
     * successfully, but that no response body is needed.
     * 
     * @param snapshotId Either the ID of an existing snapshot. This will be an integer for a Droplet snapshot or a string for a volume snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumeSnapshotsDeleteByIdResponse> deleteByIdWithResponseAsync(Object snapshotId) {
        final String accept = "application/json";
        return service.deleteById(this.client.getHost(), snapshotId, accept);
    }

    /**
     * Delete a Volume Snapshot
     * 
     * To delete a volume snapshot, send a DELETE request to
     * `/v2/snapshots/$SNAPSHOT_ID`.
     * 
     * A status of 204 will be given. This indicates that the request was processed
     * successfully, but that no response body is needed.
     * 
     * @param snapshotId Either the ID of an existing snapshot. This will be an integer for a Droplet snapshot or a string for a volume snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteByIdAsync(Object snapshotId) {
        return deleteByIdWithResponseAsync(snapshotId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * List Snapshots for a Volume
     * 
     * To retrieve the snapshots that have been created from a volume, send a GET request to `/v2/volumes/$VOLUME_ID/snapshots`.
     * 
     * @param volumeId The ID of the block storage volume.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumeSnapshotsListResponse> listWithResponseAsync(UUID volumeId, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), volumeId, perPage, page, accept);
    }

    /**
     * List Snapshots for a Volume
     * 
     * To retrieve the snapshots that have been created from a volume, send a GET request to `/v2/volumes/$VOLUME_ID/snapshots`.
     * 
     * @param volumeId The ID of the block storage volume.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync(UUID volumeId, Integer perPage, Integer page) {
        return listWithResponseAsync(volumeId, perPage, page)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Create Snapshot from a Volume
     * 
     * To create a snapshot from a volume, sent a POST request to `/v2/volumes/$VOLUME_ID/snapshots`.
     * 
     * @param volumeId The ID of the block storage volume.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumeSnapshotsCreateResponse> createWithResponseAsync(UUID volumeId, Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), volumeId, body, accept);
    }

    /**
     * Create Snapshot from a Volume
     * 
     * To create a snapshot from a volume, sent a POST request to `/v2/volumes/$VOLUME_ID/snapshots`.
     * 
     * @param volumeId The ID of the block storage volume.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAsync(UUID volumeId, Paths1Vjb9PvV2VolumesVolumeIdSnapshotsPostRequestbodyContentApplicationJsonSchema body) {
        return createWithResponseAsync(volumeId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}
}
