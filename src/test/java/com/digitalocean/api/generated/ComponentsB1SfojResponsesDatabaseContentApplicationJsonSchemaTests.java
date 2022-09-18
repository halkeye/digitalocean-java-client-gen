package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsB1SfojResponsesDatabaseContentApplicationJsonSchema;
import com.digitalocean.api.models.Database;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsB1SfojResponsesDatabaseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsB1SfojResponsesDatabaseContentApplicationJsonSchema model = BinaryData.fromString("{\"db\":{\"name\":\"djf\"}}").toObject(ComponentsB1SfojResponsesDatabaseContentApplicationJsonSchema.class);
        Assertions.assertEquals("djf", model.getDb().getName());
    }

    @Test
    public void testSerialize() {
        ComponentsB1SfojResponsesDatabaseContentApplicationJsonSchema model = new ComponentsB1SfojResponsesDatabaseContentApplicationJsonSchema().setDb(new Database().setName("djf"));
        model = BinaryData.fromObject(model).toObject(ComponentsB1SfojResponsesDatabaseContentApplicationJsonSchema.class);
        Assertions.assertEquals("djf", model.getDb().getName());
    }
}
