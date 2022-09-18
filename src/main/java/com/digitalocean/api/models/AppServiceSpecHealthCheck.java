package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The AppServiceSpecHealthCheck model.
 */
@Fluent
public final class AppServiceSpecHealthCheck {
    /*
     * The number of failed health checks before considered unhealthy.
     */
    @JsonProperty(value = "failure_threshold")
    private Integer failureThreshold;

    /*
     * The port on which the health check will be performed. If not set, the health check will be performed on the
     * component's http_port.
     */
    @JsonProperty(value = "port")
    private Long port;

    /*
     * The route path used for the HTTP health check ping. If not set, the HTTP health check will be disabled and a TCP
     * health check used instead.
     */
    @JsonProperty(value = "http_path")
    private String httpPath;

    /*
     * The number of seconds to wait before beginning health checks.
     */
    @JsonProperty(value = "initial_delay_seconds")
    private Integer initialDelaySeconds;

    /*
     * The number of seconds to wait between health checks.
     */
    @JsonProperty(value = "period_seconds")
    private Integer periodSeconds;

    /*
     * The number of successful health checks before considered healthy.
     */
    @JsonProperty(value = "success_threshold")
    private Integer successThreshold;

    /*
     * The number of seconds after which the check times out.
     */
    @JsonProperty(value = "timeout_seconds")
    private Integer timeoutSeconds;

    /**
     * Get the failureThreshold property: The number of failed health checks before considered unhealthy.
     * 
     * @return the failureThreshold value.
     */
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    /**
     * Set the failureThreshold property: The number of failed health checks before considered unhealthy.
     * 
     * @param failureThreshold the failureThreshold value to set.
     * @return the AppServiceSpecHealthCheck object itself.
     */
    public AppServiceSpecHealthCheck setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * Get the port property: The port on which the health check will be performed. If not set, the health check will
     * be performed on the component's http_port.
     * 
     * @return the port value.
     */
    public Long getPort() {
        return this.port;
    }

    /**
     * Set the port property: The port on which the health check will be performed. If not set, the health check will
     * be performed on the component's http_port.
     * 
     * @param port the port value to set.
     * @return the AppServiceSpecHealthCheck object itself.
     */
    public AppServiceSpecHealthCheck setPort(Long port) {
        this.port = port;
        return this;
    }

    /**
     * Get the httpPath property: The route path used for the HTTP health check ping. If not set, the HTTP health check
     * will be disabled and a TCP health check used instead.
     * 
     * @return the httpPath value.
     */
    public String getHttpPath() {
        return this.httpPath;
    }

    /**
     * Set the httpPath property: The route path used for the HTTP health check ping. If not set, the HTTP health check
     * will be disabled and a TCP health check used instead.
     * 
     * @param httpPath the httpPath value to set.
     * @return the AppServiceSpecHealthCheck object itself.
     */
    public AppServiceSpecHealthCheck setHttpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }

    /**
     * Get the initialDelaySeconds property: The number of seconds to wait before beginning health checks.
     * 
     * @return the initialDelaySeconds value.
     */
    public Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    /**
     * Set the initialDelaySeconds property: The number of seconds to wait before beginning health checks.
     * 
     * @param initialDelaySeconds the initialDelaySeconds value to set.
     * @return the AppServiceSpecHealthCheck object itself.
     */
    public AppServiceSpecHealthCheck setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    /**
     * Get the periodSeconds property: The number of seconds to wait between health checks.
     * 
     * @return the periodSeconds value.
     */
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    /**
     * Set the periodSeconds property: The number of seconds to wait between health checks.
     * 
     * @param periodSeconds the periodSeconds value to set.
     * @return the AppServiceSpecHealthCheck object itself.
     */
    public AppServiceSpecHealthCheck setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    /**
     * Get the successThreshold property: The number of successful health checks before considered healthy.
     * 
     * @return the successThreshold value.
     */
    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }

    /**
     * Set the successThreshold property: The number of successful health checks before considered healthy.
     * 
     * @param successThreshold the successThreshold value to set.
     * @return the AppServiceSpecHealthCheck object itself.
     */
    public AppServiceSpecHealthCheck setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    /**
     * Get the timeoutSeconds property: The number of seconds after which the check times out.
     * 
     * @return the timeoutSeconds value.
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * Set the timeoutSeconds property: The number of seconds after which the check times out.
     * 
     * @param timeoutSeconds the timeoutSeconds value to set.
     * @return the AppServiceSpecHealthCheck object itself.
     */
    public AppServiceSpecHealthCheck setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
}
