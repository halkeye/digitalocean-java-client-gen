package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Certificate;
import com.digitalocean.api.models.CertificateState;
import com.digitalocean.api.models.CertificateType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CertificateTests {
    @Test
    public void testDeserialize() {
        Certificate model = BinaryData.fromString("{\"name\":\"atvcrkdlbnbq\",\"not_after\":\"2021-07-27T19:59:49Z\",\"sha1_fingerprint\":\"syhzlwx\",\"created_at\":\"2021-01-13T00:46:24Z\",\"dns_names\":[\"ur\",\"xdndsbdweaderzm\"],\"state\":\"error\",\"type\":\"custom\"}").toObject(Certificate.class);
        Assertions.assertEquals("atvcrkdlbnbq", model.getName());
        Assertions.assertEquals("ur", model.getDnsNames().get(0));
        Assertions.assertEquals(CertificateType.CUSTOM, model.getType());
    }

    @Test
    public void testSerialize() {
        Certificate model = new Certificate().setName("atvcrkdlbnbq").setDnsNames(Arrays.asList("ur", "xdndsbdweaderzm")).setType(CertificateType.CUSTOM);
        model = BinaryData.fromObject(model).toObject(Certificate.class);
        Assertions.assertEquals("atvcrkdlbnbq", model.getName());
        Assertions.assertEquals("ur", model.getDnsNames().get(0));
        Assertions.assertEquals(CertificateType.CUSTOM, model.getType());
    }
}
