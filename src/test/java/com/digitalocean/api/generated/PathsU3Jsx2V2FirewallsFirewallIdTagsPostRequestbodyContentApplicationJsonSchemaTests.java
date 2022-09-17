package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema;
import org.junit.jupiter.api.Test;

public final class PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema model =
                BinaryData.fromString("{}")
                        .toObject(
                                PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema.class);
    }

    @Test
    public void testSerialize() {
        PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema model =
                new PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema();
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema.class);
    }
}
