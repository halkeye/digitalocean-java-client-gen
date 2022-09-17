package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components12H0Ks2ResponsesCreateDomainResponseContentApplicationJsonSchema model. */
@Fluent
public final class Components12H0Ks2ResponsesCreateDomainResponseContentApplicationJsonSchema {
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
     * @return the Components12H0Ks2ResponsesCreateDomainResponseContentApplicationJsonSchema object itself.
     */
    public Components12H0Ks2ResponsesCreateDomainResponseContentApplicationJsonSchema setDomain(Domain domain) {
        this.domain = domain;
        return this;
    }
}
