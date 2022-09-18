package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{}").toObject(PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema.class);
    }

    @Test
    public void testSerialize() {
        PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema model = new PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema();
        model = BinaryData.fromObject(model).toObject(PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema.class);
    }
}
