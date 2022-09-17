package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsNrd4ZlResponsesUpdatedLoadBalancerContentApplicationJsonSchema;
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

public final class ComponentsNrd4ZlResponsesUpdatedLoadBalancerContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsNrd4ZlResponsesUpdatedLoadBalancerContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"load_balancer\":{\"tag\":\"mxow\",\"name\":\"joyutehlkarvtipq\",\"ip\":\"sxiknsgofunsw\",\"size_unit\":784728990,\"size\":\"lb-medium\",\"algorithm\":\"round_robin\",\"status\":\"new\",\"created_at\":\"2021-09-21T21:17:39Z\",\"forwarding_rules\":[{\"entry_protocol\":\"udp\",\"entry_port\":563156651,\"target_protocol\":\"https\",\"target_port\":502583947,\"certificate_id\":\"dfkkedeetxtpwcv\",\"tls_passthrough\":true}],\"health_check\":{\"protocol\":\"tcp\",\"port\":1148527851,\"path\":\"ij\",\"check_interval_seconds\":2089228497,\"response_timeout_seconds\":306724333,\"unhealthy_threshold\":419396017,\"healthy_threshold\":233382899},\"sticky_sessions\":{\"type\":\"cookies\",\"cookie_name\":\"b\",\"cookie_ttl_seconds\":1597977030},\"redirect_http_to_https\":true,\"enable_proxy_protocol\":false,\"enable_backend_keepalive\":true,\"disable_lets_encrypt_dns_records\":true}}")
                        .toObject(ComponentsNrd4ZlResponsesUpdatedLoadBalancerContentApplicationJsonSchema.class);
        Assertions.assertEquals("joyutehlkarvtipq", model.getLoadBalancer().getName());
        Assertions.assertEquals(784728990, model.getLoadBalancer().getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_MEDIUM, model.getLoadBalancer().getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.ROUND_ROBIN, model.getLoadBalancer().getAlgorithm());
        Assertions.assertEquals(
                ForwardingRuleEntryProtocol.UDP,
                model.getLoadBalancer().getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(563156651, model.getLoadBalancer().getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(
                ForwardingRuleTargetProtocol.HTTPS,
                model.getLoadBalancer().getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(502583947, model.getLoadBalancer().getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals(
                "dfkkedeetxtpwcv", model.getLoadBalancer().getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(true, model.getLoadBalancer().getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.TCP, model.getLoadBalancer().getHealthCheck().getProtocol());
        Assertions.assertEquals(1148527851, model.getLoadBalancer().getHealthCheck().getPort());
        Assertions.assertEquals("ij", model.getLoadBalancer().getHealthCheck().getPath());
        Assertions.assertEquals(2089228497, model.getLoadBalancer().getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(306724333, model.getLoadBalancer().getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(419396017, model.getLoadBalancer().getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(233382899, model.getLoadBalancer().getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.COOKIES, model.getLoadBalancer().getStickySessions().getType());
        Assertions.assertEquals("b", model.getLoadBalancer().getStickySessions().getCookieName());
        Assertions.assertEquals(1597977030, model.getLoadBalancer().getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(true, model.getLoadBalancer().isRedirectHttpToHttps());
        Assertions.assertEquals(false, model.getLoadBalancer().isEnableProxyProtocol());
        Assertions.assertEquals(true, model.getLoadBalancer().isEnableBackendKeepalive());
        Assertions.assertEquals(true, model.getLoadBalancer().isDisableLetsEncryptDnsRecords());
        Assertions.assertEquals("mxow", model.getLoadBalancer().getTag());
    }

    @Test
    public void testSerialize() {
        ComponentsNrd4ZlResponsesUpdatedLoadBalancerContentApplicationJsonSchema model =
                new ComponentsNrd4ZlResponsesUpdatedLoadBalancerContentApplicationJsonSchema()
                        .setLoadBalancer(
                                new LoadBalancer()
                                        .setName("joyutehlkarvtipq")
                                        .setSizeUnit(784728990)
                                        .setSize(LoadBalancerBaseSize.LB_MEDIUM)
                                        .setAlgorithm(LoadBalancerBaseAlgorithm.ROUND_ROBIN)
                                        .setForwardingRules(
                                                Arrays.asList(
                                                        new ForwardingRule()
                                                                .setEntryProtocol(ForwardingRuleEntryProtocol.UDP)
                                                                .setEntryPort(563156651)
                                                                .setTargetProtocol(ForwardingRuleTargetProtocol.HTTPS)
                                                                .setTargetPort(502583947)
                                                                .setCertificateId("dfkkedeetxtpwcv")
                                                                .setTlsPassthrough(true)))
                                        .setHealthCheck(
                                                new HealthCheck()
                                                        .setProtocol(HealthCheckProtocol.TCP)
                                                        .setPort(1148527851)
                                                        .setPath("ij")
                                                        .setCheckIntervalSeconds(2089228497)
                                                        .setResponseTimeoutSeconds(306724333)
                                                        .setUnhealthyThreshold(419396017)
                                                        .setHealthyThreshold(233382899))
                                        .setStickySessions(
                                                new StickySessions()
                                                        .setType(StickySessionsType.COOKIES)
                                                        .setCookieName("b")
                                                        .setCookieTtlSeconds(1597977030))
                                        .setRedirectHttpToHttps(true)
                                        .setEnableProxyProtocol(false)
                                        .setEnableBackendKeepalive(true)
                                        .setDisableLetsEncryptDnsRecords(true)
                                        .setTag("mxow"));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsNrd4ZlResponsesUpdatedLoadBalancerContentApplicationJsonSchema.class);
        Assertions.assertEquals("joyutehlkarvtipq", model.getLoadBalancer().getName());
        Assertions.assertEquals(784728990, model.getLoadBalancer().getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_MEDIUM, model.getLoadBalancer().getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.ROUND_ROBIN, model.getLoadBalancer().getAlgorithm());
        Assertions.assertEquals(
                ForwardingRuleEntryProtocol.UDP,
                model.getLoadBalancer().getForwardingRules().get(0).getEntryProtocol());
        Assertions.assertEquals(563156651, model.getLoadBalancer().getForwardingRules().get(0).getEntryPort());
        Assertions.assertEquals(
                ForwardingRuleTargetProtocol.HTTPS,
                model.getLoadBalancer().getForwardingRules().get(0).getTargetProtocol());
        Assertions.assertEquals(502583947, model.getLoadBalancer().getForwardingRules().get(0).getTargetPort());
        Assertions.assertEquals(
                "dfkkedeetxtpwcv", model.getLoadBalancer().getForwardingRules().get(0).getCertificateId());
        Assertions.assertEquals(true, model.getLoadBalancer().getForwardingRules().get(0).isTlsPassthrough());
        Assertions.assertEquals(HealthCheckProtocol.TCP, model.getLoadBalancer().getHealthCheck().getProtocol());
        Assertions.assertEquals(1148527851, model.getLoadBalancer().getHealthCheck().getPort());
        Assertions.assertEquals("ij", model.getLoadBalancer().getHealthCheck().getPath());
        Assertions.assertEquals(2089228497, model.getLoadBalancer().getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(306724333, model.getLoadBalancer().getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(419396017, model.getLoadBalancer().getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(233382899, model.getLoadBalancer().getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.COOKIES, model.getLoadBalancer().getStickySessions().getType());
        Assertions.assertEquals("b", model.getLoadBalancer().getStickySessions().getCookieName());
        Assertions.assertEquals(1597977030, model.getLoadBalancer().getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(true, model.getLoadBalancer().isRedirectHttpToHttps());
        Assertions.assertEquals(false, model.getLoadBalancer().isEnableProxyProtocol());
        Assertions.assertEquals(true, model.getLoadBalancer().isEnableBackendKeepalive());
        Assertions.assertEquals(true, model.getLoadBalancer().isDisableLetsEncryptDnsRecords());
        Assertions.assertEquals("mxow", model.getLoadBalancer().getTag());
    }
}
