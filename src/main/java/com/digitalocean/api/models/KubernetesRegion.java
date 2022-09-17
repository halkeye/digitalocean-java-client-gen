package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KubernetesRegion model. */
@Fluent
public final class KubernetesRegion {
    /*
     * A DigitalOcean region where Kubernetes is available.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The identifier for a region for use when creating a new cluster.
     */
    @JsonProperty(value = "slug")
    private String slug;

    /**
     * Get the name property: A DigitalOcean region where Kubernetes is available.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A DigitalOcean region where Kubernetes is available.
     *
     * @param name the name value to set.
     * @return the KubernetesRegion object itself.
     */
    public KubernetesRegion setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the slug property: The identifier for a region for use when creating a new cluster.
     *
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: The identifier for a region for use when creating a new cluster.
     *
     * @param slug the slug value to set.
     * @return the KubernetesRegion object itself.
     */
    public KubernetesRegion setSlug(String slug) {
        this.slug = slug;
        return this;
    }
}
