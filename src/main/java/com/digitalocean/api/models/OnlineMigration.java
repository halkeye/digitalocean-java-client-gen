package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OnlineMigration model. */
@Fluent
public final class OnlineMigration {
    /*
     * The ID of the currently running migration.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The current status of the migration.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The time the migration was initiated, in ISO 8601 format.
     */
    @JsonProperty(value = "created_at")
    private String createdAt;

    /**
     * Get the id property: The ID of the currently running migration.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the currently running migration.
     *
     * @param id the id value to set.
     * @return the OnlineMigration object itself.
     */
    public OnlineMigration setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the status property: The current status of the migration.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The current status of the migration.
     *
     * @param status the status value to set.
     * @return the OnlineMigration object itself.
     */
    public OnlineMigration setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the createdAt property: The time the migration was initiated, in ISO 8601 format.
     *
     * @return the createdAt value.
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: The time the migration was initiated, in ISO 8601 format.
     *
     * @param createdAt the createdAt value to set.
     * @return the OnlineMigration object itself.
     */
    public OnlineMigration setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
