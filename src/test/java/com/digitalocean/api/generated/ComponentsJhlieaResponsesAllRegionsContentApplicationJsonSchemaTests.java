package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsJhlieaResponsesAllRegionsContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Region;
import com.digitalocean.api.models.RegionList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsJhlieaResponsesAllRegionsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsJhlieaResponsesAllRegionsContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":460864060},\"regions\":[{\"name\":\"c\",\"slug\":\"xvlqgfbrve\",\"available\":true}]}").toObject(ComponentsJhlieaResponsesAllRegionsContentApplicationJsonSchema.class);
        Assertions.assertEquals("c", model.getRegions().get(0).getName());
        Assertions.assertEquals("xvlqgfbrve", model.getRegions().get(0).getSlug());
        Assertions.assertEquals(true, model.getRegions().get(0).isAvailable());
        Assertions.assertEquals(460864060, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsJhlieaResponsesAllRegionsContentApplicationJsonSchema model = new ComponentsJhlieaResponsesAllRegionsContentApplicationJsonSchema().setRegions(Arrays.asList(new Region().setName("c").setSlug("xvlqgfbrve").setAvailable(true))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(460864060));
        model = BinaryData.fromObject(model).toObject(ComponentsJhlieaResponsesAllRegionsContentApplicationJsonSchema.class);
        Assertions.assertEquals("c", model.getRegions().get(0).getName());
        Assertions.assertEquals("xvlqgfbrve", model.getRegions().get(0).getSlug());
        Assertions.assertEquals(true, model.getRegions().get(0).isAvailable());
        Assertions.assertEquals(460864060, model.getMeta().getTotal());
    }
}
