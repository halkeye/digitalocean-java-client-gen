package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Assign Droplets by Tag.
 */
@Fluent
public final class AssignDropletsByTag extends Components1Utru1ASchemasLoadBalancerCreateOneof1Allof0 {
    /*
     * The slug identifier for the region where the resource will initially be  available.
     */
    @JsonProperty(value = "region")
    private RegionSlug region;

    /*
     * A unique ID that can be used to identify and reference a load balancer.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /*
     * A human-readable name for a load balancer instance.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * An attribute containing the public-facing IP address of the load balancer.
     */
    @JsonProperty(value = "ip", access = JsonProperty.Access.WRITE_ONLY)
    private String ip;

    /*
     * How many nodes the load balancer contains. Each additional node increases the load balancer's ability to manage
     * more connections. Load balancers can be scaled up or down, and you can change the number of nodes after creation
     * up to once per hour. This field is currently not available in the AMS2, NYC2, or SFO1 regions. Use the `size`
     * field to scale load balancers that reside in these regions.
     */
    @JsonProperty(value = "size_unit")
    private Integer sizeUnit;

    /*
     * This field has been replaced by the `size_unit` field for all regions except in AMS2, NYC2, and SFO1. Each
     * available load balancer size now equates to the load balancer having a set number of nodes.
     * * `lb-small` = 1 node
     * * `lb-medium` = 3 nodes
     * * `lb-large` = 6 nodes
     * 
     * You can resize load balancers after creation up to once per hour. You cannot resize a load balancer within the
     * first hour of its creation.
     */
    @JsonProperty(value = "size")
    private LoadBalancerBaseSize size;

    /*
     * This field has been deprecated. You can no longer specify an algorithm for load balancers.
     */
    @JsonProperty(value = "algorithm")
    private LoadBalancerBaseAlgorithm algorithm;

    /*
     * A status string indicating the current state of the load balancer. This can be `new`, `active`, or `errored`.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private LoadBalancerBaseStatus status;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the load balancer was created.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * An array of objects specifying the forwarding rules for a load balancer.
     */
    @JsonProperty(value = "forwarding_rules", required = true)
    private List<ForwardingRule> forwardingRules;

    /*
     * An object specifying health check settings for the load balancer.
     */
    @JsonProperty(value = "health_check")
    private HealthCheck healthCheck;

    /*
     * An object specifying sticky sessions settings for the load balancer.
     */
    @JsonProperty(value = "sticky_sessions")
    private StickySessions stickySessions;

    /*
     * A boolean value indicating whether HTTP requests to the load balancer on port 80 will be redirected to HTTPS on
     * port 443.
     */
    @JsonProperty(value = "redirect_http_to_https")
    private Boolean redirectHttpToHttps;

    /*
     * A boolean value indicating whether PROXY Protocol is in use.
     */
    @JsonProperty(value = "enable_proxy_protocol")
    private Boolean enableProxyProtocol;

    /*
     * A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets.
     */
    @JsonProperty(value = "enable_backend_keepalive")
    private Boolean enableBackendKeepalive;

    /*
     * A string specifying the UUID of the VPC to which the load balancer is assigned.
     */
    @JsonProperty(value = "vpc_uuid")
    private UUID vpcUuid;

    /*
     * A boolean value indicating whether to disable automatic DNS record creation for Let's Encrypt certificates that
     * are added to the load balancer.
     */
    @JsonProperty(value = "disable_lets_encrypt_dns_records")
    private Boolean disableLetsEncryptDnsRecords;

    /**
     * Get the region property: The slug identifier for the region where the resource will initially be  available.
     * 
     * @return the region value.
     */
    public RegionSlug getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The slug identifier for the region where the resource will initially be  available.
     * 
     * @param region the region value to set.
     * @return the AssignDropletsByTag object itself.
     */
    public AssignDropletsByTag setRegion(RegionSlug region) {
        this.region = region;
        return this;
    }

