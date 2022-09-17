package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.OnlineMigration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OnlineMigrationTests {
    @Test
    public void testDeserialize() {
        OnlineMigration model =
                BinaryData.fromString("{\"id\":\"mb\",\"status\":\"qgsdr\",\"created_at\":\"ttjxophgerhsmvgo\"}")
                        .toObject(OnlineMigration.class);
        Assertions.assertEquals("mb", model.getId());
        Assertions.assertEquals("qgsdr", model.getStatus());
        Assertions.assertEquals("ttjxophgerhsmvgo", model.getCreatedAt());
    }

    @Test
    public void testSerialize() {
        OnlineMigration model = new OnlineMigration().setId("mb").setStatus("qgsdr").setCreatedAt("ttjxophgerhsmvgo");
        model = BinaryData.fromObject(model).toObject(OnlineMigration.class);
        Assertions.assertEquals("mb", model.getId());
        Assertions.assertEquals("qgsdr", model.getStatus());
        Assertions.assertEquals("ttjxophgerhsmvgo", model.getCreatedAt());
    }
}
