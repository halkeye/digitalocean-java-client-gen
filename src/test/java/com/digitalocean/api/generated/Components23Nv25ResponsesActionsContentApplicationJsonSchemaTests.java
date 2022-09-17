package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components23Nv25ResponsesActionsContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Region;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components23Nv25ResponsesActionsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components23Nv25ResponsesActionsContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":1536608639},\"actions\":[{\"id\":962942512,\"status\":\"in-progress\",\"type\":\"ojakhmsbzjhcrze\",\"started_at\":\"2021-11-09T02:37:57Z\",\"completed_at\":\"2021-01-31T22:20:23Z\",\"resource_id\":148902907,\"resource_type\":\"lthqtrgqjbp\",\"region\":{\"name\":\"fsinzgvfcjrwzoxx\",\"slug\":\"tfell\",\"available\":true}},{\"id\":348508366,\"status\":\"errored\",\"type\":\"peqfpjkjl\",\"started_at\":\"2021-11-24T18:52:18Z\",\"completed_at\":\"2021-10-29T01:56:29Z\",\"resource_id\":670343743,\"resource_type\":\"fxxypininmayhuy\",\"region\":{\"name\":\"kpode\",\"slug\":\"ooginuvamih\",\"available\":true}},{\"id\":348086131,\"status\":\"errored\",\"type\":\"xth\",\"started_at\":\"2021-07-04T08:07:04Z\",\"completed_at\":\"2021-01-06T23:59:36Z\",\"resource_id\":116358937,\"resource_type\":\"evcciqihnhun\",\"region\":{\"name\":\"wjzrnfygxgisp\",\"slug\":\"mvtzfkufub\",\"available\":false}},{\"id\":1710309731,\"status\":\"in-progress\",\"type\":\"fjaeq\",\"started_at\":\"2021-08-04T06:00:55Z\",\"completed_at\":\"2021-07-12T07:47:05Z\",\"resource_id\":5903092,\"resource_type\":\"msmjqulngsntn\",\"region\":{\"name\":\"bkzgcwrwclx\",\"slug\":\"wrljdouskc\",\"available\":true}}]}")
                        .toObject(Components23Nv25ResponsesActionsContentApplicationJsonSchema.class);
        Assertions.assertEquals(962942512, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getActions().get(0).getStatus());
        Assertions.assertEquals("ojakhmsbzjhcrze", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-09T02:37:57Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-01-31T22:20:23Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(148902907, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("lthqtrgqjbp", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("fsinzgvfcjrwzoxx", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("tfell", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals(1536608639, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components23Nv25ResponsesActionsContentApplicationJsonSchema model =
                new Components23Nv25ResponsesActionsContentApplicationJsonSchema()
                        .setActions(
                                Arrays.asList(
                                        new Action()
                                                .setId(962942512)
                                                .setStatus(ActionStatus.IN_PROGRESS)
                                                .setType("ojakhmsbzjhcrze")
                                                .setStartedAt(OffsetDateTime.parse("2021-11-09T02:37:57Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-01-31T22:20:23Z"))
                                                .setResourceId(148902907)
                                                .setResourceType("lthqtrgqjbp")
                                                .setRegion(
                                                        new Region()
                                                                .setName("fsinzgvfcjrwzoxx")
                                                                .setSlug("tfell")
                                                                .setAvailable(true)),
                                        new Action()
                                                .setId(348508366)
                                                .setStatus(ActionStatus.ERRORED)
                                                .setType("peqfpjkjl")
                                                .setStartedAt(OffsetDateTime.parse("2021-11-24T18:52:18Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-10-29T01:56:29Z"))
                                                .setResourceId(670343743)
                                                .setResourceType("fxxypininmayhuy")
                                                .setRegion(
                                                        new Region()
                                                                .setName("kpode")
                                                                .setSlug("ooginuvamih")
                                                                .setAvailable(true)),
                                        new Action()
                                                .setId(348086131)
                                                .setStatus(ActionStatus.ERRORED)
                                                .setType("xth")
                                                .setStartedAt(OffsetDateTime.parse("2021-07-04T08:07:04Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-01-06T23:59:36Z"))
                                                .setResourceId(116358937)
                                                .setResourceType("evcciqihnhun")
                                                .setRegion(
                                                        new Region()
                                                                .setName("wjzrnfygxgisp")
                                                                .setSlug("mvtzfkufub")
                                                                .setAvailable(false)),
                                        new Action()
                                                .setId(1710309731)
                                                .setStatus(ActionStatus.IN_PROGRESS)
                                                .setType("fjaeq")
                                                .setStartedAt(OffsetDateTime.parse("2021-08-04T06:00:55Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-07-12T07:47:05Z"))
                                                .setResourceId(5903092)
                                                .setResourceType("msmjqulngsntn")
                                                .setRegion(
                                                        new Region()
                                                                .setName("bkzgcwrwclx")
                                                                .setSlug("wrljdouskc")
                                                                .setAvailable(true))))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(1536608639));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components23Nv25ResponsesActionsContentApplicationJsonSchema.class);
        Assertions.assertEquals(962942512, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getActions().get(0).getStatus());
        Assertions.assertEquals("ojakhmsbzjhcrze", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-09T02:37:57Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-01-31T22:20:23Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(148902907, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("lthqtrgqjbp", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("fsinzgvfcjrwzoxx", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("tfell", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals(1536608639, model.getMeta().getTotal());
    }
}
