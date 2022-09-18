package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * When authorized in a team context, includes information about the current team.
 */
@Fluent
public final class AccountTeam {
    /*
     * The unique universal identifier for the current team.
     */
    @JsonProperty(value = "uuid")
    private String uuid;

    /*
     * The name for the current team.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the uuid property: The unique universal identifier for the current team.
     * 
     * @return the uuid value.
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * Set the uuid property: The unique universal identifier for the current team.
     * 
     * @param uuid the uuid value to set.
     * @return the AccountTeam object itself.
     */
    public AccountTeam setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get the name property: The name for the current team.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name for the current team.
     * 
     * @param name the name value to set.
     * @return the AccountTeam object itself.
     */
    public AccountTeam setName(String name) {
        this.name = name;
        return this;
    }
}
