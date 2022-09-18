package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsImageSourceSpec;
import com.digitalocean.api.models.AppsImageSourceSpecRegistryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsImageSourceSpecTests {
    @Test
    public void testDeserialize() {
        AppsImageSourceSpec model = BinaryData.fromString("{\"registry\":\"qvkjlmxho\",\"registry_type\":\"DOCR\",\"repository\":\"hdwdi\",\"tag\":\"mbnraauzzp\"}").toObject(AppsImageSourceSpec.class);
        Assertions.assertEquals("qvkjlmxho", model.getRegistry());
        Assertions.assertEquals(AppsImageSourceSpecRegistryType.DOCR, model.getRegistryType());
        Assertions.assertEquals("hdwdi", model.getRepository());
        Assertions.assertEquals("mbnraauzzp", model.getTag());
    }

    @Test
    public void testSerialize() {
        AppsImageSourceSpec model = new AppsImageSourceSpec().setRegistry("qvkjlmxho").setRegistryType(AppsImageSourceSpecRegistryType.DOCR).setRepository("hdwdi").setTag("mbnraauzzp");
        model = BinaryData.fromObject(model).toObject(AppsImageSourceSpec.class);
        Assertions.assertEquals("qvkjlmxho", model.getRegistry());
        Assertions.assertEquals(AppsImageSourceSpecRegistryType.DOCR, model.getRegistryType());
        Assertions.assertEquals("hdwdi", model.getRepository());
        Assertions.assertEquals("mbnraauzzp", model.getTag());
    }
}
