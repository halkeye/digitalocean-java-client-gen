package com.digitalocean.api;

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
import com.digitalocean.api.models.ActionsGetResponse;
import com.digitalocean.api.models.ActionsListResponse;
import com.digitalocean.api.models.ErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Actions. */
public final class Actions {
    /** The proxy service used to perform REST calls. */
    private final ActionsService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Actions.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Actions(GeneratedClient client) {
        this.service = RestProxy.create(ActionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientActions to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientActio")
    private interface ActionsService {
        @Get("/v2/actions")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ActionsListResponse> list(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);

        @Get("/v2/actions/{action_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ActionsGetResponse> get(
                @HostParam("$host") String host,
                @PathParam("action_id") int actionId,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List All Actions
     *
     * <p>This will be the entire list of actions taken on your account, so it will be quite large. As with any large
     * collection returned by the API, the results will be paginated with only 20 on each page by default.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ActionsListResponse> listWithResponseAsync(Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), perPage, page, accept);
    }

    /**
     * List All Actions
     *
     * <p>This will be the entire list of actions taken on your account, so it will be quite large. As with any large
     * collection returned by the API, the results will be paginated with only 20 on each page by default.
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
     * Retrieve an Existing Action
     *
     * <p>To retrieve a specific action object, send a GET request to `/v2/actions/$ACTION_ID`.
     *
     * @param actionId A unique numeric ID that can be used to identify and reference an action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ActionsGetResponse> getWithResponseAsync(int actionId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), actionId, accept);
    }

    /**
     * Retrieve an Existing Action
     *
     * <p>To retrieve a specific action object, send a GET request to `/v2/actions/$ACTION_ID`.
     *
     * @param actionId A unique numeric ID that can be used to identify and reference an action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(int actionId) {
        return getWithResponseAsync(actionId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
