package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AssignDropletsByTag;
import com.digitalocean.api.models.ForwardingRule;
import com.digitalocean.api.models.ForwardingRuleEntryProtocol;
import com.digitalocean.api.models.ForwardingRuleTargetProtocol;
import com.digitalocean.api.models.HealthCheck;
import com.digitalocean.api.models.HealthCheckProtocol;
import com.digitalocean.api.models.LoadBalancerBaseAlgorithm;
import com.digitalocean.api.models.LoadBalancerBaseSize;
import com.digitalocean.api.models.RegionSlug;
import com.digitalocean.api.models.StickySessions;
import com.digitalocean.api.models.StickySessionsType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AssignDropletsByTagTests {
    @Test
    public void testDeserialize() {
        AssignDropletsByTag model =
                BinaryData.fromString(
                                "{\"region\":\"nyc2\",\"name\":\"qj\",\"ip\":\"wc\",\"size_unit\":352717547,\"size\":\"lb-medium\",\"algorithm\":\"round_robin\",\"status\":\"new\",\"created_at\":\"2021-08-29T17:51:23Z\",\"forwarding_rules\":[{\"entry_protocol\":\"udp\",\"entry_port\":2118535051,\"target_protocol\":\"https\",\"target_port\":180591536,\"certificate_id\":\"senerr\",\"tls_passthrough\":true},{\"entry_protocol\":\"https\",\"entry_port\":1361345675,\"target_protocol\":\"http2\",\"target_port\":1316425856,\"certificate_id\":\"psjnpck\",\"tls_passthrough\":true},{\"entry_protocol\":\"tcp\",\"entry_port\":1433921158,\"target_protocol\":\"https\",\"target_port\":660826018,\"certificate_id\":\"nbdawsaoplvvmnbk\",\"tls_passthrough\":true}],\"health_check\":{\"protocol\":\"http\",\"port\":1183916531,\"path\":\"dwokqx\",\"check_interval_seconds\":1057888225,\"response_timeout_seconds\":443944483,\"unhealthy_threshold\":1960915680,\"healthy_threshold\":1563414212},\"sticky_sessions\":{\"type\":\"none\",\"cookie_name\":\"cgrd\",\"cookie_ttl_seconds\":2058896611},\"redirect_http_to_https\":true,\"enable_proxy_protocol\":true,\"enable_backend_keepalive\":false,\"disable_lets_encrypt_dns_records\":false,\"tag\":\"zflb\"}")
                        .toObject(AssignDropletsByTag.class);
        Assertions.assertEquals("zflb", model.getTag());
        Assertions.assertEquals(RegionSlug.NYC2, model.getRegion());
        Assertions.assertEquals("qj", model.getName());
        Assertions.assertEquals(352717547, model.getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_MEDIUM, model.getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.ROUND_ROBIN, model.getAlgorithm());
        Assertions.assertEquals(ForwardingRuleEntryProtocol.UDP, model.getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(2118535051, model.getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(
                ForwardingRuleTargetProtocol.HTTPS, model.getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(180591536, model.getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("senerr", model.getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(true, model.getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.HTTP, model.getHealthCheck().getProtocol());
        Assertions.assertEquals(1183916531, model.getHealthCheck().getPort());
        Assertions.assertEquals("dwokqx", model.getHealthCheck().getPath());
        Assertions.assertEquals(1057888225, model.getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(443944483, model.getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(1960915680, model.getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1563414212, model.getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.NONE, model.getStickySessions().getType());
        Assertions.assertEquals("cgrd", model.getStickySessions().getCookieName());
        Assertions.assertEquals(2058896611, model.getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(true, model.isRedirectHttpToHttps());
        Assertions.assertEquals(true, model.isEnableProxyProtocol());
        Assertions.assertEquals(false, model.isEnableBackendKeepalive());
        Assertions.assertEquals(false, model.isDisableLetsEncryptDnsRecords());
    }

    @Test
    public void testSerialize() {
        AssignDropletsByTag model =
                new AssignDropletsByTag()
                        .setTag("zflb")
                        .setRegion(RegionSlug.NYC2)
                        .setName("qj")
                        .setSizeUnit(352717547)
                        .setSize(LoadBalancerBaseSize.LB_MEDIUM)
                        .setAlgorithm(LoadBalancerBaseAlgorithm.ROUND_ROBIN)
                        .setForwardingRules(
                                Arrays.asList(
                                        new ForwardingRule()
                                                .setEntryProtocol(ForwardingRuleEntryProtocol.UDP)
                                                .setEntryPort(2118535051)
                                                .setTargetProtocol(ForwardingRuleTargetProtocol.HTTPS)
                                                .setTargetPort(180591536)
                                                .setCertificateId("senerr")
                                                .setTlsPassthrough(true),
                                        new ForwardingRule()
                                                .setEntryProtocol(ForwardingRuleEntryProtocol.HTTPS)
                                                .setEntryPort(1361345675)
                                                .setTargetProtocol(ForwardingRuleTargetProtocol.HTTP2)
                                                .setTargetPort(1316425856)
                                                .setCertificateId("psjnpck")
                                                .setTlsPassthrough(true),
                                        new ForwardingRule()
                                                .setEntryProtocol(ForwardingRuleEntryProtocol.TCP)
                                                .setEntryPort(1433921158)
                                                .setTargetProtocol(ForwardingRuleTargetProtocol.HTTPS)
                                                .setTargetPort(660826018)
                                                .setCertificateId("nbdawsaoplvvmnbk")
                                                .setTlsPassthrough(true)))
                        .setHealthCheck(
                                new HealthCheck()
                                        .setProtocol(HealthCheckProtocol.HTTP)
                                        .setPort(1183916531)
                                        .setPath("dwokqx")
                                        .setCheckIntervalSeconds(1057888225)
                                        .setResponseTimeoutSeconds(443944483)
                                        .setUnhealthyThreshold(1960915680)
                                        .setHealthyThreshold(1563414212))
                        .setStickySessions(
                                new StickySessions()
                                        .setType(StickySessionsType.NONE)
                                        .setCookieName("cgrd")
                                        .setCookieTtlSeconds(2058896611))
                        .setRedirectHttpToHttps(true)
                        .setEnableProxyProtocol(true)
                        .setEnableBackendKeepalive(false)
                        .setDisableLetsEncryptDnsRecords(false);
        model = BinaryData.fromObject(model).toObject(AssignDropletsByTag.class);
        Assertions.assertEquals("zflb", model.getTag());
        Assertions.assertEquals(RegionSlug.NYC2, model.getRegion());
        Assertions.assertEquals("qj", model.getName());
        Assertions.assertEquals(352717547, model.getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_MEDIUM, model.getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.ROUND_ROBIN, model.getAlgorithm());
        Assertions.assertEquals(ForwardingRuleEntryProtocol.UDP, model.getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(2118535051, model.getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(
                ForwardingRuleTargetProtocol.HTTPS, model.getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(180591536, model.getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("senerr", model.getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(true, model.getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.HTTP, model.getHealthCheck().getProtocol());
        Assertions.assertEquals(1183916531, model.getHealthCheck().getPort());
        Assertions.assertEquals("dwokqx", model.getHealthCheck().getPath());
        Assertions.assertEquals(1057888225, model.getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(443944483, model.getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(1960915680, model.getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1563414212, model.getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.NONE, model.getStickySessions().getType());
        Assertions.assertEquals("cgrd", model.getStickySessions().getCookieName());
        Assertions.assertEquals(2058896611, model.getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(true, model.isRedirectHttpToHttps());
        Assertions.assertEquals(true, model.isEnableProxyProtocol());
        Assertions.assertEquals(false, model.isEnableBackendKeepalive());
        Assertions.assertEquals(false, model.isDisableLetsEncryptDnsRecords());
    }
}
