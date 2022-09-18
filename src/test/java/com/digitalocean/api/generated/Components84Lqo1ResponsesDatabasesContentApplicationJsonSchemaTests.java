package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components84Lqo1ResponsesDatabasesContentApplicationJsonSchema;
import com.digitalocean.api.models.Database;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components84Lqo1ResponsesDatabasesContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components84Lqo1ResponsesDatabasesContentApplicationJsonSchema model = BinaryData.fromString("{\"dbs\":[{\"name\":\"cnadbuwqrgxf\"},{\"name\":\"lmqiynezoel\"}]}").toObject(Components84Lqo1ResponsesDatabasesContentApplicationJsonSchema.class);
        Assertions.assertEquals("cnadbuwqrgxf", model.getDbs().get(0).getName());
    }

    @Test
    public void testSerialize() {
        Components84Lqo1ResponsesDatabasesContentApplicationJsonSchema model = new Components84Lqo1ResponsesDatabasesContentApplicationJsonSchema().setDbs(Arrays.asList(new Database().setName("cnadbuwqrgxf"), new Database().setName("lmqiynezoel")));
        model = BinaryData.fromObject(model).toObject(Components84Lqo1ResponsesDatabasesContentApplicationJsonSchema.class);
        Assertions.assertEquals("cnadbuwqrgxf", model.getDbs().get(0).getName());
    }
}
