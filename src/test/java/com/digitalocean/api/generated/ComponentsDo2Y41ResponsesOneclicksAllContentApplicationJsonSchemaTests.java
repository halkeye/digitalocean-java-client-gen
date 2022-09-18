package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsDo2Y41ResponsesOneclicksAllContentApplicationJsonSchema;
import com.digitalocean.api.models.OneClicks;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsDo2Y41ResponsesOneclicksAllContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsDo2Y41ResponsesOneclicksAllContentApplicationJsonSchema model = BinaryData.fromString("{\"1_clicks\":[{\"slug\":\"hq\",\"type\":\"vgjxpybczm\"},{\"slug\":\"hmtzopbsphrup\",\"type\":\"dgs\"},{\"slug\":\"bb\",\"type\":\"jhphoyc\"}]}").toObject(ComponentsDo2Y41ResponsesOneclicksAllContentApplicationJsonSchema.class);
        Assertions.assertEquals("hq", model.getOneClicks().get(0).getSlug());
        Assertions.assertEquals("vgjxpybczm", model.getOneClicks().get(0).getType());
    }

    @Test
    public void testSerialize() {
        ComponentsDo2Y41ResponsesOneclicksAllContentApplicationJsonSchema model = new ComponentsDo2Y41ResponsesOneclicksAllContentApplicationJsonSchema().setOneClicks(Arrays.asList(new OneClicks().setSlug("hq").setType("vgjxpybczm"), new OneClicks().setSlug("hmtzopbsphrup").setType("dgs"), new OneClicks().setSlug("bb").setType("jhphoyc")));
        model = BinaryData.fromObject(model).toObject(ComponentsDo2Y41ResponsesOneclicksAllContentApplicationJsonSchema.class);
        Assertions.assertEquals("hq", model.getOneClicks().get(0).getSlug());
        Assertions.assertEquals("vgjxpybczm", model.getOneClicks().get(0).getType());
    }
}
