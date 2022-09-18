package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The RepositoryV2 model.
 */
@Fluent
public final class RepositoryV2 {
    /*
     * The name of the container registry.
     */
    @JsonProperty(value = "registry_name")
    private String registryName;

    /*
     * The name of the repository.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The latest_manifest property.
     */
    @JsonProperty(value = "latest_manifest")
    private RepositoryManifest latestManifest;

    /*
     * The number of tags in the repository.
     */
    @JsonProperty(value = "tag_count")
    private Integer tagCount;

    /*
     * The number of manifests in the repository.
     */
    @JsonProperty(value = "manifest_count")
    private Integer manifestCount;

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
     * @return the RepositoryV2 object itself.
     */
    public RepositoryV2 setRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * Get the name property: The name of the repository.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the repository.
     * 
     * @param name the name value to set.
     * @return the RepositoryV2 object itself.
     */
    public RepositoryV2 setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the latestManifest property: The latest_manifest property.
     * 
     * @return the latestManifest value.
     */
    public RepositoryManifest getLatestManifest() {
        return this.latestManifest;
    }

    /**
     * Set the latestManifest property: The latest_manifest property.
     * 
     * @param latestManifest the latestManifest value to set.
     * @return the RepositoryV2 object itself.
     */
    public RepositoryV2 setLatestManifest(RepositoryManifest latestManifest) {
        this.latestManifest = latestManifest;
        return this;
    }

    /**
     * Get the tagCount property: The number of tags in the repository.
     * 
     * @return the tagCount value.
     */
    public Integer getTagCount() {
        return this.tagCount;
    }

    /**
     * Set the tagCount property: The number of tags in the repository.
     * 
     * @param tagCount the tagCount value to set.
     * @return the RepositoryV2 object itself.
     */
    public RepositoryV2 setTagCount(Integer tagCount) {
        this.tagCount = tagCount;
        return this;
    }

    /**
     * Get the manifestCount property: The number of manifests in the repository.
     * 
     * @return the manifestCount value.
     */
    public Integer getManifestCount() {
        return this.manifestCount;
    }

    /**
     * Set the manifestCount property: The number of manifests in the repository.
     * 
     * @param manifestCount the manifestCount value to set.
     * @return the RepositoryV2 object itself.
     */
    public RepositoryV2 setManifestCount(Integer manifestCount) {
        this.manifestCount = manifestCount;
        return this;
    }
}
