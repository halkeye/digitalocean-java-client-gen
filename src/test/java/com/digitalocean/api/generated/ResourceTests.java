package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Resource;
import com.digitalocean.api.models.ResourceLinks;
import com.digitalocean.api.models.ResourceStatus;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceTests {
    @Test
    public void testDeserialize() {
        Resource model =
                BinaryData.fromString(
                                "{\"urn\":\"vzcgulaebxia\",\"assigned_at\":\"2021-01-31T16:52:46Z\",\"links\":{\"self\":\"tessjlwjta\"},\"status\":\"not_found\"}")
                        .toObject(Resource.class);
        Assertions.assertEquals("vzcgulaebxia", model.getUrn());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-31T16:52:46Z"), model.getAssignedAt());
        Assertions.assertEquals("tessjlwjta", model.getLinks().getSelf());
        Assertions.assertEquals(ResourceStatus.NOT_FOUND, model.getStatus());
    }

    @Test
    public void testSerialize() {
        Resource model =
                new Resource()
                        .setUrn("vzcgulaebxia")
                        .setAssignedAt(OffsetDateTime.parse("2021-01-31T16:52:46Z"))
                        .setLinks(new ResourceLinks().setSelf("tessjlwjta"))
                        .setStatus(ResourceStatus.NOT_FOUND);
        model = BinaryData.fromObject(model).toObject(Resource.class);
        Assertions.assertEquals("vzcgulaebxia", model.getUrn());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-31T16:52:46Z"), model.getAssignedAt());
        Assertions.assertEquals("tessjlwjta", model.getLinks().getSelf());
        Assertions.assertEquals(ResourceStatus.NOT_FOUND, model.getStatus());
    }
}
