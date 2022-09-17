package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Certificate;
import com.digitalocean.api.models.CertificateType;
import com.digitalocean.api.models.ComponentsOispf1ResponsesNewCertificateContentApplicationJsonSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsOispf1ResponsesNewCertificateContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsOispf1ResponsesNewCertificateContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"certificate\":{\"name\":\"lcdi\",\"not_after\":\"2021-03-02T16:11:37Z\",\"sha1_fingerprint\":\"jbrzmqxucyc\",\"created_at\":\"2021-11-18T09:34:55Z\",\"dns_names\":[\"xiutgjcyzyzj\",\"nrqjbtxjea\",\"qaqbz\",\"yh\"],\"state\":\"verified\",\"type\":\"lets_encrypt\"}}")
                        .toObject(ComponentsOispf1ResponsesNewCertificateContentApplicationJsonSchema.class);
        Assertions.assertEquals("lcdi", model.getCertificate().getName());
        Assertions.assertEquals("xiutgjcyzyzj", model.getCertificate().getDnsNames().get(0));
        Assertions.assertEquals(CertificateType.LETS_ENCRYPT, model.getCertificate().getType());
    }

    @Test
    public void testSerialize() {
        ComponentsOispf1ResponsesNewCertificateContentApplicationJsonSchema model =
                new ComponentsOispf1ResponsesNewCertificateContentApplicationJsonSchema()
                        .setCertificate(
                                new Certificate()
                                        .setName("lcdi")
                                        .setDnsNames(Arrays.asList("xiutgjcyzyzj", "nrqjbtxjea", "qaqbz", "yh"))
                                        .setType(CertificateType.LETS_ENCRYPT));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsOispf1ResponsesNewCertificateContentApplicationJsonSchema.class);
        Assertions.assertEquals("lcdi", model.getCertificate().getName());
        Assertions.assertEquals("xiutgjcyzyzj", model.getCertificate().getDnsNames().get(0));
        Assertions.assertEquals(CertificateType.LETS_ENCRYPT, model.getCertificate().getType());
    }
}
