package com.digitalocean.api;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.ImageActionsGetResponse;
import com.digitalocean.api.models.ImageActionsListResponse;
import com.digitalocean.api.models.ImageActionsPostResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ImageActions. */
public final class ImageActions {
    /** The proxy service used to perform REST calls. */
    private final ImageActionsService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of ImageActions.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ImageActions(GeneratedClient client) {
        this.service =
                RestProxy.create(ImageActionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientImageActions to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientImage")
    private interface ImageActionsService {
        @Get("/v2/images/{image_id}/actions")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ImageActionsListResponse> list(
                @HostParam("$host") String host,
                @PathParam("image_id") int imageId,
                @HeaderParam("Accept") String accept);

        @Post("/v2/images/{image_id}/actions")
        @ExpectedResponses({201, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ImageActionsPostResponse> post(
                @HostParam("$host") String host,
                @PathParam("image_id") int imageId,
                @BodyParam("application/json") Object body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/images/{image_id}/actions/{action_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ImageActionsGetResponse> get(
                @HostParam("$host") String host,
                @PathParam("image_id") int imageId,
                @PathParam("action_id") int actionId,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List All Actions for an Image
     *
     * <p>To retrieve all actions that have been executed on an image, send a GET request to
     * `/v2/images/$IMAGE_ID/actions`.
     *
     * @param imageId A unique number that can be used to identify and reference a specific image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImageActionsListResponse> listWithResponseAsync(int imageId) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), imageId, accept);
    }

    /**
     * List All Actions for an Image
     *
     * <p>To retrieve all actions that have been executed on an image, send a GET request to
     * `/v2/images/$IMAGE_ID/actions`.
     *
     * @param imageId A unique number that can be used to identify and reference a specific image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync(int imageId) {
        return listWithResponseAsync(imageId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Initiate an Image Action
     *
     * <p>The following actions are available on an Image.
     *
     * <p>## Convert an Image to a Snapshot
     *
     * <p>To convert an image, for example, a backup to a snapshot, send a POST request to
     * `/v2/images/$IMAGE_ID/actions`. Set the `type` attribute to `convert`.
     *
     * <p>## Transfer an Image
     *
     * <p>To transfer an image to another region, send a POST request to `/v2/images/$IMAGE_ID/actions`. Set the `type`
     * attribute to `transfer` and set `region` attribute to the slug identifier of the region you wish to transfer to.
     *
     * @param imageId A unique number that can be used to identify and reference a specific image.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImageActionsPostResponse> postWithResponseAsync(int imageId, Object body) {
        final String accept = "application/json";
        return service.post(this.client.getHost(), imageId, body, accept);
    }

    /**
     * Initiate an Image Action
     *
     * <p>The following actions are available on an Image.
     *
     * <p>## Convert an Image to a Snapshot
     *
     * <p>To convert an image, for example, a backup to a snapshot, send a POST request to
     * `/v2/images/$IMAGE_ID/actions`. Set the `type` attribute to `convert`.
     *
     * <p>## Transfer an Image
     *
     * <p>To transfer an image to another region, send a POST request to `/v2/images/$IMAGE_ID/actions`. Set the `type`
     * attribute to `transfer` and set `region` attribute to the slug identifier of the region you wish to transfer to.
     *
     * @param imageId A unique number that can be used to identify and reference a specific image.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> postAsync(int imageId, Object body) {
        return postWithResponseAsync(imageId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Action
     *
     * <p>To retrieve the status of an image action, send a GET request to
     * `/v2/images/$IMAGE_ID/actions/$IMAGE_ACTION_ID`.
     *
     * @param imageId A unique number that can be used to identify and reference a specific image.
     * @param actionId A unique numeric ID that can be used to identify and reference an action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImageActionsGetResponse> getWithResponseAsync(int imageId, int actionId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), imageId, actionId, accept);
    }

    /**
     * Retrieve an Existing Action
     *
     * <p>To retrieve the status of an image action, send a GET request to
     * `/v2/images/$IMAGE_ID/actions/$IMAGE_ACTION_ID`.
     *
     * @param imageId A unique number that can be used to identify and reference a specific image.
     * @param actionId A unique numeric ID that can be used to identify and reference an action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(int imageId, int actionId) {
        return getWithResponseAsync(imageId, actionId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
