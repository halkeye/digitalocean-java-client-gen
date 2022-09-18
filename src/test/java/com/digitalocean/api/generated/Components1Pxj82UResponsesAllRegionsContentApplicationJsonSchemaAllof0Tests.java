package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Pxj82UResponsesAllRegionsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Region;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Pxj82UResponsesAllRegionsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1Pxj82UResponsesAllRegionsContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"regions\":[{\"name\":\"aovphirlzbipi\",\"slug\":\"nnepkwzzzku\",\"available\":false}]}").toObject(Components1Pxj82UResponsesAllRegionsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("aovphirlzbipi", model.getRegions().get(0).getName());
        Assertions.assertEquals("nnepkwzzzku", model.getRegions().get(0).getSlug());
        Assertions.assertEquals(false, model.getRegions().get(0).isAvailable());
    }

    @Test
    public void testSerialize() {
        Components1Pxj82UResponsesAllRegionsContentApplicationJsonSchemaAllof0 model = new Components1Pxj82UResponsesAllRegionsContentApplicationJsonSchemaAllof0().setRegions(Arrays.asList(new Region().setName("aovphirlzbipi").setSlug("nnepkwzzzku").setAvailable(false)));
        model = BinaryData.fromObject(model).toObject(Components1Pxj82UResponsesAllRegionsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("aovphirlzbipi", model.getRegions().get(0).getName());
        Assertions.assertEquals("nnepkwzzzku", model.getRegions().get(0).getSlug());
        Assertions.assertEquals(false, model.getRegions().get(0).isAvailable());
    }
}
