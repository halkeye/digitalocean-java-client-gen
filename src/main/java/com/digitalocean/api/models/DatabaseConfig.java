package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The DatabaseConfig model.
 */
@Fluent
public final class DatabaseConfig {
    /*
     * The config property.
     */
    @JsonProperty(value = "config")
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
     * @return the DatabaseConfig object itself.
     */
    public DatabaseConfig setConfig(Object config) {
        this.config = config;
        return this;
    }
}
