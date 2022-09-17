package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsO4VmziResponsesClusterlintRunContentApplicationJsonSchema;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsO4VmziResponsesClusterlintRunContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsO4VmziResponsesClusterlintRunContentApplicationJsonSchema model =
                BinaryData.fromString("{\"run_id\":\"kjunzxezriwgoew\"}")
                        .toObject(ComponentsO4VmziResponsesClusterlintRunContentApplicationJsonSchema.class);
        Assertions.assertEquals("kjunzxezriwgoew", model.getRunId());
    }

    @Test
    public void testSerialize() {
        ComponentsO4VmziResponsesClusterlintRunContentApplicationJsonSchema model =
                new ComponentsO4VmziResponsesClusterlintRunContentApplicationJsonSchema().setRunId("kjunzxezriwgoew");
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsO4VmziResponsesClusterlintRunContentApplicationJsonSchema.class);
        Assertions.assertEquals("kjunzxezriwgoew", model.getRunId());
    }
}
