package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The User model.
 */
@Fluent
public final class User {
    /*
     * The kubernetes_cluster_user property.
     */
    @JsonProperty(value = "kubernetes_cluster_user")
    private UserKubernetesClusterUser kubernetesClusterUser;

    /**
     * Get the kubernetesClusterUser property: The kubernetes_cluster_user property.
     * 
     * @return the kubernetesClusterUser value.
     */
    public UserKubernetesClusterUser getKubernetesClusterUser() {
        return this.kubernetesClusterUser;
    }

    /**
     * Set the kubernetesClusterUser property: The kubernetes_cluster_user property.
     * 
     * @param kubernetesClusterUser the kubernetesClusterUser value to set.
     * @return the User object itself.
     */
    public User setKubernetesClusterUser(UserKubernetesClusterUser kubernetesClusterUser) {
        this.kubernetesClusterUser = kubernetesClusterUser;
        return this;
    }
}
