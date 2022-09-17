package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** The KubernetesNodePool model. */
@Fluent
public final class KubernetesNodePool extends KubernetesNodePoolSize {
    /*
     * A unique ID that can be used to identify and reference a specific node pool.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /*
     * A human-readable name for the node pool.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The number of Droplet instances in the node pool.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * An array containing the tags applied to the node pool. All node pools are automatically tagged `k8s`,
     * `k8s-worker`, and `k8s:$K8S_CLUSTER_ID`.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /*
     * An object containing a set of Kubernetes labels. The keys and are values are both user-defined.
     */
    @JsonProperty(value = "labels")
    private Object labels;

    /*
     * An array of taints to apply to all nodes in a pool. Taints will automatically be applied to all existing nodes
     * and any subsequent nodes added to the pool. When a taint is removed, it is removed from all nodes in the pool.
     */
    @JsonProperty(value = "taints")
    private List<KubernetesNodePoolTaint> taints;

    /*
     * A boolean value indicating whether auto-scaling is enabled for this node pool.
     */
    @JsonProperty(value = "auto_scale")
    private Boolean autoScale;

    /*
     * The minimum number of nodes that this node pool can be auto-scaled to. The value will be `0` if `auto_scale` is
     * set to `false`.
     */
    @JsonProperty(value = "min_nodes")
    private Integer minNodes;

    /*
     * The maximum number of nodes that this node pool can be auto-scaled to. The value will be `0` if `auto_scale` is
     * set to `false`.
     */
    @JsonProperty(value = "max_nodes")
    private Integer maxNodes;

    /*
     * An object specifying the details of a specific worker node in a node pool.
     */
    @JsonProperty(value = "nodes", access = JsonProperty.Access.WRITE_ONLY)
    private List<Node> nodes;

    /**
     * Get the id property: A unique ID that can be used to identify and reference a specific node pool.
     *
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Get the name property: A human-readable name for the node pool.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A human-readable name for the node pool.
     *
     * @param name the name value to set.
     * @return the KubernetesNodePool object itself.
     */
    public KubernetesNodePool setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the count property: The number of Droplet instances in the node pool.
     *
     * @return the count value.
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Set the count property: The number of Droplet instances in the node pool.
     *
     * @param count the count value to set.
     * @return the KubernetesNodePool object itself.
     */
    public KubernetesNodePool setCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the tags property: An array containing the tags applied to the node pool. All node pools are automatically
     * tagged `k8s`, `k8s-worker`, and `k8s:$K8S_CLUSTER_ID`.
     *
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: An array containing the tags applied to the node pool. All node pools are automatically
     * tagged `k8s`, `k8s-worker`, and `k8s:$K8S_CLUSTER_ID`.
     *
     * @param tags the tags value to set.
     * @return the KubernetesNodePool object itself.
     */
    public KubernetesNodePool setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the labels property: An object containing a set of Kubernetes labels. The keys and are values are both
     * user-defined.
     *
     * @return the labels value.
     */
    public Object getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: An object containing a set of Kubernetes labels. The keys and are values are both
     * user-defined.
     *
     * @param labels the labels value to set.
     * @return the KubernetesNodePool object itself.
     */
    public KubernetesNodePool setLabels(Object labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the taints property: An array of taints to apply to all nodes in a pool. Taints will automatically be applied
     * to all existing nodes and any subsequent nodes added to the pool. When a taint is removed, it is removed from all
     * nodes in the pool.
     *
     * @return the taints value.
     */
    public List<KubernetesNodePoolTaint> getTaints() {
        return this.taints;
    }

    /**
     * Set the taints property: An array of taints to apply to all nodes in a pool. Taints will automatically be applied
     * to all existing nodes and any subsequent nodes added to the pool. When a taint is removed, it is removed from all
     * nodes in the pool.
     *
     * @param taints the taints value to set.
     * @return the KubernetesNodePool object itself.
     */
    public KubernetesNodePool setTaints(List<KubernetesNodePoolTaint> taints) {
        this.taints = taints;
        return this;
    }

    /**
     * Get the autoScale property: A boolean value indicating whether auto-scaling is enabled for this node pool.
     *
     * @return the autoScale value.
     */
    public Boolean isAutoScale() {
        return this.autoScale;
    }

    /**
     * Set the autoScale property: A boolean value indicating whether auto-scaling is enabled for this node pool.
     *
     * @param autoScale the autoScale value to set.
     * @return the KubernetesNodePool object itself.
     */
    public KubernetesNodePool setAutoScale(Boolean autoScale) {
        this.autoScale = autoScale;
        return this;
    }

    /**
     * Get the minNodes property: The minimum number of nodes that this node pool can be auto-scaled to. The value will
     * be `0` if `auto_scale` is set to `false`.
     *
     * @return the minNodes value.
     */
    public Integer getMinNodes() {
        return this.minNodes;
    }

    /**
     * Set the minNodes property: The minimum number of nodes that this node pool can be auto-scaled to. The value will
     * be `0` if `auto_scale` is set to `false`.
     *
     * @param minNodes the minNodes value to set.
     * @return the KubernetesNodePool object itself.
     */
    public KubernetesNodePool setMinNodes(Integer minNodes) {
        this.minNodes = minNodes;
        return this;
    }

    /**
     * Get the maxNodes property: The maximum number of nodes that this node pool can be auto-scaled to. The value will
     * be `0` if `auto_scale` is set to `false`.
     *
     * @return the maxNodes value.
     */
    public Integer getMaxNodes() {
        return this.maxNodes;
    }

    /**
     * Set the maxNodes property: The maximum number of nodes that this node pool can be auto-scaled to. The value will
     * be `0` if `auto_scale` is set to `false`.
     *
     * @param maxNodes the maxNodes value to set.
     * @return the KubernetesNodePool object itself.
     */
    public KubernetesNodePool setMaxNodes(Integer maxNodes) {
        this.maxNodes = maxNodes;
        return this;
    }

    /**
     * Get the nodes property: An object specifying the details of a specific worker node in a node pool.
     *
     * @return the nodes value.
     */
    public List<Node> getNodes() {
        return this.nodes;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesNodePool setSize(String size) {
        super.setSize(size);
        return this;
    }
}
