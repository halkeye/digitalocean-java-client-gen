package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Region;
import com.digitalocean.api.models.RegionList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RegionListTests {
    @Test
    public void testDeserialize() {
        RegionList model = BinaryData.fromString("{\"regions\":[{\"name\":\"aovphirlzbipi\",\"slug\":\"nnepkwzzzku\",\"available\":false}]}").toObject(RegionList.class);
        Assertions.assertEquals("aovphirlzbipi", model.getRegions().get(0).getName());
        Assertions.assertEquals("nnepkwzzzku", model.getRegions().get(0).getSlug());
        Assertions.assertEquals(false, model.getRegions().get(0).isAvailable());
    }

    @Test
    public void testSerialize() {
        RegionList model = new RegionList().setRegions(Arrays.asList(new Region().setName("aovphirlzbipi").setSlug("nnepkwzzzku").setAvailable(false)));
        model = BinaryData.fromObject(model).toObject(RegionList.class);
        Assertions.assertEquals("aovphirlzbipi", model.getRegions().get(0).getName());
        Assertions.assertEquals("nnepkwzzzku", model.getRegions().get(0).getSlug());
        Assertions.assertEquals(false, model.getRegions().get(0).isAvailable());
    }
}
