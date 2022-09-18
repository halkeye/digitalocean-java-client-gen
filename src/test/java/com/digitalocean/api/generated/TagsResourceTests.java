package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.TagsResource;
import com.digitalocean.api.models.TagsResourceResourcesItem;
import com.digitalocean.api.models.TagsResourceResourcesItemResourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TagsResourceTests {
    @Test
    public void testDeserialize() {
        TagsResource model = BinaryData.fromString("{\"resources\":[{\"resource_id\":\"soq\",\"resource_type\":\"volume_snapshot\"},{\"resource_id\":\"yeqdob\",\"resource_type\":\"image\"},{\"resource_id\":\"c\",\"resource_type\":\"volume_snapshot\"},{\"resource_id\":\"ckcesrsi\",\"resource_type\":\"droplet\"}]}").toObject(TagsResource.class);
        Assertions.assertEquals("soq", model.getResources().get(0).getResourceId());
        Assertions.assertEquals(TagsResourceResourcesItemResourceType.VOLUME_SNAPSHOT, model.getResources().get(0).getResourceType());
    }

    @Test
    public void testSerialize() {
        TagsResource model = new TagsResource().setResources(Arrays.asList(new TagsResourceResourcesItem().setResourceId("soq").setResourceType(TagsResourceResourcesItemResourceType.VOLUME_SNAPSHOT), new TagsResourceResourcesItem().setResourceId("yeqdob").setResourceType(TagsResourceResourcesItemResourceType.IMAGE), new TagsResourceResourcesItem().setResourceId("c").setResourceType(TagsResourceResourcesItemResourceType.VOLUME_SNAPSHOT), new TagsResourceResourcesItem().setResourceId("ckcesrsi").setResourceType(TagsResourceResourcesItemResourceType.DROPLET)));
        model = BinaryData.fromObject(model).toObject(TagsResource.class);
        Assertions.assertEquals("soq", model.getResources().get(0).getResourceId());
        Assertions.assertEquals(TagsResourceResourcesItemResourceType.VOLUME_SNAPSHOT, model.getResources().get(0).getResourceType());
    }
}
