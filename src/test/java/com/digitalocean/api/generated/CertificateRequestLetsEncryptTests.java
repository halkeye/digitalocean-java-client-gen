package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.CertificateCreateBase;
import com.digitalocean.api.models.CertificateCreateBaseType;
import com.digitalocean.api.models.CertificateRequestLetsEncrypt;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CertificateRequestLetsEncryptTests {
    @Test
    public void testDeserialize() {
        CertificateRequestLetsEncrypt model = BinaryData.fromString("{\"dns_names\":[\"gttmvmmagoaqyl\",\"jz\"],\"name\":\"jiuazjc\",\"type\":\"custom\"}").toObject(CertificateRequestLetsEncrypt.class);
        Assertions.assertEquals("jiuazjc", model.getName());
        Assertions.assertEquals(CertificateCreateBaseType.CUSTOM, model.getType());
        Assertions.assertEquals("gttmvmmagoaqyl", model.getDnsNames().get(0));
    }

    @Test
    public void testSerialize() {
        CertificateRequestLetsEncrypt model = new CertificateRequestLetsEncrypt().setName("jiuazjc").setType(CertificateCreateBaseType.CUSTOM).setDnsNames(Arrays.asList("gttmvmmagoaqyl", "jz"));
        model = BinaryData.fromObject(model).toObject(CertificateRequestLetsEncrypt.class);
        Assertions.assertEquals("jiuazjc", model.getName());
        Assertions.assertEquals(CertificateCreateBaseType.CUSTOM, model.getType());
        Assertions.assertEquals("gttmvmmagoaqyl", model.getDnsNames().get(0));
    }
}
