package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.EvictionPolicyModel;
import com.digitalocean.api.models.Paths8571FjV2DatabasesDatabaseClusterUuidEvictionPolicyPutRequestbodyContentApplicationJsonSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths8571FjV2DatabasesDatabaseClusterUuidEvictionPolicyPutRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths8571FjV2DatabasesDatabaseClusterUuidEvictionPolicyPutRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"eviction_policy\":\"noeviction\"}").toObject(Paths8571FjV2DatabasesDatabaseClusterUuidEvictionPolicyPutRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(EvictionPolicyModel.NOEVICTION, model.getEvictionPolicy());
    }

    @Test
    public void testSerialize() {
        Paths8571FjV2DatabasesDatabaseClusterUuidEvictionPolicyPutRequestbodyContentApplicationJsonSchema model = new Paths8571FjV2DatabasesDatabaseClusterUuidEvictionPolicyPutRequestbodyContentApplicationJsonSchema().setEvictionPolicy(EvictionPolicyModel.NOEVICTION);
        model = BinaryData.fromObject(model).toObject(Paths8571FjV2DatabasesDatabaseClusterUuidEvictionPolicyPutRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(EvictionPolicyModel.NOEVICTION, model.getEvictionPolicy());
    }
}
