package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Action;
import com.digitalocean.api.models.ActionStatus;
import com.digitalocean.api.models.Region;
import com.digitalocean.api.models.VolumeAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeActionTests {
    @Test
    public void testDeserialize() {
        VolumeAction model = BinaryData.fromString("{\"type\":\"maxcebnb\",\"resource_id\":200495153,\"id\":357172292,\"status\":\"completed\",\"started_at\":\"2021-02-25T00:20:16Z\",\"completed_at\":\"2021-10-24T08:03:12Z\",\"resource_type\":\"erwqxpjpv\",\"region\":{\"name\":\"dfkhttuobrxz\",\"slug\":\"hyt\",\"available\":false}}").toObject(VolumeAction.class);
        Assertions.assertEquals(357172292, model.getId());
        Assertions.assertEquals(ActionStatus.COMPLETED, model.getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-25T00:20:16Z"), model.getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-24T08:03:12Z"), model.getCompletedAt());
        Assertions.assertEquals("erwqxpjpv", model.getResourceType());
        Assertions.assertEquals("dfkhttuobrxz", model.getRegion().getName());
        Assertions.assertEquals("hyt", model.getRegion().getSlug());
        Assertions.assertEquals(false, model.getRegion().isAvailable());
        Assertions.assertEquals("maxcebnb", model.getType());
        Assertions.assertEquals(200495153, model.getResourceId());
    }

    @Test
    public void testSerialize() {
        VolumeAction model = new VolumeAction().setId(357172292).setStatus(ActionStatus.COMPLETED).setStartedAt(OffsetDateTime.parse("2021-02-25T00:20:16Z")).setCompletedAt(OffsetDateTime.parse("2021-10-24T08:03:12Z")).setResourceType("erwqxpjpv").setRegion(new Region().setName("dfkhttuobrxz").setSlug("hyt").setAvailable(false)).setType("maxcebnb").setResourceId(200495153);
        model = BinaryData.fromObject(model).toObject(VolumeAction.class);
        Assertions.assertEquals(357172292, model.getId());
        Assertions.assertEquals(ActionStatus.COMPLETED, model.getStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-25T00:20:16Z"), model.getStartedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-24T08:03:12Z"), model.getCompletedAt());
        Assertions.assertEquals("erwqxpjpv", model.getResourceType());
        Assertions.assertEquals("dfkhttuobrxz", model.getRegion().getName());
        Assertions.assertEquals("hyt", model.getRegion().getSlug());
        Assertions.assertEquals(false, model.getRegion().isAvailable());
        Assertions.assertEquals("maxcebnb", model.getType());
        Assertions.assertEquals(200495153, model.getResourceId());
    }
}
