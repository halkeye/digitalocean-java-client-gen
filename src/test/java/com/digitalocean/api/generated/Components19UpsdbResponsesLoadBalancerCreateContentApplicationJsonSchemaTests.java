package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components19UpsdbResponsesLoadBalancerCreateContentApplicationJsonSchema;
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

public final class Components19UpsdbResponsesLoadBalancerCreateContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components19UpsdbResponsesLoadBalancerCreateContentApplicationJsonSchema model = BinaryData.fromString("{\"load_balancer\":{\"tag\":\"tubcmu\",\"name\":\"btzvxxv\",\"ip\":\"cuufkrfn\",\"size_unit\":1567478413,\"size\":\"lb-medium\",\"algorithm\":\"least_connections\",\"status\":\"new\",\"created_at\":\"2021-04-29T12:15:52Z\",\"forwarding_rules\":[{\"entry_protocol\":\"tcp\",\"entry_port\":1617551815,\"target_protocol\":\"http2\",\"target_port\":809202056,\"certificate_id\":\"wwp\",\"tls_passthrough\":false},{\"entry_protocol\":\"udp\",\"entry_port\":1209656032,\"target_protocol\":\"https\",\"target_port\":271970570,\"certificate_id\":\"b\",\"tls_passthrough\":true}],\"health_check\":{\"protocol\":\"tcp\",\"port\":143583752,\"path\":\"zuae\",\"check_interval_seconds\":1864326135,\"response_timeout_seconds\":1800186951,\"unhealthy_threshold\":645713420,\"healthy_threshold\":1825942176},\"sticky_sessions\":{\"type\":\"cookies\",\"cookie_name\":\"vxzzmiemqyf\",\"cookie_ttl_seconds\":161477512},\"redirect_http_to_https\":false,\"enable_proxy_protocol\":false,\"enable_backend_keepalive\":true,\"disable_lets_encrypt_dns_records\":true}}").toObject(Components19UpsdbResponsesLoadBalancerCreateContentApplicationJsonSchema.class);
        Assertions.assertEquals("btzvxxv", model.getLoadBalancer().getName());
        Assertions.assertEquals(1567478413, model.getLoadBalancer().getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_MEDIUM, model.getLoadBalancer().getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS, model.getLoadBalancer().getAlgorithm());
        Assertions.assertEquals(ForwardingRuleEntryProtocol.TCP, model.getLoadBalancer().getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(1617551815, model.getLoadBalancer().getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(ForwardingRuleTargetProtocol.HTTP2, model.getLoadBalancer().getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(809202056, model.getLoadBalancer().getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("wwp", model.getLoadBalancer().getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(false, model.getLoadBalancer().getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.TCP, model.getLoadBalancer().getHealthCheck().getProtocol());
        Assertions.assertEquals(143583752, model.getLoadBalancer().getHealthCheck().getPort());
        Assertions.assertEquals("zuae", model.getLoadBalancer().getHealthCheck().getPath());
        Assertions.assertEquals(1864326135, model.getLoadBalancer().getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(1800186951, model.getLoadBalancer().getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(645713420, model.getLoadBalancer().getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1825942176, model.getLoadBalancer().getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.COOKIES, model.getLoadBalancer().getStickySessions().getType());
        Assertions.assertEquals("vxzzmiemqyf", model.getLoadBalancer().getStickySessions().getCookieName());
        Assertions.assertEquals(161477512, model.getLoadBalancer().getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(false, model.getLoadBalancer().isRedirectHttpToHttps());
        Assertions.assertEquals(false, model.getLoadBalancer().isEnableProxyProtocol());
        Assertions.assertEquals(true, model.getLoadBalancer().isEnableBackendKeepalive());
        Assertions.assertEquals(true, model.getLoadBalancer().isDisableLetsEncryptDnsRecords());
        Assertions.assertEquals("tubcmu", model.getLoadBalancer().getTag());
    }

    @Test
    public void testSerialize() {
        Components19UpsdbResponsesLoadBalancerCreateContentApplicationJsonSchema model = new Components19UpsdbResponsesLoadBalancerCreateContentApplicationJsonSchema().setLoadBalancer(new LoadBalancer().setName("btzvxxv").setSizeUnit(1567478413).setSize(LoadBalancerBaseSize.LB_MEDIUM).setAlgorithm(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS).setForwardingRules(Arrays.asList(new ForwardingRule().setEntryProtocol(ForwardingRuleEntryProtocol.TCP).setEntryPort(1617551815).setTargetProtocol(ForwardingRuleTargetProtocol.HTTP2).setTargetPort(809202056).setCertificateId("wwp").setTlsPassthrough(false), new ForwardingRule().setEntryProtocol(ForwardingRuleEntryProtocol.UDP).setEntryPort(1209656032).setTargetProtocol(ForwardingRuleTargetProtocol.HTTPS).setTargetPort(271970570).setCertificateId("b").setTlsPassthrough(true))).setHealthCheck(new HealthCheck().setProtocol(HealthCheckProtocol.TCP).setPort(143583752).setPath("zuae").setCheckIntervalSeconds(1864326135).setResponseTimeoutSeconds(1800186951).setUnhealthyThreshold(645713420).setHealthyThreshold(1825942176)).setStickySessions(new StickySessions().setType(StickySessionsType.COOKIES).setCookieName("vxzzmiemqyf").setCookieTtlSeconds(161477512)).setRedirectHttpToHttps(false).setEnableProxyProtocol(false).setEnableBackendKeepalive(true).setDisableLetsEncryptDnsRecords(true).setTag("tubcmu"));
        model = BinaryData.fromObject(model).toObject(Components19UpsdbResponsesLoadBalancerCreateContentApplicationJsonSchema.class);
        Assertions.assertEquals("btzvxxv", model.getLoadBalancer().getName());
        Assertions.assertEquals(1567478413, model.getLoadBalancer().getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_MEDIUM, model.getLoadBalancer().getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS, model.getLoadBalancer().getAlgorithm());
        Assertions.assertEquals(ForwardingRuleEntryProtocol.TCP, model.getLoadBalancer().getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(1617551815, model.getLoadBalancer().getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(ForwardingRuleTargetProtocol.HTTP2, model.getLoadBalancer().getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(809202056, model.getLoadBalancer().getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("wwp", model.getLoadBalancer().getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(false, model.getLoadBalancer().getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.TCP, model.getLoadBalancer().getHealthCheck().getProtocol());
        Assertions.assertEquals(143583752, model.getLoadBalancer().getHealthCheck().getPort());
        Assertions.assertEquals("zuae", model.getLoadBalancer().getHealthCheck().getPath());
        Assertions.assertEquals(1864326135, model.getLoadBalancer().getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(1800186951, model.getLoadBalancer().getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(645713420, model.getLoadBalancer().getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1825942176, model.getLoadBalancer().getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.COOKIES, model.getLoadBalancer().getStickySessions().getType());
        Assertions.assertEquals("vxzzmiemqyf", model.getLoadBalancer().getStickySessions().getCookieName());
        Assertions.assertEquals(161477512, model.getLoadBalancer().getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(false, model.getLoadBalancer().isRedirectHttpToHttps());
        Assertions.assertEquals(false, model.getLoadBalancer().isEnableProxyProtocol());
        Assertions.assertEquals(true, model.getLoadBalancer().isEnableBackendKeepalive());
        Assertions.assertEquals(true, model.getLoadBalancer().isDisableLetsEncryptDnsRecords());
        Assertions.assertEquals("tubcmu", model.getLoadBalancer().getTag());
    }
}
