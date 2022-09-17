package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components1R3Gof0ResponsesVolumeactionsContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Region;
import com.digitalocean.api.models.VolumeAction;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1R3Gof0ResponsesVolumeactionsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1R3Gof0ResponsesVolumeactionsContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":367017005},\"actions\":[{\"type\":\"qxuyi\",\"resource_id\":981965018,\"id\":259935126,\"status\":\"in-progress\",\"started_at\":\"2021-11-06T06:39:47Z\",\"completed_at\":\"2021-01-10T02:14:49Z\",\"resource_type\":\"eypd\",\"region\":{\"name\":\"ajpuyx\",\"slug\":\"a\",\"available\":true}},{\"type\":\"eyrxparxtzayq\",\"resource_id\":212502924,\"id\":1413935249,\"status\":\"in-progress\",\"started_at\":\"2021-01-29T15:40:13Z\",\"completed_at\":\"2021-04-25T05:46:58Z\",\"resource_type\":\"spl\",\"region\":{\"name\":\"ssiwwv\",\"slug\":\"eozbj\",\"available\":false}}]}")
                        .toObject(Components1R3Gof0ResponsesVolumeactionsContentApplicationJsonSchema.class);
        Assertions.assertEquals(259935126, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getActions().get(0).getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-06T06:39:47Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-01-10T02:14:49Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals("eypd", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("ajpuyx", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("a", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals("qxuyi", model.getActions().get(0).getType());
        Assertions.assertEquals(981965018, model.getActions().get(0).getResourceId());
        Assertions.assertEquals(367017005, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1R3Gof0ResponsesVolumeactionsContentApplicationJsonSchema model =
                new Components1R3Gof0ResponsesVolumeactionsContentApplicationJsonSchema()
                        .setActions(
                                Arrays.asList(
                                        new VolumeAction()
                                                .setId(259935126)
                                                .setStatus(ActionStatus.IN_PROGRESS)
                                                .setStartedAt(OffsetDateTime.parse("2021-11-06T06:39:47Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-01-10T02:14:49Z"))
                                                .setResourceType("eypd")
                                                .setRegion(
                                                        new Region().setName("ajpuyx").setSlug("a").setAvailable(true))
                                                .setType("qxuyi")
                                                .setResourceId(981965018),
                                        new VolumeAction()
                                                .setId(1413935249)
                                                .setStatus(ActionStatus.IN_PROGRESS)
                                                .setStartedAt(OffsetDateTime.parse("2021-01-29T15:40:13Z"))
                                                .setCompletedAt(OffsetDateTime.parse("2021-04-25T05:46:58Z"))
                                                .setResourceType("spl")
                                                .setRegion(
                                                        new Region()
                                                                .setName("ssiwwv")
                                                                .setSlug("eozbj")
                                                                .setAvailable(false))
                                                .setType("eyrxparxtzayq")
                                                .setResourceId(212502924)))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(367017005));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1R3Gof0ResponsesVolumeactionsContentApplicationJsonSchema.class);
        Assertions.assertEquals(259935126, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.IN_PROGRESS, model.getActions().get(0).getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-06T06:39:47Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-01-10T02:14:49Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals("eypd", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("ajpuyx", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("a", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals("qxuyi", model.getActions().get(0).getType());
        Assertions.assertEquals(981965018, model.getActions().get(0).getResourceId());
        Assertions.assertEquals(367017005, model.getMeta().getTotal());
    }
}
