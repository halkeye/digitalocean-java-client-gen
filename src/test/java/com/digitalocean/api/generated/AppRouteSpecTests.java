package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppRouteSpec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppRouteSpecTests {
    @Test
    public void testDeserialize() {
        AppRouteSpec model =
                BinaryData.fromString("{\"path\":\"l\",\"preserve_path_prefix\":false}").toObject(AppRouteSpec.class);
        Assertions.assertEquals("l", model.getPath());
        Assertions.assertEquals(false, model.isPreservePathPrefix());
    }

    @Test
    public void testSerialize() {
        AppRouteSpec model = new AppRouteSpec().setPath("l").setPreservePathPrefix(false);
        model = BinaryData.fromObject(model).toObject(AppRouteSpec.class);
        Assertions.assertEquals("l", model.getPath());
        Assertions.assertEquals(false, model.isPreservePathPrefix());
    }
}
