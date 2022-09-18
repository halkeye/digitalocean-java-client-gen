package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema model.
 */
@Fluent
public final class Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema {
    /*
     * A slug identifier for the region to which the database cluster will be migrated.
     */
    @JsonProperty(value = "region", required = true)
    private String region;

    /**
     * Get the region property: A slug identifier for the region to which the database cluster will be migrated.
     * 
     * @return the region value.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Set the region property: A slug identifier for the region to which the database cluster will be migrated.
     * 
     * @param region the region value to set.
     * @return the Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema object
     * itself.
     */
    public Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema setRegion(String region) {
        this.region = region;
        return this;
    }
}
