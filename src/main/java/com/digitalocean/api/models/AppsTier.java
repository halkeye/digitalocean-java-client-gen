package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The AppsTier model.
 */
@Fluent
public final class AppsTier {
    /*
     * The amount of included build time in seconds
     */
    @JsonProperty(value = "build_seconds")
    private String buildSeconds;

    /*
     * The amount of included outbound bandwidth in bytes
     */
    @JsonProperty(value = "egress_bandwidth_bytes")
    private String egressBandwidthBytes;

    /*
     * A human-readable name of the tier
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The slug of the tier
     */
    @JsonProperty(value = "slug")
    private String slug;

    /*
     * The allotted disk space in bytes
     */
    @JsonProperty(value = "storage_bytes")
    private String storageBytes;

    /**
     * Get the buildSeconds property: The amount of included build time in seconds.
     * 
     * @return the buildSeconds value.
     */
    public String getBuildSeconds() {
        return this.buildSeconds;
    }

    /**
     * Set the buildSeconds property: The amount of included build time in seconds.
     * 
     * @param buildSeconds the buildSeconds value to set.
     * @return the AppsTier object itself.
     */
    public AppsTier setBuildSeconds(String buildSeconds) {
        this.buildSeconds = buildSeconds;
        return this;
    }

    /**
     * Get the egressBandwidthBytes property: The amount of included outbound bandwidth in bytes.
     * 
     * @return the egressBandwidthBytes value.
     */
    public String getEgressBandwidthBytes() {
        return this.egressBandwidthBytes;
    }

    /**
     * Set the egressBandwidthBytes property: The amount of included outbound bandwidth in bytes.
     * 
     * @param egressBandwidthBytes the egressBandwidthBytes value to set.
     * @return the AppsTier object itself.
     */
    public AppsTier setEgressBandwidthBytes(String egressBandwidthBytes) {
        this.egressBandwidthBytes = egressBandwidthBytes;
        return this;
    }

    /**
     * Get the name property: A human-readable name of the tier.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A human-readable name of the tier.
     * 
     * @param name the name value to set.
     * @return the AppsTier object itself.
     */
    public AppsTier setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the slug property: The slug of the tier.
     * 
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: The slug of the tier.
     * 
     * @param slug the slug value to set.
     * @return the AppsTier object itself.
     */
    public AppsTier setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get the storageBytes property: The allotted disk space in bytes.
     * 
     * @return the storageBytes value.
     */
    public String getStorageBytes() {
        return this.storageBytes;
    }

    /**
     * Set the storageBytes property: The allotted disk space in bytes.
     * 
     * @param storageBytes the storageBytes value to set.
     * @return the AppsTier object itself.
     */
    public AppsTier setStorageBytes(String storageBytes) {
        this.storageBytes = storageBytes;
        return this;
    }
}
