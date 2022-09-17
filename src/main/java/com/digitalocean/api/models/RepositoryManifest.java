package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The RepositoryManifest model. */
@Fluent
public final class RepositoryManifest {
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
     * The manifest digest
     */
    @JsonProperty(value = "digest")
    private String digest;

    /*
     * The compressed size of the manifest in bytes.
     */
    @JsonProperty(value = "compressed_size_bytes")
    private Integer compressedSizeBytes;

    /*
     * The uncompressed size of the manifest in bytes (this size is calculated asynchronously so it may not be
     * immediately available).
     */
    @JsonProperty(value = "size_bytes")
    private Integer sizeBytes;

    /*
     * The time the manifest was last updated.
     */
    @JsonProperty(value = "updated_at")
    private OffsetDateTime updatedAt;

    /*
     * All tags associated with this manifest
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /*
     * All blobs associated with this manifest
     */
    @JsonProperty(value = "blobs")
    private List<RepositoryBlob> blobs;

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
     * @return the RepositoryManifest object itself.
     */
    public RepositoryManifest setRegistryName(String registryName) {
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
     * @return the RepositoryManifest object itself.
     */
    public RepositoryManifest setRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get the digest property: The manifest digest.
     *
     * @return the digest value.
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * Set the digest property: The manifest digest.
     *
     * @param digest the digest value to set.
     * @return the RepositoryManifest object itself.
     */
    public RepositoryManifest setDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * Get the compressedSizeBytes property: The compressed size of the manifest in bytes.
     *
     * @return the compressedSizeBytes value.
     */
    public Integer getCompressedSizeBytes() {
        return this.compressedSizeBytes;
    }

    /**
     * Set the compressedSizeBytes property: The compressed size of the manifest in bytes.
     *
     * @param compressedSizeBytes the compressedSizeBytes value to set.
     * @return the RepositoryManifest object itself.
     */
    public RepositoryManifest setCompressedSizeBytes(Integer compressedSizeBytes) {
        this.compressedSizeBytes = compressedSizeBytes;
        return this;
    }

    /**
     * Get the sizeBytes property: The uncompressed size of the manifest in bytes (this size is calculated
     * asynchronously so it may not be immediately available).
     *
     * @return the sizeBytes value.
     */
    public Integer getSizeBytes() {
        return this.sizeBytes;
    }

    /**
     * Set the sizeBytes property: The uncompressed size of the manifest in bytes (this size is calculated
     * asynchronously so it may not be immediately available).
     *
     * @param sizeBytes the sizeBytes value to set.
     * @return the RepositoryManifest object itself.
     */
    public RepositoryManifest setSizeBytes(Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }

    /**
     * Get the updatedAt property: The time the manifest was last updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the updatedAt property: The time the manifest was last updated.
     *
     * @param updatedAt the updatedAt value to set.
     * @return the RepositoryManifest object itself.
     */
    public RepositoryManifest setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get the tags property: All tags associated with this manifest.
     *
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: All tags associated with this manifest.
     *
     * @param tags the tags value to set.
     * @return the RepositoryManifest object itself.
     */
    public RepositoryManifest setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the blobs property: All blobs associated with this manifest.
     *
     * @return the blobs value.
     */
    public List<RepositoryBlob> getBlobs() {
        return this.blobs;
    }

    /**
     * Set the blobs property: All blobs associated with this manifest.
     *
     * @param blobs the blobs value to set.
     * @return the RepositoryManifest object itself.
     */
    public RepositoryManifest setBlobs(List<RepositoryBlob> blobs) {
        this.blobs = blobs;
        return this;
    }
}
