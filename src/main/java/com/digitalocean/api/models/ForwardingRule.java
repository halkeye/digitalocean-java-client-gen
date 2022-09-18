package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * An object specifying a forwarding rule for a load balancer.
 */
@Fluent
public final class ForwardingRule {
    /*
     * The protocol used for traffic to the load balancer. The possible values are: `http`, `https`, `http2`, `tcp`, or
     * `udp`. If you set the  `entry_protocol` to `upd`, the `target_protocol` must be set to `udp`.  When using UDP,
     * the load balancer requires that you set up a health  check with a port that uses TCP, HTTP, or HTTPS to work
     * properly.
     * 
     */
    @JsonProperty(value = "entry_protocol", required = true)
    private ForwardingRuleEntryProtocol entryProtocol;

    /*
     * An integer representing the port on which the load balancer instance will listen.
     */
    @JsonProperty(value = "entry_port", required = true)
    private int entryPort;

    /*
     * The protocol used for traffic from the load balancer to the backend Droplets. The possible values are: `http`,
     * `https`, `http2`, `tcp`, or `udp`. If you set the `target_protocol` to `upd`, the `entry_protocol` must be set
     * to  `udp`. When using UDP, the load balancer requires that you set up a health  check with a port that uses TCP,
     * HTTP, or HTTPS to work properly.
     * 
     */
    @JsonProperty(value = "target_protocol", required = true)
    private ForwardingRuleTargetProtocol targetProtocol;

    /*
     * An integer representing the port on the backend Droplets to which the load balancer will send traffic.
     */
    @JsonProperty(value = "target_port", required = true)
    private int targetPort;

    /*
     * The ID of the TLS certificate used for SSL termination if enabled.
     */
    @JsonProperty(value = "certificate_id")
    private String certificateId;

    /*
     * A boolean value indicating whether SSL encrypted traffic will be passed through to the backend Droplets.
     */
    @JsonProperty(value = "tls_passthrough")
    private Boolean tlsPassthrough;

    /**
     * Get the entryProtocol property: The protocol used for traffic to the load balancer. The possible values are:
     * `http`, `https`, `http2`, `tcp`, or `udp`. If you set the  `entry_protocol` to `upd`, the `target_protocol` must
     * be set to `udp`.  When using UDP, the load balancer requires that you set up a health  check with a port that
     * uses TCP, HTTP, or HTTPS to work properly.
     * 
     * @return the entryProtocol value.
     */
    public ForwardingRuleEntryProtocol getEntryProtocol() {
        return this.entryProtocol;
    }

    /**
     * Set the entryProtocol property: The protocol used for traffic to the load balancer. The possible values are:
     * `http`, `https`, `http2`, `tcp`, or `udp`. If you set the  `entry_protocol` to `upd`, the `target_protocol` must
     * be set to `udp`.  When using UDP, the load balancer requires that you set up a health  check with a port that
     * uses TCP, HTTP, or HTTPS to work properly.
     * 
     * @param entryProtocol the entryProtocol value to set.
     * @return the ForwardingRule object itself.
     */
    public ForwardingRule setEntryProtocol(ForwardingRuleEntryProtocol entryProtocol) {
        this.entryProtocol = entryProtocol;
        return this;
    }

    /**
     * Get the entryPort property: An integer representing the port on which the load balancer instance will listen.
     * 
     * @return the entryPort value.
     */
    public int getEntryPort() {
        return this.entryPort;
    }

    /**
     * Set the entryPort property: An integer representing the port on which the load balancer instance will listen.
     * 
     * @param entryPort the entryPort value to set.
     * @return the ForwardingRule object itself.
     */
    public ForwardingRule setEntryPort(int entryPort) {
        this.entryPort = entryPort;
        return this;
    }

    /**
     * Get the targetProtocol property: The protocol used for traffic from the load balancer to the backend Droplets.
     * The possible values are: `http`, `https`, `http2`, `tcp`, or `udp`. If you set the `target_protocol` to `upd`,
     * the `entry_protocol` must be set to  `udp`. When using UDP, the load balancer requires that you set up a health 
     * check with a port that uses TCP, HTTP, or HTTPS to work properly.
     * 
     * @return the targetProtocol value.
     */
    public ForwardingRuleTargetProtocol getTargetProtocol() {
        return this.targetProtocol;
    }

    /**
     * Set the targetProtocol property: The protocol used for traffic from the load balancer to the backend Droplets.
     * The possible values are: `http`, `https`, `http2`, `tcp`, or `udp`. If you set the `target_protocol` to `upd`,
     * the `entry_protocol` must be set to  `udp`. When using UDP, the load balancer requires that you set up a health 
     * check with a port that uses TCP, HTTP, or HTTPS to work properly.
     * 
     * @param targetProtocol the targetProtocol value to set.
     * @return the ForwardingRule object itself.
     */
    public ForwardingRule setTargetProtocol(ForwardingRuleTargetProtocol targetProtocol) {
        this.targetProtocol = targetProtocol;
        return this;
    }

    /**
     * Get the targetPort property: An integer representing the port on the backend Droplets to which the load balancer
     * will send traffic.
     * 
     * @return the targetPort value.
     */
    public int getTargetPort() {
        return this.targetPort;
    }

    /**
     * Set the targetPort property: An integer representing the port on the backend Droplets to which the load balancer
     * will send traffic.
     * 
     * @param targetPort the targetPort value to set.
     * @return the ForwardingRule object itself.
     */
    public ForwardingRule setTargetPort(int targetPort) {
        this.targetPort = targetPort;
        return this;
    }

    /**
     * Get the certificateId property: The ID of the TLS certificate used for SSL termination if enabled.
     * 
     * @return the certificateId value.
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * Set the certificateId property: The ID of the TLS certificate used for SSL termination if enabled.
     * 
     * @param certificateId the certificateId value to set.
     * @return the ForwardingRule object itself.
     */
    public ForwardingRule setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * Get the tlsPassthrough property: A boolean value indicating whether SSL encrypted traffic will be passed through
     * to the backend Droplets.
     * 
     * @return the tlsPassthrough value.
     */
    public Boolean isTlsPassthrough() {
        return this.tlsPassthrough;
    }

    /**
     * Set the tlsPassthrough property: A boolean value indicating whether SSL encrypted traffic will be passed through
     * to the backend Droplets.
     * 
     * @param tlsPassthrough the tlsPassthrough value to set.
     * @return the ForwardingRule object itself.
     */
    public ForwardingRule setTlsPassthrough(Boolean tlsPassthrough) {
        this.tlsPassthrough = tlsPassthrough;
        return this;
    }
}
