package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1;
import com.digitalocean.api.models.TagsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1Tests {
    @Test
    public void testDeserialize() {
        ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 model = BinaryData.fromString("{\"droplets\":{\"count\":2069188464,\"last_tagged_uri\":\"ifdyfaoex\"},\"imgages\":{\"count\":1169202881,\"last_tagged_uri\":\"rd\"},\"volumes\":{\"count\":1361978410,\"last_tagged_uri\":\"ihsujtg\"},\"volume_snapshots\":{\"count\":794612499,\"last_tagged_uri\":\"am\"},\"databases\":{\"count\":1546437070,\"last_tagged_uri\":\"pdcliqwzutiyelrn\"}}").toObject(ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1.class);
        Assertions.assertEquals(2069188464, model.getDroplets().getCount());
        Assertions.assertEquals("ifdyfaoex", model.getDroplets().getLastTaggedUri());
        Assertions.assertEquals(1169202881, model.getImgages().getCount());
        Assertions.assertEquals("rd", model.getImgages().getLastTaggedUri());
        Assertions.assertEquals(1361978410, model.getVolumes().getCount());
        Assertions.assertEquals("ihsujtg", model.getVolumes().getLastTaggedUri());
        Assertions.assertEquals(794612499, model.getVolumeSnapshots().getCount());
        Assertions.assertEquals("am", model.getVolumeSnapshots().getLastTaggedUri());
        Assertions.assertEquals(1546437070, model.getDatabases().getCount());
        Assertions.assertEquals("pdcliqwzutiyelrn", model.getDatabases().getLastTaggedUri());
    }

    @Test
    public void testSerialize() {
        ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 model = new ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1().setDroplets(new TagsMetadata().setCount(2069188464).setLastTaggedUri("ifdyfaoex")).setImgages(new TagsMetadata().setCount(1169202881).setLastTaggedUri("rd")).setVolumes(new TagsMetadata().setCount(1361978410).setLastTaggedUri("ihsujtg")).setVolumeSnapshots(new TagsMetadata().setCount(794612499).setLastTaggedUri("am")).setDatabases(new TagsMetadata().setCount(1546437070).setLastTaggedUri("pdcliqwzutiyelrn"));
        model = BinaryData.fromObject(model).toObject(ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1.class);
        Assertions.assertEquals(2069188464, model.getDroplets().getCount());
        Assertions.assertEquals("ifdyfaoex", model.getDroplets().getLastTaggedUri());
        Assertions.assertEquals(1169202881, model.getImgages().getCount());
        Assertions.assertEquals("rd", model.getImgages().getLastTaggedUri());
        Assertions.assertEquals(1361978410, model.getVolumes().getCount());
        Assertions.assertEquals("ihsujtg", model.getVolumes().getLastTaggedUri());
        Assertions.assertEquals(794612499, model.getVolumeSnapshots().getCount());
        Assertions.assertEquals("am", model.getVolumeSnapshots().getLastTaggedUri());
        Assertions.assertEquals(1546437070, model.getDatabases().getCount());
        Assertions.assertEquals("pdcliqwzutiyelrn", model.getDatabases().getLastTaggedUri());
    }
}
