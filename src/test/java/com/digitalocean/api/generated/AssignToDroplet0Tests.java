package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AssignToDroplet0;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AssignToDroplet0Tests {
    @Test
    public void testDeserialize() {
        AssignToDroplet0 model = BinaryData.fromString("{\"droplet_id\":921784996}").toObject(AssignToDroplet0.class);
        Assertions.assertEquals(921784996, model.getDropletId());
    }

    @Test
    public void testSerialize() {
        AssignToDroplet0 model = new AssignToDroplet0().setDropletId(921784996);
        model = BinaryData.fromObject(model).toObject(AssignToDroplet0.class);
        Assertions.assertEquals(921784996, model.getDropletId());
    }
}
