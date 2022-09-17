package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsInstanceSize;
import com.digitalocean.api.models.InstanceSizeCpuType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsInstanceSizeTests {
    @Test
    public void testDeserialize() {
        AppsInstanceSize model =
                BinaryData.fromString(
                                "{\"cpu_type\":\"DEDICATED\",\"cpus\":\"twvc\",\"memory_bytes\":\"swkacvej\",\"name\":\"dvlvhbwrnfxtgdd\",\"slug\":\"th\",\"tier_downgrade_to\":\"n\",\"tier_slug\":\"aoyankcoeqswa\",\"tier_upgrade_to\":\"ltytmhdr\",\"usd_per_month\":\"nnhdrl\",\"usd_per_second\":\"gjc\"}")
                        .toObject(AppsInstanceSize.class);
        Assertions.assertEquals(InstanceSizeCpuType.DEDICATED, model.getCpuType());
        Assertions.assertEquals("twvc", model.getCpus());
        Assertions.assertEquals("swkacvej", model.getMemoryBytes());
        Assertions.assertEquals("dvlvhbwrnfxtgdd", model.getName());
        Assertions.assertEquals("th", model.getSlug());
        Assertions.assertEquals("n", model.getTierDowngradeTo());
        Assertions.assertEquals("aoyankcoeqswa", model.getTierSlug());
        Assertions.assertEquals("ltytmhdr", model.getTierUpgradeTo());
        Assertions.assertEquals("nnhdrl", model.getUsdPerMonth());
        Assertions.assertEquals("gjc", model.getUsdPerSecond());
    }

    @Test
    public void testSerialize() {
        AppsInstanceSize model =
                new AppsInstanceSize()
                        .setCpuType(InstanceSizeCpuType.DEDICATED)
                        .setCpus("twvc")
                        .setMemoryBytes("swkacvej")
                        .setName("dvlvhbwrnfxtgdd")
                        .setSlug("th")
                        .setTierDowngradeTo("n")
                        .setTierSlug("aoyankcoeqswa")
                        .setTierUpgradeTo("ltytmhdr")
                        .setUsdPerMonth("nnhdrl")
                        .setUsdPerSecond("gjc");
        model = BinaryData.fromObject(model).toObject(AppsInstanceSize.class);
        Assertions.assertEquals(InstanceSizeCpuType.DEDICATED, model.getCpuType());
        Assertions.assertEquals("twvc", model.getCpus());
        Assertions.assertEquals("swkacvej", model.getMemoryBytes());
        Assertions.assertEquals("dvlvhbwrnfxtgdd", model.getName());
        Assertions.assertEquals("th", model.getSlug());
        Assertions.assertEquals("n", model.getTierDowngradeTo());
        Assertions.assertEquals("aoyankcoeqswa", model.getTierSlug());
        Assertions.assertEquals("ltytmhdr", model.getTierUpgradeTo());
        Assertions.assertEquals("nnhdrl", model.getUsdPerMonth());
        Assertions.assertEquals("gjc", model.getUsdPerSecond());
    }
}
