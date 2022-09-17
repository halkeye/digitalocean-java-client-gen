package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths142ArgoV2DatabasesPostRequestbodyContentApplicationJsonSchemaAllof1 model. */
@Fluent
public class Paths142ArgoV2DatabasesPostRequestbodyContentApplicationJsonSchemaAllof1 {
    /*
     * The backup_restore property.
     */
    @JsonProperty(value = "backup_restore")
    private DatabaseBackup backupRestore;

    /**
     * Get the backupRestore property: The backup_restore property.
     *
     * @return the backupRestore value.
     */
    public DatabaseBackup getBackupRestore() {
        return this.backupRestore;
    }

    /**
     * Set the backupRestore property: The backup_restore property.
     *
     * @param backupRestore the backupRestore value to set.
     * @return the Paths142ArgoV2DatabasesPostRequestbodyContentApplicationJsonSchemaAllof1 object itself.
     */
    public Paths142ArgoV2DatabasesPostRequestbodyContentApplicationJsonSchemaAllof1 setBackupRestore(
            DatabaseBackup backupRestore) {
        this.backupRestore = backupRestore;
        return this;
    }
}
