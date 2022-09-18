package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsBlao0HResponsesOneclicksCreateContentApplicationJsonSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsBlao0HResponsesOneclicksCreateContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsBlao0HResponsesOneclicksCreateContentApplicationJsonSchema model = BinaryData.fromString("{\"message\":\"gnufoooj\"}").toObject(ComponentsBlao0HResponsesOneclicksCreateContentApplicationJsonSchema.class);
        Assertions.assertEquals("gnufoooj", model.getMessage());
    }

    @Test
    public void testSerialize() {
        ComponentsBlao0HResponsesOneclicksCreateContentApplicationJsonSchema model = new ComponentsBlao0HResponsesOneclicksCreateContentApplicationJsonSchema().setMessage("gnufoooj");
        model = BinaryData.fromObject(model).toObject(ComponentsBlao0HResponsesOneclicksCreateContentApplicationJsonSchema.class);
        Assertions.assertEquals("gnufoooj", model.getMessage());
    }
}
