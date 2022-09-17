package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseVersionOptions;
import org.junit.jupiter.api.Test;

public final class DatabaseVersionOptionsTests {
    @Test
    public void testDeserialize() {
        DatabaseVersionOptions model =
                BinaryData.fromString("{\"versions\":[\"vuqbozoo\",\"zqocarku\"]}")
                        .toObject(DatabaseVersionOptions.class);
    }

    @Test
    public void testSerialize() {
        DatabaseVersionOptions model = new DatabaseVersionOptions();
        model = BinaryData.fromObject(model).toObject(DatabaseVersionOptions.class);
    }
}