    /**
     * Get the id property: A unique ID that can be used to identify and reference a load balancer.
     * 
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Get the name property: A human-readable name for a load balancer instance.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A human-readable name for a load balancer instance.
     * 
     * @param name the name value to set.
     * @return the AssignDropletsByTag object itself.
     */
    public AssignDropletsByTag setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the ip property: An attribute containing the public-facing IP address of the load balancer.
     * 
     * @return the ip value.
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * Get the sizeUnit property: How many nodes the load balancer contains. Each additional node increases the load
     * balancer's ability to manage more connections. Load balancers can be scaled up or down, and you can change the
     * number of nodes after creation up to once per hour. This field is currently not available in the AMS2, NYC2, or
     * SFO1 regions. Use the `size` field to scale load balancers that reside in these regions.
     * 
     * @return the sizeUnit value.
     */
    public Integer getSizeUnit() {
        return this.sizeUnit;
    }

    /**
     * Set the sizeUnit property: How many nodes the load balancer contains. Each additional node increases the load
     * balancer's ability to manage more connections. Load balancers can be scaled up or down, and you can change the
     * number of nodes after creation up to once per hour. This field is currently not available in the AMS2, NYC2, or
     * SFO1 regions. Use the `size` field to scale load balancers that reside in these regions.
     * 
     * @param sizeUnit the sizeUnit value to set.
     * @return the AssignDropletsByTag object itself.
     */
    public AssignDropletsByTag setSizeUnit(Integer sizeUnit) {
        this.sizeUnit = sizeUnit;
        return this;
    }

    /**
     * Get the size property: This field has been replaced by the `size_unit` field for all regions except in AMS2,
     * NYC2, and SFO1. Each available load balancer size now equates to the load balancer having a set number of nodes.
     * * `lb-small` = 1 node
     * * `lb-medium` = 3 nodes
     * * `lb-large` = 6 nodes
     * 
     * You can resize load balancers after creation up to once per hour. You cannot resize a load balancer within the
     * first hour of its creation.
     * 
     * @return the size value.
     */
    public LoadBalancerBaseSize getSize() {
        return this.size;
    }

    /**
     * Set the size property: This field has been replaced by the `size_unit` field for all regions except in AMS2,
     * NYC2, and SFO1. Each available load balancer size now equates to the load balancer having a set number of nodes.
     * * `lb-small` = 1 node
     * * `lb-medium` = 3 nodes
     * * `lb-large` = 6 nodes
     * 
     * You can resize load balancers after creation up to once per hour. You cannot resize a load balancer within the
     * first hour of its creation.
     * 
     * @param size the size value to set.
     * @return the AssignDropletsByTag object itself.
     */
    public AssignDropletsByTag setSize(LoadBalancerBaseSize size) {
        this.size = size;
        return this;
    }

