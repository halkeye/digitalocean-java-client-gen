package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;

/**
 * The Backup model.
 */
@Fluent
public final class Backup {
    /*
     * A time value given in ISO8601 combined date and time format at which the backup was created.
     */
    @JsonProperty(value = "created_at", required = true)
    private OffsetDateTime createdAt;

    /*
     * The size of the database backup in GBs.
     */
    @JsonProperty(value = "size_gigabytes", required = true)
    private float sizeGigabytes;

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format at which the backup was
     * created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: A time value given in ISO8601 combined date and time format at which the backup was
     * created.
     * 
     * @param createdAt the createdAt value to set.
     * @return the Backup object itself.
     */
    public Backup setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the sizeGigabytes property: The size of the database backup in GBs.
     * 
     * @return the sizeGigabytes value.
     */
    public float getSizeGigabytes() {
        return this.sizeGigabytes;
    }

    /**
     * Set the sizeGigabytes property: The size of the database backup in GBs.
     * 
     * @param sizeGigabytes the sizeGigabytes value to set.
     * @return the Backup object itself.
     */
    public Backup setSizeGigabytes(float sizeGigabytes) {
        this.sizeGigabytes = sizeGigabytes;
        return this;
    }
}
