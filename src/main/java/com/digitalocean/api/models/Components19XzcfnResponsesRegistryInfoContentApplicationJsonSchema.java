package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Components19XzcfnResponsesRegistryInfoContentApplicationJsonSchema model.
 */
@Fluent
public final class Components19XzcfnResponsesRegistryInfoContentApplicationJsonSchema {
    /*
     * The registry property.
     */
    @JsonProperty(value = "registry")
    private Registry registry;

    /**
     * Get the registry property: The registry property.
     * 
     * @return the registry value.
     */
    public Registry getRegistry() {
        return this.registry;
    }

    /**
     * Set the registry property: The registry property.
     * 
     * @param registry the registry value to set.
     * @return the Components19XzcfnResponsesRegistryInfoContentApplicationJsonSchema object itself.
     */
    public Components19XzcfnResponsesRegistryInfoContentApplicationJsonSchema setRegistry(Registry registry) {
        this.registry = registry;
        return this;
    }
}
