package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseBackup;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabaseBackupTests {
    @Test
    public void testDeserialize() {
        DatabaseBackup model = BinaryData.fromString("{\"database_name\":\"v\",\"backup_created_at\":\"2021-06-08T16:49:51Z\"}").toObject(DatabaseBackup.class);
        Assertions.assertEquals("v", model.getDatabaseName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-08T16:49:51Z"), model.getBackupCreatedAt());
    }

    @Test
    public void testSerialize() {
        DatabaseBackup model = new DatabaseBackup().setDatabaseName("v").setBackupCreatedAt(OffsetDateTime.parse("2021-06-08T16:49:51Z"));
        model = BinaryData.fromObject(model).toObject(DatabaseBackup.class);
        Assertions.assertEquals("v", model.getDatabaseName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-08T16:49:51Z"), model.getBackupCreatedAt());
    }
}
