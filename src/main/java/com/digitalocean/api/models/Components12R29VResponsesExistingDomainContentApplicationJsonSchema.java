package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components12R29VResponsesExistingDomainContentApplicationJsonSchema model. */
@Fluent
public final class Components12R29VResponsesExistingDomainContentApplicationJsonSchema {
    /*
     * The domain property.
     */
    @JsonProperty(value = "domain")
    private Domain domain;

    /**
     * Get the domain property: The domain property.
     *
     * @return the domain value.
     */
    public Domain getDomain() {
        return this.domain;
    }

    /**
     * Set the domain property: The domain property.
     *
     * @param domain the domain value to set.
     * @return the Components12R29VResponsesExistingDomainContentApplicationJsonSchema object itself.
     */
    public Components12R29VResponsesExistingDomainContentApplicationJsonSchema setDomain(Domain domain) {
        this.domain = domain;
        return this;
    }
}
