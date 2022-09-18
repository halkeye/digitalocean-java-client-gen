package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.VolumeBase;
import com.digitalocean.api.models.VolumeFull;
import com.digitalocean.api.models.VolumeFullRegion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeFullTests {
    @Test
    public void testDeserialize() {
        VolumeFull model = BinaryData.fromString("{\"region\":{\"name\":\"fnhcg\",\"slug\":\"aqsr\",\"available\":false},\"filesystem_type\":\"qderkrgsdcobpm\",\"filesystem_label\":\"lwyqznbby\",\"id\":\"oszfut\",\"droplet_ids\":[1819915063,44366684],\"name\":\"nbcmoiqgtzpvqew\",\"description\":\"wzhxzuxerxhywl\",\"size_gigabytes\":798198280,\"created_at\":\"qvvdkfpfjdajdqx\",\"tags\":[\"xyfrdjidc\",\"tfvgwfwsldigwo\",\"ppvydd\",\"svclr\"]}").toObject(VolumeFull.class);
        Assertions.assertEquals("nbcmoiqgtzpvqew", model.getName());
        Assertions.assertEquals("wzhxzuxerxhywl", model.getDescription());
        Assertions.assertEquals(798198280, model.getSizeGigabytes());
        Assertions.assertEquals("xyfrdjidc", model.getTags().get(0));
        Assertions.assertEquals("qderkrgsdcobpm", model.getFilesystemType());
        Assertions.assertEquals("lwyqznbby", model.getFilesystemLabel());
    }

    @Test
    public void testSerialize() {
        VolumeFull model = new VolumeFull().setName("nbcmoiqgtzpvqew").setDescription("wzhxzuxerxhywl").setSizeGigabytes(798198280).setTags(Arrays.asList("xyfrdjidc", "tfvgwfwsldigwo", "ppvydd", "svclr")).setFilesystemType("qderkrgsdcobpm").setFilesystemLabel("lwyqznbby");
        model = BinaryData.fromObject(model).toObject(VolumeFull.class);
        Assertions.assertEquals("nbcmoiqgtzpvqew", model.getName());
        Assertions.assertEquals("wzhxzuxerxhywl", model.getDescription());
        Assertions.assertEquals(798198280, model.getSizeGigabytes());
        Assertions.assertEquals("xyfrdjidc", model.getTags().get(0));
        Assertions.assertEquals("qderkrgsdcobpm", model.getFilesystemType());
        Assertions.assertEquals("lwyqznbby", model.getFilesystemLabel());
    }
}
