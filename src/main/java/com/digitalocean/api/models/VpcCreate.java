package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VpcCreate model. */
@Fluent
public class VpcCreate {
    /*
     * The slug identifier for the region where the VPC will be created.
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * The range of IP addresses in the VPC in CIDR notation. Network ranges cannot overlap with other networks in the
     * same account and must be in range of private addresses as defined in RFC1918. It may not be smaller than `/28`
     * nor larger than `/16`. If no IP range is specified, a `/20` network range is generated that won't conflict with
     * other VPC networks in your account.
     */
    @JsonProperty(value = "ip_range")
    private String ipRange;

    /**
     * Get the region property: The slug identifier for the region where the VPC will be created.
     *
     * @return the region value.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The slug identifier for the region where the VPC will be created.
     *
     * @param region the region value to set.
     * @return the VpcCreate object itself.
     */
    public VpcCreate setRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the ipRange property: The range of IP addresses in the VPC in CIDR notation. Network ranges cannot overlap
     * with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may
     * not be smaller than `/28` nor larger than `/16`. If no IP range is specified, a `/20` network range is generated
     * that won't conflict with other VPC networks in your account.
     *
     * @return the ipRange value.
     */
    public String getIpRange() {
        return this.ipRange;
    }

    /**
     * Set the ipRange property: The range of IP addresses in the VPC in CIDR notation. Network ranges cannot overlap
     * with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may
     * not be smaller than `/28` nor larger than `/16`. If no IP range is specified, a `/20` network range is generated
     * that won't conflict with other VPC networks in your account.
     *
     * @param ipRange the ipRange value to set.
     * @return the VpcCreate object itself.
     */
    public VpcCreate setIpRange(String ipRange) {
        this.ipRange = ipRange;
        return this;
    }
}
