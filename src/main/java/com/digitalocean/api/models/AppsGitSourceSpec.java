package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The AppsGitSourceSpec model.
 */
@Fluent
public final class AppsGitSourceSpec {
    /*
     * The name of the branch to use
     */
    @JsonProperty(value = "branch")
    private String branch;

    /*
     * The clone URL of the repo. Example: `https://github.com/digitalocean/sample-golang.git`
     */
    @JsonProperty(value = "repo_clone_url")
    private String repoCloneUrl;

    /**
     * Get the branch property: The name of the branch to use.
     * 
     * @return the branch value.
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * Set the branch property: The name of the branch to use.
     * 
     * @param branch the branch value to set.
     * @return the AppsGitSourceSpec object itself.
     */
    public AppsGitSourceSpec setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the repoCloneUrl property: The clone URL of the repo. Example:
     * `https://github.com/digitalocean/sample-golang.git`.
     * 
     * @return the repoCloneUrl value.
     */
    public String getRepoCloneUrl() {
        return this.repoCloneUrl;
    }

    /**
     * Set the repoCloneUrl property: The clone URL of the repo. Example:
     * `https://github.com/digitalocean/sample-golang.git`.
     * 
     * @param repoCloneUrl the repoCloneUrl value to set.
     * @return the AppsGitSourceSpec object itself.
     */
    public AppsGitSourceSpec setRepoCloneUrl(String repoCloneUrl) {
        this.repoCloneUrl = repoCloneUrl;
        return this;
    }
}
