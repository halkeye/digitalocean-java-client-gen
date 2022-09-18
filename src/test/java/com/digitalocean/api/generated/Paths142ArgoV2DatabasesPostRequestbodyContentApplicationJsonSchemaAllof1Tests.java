package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseBackup;
import com.digitalocean.api.models.Paths142ArgoV2DatabasesPostRequestbodyContentApplicationJsonSchemaAllof1;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths142ArgoV2DatabasesPostRequestbodyContentApplicationJsonSchemaAllof1Tests {
    @Test
    public void testDeserialize() {
        Paths142ArgoV2DatabasesPostRequestbodyContentApplicationJsonSchemaAllof1 model = BinaryData.fromString("{\"backup_restore\":{\"database_name\":\"ymffhmjpddnyx\",\"backup_created_at\":\"2021-01-10T14:42:15Z\"}}").toObject(Paths142ArgoV2DatabasesPostRequestbodyContentApplicationJsonSchemaAllof1.class);
        Assertions.assertEquals("ymffhmjpddnyx", model.getBackupRestore().getDatabaseName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-10T14:42:15Z"), model.getBackupRestore().getBackupCreatedAt());
    }

    @Test
    public void testSerialize() {
        Paths142ArgoV2DatabasesPostRequestbodyContentApplicationJsonSchemaAllof1 model = new Paths142ArgoV2DatabasesPostRequestbodyContentApplicationJsonSchemaAllof1().setBackupRestore(new DatabaseBackup().setDatabaseName("ymffhmjpddnyx").setBackupCreatedAt(OffsetDateTime.parse("2021-01-10T14:42:15Z")));
        model = BinaryData.fromObject(model).toObject(Paths142ArgoV2DatabasesPostRequestbodyContentApplicationJsonSchemaAllof1.class);
        Assertions.assertEquals("ymffhmjpddnyx", model.getBackupRestore().getDatabaseName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-10T14:42:15Z"), model.getBackupRestore().getBackupCreatedAt());
    }
}
