package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Alerts;
import com.digitalocean.api.models.SlackDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AlertsTests {
    @Test
    public void testDeserialize() {
        Alerts model =
                BinaryData.fromString(
                                "{\"email\":[\"mjmoplu\",\"fykkfhsovadkrm\",\"xmwqpdkesjqbzkq\"],\"slack\":[{\"channel\":\"vporiwbwggi\",\"url\":\"tspzjnrr\"},{\"channel\":\"ikwsbzrhdugq\",\"url\":\"htrgz\"},{\"channel\":\"ru\",\"url\":\"jfhrjhiycbause\"}]}")
                        .toObject(Alerts.class);
        Assertions.assertEquals("mjmoplu", model.getEmail().get(0));
        Assertions.assertEquals("vporiwbwggi", model.getSlack().get(0).getChannel());
        Assertions.assertEquals("tspzjnrr", model.getSlack().get(0).getUrl());
    }

    @Test
    public void testSerialize() {
        Alerts model =
                new Alerts()
                        .setEmail(Arrays.asList("mjmoplu", "fykkfhsovadkrm", "xmwqpdkesjqbzkq"))
                        .setSlack(
                                Arrays.asList(
                                        new SlackDetails().setChannel("vporiwbwggi").setUrl("tspzjnrr"),
                                        new SlackDetails().setChannel("ikwsbzrhdugq").setUrl("htrgz"),
                                        new SlackDetails().setChannel("ru").setUrl("jfhrjhiycbause")));
        model = BinaryData.fromObject(model).toObject(Alerts.class);
        Assertions.assertEquals("mjmoplu", model.getEmail().get(0));
        Assertions.assertEquals("vporiwbwggi", model.getSlack().get(0).getChannel());
        Assertions.assertEquals("tspzjnrr", model.getSlack().get(0).getUrl());
    }
}
