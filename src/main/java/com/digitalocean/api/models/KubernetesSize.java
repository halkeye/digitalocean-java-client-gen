package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KubernetesSize model. */
@Fluent
public final class KubernetesSize {
    /*
     * A Droplet size available for use in a Kubernetes node pool.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The identifier for a size for use when creating a new cluster.
     */
    @JsonProperty(value = "slug")
    private String slug;

    /**
     * Get the name property: A Droplet size available for use in a Kubernetes node pool.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A Droplet size available for use in a Kubernetes node pool.
     *
     * @param name the name value to set.
     * @return the KubernetesSize object itself.
     */
    public KubernetesSize setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the slug property: The identifier for a size for use when creating a new cluster.
     *
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: The identifier for a size for use when creating a new cluster.
     *
     * @param slug the slug value to set.
     * @return the KubernetesSize object itself.
     */
    public KubernetesSize setSlug(String slug) {
        this.slug = slug;
        return this;
    }
}
