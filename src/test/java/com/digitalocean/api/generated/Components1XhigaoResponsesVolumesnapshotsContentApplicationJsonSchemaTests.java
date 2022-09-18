package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1XhigaoResponsesVolumesnapshotsContentApplicationJsonSchema;
import com.digitalocean.api.models.ComponentsQd2GxzResponsesVolumesnapshotsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Snapshots;
import com.digitalocean.api.models.SnapshotsResourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1XhigaoResponsesVolumesnapshotsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1XhigaoResponsesVolumesnapshotsContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":1362070044},\"snapshots\":[{\"resource_id\":\"mzjrit\",\"resource_type\":\"volume\",\"tags\":[\"ym\",\"bfex\"],\"name\":\"izzjxwj\",\"created_at\":\"2021-11-09T19:33:54Z\",\"regions\":[\"zwanduhduwdvolxt\",\"m\",\"ic\"],\"min_disk_size\":128732663,\"size_gigabytes\":30.732853}]}").toObject(Components1XhigaoResponsesVolumesnapshotsContentApplicationJsonSchema.class);
        Assertions.assertEquals("izzjxwj", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-09T19:33:54Z"), model.getSnapshots().get(0).getCreatedAt());
        Assertions.assertEquals("zwanduhduwdvolxt", model.getSnapshots().get(0).getRegions().get(0));
        Assertions.assertEquals(128732663, model.getSnapshots().get(0).getMinDiskSize());
        Assertions.assertEquals(30.732853f, model.getSnapshots().get(0).getSizeGigabytes());
        Assertions.assertEquals("mzjrit", model.getSnapshots().get(0).getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.VOLUME, model.getSnapshots().get(0).getResourceType());
        Assertions.assertEquals("ym", model.getSnapshots().get(0).getTags().get(0));
        Assertions.assertEquals(1362070044, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1XhigaoResponsesVolumesnapshotsContentApplicationJsonSchema model = new Components1XhigaoResponsesVolumesnapshotsContentApplicationJsonSchema().setSnapshots(Arrays.asList(new Snapshots().setName("izzjxwj").setCreatedAt(OffsetDateTime.parse("2021-11-09T19:33:54Z")).setRegions(Arrays.asList("zwanduhduwdvolxt", "m", "ic")).setMinDiskSize(128732663).setSizeGigabytes(30.732853f).setResourceId("mzjrit").setResourceType(SnapshotsResourceType.VOLUME).setTags(Arrays.asList("ym", "bfex")))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(1362070044));
        model = BinaryData.fromObject(model).toObject(Components1XhigaoResponsesVolumesnapshotsContentApplicationJsonSchema.class);
        Assertions.assertEquals("izzjxwj", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-09T19:33:54Z"), model.getSnapshots().get(0).getCreatedAt());
        Assertions.assertEquals("zwanduhduwdvolxt", model.getSnapshots().get(0).getRegions().get(0));
        Assertions.assertEquals(128732663, model.getSnapshots().get(0).getMinDiskSize());
        Assertions.assertEquals(30.732853f, model.getSnapshots().get(0).getSizeGigabytes());
        Assertions.assertEquals("mzjrit", model.getSnapshots().get(0).getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.VOLUME, model.getSnapshots().get(0).getResourceType());
        Assertions.assertEquals("ym", model.getSnapshots().get(0).getTags().get(0));
        Assertions.assertEquals(1362070044, model.getMeta().getTotal());
    }
}
