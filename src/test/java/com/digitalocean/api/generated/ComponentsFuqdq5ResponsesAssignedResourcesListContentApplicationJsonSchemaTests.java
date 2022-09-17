package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsFuqdq5ResponsesAssignedResourcesListContentApplicationJsonSchema;
import com.digitalocean.api.models.Resource;
import com.digitalocean.api.models.ResourceLinks;
import com.digitalocean.api.models.ResourceStatus;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsFuqdq5ResponsesAssignedResourcesListContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsFuqdq5ResponsesAssignedResourcesListContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"resources\":[{\"urn\":\"wnbcgqefgzjvbx\",\"assigned_at\":\"2021-04-10T03:23:52Z\",\"links\":{\"self\":\"arxt\"},\"status\":\"assigned\"},{\"urn\":\"agvkdlhuduklbjoa\",\"assigned_at\":\"2021-05-19T04:01:42Z\",\"links\":{\"self\":\"xul\"},\"status\":\"service_down\"},{\"urn\":\"kna\",\"assigned_at\":\"2021-05-26T14:56:30Z\",\"links\":{\"self\":\"ncsqoacbuqd\"},\"status\":\"already_assigned\"},{\"urn\":\"leqfgkxenvszg\",\"assigned_at\":\"2021-02-07T09:16:01Z\",\"links\":{\"self\":\"eszsuuv\"},\"status\":\"already_assigned\"}]}")
                        .toObject(ComponentsFuqdq5ResponsesAssignedResourcesListContentApplicationJsonSchema.class);
        Assertions.assertEquals("wnbcgqefgzjvbx", model.getResources().get(0).getUrn());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-10T03:23:52Z"), model.getResources().get(0).getAssignedAt());
        Assertions.assertEquals("arxt", model.getResources().get(0).getLinks().getSelf());
        Assertions.assertEquals(ResourceStatus.ASSIGNED, model.getResources().get(0).getStatus());
    }

    @Test
    public void testSerialize() {
        ComponentsFuqdq5ResponsesAssignedResourcesListContentApplicationJsonSchema model =
                new ComponentsFuqdq5ResponsesAssignedResourcesListContentApplicationJsonSchema()
                        .setResources(
                                Arrays.asList(
                                        new Resource()
                                                .setUrn("wnbcgqefgzjvbx")
                                                .setAssignedAt(OffsetDateTime.parse("2021-04-10T03:23:52Z"))
                                                .setLinks(new ResourceLinks().setSelf("arxt"))
                                                .setStatus(ResourceStatus.ASSIGNED),
                                        new Resource()
                                                .setUrn("agvkdlhuduklbjoa")
                                                .setAssignedAt(OffsetDateTime.parse("2021-05-19T04:01:42Z"))
                                                .setLinks(new ResourceLinks().setSelf("xul"))
                                                .setStatus(ResourceStatus.SERVICE_DOWN),
                                        new Resource()
                                                .setUrn("kna")
                                                .setAssignedAt(OffsetDateTime.parse("2021-05-26T14:56:30Z"))
                                                .setLinks(new ResourceLinks().setSelf("ncsqoacbuqd"))
                                                .setStatus(ResourceStatus.ALREADY_ASSIGNED),
                                        new Resource()
                                                .setUrn("leqfgkxenvszg")
                                                .setAssignedAt(OffsetDateTime.parse("2021-02-07T09:16:01Z"))
                                                .setLinks(new ResourceLinks().setSelf("eszsuuv"))
                                                .setStatus(ResourceStatus.ALREADY_ASSIGNED)));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsFuqdq5ResponsesAssignedResourcesListContentApplicationJsonSchema.class);
        Assertions.assertEquals("wnbcgqefgzjvbx", model.getResources().get(0).getUrn());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-10T03:23:52Z"), model.getResources().get(0).getAssignedAt());
        Assertions.assertEquals("arxt", model.getResources().get(0).getLinks().getSelf());
        Assertions.assertEquals(ResourceStatus.ASSIGNED, model.getResources().get(0).getStatus());
    }
}
