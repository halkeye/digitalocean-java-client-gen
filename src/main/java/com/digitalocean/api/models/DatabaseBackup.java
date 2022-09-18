package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;

/**
 * The DatabaseBackup model.
 */
@Fluent
public final class DatabaseBackup {
    /*
     * The name of an existing database cluster from which the backup will be restored.
     */
    @JsonProperty(value = "database_name", required = true)
    private String databaseName;

    /*
     * The timestamp of an existing database cluster backup in ISO8601 combined date and time format. The most recent
     * backup will be used if excluded.
     */
    @JsonProperty(value = "backup_created_at")
    private OffsetDateTime backupCreatedAt;

    /**
     * Get the databaseName property: The name of an existing database cluster from which the backup will be restored.
     * 
     * @return the databaseName value.
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The name of an existing database cluster from which the backup will be restored.
     * 
     * @param databaseName the databaseName value to set.
     * @return the DatabaseBackup object itself.
     */
    public DatabaseBackup setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the backupCreatedAt property: The timestamp of an existing database cluster backup in ISO8601 combined date
     * and time format. The most recent backup will be used if excluded.
     * 
     * @return the backupCreatedAt value.
     */
    public OffsetDateTime getBackupCreatedAt() {
        return this.backupCreatedAt;
    }

    /**
     * Set the backupCreatedAt property: The timestamp of an existing database cluster backup in ISO8601 combined date
     * and time format. The most recent backup will be used if excluded.
     * 
     * @param backupCreatedAt the backupCreatedAt value to set.
     * @return the DatabaseBackup object itself.
     */
    public DatabaseBackup setBackupCreatedAt(OffsetDateTime backupCreatedAt) {
        this.backupCreatedAt = backupCreatedAt;
        return this;
    }
}
