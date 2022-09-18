package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseClusterMaintenanceWindow;
import com.digitalocean.api.models.DatabaseMaintenanceWindow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabaseClusterMaintenanceWindowTests {
    @Test
    public void testDeserialize() {
        DatabaseClusterMaintenanceWindow model = BinaryData.fromString("{\"day\":\"f\",\"hour\":\"xrqrkijpeuqlsd\",\"pending\":false,\"description\":[\"vxwmwwmjs\",\"en\",\"wwa\",\"ecleqioulndhzyo\"]}").toObject(DatabaseClusterMaintenanceWindow.class);
        Assertions.assertEquals("f", model.getDay());
        Assertions.assertEquals("xrqrkijpeuqlsd", model.getHour());
    }

    @Test
    public void testSerialize() {
        DatabaseClusterMaintenanceWindow model = new DatabaseClusterMaintenanceWindow().setDay("f").setHour("xrqrkijpeuqlsd");
        model = BinaryData.fromObject(model).toObject(DatabaseClusterMaintenanceWindow.class);
        Assertions.assertEquals("f", model.getDay());
        Assertions.assertEquals("xrqrkijpeuqlsd", model.getHour());
    }
}
