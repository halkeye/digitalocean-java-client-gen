package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
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
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LoadBalancerTests {
    @Test
    public void testDeserialize() {
        LoadBalancer model =
                BinaryData.fromString(
                                "{\"tag\":\"ghpakbqyhlsorn\",\"name\":\"eq\",\"ip\":\"kncjmybn\",\"size_unit\":1495260868,\"size\":\"lb-small\",\"algorithm\":\"least_connections\",\"status\":\"active\",\"created_at\":\"2021-11-06T01:39:53Z\",\"forwarding_rules\":[{\"entry_protocol\":\"http\",\"entry_port\":1410061846,\"target_protocol\":\"http\",\"target_port\":1842044853,\"certificate_id\":\"mbwppxirxbkitzmn\",\"tls_passthrough\":true}],\"health_check\":{\"protocol\":\"http\",\"port\":1282222748,\"path\":\"tjlxsgcemegdzdvy\",\"check_interval_seconds\":93206066,\"response_timeout_seconds\":720382134,\"unhealthy_threshold\":1594038170,\"healthy_threshold\":1427059061},\"sticky_sessions\":{\"type\":\"none\",\"cookie_name\":\"ifnivlut\",\"cookie_ttl_seconds\":932860252},\"redirect_http_to_https\":false,\"enable_proxy_protocol\":true,\"enable_backend_keepalive\":true,\"disable_lets_encrypt_dns_records\":false}")
                        .toObject(LoadBalancer.class);
        Assertions.assertEquals("eq", model.getName());
        Assertions.assertEquals(1495260868, model.getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_SMALL, model.getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS, model.getAlgorithm());
        Assertions.assertEquals(ForwardingRuleEntryProtocol.HTTP, model.getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(1410061846, model.getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(
                ForwardingRuleTargetProtocol.HTTP, model.getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(1842044853, model.getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("mbwppxirxbkitzmn", model.getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(true, model.getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.HTTP, model.getHealthCheck().getProtocol());
        Assertions.assertEquals(1282222748, model.getHealthCheck().getPort());
        Assertions.assertEquals("tjlxsgcemegdzdvy", model.getHealthCheck().getPath());
        Assertions.assertEquals(93206066, model.getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(720382134, model.getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(1594038170, model.getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1427059061, model.getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.NONE, model.getStickySessions().getType());
        Assertions.assertEquals("ifnivlut", model.getStickySessions().getCookieName());
        Assertions.assertEquals(932860252, model.getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(false, model.isRedirectHttpToHttps());
        Assertions.assertEquals(true, model.isEnableProxyProtocol());
        Assertions.assertEquals(true, model.isEnableBackendKeepalive());
        Assertions.assertEquals(false, model.isDisableLetsEncryptDnsRecords());
        Assertions.assertEquals("ghpakbqyhlsorn", model.getTag());
    }

    @Test
    public void testSerialize() {
        LoadBalancer model =
                new LoadBalancer()
                        .setName("eq")
                        .setSizeUnit(1495260868)
                        .setSize(LoadBalancerBaseSize.LB_SMALL)
                        .setAlgorithm(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS)
                        .setForwardingRules(
                                Arrays.asList(
                                        new ForwardingRule()
                                                .setEntryProtocol(ForwardingRuleEntryProtocol.HTTP)
                                                .setEntryPort(1410061846)
                                                .setTargetProtocol(ForwardingRuleTargetProtocol.HTTP)
                                                .setTargetPort(1842044853)
                                                .setCertificateId("mbwppxirxbkitzmn")
                                                .setTlsPassthrough(true)))
                        .setHealthCheck(
                                new HealthCheck()
                                        .setProtocol(HealthCheckProtocol.HTTP)
                                        .setPort(1282222748)
                                        .setPath("tjlxsgcemegdzdvy")
                                        .setCheckIntervalSeconds(93206066)
                                        .setResponseTimeoutSeconds(720382134)
                                        .setUnhealthyThreshold(1594038170)
                                        .setHealthyThreshold(1427059061))
                        .setStickySessions(
                                new StickySessions()
                                        .setType(StickySessionsType.NONE)
                                        .setCookieName("ifnivlut")
                                        .setCookieTtlSeconds(932860252))
                        .setRedirectHttpToHttps(false)
                        .setEnableProxyProtocol(true)
                        .setEnableBackendKeepalive(true)
                        .setDisableLetsEncryptDnsRecords(false)
                        .setTag("ghpakbqyhlsorn");
        model = BinaryData.fromObject(model).toObject(LoadBalancer.class);
        Assertions.assertEquals("eq", model.getName());
        Assertions.assertEquals(1495260868, model.getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_SMALL, model.getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS, model.getAlgorithm());
        Assertions.assertEquals(ForwardingRuleEntryProtocol.HTTP, model.getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(1410061846, model.getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(
                ForwardingRuleTargetProtocol.HTTP, model.getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(1842044853, model.getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("mbwppxirxbkitzmn", model.getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(true, model.getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.HTTP, model.getHealthCheck().getProtocol());
        Assertions.assertEquals(1282222748, model.getHealthCheck().getPort());
        Assertions.assertEquals("tjlxsgcemegdzdvy", model.getHealthCheck().getPath());
        Assertions.assertEquals(93206066, model.getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(720382134, model.getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(1594038170, model.getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1427059061, model.getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.NONE, model.getStickySessions().getType());
        Assertions.assertEquals("ifnivlut", model.getStickySessions().getCookieName());
        Assertions.assertEquals(932860252, model.getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(false, model.isRedirectHttpToHttps());
        Assertions.assertEquals(true, model.isEnableProxyProtocol());
        Assertions.assertEquals(true, model.isEnableBackendKeepalive());
        Assertions.assertEquals(false, model.isDisableLetsEncryptDnsRecords());
        Assertions.assertEquals("ghpakbqyhlsorn", model.getTag());
    }
}
