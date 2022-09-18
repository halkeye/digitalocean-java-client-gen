package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * DataDog configuration.
 */
@Fluent
public final class AppLogDestinationDatadogSpec {
    /*
     * Datadog HTTP log intake endpoint.
     */
    @JsonProperty(value = "endpoint")
    private String endpoint;

    /*
     * Datadog API key.
     */
    @JsonProperty(value = "api_key", required = true)
    private String apiKey;

    /**
     * Get the endpoint property: Datadog HTTP log intake endpoint.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: Datadog HTTP log intake endpoint.
     * 
     * @param endpoint the endpoint value to set.
     * @return the AppLogDestinationDatadogSpec object itself.
     */
    public AppLogDestinationDatadogSpec setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the apiKey property: Datadog API key.
     * 
     * @return the apiKey value.
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey property: Datadog API key.
     * 
     * @param apiKey the apiKey value to set.
     * @return the AppLogDestinationDatadogSpec object itself.
     */
    public AppLogDestinationDatadogSpec setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}
