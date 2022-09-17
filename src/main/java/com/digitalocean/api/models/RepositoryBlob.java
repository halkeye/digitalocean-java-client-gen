package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RepositoryBlob model. */
@Fluent
public final class RepositoryBlob {
    /*
     * The digest of the blob
     */
    @JsonProperty(value = "digest")
    private String digest;

    /*
     * The compressed size of the blob in bytes.
     */
    @JsonProperty(value = "compressed_size_bytes")
    private Integer compressedSizeBytes;

    /**
     * Get the digest property: The digest of the blob.
     *
     * @return the digest value.
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * Set the digest property: The digest of the blob.
     *
     * @param digest the digest value to set.
     * @return the RepositoryBlob object itself.
     */
    public RepositoryBlob setDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * Get the compressedSizeBytes property: The compressed size of the blob in bytes.
     *
     * @return the compressedSizeBytes value.
     */
    public Integer getCompressedSizeBytes() {
        return this.compressedSizeBytes;
    }

    /**
     * Set the compressedSizeBytes property: The compressed size of the blob in bytes.
     *
     * @param compressedSizeBytes the compressedSizeBytes value to set.
     * @return the RepositoryBlob object itself.
     */
    public RepositoryBlob setCompressedSizeBytes(Integer compressedSizeBytes) {
        this.compressedSizeBytes = compressedSizeBytes;
        return this;
    }
}
