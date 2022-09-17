package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsInstanceSize;
import com.digitalocean.api.models.AppsListInstanceSizesResponse;
import com.digitalocean.api.models.InstanceSizeCpuType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsListInstanceSizesResponseTests {
    @Test
    public void testDeserialize() {
        AppsListInstanceSizesResponse model =
                BinaryData.fromString(
                                "{\"discount_percent\":70.82197,\"instance_sizes\":[{\"cpu_type\":\"DEDICATED\",\"cpus\":\"hmpqvw\",\"memory_bytes\":\"kondcb\",\"name\":\"imuvqejosovyrrl\",\"slug\":\"esi\",\"tier_downgrade_to\":\"qtljqobbpihehc\",\"tier_slug\":\"ybmrqbrjbbmp\",\"tier_upgrade_to\":\"lvykfrex\",\"usd_per_month\":\"s\",\"usd_per_second\":\"wjksghudgzhxo\"},{\"cpu_type\":\"DEDICATED\",\"cpus\":\"svoujkxi\",\"memory_bytes\":\"afhrkmdyomk\",\"name\":\"bv\",\"slug\":\"hd\",\"tier_downgrade_to\":\"rhpw\",\"tier_slug\":\"ddei\",\"tier_upgrade_to\":\"wzovgk\",\"usd_per_month\":\"muikjcjcaztbws\",\"usd_per_second\":\"qowxwcom\"}]}")
                        .toObject(AppsListInstanceSizesResponse.class);
        Assertions.assertEquals(70.82197F, model.getDiscountPercent());
        Assertions.assertEquals(InstanceSizeCpuType.DEDICATED, model.getInstanceSizes().get(0).getCpuType());
        Assertions.assertEquals("hmpqvw", model.getInstanceSizes().get(0).getCpus());
        Assertions.assertEquals("kondcb", model.getInstanceSizes().get(0).getMemoryBytes());
        Assertions.assertEquals("imuvqejosovyrrl", model.getInstanceSizes().get(0).getName());
        Assertions.assertEquals("esi", model.getInstanceSizes().get(0).getSlug());
        Assertions.assertEquals("qtljqobbpihehc", model.getInstanceSizes().get(0).getTierDowngradeTo());
        Assertions.assertEquals("ybmrqbrjbbmp", model.getInstanceSizes().get(0).getTierSlug());
        Assertions.assertEquals("lvykfrex", model.getInstanceSizes().get(0).getTierUpgradeTo());
        Assertions.assertEquals("s", model.getInstanceSizes().get(0).getUsdPerMonth());
        Assertions.assertEquals("wjksghudgzhxo", model.getInstanceSizes().get(0).getUsdPerSecond());
    }

    @Test
    public void testSerialize() {
        AppsListInstanceSizesResponse model =
                new AppsListInstanceSizesResponse()
                        .setDiscountPercent(70.82197F)
                        .setInstanceSizes(
                                Arrays.asList(
                                        new AppsInstanceSize()
                                                .setCpuType(InstanceSizeCpuType.DEDICATED)
                                                .setCpus("hmpqvw")
                                                .setMemoryBytes("kondcb")
                                                .setName("imuvqejosovyrrl")
                                                .setSlug("esi")
                                                .setTierDowngradeTo("qtljqobbpihehc")
                                                .setTierSlug("ybmrqbrjbbmp")
                                                .setTierUpgradeTo("lvykfrex")
                                                .setUsdPerMonth("s")
                                                .setUsdPerSecond("wjksghudgzhxo"),
                                        new AppsInstanceSize()
                                                .setCpuType(InstanceSizeCpuType.DEDICATED)
                                                .setCpus("svoujkxi")
                                                .setMemoryBytes("afhrkmdyomk")
                                                .setName("bv")
                                                .setSlug("hd")
                                                .setTierDowngradeTo("rhpw")
                                                .setTierSlug("ddei")
                                                .setTierUpgradeTo("wzovgk")
                                                .setUsdPerMonth("muikjcjcaztbws")
                                                .setUsdPerSecond("qowxwcom")));
        model = BinaryData.fromObject(model).toObject(AppsListInstanceSizesResponse.class);
        Assertions.assertEquals(70.82197F, model.getDiscountPercent());
        Assertions.assertEquals(InstanceSizeCpuType.DEDICATED, model.getInstanceSizes().get(0).getCpuType());
        Assertions.assertEquals("hmpqvw", model.getInstanceSizes().get(0).getCpus());
        Assertions.assertEquals("kondcb", model.getInstanceSizes().get(0).getMemoryBytes());
        Assertions.assertEquals("imuvqejosovyrrl", model.getInstanceSizes().get(0).getName());
        Assertions.assertEquals("esi", model.getInstanceSizes().get(0).getSlug());
        Assertions.assertEquals("qtljqobbpihehc", model.getInstanceSizes().get(0).getTierDowngradeTo());
        Assertions.assertEquals("ybmrqbrjbbmp", model.getInstanceSizes().get(0).getTierSlug());
        Assertions.assertEquals("lvykfrex", model.getInstanceSizes().get(0).getTierUpgradeTo());
        Assertions.assertEquals("s", model.getInstanceSizes().get(0).getUsdPerMonth());
        Assertions.assertEquals("wjksghudgzhxo", model.getInstanceSizes().get(0).getUsdPerSecond());
    }
}
