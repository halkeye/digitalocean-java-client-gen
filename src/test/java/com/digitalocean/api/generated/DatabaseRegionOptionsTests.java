package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseRegionOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabaseRegionOptionsTests {
    @Test
    public void testDeserialize() {
        DatabaseRegionOptions model = BinaryData.fromString("{\"regions\":[\"vyhjrl\",\"izjixlq\",\"hefkwabsolronqq\",\"mgnlqxsjxtel\"]}").toObject(DatabaseRegionOptions.class);
    }

    @Test
    public void testSerialize() {
        DatabaseRegionOptions model = new DatabaseRegionOptions();
        model = BinaryData.fromObject(model).toObject(DatabaseRegionOptions.class);
    }
}
