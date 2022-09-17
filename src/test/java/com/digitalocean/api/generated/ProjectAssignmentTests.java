package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ProjectAssignment;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ProjectAssignmentTests {
    @Test
    public void testDeserialize() {
        ProjectAssignment model =
                BinaryData.fromString("{\"resources\":[\"pvlcjbvyez\",\"wjk\",\"onbwhi\",\"eyozvrcw\"]}")
                        .toObject(ProjectAssignment.class);
        Assertions.assertEquals("pvlcjbvyez", model.getResources().get(0));
    }

    @Test
    public void testSerialize() {
        ProjectAssignment model =
                new ProjectAssignment().setResources(Arrays.asList("pvlcjbvyez", "wjk", "onbwhi", "eyozvrcw"));
        model = BinaryData.fromObject(model).toObject(ProjectAssignment.class);
        Assertions.assertEquals("pvlcjbvyez", model.getResources().get(0));
    }
}
