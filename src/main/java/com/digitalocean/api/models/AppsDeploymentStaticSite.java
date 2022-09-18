package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The AppsDeploymentStaticSite model.
 */
@Fluent
public final class AppsDeploymentStaticSite {
    /*
     * The name of this static site
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The commit hash of the repository that was used to build this static site
     */
    @JsonProperty(value = "source_commit_hash")
    private String sourceCommitHash;

    /**
     * Get the name property: The name of this static site.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of this static site.
     * 
     * @param name the name value to set.
     * @return the AppsDeploymentStaticSite object itself.
     */
    public AppsDeploymentStaticSite setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the sourceCommitHash property: The commit hash of the repository that was used to build this static site.
     * 
     * @return the sourceCommitHash value.
     */
    public String getSourceCommitHash() {
        return this.sourceCommitHash;
    }

    /**
     * Set the sourceCommitHash property: The commit hash of the repository that was used to build this static site.
     * 
     * @param sourceCommitHash the sourceCommitHash value to set.
     * @return the AppsDeploymentStaticSite object itself.
     */
    public AppsDeploymentStaticSite setSourceCommitHash(String sourceCommitHash) {
        this.sourceCommitHash = sourceCommitHash;
        return this;
    }
}
