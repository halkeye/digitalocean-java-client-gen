package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsJxo43DResponsesTagsAllContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Tags;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsJxo43DResponsesTagsAllContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsJxo43DResponsesTagsAllContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"tags\":[{\"name\":\"nyexb\",\"resources\":{\"count\":512824965,\"last_tagged_uri\":\"eooqftpv\"}}]}").toObject(ComponentsJxo43DResponsesTagsAllContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("nyexb", model.getTags().get(0).getName());
    }

    @Test
    public void testSerialize() {
        ComponentsJxo43DResponsesTagsAllContentApplicationJsonSchemaAllof0 model = new ComponentsJxo43DResponsesTagsAllContentApplicationJsonSchemaAllof0().setTags(Arrays.asList(new Tags().setName("nyexb")));
        model = BinaryData.fromObject(model).toObject(ComponentsJxo43DResponsesTagsAllContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("nyexb", model.getTags().get(0).getName());
    }
}
