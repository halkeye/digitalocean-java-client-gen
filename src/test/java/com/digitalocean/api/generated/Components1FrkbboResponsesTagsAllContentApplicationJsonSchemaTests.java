package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1FrkbboResponsesTagsAllContentApplicationJsonSchema;
import com.digitalocean.api.models.ComponentsJxo43DResponsesTagsAllContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Tags;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1FrkbboResponsesTagsAllContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1FrkbboResponsesTagsAllContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":1972007107},\"tags\":[{\"name\":\"uubxcwojtupqdvnp\",\"resources\":{\"count\":1674215646,\"last_tagged_uri\":\"gtdow\"}},{\"name\":\"mwefcbyb\",\"resources\":{\"count\":2079502433,\"last_tagged_uri\":\"ujyznv\"}},{\"name\":\"jqdjlgkuirxxeuwi\",\"resources\":{\"count\":1529193653,\"last_tagged_uri\":\"viwxohktxagfuj\"}}]}").toObject(Components1FrkbboResponsesTagsAllContentApplicationJsonSchema.class);
        Assertions.assertEquals("uubxcwojtupqdvnp", model.getTags().get(0).getName());
        Assertions.assertEquals(1972007107, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1FrkbboResponsesTagsAllContentApplicationJsonSchema model = new Components1FrkbboResponsesTagsAllContentApplicationJsonSchema().setTags(Arrays.asList(new Tags().setName("uubxcwojtupqdvnp"), new Tags().setName("mwefcbyb"), new Tags().setName("jqdjlgkuirxxeuwi"))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(1972007107));
        model = BinaryData.fromObject(model).toObject(Components1FrkbboResponsesTagsAllContentApplicationJsonSchema.class);
        Assertions.assertEquals("uubxcwojtupqdvnp", model.getTags().get(0).getName());
        Assertions.assertEquals(1972007107, model.getMeta().getTotal());
    }
}
