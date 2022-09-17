package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.SlackDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SlackDetailsTests {
    @Test
    public void testDeserialize() {
        SlackDetails model =
                BinaryData.fromString("{\"channel\":\"nczk\",\"url\":\"ihvtuwyjsqw\"}").toObject(SlackDetails.class);
        Assertions.assertEquals("nczk", model.getChannel());
        Assertions.assertEquals("ihvtuwyjsqw", model.getUrl());
    }

    @Test
    public void testSerialize() {
        SlackDetails model = new SlackDetails().setChannel("nczk").setUrl("ihvtuwyjsqw");
        model = BinaryData.fromObject(model).toObject(SlackDetails.class);
        Assertions.assertEquals("nczk", model.getChannel());
        Assertions.assertEquals("ihvtuwyjsqw", model.getUrl());
    }
}
