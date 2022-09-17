package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ClusterlintRequest model. */
@Fluent
public final class ClusterlintRequest {
    /*
     * An array of check groups that will be run when clusterlint executes checks.
     */
    @JsonProperty(value = "include_groups")
    private List<String> includeGroups;

    /*
     * An array of checks that will be run when clusterlint executes checks.
     */
    @JsonProperty(value = "include_checks")
    private List<String> includeChecks;

    /*
     * An array of check groups that will be omitted when clusterlint executes checks.
     */
    @JsonProperty(value = "exclude_groups")
    private List<String> excludeGroups;

    /*
     * An array of checks that will be run when clusterlint executes checks.
     */
    @JsonProperty(value = "exclude_checks")
    private List<String> excludeChecks;

    /**
     * Get the includeGroups property: An array of check groups that will be run when clusterlint executes checks.
     *
     * @return the includeGroups value.
     */
    public List<String> getIncludeGroups() {
        return this.includeGroups;
    }

    /**
     * Set the includeGroups property: An array of check groups that will be run when clusterlint executes checks.
     *
     * @param includeGroups the includeGroups value to set.
     * @return the ClusterlintRequest object itself.
     */
    public ClusterlintRequest setIncludeGroups(List<String> includeGroups) {
        this.includeGroups = includeGroups;
        return this;
    }

    /**
     * Get the includeChecks property: An array of checks that will be run when clusterlint executes checks.
     *
     * @return the includeChecks value.
     */
    public List<String> getIncludeChecks() {
        return this.includeChecks;
    }

    /**
     * Set the includeChecks property: An array of checks that will be run when clusterlint executes checks.
     *
     * @param includeChecks the includeChecks value to set.
     * @return the ClusterlintRequest object itself.
     */
    public ClusterlintRequest setIncludeChecks(List<String> includeChecks) {
        this.includeChecks = includeChecks;
        return this;
    }

    /**
     * Get the excludeGroups property: An array of check groups that will be omitted when clusterlint executes checks.
     *
     * @return the excludeGroups value.
     */
    public List<String> getExcludeGroups() {
        return this.excludeGroups;
    }

    /**
     * Set the excludeGroups property: An array of check groups that will be omitted when clusterlint executes checks.
     *
     * @param excludeGroups the excludeGroups value to set.
     * @return the ClusterlintRequest object itself.
     */
    public ClusterlintRequest setExcludeGroups(List<String> excludeGroups) {
        this.excludeGroups = excludeGroups;
        return this;
    }

    /**
     * Get the excludeChecks property: An array of checks that will be run when clusterlint executes checks.
     *
     * @return the excludeChecks value.
     */
    public List<String> getExcludeChecks() {
        return this.excludeChecks;
    }

    /**
     * Set the excludeChecks property: An array of checks that will be run when clusterlint executes checks.
     *
     * @param excludeChecks the excludeChecks value to set.
     * @return the ClusterlintRequest object itself.
     */
    public ClusterlintRequest setExcludeChecks(List<String> excludeChecks) {
        this.excludeChecks = excludeChecks;
        return this;
    }
}
