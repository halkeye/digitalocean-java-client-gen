package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ConnectionPools model.
 */
@Immutable
public final class ConnectionPools {
    /*
     * An array of connection pool objects.
     */
    @JsonProperty(value = "pools", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectionPool> pools;

    /**
     * Get the pools property: An array of connection pool objects.
     * 
     * @return the pools value.
     */
    public List<ConnectionPool> getPools() {
        return this.pools;
    }
}
