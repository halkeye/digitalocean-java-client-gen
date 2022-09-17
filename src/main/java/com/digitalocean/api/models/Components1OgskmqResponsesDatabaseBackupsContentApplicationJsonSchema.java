package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Components1OgskmqResponsesDatabaseBackupsContentApplicationJsonSchema model. */
@Fluent
public final class Components1OgskmqResponsesDatabaseBackupsContentApplicationJsonSchema {
    /*
     * The backups property.
     */
    @JsonProperty(value = "backups", required = true)
    private List<Backup> backups;

    /**
     * Get the backups property: The backups property.
     *
     * @return the backups value.
     */
    public List<Backup> getBackups() {
        return this.backups;
    }

    /**
     * Set the backups property: The backups property.
     *
     * @param backups the backups value to set.
     * @return the Components1OgskmqResponsesDatabaseBackupsContentApplicationJsonSchema object itself.
     */
    public Components1OgskmqResponsesDatabaseBackupsContentApplicationJsonSchema setBackups(List<Backup> backups) {
        this.backups = backups;
        return this;
    }
}
