package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The GarbageCollection model.
 */
@Fluent
public final class GarbageCollection {
    /*
     * A string specifying the UUID of the garbage collection.
     */
    @JsonProperty(value = "uuid")
    private String uuid;

    /*
     * The name of the container registry.
     */
    @JsonProperty(value = "registry_name")
    private String registryName;

    /*
     * The current status of this garbage collection.
     */
    @JsonProperty(value = "status")
    private GarbageCollectionStatus status;

    /*
     * The time the garbage collection was created.
     */
    @JsonProperty(value = "created_at")
    private OffsetDateTime createdAt;

    /*
     * The time the garbage collection was last updated.
     */
    @JsonProperty(value = "updated_at")
    private OffsetDateTime updatedAt;

    /*
     * The number of blobs deleted as a result of this garbage collection.
     */
    @JsonProperty(value = "blobs_deleted")
    private Integer blobsDeleted;

    /*
     * The number of bytes freed as a result of this garbage collection.
     */
    @JsonProperty(value = "freed_bytes")
    private Integer freedBytes;

    /**
     * Get the uuid property: A string specifying the UUID of the garbage collection.
     * 
     * @return the uuid value.
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * Set the uuid property: A string specifying the UUID of the garbage collection.
     * 
     * @param uuid the uuid value to set.
     * @return the GarbageCollection object itself.
     */
    public GarbageCollection setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get the registryName property: The name of the container registry.
     * 
     * @return the registryName value.
     */
    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * Set the registryName property: The name of the container registry.
     * 
     * @param registryName the registryName value to set.
     * @return the GarbageCollection object itself.
     */
    public GarbageCollection setRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * Get the status property: The current status of this garbage collection.
     * 
     * @return the status value.
     */
    public GarbageCollectionStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The current status of this garbage collection.
     * 
     * @param status the status value to set.
     * @return the GarbageCollection object itself.
     */
    public GarbageCollection setStatus(GarbageCollectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the createdAt property: The time the garbage collection was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: The time the garbage collection was created.
     * 
     * @param createdAt the createdAt value to set.
     * @return the GarbageCollection object itself.
     */
    public GarbageCollection setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the updatedAt property: The time the garbage collection was last updated.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the updatedAt property: The time the garbage collection was last updated.
     * 
     * @param updatedAt the updatedAt value to set.
     * @return the GarbageCollection object itself.
     */
    public GarbageCollection setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get the blobsDeleted property: The number of blobs deleted as a result of this garbage collection.
     * 
     * @return the blobsDeleted value.
     */
    public Integer getBlobsDeleted() {
        return this.blobsDeleted;
    }

    /**
     * Set the blobsDeleted property: The number of blobs deleted as a result of this garbage collection.
     * 
     * @param blobsDeleted the blobsDeleted value to set.
     * @return the GarbageCollection object itself.
     */
    public GarbageCollection setBlobsDeleted(Integer blobsDeleted) {
        this.blobsDeleted = blobsDeleted;
        return this;
    }

    /**
     * Get the freedBytes property: The number of bytes freed as a result of this garbage collection.
     * 
     * @return the freedBytes value.
     */
    public Integer getFreedBytes() {
        return this.freedBytes;
    }

    /**
     * Set the freedBytes property: The number of bytes freed as a result of this garbage collection.
     * 
     * @param freedBytes the freedBytes value to set.
     * @return the GarbageCollection object itself.
     */
    public GarbageCollection setFreedBytes(Integer freedBytes) {
        this.freedBytes = freedBytes;
        return this;
    }
}
