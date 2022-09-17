package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1MywxwzResponsesAllLoadBalancersContentApplicationJsonSchemaAllof0;
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

public final class Components1MywxwzResponsesAllLoadBalancersContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1MywxwzResponsesAllLoadBalancersContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"load_balancers\":[{\"tag\":\"xnrp\",\"name\":\"wokyqsf\",\"ip\":\"fsywbihq\",\"size_unit\":1123585127,\"size\":\"lb-medium\",\"algorithm\":\"least_connections\",\"status\":\"errored\",\"created_at\":\"2021-11-24T05:11:05Z\",\"forwarding_rules\":[],\"health_check\":{\"protocol\":\"https\",\"port\":314147469,\"path\":\"d\",\"check_interval_seconds\":293525589,\"response_timeout_seconds\":155787926,\"unhealthy_threshold\":697382672,\"healthy_threshold\":1422718965},\"sticky_sessions\":{\"type\":\"none\",\"cookie_name\":\"njdvv\",\"cookie_ttl_seconds\":1968267739},\"redirect_http_to_https\":false,\"enable_proxy_protocol\":false,\"enable_backend_keepalive\":true,\"disable_lets_encrypt_dns_records\":true},{\"tag\":\"qzbvbpsuvqhxt\",\"name\":\"gdkwbkurklpiigfu\",\"ip\":\"eutuipjclz\",\"size_unit\":1405753409,\"size\":\"lb-medium\",\"algorithm\":\"least_connections\",\"status\":\"new\",\"created_at\":\"2021-06-05T09:58:36Z\",\"forwarding_rules\":[],\"health_check\":{\"protocol\":\"tcp\",\"port\":2002633487,\"path\":\"zzevtzqwczochwb\",\"check_interval_seconds\":575448740,\"response_timeout_seconds\":1854687293,\"unhealthy_threshold\":590017454,\"healthy_threshold\":1088863938},\"sticky_sessions\":{\"type\":\"cookies\",\"cookie_name\":\"iysdhorkslhraqki\",\"cookie_ttl_seconds\":1574377606},\"redirect_http_to_https\":false,\"enable_proxy_protocol\":false,\"enable_backend_keepalive\":true,\"disable_lets_encrypt_dns_records\":true},{\"tag\":\"oguflteat\",\"name\":\"ef\",\"ip\":\"xnjtqbgysib\",\"size_unit\":2133577099,\"size\":\"lb-small\",\"algorithm\":\"round_robin\",\"status\":\"active\",\"created_at\":\"2021-01-25T02:27:01Z\",\"forwarding_rules\":[],\"health_check\":{\"protocol\":\"http\",\"port\":169430650,\"path\":\"hkxunsaujqgbb\",\"check_interval_seconds\":56442846,\"response_timeout_seconds\":1048576922,\"unhealthy_threshold\":337273485,\"healthy_threshold\":1561894894},\"sticky_sessions\":{\"type\":\"none\",\"cookie_name\":\"csloygsabdg\",\"cookie_ttl_seconds\":3439867},\"redirect_http_to_https\":false,\"enable_proxy_protocol\":true,\"enable_backend_keepalive\":false,\"disable_lets_encrypt_dns_records\":true},{\"tag\":\"vz\",\"name\":\"qhgzuyxtrvfdb\",\"ip\":\"kgqjbvitptpvsf\",\"size_unit\":1815430425,\"size\":\"lb-small\",\"algorithm\":\"round_robin\",\"status\":\"errored\",\"created_at\":\"2021-04-07T04:54:50Z\",\"forwarding_rules\":[],\"health_check\":{\"protocol\":\"http\",\"port\":1052451212,\"path\":\"fdwfbwxy\",\"check_interval_seconds\":1038736198,\"response_timeout_seconds\":1548321491,\"unhealthy_threshold\":208581764,\"healthy_threshold\":132351733},\"sticky_sessions\":{\"type\":\"cookies\",\"cookie_name\":\"gajrzctw\",\"cookie_ttl_seconds\":1478328356},\"redirect_http_to_https\":true,\"enable_proxy_protocol\":false,\"enable_backend_keepalive\":true,\"disable_lets_encrypt_dns_records\":true}]}")
                        .toObject(Components1MywxwzResponsesAllLoadBalancersContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("wokyqsf", model.getLoadBalancers().get(0).getName());
        Assertions.assertEquals(1123585127, model.getLoadBalancers().get(0).getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_MEDIUM, model.getLoadBalancers().get(0).getSize());
        Assertions.assertEquals(
                LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS, model.getLoadBalancers().get(0).getAlgorithm());
        Assertions.assertEquals(
                HealthCheckProtocol.HTTPS, model.getLoadBalancers().get(0).getHealthCheck().getProtocol());
        Assertions.assertEquals(314147469, model.getLoadBalancers().get(0).getHealthCheck().getPort());
        Assertions.assertEquals("d", model.getLoadBalancers().get(0).getHealthCheck().getPath());
        Assertions.assertEquals(293525589, model.getLoadBalancers().get(0).getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(
                155787926, model.getLoadBalancers().get(0).getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(697382672, model.getLoadBalancers().get(0).getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1422718965, model.getLoadBalancers().get(0).getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.NONE, model.getLoadBalancers().get(0).getStickySessions().getType());
        Assertions.assertEquals("njdvv", model.getLoadBalancers().get(0).getStickySessions().getCookieName());
        Assertions.assertEquals(1968267739, model.getLoadBalancers().get(0).getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(false, model.getLoadBalancers().get(0).isRedirectHttpToHttps());
        Assertions.assertEquals(false, model.getLoadBalancers().get(0).isEnableProxyProtocol());
        Assertions.assertEquals(true, model.getLoadBalancers().get(0).isEnableBackendKeepalive());
        Assertions.assertEquals(true, model.getLoadBalancers().get(0).isDisableLetsEncryptDnsRecords());
        Assertions.assertEquals("xnrp", model.getLoadBalancers().get(0).getTag());
    }

    @Test
    public void testSerialize() {
        Components1MywxwzResponsesAllLoadBalancersContentApplicationJsonSchemaAllof0 model =
                new Components1MywxwzResponsesAllLoadBalancersContentApplicationJsonSchemaAllof0()
                        .setLoadBalancers(
                                Arrays.asList(
                                        new LoadBalancer()
                                                .setName("wokyqsf")
                                                .setSizeUnit(1123585127)
                                                .setSize(LoadBalancerBaseSize.LB_MEDIUM)
                                                .setAlgorithm(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS)
                                                .setForwardingRules(Arrays.asList())
                                                .setHealthCheck(
                                                        new HealthCheck()
                                                                .setProtocol(HealthCheckProtocol.HTTPS)
                                                                .setPort(314147469)
                                                                .setPath("d")
                                                                .setCheckIntervalSeconds(293525589)
                                                                .setResponseTimeoutSeconds(155787926)
                                                                .setUnhealthyThreshold(697382672)
                                                                .setHealthyThreshold(1422718965))
                                                .setStickySessions(
                                                        new StickySessions()
                                                                .setType(StickySessionsType.NONE)
                                                                .setCookieName("njdvv")
                                                                .setCookieTtlSeconds(1968267739))
                                                .setRedirectHttpToHttps(false)
                                                .setEnableProxyProtocol(false)
                                                .setEnableBackendKeepalive(true)
                                                .setDisableLetsEncryptDnsRecords(true)
                                                .setTag("xnrp"),
                                        new LoadBalancer()
                                                .setName("gdkwbkurklpiigfu")
                                                .setSizeUnit(1405753409)
                                                .setSize(LoadBalancerBaseSize.LB_MEDIUM)
                                                .setAlgorithm(LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS)
                                                .setForwardingRules(Arrays.asList())
                                                .setHealthCheck(
                                                        new HealthCheck()
                                                                .setProtocol(HealthCheckProtocol.TCP)
                                                                .setPort(2002633487)
                                                                .setPath("zzevtzqwczochwb")
                                                                .setCheckIntervalSeconds(575448740)
                                                                .setResponseTimeoutSeconds(1854687293)
                                                                .setUnhealthyThreshold(590017454)
                                                                .setHealthyThreshold(1088863938))
                                                .setStickySessions(
                                                        new StickySessions()
                                                                .setType(StickySessionsType.COOKIES)
                                                                .setCookieName("iysdhorkslhraqki")
                                                                .setCookieTtlSeconds(1574377606))
                                                .setRedirectHttpToHttps(false)
                                                .setEnableProxyProtocol(false)
                                                .setEnableBackendKeepalive(true)
                                                .setDisableLetsEncryptDnsRecords(true)
                                                .setTag("qzbvbpsuvqhxt"),
                                        new LoadBalancer()
                                                .setName("ef")
                                                .setSizeUnit(2133577099)
                                                .setSize(LoadBalancerBaseSize.LB_SMALL)
                                                .setAlgorithm(LoadBalancerBaseAlgorithm.ROUND_ROBIN)
                                                .setForwardingRules(Arrays.asList())
                                                .setHealthCheck(
                                                        new HealthCheck()
                                                                .setProtocol(HealthCheckProtocol.HTTP)
                                                                .setPort(169430650)
                                                                .setPath("hkxunsaujqgbb")
                                                                .setCheckIntervalSeconds(56442846)
                                                                .setResponseTimeoutSeconds(1048576922)
                                                                .setUnhealthyThreshold(337273485)
                                                                .setHealthyThreshold(1561894894))
                                                .setStickySessions(
                                                        new StickySessions()
                                                                .setType(StickySessionsType.NONE)
                                                                .setCookieName("csloygsabdg")
                                                                .setCookieTtlSeconds(3439867))
                                                .setRedirectHttpToHttps(false)
                                                .setEnableProxyProtocol(true)
                                                .setEnableBackendKeepalive(false)
                                                .setDisableLetsEncryptDnsRecords(true)
                                                .setTag("oguflteat"),
                                        new LoadBalancer()
                                                .setName("qhgzuyxtrvfdb")
                                                .setSizeUnit(1815430425)
                                                .setSize(LoadBalancerBaseSize.LB_SMALL)
                                                .setAlgorithm(LoadBalancerBaseAlgorithm.ROUND_ROBIN)
                                                .setForwardingRules(Arrays.asList())
                                                .setHealthCheck(
                                                        new HealthCheck()
                                                                .setProtocol(HealthCheckProtocol.HTTP)
                                                                .setPort(1052451212)
                                                                .setPath("fdwfbwxy")
                                                                .setCheckIntervalSeconds(1038736198)
                                                                .setResponseTimeoutSeconds(1548321491)
                                                                .setUnhealthyThreshold(208581764)
                                                                .setHealthyThreshold(132351733))
                                                .setStickySessions(
                                                        new StickySessions()
                                                                .setType(StickySessionsType.COOKIES)
                                                                .setCookieName("gajrzctw")
                                                                .setCookieTtlSeconds(1478328356))
                                                .setRedirectHttpToHttps(true)
                                                .setEnableProxyProtocol(false)
                                                .setEnableBackendKeepalive(true)
                                                .setDisableLetsEncryptDnsRecords(true)
                                                .setTag("vz")));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1MywxwzResponsesAllLoadBalancersContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("wokyqsf", model.getLoadBalancers().get(0).getName());
        Assertions.assertEquals(1123585127, model.getLoadBalancers().get(0).getSizeUnit());
        Assertions.assertEquals(LoadBalancerBaseSize.LB_MEDIUM, model.getLoadBalancers().get(0).getSize());
        Assertions.assertEquals(
                LoadBalancerBaseAlgorithm.LEAST_CONNECTIONS, model.getLoadBalancers().get(0).getAlgorithm());
        Assertions.assertEquals(
                HealthCheckProtocol.HTTPS, model.getLoadBalancers().get(0).getHealthCheck().getProtocol());
        Assertions.assertEquals(314147469, model.getLoadBalancers().get(0).getHealthCheck().getPort());
        Assertions.assertEquals("d", model.getLoadBalancers().get(0).getHealthCheck().getPath());
        Assertions.assertEquals(293525589, model.getLoadBalancers().get(0).getHealthCheck().getCheckIntervalSeconds());
        Assertions.assertEquals(
                155787926, model.getLoadBalancers().get(0).getHealthCheck().getResponseTimeoutSeconds());
        Assertions.assertEquals(697382672, model.getLoadBalancers().get(0).getHealthCheck().getUnhealthyThreshold());
        Assertions.assertEquals(1422718965, model.getLoadBalancers().get(0).getHealthCheck().getHealthyThreshold());
        Assertions.assertEquals(StickySessionsType.NONE, model.getLoadBalancers().get(0).getStickySessions().getType());
        Assertions.assertEquals("njdvv", model.getLoadBalancers().get(0).getStickySessions().getCookieName());
        Assertions.assertEquals(1968267739, model.getLoadBalancers().get(0).getStickySessions().getCookieTtlSeconds());
        Assertions.assertEquals(false, model.getLoadBalancers().get(0).isRedirectHttpToHttps());
        Assertions.assertEquals(false, model.getLoadBalancers().get(0).isEnableProxyProtocol());
        Assertions.assertEquals(true, model.getLoadBalancers().get(0).isEnableBackendKeepalive());
        Assertions.assertEquals(true, model.getLoadBalancers().get(0).isDisableLetsEncryptDnsRecords());
        Assertions.assertEquals("xnrp", model.getLoadBalancers().get(0).getTag());
    }
}
