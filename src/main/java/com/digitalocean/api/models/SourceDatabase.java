package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The SourceDatabase model.
 */
@Fluent
public final class SourceDatabase {
    /*
     * The source property.
     */
    @JsonProperty(value = "source")
    private SourceDatabaseSource source;

    /*
     * Enables SSL encryption when connecting to the source database.
     */
    @JsonProperty(value = "disable_ssl")
    private Boolean disableSsl;

    /**
     * Get the source property: The source property.
     * 
     * @return the source value.
     */
    public SourceDatabaseSource getSource() {
        return this.source;
    }

    /**
     * Set the source property: The source property.
     * 
     * @param source the source value to set.
     * @return the SourceDatabase object itself.
     */
    public SourceDatabase setSource(SourceDatabaseSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the disableSsl property: Enables SSL encryption when connecting to the source database.
     * 
     * @return the disableSsl value.
     */
    public Boolean isDisableSsl() {
        return this.disableSsl;
    }

    /**
     * Set the disableSsl property: Enables SSL encryption when connecting to the source database.
     * 
     * @param disableSsl the disableSsl value to set.
     * @return the SourceDatabase object itself.
     */
    public SourceDatabase setDisableSsl(Boolean disableSsl) {
        this.disableSsl = disableSsl;
        return this;
    }
}
