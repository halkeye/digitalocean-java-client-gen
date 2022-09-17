package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ForwardingRule;
import com.digitalocean.api.models.ForwardingRuleEntryProtocol;
import com.digitalocean.api.models.ForwardingRuleTargetProtocol;
import com.digitalocean.api.models.Paths18B54PqV2LoadBalancersLbIdForwardingRulesDeleteRequestbodyContentApplicationJsonSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths18B54PqV2LoadBalancersLbIdForwardingRulesDeleteRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths18B54PqV2LoadBalancersLbIdForwardingRulesDeleteRequestbodyContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"forwarding_rules\":[{\"entry_protocol\":\"http\",\"entry_port\":1231841276,\"target_protocol\":\"https\",\"target_port\":1522958299,\"certificate_id\":\"ngvyvuoik\",\"tls_passthrough\":true},{\"entry_protocol\":\"udp\",\"entry_port\":1777736,\"target_protocol\":\"http\",\"target_port\":557293283,\"certificate_id\":\"gfwi\",\"tls_passthrough\":false}]}")
                        .toObject(
                                Paths18B54PqV2LoadBalancersLbIdForwardingRulesDeleteRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals(ForwardingRuleEntryProtocol.HTTP, model.getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(1231841276, model.getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(
                ForwardingRuleTargetProtocol.HTTPS, model.getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(1522958299, model.getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("ngvyvuoik", model.getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(true, model.getForwardingRules().get(0).isTlsPassthrough());
    }

    @Test
    public void testSerialize() {
        Paths18B54PqV2LoadBalancersLbIdForwardingRulesDeleteRequestbodyContentApplicationJsonSchema model =
                new Paths18B54PqV2LoadBalancersLbIdForwardingRulesDeleteRequestbodyContentApplicationJsonSchema()
                        .setForwardingRules(
                                Arrays.asList(
                                        new ForwardingRule()
                                                .setEntryProtocol(ForwardingRuleEntryProtocol.HTTP)
                                                .setEntryPort(1231841276)
                                                .setTargetProtocol(ForwardingRuleTargetProtocol.HTTPS)
                                                .setTargetPort(1522958299)
                                                .setCertificateId("ngvyvuoik")
                                                .setTlsPassthrough(true),
                                        new ForwardingRule()
                                                .setEntryProtocol(ForwardingRuleEntryProtocol.UDP)
                                                .setEntryPort(1777736)
                                                .setTargetProtocol(ForwardingRuleTargetProtocol.HTTP)
                                                .setTargetPort(557293283)
                                                .setCertificateId("gfwi")
                                                .setTlsPassthrough(false)));
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                Paths18B54PqV2LoadBalancersLbIdForwardingRulesDeleteRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals(ForwardingRuleEntryProtocol.HTTP, model.getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(1231841276, model.getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(
                ForwardingRuleTargetProtocol.HTTPS, model.getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(1522958299, model.getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("ngvyvuoik", model.getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(true, model.getForwardingRules().get(0).isTlsPassthrough());
    }
}
