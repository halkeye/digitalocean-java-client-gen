package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Components8Tvwi3ResponsesConnectionPoolContentApplicationJsonSchema model.
 */
@Fluent
public final class Components8Tvwi3ResponsesConnectionPoolContentApplicationJsonSchema {
    /*
     * The pool property.
     */
    @JsonProperty(value = "pool", required = true)
    private ConnectionPool pool;

    /**
     * Get the pool property: The pool property.
     * 
     * @return the pool value.
     */
    public ConnectionPool getPool() {
        return this.pool;
    }

    /**
     * Set the pool property: The pool property.
     * 
     * @param pool the pool value to set.
     * @return the Components8Tvwi3ResponsesConnectionPoolContentApplicationJsonSchema object itself.
     */
    public Components8Tvwi3ResponsesConnectionPoolContentApplicationJsonSchema setPool(ConnectionPool pool) {
        this.pool = pool;
        return this;
    }
}
