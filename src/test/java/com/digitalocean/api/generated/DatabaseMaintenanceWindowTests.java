package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseMaintenanceWindow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabaseMaintenanceWindowTests {
    @Test
    public void testDeserialize() {
        DatabaseMaintenanceWindow model =
                BinaryData.fromString(
                                "{\"day\":\"ojhtollhs\",\"hour\":\"idmytzln\",\"pending\":false,\"description\":[\"ovyoanf\",\"cswqa\",\"ywv\"]}")
                        .toObject(DatabaseMaintenanceWindow.class);
        Assertions.assertEquals("ojhtollhs", model.getDay());
        Assertions.assertEquals("idmytzln", model.getHour());
    }

    @Test
    public void testSerialize() {
        DatabaseMaintenanceWindow model = new DatabaseMaintenanceWindow().setDay("ojhtollhs").setHour("idmytzln");
        model = BinaryData.fromObject(model).toObject(DatabaseMaintenanceWindow.class);
        Assertions.assertEquals("ojhtollhs", model.getDay());
        Assertions.assertEquals("idmytzln", model.getHour());
    }
}
