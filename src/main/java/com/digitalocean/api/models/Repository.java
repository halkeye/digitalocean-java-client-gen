package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Repository model. */
@Fluent
public final class Repository {
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
     * The latest_tag property.
     */
    @JsonProperty(value = "latest_tag")
    private RepositoryTag latestTag;

    /*
     * The number of tags in the repository.
     */
    @JsonProperty(value = "tag_count")
    private Integer tagCount;

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
     * @return the Repository object itself.
     */
    public Repository setRegistryName(String registryName) {
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
     * @return the Repository object itself.
     */
    public Repository setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the latestTag property: The latest_tag property.
     *
     * @return the latestTag value.
     */
    public RepositoryTag getLatestTag() {
        return this.latestTag;
    }

    /**
     * Set the latestTag property: The latest_tag property.
     *
     * @param latestTag the latestTag value to set.
     * @return the Repository object itself.
     */
    public Repository setLatestTag(RepositoryTag latestTag) {
        this.latestTag = latestTag;
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
     * @return the Repository object itself.
     */
    public Repository setTagCount(Integer tagCount) {
        this.tagCount = tagCount;
        return this;
    }
}
