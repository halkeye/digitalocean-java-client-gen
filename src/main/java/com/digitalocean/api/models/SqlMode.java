package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The SqlMode model.
 */
@Fluent
public final class SqlMode {
    /*
     * A string specifying the configured SQL modes for the MySQL cluster.
     */
    @JsonProperty(value = "sql_mode", required = true)
    private String sqlMode;

    /**
     * Get the sqlMode property: A string specifying the configured SQL modes for the MySQL cluster.
     * 
     * @return the sqlMode value.
     */
    public String getSqlMode() {
        return this.sqlMode;
    }

    /**
     * Set the sqlMode property: A string specifying the configured SQL modes for the MySQL cluster.
     * 
     * @param sqlMode the sqlMode value to set.
     * @return the SqlMode object itself.
     */
    public SqlMode setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode;
        return this;
    }
}
