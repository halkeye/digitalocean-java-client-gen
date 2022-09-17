package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AssociatedKubernetesResource model. */
@Fluent
public final class AssociatedKubernetesResource {
    /*
     * The ID of a resource associated with a Kubernetes cluster.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of a resource associated with a Kubernetes cluster.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the id property: The ID of a resource associated with a Kubernetes cluster.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The ID of a resource associated with a Kubernetes cluster.
     *
     * @param id the id value to set.
     * @return the AssociatedKubernetesResource object itself.
     */
    public AssociatedKubernetesResource setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of a resource associated with a Kubernetes cluster.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of a resource associated with a Kubernetes cluster.
     *
     * @param name the name value to set.
     * @return the AssociatedKubernetesResource object itself.
     */
    public AssociatedKubernetesResource setName(String name) {
        this.name = name;
        return this;
    }
}
