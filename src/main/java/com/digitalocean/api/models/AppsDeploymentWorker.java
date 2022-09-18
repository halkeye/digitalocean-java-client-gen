package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The AppsDeploymentWorker model.
 */
@Fluent
public final class AppsDeploymentWorker {
    /*
     * The name of this worker
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The commit hash of the repository that was used to build this worker
     */
    @JsonProperty(value = "source_commit_hash")
    private String sourceCommitHash;

    /**
     * Get the name property: The name of this worker.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of this worker.
     * 
     * @param name the name value to set.
     * @return the AppsDeploymentWorker object itself.
     */
    public AppsDeploymentWorker setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the sourceCommitHash property: The commit hash of the repository that was used to build this worker.
     * 
     * @return the sourceCommitHash value.
     */
    public String getSourceCommitHash() {
        return this.sourceCommitHash;
    }

    /**
     * Set the sourceCommitHash property: The commit hash of the repository that was used to build this worker.
     * 
     * @param sourceCommitHash the sourceCommitHash value to set.
     * @return the AppsDeploymentWorker object itself.
     */
    public AppsDeploymentWorker setSourceCommitHash(String sourceCommitHash) {
        this.sourceCommitHash = sourceCommitHash;
        return this;
    }
}
