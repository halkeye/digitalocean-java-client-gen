package com.digitalocean.api;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.Paths1853Y6RV2VpcsPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.Paths1NwapakV2VpcsVpcIdPatchRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.VpcsCreateResponse;
import com.digitalocean.api.models.VpcsDeleteResponse;
import com.digitalocean.api.models.VpcsGetResponse;
import com.digitalocean.api.models.VpcsListMembersResponse;
import com.digitalocean.api.models.VpcsListResponse;
import com.digitalocean.api.models.VpcsPatchResponse;
import com.digitalocean.api.models.VpcsUpdateResponse;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Vpcs. */
public final class Vpcs {
    /** The proxy service used to perform REST calls. */
    private final VpcsService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Vpcs.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Vpcs(GeneratedClient client) {
        this.service = RestProxy.create(VpcsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientVpcs to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientVpcs")
    private interface VpcsService {
        @Get("/v2/vpcs")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VpcsListResponse> list(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);

        @Post("/v2/vpcs")
        @ExpectedResponses({201, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VpcsCreateResponse> create(
                @HostParam("$host") String host,
                @BodyParam("application/json") Paths1853Y6RV2VpcsPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/vpcs/{vpc_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VpcsGetResponse> get(
                @HostParam("$host") String host, @PathParam("vpc_id") UUID vpcId, @HeaderParam("Accept") String accept);

        @Put("/v2/vpcs/{vpc_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VpcsUpdateResponse> update(
                @HostParam("$host") String host,
                @PathParam("vpc_id") UUID vpcId,
                @BodyParam("application/json") PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Patch("/v2/vpcs/{vpc_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VpcsPatchResponse> patch(
                @HostParam("$host") String host,
                @PathParam("vpc_id") UUID vpcId,
                @BodyParam("application/json") Paths1NwapakV2VpcsVpcIdPatchRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/vpcs/{vpc_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VpcsDeleteResponse> delete(
                @HostParam("$host") String host, @PathParam("vpc_id") UUID vpcId, @HeaderParam("Accept") String accept);

        @Get("/v2/vpcs/{vpc_id}/members")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VpcsListMembersResponse> listMembers(
                @HostParam("$host") String host,
                @PathParam("vpc_id") UUID vpcId,
                @QueryParam("resource_type") String resourceType,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List All VPCs
     *
     * <p>To list all of the VPCs on your account, send a GET request to `/v2/vpcs`.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpcsListResponse> listWithResponseAsync(Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), perPage, page, accept);
    }

    /**
     * List All VPCs
     *
     * <p>To list all of the VPCs on your account, send a GET request to `/v2/vpcs`.
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
     * Create a New VPC
     *
     * <p>To create a VPC, send a POST request to `/v2/vpcs` specifying the attributes in the table below in the JSON
     * body.
     *
     * <p>**Note:** If you do not currently have a VPC network in a specific datacenter region, the first one that you
     * create will be set as the default for that region. The default VPC for a region cannot be changed or deleted.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpcsCreateResponse> createWithResponseAsync(
            Paths1853Y6RV2VpcsPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), body, accept);
    }

    /**
     * Create a New VPC
     *
     * <p>To create a VPC, send a POST request to `/v2/vpcs` specifying the attributes in the table below in the JSON
     * body.
     *
     * <p>**Note:** If you do not currently have a VPC network in a specific datacenter region, the first one that you
     * create will be set as the default for that region. The default VPC for a region cannot be changed or deleted.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAsync(Paths1853Y6RV2VpcsPostRequestbodyContentApplicationJsonSchema body) {
        return createWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing VPC
     *
     * <p>To show information about an existing VPC, send a GET request to `/v2/vpcs/$VPC_ID`.
     *
     * @param vpcId A unique identifier for a VPC.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpcsGetResponse> getWithResponseAsync(UUID vpcId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), vpcId, accept);
    }

    /**
     * Retrieve an Existing VPC
     *
     * <p>To show information about an existing VPC, send a GET request to `/v2/vpcs/$VPC_ID`.
     *
     * @param vpcId A unique identifier for a VPC.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(UUID vpcId) {
        return getWithResponseAsync(vpcId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update a VPC
     *
     * <p>To update information about a VPC, send a PUT request to `/v2/vpcs/$VPC_ID`.
     *
     * @param vpcId A unique identifier for a VPC.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpcsUpdateResponse> updateWithResponseAsync(
            UUID vpcId, PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.update(this.client.getHost(), vpcId, body, accept);
    }

    /**
     * Update a VPC
     *
     * <p>To update information about a VPC, send a PUT request to `/v2/vpcs/$VPC_ID`.
     *
     * @param vpcId A unique identifier for a VPC.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateAsync(UUID vpcId, PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema body) {
        return updateWithResponseAsync(vpcId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Partially Update a VPC
     *
     * <p>To update a subset of information about a VPC, send a PATCH request to `/v2/vpcs/$VPC_ID`.
     *
     * @param vpcId A unique identifier for a VPC.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpcsPatchResponse> patchWithResponseAsync(
            UUID vpcId, Paths1NwapakV2VpcsVpcIdPatchRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.patch(this.client.getHost(), vpcId, body, accept);
    }

    /**
     * Partially Update a VPC
     *
     * <p>To update a subset of information about a VPC, send a PATCH request to `/v2/vpcs/$VPC_ID`.
     *
     * @param vpcId A unique identifier for a VPC.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> patchAsync(
            UUID vpcId, Paths1NwapakV2VpcsVpcIdPatchRequestbodyContentApplicationJsonSchema body) {
        return patchWithResponseAsync(vpcId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete a VPC
     *
     * <p>To delete a VPC, send a DELETE request to `/v2/vpcs/$VPC_ID`. A 204 status code with no body will be returned
     * in response to a successful request.
     *
     * <p>The default VPC for a region can not be deleted. Additionally, a VPC can only be deleted if it does not
     * contain any member resources. Attempting to delete a region's default VPC or a VPC that still has members will
     * result in a 403 Forbidden error response.
     *
     * @param vpcId A unique identifier for a VPC.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpcsDeleteResponse> deleteWithResponseAsync(UUID vpcId) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), vpcId, accept);
    }

    /**
     * Delete a VPC
     *
     * <p>To delete a VPC, send a DELETE request to `/v2/vpcs/$VPC_ID`. A 204 status code with no body will be returned
     * in response to a successful request.
     *
     * <p>The default VPC for a region can not be deleted. Additionally, a VPC can only be deleted if it does not
     * contain any member resources. Attempting to delete a region's default VPC or a VPC that still has members will
     * result in a 403 Forbidden error response.
     *
     * @param vpcId A unique identifier for a VPC.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync(UUID vpcId) {
        return deleteWithResponseAsync(vpcId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List the Member Resources of a VPC
     *
     * <p>To list all of the resources that are members of a VPC, send a GET request to `/v2/vpcs/$VPC_ID/members`.
     *
     * <p>To only list resources of a specific type that are members of the VPC, included a `resource_type` query
     * parameter. For example, to only list Droplets in the VPC, send a GET request to
     * `/v2/vpcs/$VPC_ID/members?resource_type=droplet`.
     *
     * @param vpcId A unique identifier for a VPC.
     * @param resourceType Used to filter VPC members by a resource type.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpcsListMembersResponse> listMembersWithResponseAsync(
            UUID vpcId, String resourceType, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.listMembers(this.client.getHost(), vpcId, resourceType, perPage, page, accept);
    }

    /**
     * List the Member Resources of a VPC
     *
     * <p>To list all of the resources that are members of a VPC, send a GET request to `/v2/vpcs/$VPC_ID/members`.
     *
     * <p>To only list resources of a specific type that are members of the VPC, included a `resource_type` query
     * parameter. For example, to only list Droplets in the VPC, send a GET request to
     * `/v2/vpcs/$VPC_ID/members?resource_type=droplet`.
     *
     * @param vpcId A unique identifier for a VPC.
     * @param resourceType Used to filter VPC members by a resource type.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listMembersAsync(UUID vpcId, String resourceType, Integer perPage, Integer page) {
        return listMembersWithResponseAsync(vpcId, resourceType, perPage, page)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