    /**
     * Get the algorithm property: This field has been deprecated. You can no longer specify an algorithm for load
     * balancers.
     * 
     * @return the algorithm value.
     */
    public LoadBalancerBaseAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    /**
     * Set the algorithm property: This field has been deprecated. You can no longer specify an algorithm for load
     * balancers.
     * 
     * @param algorithm the algorithm value to set.
     * @return the AssignDropletsByTag object itself.
     */
    public AssignDropletsByTag setAlgorithm(LoadBalancerBaseAlgorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Get the status property: A status string indicating the current state of the load balancer. This can be `new`,
     * `active`, or `errored`.
     * 
     * @return the status value.
     */
    public LoadBalancerBaseStatus getStatus() {
        return this.status;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * load balancer was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the forwardingRules property: An array of objects specifying the forwarding rules for a load balancer.
     * 
     * @return the forwardingRules value.
     */
    public List<ForwardingRule> getForwardingRules() {
        return this.forwardingRules;
    }

    /**
     * Set the forwardingRules property: An array of objects specifying the forwarding rules for a load balancer.
     * 
     * @param forwardingRules the forwardingRules value to set.
     * @return the AssignDropletsByTag object itself.
     */
    public AssignDropletsByTag setForwardingRules(List<ForwardingRule> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }

    /**
     * Get the healthCheck property: An object specifying health check settings for the load balancer.
     * 
     * @return the healthCheck value.
     */
    public HealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * Set the healthCheck property: An object specifying health check settings for the load balancer.
     * 
     * @param healthCheck the healthCheck value to set.
     * @return the AssignDropletsByTag object itself.
     */
    public AssignDropletsByTag setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    /**
     * Get the stickySessions property: An object specifying sticky sessions settings for the load balancer.
     * 
     * @return the stickySessions value.
     */
    public StickySessions getStickySessions() {
        return this.stickySessions;
    }

    /**
     * Set the stickySessions property: An object specifying sticky sessions settings for the load balancer.
     * 
     * @param stickySessions the stickySessions value to set.
     * @return the AssignDropletsByTag object itself.
     */
    public AssignDropletsByTag setStickySessions(StickySessions stickySessions) {
        this.stickySessions = stickySessions;
        return this;
    }

    /**
     * Get the redirectHttpToHttps property: A boolean value indicating whether HTTP requests to the load balancer on
     * port 80 will be redirected to HTTPS on port 443.
     * 
     * @return the redirectHttpToHttps value.
     */
    public Boolean isRedirectHttpToHttps() {
        return this.redirectHttpToHttps;
    }

    /**
     * Set the redirectHttpToHttps property: A boolean value indicating whether HTTP requests to the load balancer on
     * port 80 will be redirected to HTTPS on port 443.
     * 
     * @param redirectHttpToHttps the redirectHttpToHttps value to set.
     * @return the AssignDropletsByTag object itself.
     */
    public AssignDropletsByTag setRedirectHttpToHttps(Boolean redirectHttpToHttps) {
        this.redirectHttpToHttps = redirectHttpToHttps;
        return this;
    }

    /**
     * Get the enableProxyProtocol property: A boolean value indicating whether PROXY Protocol is in use.
     * 
     * @return the enableProxyProtocol value.
     */
    public Boolean isEnableProxyProtocol() {
        return this.enableProxyProtocol;
    }

    /**
     * Set the enableProxyProtocol property: A boolean value indicating whether PROXY Protocol is in use.
     * 
     * @param enableProxyProtocol the enableProxyProtocol value to set.
     * @return the AssignDropletsByTag object itself.
     */
    public AssignDropletsByTag setEnableProxyProtocol(Boolean enableProxyProtocol) {
        this.enableProxyProtocol = enableProxyProtocol;
        return this;
    }

    /**
     * Get the enableBackendKeepalive property: A boolean value indicating whether HTTP keepalive connections are
     * maintained to target Droplets.
     * 
     * @return the enableBackendKeepalive value.
     */
    public Boolean isEnableBackendKeepalive() {
        return this.enableBackendKeepalive;
    }

    /**
     * Set the enableBackendKeepalive property: A boolean value indicating whether HTTP keepalive connections are
     * maintained to target Droplets.
     * 
     * @param enableBackendKeepalive the enableBackendKeepalive value to set.
     * @return the AssignDropletsByTag object itself.
     */
    public AssignDropletsByTag setEnableBackendKeepalive(Boolean enableBackendKeepalive) {
        this.enableBackendKeepalive = enableBackendKeepalive;
        return this;
    }

    /**
     * Get the vpcUuid property: A string specifying the UUID of the VPC to which the load balancer is assigned.
     * 
     * @return the vpcUuid value.
     */
    public UUID getVpcUuid() {
        return this.vpcUuid;
    }

    /**
     * Set the vpcUuid property: A string specifying the UUID of the VPC to which the load balancer is assigned.
     * 
     * @param vpcUuid the vpcUuid value to set.
     * @return the AssignDropletsByTag object itself.
     */
    public AssignDropletsByTag setVpcUuid(UUID vpcUuid) {
        this.vpcUuid = vpcUuid;
        return this;
    }

    /**
     * Get the disableLetsEncryptDnsRecords property: A boolean value indicating whether to disable automatic DNS
     * record creation for Let's Encrypt certificates that are added to the load balancer.
     * 
     * @return the disableLetsEncryptDnsRecords value.
     */
    public Boolean isDisableLetsEncryptDnsRecords() {
        return this.disableLetsEncryptDnsRecords;
    }

    /**
     * Set the disableLetsEncryptDnsRecords property: A boolean value indicating whether to disable automatic DNS
     * record creation for Let's Encrypt certificates that are added to the load balancer.
     * 
     * @param disableLetsEncryptDnsRecords the disableLetsEncryptDnsRecords value to set.
     * @return the AssignDropletsByTag object itself.
     */
    public AssignDropletsByTag setDisableLetsEncryptDnsRecords(Boolean disableLetsEncryptDnsRecords) {
        this.disableLetsEncryptDnsRecords = disableLetsEncryptDnsRecords;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignDropletsByTag setTag(String tag) {
        super.setTag(tag);
        return this;
    }
}
