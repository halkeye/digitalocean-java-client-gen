package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Backup;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BackupTests {
    @Test
    public void testDeserialize() {
        Backup model = BinaryData.fromString("{\"created_at\":\"2021-05-17T11:08:07Z\",\"size_gigabytes\":89.93878}").toObject(Backup.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-17T11:08:07Z"), model.getCreatedAt());
        Assertions.assertEquals(89.93878f, model.getSizeGigabytes());
    }

    @Test
    public void testSerialize() {
        Backup model = new Backup().setCreatedAt(OffsetDateTime.parse("2021-05-17T11:08:07Z")).setSizeGigabytes(89.93878f);
        model = BinaryData.fromObject(model).toObject(Backup.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-17T11:08:07Z"), model.getCreatedAt());
        Assertions.assertEquals(89.93878f, model.getSizeGigabytes());
    }
}
