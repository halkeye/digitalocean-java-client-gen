package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Roprh1ResponsesDatabaseConfigContentApplicationJsonSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Roprh1ResponsesDatabaseConfigContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Roprh1ResponsesDatabaseConfigContentApplicationJsonSchema model = BinaryData.fromString("{}").toObject(Components1Roprh1ResponsesDatabaseConfigContentApplicationJsonSchema.class);
    }

    @Test
    public void testSerialize() {
        Components1Roprh1ResponsesDatabaseConfigContentApplicationJsonSchema model = new Components1Roprh1ResponsesDatabaseConfigContentApplicationJsonSchema();
        model = BinaryData.fromObject(model).toObject(Components1Roprh1ResponsesDatabaseConfigContentApplicationJsonSchema.class);
    }
}
