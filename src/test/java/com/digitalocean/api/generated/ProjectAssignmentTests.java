package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ProjectAssignment;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ProjectAssignmentTests {
    @Test
    public void testDeserialize() {
        ProjectAssignment model = BinaryData.fromString("{\"resources\":[\"pvlcjbvyez\",\"wjk\",\"onbwhi\",\"eyozvrcw\"]}").toObject(ProjectAssignment.class);
        Assertions.assertEquals("pvlcjbvyez", model.getResources().get(0));
    }

    @Test
    public void testSerialize() {
        ProjectAssignment model = new ProjectAssignment().setResources(Arrays.asList("pvlcjbvyez", "wjk", "onbwhi", "eyozvrcw"));
        model = BinaryData.fromObject(model).toObject(ProjectAssignment.class);
        Assertions.assertEquals("pvlcjbvyez", model.getResources().get(0));
    }
}
