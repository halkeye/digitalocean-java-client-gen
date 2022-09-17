package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsVd6C9CResponsesExistingEndpointContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsVd6C9CResponsesExistingEndpointContentApplicationJsonSchema {
    /*
     * The endpoint property.
     */
    @JsonProperty(value = "endpoint")
    private CdnEndpoint endpoint;

    /**
     * Get the endpoint property: The endpoint property.
     *
     * @return the endpoint value.
     */
    public CdnEndpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint property.
     *
     * @param endpoint the endpoint value to set.
     * @return the ComponentsVd6C9CResponsesExistingEndpointContentApplicationJsonSchema object itself.
     */
    public ComponentsVd6C9CResponsesExistingEndpointContentApplicationJsonSchema setEndpoint(CdnEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }
}
