package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Ca;
import com.digitalocean.api.models.ComponentsMr31FwResponsesCaContentApplicationJsonSchema;
import org.junit.jupiter.api.Test;

public final class ComponentsMr31FwResponsesCaContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsMr31FwResponsesCaContentApplicationJsonSchema model =
                BinaryData.fromString("{\"ca\":{\"certificate\":\"lfmn\"}}")
                        .toObject(ComponentsMr31FwResponsesCaContentApplicationJsonSchema.class);
    }

    @Test
    public void testSerialize() {
        ComponentsMr31FwResponsesCaContentApplicationJsonSchema model =
                new ComponentsMr31FwResponsesCaContentApplicationJsonSchema().setCa(new Ca());
        model = BinaryData.fromObject(model).toObject(ComponentsMr31FwResponsesCaContentApplicationJsonSchema.class);
    }
}
