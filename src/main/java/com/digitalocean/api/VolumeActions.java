package com.digitalocean.api;

import com.azure.core.annotation.BodyParam;
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
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.VolumeActionsGetResponse;
import com.digitalocean.api.models.VolumeActionsListResponse;
import com.digitalocean.api.models.VolumeActionsPostByIdResponse;
import com.digitalocean.api.models.VolumeActionsPostResponse;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in VolumeActions.
 */
public final class VolumeActions {
    /**
     * The proxy service used to perform REST calls.
     */
    private final VolumeActionsService service;

    /**
     * The service client containing this operation class.
     */
    private final GeneratedClient client;

    /**
     * Initializes an instance of VolumeActions.
     * 
     * @param client the instance of the service client containing this operation class.
     */
     VolumeActions(GeneratedClient client) {
        this.service = RestProxy.create(VolumeActionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientVolumeActions to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientVolum")
    private interface VolumeActionsService {
        @Post("/v2/volumes/actions")
        @ExpectedResponses({202, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VolumeActionsPostResponse> post(@HostParam("$host") String host, @QueryParam("per_page") Integer perPage, @QueryParam("page") Integer page, @BodyParam("application/json") Object body, @HeaderParam("Accept") String accept);

        @Get("/v2/volumes/{volume_id}/actions")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VolumeActionsListResponse> list(@HostParam("$host") String host, @PathParam("volume_id") UUID volumeId, @QueryParam("per_page") Integer perPage, @QueryParam("page") Integer page, @HeaderParam("Accept") String accept);

        @Post("/v2/volumes/{volume_id}/actions")
        @ExpectedResponses({202, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VolumeActionsPostByIdResponse> postById(@HostParam("$host") String host, @PathParam("volume_id") UUID volumeId, @QueryParam("per_page") Integer perPage, @QueryParam("page") Integer page, @BodyParam("application/json") Object body, @HeaderParam("Accept") String accept);

        @Get("/v2/volumes/{volume_id}/actions/{action_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VolumeActionsGetResponse> get(@HostParam("$host") String host, @PathParam("volume_id") UUID volumeId, @PathParam("action_id") int actionId, @QueryParam("per_page") Integer perPage, @QueryParam("page") Integer page, @HeaderParam("Accept") String accept);
    }

    /**
     * Initiate A Block Storage Action By Volume Name
     * 
     * To initiate an action on a block storage volume by Name, send a POST request to
     * `~/v2/volumes/actions`. The body should contain the appropriate
     * attributes for the respective action.
     * 
     * ## Attach a Block Storage Volume to a Droplet
     * 
     * | Attribute   | Details                                                             |
     * | ----------- | ------------------------------------------------------------------- |
     * | type        | This must be `attach`                                               |
     * | volume_name | The name of the block storage volume                                |
     * | droplet_id  | Set to the Droplet's ID                                             |
     * | region      | Set to the slug representing the region where the volume is located |
     * 
     * Each volume may only be attached to a single Droplet. However, up to five
     * volumes may be attached to a Droplet at a time. Pre-formatted volumes will be
     * automatically mounted to Ubuntu, Debian, Fedora, Fedora Atomic, and CentOS
     * Droplets created on or after April 26, 2018 when attached. On older Droplets,
     * [additional configuration](https://www.digitalocean.com/community/tutorials/how-to-partition-and-format-digitalocean-block-storage-volumes-in-linux#mounting-the-filesystems)
     * is required.
     * 
     * ## Remove a Block Storage Volume from a Droplet
     * 
     * | Attribute   | Details                                                             |
     * | ----------- | ------------------------------------------------------------------- |
     * | type        | This must be `detach`                                               |
     * | volume_name | The name of the block storage volume                                |
     * | droplet_id  | Set to the Droplet's ID                                             |
     * | region      | Set to the slug representing the region where the volume is located |.
     * 
     * @param body The body parameter.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumeActionsPostResponse> postWithResponseAsync(Object body, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.post(this.client.getHost(), perPage, page, body, accept);
    }

    /**
     * Initiate A Block Storage Action By Volume Name
     * 
     * To initiate an action on a block storage volume by Name, send a POST request to
     * `~/v2/volumes/actions`. The body should contain the appropriate
     * attributes for the respective action.
     * 
     * ## Attach a Block Storage Volume to a Droplet
     * 
     * | Attribute   | Details                                                             |
     * | ----------- | ------------------------------------------------------------------- |
     * | type        | This must be `attach`                                               |
     * | volume_name | The name of the block storage volume                                |
     * | droplet_id  | Set to the Droplet's ID                                             |
     * | region      | Set to the slug representing the region where the volume is located |
     * 
     * Each volume may only be attached to a single Droplet. However, up to five
     * volumes may be attached to a Droplet at a time. Pre-formatted volumes will be
     * automatically mounted to Ubuntu, Debian, Fedora, Fedora Atomic, and CentOS
     * Droplets created on or after April 26, 2018 when attached. On older Droplets,
     * [additional configuration](https://www.digitalocean.com/community/tutorials/how-to-partition-and-format-digitalocean-block-storage-volumes-in-linux#mounting-the-filesystems)
     * is required.
     * 
     * ## Remove a Block Storage Volume from a Droplet
     * 
     * | Attribute   | Details                                                             |
     * | ----------- | ------------------------------------------------------------------- |
     * | type        | This must be `detach`                                               |
     * | volume_name | The name of the block storage volume                                |
     * | droplet_id  | Set to the Droplet's ID                                             |
     * | region      | Set to the slug representing the region where the volume is located |.
     * 
     * @param body The body parameter.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> postAsync(Object body, Integer perPage, Integer page) {
        return postWithResponseAsync(body, perPage, page)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * List All Actions for a Volume
     * 
     * To retrieve all actions that have been executed on a volume, send a GET request to `/v2/volumes/$VOLUME_ID/actions`.
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
    public Mono<VolumeActionsListResponse> listWithResponseAsync(UUID volumeId, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), volumeId, perPage, page, accept);
    }

    /**
     * List All Actions for a Volume
     * 
     * To retrieve all actions that have been executed on a volume, send a GET request to `/v2/volumes/$VOLUME_ID/actions`.
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
     * Initiate A Block Storage Action By Volume Id
     * 
     * To initiate an action on a block storage volume by Id, send a POST request to
     * `~/v2/volumes/$VOLUME_ID/actions`. The body should contain the appropriate
     * attributes for the respective action.
     * 
     * ## Attach a Block Storage Volume to a Droplet
     * 
     * | Attribute  | Details                                                             |
     * | ---------- | ------------------------------------------------------------------- |
     * | type       | This must be `attach`                                               |
     * | droplet_id | Set to the Droplet's ID                                             |
     * | region     | Set to the slug representing the region where the volume is located |
     * 
     * Each volume may only be attached to a single Droplet. However, up to seven
     * volumes may be attached to a Droplet at a time. Pre-formatted volumes will be
     * automatically mounted to Ubuntu, Debian, Fedora, Fedora Atomic, and CentOS
     * Droplets created on or after April 26, 2018 when attached. On older Droplets,
     * [additional configuration](https://www.digitalocean.com/community/tutorials/how-to-partition-and-format-digitalocean-block-storage-volumes-in-linux#mounting-the-filesystems)
     * is required.
     * 
     * ## Remove a Block Storage Volume from a Droplet
     * 
     * | Attribute  | Details                                                             |
     * | ---------- | ------------------------------------------------------------------- |
     * | type       | This must be `detach`                                               |
     * | droplet_id | Set to the Droplet's ID                                             |
     * | region     | Set to the slug representing the region where the volume is located |
     * 
     * ## Resize a Volume
     * 
     * | Attribute      | Details                                                             |
     * | -------------- | ------------------------------------------------------------------- |
     * | type           | This must be `resize`                                               |
     * | size_gigabytes | The new size of the block storage volume in GiB (1024^3)            |
     * | region         | Set to the slug representing the region where the volume is located |
     * 
     * Volumes may only be resized upwards. The maximum size for a volume is 16TiB.
     * 
     * @param volumeId The ID of the block storage volume.
     * @param body The body parameter.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumeActionsPostByIdResponse> postByIdWithResponseAsync(UUID volumeId, Object body, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.postById(this.client.getHost(), volumeId, perPage, page, body, accept);
    }

    /**
     * Initiate A Block Storage Action By Volume Id
     * 
     * To initiate an action on a block storage volume by Id, send a POST request to
     * `~/v2/volumes/$VOLUME_ID/actions`. The body should contain the appropriate
     * attributes for the respective action.
     * 
     * ## Attach a Block Storage Volume to a Droplet
     * 
     * | Attribute  | Details                                                             |
     * | ---------- | ------------------------------------------------------------------- |
     * | type       | This must be `attach`                                               |
     * | droplet_id | Set to the Droplet's ID                                             |
     * | region     | Set to the slug representing the region where the volume is located |
     * 
     * Each volume may only be attached to a single Droplet. However, up to seven
     * volumes may be attached to a Droplet at a time. Pre-formatted volumes will be
     * automatically mounted to Ubuntu, Debian, Fedora, Fedora Atomic, and CentOS
     * Droplets created on or after April 26, 2018 when attached. On older Droplets,
     * [additional configuration](https://www.digitalocean.com/community/tutorials/how-to-partition-and-format-digitalocean-block-storage-volumes-in-linux#mounting-the-filesystems)
     * is required.
     * 
     * ## Remove a Block Storage Volume from a Droplet
     * 
     * | Attribute  | Details                                                             |
     * | ---------- | ------------------------------------------------------------------- |
     * | type       | This must be `detach`                                               |
     * | droplet_id | Set to the Droplet's ID                                             |
     * | region     | Set to the slug representing the region where the volume is located |
     * 
     * ## Resize a Volume
     * 
     * | Attribute      | Details                                                             |
     * | -------------- | ------------------------------------------------------------------- |
     * | type           | This must be `resize`                                               |
     * | size_gigabytes | The new size of the block storage volume in GiB (1024^3)            |
     * | region         | Set to the slug representing the region where the volume is located |
     * 
     * Volumes may only be resized upwards. The maximum size for a volume is 16TiB.
     * 
     * @param volumeId The ID of the block storage volume.
     * @param body The body parameter.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> postByIdAsync(UUID volumeId, Object body, Integer perPage, Integer page) {
        return postByIdWithResponseAsync(volumeId, body, perPage, page)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve an Existing Volume Action
     * 
     * To retrieve the status of a volume action, send a GET request to `/v2/volumes/$VOLUME_ID/actions/$ACTION_ID`.
     * 
     * @param volumeId The ID of the block storage volume.
     * @param actionId A unique numeric ID that can be used to identify and reference an action.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumeActionsGetResponse> getWithResponseAsync(UUID volumeId, int actionId, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), volumeId, actionId, perPage, page, accept);
    }

    /**
     * Retrieve an Existing Volume Action
     * 
     * To retrieve the status of a volume action, send a GET request to `/v2/volumes/$VOLUME_ID/actions/$ACTION_ID`.
     * 
     * @param volumeId The ID of the block storage volume.
     * @param actionId A unique numeric ID that can be used to identify and reference an action.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(UUID volumeId, int actionId, Integer perPage, Integer page) {
        return getWithResponseAsync(volumeId, actionId, perPage, page)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}
}
