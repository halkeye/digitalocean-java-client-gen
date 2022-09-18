package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.SnapshotsBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SnapshotsBaseTests {
    @Test
    public void testDeserialize() {
        SnapshotsBase model = BinaryData.fromString("{\"name\":\"oeurbtigapdyar\",\"created_at\":\"2021-06-06T08:34:28Z\",\"regions\":[\"ejdpdfhtwm\",\"kfqbriqulwwt\",\"jmeqkvy\"],\"min_disk_size\":1435057014,\"size_gigabytes\":45.53458}").toObject(SnapshotsBase.class);
        Assertions.assertEquals("oeurbtigapdyar", model.getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-06T08:34:28Z"), model.getCreatedAt());
        Assertions.assertEquals("ejdpdfhtwm", model.getRegions().get(0));
        Assertions.assertEquals(1435057014, model.getMinDiskSize());
        Assertions.assertEquals(45.53458f, model.getSizeGigabytes());
    }

    @Test
    public void testSerialize() {
        SnapshotsBase model = new SnapshotsBase().setName("oeurbtigapdyar").setCreatedAt(OffsetDateTime.parse("2021-06-06T08:34:28Z")).setRegions(Arrays.asList("ejdpdfhtwm", "kfqbriqulwwt", "jmeqkvy")).setMinDiskSize(1435057014).setSizeGigabytes(45.53458f);
        model = BinaryData.fromObject(model).toObject(SnapshotsBase.class);
        Assertions.assertEquals("oeurbtigapdyar", model.getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-06T08:34:28Z"), model.getCreatedAt());
        Assertions.assertEquals("ejdpdfhtwm", model.getRegions().get(0));
        Assertions.assertEquals(1435057014, model.getMinDiskSize());
        Assertions.assertEquals(45.53458f, model.getSizeGigabytes());
    }
}
