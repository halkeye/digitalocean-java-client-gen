package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsQd2GxzResponsesVolumesnapshotsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Snapshots;
import com.digitalocean.api.models.SnapshotsResourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsQd2GxzResponsesVolumesnapshotsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsQd2GxzResponsesVolumesnapshotsContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"snapshots\":[{\"resource_id\":\"bkiumjf\",\"resource_type\":\"volume\",\"tags\":[\"edrm\",\"azhvchvvo\"],\"name\":\"iogbntnwzruzsoo\",\"created_at\":\"2020-12-22T09:21:34Z\",\"regions\":[\"smxtlcappnvc\"],\"min_disk_size\":677074900,\"size_gigabytes\":97.79067},{\"resource_id\":\"pciryomhkdwuw\",\"resource_type\":\"volume\",\"tags\":[\"pbkmzkwhjjs\",\"whaefefvvkxd\"],\"name\":\"n\",\"created_at\":\"2021-04-11T18:54:22Z\",\"regions\":[\"a\",\"ycdzdob\",\"esdyvf\",\"n\"],\"min_disk_size\":1098173802,\"size_gigabytes\":56.231808}]}").toObject(ComponentsQd2GxzResponsesVolumesnapshotsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("iogbntnwzruzsoo", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-22T09:21:34Z"), model.getSnapshots().get(0).getCreatedAt());
        Assertions.assertEquals("smxtlcappnvc", model.getSnapshots().get(0).getRegions().get(0));
        Assertions.assertEquals(677074900, model.getSnapshots().get(0).getMinDiskSize());
        Assertions.assertEquals(97.79067f, model.getSnapshots().get(0).getSizeGigabytes());
        Assertions.assertEquals("bkiumjf", model.getSnapshots().get(0).getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.VOLUME, model.getSnapshots().get(0).getResourceType());
        Assertions.assertEquals("edrm", model.getSnapshots().get(0).getTags().get(0));
    }

    @Test
    public void testSerialize() {
        ComponentsQd2GxzResponsesVolumesnapshotsContentApplicationJsonSchemaAllof0 model = new ComponentsQd2GxzResponsesVolumesnapshotsContentApplicationJsonSchemaAllof0().setSnapshots(Arrays.asList(new Snapshots().setName("iogbntnwzruzsoo").setCreatedAt(OffsetDateTime.parse("2020-12-22T09:21:34Z")).setRegions(Arrays.asList("smxtlcappnvc")).setMinDiskSize(677074900).setSizeGigabytes(97.79067f).setResourceId("bkiumjf").setResourceType(SnapshotsResourceType.VOLUME).setTags(Arrays.asList("edrm", "azhvchvvo")), new Snapshots().setName("n").setCreatedAt(OffsetDateTime.parse("2021-04-11T18:54:22Z")).setRegions(Arrays.asList("a", "ycdzdob", "esdyvf", "n")).setMinDiskSize(1098173802).setSizeGigabytes(56.231808f).setResourceId("pciryomhkdwuw").setResourceType(SnapshotsResourceType.VOLUME).setTags(Arrays.asList("pbkmzkwhjjs", "whaefefvvkxd"))));
        model = BinaryData.fromObject(model).toObject(ComponentsQd2GxzResponsesVolumesnapshotsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("iogbntnwzruzsoo", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-22T09:21:34Z"), model.getSnapshots().get(0).getCreatedAt());
        Assertions.assertEquals("smxtlcappnvc", model.getSnapshots().get(0).getRegions().get(0));
        Assertions.assertEquals(677074900, model.getSnapshots().get(0).getMinDiskSize());
        Assertions.assertEquals(97.79067f, model.getSnapshots().get(0).getSizeGigabytes());
        Assertions.assertEquals("bkiumjf", model.getSnapshots().get(0).getResourceId());
        Assertions.assertEquals(SnapshotsResourceType.VOLUME, model.getSnapshots().get(0).getResourceType());
        Assertions.assertEquals("edrm", model.getSnapshots().get(0).getTags().get(0));
    }
}
