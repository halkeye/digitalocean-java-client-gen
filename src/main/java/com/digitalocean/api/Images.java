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
import com.azure.core.util.Context;
import com.digitalocean.api.models.Enum59;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.ImageNewCustom;
import com.digitalocean.api.models.ImagesCreateCustomResponse;
import com.digitalocean.api.models.ImagesDeleteResponse;
import com.digitalocean.api.models.ImagesGetResponse;
import com.digitalocean.api.models.ImagesListResponse;
import com.digitalocean.api.models.ImagesUpdateResponse;
import com.digitalocean.api.models.ImageUpdate;
import java.util.Objects;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Images.
 */
public final class Images {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ImagesService service;

    /**
     * The service client containing this operation class.
     */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Images.
     * 
     * @param client the instance of the service client containing this operation class.
     */
     Images(GeneratedClient client) {
        this.service = RestProxy.create(ImagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientImages to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientImage")
    private interface ImagesService {
        @Get("/v2/images")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ImagesListResponse> list(@HostParam("$host") String host, @QueryParam("type") Enum59 type, @QueryParam("private") Boolean privateParameter, @QueryParam("tag_name") String tagName, @QueryParam("per_page") Integer perPage, @QueryParam("page") Integer page, @HeaderParam("Accept") String accept);

        @Post("/v2/images")
        @ExpectedResponses({202, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ImagesCreateCustomResponse> createCustom(@HostParam("$host") String host, @BodyParam("application/json") ImageNewCustom body, @HeaderParam("Accept") String accept);

        @Get("/v2/images/{image_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ImagesGetResponse> get(@HostParam("$host") String host, @PathParam("image_id") Object imageId, @HeaderParam("Accept") String accept);

        @Put("/v2/images/{image_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ImagesUpdateResponse> update(@HostParam("$host") String host, @PathParam("image_id") int imageId, @BodyParam("application/json") ImageUpdate body, @HeaderParam("Accept") String accept);

        @Delete("/v2/images/{image_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ImagesDeleteResponse> delete(@HostParam("$host") String host, @PathParam("image_id") int imageId, @HeaderParam("Accept") String accept);
    }

    /**
     * List All Images
     * 
     * To list all of the images available on your account, send a GET request to /v2/images.
     * 
     * ## Filtering Results
     * -----
     * 
     * It's possible to request filtered results by including certain query parameters.
     * 
     * **Image Type**
     * 
     * Either 1-Click Application or OS Distribution images can be filtered by using the `type` query parameter.
     * 
     * &gt; Important: The `type` query parameter does not directly relate to the `type` attribute.
     * 
     * To retrieve only ***distribution*** images, include the `type` query parameter set to distribution, `/v2/images?type=distribution`.
     * 
     * To retrieve only ***application*** images, include the `type` query parameter set to application, `/v2/images?type=application`.
     * 
     * **User Images**
     * 
     * To retrieve only the private images of a user, include the `private` query parameter set to true, `/v2/images?private=true`.
     * 
     * **Tags**
     * 
     * To list all images assigned to a specific tag, include the `tag_name` query parameter set to the name of the tag in your GET request. For example, `/v2/images?tag_name=$TAG_NAME`.
     * 
     * @param type Filters results based on image type which can be either `application` or `distribution`.
     * @param privateParameter Used to filter only user images.
     * @param tagName Used to filter images by a specific tag.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImagesListResponse> listWithResponseAsync(Enum59 type, Boolean privateParameter, String tagName, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), type, privateParameter, tagName, perPage, page, accept);
    }

    /**
     * List All Images
     * 
     * To list all of the images available on your account, send a GET request to /v2/images.
     * 
     * ## Filtering Results
     * -----
     * 
     * It's possible to request filtered results by including certain query parameters.
     * 
     * **Image Type**
     * 
     * Either 1-Click Application or OS Distribution images can be filtered by using the `type` query parameter.
     * 
     * &gt; Important: The `type` query parameter does not directly relate to the `type` attribute.
     * 
     * To retrieve only ***distribution*** images, include the `type` query parameter set to distribution, `/v2/images?type=distribution`.
     * 
     * To retrieve only ***application*** images, include the `type` query parameter set to application, `/v2/images?type=application`.
     * 
     * **User Images**
     * 
     * To retrieve only the private images of a user, include the `private` query parameter set to true, `/v2/images?private=true`.
     * 
     * **Tags**
     * 
     * To list all images assigned to a specific tag, include the `tag_name` query parameter set to the name of the tag in your GET request. For example, `/v2/images?tag_name=$TAG_NAME`.
     * 
     * @param type Filters results based on image type which can be either `application` or `distribution`.
     * @param privateParameter Used to filter only user images.
     * @param tagName Used to filter images by a specific tag.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync(Enum59 type, Boolean privateParameter, String tagName, Integer perPage, Integer page) {
        return listWithResponseAsync(type, privateParameter, tagName, perPage, page)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Create a Custom Image
     * 
     * To create a new custom image, send a POST request to /v2/images.
     * The body must contain a url attribute pointing to a Linux virtual machine
     * image to be imported into DigitalOcean.
     * The image must be in the raw, qcow2, vhdx, vdi, or vmdk format.
     * It may be compressed using gzip or bzip2 and must be smaller than 100 GB after
     *  being decompressed.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImagesCreateCustomResponse> createCustomWithResponseAsync(ImageNewCustom body) {
        final String accept = "application/json";
        return service.createCustom(this.client.getHost(), body, accept);
    }

    /**
     * Create a Custom Image
     * 
     * To create a new custom image, send a POST request to /v2/images.
     * The body must contain a url attribute pointing to a Linux virtual machine
     * image to be imported into DigitalOcean.
     * The image must be in the raw, qcow2, vhdx, vdi, or vmdk format.
     * It may be compressed using gzip or bzip2 and must be smaller than 100 GB after
     *  being decompressed.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createCustomAsync(ImageNewCustom body) {
        return createCustomWithResponseAsync(body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve an Existing Image
     * 
     * To retrieve information about an image, send a `GET` request to
     * `/v2/images/$IDENTIFIER`.
     * 
     * @param imageId A unique number (id) or string (slug) used to identify and reference a
     * specific image.
     * 
     * **Public** images can be identified by image `id` or `slug`.
     * 
     * **Private** images *must* be identified by image `id`.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImagesGetResponse> getWithResponseAsync(Object imageId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), imageId, accept);
    }

    /**
     * Retrieve an Existing Image
     * 
     * To retrieve information about an image, send a `GET` request to
     * `/v2/images/$IDENTIFIER`.
     * 
     * @param imageId A unique number (id) or string (slug) used to identify and reference a
     * specific image.
     * 
     * **Public** images can be identified by image `id` or `slug`.
     * 
     * **Private** images *must* be identified by image `id`.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(Object imageId) {
        return getWithResponseAsync(imageId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Update an Image
     * 
     * To update an image, send a `PUT` request to `/v2/images/$IMAGE_ID`.
     * Set the `name` attribute to the new value you would like to use.
     * For custom images, the `description` and `distribution` attributes may also be updated.
     * 
     * @param imageId A unique number that can be used to identify and reference a specific image.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImagesUpdateResponse> updateWithResponseAsync(int imageId, ImageUpdate body) {
        final String accept = "application/json";
        return service.update(this.client.getHost(), imageId, body, accept);
    }

    /**
     * Update an Image
     * 
     * To update an image, send a `PUT` request to `/v2/images/$IMAGE_ID`.
     * Set the `name` attribute to the new value you would like to use.
     * For custom images, the `description` and `distribution` attributes may also be updated.
     * 
     * @param imageId A unique number that can be used to identify and reference a specific image.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateAsync(int imageId, ImageUpdate body) {
        return updateWithResponseAsync(imageId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Delete an Image
     * 
     * To delete a snapshot or custom image, send a `DELETE` request to `/v2/images/$IMAGE_ID`.
     * 
     * @param imageId A unique number that can be used to identify and reference a specific image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImagesDeleteResponse> deleteWithResponseAsync(int imageId) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), imageId, accept);
    }

    /**
     * Delete an Image
     * 
     * To delete a snapshot or custom image, send a `DELETE` request to `/v2/images/$IMAGE_ID`.
     * 
     * @param imageId A unique number that can be used to identify and reference a specific image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync(int imageId) {
        return deleteWithResponseAsync(imageId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}
}
