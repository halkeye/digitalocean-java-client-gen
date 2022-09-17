package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ClusterUpdate;
import com.digitalocean.api.models.MaintenancePolicy;
import com.digitalocean.api.models.MaintenancePolicyDay;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterUpdateTests {
    @Test
    public void testDeserialize() {
        ClusterUpdate model =
                BinaryData.fromString(
                                "{\"name\":\"ofmex\",\"tags\":[\"mas\",\"manydscdkxwdpw\",\"cbhaah\"],\"maintenance_policy\":{\"start_time\":\"felfh\",\"duration\":\"ixo\",\"day\":\"tuesday\"},\"auto_upgrade\":true,\"surge_upgrade\":false}")
                        .toObject(ClusterUpdate.class);
        Assertions.assertEquals("ofmex", model.getName());
        Assertions.assertEquals("mas", model.getTags().get(0));
        Assertions.assertEquals("felfh", model.getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(MaintenancePolicyDay.TUESDAY, model.getMaintenancePolicy().getDay());
        Assertions.assertEquals(true, model.isAutoUpgrade());
        Assertions.assertEquals(false, model.isSurgeUpgrade());
    }

    @Test
    public void testSerialize() {
        ClusterUpdate model =
                new ClusterUpdate()
                        .setName("ofmex")
                        .setTags(Arrays.asList("mas", "manydscdkxwdpw", "cbhaah"))
                        .setMaintenancePolicy(
                                new MaintenancePolicy().setStartTime("felfh").setDay(MaintenancePolicyDay.TUESDAY))
                        .setAutoUpgrade(true)
                        .setSurgeUpgrade(false);
        model = BinaryData.fromObject(model).toObject(ClusterUpdate.class);
        Assertions.assertEquals("ofmex", model.getName());
        Assertions.assertEquals("mas", model.getTags().get(0));
        Assertions.assertEquals("felfh", model.getMaintenancePolicy().getStartTime());
        Assertions.assertEquals(MaintenancePolicyDay.TUESDAY, model.getMaintenancePolicy().getDay());
        Assertions.assertEquals(true, model.isAutoUpgrade());
        Assertions.assertEquals(false, model.isSurgeUpgrade());
    }
}
