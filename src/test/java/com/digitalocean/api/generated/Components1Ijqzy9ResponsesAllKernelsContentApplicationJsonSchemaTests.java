package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Ijqzy9ResponsesAllKernelsContentApplicationJsonSchema;
import com.digitalocean.api.models.ComponentsL46Y0QResponsesAllKernelsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Kernel;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Ijqzy9ResponsesAllKernelsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Ijqzy9ResponsesAllKernelsContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":1796482206},\"kernels\":[{\"id\":29169727,\"name\":\"jsqy\",\"version\":\"moxfablq\"},{\"id\":1071274522,\"name\":\"mwh\",\"version\":\"ali\"}]}").toObject(Components1Ijqzy9ResponsesAllKernelsContentApplicationJsonSchema.class);
        Assertions.assertEquals(29169727, model.getKernels().get(0).getId());
        Assertions.assertEquals("jsqy", model.getKernels().get(0).getName());
        Assertions.assertEquals("moxfablq", model.getKernels().get(0).getVersion());
        Assertions.assertEquals(1796482206, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1Ijqzy9ResponsesAllKernelsContentApplicationJsonSchema model = new Components1Ijqzy9ResponsesAllKernelsContentApplicationJsonSchema().setKernels(Arrays.asList(new Kernel().setId(29169727).setName("jsqy").setVersion("moxfablq"), new Kernel().setId(1071274522).setName("mwh").setVersion("ali"))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(1796482206));
        model = BinaryData.fromObject(model).toObject(Components1Ijqzy9ResponsesAllKernelsContentApplicationJsonSchema.class);
        Assertions.assertEquals(29169727, model.getKernels().get(0).getId());
        Assertions.assertEquals("jsqy", model.getKernels().get(0).getName());
        Assertions.assertEquals("moxfablq", model.getKernels().get(0).getVersion());
        Assertions.assertEquals(1796482206, model.getMeta().getTotal());
    }
}
