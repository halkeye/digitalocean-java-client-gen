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
import com.digitalocean.api.models.CdnEndpoint;
import com.digitalocean.api.models.CdnsCreateEndpointResponse;
import com.digitalocean.api.models.CdnsDeleteEndpointResponse;
import com.digitalocean.api.models.CdnsGetEndpointResponse;
import com.digitalocean.api.models.CdnsListEndpointsResponse;
import com.digitalocean.api.models.CdnsPurgeCacheResponse;
import com.digitalocean.api.models.CdnsUpdateEndpointsResponse;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.PurgeCache;
import com.digitalocean.api.models.UpdateEndpoint;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Cdns. */
public final class Cdns {
    /** The proxy service used to perform REST calls. */
    private final CdnsService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Cdns.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Cdns(GeneratedClient client) {
        this.service = RestProxy.create(CdnsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientCdns to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientCdns")
    private interface CdnsService {
        @Get("/v2/cdn/endpoints")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<CdnsListEndpointsResponse> listEndpoints(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);

        @Post("/v2/cdn/endpoints")
        @ExpectedResponses({201, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<CdnsCreateEndpointResponse> createEndpoint(
                @HostParam("$host") String host,
                @BodyParam("application/json") CdnEndpoint body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/cdn/endpoints/{cdn_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<CdnsGetEndpointResponse> getEndpoint(
                @HostParam("$host") String host, @PathParam("cdn_id") UUID cdnId, @HeaderParam("Accept") String accept);

        @Put("/v2/cdn/endpoints/{cdn_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<CdnsUpdateEndpointsResponse> updateEndpoints(
                @HostParam("$host") String host,
                @PathParam("cdn_id") UUID cdnId,
                @BodyParam("application/json") UpdateEndpoint body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/cdn/endpoints/{cdn_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<CdnsDeleteEndpointResponse> deleteEndpoint(
                @HostParam("$host") String host, @PathParam("cdn_id") UUID cdnId, @HeaderParam("Accept") String accept);

        @Delete("/v2/cdn/endpoints/{cdn_id}/cache")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<CdnsPurgeCacheResponse> purgeCache(
                @HostParam("$host") String host,
                @PathParam("cdn_id") UUID cdnId,
                @BodyParam("application/json") PurgeCache body,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List All CDN Endpoints
     *
     * <p>To list all of the CDN endpoints available on your account, send a GET request to `/v2/cdn/endpoints`.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CdnsListEndpointsResponse> listEndpointsWithResponseAsync(Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.listEndpoints(this.client.getHost(), perPage, page, accept);
    }

    /**
     * List All CDN Endpoints
     *
     * <p>To list all of the CDN endpoints available on your account, send a GET request to `/v2/cdn/endpoints`.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listEndpointsAsync(Integer perPage, Integer page) {
        return listEndpointsWithResponseAsync(perPage, page).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a New CDN Endpoint
     *
     * <p>To create a new CDN endpoint, send a POST request to `/v2/cdn/endpoints`. The origin attribute must be set to
     * the fully qualified domain name (FQDN) of a DigitalOcean Space. Optionally, the TTL may be configured by setting
     * the `ttl` attribute.
     *
     * <p>A custom subdomain may be configured by specifying the `custom_domain` and `certificate_id` attributes.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CdnsCreateEndpointResponse> createEndpointWithResponseAsync(CdnEndpoint body) {
        final String accept = "application/json";
        return service.createEndpoint(this.client.getHost(), body, accept);
    }

    /**
     * Create a New CDN Endpoint
     *
     * <p>To create a new CDN endpoint, send a POST request to `/v2/cdn/endpoints`. The origin attribute must be set to
     * the fully qualified domain name (FQDN) of a DigitalOcean Space. Optionally, the TTL may be configured by setting
     * the `ttl` attribute.
     *
     * <p>A custom subdomain may be configured by specifying the `custom_domain` and `certificate_id` attributes.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createEndpointAsync(CdnEndpoint body) {
        return createEndpointWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing CDN Endpoint
     *
     * <p>To show information about an existing CDN endpoint, send a GET request to `/v2/cdn/endpoints/$ENDPOINT_ID`.
     *
     * @param cdnId A unique identifier for a CDN endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CdnsGetEndpointResponse> getEndpointWithResponseAsync(UUID cdnId) {
        final String accept = "application/json";
        return service.getEndpoint(this.client.getHost(), cdnId, accept);
    }

    /**
     * Retrieve an Existing CDN Endpoint
     *
     * <p>To show information about an existing CDN endpoint, send a GET request to `/v2/cdn/endpoints/$ENDPOINT_ID`.
     *
     * @param cdnId A unique identifier for a CDN endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getEndpointAsync(UUID cdnId) {
        return getEndpointWithResponseAsync(cdnId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update a CDN Endpoint
     *
     * <p>To update the TTL, certificate ID, or the FQDN of the custom subdomain for an existing CDN endpoint, send a
     * PUT request to `/v2/cdn/endpoints/$ENDPOINT_ID`.
     *
     * @param cdnId A unique identifier for a CDN endpoint.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CdnsUpdateEndpointsResponse> updateEndpointsWithResponseAsync(UUID cdnId, UpdateEndpoint body) {
        final String accept = "application/json";
        return service.updateEndpoints(this.client.getHost(), cdnId, body, accept);
    }

    /**
     * Update a CDN Endpoint
     *
     * <p>To update the TTL, certificate ID, or the FQDN of the custom subdomain for an existing CDN endpoint, send a
     * PUT request to `/v2/cdn/endpoints/$ENDPOINT_ID`.
     *
     * @param cdnId A unique identifier for a CDN endpoint.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateEndpointsAsync(UUID cdnId, UpdateEndpoint body) {
        return updateEndpointsWithResponseAsync(cdnId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete a CDN Endpoint
     *
     * <p>To delete a specific CDN endpoint, send a DELETE request to `/v2/cdn/endpoints/$ENDPOINT_ID`.
     *
     * <p>A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * @param cdnId A unique identifier for a CDN endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CdnsDeleteEndpointResponse> deleteEndpointWithResponseAsync(UUID cdnId) {
        final String accept = "application/json";
        return service.deleteEndpoint(this.client.getHost(), cdnId, accept);
    }

    /**
     * Delete a CDN Endpoint
     *
     * <p>To delete a specific CDN endpoint, send a DELETE request to `/v2/cdn/endpoints/$ENDPOINT_ID`.
     *
     * <p>A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * @param cdnId A unique identifier for a CDN endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteEndpointAsync(UUID cdnId) {
        return deleteEndpointWithResponseAsync(cdnId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Purge the Cache for an Existing CDN Endpoint
     *
     * <p>To purge cached content from a CDN endpoint, send a DELETE request to `/v2/cdn/endpoints/$ENDPOINT_ID/cache`.
     * The body of the request should include a `files` attribute containing a list of cached file paths to be purged. A
     * path may be for a single file or may contain a wildcard (`*`) to recursively purge all files under a directory.
     * When only a wildcard is provided, all cached files will be purged.
     *
     * @param cdnId A unique identifier for a CDN endpoint.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CdnsPurgeCacheResponse> purgeCacheWithResponseAsync(UUID cdnId, PurgeCache body) {
        final String accept = "application/json";
        return service.purgeCache(this.client.getHost(), cdnId, body, accept);
    }

    /**
     * Purge the Cache for an Existing CDN Endpoint
     *
     * <p>To purge cached content from a CDN endpoint, send a DELETE request to `/v2/cdn/endpoints/$ENDPOINT_ID/cache`.
     * The body of the request should include a `files` attribute containing a list of cached file paths to be purged. A
     * path may be for a single file or may contain a wildcard (`*`) to recursively purge all files under a directory.
     * When only a wildcard is provided, all cached files will be purged.
     *
     * @param cdnId A unique identifier for a CDN endpoint.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> purgeCacheAsync(UUID cdnId, PurgeCache body) {
        return purgeCacheWithResponseAsync(cdnId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
