package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.CertificateCreateBase;
import com.digitalocean.api.models.CertificateCreateBaseType;
import com.digitalocean.api.models.CertificateRequestCustom;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CertificateRequestCustomTests {
    @Test
    public void testDeserialize() {
        CertificateRequestCustom model = BinaryData.fromString("{\"private_key\":\"lgjmtbd\",\"leaf_certificate\":\"vcqguefzh\",\"certificate_chain\":\"p\",\"name\":\"eqdurelyujlfyoum\",\"type\":\"lets_encrypt\"}").toObject(CertificateRequestCustom.class);
        Assertions.assertEquals("eqdurelyujlfyoum", model.getName());
        Assertions.assertEquals(CertificateCreateBaseType.LETS_ENCRYPT, model.getType());
        Assertions.assertEquals("lgjmtbd", model.getPrivateKey());
        Assertions.assertEquals("vcqguefzh", model.getLeafCertificate());
        Assertions.assertEquals("p", model.getCertificateChain());
    }

    @Test
    public void testSerialize() {
        CertificateRequestCustom model = new CertificateRequestCustom().setName("eqdurelyujlfyoum").setType(CertificateCreateBaseType.LETS_ENCRYPT).setPrivateKey("lgjmtbd").setLeafCertificate("vcqguefzh").setCertificateChain("p");
        model = BinaryData.fromObject(model).toObject(CertificateRequestCustom.class);
        Assertions.assertEquals("eqdurelyujlfyoum", model.getName());
        Assertions.assertEquals(CertificateCreateBaseType.LETS_ENCRYPT, model.getType());
        Assertions.assertEquals("lgjmtbd", model.getPrivateKey());
        Assertions.assertEquals("vcqguefzh", model.getLeafCertificate());
        Assertions.assertEquals("p", model.getCertificateChain());
    }
}
