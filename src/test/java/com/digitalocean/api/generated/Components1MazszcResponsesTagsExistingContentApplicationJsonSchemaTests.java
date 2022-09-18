package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1MazszcResponsesTagsExistingContentApplicationJsonSchema;
import com.digitalocean.api.models.Tags;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1MazszcResponsesTagsExistingContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1MazszcResponsesTagsExistingContentApplicationJsonSchema model = BinaryData.fromString("{\"tag\":{\"name\":\"fzcfdtstiax\",\"resources\":{\"count\":1457111562,\"last_tagged_uri\":\"pisqbcmlroiom\"}}}").toObject(Components1MazszcResponsesTagsExistingContentApplicationJsonSchema.class);
        Assertions.assertEquals("fzcfdtstiax", model.getTag().getName());
    }

    @Test
    public void testSerialize() {
        Components1MazszcResponsesTagsExistingContentApplicationJsonSchema model = new Components1MazszcResponsesTagsExistingContentApplicationJsonSchema().setTag(new Tags().setName("fzcfdtstiax"));
        model = BinaryData.fromObject(model).toObject(Components1MazszcResponsesTagsExistingContentApplicationJsonSchema.class);
        Assertions.assertEquals("fzcfdtstiax", model.getTag().getName());
    }
}
