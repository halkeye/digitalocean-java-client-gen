package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema model =
                BinaryData.fromString("{\"region\":\"nbafoctohzhaquvw\"}")
                        .toObject(
                                Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals("nbafoctohzhaquvw", model.getRegion());
    }

    @Test
    public void testSerialize() {
        Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema model =
                new Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema()
                        .setRegion("nbafoctohzhaquvw");
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals("nbafoctohzhaquvw", model.getRegion());
    }
}
