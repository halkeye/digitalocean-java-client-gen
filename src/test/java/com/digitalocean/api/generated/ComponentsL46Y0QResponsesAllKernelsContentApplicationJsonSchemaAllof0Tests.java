package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsL46Y0QResponsesAllKernelsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Kernel;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsL46Y0QResponsesAllKernelsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsL46Y0QResponsesAllKernelsContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"kernels\":[{\"id\":1968581632,\"name\":\"wplrrbphc\",\"version\":\"bb\"},{\"id\":626572262,\"name\":\"cu\",\"version\":\"vumspbfsf\"},{\"id\":1780620224,\"name\":\"ewfcuqfpyyxmzrm\",\"version\":\"vwituw\"},{\"id\":1767191865,\"name\":\"shcybwfuppox\",\"version\":\"cmvouujxdiikmoxr\"}]}")
                        .toObject(ComponentsL46Y0QResponsesAllKernelsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(1968581632, model.getKernels().get(0).getId());
        Assertions.assertEquals("wplrrbphc", model.getKernels().get(0).getName());
        Assertions.assertEquals("bb", model.getKernels().get(0).getVersion());
    }

    @Test
    public void testSerialize() {
        ComponentsL46Y0QResponsesAllKernelsContentApplicationJsonSchemaAllof0 model =
                new ComponentsL46Y0QResponsesAllKernelsContentApplicationJsonSchemaAllof0()
                        .setKernels(
                                Arrays.asList(
                                        new Kernel().setId(1968581632).setName("wplrrbphc").setVersion("bb"),
                                        new Kernel().setId(626572262).setName("cu").setVersion("vumspbfsf"),
                                        new Kernel().setId(1780620224).setName("ewfcuqfpyyxmzrm").setVersion("vwituw"),
                                        new Kernel()
                                                .setId(1767191865)
                                                .setName("shcybwfuppox")
                                                .setVersion("cmvouujxdiikmoxr")));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsL46Y0QResponsesAllKernelsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(1968581632, model.getKernels().get(0).getId());
        Assertions.assertEquals("wplrrbphc", model.getKernels().get(0).getName());
        Assertions.assertEquals("bb", model.getKernels().get(0).getVersion());
    }
}
