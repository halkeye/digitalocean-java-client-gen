package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components1IjwlbpResponsesGetImageActionsResponseContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Region;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1IjwlbpResponsesGetImageActionsResponseContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1IjwlbpResponsesGetImageActionsResponseContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"actions\":[{\"id\":966257553,\"status\":\"errored\",\"type\":\"jbuiggru\",\"started_at\":\"2020-12-30T19:36:44Z\",\"completed_at\":\"2021-02-17T05:30:41Z\",\"resource_id\":1230067348,\"resource_type\":\"jthoivsdwsngkr\",\"region\":{\"name\":\"hscj\",\"slug\":\"akmhz\",\"available\":false}},{\"id\":291291416,\"status\":\"in-progress\",\"type\":\"i\",\"started_at\":\"2021-07-16T06:44:29Z\",\"completed_at\":\"2021-11-19T13:12:55Z\",\"resource_id\":179069264,\"resource_type\":\"ynuqqkotauratnic\",\"region\":{\"name\":\"fzs\",\"slug\":\"le\",\"available\":true}},{\"id\":1694812131,\"status\":\"errored\",\"type\":\"qlmfdg\",\"started_at\":\"2021-08-19T08:57:05Z\",\"completed_at\":\"2021-03-10T05:13:11Z\",\"resource_id\":1095910529,\"resource_type\":\"ovvvsfle\",\"region\":{\"name\":\"noqayrehjuqwvap\",\"slug\":\"rlzh\",\"available\":false}}]}")
                        .toObject(
                                Components1IjwlbpResponsesGetImageActionsResponseContentApplicationJsonSchemaAllof0
                                        .class);
        Assertions.assertEquals(966257553, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("jbuiggru", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-30T19:36:44Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-02-17T05:30:41Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1230067348, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("jthoivsdwsngkr", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("hscj", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("akmhz", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
    }

    @Test
    public void testSerialize() {
        Components1IjwlbpResponsesGetImageActionsResponseContentApplicationJsonSchemaAllof0 model =
                new Components1IjwlbpResponsesGetImageActionsResponseContentApplicationJsonSchemaAllof0()
                        .setActions(
                                Arrays.asList(
                                        new Action()
                                                .setId(966257553)
                                                .setStatus(ActionStatus.ERRORED)
                                                .setType("jbuiggru")
                                                .setStartedAt(OffsetDateTime.parse("2020-12-30T19:36:44Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-02-17T05:30:41Z"))
                                                .setResourceId(1230067348)
                                                .setResourceType("jthoivsdwsngkr")
                                                .setRegion(
                                                        new Region()
                                                                .setName("hscj")
                                                                .setSlug("akmhz")
                                                                .setAvailable(false)),
                                        new Action()
                                                .setId(291291416)
                                                .setStatus(ActionStatus.IN_PROGRESS)
                                                .setType("i")
                                                .setStartedAt(OffsetDateTime.parse("2021-07-16T06:44:29Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-11-19T13:12:55Z"))
                                                .setResourceId(179069264)
                                                .setResourceType("ynuqqkotauratnic")
                                                .setRegion(
                                                        new Region().setName("fzs").setSlug("le").setAvailable(true)),
                                        new Action()
                                                .setId(1694812131)
                                                .setStatus(ActionStatus.ERRORED)
                                                .setType("qlmfdg")
                                                .setStartedAt(OffsetDateTime.parse("2021-08-19T08:57:05Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-03-10T05:13:11Z"))
                                                .setResourceId(1095910529)
                                                .setResourceType("ovvvsfle")
                                                .setRegion(
                                                        new Region()
                                                                .setName("noqayrehjuqwvap")
                                                                .setSlug("rlzh")
                                                                .setAvailable(false))));
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                Components1IjwlbpResponsesGetImageActionsResponseContentApplicationJsonSchemaAllof0
                                        .class);
        Assertions.assertEquals(966257553, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("jbuiggru", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-30T19:36:44Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-02-17T05:30:41Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1230067348, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("jthoivsdwsngkr", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("hscj", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("akmhz", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
    }
}
