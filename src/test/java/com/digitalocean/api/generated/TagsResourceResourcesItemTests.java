package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.TagsResourceResourcesItem;
import com.digitalocean.api.models.TagsResourceResourcesItemResourceType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TagsResourceResourcesItemTests {
    @Test
    public void testDeserialize() {
        TagsResourceResourcesItem model =
                BinaryData.fromString("{\"resource_id\":\"pjcxbjgfm\",\"resource_type\":\"droplet\"}")
                        .toObject(TagsResourceResourcesItem.class);
        Assertions.assertEquals("pjcxbjgfm", model.getResourceId());
        Assertions.assertEquals(TagsResourceResourcesItemResourceType.DROPLET, model.getResourceType());
    }

    @Test
    public void testSerialize() {
        TagsResourceResourcesItem model =
                new TagsResourceResourcesItem()
                        .setResourceId("pjcxbjgfm")
                        .setResourceType(TagsResourceResourcesItemResourceType.DROPLET);
        model = BinaryData.fromObject(model).toObject(TagsResourceResourcesItem.class);
        Assertions.assertEquals("pjcxbjgfm", model.getResourceId());
        Assertions.assertEquals(TagsResourceResourcesItemResourceType.DROPLET, model.getResourceType());
    }
}
