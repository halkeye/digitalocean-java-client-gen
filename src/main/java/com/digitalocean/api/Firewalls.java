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
import com.digitalocean.api.models.FirewallsAddRulesResponse;
import com.digitalocean.api.models.FirewallsAddTagsResponse;
import com.digitalocean.api.models.FirewallsAssignDropletsResponse;
import com.digitalocean.api.models.FirewallsCreateResponse;
import com.digitalocean.api.models.FirewallsDeleteDropletsResponse;
import com.digitalocean.api.models.FirewallsDeleteResponse;
import com.digitalocean.api.models.FirewallsDeleteRulesResponse;
import com.digitalocean.api.models.FirewallsDeleteTagsResponse;
import com.digitalocean.api.models.FirewallsGetResponse;
import com.digitalocean.api.models.FirewallsListResponse;
import com.digitalocean.api.models.FirewallsUpdateResponse;
import com.digitalocean.api.models.Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Firewalls.
 */
public final class Firewalls {
    /**
     * The proxy service used to perform REST calls.
     */
    private final FirewallsService service;

    /**
     * The service client containing this operation class.
     */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Firewalls.
     * 
     * @param client the instance of the service client containing this operation class.
     */
     Firewalls(GeneratedClient client) {
        this.service = RestProxy.create(FirewallsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientFirewalls to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientFirew")
    private interface FirewallsService {
        @Get("/v2/firewalls")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<FirewallsListResponse> list(@HostParam("$host") String host, @QueryParam("per_page") Integer perPage, @QueryParam("page") Integer page, @HeaderParam("Accept") String accept);

        @Post("/v2/firewalls")
        @ExpectedResponses({202, 400, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<FirewallsCreateResponse> create(@HostParam("$host") String host, @BodyParam("application/json") Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);

        @Get("/v2/firewalls/{firewall_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<FirewallsGetResponse> get(@HostParam("$host") String host, @PathParam("firewall_id") UUID firewallId, @HeaderParam("Accept") String accept);

        @Put("/v2/firewalls/{firewall_id}")
        @ExpectedResponses({200, 400, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<FirewallsUpdateResponse> update(@HostParam("$host") String host, @PathParam("firewall_id") UUID firewallId, @BodyParam("application/json") Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);

        @Delete("/v2/firewalls/{firewall_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<FirewallsDeleteResponse> delete(@HostParam("$host") String host, @PathParam("firewall_id") UUID firewallId, @HeaderParam("Accept") String accept);

        @Post("/v2/firewalls/{firewall_id}/droplets")
        @ExpectedResponses({204, 400, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<FirewallsAssignDropletsResponse> assignDroplets(@HostParam("$host") String host, @PathParam("firewall_id") UUID firewallId, @BodyParam("application/json") Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);

        @Delete("/v2/firewalls/{firewall_id}/droplets")
        @ExpectedResponses({204, 400, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<FirewallsDeleteDropletsResponse> deleteDroplets(@HostParam("$host") String host, @PathParam("firewall_id") UUID firewallId, @BodyParam("application/json") Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);

        @Post("/v2/firewalls/{firewall_id}/tags")
        @ExpectedResponses({204, 400, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<FirewallsAddTagsResponse> addTags(@HostParam("$host") String host, @PathParam("firewall_id") UUID firewallId, @BodyParam("application/json") PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);

        @Delete("/v2/firewalls/{firewall_id}/tags")
        @ExpectedResponses({204, 400, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<FirewallsDeleteTagsResponse> deleteTags(@HostParam("$host") String host, @PathParam("firewall_id") UUID firewallId, @BodyParam("application/json") PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);

        @Post("/v2/firewalls/{firewall_id}/rules")
        @ExpectedResponses({204, 400, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<FirewallsAddRulesResponse> addRules(@HostParam("$host") String host, @PathParam("firewall_id") UUID firewallId, @BodyParam("application/json") Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);

        @Delete("/v2/firewalls/{firewall_id}/rules")
        @ExpectedResponses({204, 400, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<FirewallsDeleteRulesResponse> deleteRules(@HostParam("$host") String host, @PathParam("firewall_id") UUID firewallId, @BodyParam("application/json") Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);
    }

    /**
     * List All Firewalls
     * 
     * To list all of the firewalls available on your account, send a GET request to `/v2/firewalls`.
     * 
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallsListResponse> listWithResponseAsync(Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), perPage, page, accept);
    }

    /**
     * List All Firewalls
     * 
     * To list all of the firewalls available on your account, send a GET request to `/v2/firewalls`.
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
     * Create a New Firewall
     * 
     * To create a new firewall, send a POST request to `/v2/firewalls`. The request
     * must contain at least one inbound or outbound access rule.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallsCreateResponse> createWithResponseAsync(Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), body, accept);
    }

    /**
     * Create a New Firewall
     * 
     * To create a new firewall, send a POST request to `/v2/firewalls`. The request
     * must contain at least one inbound or outbound access rule.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAsync(Paths1Cscq1HV2FirewallsPostRequestbodyContentApplicationJsonSchema body) {
        return createWithResponseAsync(body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve an Existing Firewall
     * 
     * To show information about an existing firewall, send a GET request to `/v2/firewalls/$FIREWALL_ID`.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallsGetResponse> getWithResponseAsync(UUID firewallId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), firewallId, accept);
    }

    /**
     * Retrieve an Existing Firewall
     * 
     * To show information about an existing firewall, send a GET request to `/v2/firewalls/$FIREWALL_ID`.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(UUID firewallId) {
        return getWithResponseAsync(firewallId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Update a Firewall
     * 
     * To update the configuration of an existing firewall, send a PUT request to
     * `/v2/firewalls/$FIREWALL_ID`. The request should contain a full representation
     * of the firewall including existing attributes. **Note that any attributes that
     * are not provided will be reset to their default values.**.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallsUpdateResponse> updateWithResponseAsync(UUID firewallId, Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.update(this.client.getHost(), firewallId, body, accept);
    }

    /**
     * Update a Firewall
     * 
     * To update the configuration of an existing firewall, send a PUT request to
     * `/v2/firewalls/$FIREWALL_ID`. The request should contain a full representation
     * of the firewall including existing attributes. **Note that any attributes that
     * are not provided will be reset to their default values.**.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateAsync(UUID firewallId, Paths1F4Kj8QV2FirewallsFirewallIdPutRequestbodyContentApplicationJsonSchema body) {
        return updateWithResponseAsync(firewallId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Delete a Firewall
     * 
     * To delete a firewall send a DELETE request to `/v2/firewalls/$FIREWALL_ID`.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallsDeleteResponse> deleteWithResponseAsync(UUID firewallId) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), firewallId, accept);
    }

    /**
     * Delete a Firewall
     * 
     * To delete a firewall send a DELETE request to `/v2/firewalls/$FIREWALL_ID`.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync(UUID firewallId) {
        return deleteWithResponseAsync(firewallId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Add Droplets to a Firewall
     * 
     * To assign a Droplet to a firewall, send a POST request to
     * `/v2/firewalls/$FIREWALL_ID/droplets`. In the body of the request, there
     * should be a `droplet_ids` attribute containing a list of Droplet IDs.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallsAssignDropletsResponse> assignDropletsWithResponseAsync(UUID firewallId, Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.assignDroplets(this.client.getHost(), firewallId, body, accept);
    }

    /**
     * Add Droplets to a Firewall
     * 
     * To assign a Droplet to a firewall, send a POST request to
     * `/v2/firewalls/$FIREWALL_ID/droplets`. In the body of the request, there
     * should be a `droplet_ids` attribute containing a list of Droplet IDs.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> assignDropletsAsync(UUID firewallId, Paths1Mxnz3IV2FirewallsFirewallIdDropletsPostRequestbodyContentApplicationJsonSchema body) {
        return assignDropletsWithResponseAsync(firewallId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Remove Droplets from a Firewall
     * 
     * To remove a Droplet from a firewall, send a DELETE request to
     * `/v2/firewalls/$FIREWALL_ID/droplets`. In the body of the request, there should
     * be a `droplet_ids` attribute containing a list of Droplet IDs.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallsDeleteDropletsResponse> deleteDropletsWithResponseAsync(UUID firewallId, Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.deleteDroplets(this.client.getHost(), firewallId, body, accept);
    }

    /**
     * Remove Droplets from a Firewall
     * 
     * To remove a Droplet from a firewall, send a DELETE request to
     * `/v2/firewalls/$FIREWALL_ID/droplets`. In the body of the request, there should
     * be a `droplet_ids` attribute containing a list of Droplet IDs.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteDropletsAsync(UUID firewallId, Paths10XlofV2FirewallsFirewallIdDropletsDeleteRequestbodyContentApplicationJsonSchema body) {
        return deleteDropletsWithResponseAsync(firewallId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Add Tags to a Firewall
     * 
     * To assign a tag representing a group of Droplets to a firewall, send a POST
     * request to `/v2/firewalls/$FIREWALL_ID/tags`. In the body of the request,
     * there should be a `tags` attribute containing a list of tag names.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallsAddTagsResponse> addTagsWithResponseAsync(UUID firewallId, PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.addTags(this.client.getHost(), firewallId, body, accept);
    }

    /**
     * Add Tags to a Firewall
     * 
     * To assign a tag representing a group of Droplets to a firewall, send a POST
     * request to `/v2/firewalls/$FIREWALL_ID/tags`. In the body of the request,
     * there should be a `tags` attribute containing a list of tag names.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> addTagsAsync(UUID firewallId, PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema body) {
        return addTagsWithResponseAsync(firewallId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Remove Tags from a Firewall
     * 
     * To remove a tag representing a group of Droplets from a firewall, send a
     * DELETE request to `/v2/firewalls/$FIREWALL_ID/tags`. In the body of the
     * request, there should be a `tags` attribute containing a list of tag names.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallsDeleteTagsResponse> deleteTagsWithResponseAsync(UUID firewallId, PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.deleteTags(this.client.getHost(), firewallId, body, accept);
    }

    /**
     * Remove Tags from a Firewall
     * 
     * To remove a tag representing a group of Droplets from a firewall, send a
     * DELETE request to `/v2/firewalls/$FIREWALL_ID/tags`. In the body of the
     * request, there should be a `tags` attribute containing a list of tag names.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteTagsAsync(UUID firewallId, PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema body) {
        return deleteTagsWithResponseAsync(firewallId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Add Rules to a Firewall
     * 
     * To add additional access rules to a firewall, send a POST request to
     * `/v2/firewalls/$FIREWALL_ID/rules`. The body of the request may include an
     * inbound_rules and/or outbound_rules attribute containing an array of rules to
     * be added.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallsAddRulesResponse> addRulesWithResponseAsync(UUID firewallId, Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.addRules(this.client.getHost(), firewallId, body, accept);
    }

    /**
     * Add Rules to a Firewall
     * 
     * To add additional access rules to a firewall, send a POST request to
     * `/v2/firewalls/$FIREWALL_ID/rules`. The body of the request may include an
     * inbound_rules and/or outbound_rules attribute containing an array of rules to
     * be added.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> addRulesAsync(UUID firewallId, Paths1Utqt8MV2FirewallsFirewallIdRulesPostRequestbodyContentApplicationJsonSchema body) {
        return addRulesWithResponseAsync(firewallId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Remove Rules from a Firewall
     * 
     * To remove access rules from a firewall, send a DELETE request to
     * `/v2/firewalls/$FIREWALL_ID/rules`. The body of the request may include an
     * `inbound_rules` and/or `outbound_rules` attribute containing an array of rules
     * to be removed.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallsDeleteRulesResponse> deleteRulesWithResponseAsync(UUID firewallId, Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.deleteRules(this.client.getHost(), firewallId, body, accept);
    }

    /**
     * Remove Rules from a Firewall
     * 
     * To remove access rules from a firewall, send a DELETE request to
     * `/v2/firewalls/$FIREWALL_ID/rules`. The body of the request may include an
     * `inbound_rules` and/or `outbound_rules` attribute containing an array of rules
     * to be removed.
     * 
     * No response body will be sent back, but the response code will indicate
     * success. Specifically, the response code will be a 204, which means that the
     * action was successful with no returned body data.
     * 
     * @param firewallId A unique ID that can be used to identify and reference a firewall.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteRulesAsync(UUID firewallId, Paths17ErwptV2FirewallsFirewallIdRulesDeleteRequestbodyContentApplicationJsonSchema body) {
        return deleteRulesWithResponseAsync(firewallId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}
}
