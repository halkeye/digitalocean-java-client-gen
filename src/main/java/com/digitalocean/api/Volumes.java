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
import com.digitalocean.api.models.RegionSlug;
import com.digitalocean.api.models.VolumesCreateResponse;
import com.digitalocean.api.models.VolumesDeleteByNameResponse;
import com.digitalocean.api.models.VolumesDeleteResponse;
import com.digitalocean.api.models.VolumesGetResponse;
import com.digitalocean.api.models.VolumesListResponse;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Volumes.
 */
public final class Volumes {
    /**
     * The proxy service used to perform REST calls.
     */
    private final VolumesService service;

    /**
     * The service client containing this operation class.
     */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Volumes.
     * 
     * @param client the instance of the service client containing this operation class.
     */
     Volumes(GeneratedClient client) {
        this.service = RestProxy.create(VolumesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientVolumes to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientVolum")
    private interface VolumesService {
        @Get("/v2/volumes")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VolumesListResponse> list(@HostParam("$host") String host, @QueryParam("name") String name, @QueryParam("region") RegionSlug region, @QueryParam("per_page") Integer perPage, @QueryParam("page") Integer page, @HeaderParam("Accept") String accept);

        @Post("/v2/volumes")
        @ExpectedResponses({201, 400, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VolumesCreateResponse> create(@HostParam("$host") String host, @BodyParam("application/json") Object body, @HeaderParam("Accept") String accept);

        @Delete("/v2/volumes")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VolumesDeleteByNameResponse> deleteByName(@HostParam("$host") String host, @QueryParam("name") String name, @QueryParam("region") RegionSlug region, @HeaderParam("Accept") String accept);

        @Get("/v2/volumes/{volume_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VolumesGetResponse> get(@HostParam("$host") String host, @PathParam("volume_id") UUID volumeId, @HeaderParam("Accept") String accept);

        @Delete("/v2/volumes/{volume_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VolumesDeleteResponse> delete(@HostParam("$host") String host, @PathParam("volume_id") UUID volumeId, @HeaderParam("Accept") String accept);
    }

    /**
     * List All Block Storage Volumes
     * 
     * To list all of the block storage volumes available on your account, send a GET request to `/v2/volumes`.
     * ## Filtering Results
     * ### By Region
     * The `region` may be provided as query paramater in order to restrict results to volumes available in a specific region. For example: `/v2/volumes?region=nyc1`
     * ### By Name
     * It is also possible to list volumes on your account that match a specified name. To do so, send a GET request with the volume's name as a query parameter to `/v2/volumes?name=$VOLUME_NAME`.
     * **Note:** You can only create one volume per region with the same name.
     * ### By Name and Region
     * It is also possible to retrieve information about a block storage volume by name. To do so, send a GET request with the volume's name and the region slug for the region it is located in as query parameters to `/v2/volumes?name=$VOLUME_NAME&amp;region=nyc1`.
     * 
     * @param name The block storage volume's name.
     * @param region The slug identifier for the region where the resource is available.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumesListResponse> listWithResponseAsync(String name, RegionSlug region, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), name, region, perPage, page, accept);
    }

    /**
     * List All Block Storage Volumes
     * 
     * To list all of the block storage volumes available on your account, send a GET request to `/v2/volumes`.
     * ## Filtering Results
     * ### By Region
     * The `region` may be provided as query paramater in order to restrict results to volumes available in a specific region. For example: `/v2/volumes?region=nyc1`
     * ### By Name
     * It is also possible to list volumes on your account that match a specified name. To do so, send a GET request with the volume's name as a query parameter to `/v2/volumes?name=$VOLUME_NAME`.
     * **Note:** You can only create one volume per region with the same name.
     * ### By Name and Region
     * It is also possible to retrieve information about a block storage volume by name. To do so, send a GET request with the volume's name and the region slug for the region it is located in as query parameters to `/v2/volumes?name=$VOLUME_NAME&amp;region=nyc1`.
     * 
     * @param name The block storage volume's name.
     * @param region The slug identifier for the region where the resource is available.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync(String name, RegionSlug region, Integer perPage, Integer page) {
        return listWithResponseAsync(name, region, perPage, page)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Create a New Block Storage Volume
     * 
     * To create a new volume, send a POST request to `/v2/volumes`. Optionally, a `filesystem_type` attribute may be provided in order to automatically format the volume's filesystem. Pre-formatted volumes are automatically mounted when attached to Ubuntu, Debian, Fedora, Fedora Atomic, and CentOS Droplets created on or after April 26, 2018. Attaching pre-formatted volumes to Droplets without support for auto-mounting is not recommended.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumesCreateResponse> createWithResponseAsync(Object body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), body, accept);
    }

    /**
     * Create a New Block Storage Volume
     * 
     * To create a new volume, send a POST request to `/v2/volumes`. Optionally, a `filesystem_type` attribute may be provided in order to automatically format the volume's filesystem. Pre-formatted volumes are automatically mounted when attached to Ubuntu, Debian, Fedora, Fedora Atomic, and CentOS Droplets created on or after April 26, 2018. Attaching pre-formatted volumes to Droplets without support for auto-mounting is not recommended.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAsync(Object body) {
        return createWithResponseAsync(body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Delete a Block Storage Volume by Name
     * 
     * Block storage volumes may also be deleted by name by sending a DELETE request with the volume's **name** and the **region slug** for the region it is located in as query parameters to `/v2/volumes?name=$VOLUME_NAME&amp;region=nyc1`.
     * No response body will be sent back, but the response code will indicate success. Specifically, the response code will be a 204, which means that the action was successful with no returned body data.
     * 
     * @param name The block storage volume's name.
     * @param region The slug identifier for the region where the resource is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumesDeleteByNameResponse> deleteByNameWithResponseAsync(String name, RegionSlug region) {
        final String accept = "application/json";
        return service.deleteByName(this.client.getHost(), name, region, accept);
    }

    /**
     * Delete a Block Storage Volume by Name
     * 
     * Block storage volumes may also be deleted by name by sending a DELETE request with the volume's **name** and the **region slug** for the region it is located in as query parameters to `/v2/volumes?name=$VOLUME_NAME&amp;region=nyc1`.
     * No response body will be sent back, but the response code will indicate success. Specifically, the response code will be a 204, which means that the action was successful with no returned body data.
     * 
     * @param name The block storage volume's name.
     * @param region The slug identifier for the region where the resource is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteByNameAsync(String name, RegionSlug region) {
        return deleteByNameWithResponseAsync(name, region)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve an Existing Block Storage Volume
     * 
     * To show information about a block storage volume, send a GET request to `/v2/volumes/$VOLUME_ID`.
     * 
     * @param volumeId The ID of the block storage volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumesGetResponse> getWithResponseAsync(UUID volumeId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), volumeId, accept);
    }

    /**
     * Retrieve an Existing Block Storage Volume
     * 
     * To show information about a block storage volume, send a GET request to `/v2/volumes/$VOLUME_ID`.
     * 
     * @param volumeId The ID of the block storage volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(UUID volumeId) {
        return getWithResponseAsync(volumeId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Delete a Block Storage Volume
     * 
     * To delete a block storage volume, destroying all data and removing it from your account, send a DELETE request to `/v2/volumes/$VOLUME_ID`.
     * No response body will be sent back, but the response code will indicate success. Specifically, the response code will be a 204, which means that the action was successful with no returned body data.
     * 
     * @param volumeId The ID of the block storage volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumesDeleteResponse> deleteWithResponseAsync(UUID volumeId) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), volumeId, accept);
    }

    /**
     * Delete a Block Storage Volume
     * 
     * To delete a block storage volume, destroying all data and removing it from your account, send a DELETE request to `/v2/volumes/$VOLUME_ID`.
     * No response body will be sent back, but the response code will indicate success. Specifically, the response code will be a 204, which means that the action was successful with no returned body data.
     * 
     * @param volumeId The ID of the block storage volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync(UUID volumeId) {
        return deleteWithResponseAsync(volumeId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}
}
