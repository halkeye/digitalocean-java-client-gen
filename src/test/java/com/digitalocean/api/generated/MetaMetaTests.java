package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.MetaProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MetaMetaTests {
    @Test
    public void testDeserialize() {
        MetaMeta model = BinaryData.fromString("{\"total\":2090543753}").toObject(MetaMeta.class);
        Assertions.assertEquals(2090543753, model.getTotal());
    }

    @Test
    public void testSerialize() {
        MetaMeta model = new MetaMeta().setTotal(2090543753);
        model = BinaryData.fromObject(model).toObject(MetaMeta.class);
        Assertions.assertEquals(2090543753, model.getTotal());
    }
}
