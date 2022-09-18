package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The NetworkV6 model.
 */
@Fluent
public final class NetworkV6 {
    /*
     * The IP address of the IPv6 network interface.
     */
    @JsonProperty(value = "ip_address")
    private String ipAddress;

    /*
     * The netmask of the IPv6 network interface.
     */
    @JsonProperty(value = "netmask")
    private Integer netmask;

    /*
     * The gateway of the specified IPv6 network interface.
     */
    @JsonProperty(value = "gateway")
    private String gateway;

    /*
     * The type of the IPv6 network interface.
     * 
     * **Note**: IPv6 private  networking is not currently supported.
     * 
     */
    @JsonProperty(value = "type")
    private String type = "public";

    /**
     * Get the ipAddress property: The IP address of the IPv6 network interface.
     * 
     * @return the ipAddress value.
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: The IP address of the IPv6 network interface.
     * 
     * @param ipAddress the ipAddress value to set.
     * @return the NetworkV6 object itself.
     */
    public NetworkV6 setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the netmask property: The netmask of the IPv6 network interface.
     * 
     * @return the netmask value.
     */
    public Integer getNetmask() {
        return this.netmask;
    }

    /**
     * Set the netmask property: The netmask of the IPv6 network interface.
     * 
     * @param netmask the netmask value to set.
     * @return the NetworkV6 object itself.
     */
    public NetworkV6 setNetmask(Integer netmask) {
        this.netmask = netmask;
        return this;
    }

    /**
     * Get the gateway property: The gateway of the specified IPv6 network interface.
     * 
     * @return the gateway value.
     */
    public String getGateway() {
        return this.gateway;
    }

    /**
     * Set the gateway property: The gateway of the specified IPv6 network interface.
     * 
     * @param gateway the gateway value to set.
     * @return the NetworkV6 object itself.
     */
    public NetworkV6 setGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * Get the type property: The type of the IPv6 network interface.
     * 
     * **Note**: IPv6 private  networking is not currently supported.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of the IPv6 network interface.
     * 
     * **Note**: IPv6 private  networking is not currently supported.
     * 
     * @param type the type value to set.
     * @return the NetworkV6 object itself.
     */
    public NetworkV6 setType(String type) {
        this.type = type;
        return this;
    }
}
