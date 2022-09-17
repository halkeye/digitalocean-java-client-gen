package com.digitalocean.api;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.SizesListResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Sizes. */
public final class Sizes {
    /** The proxy service used to perform REST calls. */
    private final SizesService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Sizes.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Sizes(GeneratedClient client) {
        this.service = RestProxy.create(SizesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientSizes to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientSizes")
    private interface SizesService {
        @Get("/v2/sizes")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SizesListResponse> list(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List All Droplet Sizes
     *
     * <p>To list all of available Droplet sizes, send a GET request to `/v2/sizes`. The response will be a JSON object
     * with a key called `sizes`. The value of this will be an array of `size` objects each of which contain the
     * standard size attributes.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SizesListResponse> listWithResponseAsync(Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), perPage, page, accept);
    }

    /**
     * List All Droplet Sizes
     *
     * <p>To list all of available Droplet sizes, send a GET request to `/v2/sizes`. The response will be a JSON object
     * with a key called `sizes`. The value of this will be an array of `size` objects each of which contain the
     * standard size attributes.
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
}
