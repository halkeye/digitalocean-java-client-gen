package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.MaintenancePolicy;
import com.digitalocean.api.models.MaintenancePolicyDay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MaintenancePolicyTests {
    @Test
    public void testDeserialize() {
        MaintenancePolicy model =
                BinaryData.fromString("{\"start_time\":\"cwzvc\",\"duration\":\"p\",\"day\":\"monday\"}")
                        .toObject(MaintenancePolicy.class);
        Assertions.assertEquals("cwzvc", model.getStartTime());
        Assertions.assertEquals(MaintenancePolicyDay.MONDAY, model.getDay());
    }

    @Test
    public void testSerialize() {
        MaintenancePolicy model = new MaintenancePolicy().setStartTime("cwzvc").setDay(MaintenancePolicyDay.MONDAY);
        model = BinaryData.fromObject(model).toObject(MaintenancePolicy.class);
        Assertions.assertEquals("cwzvc", model.getStartTime());
        Assertions.assertEquals(MaintenancePolicyDay.MONDAY, model.getDay());
    }
}
