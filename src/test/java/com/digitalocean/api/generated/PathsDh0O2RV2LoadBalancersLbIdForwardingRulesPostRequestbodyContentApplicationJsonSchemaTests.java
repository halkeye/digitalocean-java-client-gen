package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ForwardingRule;
import com.digitalocean.api.models.ForwardingRuleEntryProtocol;
import com.digitalocean.api.models.ForwardingRuleTargetProtocol;
import com.digitalocean.api.models.PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"forwarding_rules\":[{\"entry_protocol\":\"http2\",\"entry_port\":1790621244,\"target_protocol\":\"http2\",\"target_port\":103033953,\"certificate_id\":\"btfloilmk\",\"tls_passthrough\":true}]}").toObject(PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(ForwardingRuleEntryProtocol.HTTP2, model.getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(1790621244, model.getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(ForwardingRuleTargetProtocol.HTTP2, model.getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(103033953, model.getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("btfloilmk", model.getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(true, model.getForwardingRules().get(0).isTlsPassthrough());
    }

    @Test
    public void testSerialize() {
        PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema model = new PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema().setForwardingRules(Arrays.asList(new ForwardingRule().setEntryProtocol(ForwardingRuleEntryProtocol.HTTP2).setEntryPort(1790621244).setTargetProtocol(ForwardingRuleTargetProtocol.HTTP2).setTargetPort(103033953).setCertificateId("btfloilmk").setTlsPassthrough(true)));
        model = BinaryData.fromObject(model).toObject(PathsDh0O2RV2LoadBalancersLbIdForwardingRulesPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals(ForwardingRuleEntryProtocol.HTTP2, model.getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(1790621244, model.getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(ForwardingRuleTargetProtocol.HTTP2, model.getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(103033953, model.getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("btfloilmk", model.getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(true, model.getForwardingRules().get(0).isTlsPassthrough());
    }
}
