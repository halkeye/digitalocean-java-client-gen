package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Certificate;
import com.digitalocean.api.models.CertificateType;
import com.digitalocean.api.models.ComponentsHjzmbwResponsesExistingCertificateContentApplicationJsonSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsHjzmbwResponsesExistingCertificateContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsHjzmbwResponsesExistingCertificateContentApplicationJsonSchema model = BinaryData.fromString("{\"certificate\":{\"name\":\"wbqamteuliy\",\"not_after\":\"2021-06-17T06:47:53Z\",\"sha1_fingerprint\":\"cvmwfauxxepmy\",\"created_at\":\"2021-05-30T15:08:41Z\",\"dns_names\":[\"c\",\"miciij\",\"pkzfbojxj\"],\"state\":\"verified\",\"type\":\"lets_encrypt\"}}").toObject(ComponentsHjzmbwResponsesExistingCertificateContentApplicationJsonSchema.class);
        Assertions.assertEquals("wbqamteuliy", model.getCertificate().getName());
        Assertions.assertEquals("c", model.getCertificate().getDnsNames().get(0));
        Assertions.assertEquals(CertificateType.LETS_ENCRYPT, model.getCertificate().getType());
    }

    @Test
    public void testSerialize() {
        ComponentsHjzmbwResponsesExistingCertificateContentApplicationJsonSchema model = new ComponentsHjzmbwResponsesExistingCertificateContentApplicationJsonSchema().setCertificate(new Certificate().setName("wbqamteuliy").setDnsNames(Arrays.asList("c", "miciij", "pkzfbojxj")).setType(CertificateType.LETS_ENCRYPT));
        model = BinaryData.fromObject(model).toObject(ComponentsHjzmbwResponsesExistingCertificateContentApplicationJsonSchema.class);
        Assertions.assertEquals("wbqamteuliy", model.getCertificate().getName());
        Assertions.assertEquals("c", model.getCertificate().getDnsNames().get(0));
        Assertions.assertEquals(CertificateType.LETS_ENCRYPT, model.getCertificate().getType());
    }
}
