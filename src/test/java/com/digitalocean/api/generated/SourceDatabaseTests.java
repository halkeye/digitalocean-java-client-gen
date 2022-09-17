package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.SourceDatabase;
import com.digitalocean.api.models.SourceDatabaseSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SourceDatabaseTests {
    @Test
    public void testDeserialize() {
        SourceDatabase model =
                BinaryData.fromString(
                                "{\"source\":{\"uri\":\"zmqilrixysfnim\",\"database\":\"y\",\"host\":\"wmhkruwaedrympml\",\"port\":476187325,\"user\":\"hzdue\",\"password\":\"hapfjiik\",\"ssl\":true},\"disable_ssl\":false}")
                        .toObject(SourceDatabase.class);
        Assertions.assertEquals(false, model.isDisableSsl());
    }

    @Test
    public void testSerialize() {
        SourceDatabase model = new SourceDatabase().setSource(new SourceDatabaseSource()).setDisableSsl(false);
        model = BinaryData.fromObject(model).toObject(SourceDatabase.class);
        Assertions.assertEquals(false, model.isDisableSsl());
    }
}
