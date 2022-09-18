package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ClusterRegistries;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterRegistriesTests {
    @Test
    public void testDeserialize() {
        ClusterRegistries model = BinaryData.fromString("{\"cluster_uuids\":[\"fmd\",\"ecvtamqwzmno\",\"fe\"]}").toObject(ClusterRegistries.class);
        Assertions.assertEquals("fmd", model.getClusterUuids().get(0));
    }

    @Test
    public void testSerialize() {
        ClusterRegistries model = new ClusterRegistries().setClusterUuids(Arrays.asList("fmd", "ecvtamqwzmno", "fe"));
        model = BinaryData.fromObject(model).toObject(ClusterRegistries.class);
        Assertions.assertEquals("fmd", model.getClusterUuids().get(0));
    }
}
