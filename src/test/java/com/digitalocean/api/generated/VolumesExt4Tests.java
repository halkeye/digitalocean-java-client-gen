package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.RegionSlug;
import com.digitalocean.api.models.VolumesExt4;
import com.digitalocean.api.models.VolumeWriteFileSystemType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumesExt4Tests {
    @Test
    public void testDeserialize() {
        VolumesExt4 model = BinaryData.fromString("{\"filesystem_type\":\"EXT4\",\"region\":\"blr1\",\"id\":\"xozesn\",\"droplet_ids\":[1549605623,716254621,2028691940],\"name\":\"xjbrixymc\",\"description\":\"kk\",\"size_gigabytes\":1205646024,\"created_at\":\"rhwis\",\"tags\":[\"mrzcqfevnkyakc\",\"tehognsddjk\"],\"snapshot_id\":\"edesuazogfcnx\"}").toObject(VolumesExt4.class);
        Assertions.assertEquals(RegionSlug.BLR1, model.getRegion());
        Assertions.assertEquals("xjbrixymc", model.getName());
        Assertions.assertEquals("kk", model.getDescription());
        Assertions.assertEquals(1205646024, model.getSizeGigabytes());
        Assertions.assertEquals("mrzcqfevnkyakc", model.getTags().get(0));
        Assertions.assertEquals("edesuazogfcnx", model.getSnapshotId());
    }

    @Test
    public void testSerialize() {
        VolumesExt4 model = new VolumesExt4().setRegion(RegionSlug.BLR1).setName("xjbrixymc").setDescription("kk").setSizeGigabytes(1205646024).setTags(Arrays.asList("mrzcqfevnkyakc", "tehognsddjk")).setSnapshotId("edesuazogfcnx");
        model = BinaryData.fromObject(model).toObject(VolumesExt4.class);
        Assertions.assertEquals(RegionSlug.BLR1, model.getRegion());
        Assertions.assertEquals("xjbrixymc", model.getName());
        Assertions.assertEquals("kk", model.getDescription());
        Assertions.assertEquals(1205646024, model.getSizeGigabytes());
        Assertions.assertEquals("mrzcqfevnkyakc", model.getTags().get(0));
        Assertions.assertEquals("edesuazogfcnx", model.getSnapshotId());
    }
}
