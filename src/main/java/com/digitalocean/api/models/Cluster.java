package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** The Cluster model. */
@Fluent
public final class Cluster {
    /*
     * A unique ID that can be used to identify and reference a Kubernetes cluster.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /*
     * A human-readable name for a Kubernetes cluster.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The slug identifier for the region where the Kubernetes cluster is located.
     */
    @JsonProperty(value = "region", required = true)
    private String region;

    /*
     * The slug identifier for the version of Kubernetes used for the cluster. If set to a minor version (e.g. "1.14"),
     * the latest version within it will be used (e.g. "1.14.6-do.1"); if set to "latest", the latest published version
     * will be used. See the `/v2/kubernetes/options` endpoint to find all currently available versions.
     */
    @JsonProperty(value = "version", required = true)
    private String version;

    /*
     * The range of IP addresses in the overlay network of the Kubernetes cluster in CIDR notation.
     */
    @JsonProperty(value = "cluster_subnet", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterSubnet;

    /*
     * The range of assignable IP addresses for services running in the Kubernetes cluster in CIDR notation.
     */
    @JsonProperty(value = "service_subnet", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceSubnet;

    /*
     * A string specifying the UUID of the VPC to which the Kubernetes cluster is assigned.
     */
    @JsonProperty(value = "vpc_uuid")
    private UUID vpcUuid;

    /*
     * The public IPv4 address of the Kubernetes master node. This will not be set if high availability is configured
     * on the cluster (v1.21+)
     */
    @JsonProperty(value = "ipv4", access = JsonProperty.Access.WRITE_ONLY)
    private String ipv4;

    /*
     * The base URL of the API server on the Kubernetes master node.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /*
     * An array of tags applied to the Kubernetes cluster. All clusters are automatically tagged `k8s` and
     * `k8s:$K8S_CLUSTER_ID`.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /*
     * An object specifying the details of the worker nodes available to the Kubernetes cluster.
     */
    @JsonProperty(value = "node_pools", required = true)
    private List<KubernetesNodePool> nodePools;

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
     * An object containing a `state` attribute whose value is set to a string indicating the current status of the
     * cluster.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ClusterStatus status;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the Kubernetes cluster was
     * created.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the Kubernetes cluster was last
     * updated.
     */
    @JsonProperty(value = "updated_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * A boolean value indicating whether surge upgrade is enabled/disabled for the cluster. Surge upgrade makes
     * cluster upgrades fast and reliable by bringing up new nodes before destroying the outdated nodes.
     */
    @JsonProperty(value = "surge_upgrade")
    private Boolean surgeUpgrade;

    /*
     * A boolean value indicating whether the control plane is run in a highly available configuration in the cluster.
     * Highly available control planes incur less downtime.
     */
    @JsonProperty(value = "ha")
    private Boolean ha;

    /*
     * A read-only boolean value indicating if a container registry is integrated with the cluster.
     */
    @JsonProperty(value = "registry_enabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean registryEnabled;

    /**
     * Get the id property: A unique ID that can be used to identify and reference a Kubernetes cluster.
     *
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
    }

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
     * @return the Cluster object itself.
     */
    public Cluster setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the region property: The slug identifier for the region where the Kubernetes cluster is located.
     *
     * @return the region value.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The slug identifier for the region where the Kubernetes cluster is located.
     *
     * @param region the region value to set.
     * @return the Cluster object itself.
     */
    public Cluster setRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the version property: The slug identifier for the version of Kubernetes used for the cluster. If set to a
     * minor version (e.g. "1.14"), the latest version within it will be used (e.g. "1.14.6-do.1"); if set to "latest",
     * the latest published version will be used. See the `/v2/kubernetes/options` endpoint to find all currently
     * available versions.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The slug identifier for the version of Kubernetes used for the cluster. If set to a
     * minor version (e.g. "1.14"), the latest version within it will be used (e.g. "1.14.6-do.1"); if set to "latest",
     * the latest published version will be used. See the `/v2/kubernetes/options` endpoint to find all currently
     * available versions.
     *
     * @param version the version value to set.
     * @return the Cluster object itself.
     */
    public Cluster setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the clusterSubnet property: The range of IP addresses in the overlay network of the Kubernetes cluster in
     * CIDR notation.
     *
     * @return the clusterSubnet value.
     */
    public String getClusterSubnet() {
        return this.clusterSubnet;
    }

    /**
     * Get the serviceSubnet property: The range of assignable IP addresses for services running in the Kubernetes
     * cluster in CIDR notation.
     *
     * @return the serviceSubnet value.
     */
    public String getServiceSubnet() {
        return this.serviceSubnet;
    }

    /**
     * Get the vpcUuid property: A string specifying the UUID of the VPC to which the Kubernetes cluster is assigned.
     *
     * @return the vpcUuid value.
     */
    public UUID getVpcUuid() {
        return this.vpcUuid;
    }

    /**
     * Set the vpcUuid property: A string specifying the UUID of the VPC to which the Kubernetes cluster is assigned.
     *
     * @param vpcUuid the vpcUuid value to set.
     * @return the Cluster object itself.
     */
    public Cluster setVpcUuid(UUID vpcUuid) {
        this.vpcUuid = vpcUuid;
        return this;
    }

    /**
     * Get the ipv4 property: The public IPv4 address of the Kubernetes master node. This will not be set if high
     * availability is configured on the cluster (v1.21+).
     *
     * @return the ipv4 value.
     */
    public String getIpv4() {
        return this.ipv4;
    }

    /**
     * Get the endpoint property: The base URL of the API server on the Kubernetes master node.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
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
     * @return the Cluster object itself.
     */
    public Cluster setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the nodePools property: An object specifying the details of the worker nodes available to the Kubernetes
     * cluster.
     *
     * @return the nodePools value.
     */
    public List<KubernetesNodePool> getNodePools() {
        return this.nodePools;
    }

    /**
     * Set the nodePools property: An object specifying the details of the worker nodes available to the Kubernetes
     * cluster.
     *
     * @param nodePools the nodePools value to set.
     * @return the Cluster object itself.
     */
    public Cluster setNodePools(List<KubernetesNodePool> nodePools) {
        this.nodePools = nodePools;
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
     * @return the Cluster object itself.
     */
    public Cluster setMaintenancePolicy(MaintenancePolicy maintenancePolicy) {
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
     * @return the Cluster object itself.
     */
    public Cluster setAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
        return this;
    }

    /**
     * Get the status property: An object containing a `state` attribute whose value is set to a string indicating the
     * current status of the cluster.
     *
     * @return the status value.
     */
    public ClusterStatus getStatus() {
        return this.status;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * Kubernetes cluster was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: A time value given in ISO8601 combined date and time format that represents when the
     * Kubernetes cluster was last updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
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
     * @return the Cluster object itself.
     */
    public Cluster setSurgeUpgrade(Boolean surgeUpgrade) {
        this.surgeUpgrade = surgeUpgrade;
        return this;
    }

    /**
     * Get the ha property: A boolean value indicating whether the control plane is run in a highly available
     * configuration in the cluster. Highly available control planes incur less downtime.
     *
     * @return the ha value.
     */
    public Boolean isHa() {
        return this.ha;
    }

    /**
     * Set the ha property: A boolean value indicating whether the control plane is run in a highly available
     * configuration in the cluster. Highly available control planes incur less downtime.
     *
     * @param ha the ha value to set.
     * @return the Cluster object itself.
     */
    public Cluster setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }

    /**
     * Get the registryEnabled property: A read-only boolean value indicating if a container registry is integrated with
     * the cluster.
     *
     * @return the registryEnabled value.
     */
    public Boolean isRegistryEnabled() {
        return this.registryEnabled;
    }
}
