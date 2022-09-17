package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Backup;
import com.digitalocean.api.models.Components1OgskmqResponsesDatabaseBackupsContentApplicationJsonSchema;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1OgskmqResponsesDatabaseBackupsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1OgskmqResponsesDatabaseBackupsContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"backups\":[{\"created_at\":\"2021-08-30T10:08:01Z\",\"size_gigabytes\":26.681042},{\"created_at\":\"2021-05-05T16:01:50Z\",\"size_gigabytes\":48.207462}]}")
                        .toObject(Components1OgskmqResponsesDatabaseBackupsContentApplicationJsonSchema.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-30T10:08:01Z"), model.getBackups().get(0).getCreatedAt());
        Assertions.assertEquals(26.681042f, model.getBackups().get(0).getSizeGigabytes());
    }

    @Test
    public void testSerialize() {
        Components1OgskmqResponsesDatabaseBackupsContentApplicationJsonSchema model =
                new Components1OgskmqResponsesDatabaseBackupsContentApplicationJsonSchema()
                        .setBackups(
                                Arrays.asList(
                                        new Backup()
                                                .setCreatedAt(OffsetDateTime.parse("2021-08-30T10:08:01Z"))
                                                .setSizeGigabytes(26.681042f),
                                        new Backup()
                                                .setCreatedAt(OffsetDateTime.parse("2021-05-05T16:01:50Z"))
                                                .setSizeGigabytes(48.207462f)));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1OgskmqResponsesDatabaseBackupsContentApplicationJsonSchema.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-30T10:08:01Z"), model.getBackups().get(0).getCreatedAt());
        Assertions.assertEquals(26.681042f, model.getBackups().get(0).getSizeGigabytes());
    }
}
