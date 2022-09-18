package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;

/**
 * The Registry model.
 */
@Fluent
public final class Registry {
    /*
     * A globally unique name for the container registry. Must be lowercase and be composed only of numbers, letters
     * and `-`, up to a limit of 63 characters.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the registry was created.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * Slug of the region where registry data is stored
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * The amount of storage used in the registry in bytes.
     */
    @JsonProperty(value = "storage_usage_bytes", access = JsonProperty.Access.WRITE_ONLY)
    private Integer storageUsageBytes;

    /*
     * The time at which the storage usage was updated. Storage usage is calculated asynchronously, and may not
     * immediately reflect pushes to the registry.
     */
    @JsonProperty(value = "storage_usage_bytes_updated_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime storageUsageBytesUpdatedAt;

    /*
     * The subscription property.
     */
    @JsonProperty(value = "subscription")
    private RegistrySubscription subscription;

    /**
     * Get the name property: A globally unique name for the container registry. Must be lowercase and be composed only
     * of numbers, letters and `-`, up to a limit of 63 characters.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A globally unique name for the container registry. Must be lowercase and be composed only
     * of numbers, letters and `-`, up to a limit of 63 characters.
     * 
     * @param name the name value to set.
     * @return the Registry object itself.
     */
    public Registry setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * registry was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the region property: Slug of the region where registry data is stored.
     * 
     * @return the region value.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Set the region property: Slug of the region where registry data is stored.
     * 
     * @param region the region value to set.
     * @return the Registry object itself.
     */
    public Registry setRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the storageUsageBytes property: The amount of storage used in the registry in bytes.
     * 
     * @return the storageUsageBytes value.
     */
    public Integer getStorageUsageBytes() {
        return this.storageUsageBytes;
    }

    /**
     * Get the storageUsageBytesUpdatedAt property: The time at which the storage usage was updated. Storage usage is
     * calculated asynchronously, and may not immediately reflect pushes to the registry.
     * 
     * @return the storageUsageBytesUpdatedAt value.
     */
    public OffsetDateTime getStorageUsageBytesUpdatedAt() {
        return this.storageUsageBytesUpdatedAt;
    }

    /**
     * Get the subscription property: The subscription property.
     * 
     * @return the subscription value.
     */
    public RegistrySubscription getSubscription() {
        return this.subscription;
    }

    /**
     * Set the subscription property: The subscription property.
     * 
     * @param subscription the subscription value to set.
     * @return the Registry object itself.
     */
    public Registry setSubscription(RegistrySubscription subscription) {
        this.subscription = subscription;
        return this;
    }
}
