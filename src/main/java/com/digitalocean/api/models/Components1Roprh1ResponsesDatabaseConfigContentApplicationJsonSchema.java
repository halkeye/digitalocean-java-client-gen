package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1Roprh1ResponsesDatabaseConfigContentApplicationJsonSchema model. */
@Fluent
public final class Components1Roprh1ResponsesDatabaseConfigContentApplicationJsonSchema {
    /*
     * The config property.
     */
    @JsonProperty(value = "config", required = true)
    private Object config;

    /**
     * Get the config property: The config property.
     *
     * @return the config value.
     */
    public Object getConfig() {
        return this.config;
    }

    /**
     * Set the config property: The config property.
     *
     * @param config the config value to set.
     * @return the Components1Roprh1ResponsesDatabaseConfigContentApplicationJsonSchema object itself.
     */
    public Components1Roprh1ResponsesDatabaseConfigContentApplicationJsonSchema setConfig(Object config) {
        this.config = config;
        return this;
    }
}
