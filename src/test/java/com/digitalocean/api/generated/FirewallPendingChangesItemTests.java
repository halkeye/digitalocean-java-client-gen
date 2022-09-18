package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.FirewallPendingChangesItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FirewallPendingChangesItemTests {
    @Test
    public void testDeserialize() {
        FirewallPendingChangesItem model = BinaryData.fromString("{\"droplet_id\":1021083960,\"removing\":true,\"status\":\"eboozflyacagaed\"}").toObject(FirewallPendingChangesItem.class);
        Assertions.assertEquals(1021083960, model.getDropletId());
        Assertions.assertEquals(true, model.isRemoving());
        Assertions.assertEquals("eboozflyacagaed", model.getStatus());
    }

    @Test
    public void testSerialize() {
        FirewallPendingChangesItem model = new FirewallPendingChangesItem().setDropletId(1021083960).setRemoving(true).setStatus("eboozflyacagaed");
        model = BinaryData.fromObject(model).toObject(FirewallPendingChangesItem.class);
        Assertions.assertEquals(1021083960, model.getDropletId());
        Assertions.assertEquals(true, model.isRemoving());
        Assertions.assertEquals("eboozflyacagaed", model.getStatus());
    }
}
