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
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.LoadBalancersAddDropletsResponse;
import com.digitalocean.api.models.LoadBalancersAddForwardingRulesResponse;
import com.digitalocean.api.models.LoadBalancersCreateResponse;
import com.digitalocean.api.models.LoadBalancersDeleteResponse;
import com.digitalocean.api.models.LoadBalancersGetResponse;
import com.digitalocean.api.models.LoadBalancersListResponse;
import com.digitalocean.api.models.LoadBalancersRemoveDropletsResponse;
import com.digitalocean.api.models.LoadBalancersRemoveForwardingRulesResponse;
import com.digitalocean.api.models.LoadBalancersUpdateResponse;
import com.digitalocean.api.models.Paths18B54PqV2LoadBalancersLbIdForwardingRulesDeleteRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.PathsOwv6DtV2LoadBalancersLbIdDropletsDeleteRequestbodyContentApplicationJsonSchema;
import java.util.Objects;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in LoadBalancers.
 */
public final class LoadBalancers {
    /**
     * The proxy service used to perform REST calls.
     */
    private final LoadBalancersService service;

    /**
     * The service client containing this operation class.
     */
    private final GeneratedClient client;

    /**
     * Initializes an instance of LoadBalancers.
     * 
     * @param client the instance of the service client containing this operation class.
     */
     LoadBalancers(GeneratedClient client) {
        this.service = RestProxy.create(LoadBalancersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientLoadBalancers to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientLoadB")
    private interface LoadBalancersService {
        @Post("/v2/load_balancers")
        @ExpectedResponses({202, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<LoadBalancersCreateResponse> create(@HostParam("$host") String host, @BodyParam("application/json") Object body, @HeaderParam("Accept") String accept);

        @Get("/v2/load_balancers")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<LoadBalancersListResponse> list(@HostParam("$host") String host, @QueryParam("per_page") Integer perPage, @QueryParam("page") Integer page, @HeaderParam("Accept") String accept);

        @Get("/v2/load_balancers/{lb_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<LoadBalancersGetResponse> get(@HostParam("$host") String host, @PathParam("lb_id") String lbId, @HeaderParam("Accept") String accept);

        @Put("/v2/load_balancers/{lb_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<LoadBalancersUpdateResponse> update(@HostParam("$host") String host, @PathParam("lb_id") String lbId, @BodyParam("application/json") Object body, @HeaderParam("Accept") String accept);

        @Delete("/v2/load_balancers/{lb_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<LoadBalancersDeleteResponse> delete(@HostParam("$host") String host, @PathParam("lb_id") String lbId, @HeaderParam("Accept") String accept);

        @Post("/v2/load_balancers/{lb_id}/droplets")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<LoadBalancersAddDropletsResponse> addDroplets(@HostParam("$host") String host, @PathParam("lb_id") String lbId, @BodyParam("application/json") PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);

        @Delete("/v2/load_balancers/{lb_id}/droplets")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<LoadBalancersRemoveDropletsResponse> removeDroplets(@HostParam("$host") String host, @PathParam("lb_id") String lbId, @BodyParam("application/json") PathsOwv6DtV2LoadBalancersLbIdDropletsDeleteRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);

        @Post("/v2/load_balancers/{lb_id}/forwarding_rules")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<LoadBalancersAddForwardingRulesResponse> addForwardingRules(@HostParam("$host") String host, @PathParam("lb_id") String lbId, @BodyParam("application/json") PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);

        @Delete("/v2/load_balancers/{lb_id}/forwarding_rules")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<LoadBalancersRemoveForwardingRulesResponse> removeForwardingRules(@HostParam("$host") String host, @PathParam("lb_id") String lbId, @BodyParam("application/json") Paths18B54PqV2LoadBalancersLbIdForwardingRulesDeleteRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);
    }

    /**
     * Create a New Load Balancer
     * 
     * To create a new load balancer instance, send a POST request to
     * `/v2/load_balancers`.
     * 
     * You can specify the Droplets that will sit behind the load balancer using one
     * of two methods:
     * 
     * * Set `droplet_ids` to a list of specific Droplet IDs.
     * * Set `tag` to the name of a tag. All Droplets with this tag applied will be
     *   assigned to the load balancer. Additional Droplets will be automatically
     *   assigned as they are tagged.
     * 
     * These methods are mutually exclusive.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancersCreateResponse> createWithResponseAsync(Object body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), body, accept);
    }

    /**
     * Create a New Load Balancer
     * 
     * To create a new load balancer instance, send a POST request to
     * `/v2/load_balancers`.
     * 
     * You can specify the Droplets that will sit behind the load balancer using one
     * of two methods:
     * 
     * * Set `droplet_ids` to a list of specific Droplet IDs.
     * * Set `tag` to the name of a tag. All Droplets with this tag applied will be
     *   assigned to the load balancer. Additional Droplets will be automatically
     *   assigned as they are tagged.
     * 
     * These methods are mutually exclusive.
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
     * List All Load Balancers
     * 
     * To list all of the load balancer instances on your account, send a GET request
     * to `/v2/load_balancers`.
     * 
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancersListResponse> listWithResponseAsync(Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), perPage, page, accept);
    }

    /**
     * List All Load Balancers
     * 
     * To list all of the load balancer instances on your account, send a GET request
     * to `/v2/load_balancers`.
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
        return listWithResponseAsync(perPage, page)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve an Existing Load Balancer
     * 
     * To show information about a load balancer instance, send a GET request to
     * `/v2/load_balancers/$LOAD_BALANCER_ID`.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancersGetResponse> getWithResponseAsync(String lbId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), lbId, accept);
    }

    /**
     * Retrieve an Existing Load Balancer
     * 
     * To show information about a load balancer instance, send a GET request to
     * `/v2/load_balancers/$LOAD_BALANCER_ID`.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(String lbId) {
        return getWithResponseAsync(lbId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Update a Load Balancer
     * 
     * To update a load balancer's settings, send a PUT request to
     * `/v2/load_balancers/$LOAD_BALANCER_ID`. The request should contain a full
     * representation of the load balancer including existing attributes. It may
     * contain _one of_ the `droplets_ids` or `tag` attributes as they are mutually
     * exclusive. **Note that any attribute that is not provided will be reset to its
     * default value.**.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancersUpdateResponse> updateWithResponseAsync(String lbId, Object body) {
        final String accept = "application/json";
        return service.update(this.client.getHost(), lbId, body, accept);
    }

    /**
     * Update a Load Balancer
     * 
     * To update a load balancer's settings, send a PUT request to
     * `/v2/load_balancers/$LOAD_BALANCER_ID`. The request should contain a full
     * representation of the load balancer including existing attributes. It may
     * contain _one of_ the `droplets_ids` or `tag` attributes as they are mutually
     * exclusive. **Note that any attribute that is not provided will be reset to its
     * default value.**.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateAsync(String lbId, Object body) {
        return updateWithResponseAsync(lbId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Delete a Load Balancer
     * 
     * To delete a load balancer instance, disassociating any Droplets assigned to it
     * and removing it from your account, send a DELETE request to
     * `/v2/load_balancers/$LOAD_BALANCER_ID`.
     * 
     * A successful request will receive a 204 status code with no body in response.
     * This indicates that the request was processed successfully.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancersDeleteResponse> deleteWithResponseAsync(String lbId) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), lbId, accept);
    }

    /**
     * Delete a Load Balancer
     * 
     * To delete a load balancer instance, disassociating any Droplets assigned to it
     * and removing it from your account, send a DELETE request to
     * `/v2/load_balancers/$LOAD_BALANCER_ID`.
     * 
     * A successful request will receive a 204 status code with no body in response.
     * This indicates that the request was processed successfully.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync(String lbId) {
        return deleteWithResponseAsync(lbId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Add Droplets to a Load Balancer
     * 
     * To assign a Droplet to a load balancer instance, send a POST request to
     * `/v2/load_balancers/$LOAD_BALANCER_ID/droplets`. In the body of the request,
     * there should be a `droplet_ids` attribute containing a list of Droplet IDs.
     * Individual Droplets can not be added to a load balancer configured with a
     * Droplet tag. Attempting to do so will result in a "422 Unprocessable Entity"
     * response from the API.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancersAddDropletsResponse> addDropletsWithResponseAsync(String lbId, PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.addDroplets(this.client.getHost(), lbId, body, accept);
    }

    /**
     * Add Droplets to a Load Balancer
     * 
     * To assign a Droplet to a load balancer instance, send a POST request to
     * `/v2/load_balancers/$LOAD_BALANCER_ID/droplets`. In the body of the request,
     * there should be a `droplet_ids` attribute containing a list of Droplet IDs.
     * Individual Droplets can not be added to a load balancer configured with a
     * Droplet tag. Attempting to do so will result in a "422 Unprocessable Entity"
     * response from the API.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> addDropletsAsync(String lbId, PathsNeiuahV2LoadBalancersLbIdDropletsPostRequestbodyContentApplicationJsonSchema body) {
        return addDropletsWithResponseAsync(lbId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Remove Droplets from a Load Balancer
     * 
     * To remove a Droplet from a load balancer instance, send a DELETE request to
     * `/v2/load_balancers/$LOAD_BALANCER_ID/droplets`. In the body of the request,
     * there should be a `droplet_ids` attribute containing a list of Droplet IDs.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancersRemoveDropletsResponse> removeDropletsWithResponseAsync(String lbId, PathsOwv6DtV2LoadBalancersLbIdDropletsDeleteRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.removeDroplets(this.client.getHost(), lbId, body, accept);
    }

    /**
     * Remove Droplets from a Load Balancer
     * 
     * To remove a Droplet from a load balancer instance, send a DELETE request to
     * `/v2/load_balancers/$LOAD_BALANCER_ID/droplets`. In the body of the request,
     * there should be a `droplet_ids` attribute containing a list of Droplet IDs.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> removeDropletsAsync(String lbId, PathsOwv6DtV2LoadBalancersLbIdDropletsDeleteRequestbodyContentApplicationJsonSchema body) {
        return removeDropletsWithResponseAsync(lbId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Add Forwarding Rules to a Load Balancer
     * 
     * To add an additional forwarding rule to a load balancer instance, send a POST
     * request to `/v2/load_balancers/$LOAD_BALANCER_ID/forwarding_rules`. In the body
     * of the request, there should be a `forwarding_rules` attribute containing an
     * array of rules to be added.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancersAddForwardingRulesResponse> addForwardingRulesWithResponseAsync(String lbId, PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.addForwardingRules(this.client.getHost(), lbId, body, accept);
    }

    /**
     * Add Forwarding Rules to a Load Balancer
     * 
     * To add an additional forwarding rule to a load balancer instance, send a POST
     * request to `/v2/load_balancers/$LOAD_BALANCER_ID/forwarding_rules`. In the body
     * of the request, there should be a `forwarding_rules` attribute containing an
     * array of rules to be added.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> addForwardingRulesAsync(String lbId, PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema body) {
        return addForwardingRulesWithResponseAsync(lbId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Remove Forwarding Rules from a Load Balancer
     * 
     * To remove forwarding rules from a load balancer instance, send a DELETE
     * request to `/v2/load_balancers/$LOAD_BALANCER_ID/forwarding_rules`. In the
     * body of the request, there should be a `forwarding_rules` attribute containing
     * an array of rules to be removed.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancersRemoveForwardingRulesResponse> removeForwardingRulesWithResponseAsync(String lbId, Paths18B54PqV2LoadBalancersLbIdForwardingRulesDeleteRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.removeForwardingRules(this.client.getHost(), lbId, body, accept);
    }

    /**
     * Remove Forwarding Rules from a Load Balancer
     * 
     * To remove forwarding rules from a load balancer instance, send a DELETE
     * request to `/v2/load_balancers/$LOAD_BALANCER_ID/forwarding_rules`. In the
     * body of the request, there should be a `forwarding_rules` attribute containing
     * an array of rules to be removed.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param lbId A unique identifier for a load balancer.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> removeForwardingRulesAsync(String lbId, Paths18B54PqV2LoadBalancersLbIdForwardingRulesDeleteRequestbodyContentApplicationJsonSchema body) {
        return removeForwardingRulesWithResponseAsync(lbId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}
}
