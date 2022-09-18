package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.UserKubernetesClusterUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UserKubernetesClusterUserTests {
    @Test
    public void testDeserialize() {
        UserKubernetesClusterUser model = BinaryData.fromString("{\"username\":\"hvbvvcpwtqsus\",\"groups\":[\"mzy\"]}").toObject(UserKubernetesClusterUser.class);
        Assertions.assertEquals("hvbvvcpwtqsus", model.getUsername());
        Assertions.assertEquals("mzy", model.getGroups().get(0));
    }

    @Test
    public void testSerialize() {
        UserKubernetesClusterUser model = new UserKubernetesClusterUser().setUsername("hvbvvcpwtqsus").setGroups(Arrays.asList("mzy"));
        model = BinaryData.fromObject(model).toObject(UserKubernetesClusterUser.class);
        Assertions.assertEquals("hvbvvcpwtqsus", model.getUsername());
        Assertions.assertEquals("mzy", model.getGroups().get(0));
    }
}
