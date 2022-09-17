package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.SourceDatabaseSource;
import org.junit.jupiter.api.Test;

public final class SourceDatabaseSourceTests {
    @Test
    public void testDeserialize() {
        SourceDatabaseSource model =
                BinaryData.fromString(
                                "{\"uri\":\"liejhpc\",\"database\":\"iedfsbwcei\",\"host\":\"vzipbwxgo\",\"port\":124034225,\"user\":\"pradmskxknpdgzi\",\"password\":\"sugswhgsaod\",\"ssl\":false}")
                        .toObject(SourceDatabaseSource.class);
    }

    @Test
    public void testSerialize() {
        SourceDatabaseSource model = new SourceDatabaseSource();
        model = BinaryData.fromObject(model).toObject(SourceDatabaseSource.class);
    }
}
