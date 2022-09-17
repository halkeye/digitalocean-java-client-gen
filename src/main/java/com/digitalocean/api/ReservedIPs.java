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
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.ReservedIPsCreateResponse;
import com.digitalocean.api.models.ReservedIPsDeleteResponse;
import com.digitalocean.api.models.ReservedIPsGetResponse;
import com.digitalocean.api.models.ReservedIPsListResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ReservedIPs. */
public final class ReservedIPs {
    /** The proxy service used to perform REST calls. */
    private final ReservedIPsService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of ReservedIPs.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ReservedIPs(GeneratedClient client) {
        this.service =
                RestProxy.create(ReservedIPsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientReservedIPs to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientReser")
    private interface ReservedIPsService {
        @Get("/v2/reserved_ips")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ReservedIPsListResponse> list(@HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Post("/v2/reserved_ips")
        @ExpectedResponses({202, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ReservedIPsCreateResponse> create(
                @HostParam("$host") String host,
                @BodyParam("application/json") Object body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/reserved_ips/{reserved_ip}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ReservedIPsGetResponse> get(
                @HostParam("$host") String host,
                @PathParam("reserved_ip") String reservedIp,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/reserved_ips/{reserved_ip}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ReservedIPsDeleteResponse> delete(
                @HostParam("$host") String host,
                @PathParam("reserved_ip") String reservedIp,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List All Reserved IPs
     *
     * <p>To list all of the reserved IPs available on your account, send a GET request to `/v2/reserved_ips`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ReservedIPsListResponse> listWithResponseAsync() {
        final String accept = "application/json";
        return service.list(this.client.getHost(), accept);
    }

    /**
     * List All Reserved IPs
     *
     * <p>To list all of the reserved IPs available on your account, send a GET request to `/v2/reserved_ips`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync() {
        return listWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a New Reserved IP
     *
     * <p>On creation, a reserved IP must be either assigned to a Droplet or reserved to a region. * To create a new
     * reserved IP assigned to a Droplet, send a POST request to `/v2/reserved_ips` with the `droplet_id` attribute.
     *
     * <p>* To create a new reserved IP reserved to a region, send a POST request to `/v2/reserved_ips` with the
     * `region` attribute.
     *
     * <p>**Note**: In addition to the standard rate limiting, only 12 reserved IPs may be created per 60 seconds.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ReservedIPsCreateResponse> createWithResponseAsync(Object body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), body, accept);
    }

    /**
     * Create a New Reserved IP
     *
     * <p>On creation, a reserved IP must be either assigned to a Droplet or reserved to a region. * To create a new
     * reserved IP assigned to a Droplet, send a POST request to `/v2/reserved_ips` with the `droplet_id` attribute.
     *
     * <p>* To create a new reserved IP reserved to a region, send a POST request to `/v2/reserved_ips` with the
     * `region` attribute.
     *
     * <p>**Note**: In addition to the standard rate limiting, only 12 reserved IPs may be created per 60 seconds.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAsync(Object body) {
        return createWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Reserved IP
     *
     * <p>To show information about a reserved IP, send a GET request to `/v2/reserved_ips/$RESERVED_IP_ADDR`.
     *
     * @param reservedIp A reserved IP address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ReservedIPsGetResponse> getWithResponseAsync(String reservedIp) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), reservedIp, accept);
    }

    /**
     * Retrieve an Existing Reserved IP
     *
     * <p>To show information about a reserved IP, send a GET request to `/v2/reserved_ips/$RESERVED_IP_ADDR`.
     *
     * @param reservedIp A reserved IP address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(String reservedIp) {
        return getWithResponseAsync(reservedIp).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete a Reserved IPs
     *
     * <p>To delete a reserved IP and remove it from your account, send a DELETE request to
     * `/v2/reserved_ips/$RESERVED_IP_ADDR`.
     *
     * <p>A successful request will receive a 204 status code with no body in response. This indicates that the request
     * was processed successfully.
     *
     * @param reservedIp A reserved IP address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ReservedIPsDeleteResponse> deleteWithResponseAsync(String reservedIp) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), reservedIp, accept);
    }

    /**
     * Delete a Reserved IPs
     *
     * <p>To delete a reserved IP and remove it from your account, send a DELETE request to
     * `/v2/reserved_ips/$RESERVED_IP_ADDR`.
     *
     * <p>A successful request will receive a 204 status code with no body in response. This indicates that the request
     * was processed successfully.
     *
     * @param reservedIp A reserved IP address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync(String reservedIp) {
        return deleteWithResponseAsync(reservedIp).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
