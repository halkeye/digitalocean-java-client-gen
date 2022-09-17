package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AssignDropletsByID;
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

public final class AssignDropletsByIDTests {
    @Test
    public void testDeserialize() {
        AssignDropletsByID model =
                BinaryData.fromString(
                                "{\"region\":\"ams3\",\"name\":\"bxovuqo\",\"ip\":\"rkblndyclw\",\"size_unit\":1880027005,\"size\":\"lb-medium\",\"algorithm\":\"least_connections\",\"status\":\"new\",\"created_at\":\"2021-08-31T13:43:40Z\",\"forwarding_rules\":[{\"entry_protocol\":\"udp\",\"entry_port\":1312894369,\"target_protocol\":\"tcp\",\"target_port\":450292275,\"certificate_id\":\"btbw\",\"tls_passthrough\":false},{\"entry_protocol\":\"http2\",\"entry_port\":947626527,\"target_protocol\":\"https\",\"target_port\":520409326,\"certificate_id\":\"sjdle\",\"tls_passthrough\":true}],\"health_check\":{\"protocol\":\"tcp\",\"port\":373958050,\"path\":\"ubsfxip\",\"check_interval_seconds\":1753476541,\"response_timeout_seconds\":1510631363,\"unhealthy_threshold\":2138732877,\"healthy_threshold\":1929084172},\"sticky_sessions\":{\"type\":\"none\",\"cookie_name\":\"upfazusj\",\"cookie_ttl_seconds\":1748080211},\"redirect_http_to_https\":false,\"enable_proxy_protocol\":false,\"enable_backend_keepalive\":false,\"disable_lets_encrypt_dns_records\":false,\"droplet_ids\":[1166306369,388884988]}")
                        .toObject(AssignDropletsByID.class);
        Assertions.assertEquals(1166306369, model.getDropletIds().get(0));
        Assertions.assertEquals(RegionSlug.AMS3, model.getRegion());
        Assertions.assertEquals("bxovuqo", model.getName());
        Assertions.assertEquals(1880027005, model.getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_MEDIUM, model.getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS, model.getAlgorithm());
        Assertions.assertEquals(ForwardingRuleEntryProtocol.UDP, model.getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(1312894369, model.getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(
                ForwardingRuleTargetProtocol.TCP, model.getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(450292275, model.getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("btbw", model.getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(false, model.getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.TCP, model.getHealthCheck().getProtocol());
        Assertions.assertEquals(373958050, model.getHealthCheck().getPort());
        Assertions.assertEquals("ubsfxip", model.getHealthCheck().getPath());
        Assertions.assertEquals(1753476541, model.getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(1510631363, model.getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(2138732877, model.getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1929084172, model.getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.NONE, model.getStickySessions().getType());
        Assertions.assertEquals("upfazusj", model.getStickySessions().getCookieName());
        Assertions.assertEquals(1748080211, model.getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(false, model.isRedirectHttpToHttps());
        Assertions.assertEquals(false, model.isEnableProxyProtocol());
        Assertions.assertEquals(false, model.isEnableBackendKeepalive());
        Assertions.assertEquals(false, model.isDisableLetsEncryptDnsRecords());
    }

    @Test
    public void testSerialize() {
        AssignDropletsByID model =
                new AssignDropletsByID()
                        .setDropletIds(Arrays.asList(1166306369, 388884988))
                        .setRegion(RegionSlug.AMS3)
                        .setName("bxovuqo")
                        .setSizeUnit(1880027005)
                        .setSize(LoadBalancerBaseSize.LB_MEDIUM)
                        .setAlgorithm(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS)
                        .setForwardingRules(
                                Arrays.asList(
                                        new ForwardingRule()
                                                .setEntryProtocol(ForwardingRuleEntryProtocol.UDP)
                                                .setEntryPort(1312894369)
                                                .setTargetProtocol(ForwardingRuleTargetProtocol.TCP)
                                                .setTargetPort(450292275)
                                                .setCertificateId("btbw")
                                                .setTlsPassthrough(false),
                                        new ForwardingRule()
                                                .setEntryProtocol(ForwardingRuleEntryProtocol.HTTP2)
                                                .setEntryPort(947626527)
                                                .setTargetProtocol(ForwardingRuleTargetProtocol.HTTPS)
                                                .setTargetPort(520409326)
                                                .setCertificateId("sjdle")
                                                .setTlsPassthrough(true)))
                        .setHealthCheck(
                                new HealthCheck()
                                        .setProtocol(HealthCheckProtocol.TCP)
                                        .setPort(373958050)
                                        .setPath("ubsfxip")
                                        .setCheckIntervalSeconds(1753476541)
                                        .setResponseTimeoutSeconds(1510631363)
                                        .setUnhealthyThreshold(2138732877)
                                        .setHealthyThreshold(1929084172))
                        .setStickySessions(
                                new StickySessions()
                                        .setType(StickySessionsType.NONE)
                                        .setCookieName("upfazusj")
                                        .setCookieTtlSeconds(1748080211))
                        .setRedirectHttpToHttps(false)
                        .setEnableProxyProtocol(false)
                        .setEnableBackendKeepalive(false)
                        .setDisableLetsEncryptDnsRecords(false);
        model = BinaryData.fromObject(model).toObject(AssignDropletsByID.class);
        Assertions.assertEquals(1166306369, model.getDropletIds().get(0));
        Assertions.assertEquals(RegionSlug.AMS3, model.getRegion());
        Assertions.assertEquals("bxovuqo", model.getName());
        Assertions.assertEquals(1880027005, model.getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_MEDIUM, model.getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS, model.getAlgorithm());
        Assertions.assertEquals(ForwardingRuleEntryProtocol.UDP, model.getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(1312894369, model.getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(
                ForwardingRuleTargetProtocol.TCP, model.getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(450292275, model.getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals("btbw", model.getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(false, model.getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.TCP, model.getHealthCheck().getProtocol());
        Assertions.assertEquals(373958050, model.getHealthCheck().getPort());
        Assertions.assertEquals("ubsfxip", model.getHealthCheck().getPath());
        Assertions.assertEquals(1753476541, model.getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(1510631363, model.getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(2138732877, model.getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1929084172, model.getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.NONE, model.getStickySessions().getType());
        Assertions.assertEquals("upfazusj", model.getStickySessions().getCookieName());
        Assertions.assertEquals(1748080211, model.getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(false, model.isRedirectHttpToHttps());
        Assertions.assertEquals(false, model.isEnableProxyProtocol());
        Assertions.assertEquals(false, model.isEnableBackendKeepalive());
        Assertions.assertEquals(false, model.isDisableLetsEncryptDnsRecords());
    }
}
