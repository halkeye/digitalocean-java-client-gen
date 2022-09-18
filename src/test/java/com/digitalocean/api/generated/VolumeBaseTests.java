package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.VolumeBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeBaseTests {
    @Test
    public void testDeserialize() {
        VolumeBase model = BinaryData.fromString("{\"id\":\"iti\",\"droplet_ids\":[631438840],\"name\":\"smkir\",\"description\":\"n\",\"size_gigabytes\":1096028966,\"created_at\":\"m\",\"tags\":[\"omeobwkeuzltenlb\"]}").toObject(VolumeBase.class);
        Assertions.assertEquals("smkir", model.getName());
        Assertions.assertEquals("n", model.getDescription());
        Assertions.assertEquals(1096028966, model.getSizeGigabytes());
        Assertions.assertEquals("omeobwkeuzltenlb", model.getTags().get(0));
    }

    @Test
    public void testSerialize() {
        VolumeBase model = new VolumeBase().setName("smkir").setDescription("n").setSizeGigabytes(1096028966).setTags(Arrays.asList("omeobwkeuzltenlb"));
        model = BinaryData.fromObject(model).toObject(VolumeBase.class);
        Assertions.assertEquals("smkir", model.getName());
        Assertions.assertEquals("n", model.getDescription());
        Assertions.assertEquals(1096028966, model.getSizeGigabytes());
        Assertions.assertEquals("omeobwkeuzltenlb", model.getTags().get(0));
    }
}
