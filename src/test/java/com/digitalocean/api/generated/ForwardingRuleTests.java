package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ForwardingRule;
import com.digitalocean.api.models.ForwardingRuleEntryProtocol;
import com.digitalocean.api.models.ForwardingRuleTargetProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ForwardingRuleTests {
    @Test
    public void testDeserialize() {
        ForwardingRule model = BinaryData.fromString("{\"entry_protocol\":\"http\",\"entry_port\":1515129407,\"target_protocol\":\"https\",\"target_port\":996544782,\"certificate_id\":\"nqpljpet\",\"tls_passthrough\":true}").toObject(ForwardingRule.class);
        Assertions.assertEquals(ForwardingRuleEntryProtocol.HTTP, model.getEntryProtocol());
        Assertions.assertEquals(1515129407, model.getEntryPort());
        Assertions.assertEquals(ForwardingRuleTargetProtocol.HTTPS, model.getTargetProtocol());
        Assertions.assertEquals(996544782, model.getTargetPort());
        Assertions.assertEquals("nqpljpet", model.getCertificateId());
        Assertions.assertEquals(true, model.isTlsPassthrough());
    }

    @Test
    public void testSerialize() {
        ForwardingRule model = new ForwardingRule().setEntryProtocol(ForwardingRuleEntryProtocol.HTTP).setEntryPort(1515129407).setTargetProtocol(ForwardingRuleTargetProtocol.HTTPS).setTargetPort(996544782).setCertificateId("nqpljpet").setTlsPassthrough(true);
        model = BinaryData.fromObject(model).toObject(ForwardingRule.class);
        Assertions.assertEquals(ForwardingRuleEntryProtocol.HTTP, model.getEntryProtocol());
        Assertions.assertEquals(1515129407, model.getEntryPort());
        Assertions.assertEquals(ForwardingRuleTargetProtocol.HTTPS, model.getTargetProtocol());
        Assertions.assertEquals(996544782, model.getTargetPort());
        Assertions.assertEquals("nqpljpet", model.getCertificateId());
        Assertions.assertEquals(true, model.isTlsPassthrough());
    }
}
