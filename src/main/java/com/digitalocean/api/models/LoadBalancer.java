package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** The LoadBalancer model. */
@Fluent
public final class LoadBalancer extends LoadBalancerBase {
    /*
     * The name of a Droplet tag corresponding to Droplets assigned to the load balancer.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /**
     * Get the tag property: The name of a Droplet tag corresponding to Droplets assigned to the load balancer.
     *
     * @return the tag value.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: The name of a Droplet tag corresponding to Droplets assigned to the load balancer.
     *
     * @param tag the tag value to set.
     * @return the LoadBalancer object itself.
     */
    public LoadBalancer setTag(String tag) {
        this.tag = tag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancer setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancer setSizeUnit(Integer sizeUnit) {
        super.setSizeUnit(sizeUnit);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancer setSize(LoadBalancerBaseSize size) {
        super.setSize(size);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancer setAlgorithm(LoadBalancerBaseAlgorithm algorithm) {
        super.setAlgorithm(algorithm);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancer setForwardingRules(List<ForwardingRule> forwardingRules) {
        super.setForwardingRules(forwardingRules);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancer setHealthCheck(HealthCheck healthCheck) {
        super.setHealthCheck(healthCheck);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancer setStickySessions(StickySessions stickySessions) {
        super.setStickySessions(stickySessions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancer setRedirectHttpToHttps(Boolean redirectHttpToHttps) {
        super.setRedirectHttpToHttps(redirectHttpToHttps);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancer setEnableProxyProtocol(Boolean enableProxyProtocol) {
        super.setEnableProxyProtocol(enableProxyProtocol);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancer setEnableBackendKeepalive(Boolean enableBackendKeepalive) {
        super.setEnableBackendKeepalive(enableBackendKeepalive);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancer setVpcUuid(UUID vpcUuid) {
        super.setVpcUuid(vpcUuid);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancer setDisableLetsEncryptDnsRecords(Boolean disableLetsEncryptDnsRecords) {
        super.setDisableLetsEncryptDnsRecords(disableLetsEncryptDnsRecords);
        return this;
    }
}
