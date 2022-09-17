package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema model =
                BinaryData.fromString("{\"name\":\"ctazakljlahbcryf\"}")
                        .toObject(
                                PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals("ctazakljlahbcryf", model.getName());
    }

    @Test
    public void testSerialize() {
        PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema model =
                new PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema()
                        .setName("ctazakljlahbcryf");
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals("ctazakljlahbcryf", model.getName());
    }
}
