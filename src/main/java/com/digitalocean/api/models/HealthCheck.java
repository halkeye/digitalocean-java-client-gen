package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object specifying health check settings for the load balancer. */
@Fluent
public final class HealthCheck {
    /*
     * The protocol used for health checks sent to the backend Droplets. The possible values are `http`, `https`, or
     * `tcp`.
     */
    @JsonProperty(value = "protocol")
    private HealthCheckProtocol protocol;

    /*
     * An integer representing the port on the backend Droplets on which the health check will attempt a connection.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * The path on the backend Droplets to which the load balancer instance will send a request.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * The number of seconds between between two consecutive health checks.
     */
    @JsonProperty(value = "check_interval_seconds")
    private Integer checkIntervalSeconds;

    /*
     * The number of seconds the load balancer instance will wait for a response until marking a health check as
     * failed.
     */
    @JsonProperty(value = "response_timeout_seconds")
    private Integer responseTimeoutSeconds;

    /*
     * The number of times a health check must fail for a backend Droplet to be marked "unhealthy" and be removed from
     * the pool.
     */
    @JsonProperty(value = "unhealthy_threshold")
    private Integer unhealthyThreshold;

    /*
     * The number of times a health check must pass for a backend Droplet to be marked "healthy" and be re-added to the
     * pool.
     */
    @JsonProperty(value = "healthy_threshold")
    private Integer healthyThreshold;

    /**
     * Get the protocol property: The protocol used for health checks sent to the backend Droplets. The possible values
     * are `http`, `https`, or `tcp`.
     *
     * @return the protocol value.
     */
    public HealthCheckProtocol getProtocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol used for health checks sent to the backend Droplets. The possible values
     * are `http`, `https`, or `tcp`.
     *
     * @param protocol the protocol value to set.
     * @return the HealthCheck object itself.
     */
    public HealthCheck setProtocol(HealthCheckProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the port property: An integer representing the port on the backend Droplets on which the health check will
     * attempt a connection.
     *
     * @return the port value.
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * Set the port property: An integer representing the port on the backend Droplets on which the health check will
     * attempt a connection.
     *
     * @param port the port value to set.
     * @return the HealthCheck object itself.
     */
    public HealthCheck setPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the path property: The path on the backend Droplets to which the load balancer instance will send a request.
     *
     * @return the path value.
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Set the path property: The path on the backend Droplets to which the load balancer instance will send a request.
     *
     * @param path the path value to set.
     * @return the HealthCheck object itself.
     */
    public HealthCheck setPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the checkIntervalSeconds property: The number of seconds between between two consecutive health checks.
     *
     * @return the checkIntervalSeconds value.
     */
    public Integer getCheckIntervalSeconds() {
        return this.checkIntervalSeconds;
    }

    /**
     * Set the checkIntervalSeconds property: The number of seconds between between two consecutive health checks.
     *
     * @param checkIntervalSeconds the checkIntervalSeconds value to set.
     * @return the HealthCheck object itself.
     */
    public HealthCheck setCheckIntervalSeconds(Integer checkIntervalSeconds) {
        this.checkIntervalSeconds = checkIntervalSeconds;
        return this;
    }

    /**
     * Get the responseTimeoutSeconds property: The number of seconds the load balancer instance will wait for a
     * response until marking a health check as failed.
     *
     * @return the responseTimeoutSeconds value.
     */
    public Integer getResponseTimeoutSeconds() {
        return this.responseTimeoutSeconds;
    }

    /**
     * Set the responseTimeoutSeconds property: The number of seconds the load balancer instance will wait for a
     * response until marking a health check as failed.
     *
     * @param responseTimeoutSeconds the responseTimeoutSeconds value to set.
     * @return the HealthCheck object itself.
     */
    public HealthCheck setResponseTimeoutSeconds(Integer responseTimeoutSeconds) {
        this.responseTimeoutSeconds = responseTimeoutSeconds;
        return this;
    }

    /**
     * Get the unhealthyThreshold property: The number of times a health check must fail for a backend Droplet to be
     * marked "unhealthy" and be removed from the pool.
     *
     * @return the unhealthyThreshold value.
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * Set the unhealthyThreshold property: The number of times a health check must fail for a backend Droplet to be
     * marked "unhealthy" and be removed from the pool.
     *
     * @param unhealthyThreshold the unhealthyThreshold value to set.
     * @return the HealthCheck object itself.
     */
    public HealthCheck setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    /**
     * Get the healthyThreshold property: The number of times a health check must pass for a backend Droplet to be
     * marked "healthy" and be re-added to the pool.
     *
     * @return the healthyThreshold value.
     */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * Set the healthyThreshold property: The number of times a health check must pass for a backend Droplet to be
     * marked "healthy" and be re-added to the pool.
     *
     * @param healthyThreshold the healthyThreshold value to set.
     * @return the HealthCheck object itself.
     */
    public HealthCheck setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
}
