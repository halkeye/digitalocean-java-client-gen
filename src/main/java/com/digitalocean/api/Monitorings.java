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
import com.digitalocean.api.models.AlertPolicyRequest;
import com.digitalocean.api.models.Enum78;
import com.digitalocean.api.models.Enum79;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.MonitoringsCreateAlertPolicyResponse;
import com.digitalocean.api.models.MonitoringsDeleteAlertPolicyResponse;
import com.digitalocean.api.models.MonitoringsGetAlertPolicyResponse;
import com.digitalocean.api.models.MonitoringsGetDropletBandwidthMetricsResponse;
import com.digitalocean.api.models.MonitoringsGetDropletCpuMetricsResponse;
import com.digitalocean.api.models.MonitoringsGetDropletFilesystemFreeMetricsResponse;
import com.digitalocean.api.models.MonitoringsGetDropletFilesystemSizeMetricsResponse;
import com.digitalocean.api.models.MonitoringsGetDropletLoad15MetricsResponse;
import com.digitalocean.api.models.MonitoringsGetDropletLoad1MetricsResponse;
import com.digitalocean.api.models.MonitoringsGetDropletLoad5MetricsResponse;
import com.digitalocean.api.models.MonitoringsGetDropletMemoryAvailableMetricsResponse;
import com.digitalocean.api.models.MonitoringsGetDropletMemoryCachedMetricsResponse;
import com.digitalocean.api.models.MonitoringsGetDropletMemoryFreeMetricsResponse;
import com.digitalocean.api.models.MonitoringsGetDropletMemoryTotalMetricsResponse;
import com.digitalocean.api.models.MonitoringsListAlertPolicyResponse;
import com.digitalocean.api.models.MonitoringsUpdateAlertPolicyResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Monitorings. */
public final class Monitorings {
    /** The proxy service used to perform REST calls. */
    private final MonitoringsService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Monitorings.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Monitorings(GeneratedClient client) {
        this.service =
                RestProxy.create(MonitoringsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientMonitorings to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientMonit")
    private interface MonitoringsService {
        @Get("/v2/monitoring/alerts")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsListAlertPolicyResponse> listAlertPolicy(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);

        @Post("/v2/monitoring/alerts")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsCreateAlertPolicyResponse> createAlertPolicy(
                @HostParam("$host") String host,
                @BodyParam("application/json") AlertPolicyRequest body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/monitoring/alerts/{alert_uuid}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsGetAlertPolicyResponse> getAlertPolicy(
                @HostParam("$host") String host,
                @PathParam("alert_uuid") String alertUuid,
                @HeaderParam("Accept") String accept);

        @Put("/v2/monitoring/alerts/{alert_uuid}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsUpdateAlertPolicyResponse> updateAlertPolicy(
                @HostParam("$host") String host,
                @PathParam("alert_uuid") String alertUuid,
                @BodyParam("application/json") AlertPolicyRequest body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/monitoring/alerts/{alert_uuid}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsDeleteAlertPolicyResponse> deleteAlertPolicy(
                @HostParam("$host") String host,
                @PathParam("alert_uuid") String alertUuid,
                @HeaderParam("Accept") String accept);

        @Get("/v2/monitoring/metrics/droplet/bandwidth")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsGetDropletBandwidthMetricsResponse> getDropletBandwidthMetrics(
                @HostParam("$host") String host,
                @QueryParam("host_id") String hostId,
                @QueryParam("interface") Enum78 interfaceParameter,
                @QueryParam("direction") Enum79 direction,
                @QueryParam("start") String start,
                @QueryParam("end") String end,
                @HeaderParam("Accept") String accept);

        @Get("/v2/monitoring/metrics/droplet/cpu")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsGetDropletCpuMetricsResponse> getDropletCpuMetrics(
                @HostParam("$host") String host,
                @QueryParam("host_id") String hostId,
                @QueryParam("start") String start,
                @QueryParam("end") String end,
                @HeaderParam("Accept") String accept);

        @Get("/v2/monitoring/metrics/droplet/filesystem_free")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsGetDropletFilesystemFreeMetricsResponse> getDropletFilesystemFreeMetrics(
                @HostParam("$host") String host,
                @QueryParam("host_id") String hostId,
                @QueryParam("start") String start,
                @QueryParam("end") String end,
                @HeaderParam("Accept") String accept);

        @Get("/v2/monitoring/metrics/droplet/filesystem_size")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsGetDropletFilesystemSizeMetricsResponse> getDropletFilesystemSizeMetrics(
                @HostParam("$host") String host,
                @QueryParam("host_id") String hostId,
                @QueryParam("start") String start,
                @QueryParam("end") String end,
                @HeaderParam("Accept") String accept);

        @Get("/v2/monitoring/metrics/droplet/load_1")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsGetDropletLoad1MetricsResponse> getDropletLoad1Metrics(
                @HostParam("$host") String host,
                @QueryParam("host_id") String hostId,
                @QueryParam("start") String start,
                @QueryParam("end") String end,
                @HeaderParam("Accept") String accept);

        @Get("/v2/monitoring/metrics/droplet/load_5")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsGetDropletLoad5MetricsResponse> getDropletLoad5Metrics(
                @HostParam("$host") String host,
                @QueryParam("host_id") String hostId,
                @QueryParam("start") String start,
                @QueryParam("end") String end,
                @HeaderParam("Accept") String accept);

        @Get("/v2/monitoring/metrics/droplet/load_15")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsGetDropletLoad15MetricsResponse> getDropletLoad15Metrics(
                @HostParam("$host") String host,
                @QueryParam("host_id") String hostId,
                @QueryParam("start") String start,
                @QueryParam("end") String end,
                @HeaderParam("Accept") String accept);

        @Get("/v2/monitoring/metrics/droplet/memory_cached")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsGetDropletMemoryCachedMetricsResponse> getDropletMemoryCachedMetrics(
                @HostParam("$host") String host,
                @QueryParam("host_id") String hostId,
                @QueryParam("start") String start,
                @QueryParam("end") String end,
                @HeaderParam("Accept") String accept);

        @Get("/v2/monitoring/metrics/droplet/memory_free")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsGetDropletMemoryFreeMetricsResponse> getDropletMemoryFreeMetrics(
                @HostParam("$host") String host,
                @QueryParam("host_id") String hostId,
                @QueryParam("start") String start,
                @QueryParam("end") String end,
                @HeaderParam("Accept") String accept);

        @Get("/v2/monitoring/metrics/droplet/memory_total")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsGetDropletMemoryTotalMetricsResponse> getDropletMemoryTotalMetrics(
                @HostParam("$host") String host,
                @QueryParam("host_id") String hostId,
                @QueryParam("start") String start,
                @QueryParam("end") String end,
                @HeaderParam("Accept") String accept);

        @Get("/v2/monitoring/metrics/droplet/memory_available")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<MonitoringsGetDropletMemoryAvailableMetricsResponse> getDropletMemoryAvailableMetrics(
                @HostParam("$host") String host,
                @QueryParam("host_id") String hostId,
                @QueryParam("start") String start,
                @QueryParam("end") String end,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List Alert Policies
     *
     * <p>Returns all alert policies that are configured for the given account. To List all alert policies, send a GET
     * request to `/v2/monitoring/alerts`.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsListAlertPolicyResponse> listAlertPolicyWithResponseAsync(Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.listAlertPolicy(this.client.getHost(), perPage, page, accept);
    }

    /**
     * List Alert Policies
     *
     * <p>Returns all alert policies that are configured for the given account. To List all alert policies, send a GET
     * request to `/v2/monitoring/alerts`.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAlertPolicyAsync(Integer perPage, Integer page) {
        return listAlertPolicyWithResponseAsync(perPage, page).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create Alert Policy
     *
     * <p>To create a new alert, send a POST request to `/v2/monitoring/alerts`.
     *
     * @param body The `type` field dictates what type of entity that the alert policy applies to and hence what type of
     *     entity is passed in the `entities` array. If both the `tags` array and `entities` array are empty the alert
     *     policy applies to all entities of the relevant type that are owned by the user account. Otherwise the
     *     following table shows the valid entity types for each type of alert policy:
     *     <p>Type | Description | Valid Entity Type -----|-------------|--------------------
     *     `v1/insights/droplet/memory_utilization_percent` | alert on the percent of memory utilization | Droplet ID
     *     `v1/insights/droplet/disk_read` | alert on the rate of disk read I/O in MBps | Droplet ID
     *     `v1/insights/droplet/load_5` | alert on the 5 minute load average | Droplet ID `v1/insights/droplet/load_15`
     *     | alert on the 15 minute load average | Droplet ID `v1/insights/droplet/disk_utilization_percent` | alert on
     *     the percent of disk utilization | Droplet ID `v1/insights/droplet/cpu` | alert on the percent of CPU
     *     utilization | Droplet ID `v1/insights/droplet/disk_write` | alert on the rate of disk write I/O in MBps |
     *     Droplet ID `v1/insights/droplet/public_outbound_bandwidth` | alert on the rate of public outbound bandwidth
     *     in Mbps | Droplet ID `v1/insights/droplet/public_inbound_bandwidth` | alert on the rate of public inbound
     *     bandwidth in Mbps | Droplet ID `v1/insights/droplet/private_outbound_bandwidth` | alert on the rate of
     *     private outbound bandwidth in Mbps | Droplet ID `v1/insights/droplet/private_inbound_bandwidth` | alert on
     *     the rate of private inbound bandwidth in Mbps | Droplet ID `v1/insights/droplet/load_1` | alert on the 1
     *     minute load average | Droplet ID `v1/insights/lbaas/avg_cpu_utilization_percent`|alert on the percent of CPU
     *     utilization|load balancer ID `v1/insights/lbaas/connection_utilization_percent`|alert on the percent of
     *     connection utilization|load balancer ID `v1/insights/lbaas/droplet_health`|alert on Droplet health status
     *     changes|load balancer ID `v1/insights/lbaas/tls_connections_per_second_utilization_percent`|alert on the
     *     percent of TLS connections per second utilization|load balancer ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsCreateAlertPolicyResponse> createAlertPolicyWithResponseAsync(AlertPolicyRequest body) {
        final String accept = "application/json";
        return service.createAlertPolicy(this.client.getHost(), body, accept);
    }

    /**
     * Create Alert Policy
     *
     * <p>To create a new alert, send a POST request to `/v2/monitoring/alerts`.
     *
     * @param body The `type` field dictates what type of entity that the alert policy applies to and hence what type of
     *     entity is passed in the `entities` array. If both the `tags` array and `entities` array are empty the alert
     *     policy applies to all entities of the relevant type that are owned by the user account. Otherwise the
     *     following table shows the valid entity types for each type of alert policy:
     *     <p>Type | Description | Valid Entity Type -----|-------------|--------------------
     *     `v1/insights/droplet/memory_utilization_percent` | alert on the percent of memory utilization | Droplet ID
     *     `v1/insights/droplet/disk_read` | alert on the rate of disk read I/O in MBps | Droplet ID
     *     `v1/insights/droplet/load_5` | alert on the 5 minute load average | Droplet ID `v1/insights/droplet/load_15`
     *     | alert on the 15 minute load average | Droplet ID `v1/insights/droplet/disk_utilization_percent` | alert on
     *     the percent of disk utilization | Droplet ID `v1/insights/droplet/cpu` | alert on the percent of CPU
     *     utilization | Droplet ID `v1/insights/droplet/disk_write` | alert on the rate of disk write I/O in MBps |
     *     Droplet ID `v1/insights/droplet/public_outbound_bandwidth` | alert on the rate of public outbound bandwidth
     *     in Mbps | Droplet ID `v1/insights/droplet/public_inbound_bandwidth` | alert on the rate of public inbound
     *     bandwidth in Mbps | Droplet ID `v1/insights/droplet/private_outbound_bandwidth` | alert on the rate of
     *     private outbound bandwidth in Mbps | Droplet ID `v1/insights/droplet/private_inbound_bandwidth` | alert on
     *     the rate of private inbound bandwidth in Mbps | Droplet ID `v1/insights/droplet/load_1` | alert on the 1
     *     minute load average | Droplet ID `v1/insights/lbaas/avg_cpu_utilization_percent`|alert on the percent of CPU
     *     utilization|load balancer ID `v1/insights/lbaas/connection_utilization_percent`|alert on the percent of
     *     connection utilization|load balancer ID `v1/insights/lbaas/droplet_health`|alert on Droplet health status
     *     changes|load balancer ID `v1/insights/lbaas/tls_connections_per_second_utilization_percent`|alert on the
     *     percent of TLS connections per second utilization|load balancer ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAlertPolicyAsync(AlertPolicyRequest body) {
        return createAlertPolicyWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Alert Policy
     *
     * <p>To retrieve a given alert policy, send a GET request to `/v2/monitoring/alerts/{alert_uuid}`.
     *
     * @param alertUuid A unique identifier for an alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsGetAlertPolicyResponse> getAlertPolicyWithResponseAsync(String alertUuid) {
        final String accept = "application/json";
        return service.getAlertPolicy(this.client.getHost(), alertUuid, accept);
    }

    /**
     * Retrieve an Existing Alert Policy
     *
     * <p>To retrieve a given alert policy, send a GET request to `/v2/monitoring/alerts/{alert_uuid}`.
     *
     * @param alertUuid A unique identifier for an alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAlertPolicyAsync(String alertUuid) {
        return getAlertPolicyWithResponseAsync(alertUuid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update an Alert Policy
     *
     * <p>To update en existing policy, send a PUT request to `v2/monitoring/alerts/{alert_uuid}`.
     *
     * @param alertUuid A unique identifier for an alert policy.
     * @param body The `type` field dictates what type of entity that the alert policy applies to and hence what type of
     *     entity is passed in the `entities` array. If both the `tags` array and `entities` array are empty the alert
     *     policy applies to all entities of the relevant type that are owned by the user account. Otherwise the
     *     following table shows the valid entity types for each type of alert policy:
     *     <p>Type | Description | Valid Entity Type -----|-------------|--------------------
     *     `v1/insights/droplet/memory_utilization_percent` | alert on the percent of memory utilization | Droplet ID
     *     `v1/insights/droplet/disk_read` | alert on the rate of disk read I/O in MBps | Droplet ID
     *     `v1/insights/droplet/load_5` | alert on the 5 minute load average | Droplet ID `v1/insights/droplet/load_15`
     *     | alert on the 15 minute load average | Droplet ID `v1/insights/droplet/disk_utilization_percent` | alert on
     *     the percent of disk utilization | Droplet ID `v1/insights/droplet/cpu` | alert on the percent of CPU
     *     utilization | Droplet ID `v1/insights/droplet/disk_write` | alert on the rate of disk write I/O in MBps |
     *     Droplet ID `v1/insights/droplet/public_outbound_bandwidth` | alert on the rate of public outbound bandwidth
     *     in Mbps | Droplet ID `v1/insights/droplet/public_inbound_bandwidth` | alert on the rate of public inbound
     *     bandwidth in Mbps | Droplet ID `v1/insights/droplet/private_outbound_bandwidth` | alert on the rate of
     *     private outbound bandwidth in Mbps | Droplet ID `v1/insights/droplet/private_inbound_bandwidth` | alert on
     *     the rate of private inbound bandwidth in Mbps | Droplet ID `v1/insights/droplet/load_1` | alert on the 1
     *     minute load average | Droplet ID `v1/insights/lbaas/avg_cpu_utilization_percent`|alert on the percent of CPU
     *     utilization|load balancer ID `v1/insights/lbaas/connection_utilization_percent`|alert on the percent of
     *     connection utilization|load balancer ID `v1/insights/lbaas/droplet_health`|alert on Droplet health status
     *     changes|load balancer ID `v1/insights/lbaas/tls_connections_per_second_utilization_percent`|alert on the
     *     percent of TLS connections per second utilization|load balancer ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsUpdateAlertPolicyResponse> updateAlertPolicyWithResponseAsync(
            String alertUuid, AlertPolicyRequest body) {
        final String accept = "application/json";
        return service.updateAlertPolicy(this.client.getHost(), alertUuid, body, accept);
    }

    /**
     * Update an Alert Policy
     *
     * <p>To update en existing policy, send a PUT request to `v2/monitoring/alerts/{alert_uuid}`.
     *
     * @param alertUuid A unique identifier for an alert policy.
     * @param body The `type` field dictates what type of entity that the alert policy applies to and hence what type of
     *     entity is passed in the `entities` array. If both the `tags` array and `entities` array are empty the alert
     *     policy applies to all entities of the relevant type that are owned by the user account. Otherwise the
     *     following table shows the valid entity types for each type of alert policy:
     *     <p>Type | Description | Valid Entity Type -----|-------------|--------------------
     *     `v1/insights/droplet/memory_utilization_percent` | alert on the percent of memory utilization | Droplet ID
     *     `v1/insights/droplet/disk_read` | alert on the rate of disk read I/O in MBps | Droplet ID
     *     `v1/insights/droplet/load_5` | alert on the 5 minute load average | Droplet ID `v1/insights/droplet/load_15`
     *     | alert on the 15 minute load average | Droplet ID `v1/insights/droplet/disk_utilization_percent` | alert on
     *     the percent of disk utilization | Droplet ID `v1/insights/droplet/cpu` | alert on the percent of CPU
     *     utilization | Droplet ID `v1/insights/droplet/disk_write` | alert on the rate of disk write I/O in MBps |
     *     Droplet ID `v1/insights/droplet/public_outbound_bandwidth` | alert on the rate of public outbound bandwidth
     *     in Mbps | Droplet ID `v1/insights/droplet/public_inbound_bandwidth` | alert on the rate of public inbound
     *     bandwidth in Mbps | Droplet ID `v1/insights/droplet/private_outbound_bandwidth` | alert on the rate of
     *     private outbound bandwidth in Mbps | Droplet ID `v1/insights/droplet/private_inbound_bandwidth` | alert on
     *     the rate of private inbound bandwidth in Mbps | Droplet ID `v1/insights/droplet/load_1` | alert on the 1
     *     minute load average | Droplet ID `v1/insights/lbaas/avg_cpu_utilization_percent`|alert on the percent of CPU
     *     utilization|load balancer ID `v1/insights/lbaas/connection_utilization_percent`|alert on the percent of
     *     connection utilization|load balancer ID `v1/insights/lbaas/droplet_health`|alert on Droplet health status
     *     changes|load balancer ID `v1/insights/lbaas/tls_connections_per_second_utilization_percent`|alert on the
     *     percent of TLS connections per second utilization|load balancer ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateAlertPolicyAsync(String alertUuid, AlertPolicyRequest body) {
        return updateAlertPolicyWithResponseAsync(alertUuid, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete an Alert Policy
     *
     * <p>To delete an alert policy, send a DELETE request to `/v2/monitoring/alerts/{alert_uuid}`.
     *
     * @param alertUuid A unique identifier for an alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsDeleteAlertPolicyResponse> deleteAlertPolicyWithResponseAsync(String alertUuid) {
        final String accept = "application/json";
        return service.deleteAlertPolicy(this.client.getHost(), alertUuid, accept);
    }

    /**
     * Delete an Alert Policy
     *
     * <p>To delete an alert policy, send a DELETE request to `/v2/monitoring/alerts/{alert_uuid}`.
     *
     * @param alertUuid A unique identifier for an alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAlertPolicyAsync(String alertUuid) {
        return deleteAlertPolicyWithResponseAsync(alertUuid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Droplet Bandwidth Metrics
     *
     * <p>To retrieve bandwidth metrics for a given Droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/bandwidth`. Use the `interface` query parameter to specify if the results should
     * be for the `private` or `public` interface. Use the `direction` query parameter to specify if the results should
     * be for `inbound` or `outbound` traffic.
     *
     * @param hostId The droplet ID.
     * @param interfaceParameter The network interface.
     * @param direction The traffic direction.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsGetDropletBandwidthMetricsResponse> getDropletBandwidthMetricsWithResponseAsync(
            String hostId, Enum78 interfaceParameter, Enum79 direction, String start, String end) {
        final String accept = "application/json";
        return service.getDropletBandwidthMetrics(
                this.client.getHost(), hostId, interfaceParameter, direction, start, end, accept);
    }

    /**
     * Get Droplet Bandwidth Metrics
     *
     * <p>To retrieve bandwidth metrics for a given Droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/bandwidth`. Use the `interface` query parameter to specify if the results should
     * be for the `private` or `public` interface. Use the `direction` query parameter to specify if the results should
     * be for `inbound` or `outbound` traffic.
     *
     * @param hostId The droplet ID.
     * @param interfaceParameter The network interface.
     * @param direction The traffic direction.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDropletBandwidthMetricsAsync(
            String hostId, Enum78 interfaceParameter, Enum79 direction, String start, String end) {
        return getDropletBandwidthMetricsWithResponseAsync(hostId, interfaceParameter, direction, start, end)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Droplet CPU Metrics
     *
     * <p>To retrieve CPU metrics for a given droplet, send a GET request to `/v2/monitoring/metrics/droplet/cpu`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsGetDropletCpuMetricsResponse> getDropletCpuMetricsWithResponseAsync(
            String hostId, String start, String end) {
        final String accept = "application/json";
        return service.getDropletCpuMetrics(this.client.getHost(), hostId, start, end, accept);
    }

    /**
     * Get Droplet CPU Metrics
     *
     * <p>To retrieve CPU metrics for a given droplet, send a GET request to `/v2/monitoring/metrics/droplet/cpu`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDropletCpuMetricsAsync(String hostId, String start, String end) {
        return getDropletCpuMetricsWithResponseAsync(hostId, start, end)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Droplet Filesystem Free Metrics
     *
     * <p>To retrieve filesystem free metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/filesystem_free`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsGetDropletFilesystemFreeMetricsResponse> getDropletFilesystemFreeMetricsWithResponseAsync(
            String hostId, String start, String end) {
        final String accept = "application/json";
        return service.getDropletFilesystemFreeMetrics(this.client.getHost(), hostId, start, end, accept);
    }

    /**
     * Get Droplet Filesystem Free Metrics
     *
     * <p>To retrieve filesystem free metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/filesystem_free`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDropletFilesystemFreeMetricsAsync(String hostId, String start, String end) {
        return getDropletFilesystemFreeMetricsWithResponseAsync(hostId, start, end)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Droplet Filesystem Size Metrics
     *
     * <p>To retrieve filesystem size metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/filesystem_size`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsGetDropletFilesystemSizeMetricsResponse> getDropletFilesystemSizeMetricsWithResponseAsync(
            String hostId, String start, String end) {
        final String accept = "application/json";
        return service.getDropletFilesystemSizeMetrics(this.client.getHost(), hostId, start, end, accept);
    }

    /**
     * Get Droplet Filesystem Size Metrics
     *
     * <p>To retrieve filesystem size metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/filesystem_size`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDropletFilesystemSizeMetricsAsync(String hostId, String start, String end) {
        return getDropletFilesystemSizeMetricsWithResponseAsync(hostId, start, end)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Droplet Load1 Metrics
     *
     * <p>To retrieve 1 minute load average metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/load_1`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsGetDropletLoad1MetricsResponse> getDropletLoad1MetricsWithResponseAsync(
            String hostId, String start, String end) {
        final String accept = "application/json";
        return service.getDropletLoad1Metrics(this.client.getHost(), hostId, start, end, accept);
    }

    /**
     * Get Droplet Load1 Metrics
     *
     * <p>To retrieve 1 minute load average metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/load_1`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDropletLoad1MetricsAsync(String hostId, String start, String end) {
        return getDropletLoad1MetricsWithResponseAsync(hostId, start, end)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Droplet Load5 Metrics
     *
     * <p>To retrieve 5 minute load average metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/load_5`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsGetDropletLoad5MetricsResponse> getDropletLoad5MetricsWithResponseAsync(
            String hostId, String start, String end) {
        final String accept = "application/json";
        return service.getDropletLoad5Metrics(this.client.getHost(), hostId, start, end, accept);
    }

    /**
     * Get Droplet Load5 Metrics
     *
     * <p>To retrieve 5 minute load average metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/load_5`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDropletLoad5MetricsAsync(String hostId, String start, String end) {
        return getDropletLoad5MetricsWithResponseAsync(hostId, start, end)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Droplet Load15 Metrics
     *
     * <p>To retrieve 15 minute load average metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/load_15`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsGetDropletLoad15MetricsResponse> getDropletLoad15MetricsWithResponseAsync(
            String hostId, String start, String end) {
        final String accept = "application/json";
        return service.getDropletLoad15Metrics(this.client.getHost(), hostId, start, end, accept);
    }

    /**
     * Get Droplet Load15 Metrics
     *
     * <p>To retrieve 15 minute load average metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/load_15`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDropletLoad15MetricsAsync(String hostId, String start, String end) {
        return getDropletLoad15MetricsWithResponseAsync(hostId, start, end)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Droplet Cached Memory Metrics
     *
     * <p>To retrieve cached memory metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/memory_cached`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsGetDropletMemoryCachedMetricsResponse> getDropletMemoryCachedMetricsWithResponseAsync(
            String hostId, String start, String end) {
        final String accept = "application/json";
        return service.getDropletMemoryCachedMetrics(this.client.getHost(), hostId, start, end, accept);
    }

    /**
     * Get Droplet Cached Memory Metrics
     *
     * <p>To retrieve cached memory metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/memory_cached`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDropletMemoryCachedMetricsAsync(String hostId, String start, String end) {
        return getDropletMemoryCachedMetricsWithResponseAsync(hostId, start, end)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Droplet Free Memory Metrics
     *
     * <p>To retrieve free memory metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/memory_free`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsGetDropletMemoryFreeMetricsResponse> getDropletMemoryFreeMetricsWithResponseAsync(
            String hostId, String start, String end) {
        final String accept = "application/json";
        return service.getDropletMemoryFreeMetrics(this.client.getHost(), hostId, start, end, accept);
    }

    /**
     * Get Droplet Free Memory Metrics
     *
     * <p>To retrieve free memory metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/memory_free`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDropletMemoryFreeMetricsAsync(String hostId, String start, String end) {
        return getDropletMemoryFreeMetricsWithResponseAsync(hostId, start, end)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Droplet Total Memory Metrics
     *
     * <p>To retrieve total memory metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/memory_total`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsGetDropletMemoryTotalMetricsResponse> getDropletMemoryTotalMetricsWithResponseAsync(
            String hostId, String start, String end) {
        final String accept = "application/json";
        return service.getDropletMemoryTotalMetrics(this.client.getHost(), hostId, start, end, accept);
    }

    /**
     * Get Droplet Total Memory Metrics
     *
     * <p>To retrieve total memory metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/memory_total`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDropletMemoryTotalMetricsAsync(String hostId, String start, String end) {
        return getDropletMemoryTotalMetricsWithResponseAsync(hostId, start, end)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Droplet Available Memory Metrics
     *
     * <p>To retrieve available memory metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/memory_available`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MonitoringsGetDropletMemoryAvailableMetricsResponse> getDropletMemoryAvailableMetricsWithResponseAsync(
            String hostId, String start, String end) {
        final String accept = "application/json";
        return service.getDropletMemoryAvailableMetrics(this.client.getHost(), hostId, start, end, accept);
    }

    /**
     * Get Droplet Available Memory Metrics
     *
     * <p>To retrieve available memory metrics for a given droplet, send a GET request to
     * `/v2/monitoring/metrics/droplet/memory_available`.
     *
     * @param hostId The droplet ID.
     * @param start Timestamp to start metric window.
     * @param end Timestamp to end metric window.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDropletMemoryAvailableMetricsAsync(String hostId, String start, String end) {
        return getDropletMemoryAvailableMetricsWithResponseAsync(hostId, start, end)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
