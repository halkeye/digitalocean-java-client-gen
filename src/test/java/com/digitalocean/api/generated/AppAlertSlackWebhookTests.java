package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppAlertSlackWebhook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppAlertSlackWebhookTests {
    @Test
    public void testDeserialize() {
        AppAlertSlackWebhook model =
                BinaryData.fromString("{\"url\":\"apfgsdpcvessm\",\"channel\":\"h\"}")
                        .toObject(AppAlertSlackWebhook.class);
        Assertions.assertEquals("apfgsdpcvessm", model.getUrl());
        Assertions.assertEquals("h", model.getChannel());
    }

    @Test
    public void testSerialize() {
        AppAlertSlackWebhook model = new AppAlertSlackWebhook().setUrl("apfgsdpcvessm").setChannel("h");
        model = BinaryData.fromObject(model).toObject(AppAlertSlackWebhook.class);
        Assertions.assertEquals("apfgsdpcvessm", model.getUrl());
        Assertions.assertEquals("h", model.getChannel());
    }
}
