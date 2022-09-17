package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppsImageSourceSpec model. */
@Fluent
public final class AppsImageSourceSpec {
    /*
     * The registry name. Must be left empty for the `DOCR` registry type.
     */
    @JsonProperty(value = "registry")
    private String registry;

    /*
     * - DOCKER_HUB: The DockerHub container registry type.
     * - DOCR: The DigitalOcean container registry type.
     */
    @JsonProperty(value = "registry_type")
    private AppsImageSourceSpecRegistryType registryType;

    /*
     * The repository name.
     */
    @JsonProperty(value = "repository")
    private String repository;

    /*
     * The repository tag. Defaults to `latest` if not provided.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /**
     * Get the registry property: The registry name. Must be left empty for the `DOCR` registry type.
     *
     * @return the registry value.
     */
    public String getRegistry() {
        return this.registry;
    }

    /**
     * Set the registry property: The registry name. Must be left empty for the `DOCR` registry type.
     *
     * @param registry the registry value to set.
     * @return the AppsImageSourceSpec object itself.
     */
    public AppsImageSourceSpec setRegistry(String registry) {
        this.registry = registry;
        return this;
    }

    /**
     * Get the registryType property: - DOCKER_HUB: The DockerHub container registry type. - DOCR: The DigitalOcean
     * container registry type.
     *
     * @return the registryType value.
     */
    public AppsImageSourceSpecRegistryType getRegistryType() {
        return this.registryType;
    }

    /**
     * Set the registryType property: - DOCKER_HUB: The DockerHub container registry type. - DOCR: The DigitalOcean
     * container registry type.
     *
     * @param registryType the registryType value to set.
     * @return the AppsImageSourceSpec object itself.
     */
    public AppsImageSourceSpec setRegistryType(AppsImageSourceSpecRegistryType registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * Get the repository property: The repository name.
     *
     * @return the repository value.
     */
    public String getRepository() {
        return this.repository;
    }

    /**
     * Set the repository property: The repository name.
     *
     * @param repository the repository value to set.
     * @return the AppsImageSourceSpec object itself.
     */
    public AppsImageSourceSpec setRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get the tag property: The repository tag. Defaults to `latest` if not provided.
     *
     * @return the tag value.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: The repository tag. Defaults to `latest` if not provided.
     *
     * @param tag the tag value to set.
     * @return the AppsImageSourceSpec object itself.
     */
    public AppsImageSourceSpec setTag(String tag) {
        this.tag = tag;
        return this;
    }
}
