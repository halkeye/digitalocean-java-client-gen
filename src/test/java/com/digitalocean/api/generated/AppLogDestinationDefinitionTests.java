package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppLogDestinationDatadogSpec;
import com.digitalocean.api.models.AppLogDestinationDefinition;
import com.digitalocean.api.models.AppLogDestinationLogtailSpec;
import com.digitalocean.api.models.AppLogDestinationPapertrailSpec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppLogDestinationDefinitionTests {
    @Test
    public void testDeserialize() {
        AppLogDestinationDefinition model =
                BinaryData.fromString(
                                "{\"name\":\"hhqyi\",\"papertrail\":{\"endpoint\":\"y\"},\"datadog\":{\"endpoint\":\"yavluwmncstt\",\"api_key\":\"jfybvpoekrsgsgb\"},\"logtail\":{\"token\":\"zq\"}}")
                        .toObject(AppLogDestinationDefinition.class);
        Assertions.assertEquals("hhqyi", model.getName());
        Assertions.assertEquals("y", model.getPapertrail().getEndpoint());
        Assertions.assertEquals("yavluwmncstt", model.getDatadog().getEndpoint());
        Assertions.assertEquals("jfybvpoekrsgsgb", model.getDatadog().getApiKey());
        Assertions.assertEquals("zq", model.getLogtail().getToken());
    }

    @Test
    public void testSerialize() {
        AppLogDestinationDefinition model =
                new AppLogDestinationDefinition()
                        .setName("hhqyi")
                        .setPapertrail(new AppLogDestinationPapertrailSpec().setEndpoint("y"))
                        .setDatadog(
                                new AppLogDestinationDatadogSpec()
                                        .setEndpoint("yavluwmncstt")
                                        .setApiKey("jfybvpoekrsgsgb"))
                        .setLogtail(new AppLogDestinationLogtailSpec().setToken("zq"));
        model = BinaryData.fromObject(model).toObject(AppLogDestinationDefinition.class);
        Assertions.assertEquals("hhqyi", model.getName());
        Assertions.assertEquals("y", model.getPapertrail().getEndpoint());
        Assertions.assertEquals("yavluwmncstt", model.getDatadog().getEndpoint());
        Assertions.assertEquals("jfybvpoekrsgsgb", model.getDatadog().getApiKey());
        Assertions.assertEquals("zq", model.getLogtail().getToken());
    }
}
