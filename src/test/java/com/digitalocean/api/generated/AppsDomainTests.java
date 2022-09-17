package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppDomainSpec;
import com.digitalocean.api.models.AppDomainSpecMinimumTlsVersion;
import com.digitalocean.api.models.AppDomainSpecType;
import com.digitalocean.api.models.AppsDomain;
import com.digitalocean.api.models.AppsDomainPhase;
import com.digitalocean.api.models.AppsDomainProgress;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsDomainTests {
    @Test
    public void testDeserialize() {
        AppsDomain model =
                BinaryData.fromString(
                                "{\"id\":\"tillucbiqtg\",\"phase\":\"ACTIVE\",\"progress\":{\"steps\":[]},\"spec\":{\"domain\":\"sldrizetpwbral\",\"type\":\"UNSPECIFIED\",\"wildcard\":false,\"zone\":\"bqzmizaka\",\"minimum_tls_version\":\"1.3\"}}")
                        .toObject(AppsDomain.class);
        Assertions.assertEquals("tillucbiqtg", model.getId());
        Assertions.assertEquals(AppsDomainPhase.ACTIVE, model.getPhase());
        Assertions.assertEquals("sldrizetpwbral", model.getSpec().getDomain());
        Assertions.assertEquals(AppDomainSpecType.UNSPECIFIED, model.getSpec().getType());
        Assertions.assertEquals(false, model.getSpec().isWildcard());
        Assertions.assertEquals("bqzmizaka", model.getSpec().getZone());
        Assertions.assertEquals(AppDomainSpecMinimumTlsVersion.ONE3, model.getSpec().getMinimumTlsVersion());
    }

    @Test
    public void testSerialize() {
        AppsDomain model =
                new AppsDomain()
                        .setId("tillucbiqtg")
                        .setPhase(AppsDomainPhase.ACTIVE)
                        .setProgress(new AppsDomainProgress().setSteps(Arrays.asList()))
                        .setSpec(
                                new AppDomainSpec()
                                        .setDomain("sldrizetpwbral")
                                        .setType(AppDomainSpecType.UNSPECIFIED)
                                        .setWildcard(false)
                                        .setZone("bqzmizaka")
                                        .setMinimumTlsVersion(AppDomainSpecMinimumTlsVersion.ONE3));
        model = BinaryData.fromObject(model).toObject(AppsDomain.class);
        Assertions.assertEquals("tillucbiqtg", model.getId());
        Assertions.assertEquals(AppsDomainPhase.ACTIVE, model.getPhase());
        Assertions.assertEquals("sldrizetpwbral", model.getSpec().getDomain());
        Assertions.assertEquals(AppDomainSpecType.UNSPECIFIED, model.getSpec().getType());
        Assertions.assertEquals(false, model.getSpec().isWildcard());
        Assertions.assertEquals("bqzmizaka", model.getSpec().getZone());
        Assertions.assertEquals(AppDomainSpecMinimumTlsVersion.ONE3, model.getSpec().getMinimumTlsVersion());
    }
}
