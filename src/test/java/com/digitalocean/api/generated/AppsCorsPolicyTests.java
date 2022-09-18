package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsCorsPolicy;
import com.digitalocean.api.models.AppsStringMatch;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsCorsPolicyTests {
    @Test
    public void testDeserialize() {
        AppsCorsPolicy model = BinaryData.fromString("{\"allow_origins\":[{\"exact\":\"azur\",\"prefix\":\"cbgoor\",\"regex\":\"eoybfhjxakvvjgs\"},{\"exact\":\"r\",\"prefix\":\"lmywwtkgkxnyed\",\"regex\":\"gyvudtjuewbc\"},{\"exact\":\"xuuwhcj\",\"prefix\":\"ccybvp\",\"regex\":\"akkud\"},{\"exact\":\"xgwjplmagstcyoh\",\"prefix\":\"kyrk\",\"regex\":\"dg\"}],\"allow_methods\":[\"sjkmnwqj\"],\"allow_headers\":[\"aiy\",\"ddviacegfnmntfpm\",\"memfnczdwvvbalxl\",\"lchpodbzevwrdn\"],\"expose_headers\":[\"kuvsjcswsm\"],\"max_age\":\"tuluq\",\"allow_credentials\":false}").toObject(AppsCorsPolicy.class);
        Assertions.assertEquals("azur", model.getAllowOrigins().get(0).getExact());
        Assertions.assertEquals("cbgoor", model.getAllowOrigins().get(0).getPrefix());
        Assertions.assertEquals("eoybfhjxakvvjgs", model.getAllowOrigins().get(0).getRegex());
        Assertions.assertEquals("sjkmnwqj", model.getAllowMethods().get(0));
        Assertions.assertEquals("aiy", model.getAllowHeaders().get(0));
        Assertions.assertEquals("kuvsjcswsm", model.getExposeHeaders().get(0));
        Assertions.assertEquals("tuluq", model.getMaxAge());
        Assertions.assertEquals(false, model.isAllowCredentials());
    }

    @Test
    public void testSerialize() {
        AppsCorsPolicy model = new AppsCorsPolicy().setAllowOrigins(Arrays.asList(new AppsStringMatch().setExact("azur").setPrefix("cbgoor").setRegex("eoybfhjxakvvjgs"), new AppsStringMatch().setExact("r").setPrefix("lmywwtkgkxnyed").setRegex("gyvudtjuewbc"), new AppsStringMatch().setExact("xuuwhcj").setPrefix("ccybvp").setRegex("akkud"), new AppsStringMatch().setExact("xgwjplmagstcyoh").setPrefix("kyrk").setRegex("dg"))).setAllowMethods(Arrays.asList("sjkmnwqj")).setAllowHeaders(Arrays.asList("aiy", "ddviacegfnmntfpm", "memfnczdwvvbalxl", "lchpodbzevwrdn")).setExposeHeaders(Arrays.asList("kuvsjcswsm")).setMaxAge("tuluq").setAllowCredentials(false);
        model = BinaryData.fromObject(model).toObject(AppsCorsPolicy.class);
        Assertions.assertEquals("azur", model.getAllowOrigins().get(0).getExact());
        Assertions.assertEquals("cbgoor", model.getAllowOrigins().get(0).getPrefix());
        Assertions.assertEquals("eoybfhjxakvvjgs", model.getAllowOrigins().get(0).getRegex());
        Assertions.assertEquals("sjkmnwqj", model.getAllowMethods().get(0));
        Assertions.assertEquals("aiy", model.getAllowHeaders().get(0));
        Assertions.assertEquals("kuvsjcswsm", model.getExposeHeaders().get(0));
        Assertions.assertEquals("tuluq", model.getMaxAge());
        Assertions.assertEquals(false, model.isAllowCredentials());
    }
}
