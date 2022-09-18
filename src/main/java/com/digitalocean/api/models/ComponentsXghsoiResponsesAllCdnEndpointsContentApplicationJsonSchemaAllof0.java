package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsXghsoiResponsesAllCdnEndpointsContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class ComponentsXghsoiResponsesAllCdnEndpointsContentApplicationJsonSchemaAllof0 {
    /*
     * The endpoints property.
     */
    @JsonProperty(value = "endpoints")
    private List<CdnEndpoint> endpoints;

    /**
     * Get the endpoints property: The endpoints property.
     * 
     * @return the endpoints value.
     */
    public List<CdnEndpoint> getEndpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints property.
     * 
     * @param endpoints the endpoints value to set.
     * @return the ComponentsXghsoiResponsesAllCdnEndpointsContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsXghsoiResponsesAllCdnEndpointsContentApplicationJsonSchemaAllof0 setEndpoints(List<CdnEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
}
