package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The AppsDeploymentFunctions model.
 */
@Fluent
public final class AppsDeploymentFunctions {
    /*
     * The name of this functions component
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The commit hash of the repository that was used to build this functions component.
     */
    @JsonProperty(value = "source_commit_hash")
    private String sourceCommitHash;

    /*
     * The namespace where the functions are deployed.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /**
     * Get the name property: The name of this functions component.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of this functions component.
     * 
     * @param name the name value to set.
     * @return the AppsDeploymentFunctions object itself.
     */
    public AppsDeploymentFunctions setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the sourceCommitHash property: The commit hash of the repository that was used to build this functions
     * component.
     * 
     * @return the sourceCommitHash value.
     */
    public String getSourceCommitHash() {
        return this.sourceCommitHash;
    }

    /**
     * Set the sourceCommitHash property: The commit hash of the repository that was used to build this functions
     * component.
     * 
     * @param sourceCommitHash the sourceCommitHash value to set.
     * @return the AppsDeploymentFunctions object itself.
     */
    public AppsDeploymentFunctions setSourceCommitHash(String sourceCommitHash) {
        this.sourceCommitHash = sourceCommitHash;
        return this;
    }

    /**
     * Get the namespace property: The namespace where the functions are deployed.
     * 
     * @return the namespace value.
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: The namespace where the functions are deployed.
     * 
     * @param namespace the namespace value to set.
     * @return the AppsDeploymentFunctions object itself.
     */
    public AppsDeploymentFunctions setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
}
