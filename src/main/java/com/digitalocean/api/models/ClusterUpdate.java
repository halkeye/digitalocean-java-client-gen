package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ClusterUpdate model. */
@Fluent
public final class ClusterUpdate {
    /*
     * A human-readable name for a Kubernetes cluster.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * An array of tags applied to the Kubernetes cluster. All clusters are automatically tagged `k8s` and
     * `k8s:$K8S_CLUSTER_ID`.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /*
     * An object specifying the maintenance window policy for the Kubernetes cluster.
     */
    @JsonProperty(value = "maintenance_policy")
    private MaintenancePolicy maintenancePolicy;

    /*
     * A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its
     * maintenance window.
     */
    @JsonProperty(value = "auto_upgrade")
    private Boolean autoUpgrade;

    /*
     * A boolean value indicating whether surge upgrade is enabled/disabled for the cluster. Surge upgrade makes
     * cluster upgrades fast and reliable by bringing up new nodes before destroying the outdated nodes.
     */
    @JsonProperty(value = "surge_upgrade")
    private Boolean surgeUpgrade;

    /**
     * Get the name property: A human-readable name for a Kubernetes cluster.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A human-readable name for a Kubernetes cluster.
     *
     * @param name the name value to set.
     * @return the ClusterUpdate object itself.
     */
    public ClusterUpdate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tags property: An array of tags applied to the Kubernetes cluster. All clusters are automatically tagged
     * `k8s` and `k8s:$K8S_CLUSTER_ID`.
     *
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: An array of tags applied to the Kubernetes cluster. All clusters are automatically tagged
     * `k8s` and `k8s:$K8S_CLUSTER_ID`.
     *
     * @param tags the tags value to set.
     * @return the ClusterUpdate object itself.
     */
    public ClusterUpdate setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the maintenancePolicy property: An object specifying the maintenance window policy for the Kubernetes
     * cluster.
     *
     * @return the maintenancePolicy value.
     */
    public MaintenancePolicy getMaintenancePolicy() {
        return this.maintenancePolicy;
    }

    /**
     * Set the maintenancePolicy property: An object specifying the maintenance window policy for the Kubernetes
     * cluster.
     *
     * @param maintenancePolicy the maintenancePolicy value to set.
     * @return the ClusterUpdate object itself.
     */
    public ClusterUpdate setMaintenancePolicy(MaintenancePolicy maintenancePolicy) {
        this.maintenancePolicy = maintenancePolicy;
        return this;
    }

    /**
     * Get the autoUpgrade property: A boolean value indicating whether the cluster will be automatically upgraded to
     * new patch releases during its maintenance window.
     *
     * @return the autoUpgrade value.
     */
    public Boolean isAutoUpgrade() {
        return this.autoUpgrade;
    }

    /**
     * Set the autoUpgrade property: A boolean value indicating whether the cluster will be automatically upgraded to
     * new patch releases during its maintenance window.
     *
     * @param autoUpgrade the autoUpgrade value to set.
     * @return the ClusterUpdate object itself.
     */
    public ClusterUpdate setAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
        return this;
    }

    /**
     * Get the surgeUpgrade property: A boolean value indicating whether surge upgrade is enabled/disabled for the
     * cluster. Surge upgrade makes cluster upgrades fast and reliable by bringing up new nodes before destroying the
     * outdated nodes.
     *
     * @return the surgeUpgrade value.
     */
    public Boolean isSurgeUpgrade() {
        return this.surgeUpgrade;
    }

    /**
     * Set the surgeUpgrade property: A boolean value indicating whether surge upgrade is enabled/disabled for the
     * cluster. Surge upgrade makes cluster upgrades fast and reliable by bringing up new nodes before destroying the
     * outdated nodes.
     *
     * @param surgeUpgrade the surgeUpgrade value to set.
     * @return the ClusterUpdate object itself.
     */
    public ClusterUpdate setSurgeUpgrade(Boolean surgeUpgrade) {
        this.surgeUpgrade = surgeUpgrade;
        return this;
    }
}
