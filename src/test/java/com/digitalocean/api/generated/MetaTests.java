package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Meta;
import com.digitalocean.api.models.MetaMeta;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MetaTests {
    @Test
    public void testDeserialize() {
        Meta model = BinaryData.fromString("{\"meta\":{\"total\":1511051439}}").toObject(Meta.class);
        Assertions.assertEquals(1511051439, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Meta model = new Meta().setMeta(new MetaMeta().setTotal(1511051439));
        model = BinaryData.fromObject(model).toObject(Meta.class);
        Assertions.assertEquals(1511051439, model.getMeta().getTotal());
    }
}
