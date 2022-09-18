package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components10939PsResponsesVolumeContentApplicationJsonSchema;
import com.digitalocean.api.models.VolumeFull;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components10939PsResponsesVolumeContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components10939PsResponsesVolumeContentApplicationJsonSchema model = BinaryData.fromString("{\"volume\":{\"region\":{\"name\":\"tih\",\"slug\":\"vis\",\"available\":false},\"filesystem_type\":\"jhxvpmqququx\",\"filesystem_label\":\"hngrxl\",\"id\":\"oweorocrq\",\"droplet_ids\":[178905208],\"name\":\"tgbqpfyrv\",\"description\":\"vijvwmrgcnzhr\",\"size_gigabytes\":1769644498,\"created_at\":\"fmbzquuutqmh\",\"tags\":[\"yzycgcmbkygv\",\"jdqosxzmdzlybqfu\"]}}").toObject(Components10939PsResponsesVolumeContentApplicationJsonSchema.class);
        Assertions.assertEquals("tgbqpfyrv", model.getVolume().getName());
        Assertions.assertEquals("vijvwmrgcnzhr", model.getVolume().getDescription());
        Assertions.assertEquals(1769644498, model.getVolume().getSizeGigabytes());
        Assertions.assertEquals("yzycgcmbkygv", model.getVolume().getTags().get(0));
        Assertions.assertEquals("jhxvpmqququx", model.getVolume().getFilesystemType());
        Assertions.assertEquals("hngrxl", model.getVolume().getFilesystemLabel());
    }

    @Test
    public void testSerialize() {
        Components10939PsResponsesVolumeContentApplicationJsonSchema model = new Components10939PsResponsesVolumeContentApplicationJsonSchema().setVolume(new VolumeFull().setName("tgbqpfyrv").setDescription("vijvwmrgcnzhr").setSizeGigabytes(1769644498).setTags(Arrays.asList("yzycgcmbkygv", "jdqosxzmdzlybqfu")).setFilesystemType("jhxvpmqququx").setFilesystemLabel("hngrxl"));
        model = BinaryData.fromObject(model).toObject(Components10939PsResponsesVolumeContentApplicationJsonSchema.class);
        Assertions.assertEquals("tgbqpfyrv", model.getVolume().getName());
        Assertions.assertEquals("vijvwmrgcnzhr", model.getVolume().getDescription());
        Assertions.assertEquals(1769644498, model.getVolume().getSizeGigabytes());
        Assertions.assertEquals("yzycgcmbkygv", model.getVolume().getTags().get(0));
        Assertions.assertEquals("jhxvpmqququx", model.getVolume().getFilesystemType());
        Assertions.assertEquals("hngrxl", model.getVolume().getFilesystemLabel());
    }
}
