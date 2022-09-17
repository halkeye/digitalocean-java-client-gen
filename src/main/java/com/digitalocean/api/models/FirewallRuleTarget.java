package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The FirewallRuleTarget model. */
@Fluent
public class FirewallRuleTarget {
    /*
     * An array of strings containing the IPv4 addresses, IPv6 addresses, IPv4 CIDRs, and/or IPv6 CIDRs to which the
     * firewall will allow traffic.
     */
    @JsonProperty(value = "addresses")
    private List<String> addresses;

    /*
     * An array containing the IDs of the Droplets to which the firewall will allow traffic.
     */
    @JsonProperty(value = "droplet_ids")
    private List<Integer> dropletIds;

    /*
     * An array containing the IDs of the load balancers to which the firewall will allow traffic.
     */
    @JsonProperty(value = "load_balancer_uids")
    private List<String> loadBalancerUids;

    /*
     * An array containing the IDs of the Kubernetes clusters to which the firewall will allow traffic.
     */
    @JsonProperty(value = "kubernetes_ids")
    private List<String> kubernetesIds;

    /*
     * Any object
     */
    @JsonProperty(value = "tags")
    private Object tags;

    /**
     * Get the addresses property: An array of strings containing the IPv4 addresses, IPv6 addresses, IPv4 CIDRs, and/or
     * IPv6 CIDRs to which the firewall will allow traffic.
     *
     * @return the addresses value.
     */
    public List<String> getAddresses() {
        return this.addresses;
    }

    /**
     * Set the addresses property: An array of strings containing the IPv4 addresses, IPv6 addresses, IPv4 CIDRs, and/or
     * IPv6 CIDRs to which the firewall will allow traffic.
     *
     * @param addresses the addresses value to set.
     * @return the FirewallRuleTarget object itself.
     */
    public FirewallRuleTarget setAddresses(List<String> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Get the dropletIds property: An array containing the IDs of the Droplets to which the firewall will allow
     * traffic.
     *
     * @return the dropletIds value.
     */
    public List<Integer> getDropletIds() {
        return this.dropletIds;
    }

    /**
     * Set the dropletIds property: An array containing the IDs of the Droplets to which the firewall will allow
     * traffic.
     *
     * @param dropletIds the dropletIds value to set.
     * @return the FirewallRuleTarget object itself.
     */
    public FirewallRuleTarget setDropletIds(List<Integer> dropletIds) {
        this.dropletIds = dropletIds;
        return this;
    }

    /**
     * Get the loadBalancerUids property: An array containing the IDs of the load balancers to which the firewall will
     * allow traffic.
     *
     * @return the loadBalancerUids value.
     */
    public List<String> getLoadBalancerUids() {
        return this.loadBalancerUids;
    }

    /**
     * Set the loadBalancerUids property: An array containing the IDs of the load balancers to which the firewall will
     * allow traffic.
     *
     * @param loadBalancerUids the loadBalancerUids value to set.
     * @return the FirewallRuleTarget object itself.
     */
    public FirewallRuleTarget setLoadBalancerUids(List<String> loadBalancerUids) {
        this.loadBalancerUids = loadBalancerUids;
        return this;
    }

    /**
     * Get the kubernetesIds property: An array containing the IDs of the Kubernetes clusters to which the firewall will
     * allow traffic.
     *
     * @return the kubernetesIds value.
     */
    public List<String> getKubernetesIds() {
        return this.kubernetesIds;
    }

    /**
     * Set the kubernetesIds property: An array containing the IDs of the Kubernetes clusters to which the firewall will
     * allow traffic.
     *
     * @param kubernetesIds the kubernetesIds value to set.
     * @return the FirewallRuleTarget object itself.
     */
    public FirewallRuleTarget setKubernetesIds(List<String> kubernetesIds) {
        this.kubernetesIds = kubernetesIds;
        return this;
    }

    /**
     * Get the tags property: Any object.
     *
     * @return the tags value.
     */
    public Object getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Any object.
     *
     * @param tags the tags value to set.
     * @return the FirewallRuleTarget object itself.
     */
    public FirewallRuleTarget setTags(Object tags) {
        this.tags = tags;
        return this;
    }
}
