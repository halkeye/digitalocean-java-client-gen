package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsMr31FwResponsesCaContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsMr31FwResponsesCaContentApplicationJsonSchema {
    /*
     * The ca property.
     */
    @JsonProperty(value = "ca", required = true)
    private Ca ca;

    /**
     * Get the ca property: The ca property.
     *
     * @return the ca value.
     */
    public Ca getCa() {
        return this.ca;
    }

    /**
     * Set the ca property: The ca property.
     *
     * @param ca the ca value to set.
     * @return the ComponentsMr31FwResponsesCaContentApplicationJsonSchema object itself.
     */
    public ComponentsMr31FwResponsesCaContentApplicationJsonSchema setCa(Ca ca) {
        this.ca = ca;
        return this;
    }
}
