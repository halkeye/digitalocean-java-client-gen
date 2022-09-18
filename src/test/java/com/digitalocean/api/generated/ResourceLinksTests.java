package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ResourceLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceLinksTests {
    @Test
    public void testDeserialize() {
        ResourceLinks model = BinaryData.fromString("{\"self\":\"lskxgxqaygaslkv\"}").toObject(ResourceLinks.class);
        Assertions.assertEquals("lskxgxqaygaslkv", model.getSelf());
    }

    @Test
    public void testSerialize() {
        ResourceLinks model = new ResourceLinks().setSelf("lskxgxqaygaslkv");
        model = BinaryData.fromObject(model).toObject(ResourceLinks.class);
        Assertions.assertEquals("lskxgxqaygaslkv", model.getSelf());
    }
}
