package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsZl28R5ResponsesAllLoadBalancersContentApplicationJsonSchema;
import com.digitalocean.api.models.HealthCheck;
import com.digitalocean.api.models.HealthCheckProtocol;
import com.digitalocean.api.models.LoadBalancer;
import com.digitalocean.api.models.LoadBalancerBaseAlgorithm;
import com.digitalocean.api.models.LoadBalancerBaseSize;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.StickySessions;
import com.digitalocean.api.models.StickySessionsType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsZl28R5ResponsesAllLoadBalancersContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsZl28R5ResponsesAllLoadBalancersContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":1504015182},\"load_balancers\":[{\"tag\":\"qxtoiyygktsrjyxx\",\"name\":\"fzbkvec\",\"ip\":\"fxphsowbebsnbwut\",\"size_unit\":1167734194,\"size\":\"lb-medium\",\"algorithm\":\"round_robin\",\"status\":\"active\",\"created_at\":\"2021-08-04T02:13:04Z\",\"forwarding_rules\":[],\"health_check\":{\"protocol\":\"https\",\"port\":1474193251,\"path\":\"jajvkyxmmjczvo\",\"check_interval_seconds\":186095639,\"response_timeout_seconds\":1337388892,\"unhealthy_threshold\":999951623,\"healthy_threshold\":1626752894},\"sticky_sessions\":{\"type\":\"none\",\"cookie_name\":\"e\",\"cookie_ttl_seconds\":1826638704},\"redirect_http_to_https\":true,\"enable_proxy_protocol\":false,\"enable_backend_keepalive\":true,\"disable_lets_encrypt_dns_records\":true}]}")
                        .toObject(ComponentsZl28R5ResponsesAllLoadBalancersContentApplicationJsonSchema.class);
        Assertions.assertEquals("fzbkvec", model.getLoadBalancers().get(0).getName());
        Assertions.assertEquals(1167734194, model.getLoadBalancers().get(0).getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_MEDIUM, model.getLoadBalancers().get(0).getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.ROUND_ROBIN, model.getLoadBalancers().get(0).getAlgorithm());
        Assertions.assertEquals(
                HealthCheckProtocol.HTTPS, model.getLoadBalancers().get(0).getHealthCheck().getProtocol());
        Assertions.assertEquals(1474193251, model.getLoadBalancers().get(0).getHealthCheck().getPort());
        Assertions.assertEquals("jajvkyxmmjczvo", model.getLoadBalancers().get(0).getHealthCheck().getPath());
        Assertions.assertEquals(186095639, model.getLoadBalancers().get(0).getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(
                1337388892, model.getLoadBalancers().get(0).getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(999951623, model.getLoadBalancers().get(0).getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1626752894, model.getLoadBalancers().get(0).getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.NONE, model.getLoadBalancers().get(0).getStickySessions().getType());
        Assertions.assertEquals("e", model.getLoadBalancers().get(0).getStickySessions().getCookieName());
        Assertions.assertEquals(1826638704, model.getLoadBalancers().get(0).getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(true, model.getLoadBalancers().get(0).isRedirectHttpToHttps());
        Assertions.assertEquals(false, model.getLoadBalancers().get(0).isEnableProxyProtocol());
        Assertions.assertEquals(true, model.getLoadBalancers().get(0).isEnableBackendKeepalive());
        Assertions.assertEquals(true, model.getLoadBalancers().get(0).isDisableLetsEncryptDnsRecords());
        Assertions.assertEquals("qxtoiyygktsrjyxx", model.getLoadBalancers().get(0).getTag());
        Assertions.assertEquals(1504015182, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsZl28R5ResponsesAllLoadBalancersContentApplicationJsonSchema model =
                new ComponentsZl28R5ResponsesAllLoadBalancersContentApplicationJsonSchema()
                        .setLoadBalancers(
                                Arrays.asList(
                                        new LoadBalancer()
                                                .setName("fzbkvec")
                                                .setSizeUnit(1167734194)
                                                .setSize(LoadBalancerBaseSize.LB_MEDIUM)
                                                .setAlgorithm(LoadBalancerBaseAlgorithm.ROUND_ROBIN)
                                                .setForwardingRules(Arrays.asList())
                                                .setHealthCheck(
                                                        new HealthCheck()
                                                                .setProtocol(HealthCheckProtocol.HTTPS)
                                                                .setPort(1474193251)
                                                                .setPath("jajvkyxmmjczvo")
                                                                .setCheckIntervalSeconds(186095639)
                                                                .setResponseTimeoutSeconds(1337388892)
                                                                .setUnhealthyThreshold(999951623)
                                                                .setHealthyThreshold(1626752894))
                                                .setStickySessions(
                                                        new StickySessions()
                                                                .setType(StickySessionsType.NONE)
                                                                .setCookieName("e")
                                                                .setCookieTtlSeconds(1826638704))
                                                .setRedirectHttpToHttps(true)
                                                .setEnableProxyProtocol(false)
                                                .setEnableBackendKeepalive(true)
                                                .setDisableLetsEncryptDnsRecords(true)
                                                .setTag("qxtoiyygktsrjyxx")))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(1504015182));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsZl28R5ResponsesAllLoadBalancersContentApplicationJsonSchema.class);
        Assertions.assertEquals("fzbkvec", model.getLoadBalancers().get(0).getName());
        Assertions.assertEquals(1167734194, model.getLoadBalancers().get(0).getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_MEDIUM, model.getLoadBalancers().get(0).getSize());
        Assertions.assertEquals(LoadBalancerBaseAlgorithm.ROUND_ROBIN, model.getLoadBalancers().get(0).getAlgorithm());
        Assertions.assertEquals(
                HealthCheckProtocol.HTTPS, model.getLoadBalancers().get(0).getHealthCheck().getProtocol());
        Assertions.assertEquals(1474193251, model.getLoadBalancers().get(0).getHealthCheck().getPort());
        Assertions.assertEquals("jajvkyxmmjczvo", model.getLoadBalancers().get(0).getHealthCheck().getPath());
        Assertions.assertEquals(186095639, model.getLoadBalancers().get(0).getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(
                1337388892, model.getLoadBalancers().get(0).getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(999951623, model.getLoadBalancers().get(0).getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1626752894, model.getLoadBalancers().get(0).getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.NONE, model.getLoadBalancers().get(0).getStickySessions().getType());
        Assertions.assertEquals("e", model.getLoadBalancers().get(0).getStickySessions().getCookieName());
        Assertions.assertEquals(1826638704, model.getLoadBalancers().get(0).getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(true, model.getLoadBalancers().get(0).isRedirectHttpToHttps());
        Assertions.assertEquals(false, model.getLoadBalancers().get(0).isEnableProxyProtocol());
        Assertions.assertEquals(true, model.getLoadBalancers().get(0).isEnableBackendKeepalive());
        Assertions.assertEquals(true, model.getLoadBalancers().get(0).isDisableLetsEncryptDnsRecords());
        Assertions.assertEquals("qxtoiyygktsrjyxx", model.getLoadBalancers().get(0).getTag());
        Assertions.assertEquals(1504015182, model.getMeta().getTotal());
    }
}
