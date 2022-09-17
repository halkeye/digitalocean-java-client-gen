package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.CertificateCreateBase;
import com.digitalocean.api.models.CertificateCreateBaseType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CertificateCreateBaseTests {
    @Test
    public void testDeserialize() {
        CertificateCreateBase model =
                BinaryData.fromString("{\"name\":\"itpfinzcpdl\",\"type\":\"custom\"}")
                        .toObject(CertificateCreateBase.class);
        Assertions.assertEquals("itpfinzcpdl", model.getName());
        Assertions.assertEquals(CertificateCreateBaseType.CUSTOM, model.getType());
    }

    @Test
    public void testSerialize() {
        CertificateCreateBase model =
                new CertificateCreateBase().setName("itpfinzcpdl").setType(CertificateCreateBaseType.CUSTOM);
        model = BinaryData.fromObject(model).toObject(CertificateCreateBase.class);
        Assertions.assertEquals("itpfinzcpdl", model.getName());
        Assertions.assertEquals(CertificateCreateBaseType.CUSTOM, model.getType());
    }
}
