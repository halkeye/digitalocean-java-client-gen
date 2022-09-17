package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Database model. */
@Fluent
public final class Database {
    /*
     * The name of the database.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the name property: The name of the database.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the database.
     *
     * @param name the name value to set.
     * @return the Database object itself.
     */
    public Database setName(String name) {
        this.name = name;
        return this;
    }
}
