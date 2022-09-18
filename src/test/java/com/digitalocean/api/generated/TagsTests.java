package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Tags;
import com.digitalocean.api.models.TagsResources;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TagsTests {
    @Test
    public void testDeserialize() {
        Tags model = BinaryData.fromString("{\"name\":\"tarp\",\"resources\":{\"droplets\":{\"count\":1934228433,\"last_tagged_uri\":\"iq\"},\"imgages\":{\"count\":471628742,\"last_tagged_uri\":\"gjn\"},\"volumes\":{\"count\":1797111044,\"last_tagged_uri\":\"y\"},\"volume_snapshots\":{\"count\":1526774561,\"last_tagged_uri\":\"juymtevaeb\"},\"databases\":{\"count\":899702953,\"last_tagged_uri\":\"hrjkejvaedogz\"},\"count\":1793463609,\"last_tagged_uri\":\"bxxgjog\"}}").toObject(Tags.class);
        Assertions.assertEquals("tarp", model.getName());
    }

    @Test
    public void testSerialize() {
        Tags model = new Tags().setName("tarp");
        model = BinaryData.fromObject(model).toObject(Tags.class);
        Assertions.assertEquals("tarp", model.getName());
    }
}
