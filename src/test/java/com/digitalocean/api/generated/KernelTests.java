package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Kernel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class KernelTests {
    @Test
    public void testDeserialize() {
        Kernel model =
                BinaryData.fromString("{\"id\":1414494959,\"name\":\"odfcbjq\",\"version\":\"mtqsmoxsazu\"}")
                        .toObject(Kernel.class);
        Assertions.assertEquals(1414494959, model.getId());
        Assertions.assertEquals("odfcbjq", model.getName());
        Assertions.assertEquals("mtqsmoxsazu", model.getVersion());
    }

    @Test
    public void testSerialize() {
        Kernel model = new Kernel().setId(1414494959).setName("odfcbjq").setVersion("mtqsmoxsazu");
        model = BinaryData.fromObject(model).toObject(Kernel.class);
        Assertions.assertEquals(1414494959, model.getId());
        Assertions.assertEquals("odfcbjq", model.getName());
        Assertions.assertEquals("mtqsmoxsazu", model.getVersion());
    }
}
