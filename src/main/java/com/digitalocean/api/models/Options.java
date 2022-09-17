package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Options model. */
@Fluent
public final class Options {
    /*
     * The options property.
     */
    @JsonProperty(value = "options")
    private OptionsOptions options;

    /**
     * Get the options property: The options property.
     *
     * @return the options value.
     */
    public OptionsOptions getOptions() {
        return this.options;
    }

    /**
     * Set the options property: The options property.
     *
     * @param options the options value to set.
     * @return the Options object itself.
     */
    public Options setOptions(OptionsOptions options) {
        this.options = options;
        return this;
    }
}
