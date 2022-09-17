package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ClusterRegistries;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterRegistriesTests {
    @Test
    public void testDeserialize() {
        ClusterRegistries model =
                BinaryData.fromString("{\"cluster_uuids\":[\"fmd\",\"ecvtamqwzmno\",\"fe\"]}")
                        .toObject(ClusterRegistries.class);
        Assertions.assertEquals("fmd", model.getClusterUuids().get(0));
    }

    @Test
    public void testSerialize() {
        ClusterRegistries model = new ClusterRegistries().setClusterUuids(Arrays.asList("fmd", "ecvtamqwzmno", "fe"));
        model = BinaryData.fromObject(model).toObject(ClusterRegistries.class);
        Assertions.assertEquals("fmd", model.getClusterUuids().get(0));
    }
}
