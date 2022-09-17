package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsTier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsTierTests {
    @Test
    public void testDeserialize() {
        AppsTier model =
                BinaryData.fromString(
                                "{\"build_seconds\":\"lidwcwvmzegjon\",\"egress_bandwidth_bytes\":\"jirwgdnqzbrfk\",\"name\":\"zhzmtksjci\",\"slug\":\"igsxcdgljplk\",\"storage_bytes\":\"acht\"}")
                        .toObject(AppsTier.class);
        Assertions.assertEquals("lidwcwvmzegjon", model.getBuildSeconds());
        Assertions.assertEquals("jirwgdnqzbrfk", model.getEgressBandwidthBytes());
        Assertions.assertEquals("zhzmtksjci", model.getName());
        Assertions.assertEquals("igsxcdgljplk", model.getSlug());
        Assertions.assertEquals("acht", model.getStorageBytes());
    }

    @Test
    public void testSerialize() {
        AppsTier model =
                new AppsTier()
                        .setBuildSeconds("lidwcwvmzegjon")
                        .setEgressBandwidthBytes("jirwgdnqzbrfk")
                        .setName("zhzmtksjci")
                        .setSlug("igsxcdgljplk")
                        .setStorageBytes("acht");
        model = BinaryData.fromObject(model).toObject(AppsTier.class);
        Assertions.assertEquals("lidwcwvmzegjon", model.getBuildSeconds());
        Assertions.assertEquals("jirwgdnqzbrfk", model.getEgressBandwidthBytes());
        Assertions.assertEquals("zhzmtksjci", model.getName());
        Assertions.assertEquals("igsxcdgljplk", model.getSlug());
        Assertions.assertEquals("acht", model.getStorageBytes());
    }
}
