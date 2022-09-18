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
import com.azure.core.util.Context;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.ReservedIPsActionsGetResponse;
import com.digitalocean.api.models.ReservedIPsActionsListResponse;
import com.digitalocean.api.models.ReservedIPsActionsPostResponse;
import java.util.Objects;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ReservedIPsActions.
 */
public final class ReservedIPsActions {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ReservedIPsActionsService service;

    /**
     * The service client containing this operation class.
     */
    private final GeneratedClient client;

    /**
     * Initializes an instance of ReservedIPsActions.
     * 
     * @param client the instance of the service client containing this operation class.
     */
     ReservedIPsActions(GeneratedClient client) {
        this.service = RestProxy.create(ReservedIPsActionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientReservedIPsActions to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientReser")
    private interface ReservedIPsActionsService {
        @Get("/v2/reserved_ips/{reserved_ip}/actions")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ReservedIPsActionsListResponse> list(@HostParam("$host") String host, @PathParam("reserved_ip") String reservedIp, @HeaderParam("Accept") String accept);

        @Post("/v2/reserved_ips/{reserved_ip}/actions")
        @ExpectedResponses({201, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ReservedIPsActionsPostResponse> post(@HostParam("$host") String host, @PathParam("reserved_ip") String reservedIp, @BodyParam("application/json") Object body, @HeaderParam("Accept") String accept);

        @Get("/v2/reserved_ips/{reserved_ip}/actions/{action_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ReservedIPsActionsGetResponse> get(@HostParam("$host") String host, @PathParam("reserved_ip") String reservedIp, @PathParam("action_id") int actionId, @HeaderParam("Accept") String accept);
    }

    /**
     * List All Actions for a Reserved IP
     * 
     * To retrieve all actions that have been executed on a reserved IP, send a GET request to `/v2/reserved_ips/$RESERVED_IP/actions`.
     * 
     * @param reservedIp A reserved IP address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ReservedIPsActionsListResponse> listWithResponseAsync(String reservedIp) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), reservedIp, accept);
    }

    /**
     * List All Actions for a Reserved IP
     * 
     * To retrieve all actions that have been executed on a reserved IP, send a GET request to `/v2/reserved_ips/$RESERVED_IP/actions`.
     * 
     * @param reservedIp A reserved IP address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync(String reservedIp) {
        return listWithResponseAsync(reservedIp)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Initiate a Reserved IP Action
     * 
     * To initiate an action on a reserved IP send a POST request to
     * `/v2/reserved_ips/$RESERVED_IP/actions`. In the JSON body to the request,
     * set the `type` attribute to on of the supported action types:
     * 
     * | Action     | Details
     * |------------|--------
     * | `assign`   | Assigns a reserved IP to a Droplet
     * | `unassign` | Unassign a reserved IP from a Droplet.
     * 
     * @param reservedIp A reserved IP address.
     * @param body The `type` attribute set in the request body will specify the action that
     * will be taken on the reserved IP.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ReservedIPsActionsPostResponse> postWithResponseAsync(String reservedIp, Object body) {
        final String accept = "application/json";
        return service.post(this.client.getHost(), reservedIp, body, accept);
    }

    /**
     * Initiate a Reserved IP Action
     * 
     * To initiate an action on a reserved IP send a POST request to
     * `/v2/reserved_ips/$RESERVED_IP/actions`. In the JSON body to the request,
     * set the `type` attribute to on of the supported action types:
     * 
     * | Action     | Details
     * |------------|--------
     * | `assign`   | Assigns a reserved IP to a Droplet
     * | `unassign` | Unassign a reserved IP from a Droplet.
     * 
     * @param reservedIp A reserved IP address.
     * @param body The `type` attribute set in the request body will specify the action that
     * will be taken on the reserved IP.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> postAsync(String reservedIp, Object body) {
        return postWithResponseAsync(reservedIp, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve an Existing Reserved IP Action
     * 
     * To retrieve the status of a reserved IP action, send a GET request to `/v2/reserved_ips/$RESERVED_IP/actions/$ACTION_ID`.
     * 
     * @param reservedIp A reserved IP address.
     * @param actionId A unique numeric ID that can be used to identify and reference an action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ReservedIPsActionsGetResponse> getWithResponseAsync(String reservedIp, int actionId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), reservedIp, actionId, accept);
    }

    /**
     * Retrieve an Existing Reserved IP Action
     * 
     * To retrieve the status of a reserved IP action, send a GET request to `/v2/reserved_ips/$RESERVED_IP/actions/$ACTION_ID`.
     * 
     * @param reservedIp A reserved IP address.
     * @param actionId A unique numeric ID that can be used to identify and reference an action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(String reservedIp, int actionId) {
        return getWithResponseAsync(reservedIp, actionId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}
}
