package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DropletSnapshot;
import com.digitalocean.api.models.DropletSnapshotType;
import com.digitalocean.api.models.SnapshotsBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletSnapshotTests {
    @Test
    public void testDeserialize() {
        DropletSnapshot model = BinaryData.fromString("{\"type\":\"backup\",\"name\":\"m\",\"created_at\":\"2021-04-09T03:39:28Z\",\"regions\":[\"jdrpizfulgycts\",\"btqgkujdsoox\"],\"min_disk_size\":1243480794,\"size_gigabytes\":1.56973}").toObject(DropletSnapshot.class);
        Assertions.assertEquals("m", model.getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-09T03:39:28Z"), model.getCreatedAt());
        Assertions.assertEquals("jdrpizfulgycts", model.getRegions().get(0));
        Assertions.assertEquals(1243480794, model.getMinDiskSize());
        Assertions.assertEquals(1.56973f, model.getSizeGigabytes());
        Assertions.assertEquals(DropletSnapshotType.BACKUP, model.getType());
    }

    @Test
    public void testSerialize() {
        DropletSnapshot model = new DropletSnapshot().setName("m").setCreatedAt(OffsetDateTime.parse("2021-04-09T03:39:28Z")).setRegions(Arrays.asList("jdrpizfulgycts", "btqgkujdsoox")).setMinDiskSize(1243480794).setSizeGigabytes(1.56973f).setType(DropletSnapshotType.BACKUP);
        model = BinaryData.fromObject(model).toObject(DropletSnapshot.class);
        Assertions.assertEquals("m", model.getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-09T03:39:28Z"), model.getCreatedAt());
        Assertions.assertEquals("jdrpizfulgycts", model.getRegions().get(0));
        Assertions.assertEquals(1243480794, model.getMinDiskSize());
        Assertions.assertEquals(1.56973f, model.getSizeGigabytes());
        Assertions.assertEquals(DropletSnapshotType.BACKUP, model.getType());
    }
}
