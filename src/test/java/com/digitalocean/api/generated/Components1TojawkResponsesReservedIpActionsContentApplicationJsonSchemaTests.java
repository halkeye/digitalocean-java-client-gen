package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components1TojawkResponsesReservedIpActionsContentApplicationJsonSchema;
import com.digitalocean.api.models.Components1Wguu5HResponsesReservedIpActionsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Region;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1TojawkResponsesReservedIpActionsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1TojawkResponsesReservedIpActionsContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":244418639},\"actions\":[{\"id\":896661587,\"status\":\"completed\",\"type\":\"x\",\"started_at\":\"2021-05-14T06:19:55Z\",\"completed_at\":\"2021-06-03T18:02:41Z\",\"resource_id\":1928136431,\"resource_type\":\"pksywicklktgkdp\",\"region\":{\"name\":\"qj\",\"slug\":\"tdcf\",\"available\":true}},{\"id\":571263434,\"status\":\"errored\",\"type\":\"vjsbgmlamoaxc\",\"started_at\":\"2021-09-15T15:44Z\",\"completed_at\":\"2020-12-20T00:28:57Z\",\"resource_id\":1148311029,\"resource_type\":\"pbltc\",\"region\":{\"name\":\"exheeocnqo\",\"slug\":\"bvepvlryszfhd\",\"available\":true}}]}").toObject(Components1TojawkResponsesReservedIpActionsContentApplicationJsonSchema.class);
        Assertions.assertEquals(896661587, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.COMPLETED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("x", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-14T06:19:55Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-03T18:02:41Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1928136431, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("pksywicklktgkdp", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("qj", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("tdcf", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals(244418639, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1TojawkResponsesReservedIpActionsContentApplicationJsonSchema model = new Components1TojawkResponsesReservedIpActionsContentApplicationJsonSchema().setActions(Arrays.asList(new Action().setId(896661587).setStatus(ActionStatus.COMPLETED).setType("x").setStartedAt(OffsetDateTime.parse("2021-05-14T06:19:55Z")).setCompletedAt(OffsetDateTime.parse("2021-06-03T18:02:41Z")).setResourceId(1928136431).setResourceType("pksywicklktgkdp").setRegion(new Region().setName("qj").setSlug("tdcf").setAvailable(true)), new Action().setId(571263434).setStatus(ActionStatus.ERRORED).setType("vjsbgmlamoaxc").setStartedAt(OffsetDateTime.parse("2021-09-15T15:44Z")).setCompletedAt(OffsetDateTime.parse("2020-12-20T00:28:57Z")).setResourceId(1148311029).setResourceType("pbltc").setRegion(new Region().setName("exheeocnqo").setSlug("bvepvlryszfhd").setAvailable(true)))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(244418639));
        model = BinaryData.fromObject(model).toObject(Components1TojawkResponsesReservedIpActionsContentApplicationJsonSchema.class);
        Assertions.assertEquals(896661587, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.COMPLETED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("x", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-14T06:19:55Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-03T18:02:41Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(1928136431, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("pksywicklktgkdp", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("qj", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("tdcf", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(true, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals(244418639, model.getMeta().getTotal());
    }
}
