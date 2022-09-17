package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsStringMatch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsStringMatchTests {
    @Test
    public void testDeserialize() {
        AppsStringMatch model =
                BinaryData.fromString("{\"exact\":\"vlerchpqbmfpjba\",\"prefix\":\"idfcxsspuunnoxyh\",\"regex\":\"g\"}")
                        .toObject(AppsStringMatch.class);
        Assertions.assertEquals("vlerchpqbmfpjba", model.getExact());
        Assertions.assertEquals("idfcxsspuunnoxyh", model.getPrefix());
        Assertions.assertEquals("g", model.getRegex());
    }

    @Test
    public void testSerialize() {
        AppsStringMatch model =
                new AppsStringMatch().setExact("vlerchpqbmfpjba").setPrefix("idfcxsspuunnoxyh").setRegex("g");
        model = BinaryData.fromObject(model).toObject(AppsStringMatch.class);
        Assertions.assertEquals("vlerchpqbmfpjba", model.getExact());
        Assertions.assertEquals("idfcxsspuunnoxyh", model.getPrefix());
        Assertions.assertEquals("g", model.getRegex());
    }
}
