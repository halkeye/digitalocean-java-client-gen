package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Nx5U76ResponsesTagsNewContentApplicationJsonSchema;
import com.digitalocean.api.models.Tags;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Nx5U76ResponsesTagsNewContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Nx5U76ResponsesTagsNewContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"tag\":{\"name\":\"t\",\"resources\":{\"count\":1407952908,\"last_tagged_uri\":\"qmqcudp\"}}}")
                        .toObject(Components1Nx5U76ResponsesTagsNewContentApplicationJsonSchema.class);
        Assertions.assertEquals("t", model.getTag().getName());
    }

    @Test
    public void testSerialize() {
        Components1Nx5U76ResponsesTagsNewContentApplicationJsonSchema model =
                new Components1Nx5U76ResponsesTagsNewContentApplicationJsonSchema().setTag(new Tags().setName("t"));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Nx5U76ResponsesTagsNewContentApplicationJsonSchema.class);
        Assertions.assertEquals("t", model.getTag().getName());
    }
}
