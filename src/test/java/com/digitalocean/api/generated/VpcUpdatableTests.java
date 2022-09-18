package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.VpcUpdatable;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VpcUpdatableTests {
    @Test
    public void testDeserialize() {
        VpcUpdatable model = BinaryData.fromString("{\"name\":\"prklatwiuujxsuj\",\"description\":\"wgxeegxbn\"}").toObject(VpcUpdatable.class);
        Assertions.assertEquals("prklatwiuujxsuj", model.getName());
        Assertions.assertEquals("wgxeegxbn", model.getDescription());
    }

    @Test
    public void testSerialize() {
        VpcUpdatable model = new VpcUpdatable().setName("prklatwiuujxsuj").setDescription("wgxeegxbn");
        model = BinaryData.fromObject(model).toObject(VpcUpdatable.class);
        Assertions.assertEquals("prklatwiuujxsuj", model.getName());
        Assertions.assertEquals("wgxeegxbn", model.getDescription());
    }
}
