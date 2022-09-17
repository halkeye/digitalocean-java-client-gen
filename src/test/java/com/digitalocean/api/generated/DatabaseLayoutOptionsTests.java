package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseLayoutOptions;
import org.junit.jupiter.api.Test;

public final class DatabaseLayoutOptionsTests {
    @Test
    public void testDeserialize() {
        DatabaseLayoutOptions model =
                BinaryData.fromString(
                                "{\"layouts\":[{\"num_nodes\":2037398901,\"sizes\":[\"t\",\"nx\",\"wqy\",\"llhdyzm\"]}]}")
                        .toObject(DatabaseLayoutOptions.class);
    }

    @Test
    public void testSerialize() {
        DatabaseLayoutOptions model = new DatabaseLayoutOptions();
        model = BinaryData.fromObject(model).toObject(DatabaseLayoutOptions.class);
    }
}
