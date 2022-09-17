package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Certificate;
import com.digitalocean.api.models.CertificateType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CertificateTests {
    @Test
    public void testDeserialize() {
        Certificate model =
                BinaryData.fromString(
                                "{\"name\":\"atvcrkdlbnbq\",\"not_after\":\"2021-07-27T19:59:49Z\",\"sha1_fingerprint\":\"syhzlwx\",\"created_at\":\"2021-01-13T00:46:24Z\",\"dns_names\":[\"ur\",\"xdndsbdweaderzm\"],\"state\":\"error\",\"type\":\"custom\"}")
                        .toObject(Certificate.class);
        Assertions.assertEquals("atvcrkdlbnbq", model.getName());
        Assertions.assertEquals("ur", model.getDnsNames().get(0));
        Assertions.assertEquals(CertificateType.CUSTOM, model.getType());
    }

    @Test
    public void testSerialize() {
        Certificate model =
                new Certificate()
                        .setName("atvcrkdlbnbq")
                        .setDnsNames(Arrays.asList("ur", "xdndsbdweaderzm"))
                        .setType(CertificateType.CUSTOM);
        model = BinaryData.fromObject(model).toObject(Certificate.class);
        Assertions.assertEquals("atvcrkdlbnbq", model.getName());
        Assertions.assertEquals("ur", model.getDnsNames().get(0));
        Assertions.assertEquals(CertificateType.CUSTOM, model.getType());
    }
}
