package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsGetTierResponse;
import com.digitalocean.api.models.AppsTier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsGetTierResponseTests {
    @Test
    public void testDeserialize() {
        AppsGetTierResponse model =
                BinaryData.fromString(
                                "{\"tier\":{\"build_seconds\":\"lryts\",\"egress_bandwidth_bytes\":\"pfmdgycx\",\"name\":\"skw\",\"slug\":\"jjyslurlps\",\"storage_bytes\":\"kvp\"}}")
                        .toObject(AppsGetTierResponse.class);
        Assertions.assertEquals("lryts", model.getTier().getBuildSeconds());
        Assertions.assertEquals("pfmdgycx", model.getTier().getEgressBandwidthBytes());
        Assertions.assertEquals("skw", model.getTier().getName());
        Assertions.assertEquals("jjyslurlps", model.getTier().getSlug());
        Assertions.assertEquals("kvp", model.getTier().getStorageBytes());
    }

    @Test
    public void testSerialize() {
        AppsGetTierResponse model =
                new AppsGetTierResponse()
                        .setTier(
                                new AppsTier()
                                        .setBuildSeconds("lryts")
                                        .setEgressBandwidthBytes("pfmdgycx")
                                        .setName("skw")
                                        .setSlug("jjyslurlps")
                                        .setStorageBytes("kvp"));
        model = BinaryData.fromObject(model).toObject(AppsGetTierResponse.class);
        Assertions.assertEquals("lryts", model.getTier().getBuildSeconds());
        Assertions.assertEquals("pfmdgycx", model.getTier().getEgressBandwidthBytes());
        Assertions.assertEquals("skw", model.getTier().getName());
        Assertions.assertEquals("jjyslurlps", model.getTier().getSlug());
        Assertions.assertEquals("kvp", model.getTier().getStorageBytes());
    }
}
