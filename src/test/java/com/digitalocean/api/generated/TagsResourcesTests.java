package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.TagsMetadata;
import com.digitalocean.api.models.TagsResources;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TagsResourcesTests {
    @Test
    public void testDeserialize() {
        TagsResources model = BinaryData.fromString("{\"droplets\":{\"count\":2029108862,\"last_tagged_uri\":\"fhrmtenfdvdoe\"},\"imgages\":{\"count\":115903449,\"last_tagged_uri\":\"srjzhdtrsyfezfs\"},\"volumes\":{\"count\":1001675218,\"last_tagged_uri\":\"zyyrwnmwtqiljknn\"},\"volume_snapshots\":{\"count\":99976059,\"last_tagged_uri\":\"tdt\"},\"databases\":{\"count\":936362951,\"last_tagged_uri\":\"phfxaq\"},\"count\":1440744289,\"last_tagged_uri\":\"jcwwvaosckf\"}").toObject(TagsResources.class);
        Assertions.assertEquals(1440744289, model.getCount());
        Assertions.assertEquals("jcwwvaosckf", model.getLastTaggedUri());
        Assertions.assertEquals(2029108862, model.getDroplets().getCount());
        Assertions.assertEquals("fhrmtenfdvdoe", model.getDroplets().getLastTaggedUri());
        Assertions.assertEquals(115903449, model.getImgages().getCount());
        Assertions.assertEquals("srjzhdtrsyfezfs", model.getImgages().getLastTaggedUri());
        Assertions.assertEquals(1001675218, model.getVolumes().getCount());
        Assertions.assertEquals("zyyrwnmwtqiljknn", model.getVolumes().getLastTaggedUri());
        Assertions.assertEquals(99976059, model.getVolumeSnapshots().getCount());
        Assertions.assertEquals("tdt", model.getVolumeSnapshots().getLastTaggedUri());
        Assertions.assertEquals(936362951, model.getDatabases().getCount());
        Assertions.assertEquals("phfxaq", model.getDatabases().getLastTaggedUri());
    }

    @Test
    public void testSerialize() {
        TagsResources model = new TagsResources().setCount(1440744289).setLastTaggedUri("jcwwvaosckf").setDroplets(new TagsMetadata().setCount(2029108862).setLastTaggedUri("fhrmtenfdvdoe")).setImgages(new TagsMetadata().setCount(115903449).setLastTaggedUri("srjzhdtrsyfezfs")).setVolumes(new TagsMetadata().setCount(1001675218).setLastTaggedUri("zyyrwnmwtqiljknn")).setVolumeSnapshots(new TagsMetadata().setCount(99976059).setLastTaggedUri("tdt")).setDatabases(new TagsMetadata().setCount(936362951).setLastTaggedUri("phfxaq"));
        model = BinaryData.fromObject(model).toObject(TagsResources.class);
        Assertions.assertEquals(1440744289, model.getCount());
        Assertions.assertEquals("jcwwvaosckf", model.getLastTaggedUri());
        Assertions.assertEquals(2029108862, model.getDroplets().getCount());
        Assertions.assertEquals("fhrmtenfdvdoe", model.getDroplets().getLastTaggedUri());
        Assertions.assertEquals(115903449, model.getImgages().getCount());
        Assertions.assertEquals("srjzhdtrsyfezfs", model.getImgages().getLastTaggedUri());
        Assertions.assertEquals(1001675218, model.getVolumes().getCount());
        Assertions.assertEquals("zyyrwnmwtqiljknn", model.getVolumes().getLastTaggedUri());
        Assertions.assertEquals(99976059, model.getVolumeSnapshots().getCount());
        Assertions.assertEquals("tdt", model.getVolumeSnapshots().getLastTaggedUri());
        Assertions.assertEquals(936362951, model.getDatabases().getCount());
        Assertions.assertEquals("phfxaq", model.getDatabases().getLastTaggedUri());
    }
}
