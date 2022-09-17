package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema {
    /*
     * The slug identifier for the version of Kubernetes that the cluster will be upgraded to.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the version property: The slug identifier for the version of Kubernetes that the cluster will be upgraded to.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The slug identifier for the version of Kubernetes that the cluster will be upgraded to.
     *
     * @param version the version value to set.
     * @return the Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema object
     *     itself.
     */
    public Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema setVersion(
            String version) {
        this.version = version;
        return this;
    }
}
