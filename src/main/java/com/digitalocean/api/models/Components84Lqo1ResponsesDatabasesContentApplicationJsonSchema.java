package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components84Lqo1ResponsesDatabasesContentApplicationJsonSchema model.
 */
@Fluent
public final class Components84Lqo1ResponsesDatabasesContentApplicationJsonSchema {
    /*
     * The dbs property.
     */
    @JsonProperty(value = "dbs")
    private List<Database> dbs;

    /**
     * Get the dbs property: The dbs property.
     * 
     * @return the dbs value.
     */
    public List<Database> getDbs() {
        return this.dbs;
    }

    /**
     * Set the dbs property: The dbs property.
     * 
     * @param dbs the dbs value to set.
     * @return the Components84Lqo1ResponsesDatabasesContentApplicationJsonSchema object itself.
     */
    public Components84Lqo1ResponsesDatabasesContentApplicationJsonSchema setDbs(List<Database> dbs) {
        this.dbs = dbs;
        return this;
    }
}
