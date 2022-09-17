package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.TagsMetadata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TagsMetadataTests {
    @Test
    public void testDeserialize() {
        TagsMetadata model =
                BinaryData.fromString("{\"count\":22664450,\"last_tagged_uri\":\"hp\"}").toObject(TagsMetadata.class);
        Assertions.assertEquals(22664450, model.getCount());
        Assertions.assertEquals("hp", model.getLastTaggedUri());
    }

    @Test
    public void testSerialize() {
        TagsMetadata model = new TagsMetadata().setCount(22664450).setLastTaggedUri("hp");
        model = BinaryData.fromObject(model).toObject(TagsMetadata.class);
        Assertions.assertEquals(22664450, model.getCount());
        Assertions.assertEquals("hp", model.getLastTaggedUri());
    }
}
