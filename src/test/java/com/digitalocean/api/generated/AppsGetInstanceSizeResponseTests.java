package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsGetInstanceSizeResponse;
import com.digitalocean.api.models.AppsInstanceSize;
import com.digitalocean.api.models.InstanceSizeCpuType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsGetInstanceSizeResponseTests {
    @Test
    public void testDeserialize() {
        AppsGetInstanceSizeResponse model =
                BinaryData.fromString(
                                "{\"instance_size\":{\"cpu_type\":\"UNSPECIFIED\",\"cpus\":\"hemlwywaee\",\"memory_bytes\":\"gfbukklelss\",\"name\":\"lycsxz\",\"slug\":\"ksrl\",\"tier_downgrade_to\":\"desqplpvmjcdo\",\"tier_slug\":\"bidyv\",\"tier_upgrade_to\":\"owx\",\"usd_per_month\":\"piudeugfsxzecpa\",\"usd_per_second\":\"kufykhvu\"}}")
                        .toObject(AppsGetInstanceSizeResponse.class);
        Assertions.assertEquals(InstanceSizeCpuType.UNSPECIFIED, model.getInstanceSize().getCpuType());
        Assertions.assertEquals("hemlwywaee", model.getInstanceSize().getCpus());
        Assertions.assertEquals("gfbukklelss", model.getInstanceSize().getMemoryBytes());
        Assertions.assertEquals("lycsxz", model.getInstanceSize().getName());
        Assertions.assertEquals("ksrl", model.getInstanceSize().getSlug());
        Assertions.assertEquals("desqplpvmjcdo", model.getInstanceSize().getTierDowngradeTo());
        Assertions.assertEquals("bidyv", model.getInstanceSize().getTierSlug());
        Assertions.assertEquals("owx", model.getInstanceSize().getTierUpgradeTo());
        Assertions.assertEquals("piudeugfsxzecpa", model.getInstanceSize().getUsdPerMonth());
        Assertions.assertEquals("kufykhvu", model.getInstanceSize().getUsdPerSecond());
    }

    @Test
    public void testSerialize() {
        AppsGetInstanceSizeResponse model =
                new AppsGetInstanceSizeResponse()
                        .setInstanceSize(
                                new AppsInstanceSize()
                                        .setCpuType(InstanceSizeCpuType.UNSPECIFIED)
                                        .setCpus("hemlwywaee")
                                        .setMemoryBytes("gfbukklelss")
                                        .setName("lycsxz")
                                        .setSlug("ksrl")
                                        .setTierDowngradeTo("desqplpvmjcdo")
                                        .setTierSlug("bidyv")
                                        .setTierUpgradeTo("owx")
                                        .setUsdPerMonth("piudeugfsxzecpa")
                                        .setUsdPerSecond("kufykhvu"));
        model = BinaryData.fromObject(model).toObject(AppsGetInstanceSizeResponse.class);
        Assertions.assertEquals(InstanceSizeCpuType.UNSPECIFIED, model.getInstanceSize().getCpuType());
        Assertions.assertEquals("hemlwywaee", model.getInstanceSize().getCpus());
        Assertions.assertEquals("gfbukklelss", model.getInstanceSize().getMemoryBytes());
        Assertions.assertEquals("lycsxz", model.getInstanceSize().getName());
        Assertions.assertEquals("ksrl", model.getInstanceSize().getSlug());
        Assertions.assertEquals("desqplpvmjcdo", model.getInstanceSize().getTierDowngradeTo());
        Assertions.assertEquals("bidyv", model.getInstanceSize().getTierSlug());
        Assertions.assertEquals("owx", model.getInstanceSize().getTierUpgradeTo());
        Assertions.assertEquals("piudeugfsxzecpa", model.getInstanceSize().getUsdPerMonth());
        Assertions.assertEquals("kufykhvu", model.getInstanceSize().getUsdPerSecond());
    }
}
