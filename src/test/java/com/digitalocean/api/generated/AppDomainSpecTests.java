package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppDomainSpec;
import com.digitalocean.api.models.AppDomainSpecMinimumTlsVersion;
import com.digitalocean.api.models.AppDomainSpecType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppDomainSpecTests {
    @Test
    public void testDeserialize() {
        AppDomainSpec model =
                BinaryData.fromString(
                                "{\"domain\":\"fgslqubkwdl\",\"type\":\"UNSPECIFIED\",\"wildcard\":false,\"zone\":\"tujbazpju\",\"minimum_tls_version\":\"1.3\"}")
                        .toObject(AppDomainSpec.class);
        Assertions.assertEquals("fgslqubkwdl", model.getDomain());
        Assertions.assertEquals(AppDomainSpecType.UNSPECIFIED, model.getType());
        Assertions.assertEquals(false, model.isWildcard());
        Assertions.assertEquals("tujbazpju", model.getZone());
        Assertions.assertEquals(AppDomainSpecMinimumTlsVersion.ONE3, model.getMinimumTlsVersion());
    }

    @Test
    public void testSerialize() {
        AppDomainSpec model =
                new AppDomainSpec()
                        .setDomain("fgslqubkwdl")
                        .setType(AppDomainSpecType.UNSPECIFIED)
                        .setWildcard(false)
                        .setZone("tujbazpju")
                        .setMinimumTlsVersion(AppDomainSpecMinimumTlsVersion.ONE3);
        model = BinaryData.fromObject(model).toObject(AppDomainSpec.class);
        Assertions.assertEquals("fgslqubkwdl", model.getDomain());
        Assertions.assertEquals(AppDomainSpecType.UNSPECIFIED, model.getType());
        Assertions.assertEquals(false, model.isWildcard());
        Assertions.assertEquals("tujbazpju", model.getZone());
        Assertions.assertEquals(AppDomainSpecMinimumTlsVersion.ONE3, model.getMinimumTlsVersion());
    }
}
