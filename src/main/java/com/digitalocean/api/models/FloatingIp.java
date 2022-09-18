package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The FloatingIp model.
 */
@Fluent
public final class FloatingIp {
    /*
     * The public IP address of the floating IP. It also serves as its identifier.
     */
    @JsonProperty(value = "ip")
    private String ip;

    /*
     * The region property.
     */
    @JsonProperty(value = "region")
    private FloatingIpRegion region;

    /*
     * The Droplet that the floating IP has been assigned to. When you query a floating IP, if it is assigned to a
     * Droplet, the entire Droplet object will be returned. If it is not assigned, the value will be null.
     */
    @JsonProperty(value = "droplet")
    private Object droplet;

    /*
     * A boolean value indicating whether or not the floating IP has pending actions preventing new ones from being
     * submitted.
     */
    @JsonProperty(value = "locked")
    private Boolean locked;

    /**
     * Get the ip property: The public IP address of the floating IP. It also serves as its identifier.
     * 
     * @return the ip value.
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * Set the ip property: The public IP address of the floating IP. It also serves as its identifier.
     * 
     * @param ip the ip value to set.
     * @return the FloatingIp object itself.
     */
    public FloatingIp setIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get the region property: The region property.
     * 
     * @return the region value.
     */
    public FloatingIpRegion getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The region property.
     * 
     * @param region the region value to set.
     * @return the FloatingIp object itself.
     */
    public FloatingIp setRegion(FloatingIpRegion region) {
        this.region = region;
        return this;
    }

    /**
     * Get the droplet property: The Droplet that the floating IP has been assigned to. When you query a floating IP,
     * if it is assigned to a Droplet, the entire Droplet object will be returned. If it is not assigned, the value
     * will be null.
     * 
     * @return the droplet value.
     */
    public Object getDroplet() {
        return this.droplet;
    }

    /**
     * Set the droplet property: The Droplet that the floating IP has been assigned to. When you query a floating IP,
     * if it is assigned to a Droplet, the entire Droplet object will be returned. If it is not assigned, the value
     * will be null.
     * 
     * @param droplet the droplet value to set.
     * @return the FloatingIp object itself.
     */
    public FloatingIp setDroplet(Object droplet) {
        this.droplet = droplet;
        return this;
    }

    /**
     * Get the locked property: A boolean value indicating whether or not the floating IP has pending actions
     * preventing new ones from being submitted.
     * 
     * @return the locked value.
     */
    public Boolean isLocked() {
        return this.locked;
    }

    /**
     * Set the locked property: A boolean value indicating whether or not the floating IP has pending actions
     * preventing new ones from being submitted.
     * 
     * @param locked the locked value to set.
     * @return the FloatingIp object itself.
     */
    public FloatingIp setLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }
}
