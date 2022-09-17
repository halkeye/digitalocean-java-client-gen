package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The KubernetesVersion model. */
@Fluent
public final class KubernetesVersion {
    /*
     * The slug identifier for an available version of Kubernetes for use when creating or updating a cluster. The
     * string contains both the upstream version of Kubernetes as well as the DigitalOcean revision.
     */
    @JsonProperty(value = "slug")
    private String slug;

    /*
     * The upstream version string for the version of Kubernetes provided by a given slug.
     */
    @JsonProperty(value = "kubernetes_version")
    private String kubernetesVersion;

    /*
     * The features available with the version of Kubernetes provided by a given slug.
     */
    @JsonProperty(value = "supported_features")
    private List<String> supportedFeatures;

    /**
     * Get the slug property: The slug identifier for an available version of Kubernetes for use when creating or
     * updating a cluster. The string contains both the upstream version of Kubernetes as well as the DigitalOcean
     * revision.
     *
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: The slug identifier for an available version of Kubernetes for use when creating or
     * updating a cluster. The string contains both the upstream version of Kubernetes as well as the DigitalOcean
     * revision.
     *
     * @param slug the slug value to set.
     * @return the KubernetesVersion object itself.
     */
    public KubernetesVersion setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get the kubernetesVersion property: The upstream version string for the version of Kubernetes provided by a given
     * slug.
     *
     * @return the kubernetesVersion value.
     */
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Set the kubernetesVersion property: The upstream version string for the version of Kubernetes provided by a given
     * slug.
     *
     * @param kubernetesVersion the kubernetesVersion value to set.
     * @return the KubernetesVersion object itself.
     */
    public KubernetesVersion setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }

    /**
     * Get the supportedFeatures property: The features available with the version of Kubernetes provided by a given
     * slug.
     *
     * @return the supportedFeatures value.
     */
    public List<String> getSupportedFeatures() {
        return this.supportedFeatures;
    }

    /**
     * Set the supportedFeatures property: The features available with the version of Kubernetes provided by a given
     * slug.
     *
     * @param supportedFeatures the supportedFeatures value to set.
     * @return the KubernetesVersion object itself.
     */
    public KubernetesVersion setSupportedFeatures(List<String> supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
        return this;
    }
}
