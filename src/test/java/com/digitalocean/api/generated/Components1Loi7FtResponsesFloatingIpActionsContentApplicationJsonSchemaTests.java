package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Components1Aqnz7HResponsesFloatingIpActionsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Components1Loi7FtResponsesFloatingIpActionsContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Region;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Loi7FtResponsesFloatingIpActionsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Loi7FtResponsesFloatingIpActionsContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":1528868635},\"actions\":[{\"id\":1727607651,\"status\":\"completed\",\"type\":\"kdywkszavuafane\",\"started_at\":\"2021-04-10T21:40:12Z\",\"completed_at\":\"2021-03-03T20:20:59Z\",\"resource_id\":896416210,\"resource_type\":\"kossjbzvxpzwdq\",\"region\":{\"name\":\"hfgtiaczhfjdcc\",\"slug\":\"nyuvbtcuhjcgjt\",\"available\":false}}]}").toObject(Components1Loi7FtResponsesFloatingIpActionsContentApplicationJsonSchema.class);
        Assertions.assertEquals(1727607651, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.COMPLETED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("kdywkszavuafane", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-10T21:40:12Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-03T20:20:59Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(896416210, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("kossjbzvxpzwdq", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("hfgtiaczhfjdcc", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("nyuvbtcuhjcgjt", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals(1528868635, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1Loi7FtResponsesFloatingIpActionsContentApplicationJsonSchema model = new Components1Loi7FtResponsesFloatingIpActionsContentApplicationJsonSchema().setActions(Arrays.asList(new Action().setId(1727607651).setStatus(ActionStatus.COMPLETED).setType("kdywkszavuafane").setStartedAt(OffsetDateTime.parse("2021-04-10T21:40:12Z")).setCompletedAt(OffsetDateTime.parse("2021-03-03T20:20:59Z")).setResourceId(896416210).setResourceType("kossjbzvxpzwdq").setRegion(new Region().setName("hfgtiaczhfjdcc").setSlug("nyuvbtcuhjcgjt").setAvailable(false)))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(1528868635));
        model = BinaryData.fromObject(model).toObject(Components1Loi7FtResponsesFloatingIpActionsContentApplicationJsonSchema.class);
        Assertions.assertEquals(1727607651, model.getActions().get(0).getId());
        Assertions.assertEquals(ActionStatus.COMPLETED, model.getActions().get(0).getStatus());
        Assertions.assertEquals("kdywkszavuafane", model.getActions().get(0).getType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-10T21:40:12Z"), model.getActions().get(0).getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-03T20:20:59Z"), model.getActions().get(0).getCompletedAt());
        Assertions.assertEquals(896416210, model.getActions().get(0).getResourceId());
        Assertions.assertEquals("kossjbzvxpzwdq", model.getActions().get(0).getResourceType());
        Assertions.assertEquals("hfgtiaczhfjdcc", model.getActions().get(0).getRegion().getName());
        Assertions.assertEquals("nyuvbtcuhjcgjt", model.getActions().get(0).getRegion().getSlug());
        Assertions.assertEquals(false, model.getActions().get(0).getRegion().isAvailable());
        Assertions.assertEquals(1528868635, model.getMeta().getTotal());
    }
}
