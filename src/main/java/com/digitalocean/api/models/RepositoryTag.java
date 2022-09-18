package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;

/**
 * The RepositoryTag model.
 */
@Fluent
public final class RepositoryTag {
    /*
     * The name of the container registry.
     */
    @JsonProperty(value = "registry_name")
    private String registryName;

    /*
     * The name of the repository.
     */
    @JsonProperty(value = "repository")
    private String repository;

    /*
     * The name of the tag.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /*
     * The digest of the manifest associated with the tag.
     */
    @JsonProperty(value = "manifest_digest")
    private String manifestDigest;

    /*
     * The compressed size of the tag in bytes.
     */
    @JsonProperty(value = "compressed_size_bytes")
    private Integer compressedSizeBytes;

    /*
     * The uncompressed size of the tag in bytes (this size is calculated asynchronously so it may not be immediately
     * available).
     */
    @JsonProperty(value = "size_bytes")
    private Integer sizeBytes;

    /*
     * The time the tag was last updated.
     */
    @JsonProperty(value = "updated_at")
    private OffsetDateTime updatedAt;

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
     * @return the RepositoryTag object itself.
     */
    public RepositoryTag setRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * Get the repository property: The name of the repository.
     * 
     * @return the repository value.
     */
    public String getRepository() {
        return this.repository;
    }

    /**
     * Set the repository property: The name of the repository.
     * 
     * @param repository the repository value to set.
     * @return the RepositoryTag object itself.
     */
    public RepositoryTag setRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get the tag property: The name of the tag.
     * 
     * @return the tag value.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: The name of the tag.
     * 
     * @param tag the tag value to set.
     * @return the RepositoryTag object itself.
     */
    public RepositoryTag setTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the manifestDigest property: The digest of the manifest associated with the tag.
     * 
     * @return the manifestDigest value.
     */
    public String getManifestDigest() {
        return this.manifestDigest;
    }

    /**
     * Set the manifestDigest property: The digest of the manifest associated with the tag.
     * 
     * @param manifestDigest the manifestDigest value to set.
     * @return the RepositoryTag object itself.
     */
    public RepositoryTag setManifestDigest(String manifestDigest) {
        this.manifestDigest = manifestDigest;
        return this;
    }

    /**
     * Get the compressedSizeBytes property: The compressed size of the tag in bytes.
     * 
     * @return the compressedSizeBytes value.
     */
    public Integer getCompressedSizeBytes() {
        return this.compressedSizeBytes;
    }

    /**
     * Set the compressedSizeBytes property: The compressed size of the tag in bytes.
     * 
     * @param compressedSizeBytes the compressedSizeBytes value to set.
     * @return the RepositoryTag object itself.
     */
    public RepositoryTag setCompressedSizeBytes(Integer compressedSizeBytes) {
        this.compressedSizeBytes = compressedSizeBytes;
        return this;
    }

    /**
     * Get the sizeBytes property: The uncompressed size of the tag in bytes (this size is calculated asynchronously so
     * it may not be immediately available).
     * 
     * @return the sizeBytes value.
     */
    public Integer getSizeBytes() {
        return this.sizeBytes;
    }

    /**
     * Set the sizeBytes property: The uncompressed size of the tag in bytes (this size is calculated asynchronously so
     * it may not be immediately available).
     * 
     * @param sizeBytes the sizeBytes value to set.
     * @return the RepositoryTag object itself.
     */
    public RepositoryTag setSizeBytes(Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }

    /**
     * Get the updatedAt property: The time the tag was last updated.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the updatedAt property: The time the tag was last updated.
     * 
     * @param updatedAt the updatedAt value to set.
     * @return the RepositoryTag object itself.
     */
    public RepositoryTag setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
