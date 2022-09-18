package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The KubernetesOptionsOptions model.
 */
@Fluent
public final class KubernetesOptionsOptions {
    /*
     * The regions property.
     */
    @JsonProperty(value = "regions")
    private List<KubernetesRegion> regions;

    /*
     * The versions property.
     */
    @JsonProperty(value = "versions")
    private List<KubernetesVersion> versions;

    /*
     * The sizes property.
     */
    @JsonProperty(value = "sizes")
    private List<KubernetesSize> sizes;

    /**
     * Get the regions property: The regions property.
     * 
     * @return the regions value.
     */
    public List<KubernetesRegion> getRegions() {
        return this.regions;
    }

    /**
     * Set the regions property: The regions property.
     * 
     * @param regions the regions value to set.
     * @return the KubernetesOptionsOptions object itself.
     */
    public KubernetesOptionsOptions setRegions(List<KubernetesRegion> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Get the versions property: The versions property.
     * 
     * @return the versions value.
     */
    public List<KubernetesVersion> getVersions() {
        return this.versions;
    }

    /**
     * Set the versions property: The versions property.
     * 
     * @param versions the versions value to set.
     * @return the KubernetesOptionsOptions object itself.
     */
    public KubernetesOptionsOptions setVersions(List<KubernetesVersion> versions) {
        this.versions = versions;
        return this;
    }

    /**
     * Get the sizes property: The sizes property.
     * 
     * @return the sizes value.
     */
    public List<KubernetesSize> getSizes() {
        return this.sizes;
    }

    /**
     * Set the sizes property: The sizes property.
     * 
     * @param sizes the sizes value to set.
     * @return the KubernetesOptionsOptions object itself.
     */
    public KubernetesOptionsOptions setSizes(List<KubernetesSize> sizes) {
        this.sizes = sizes;
        return this;
    }
}
