package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppsGitlabSourceSpec model. */
@Fluent
public final class AppsGitlabSourceSpec {
    /*
     * The name of the branch to use
     */
    @JsonProperty(value = "branch")
    private String branch;

    /*
     * Whether to automatically deploy new commits made to the repo
     */
    @JsonProperty(value = "deploy_on_push")
    private Boolean deployOnPush;

    /*
     * The name of the repo in the format owner/repo. Example: `digitalocean/sample-golang`
     */
    @JsonProperty(value = "repo")
    private String repo;

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
     * @return the AppsGitlabSourceSpec object itself.
     */
    public AppsGitlabSourceSpec setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the deployOnPush property: Whether to automatically deploy new commits made to the repo.
     *
     * @return the deployOnPush value.
     */
    public Boolean isDeployOnPush() {
        return this.deployOnPush;
    }

    /**
     * Set the deployOnPush property: Whether to automatically deploy new commits made to the repo.
     *
     * @param deployOnPush the deployOnPush value to set.
     * @return the AppsGitlabSourceSpec object itself.
     */
    public AppsGitlabSourceSpec setDeployOnPush(Boolean deployOnPush) {
        this.deployOnPush = deployOnPush;
        return this;
    }

    /**
     * Get the repo property: The name of the repo in the format owner/repo. Example: `digitalocean/sample-golang`.
     *
     * @return the repo value.
     */
    public String getRepo() {
        return this.repo;
    }

    /**
     * Set the repo property: The name of the repo in the format owner/repo. Example: `digitalocean/sample-golang`.
     *
     * @param repo the repo value to set.
     * @return the AppsGitlabSourceSpec object itself.
     */
    public AppsGitlabSourceSpec setRepo(String repo) {
        this.repo = repo;
        return this;
    }
}
