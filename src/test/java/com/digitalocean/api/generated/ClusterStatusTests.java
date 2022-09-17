package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ClusterStatus;
import com.digitalocean.api.models.ClusterStatusState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterStatusTests {
    @Test
    public void testDeserialize() {
        ClusterStatus model =
                BinaryData.fromString("{\"state\":\"provisioning\",\"message\":\"ypr\"}").toObject(ClusterStatus.class);
        Assertions.assertEquals(ClusterStatusState.PROVISIONING, model.getState());
        Assertions.assertEquals("ypr", model.getMessage());
    }

    @Test
    public void testSerialize() {
        ClusterStatus model = new ClusterStatus().setState(ClusterStatusState.PROVISIONING).setMessage("ypr");
        model = BinaryData.fromObject(model).toObject(ClusterStatus.class);
        Assertions.assertEquals(ClusterStatusState.PROVISIONING, model.getState());
        Assertions.assertEquals("ypr", model.getMessage());
    }
}
