package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OneClicksCreate model. */
@Fluent
public final class OneClicksCreate {
    /*
     * addon_slugs
     *
     * An array of 1-Click Application slugs to be installed to the Kubernetes cluster.
     */
    @JsonProperty(value = "addon_slugs", required = true)
    private List<String> addonSlugs;

    /*
     * cluster_uuid
     *
     * A unique ID for the Kubernetes cluster to which the 1-Click Applications will be installed.
     */
    @JsonProperty(value = "cluster_uuid", required = true)
    private String clusterUuid;

    /**
     * Get the addonSlugs property: addon_slugs
     *
     * <p>An array of 1-Click Application slugs to be installed to the Kubernetes cluster.
     *
     * @return the addonSlugs value.
     */
    public List<String> getAddonSlugs() {
        return this.addonSlugs;
    }

    /**
     * Set the addonSlugs property: addon_slugs
     *
     * <p>An array of 1-Click Application slugs to be installed to the Kubernetes cluster.
     *
     * @param addonSlugs the addonSlugs value to set.
     * @return the OneClicksCreate object itself.
     */
    public OneClicksCreate setAddonSlugs(List<String> addonSlugs) {
        this.addonSlugs = addonSlugs;
        return this;
    }

    /**
     * Get the clusterUuid property: cluster_uuid
     *
     * <p>A unique ID for the Kubernetes cluster to which the 1-Click Applications will be installed.
     *
     * @return the clusterUuid value.
     */
    public String getClusterUuid() {
        return this.clusterUuid;
    }

    /**
     * Set the clusterUuid property: cluster_uuid
     *
     * <p>A unique ID for the Kubernetes cluster to which the 1-Click Applications will be installed.
     *
     * @param clusterUuid the clusterUuid value to set.
     * @return the OneClicksCreate object itself.
     */
    public OneClicksCreate setClusterUuid(String clusterUuid) {
        this.clusterUuid = clusterUuid;
        return this;
    }
}
