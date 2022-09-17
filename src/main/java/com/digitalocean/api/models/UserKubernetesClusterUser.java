package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The UserKubernetesClusterUser model. */
@Fluent
public final class UserKubernetesClusterUser {
    /*
     * The username for the cluster admin user.
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * A list of in-cluster groups that the user belongs to.
     */
    @JsonProperty(value = "groups")
    private List<String> groups;

    /**
     * Get the username property: The username for the cluster admin user.
     *
     * @return the username value.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Set the username property: The username for the cluster admin user.
     *
     * @param username the username value to set.
     * @return the UserKubernetesClusterUser object itself.
     */
    public UserKubernetesClusterUser setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the groups property: A list of in-cluster groups that the user belongs to.
     *
     * @return the groups value.
     */
    public List<String> getGroups() {
        return this.groups;
    }

    /**
     * Set the groups property: A list of in-cluster groups that the user belongs to.
     *
     * @param groups the groups value to set.
     * @return the UserKubernetesClusterUser object itself.
     */
    public UserKubernetesClusterUser setGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }
}
