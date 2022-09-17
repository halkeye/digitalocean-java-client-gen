package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsKgjf4JResponsesResourcesListContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Resource;
import com.digitalocean.api.models.ResourceLinks;
import com.digitalocean.api.models.ResourceStatus;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsKgjf4JResponsesResourcesListContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsKgjf4JResponsesResourcesListContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"resources\":[{\"urn\":\"ycpgokuthrvyb\",\"assigned_at\":\"2021-10-07T08:26:25Z\",\"links\":{\"self\":\"mshfuzzlap\"},\"status\":\"ok\"}]}")
                        .toObject(ComponentsKgjf4JResponsesResourcesListContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("ycpgokuthrvyb", model.getResources().get(0).getUrn());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-07T08:26:25Z"), model.getResources().get(0).getAssignedAt());
        Assertions.assertEquals("mshfuzzlap", model.getResources().get(0).getLinks().getSelf());
        Assertions.assertEquals(ResourceStatus.OK, model.getResources().get(0).getStatus());
    }

    @Test
    public void testSerialize() {
        ComponentsKgjf4JResponsesResourcesListContentApplicationJsonSchemaAllof0 model =
                new ComponentsKgjf4JResponsesResourcesListContentApplicationJsonSchemaAllof0()
                        .setResources(
                                Arrays.asList(
                                        new Resource()
                                                .setUrn("ycpgokuthrvyb")
                                                .setAssignedAt(OffsetDateTime.parse("2021-10-07T08:26:25Z"))
                                                .setLinks(new ResourceLinks().setSelf("mshfuzzlap"))
                                                .setStatus(ResourceStatus.OK)));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsKgjf4JResponsesResourcesListContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("ycpgokuthrvyb", model.getResources().get(0).getUrn());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-07T08:26:25Z"), model.getResources().get(0).getAssignedAt());
        Assertions.assertEquals("mshfuzzlap", model.getResources().get(0).getLinks().getSelf());
        Assertions.assertEquals(ResourceStatus.OK, model.getResources().get(0).getStatus());
    }
}
