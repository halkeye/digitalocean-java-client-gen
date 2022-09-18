package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.MetaProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MetaPropertiesTests {
    @Test
    public void testDeserialize() {
        MetaProperties model = BinaryData.fromString("{\"total\":79874551}").toObject(MetaProperties.class);
        Assertions.assertEquals(79874551, model.getTotal());
    }

    @Test
    public void testSerialize() {
        MetaProperties model = new MetaProperties().setTotal(79874551);
        model = BinaryData.fromObject(model).toObject(MetaProperties.class);
        Assertions.assertEquals(79874551, model.getTotal());
    }
}
