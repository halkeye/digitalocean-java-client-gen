package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The NetworkV4 model.
 */
@Fluent
public final class NetworkV4 {
    /*
     * The IP address of the IPv4 network interface.
     */
    @JsonProperty(value = "ip_address")
    private String ipAddress;

    /*
     * The netmask of the IPv4 network interface.
     */
    @JsonProperty(value = "netmask")
    private String netmask;

    /*
     * The gateway of the specified IPv4 network interface.
     * 
     * For private interfaces, a gateway is not provided. This is denoted by
     * returning `nil` as its value.
     * 
     */
    @JsonProperty(value = "gateway")
    private String gateway;

    /*
     * The type of the IPv4 network interface.
     */
    @JsonProperty(value = "type")
    private NetworkV4Type type;

    /**
     * Get the ipAddress property: The IP address of the IPv4 network interface.
     * 
     * @return the ipAddress value.
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: The IP address of the IPv4 network interface.
     * 
     * @param ipAddress the ipAddress value to set.
     * @return the NetworkV4 object itself.
     */
    public NetworkV4 setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the netmask property: The netmask of the IPv4 network interface.
     * 
     * @return the netmask value.
     */
    public String getNetmask() {
        return this.netmask;
    }

    /**
     * Set the netmask property: The netmask of the IPv4 network interface.
     * 
     * @param netmask the netmask value to set.
     * @return the NetworkV4 object itself.
     */
    public NetworkV4 setNetmask(String netmask) {
        this.netmask = netmask;
        return this;
    }

    /**
     * Get the gateway property: The gateway of the specified IPv4 network interface.
     * 
     * For private interfaces, a gateway is not provided. This is denoted by
     * returning `nil` as its value.
     * 
     * @return the gateway value.
     */
    public String getGateway() {
        return this.gateway;
    }

    /**
     * Set the gateway property: The gateway of the specified IPv4 network interface.
     * 
     * For private interfaces, a gateway is not provided. This is denoted by
     * returning `nil` as its value.
     * 
     * @param gateway the gateway value to set.
     * @return the NetworkV4 object itself.
     */
    public NetworkV4 setGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * Get the type property: The type of the IPv4 network interface.
     * 
     * @return the type value.
     */
    public NetworkV4Type getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of the IPv4 network interface.
     * 
     * @param type the type value to set.
     * @return the NetworkV4 object itself.
     */
    public NetworkV4 setType(NetworkV4Type type) {
        this.type = type;
        return this;
    }
}
