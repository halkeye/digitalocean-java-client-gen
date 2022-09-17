package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsListTiersResponse;
import com.digitalocean.api.models.AppsTier;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsListTiersResponseTests {
    @Test
    public void testDeserialize() {
        AppsListTiersResponse model =
                BinaryData.fromString(
                                "{\"tiers\":[{\"build_seconds\":\"hguynuchlgmltxdw\",\"egress_bandwidth_bytes\":\"ozusgz\",\"name\":\"ns\",\"slug\":\"jzfpafolpymwamx\",\"storage_bytes\":\"rag\"},{\"build_seconds\":\"dphtv\",\"egress_bandwidth_bytes\":\"lajv\",\"name\":\"jchcsrlzknmzla\",\"slug\":\"updwv\",\"storage_bytes\":\"hcnzqt\"},{\"build_seconds\":\"hmqrhvthlaiwdc\",\"egress_bandwidth_bytes\":\"mlzzhzdtxetlgyd\",\"name\":\"qvlnnpxybafiqgea\",\"slug\":\"bgj\",\"storage_bytes\":\"glklb\"}]}")
                        .toObject(AppsListTiersResponse.class);
        Assertions.assertEquals("hguynuchlgmltxdw", model.getTiers().get(0).getBuildSeconds());
        Assertions.assertEquals("ozusgz", model.getTiers().get(0).getEgressBandwidthBytes());
        Assertions.assertEquals("ns", model.getTiers().get(0).getName());
        Assertions.assertEquals("jzfpafolpymwamx", model.getTiers().get(0).getSlug());
        Assertions.assertEquals("rag", model.getTiers().get(0).getStorageBytes());
    }

    @Test
    public void testSerialize() {
        AppsListTiersResponse model =
                new AppsListTiersResponse()
                        .setTiers(
                                Arrays.asList(
                                        new AppsTier()
                                                .setBuildSeconds("hguynuchlgmltxdw")
                                                .setEgressBandwidthBytes("ozusgz")
                                                .setName("ns")
                                                .setSlug("jzfpafolpymwamx")
                                                .setStorageBytes("rag"),
                                        new AppsTier()
                                                .setBuildSeconds("dphtv")
                                                .setEgressBandwidthBytes("lajv")
                                                .setName("jchcsrlzknmzla")
                                                .setSlug("updwv")
                                                .setStorageBytes("hcnzqt"),
                                        new AppsTier()
                                                .setBuildSeconds("hmqrhvthlaiwdc")
                                                .setEgressBandwidthBytes("mlzzhzdtxetlgyd")
                                                .setName("qvlnnpxybafiqgea")
                                                .setSlug("bgj")
                                                .setStorageBytes("glklb")));
        model = BinaryData.fromObject(model).toObject(AppsListTiersResponse.class);
        Assertions.assertEquals("hguynuchlgmltxdw", model.getTiers().get(0).getBuildSeconds());
        Assertions.assertEquals("ozusgz", model.getTiers().get(0).getEgressBandwidthBytes());
        Assertions.assertEquals("ns", model.getTiers().get(0).getName());
        Assertions.assertEquals("jzfpafolpymwamx", model.getTiers().get(0).getSlug());
        Assertions.assertEquals("rag", model.getTiers().get(0).getStorageBytes());
    }
}
