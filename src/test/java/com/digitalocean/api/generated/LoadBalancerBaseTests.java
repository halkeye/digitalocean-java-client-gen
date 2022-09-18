package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ForwardingRule;
import com.digitalocean.api.models.ForwardingRuleEntryProtocol;
import com.digitalocean.api.models.ForwardingRuleTargetProtocol;
import com.digitalocean.api.models.HealthCheck;
import com.digitalocean.api.models.HealthCheckProtocol;
import com.digitalocean.api.models.LoadBalancerBase;
import com.digitalocean.api.models.LoadBalancerBaseAlgorithm;
import com.digitalocean.api.models.LoadBalancerBaseSize;
import com.digitalocean.api.models.LoadBalancerBaseStatus;
import com.digitalocean.api.models.StickySessions;
import com.digitalocean.api.models.StickySessionsType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LoadBalancerBaseTests {
    @Test
    public void testDeserialize() {
        LoadBalancerBase model = BinaryData.fromString("{\"name\":\"avqcwy\",\"ip\":\"qzkmqc\",\"size_unit\":546422104,\"size\":\"lb-large\",\"algorithm\":\"least_connections\",\"status\":\"active\",\"created_at\":\"2021-09-25T23:36:06Z\",\"forwarding_rules\":[{\"entry_protocol\":\"http\",\"entry_port\":1764710299,\"target_protocol\":\"udp\",\"target_port\":654732708,\"certificate_id\":\"w\",\"tls_passthrough\":true},{\"entry_protocol\":\"http\",\"entry_port\":206215269,\"target_protocol\":\"udp\",\"target_port\":1572254159,\"certificate_id\":\"efejsewrznequqyn\",\"tls_passthrough\":true},{\"entry_protocol\":\"udp\",\"entry_port\":1503691224,\"target_protocol\":\"http\",\"target_port\":1353297778,\"certificate_id\":\"ks\",\"tls_passthrough\":false},{\"entry_protocol\":\"tcp\",\"entry_port\":1935368193,\"target_protocol\":\"udp\",\"target_port\":1269282450,\"certificate_id\":\"jhgcydijnmcvjb\",\"tls_passthrough\":true}],\"health_check\":{\"protocol\":\"https\",\"port\":967800164,\"path\":\"ixtdlxw\",\"check_interval_seconds\":1670329718,\"response_timeout_seconds\":1105245942,\"unhealthy_threshold\":505038525,\"healthy_threshold\":136642434},\"sticky_sessions\":{\"type\":\"cookies\",\"cookie_name\":\"rwrgorogeuvm\",\"cookie_ttl_seconds\":1658204091},\"redirect_http_to_https\":false,\"enable_proxy_protocol\":false,\"enable_backend_keepalive\":true,\"disable_lets_encrypt_dns_records\":false}").toObject(LoadBalancerBase.class);
        Assertions.assertEquals("avqcwy", model.getName());
        Assertions.assertEquals(546422104, model.getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_LARGE, model.getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS, model.getAlgorithm());
        Assertions.assertEquals(ForwardingRuleEntryProtocol.HTTP, model.getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(1764710299, model.getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(ForwardingRuleTargetProtocol.UDP, model.getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(654732708, model.getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("w", model.getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(true, model.getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.HTTPS, model.getHealthCheck().getProtocol());
        Assertions.assertEquals(967800164, model.getHealthCheck().getPort());
        Assertions.assertEquals("ixtdlxw", model.getHealthCheck().getPath());
        Assertions.assertEquals(1670329718, model.getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(1105245942, model.getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(505038525, model.getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(136642434, model.getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.COOKIES, model.getStickySessions().getType());
        Assertions.assertEquals("rwrgorogeuvm", model.getStickySessions().getCookieName());
        Assertions.assertEquals(1658204091, model.getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(false, model.isRedirectHttpToHttps());
        Assertions.assertEquals(false, model.isEnableProxyProtocol());
        Assertions.assertEquals(true, model.isEnableBackendKeepalive());
        Assertions.assertEquals(false, model.isDisableLetsEncryptDnsRecords());
    }

    @Test
    public void testSerialize() {
        LoadBalancerBase model = new LoadBalancerBase().setName("avqcwy").setSizeUnit(546422104).setSize(LoadBalancerBaseSize.LB_LARGE).setAlgorithm(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS).setForwardingRules(Arrays.asList(new ForwardingRule().setEntryProtocol(ForwardingRuleEntryProtocol.HTTP).setEntryPort(1764710299).setTargetProtocol(ForwardingRuleTargetProtocol.UDP).setTargetPort(654732708).setCertificateId("w").setTlsPassthrough(true), new ForwardingRule().setEntryProtocol(ForwardingRuleEntryProtocol.HTTP).setEntryPort(206215269).setTargetProtocol(ForwardingRuleTargetProtocol.UDP).setTargetPort(1572254159).setCertificateId("efejsewrznequqyn").setTlsPassthrough(true), new ForwardingRule().setEntryProtocol(ForwardingRuleEntryProtocol.UDP).setEntryPort(1503691224).setTargetProtocol(ForwardingRuleTargetProtocol.HTTP).setTargetPort(1353297778).setCertificateId("ks").setTlsPassthrough(false), new ForwardingRule().setEntryProtocol(ForwardingRuleEntryProtocol.TCP).setEntryPort(1935368193).setTargetProtocol(ForwardingRuleTargetProtocol.UDP).setTargetPort(1269282450).setCertificateId("jhgcydijnmcvjb").setTlsPassthrough(true))).setHealthCheck(new HealthCheck().setProtocol(HealthCheckProtocol.HTTPS).setPort(967800164).setPath("ixtdlxw").setCheckIntervalSeconds(1670329718).setResponseTimeoutSeconds(1105245942).setUnhealthyThreshold(505038525).setHealthyThreshold(136642434)).setStickySessions(new StickySessions().setType(StickySessionsType.COOKIES).setCookieName("rwrgorogeuvm").setCookieTtlSeconds(1658204091)).setRedirectHttpToHttps(false).setEnableProxyProtocol(false).setEnableBackendKeepalive(true).setDisableLetsEncryptDnsRecords(false);
        model = BinaryData.fromObject(model).toObject(LoadBalancerBase.class);
        Assertions.assertEquals("avqcwy", model.getName());
        Assertions.assertEquals(546422104, model.getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_LARGE, model.getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS, model.getAlgorithm());
        Assertions.assertEquals(ForwardingRuleEntryProtocol.HTTP, model.getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(1764710299, model.getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(ForwardingRuleTargetProtocol.UDP, model.getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(654732708, model.getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("w", model.getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(true, model.getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.HTTPS, model.getHealthCheck().getProtocol());
        Assertions.assertEquals(967800164, model.getHealthCheck().getPort());
        Assertions.assertEquals("ixtdlxw", model.getHealthCheck().getPath());
        Assertions.assertEquals(1670329718, model.getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(1105245942, model.getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(505038525, model.getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(136642434, model.getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.COOKIES, model.getStickySessions().getType());
        Assertions.assertEquals("rwrgorogeuvm", model.getStickySessions().getCookieName());
        Assertions.assertEquals(1658204091, model.getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(false, model.isRedirectHttpToHttps());
        Assertions.assertEquals(false, model.isEnableProxyProtocol());
        Assertions.assertEquals(true, model.isEnableBackendKeepalive());
        Assertions.assertEquals(false, model.isDisableLetsEncryptDnsRecords());
    }
}
