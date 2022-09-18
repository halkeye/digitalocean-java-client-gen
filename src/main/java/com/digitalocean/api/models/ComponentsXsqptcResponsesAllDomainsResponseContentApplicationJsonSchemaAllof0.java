package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsXsqptcResponsesAllDomainsResponseContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class ComponentsXsqptcResponsesAllDomainsResponseContentApplicationJsonSchemaAllof0 {
    /*
     * Array of volumes.
     */
    @JsonProperty(value = "domains", required = true)
    private List<Domain> domains;

    /**
     * Get the domains property: Array of volumes.
     * 
     * @return the domains value.
     */
    public List<Domain> getDomains() {
        return this.domains;
    }

    /**
     * Set the domains property: Array of volumes.
     * 
     * @param domains the domains value to set.
     * @return the ComponentsXsqptcResponsesAllDomainsResponseContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsXsqptcResponsesAllDomainsResponseContentApplicationJsonSchemaAllof0 setDomains(List<Domain> domains) {
        this.domains = domains;
        return this;
    }
}
