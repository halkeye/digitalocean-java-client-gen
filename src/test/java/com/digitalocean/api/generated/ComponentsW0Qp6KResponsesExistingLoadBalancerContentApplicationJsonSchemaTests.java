package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsW0Qp6KResponsesExistingLoadBalancerContentApplicationJsonSchema;
import com.digitalocean.api.models.ForwardingRule;
import com.digitalocean.api.models.ForwardingRuleEntryProtocol;
import com.digitalocean.api.models.ForwardingRuleTargetProtocol;
import com.digitalocean.api.models.HealthCheck;
import com.digitalocean.api.models.HealthCheckProtocol;
import com.digitalocean.api.models.LoadBalancer;
import com.digitalocean.api.models.LoadBalancerBaseAlgorithm;
import com.digitalocean.api.models.LoadBalancerBaseSize;
import com.digitalocean.api.models.StickySessions;
import com.digitalocean.api.models.StickySessionsType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsW0Qp6KResponsesExistingLoadBalancerContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsW0Qp6KResponsesExistingLoadBalancerContentApplicationJsonSchema model = BinaryData.fromString("{\"load_balancer\":{\"tag\":\"phgliupqscoobk\",\"name\":\"axsqcomji\",\"ip\":\"incev\",\"size_unit\":676319251,\"size\":\"lb-small\",\"algorithm\":\"least_connections\",\"status\":\"errored\",\"created_at\":\"2021-06-17T10:20:24Z\",\"forwarding_rules\":[{\"entry_protocol\":\"udp\",\"entry_port\":305599752,\"target_protocol\":\"https\",\"target_port\":2033817605,\"certificate_id\":\"mduvtvodqxxp\",\"tls_passthrough\":false}],\"health_check\":{\"protocol\":\"http\",\"port\":799929731,\"path\":\"lmcvrjaznotdofq\",\"check_interval_seconds\":484759838,\"response_timeout_seconds\":620120625,\"unhealthy_threshold\":2077416906,\"healthy_threshold\":1779009385},\"sticky_sessions\":{\"type\":\"cookies\",\"cookie_name\":\"bbmitaftaz\",\"cookie_ttl_seconds\":953956672},\"redirect_http_to_https\":true,\"enable_proxy_protocol\":true,\"enable_backend_keepalive\":false,\"disable_lets_encrypt_dns_records\":false}}").toObject(ComponentsW0Qp6KResponsesExistingLoadBalancerContentApplicationJsonSchema.class);
        Assertions.assertEquals("axsqcomji", model.getLoadBalancer().getName());
        Assertions.assertEquals(676319251, model.getLoadBalancer().getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_SMALL, model.getLoadBalancer().getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS, model.getLoadBalancer().getAlgorithm());
        Assertions.assertEquals(ForwardingRuleEntryProtocol.UDP, model.getLoadBalancer().getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(305599752, model.getLoadBalancer().getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(ForwardingRuleTargetProtocol.HTTPS, model.getLoadBalancer().getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(2033817605, model.getLoadBalancer().getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("mduvtvodqxxp", model.getLoadBalancer().getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(false, model.getLoadBalancer().getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.HTTP, model.getLoadBalancer().getHealthCheck().getProtocol());
        Assertions.assertEquals(799929731, model.getLoadBalancer().getHealthCheck().getPort());
        Assertions.assertEquals("lmcvrjaznotdofq", model.getLoadBalancer().getHealthCheck().getPath());
        Assertions.assertEquals(484759838, model.getLoadBalancer().getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(620120625, model.getLoadBalancer().getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(2077416906, model.getLoadBalancer().getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1779009385, model.getLoadBalancer().getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.COOKIES, model.getLoadBalancer().getStickySessions().getType());
        Assertions.assertEquals("bbmitaftaz", model.getLoadBalancer().getStickySessions().getCookieName());
        Assertions.assertEquals(953956672, model.getLoadBalancer().getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(true, model.getLoadBalancer().isRedirectHttpToHttps());
        Assertions.assertEquals(true, model.getLoadBalancer().isEnableProxyProtocol());
        Assertions.assertEquals(false, model.getLoadBalancer().isEnableBackendKeepalive());
        Assertions.assertEquals(false, model.getLoadBalancer().isDisableLetsEncryptDnsRecords());
        Assertions.assertEquals("phgliupqscoobk", model.getLoadBalancer().getTag());
    }

    @Test
    public void testSerialize() {
        ComponentsW0Qp6KResponsesExistingLoadBalancerContentApplicationJsonSchema model = new ComponentsW0Qp6KResponsesExistingLoadBalancerContentApplicationJsonSchema().setLoadBalancer(new LoadBalancer().setName("axsqcomji").setSizeUnit(676319251).setSize(LoadBalancerBaseSize.LB_SMALL).setAlgorithm(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS).setForwardingRules(Arrays.asList(new ForwardingRule().setEntryProtocol(ForwardingRuleEntryProtocol.UDP).setEntryPort(305599752).setTargetProtocol(ForwardingRuleTargetProtocol.HTTPS).setTargetPort(2033817605).setCertificateId("mduvtvodqxxp").setTlsPassthrough(false))).setHealthCheck(new HealthCheck().setProtocol(HealthCheckProtocol.HTTP).setPort(799929731).setPath("lmcvrjaznotdofq").setCheckIntervalSeconds(484759838).setResponseTimeoutSeconds(620120625).setUnhealthyThreshold(2077416906).setHealthyThreshold(1779009385)).setStickySessions(new StickySessions().setType(StickySessionsType.COOKIES).setCookieName("bbmitaftaz").setCookieTtlSeconds(953956672)).setRedirectHttpToHttps(true).setEnableProxyProtocol(true).setEnableBackendKeepalive(false).setDisableLetsEncryptDnsRecords(false).setTag("phgliupqscoobk"));
        model = BinaryData.fromObject(model).toObject(ComponentsW0Qp6KResponsesExistingLoadBalancerContentApplicationJsonSchema.class);
        Assertions.assertEquals("axsqcomji", model.getLoadBalancer().getName());
        Assertions.assertEquals(676319251, model.getLoadBalancer().getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_SMALL, model.getLoadBalancer().getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS, model.getLoadBalancer().getAlgorithm());
        Assertions.assertEquals(ForwardingRuleEntryProtocol.UDP, model.getLoadBalancer().getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(305599752, model.getLoadBalancer().getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(ForwardingRuleTargetProtocol.HTTPS, model.getLoadBalancer().getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(2033817605, model.getLoadBalancer().getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("mduvtvodqxxp", model.getLoadBalancer().getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(false, model.getLoadBalancer().getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.HTTP, model.getLoadBalancer().getHealthCheck().getProtocol());
        Assertions.assertEquals(799929731, model.getLoadBalancer().getHealthCheck().getPort());
        Assertions.assertEquals("lmcvrjaznotdofq", model.getLoadBalancer().getHealthCheck().getPath());
        Assertions.assertEquals(484759838, model.getLoadBalancer().getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(620120625, model.getLoadBalancer().getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(2077416906, model.getLoadBalancer().getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1779009385, model.getLoadBalancer().getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.COOKIES, model.getLoadBalancer().getStickySessions().getType());
        Assertions.assertEquals("bbmitaftaz", model.getLoadBalancer().getStickySessions().getCookieName());
        Assertions.assertEquals(953956672, model.getLoadBalancer().getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(true, model.getLoadBalancer().isRedirectHttpToHttps());
        Assertions.assertEquals(true, model.getLoadBalancer().isEnableProxyProtocol());
        Assertions.assertEquals(false, model.getLoadBalancer().isEnableBackendKeepalive());
        Assertions.assertEquals(false, model.getLoadBalancer().isDisableLetsEncryptDnsRecords());
        Assertions.assertEquals("phgliupqscoobk", model.getLoadBalancer().getTag());
    }
}
