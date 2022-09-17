package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AssignToDroplet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AssignToDropletTests {
    @Test
    public void testDeserialize() {
        AssignToDroplet model = BinaryData.fromString("{\"droplet_id\":304442859}").toObject(AssignToDroplet.class);
        Assertions.assertEquals(304442859, model.getDropletId());
    }

    @Test
    public void testSerialize() {
        AssignToDroplet model = new AssignToDroplet().setDropletId(304442859);
        model = BinaryData.fromObject(model).toObject(AssignToDroplet.class);
        Assertions.assertEquals(304442859, model.getDropletId());
    }
}
