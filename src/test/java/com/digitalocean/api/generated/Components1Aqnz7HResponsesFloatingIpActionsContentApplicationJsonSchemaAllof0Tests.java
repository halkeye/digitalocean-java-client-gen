package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components1Aqnz7HResponsesFloatingIpActionsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Region;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Aqnz7HResponsesFloatingIpActionsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1Aqnz7HResponsesFloatingIpActionsContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"actions\":[{\"id\":861439877,\"status\":\"errored\",\"type\":\"hcdb\",\"started_at\":\"2021-09-27T12:55:31Z\",\"completed_at\":\"2021-03-01T05:32:09Z\",\"resource_id\":1538796802,\"resource_type\":\"eyvidcowlrmbdct\",\"region\":{\"name\":\"avej\",\"slug\":\"ezvwkryzga\",\"available\":false}},{\"id\":300265059,\"status\":\"completed\",\"type\":\"iekkiskyyyaekn\",\"started_at\":\"2021-01-16T07:08:41Z\",\"completed_at\":\"2021-01-24T02:07:10Z\",\"resource_id\":688829402,\"resource_type\":\"wjlmlcufbbjiutfo\",\"region\":{\"name\":\"oajjyl\",\"slug\":\"yqyjnufzvl\",\"available\":true}},{\"id\":542602188,\"status\":\"in-progress\",\"type\":\"ev\",\"started_at\":\"2021-09-07T18:54:52Z\",\"completed_at\":\"2021-10-18T12:18:57Z\",\"resource_id\":215887027,\"resource_type\":\"qtvuxeujmdssijua\",\"region\":{\"name\":\"fdlypk\",\"slug\":\"pw\",\"available\":false}},{\"id\":616712538,\"status\":\"completed\",\"type\":\"n\",\"started_at\":\"2021-02-02T16:38:47Z\",\"completed_at\":\"2021-10-10T21:11:35Z\",\"resource_id\":255816027,\"resource_type\":\"hbcycgqakcsihxvt\",\"region\":{\"name\":\"wwfopxpryxnsbubw\",\"slug\":\"zqqgug\",\"available\":true}}]}")
                        .toObject(Components1Aqnz7HResponsesFloatingIpActionsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(861439877, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("hcdb", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-27T12:55:31Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-01T05:32:09Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1538796802, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("eyvidcowlrmbdct", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("avej", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("ezvwkryzga", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
    }

    @Test
    public void testSerialize() {
        Components1Aqnz7HResponsesFloatingIpActionsContentApplicationJsonSchemaAllof0 model =
                new Components1Aqnz7HResponsesFloatingIpActionsContentApplicationJsonSchemaAllof0()
                        .setActions(
                                Arrays.asList(
                                        new Action()
                                                .setId(861439877)
                                                .setStatus(ActionStatus.ERRORED)
                                                .setType("hcdb")
                                                .setStartedAt(OffsetDateTime.parse("2021-09-27T12:55:31Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-03-01T05:32:09Z"))
                                                .setResourceId(1538796802)
                                                .setResourceType("eyvidcowlrmbdct")
                                                .setRegion(
                                                        new Region()
                                                                .setName("avej")
                                                                .setSlug("ezvwkryzga")
                                                                .setAvailable(false)),
                                        new Action()
                                                .setId(300265059)
                                                .setStatus(ActionStatus.COMPLETED)
                                                .setType("iekkiskyyyaekn")
                                                .setStartedAt(OffsetDateTime.parse("2021-01-16T07:08:41Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-01-24T02:07:10Z"))
                                                .setResourceId(688829402)
                                                .setResourceType("wjlmlcufbbjiutfo")
                                                .setRegion(
                                                        new Region()
                                                                .setName("oajjyl")
                                                                .setSlug("yqyjnufzvl")
                                                                .setAvailable(true)),
                                        new Action()
                                                .setId(542602188)
                                                .setStatus(ActionStatus.IN_PROGRESS)
                                                .setType("ev")
                                                .setStartedAt(OffsetDateTime.parse("2021-09-07T18:54:52Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-10-18T12:18:57Z"))
                                                .setResourceId(215887027)
                                                .setResourceType("qtvuxeujmdssijua")
                                                .setRegion(
                                                        new Region()
                                                                .setName("fdlypk")
                                                                .setSlug("pw")
                                                                .setAvailable(false)),
                                        new Action()
                                                .setId(616712538)
                                                .setStatus(ActionStatus.COMPLETED)
                                                .setType("n")
                                                .setStartedAt(OffsetDateTime.parse("2021-02-02T16:38:47Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-10-10T21:11:35Z"))
                                                .setResourceId(255816027)
                                                .setResourceType("hbcycgqakcsihxvt")
                                                .setRegion(
                                                        new Region()
                                                                .setName("wwfopxpryxnsbubw")
                                                                .setSlug("zqqgug")
                                                                .setAvailable(true))));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Aqnz7HResponsesFloatingIpActionsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals(861439877, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.ERRORED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("hcdb", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-27T12:55:31Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-01T05:32:09Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1538796802, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("eyvidcowlrmbdct", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("avej", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("ezvwkryzga", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
    }
}
