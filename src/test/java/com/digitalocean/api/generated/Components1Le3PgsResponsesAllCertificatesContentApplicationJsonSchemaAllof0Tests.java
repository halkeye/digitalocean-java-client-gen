package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Certificate;
import com.digitalocean.api.models.CertificateType;
import com.digitalocean.api.models.Components1Le3PgsResponsesAllCertificatesContentApplicationJsonSchemaAllof0;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Le3PgsResponsesAllCertificatesContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1Le3PgsResponsesAllCertificatesContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"certificates\":[{\"name\":\"yeji\",\"not_after\":\"2021-10-02T18:03:34Z\",\"sha1_fingerprint\":\"egthortudawl\",\"created_at\":\"2020-12-31T10:27:05Z\",\"dns_names\":[\"qerpptcbgqnzm\",\"h\",\"ilialwcjgc\",\"bbcccgz\"],\"state\":\"verified\",\"type\":\"lets_encrypt\"},{\"name\":\"uffatsgftipwc\",\"not_after\":\"2021-01-22T16:26:57Z\",\"sha1_fingerprint\":\"bh\",\"created_at\":\"2021-05-15T03:11:10Z\",\"dns_names\":[\"urnpnuhzafccnuh\",\"i\",\"byl\"],\"state\":\"pending\",\"type\":\"custom\"}]}").toObject(Components1Le3PgsResponsesAllCertificatesContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("yeji", model.getCertificates().get(0).getName());
        Assertions.assertEquals("qerpptcbgqnzm", model.getCertificates().get(0).getDnsNames().get(0));
        Assertions.assertEquals(CertificateType.LETS_ENCRYPT, model.getCertificates().get(0).getType());
    }

    @Test
    public void testSerialize() {
        Components1Le3PgsResponsesAllCertificatesContentApplicationJsonSchemaAllof0 model = new Components1Le3PgsResponsesAllCertificatesContentApplicationJsonSchemaAllof0().setCertificates(Arrays.asList(new Certificate().setName("yeji").setDnsNames(Arrays.asList("qerpptcbgqnzm", "h", "ilialwcjgc", "bbcccgz")).setType(CertificateType.LETS_ENCRYPT), new Certificate().setName("uffatsgftipwc").setDnsNames(Arrays.asList("urnpnuhzafccnuh", "i", "byl")).setType(CertificateType.CUSTOM)));
        model = BinaryData.fromObject(model).toObject(Components1Le3PgsResponsesAllCertificatesContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("yeji", model.getCertificates().get(0).getName());
        Assertions.assertEquals("qerpptcbgqnzm", model.getCertificates().get(0).getDnsNames().get(0));
        Assertions.assertEquals(CertificateType.LETS_ENCRYPT, model.getCertificates().get(0).getType());
    }
}
