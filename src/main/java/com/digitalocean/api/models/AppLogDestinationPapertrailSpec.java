package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Papertrail configuration. */
@Fluent
public final class AppLogDestinationPapertrailSpec {
    /*
     * Papertrail syslog endpoint.
     */
    @JsonProperty(value = "endpoint", required = true)
    private String endpoint;

    /**
     * Get the endpoint property: Papertrail syslog endpoint.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: Papertrail syslog endpoint.
     *
     * @param endpoint the endpoint value to set.
     * @return the AppLogDestinationPapertrailSpec object itself.
     */
    public AppLogDestinationPapertrailSpec setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
}
