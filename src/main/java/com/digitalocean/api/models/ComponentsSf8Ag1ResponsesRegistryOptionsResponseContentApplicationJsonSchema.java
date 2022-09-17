package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsSf8Ag1ResponsesRegistryOptionsResponseContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsSf8Ag1ResponsesRegistryOptionsResponseContentApplicationJsonSchema {
    /*
     * The options property.
     */
    @JsonProperty(value = "options")
    private RegistryOptionsResponseApplicationJsonProperties options;

    /**
     * Get the options property: The options property.
     *
     * @return the options value.
     */
    public RegistryOptionsResponseApplicationJsonProperties getOptions() {
        return this.options;
    }

    /**
     * Set the options property: The options property.
     *
     * @param options the options value to set.
     * @return the ComponentsSf8Ag1ResponsesRegistryOptionsResponseContentApplicationJsonSchema object itself.
     */
    public ComponentsSf8Ag1ResponsesRegistryOptionsResponseContentApplicationJsonSchema setOptions(
            RegistryOptionsResponseApplicationJsonProperties options) {
        this.options = options;
        return this;
    }
}
