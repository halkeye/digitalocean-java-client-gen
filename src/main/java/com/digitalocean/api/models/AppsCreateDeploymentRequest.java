package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppsCreateDeploymentRequest model. */
@Fluent
public final class AppsCreateDeploymentRequest {
    /*
     * Indicates whether to force a build of app from source even if an existing cached build is suitable for re-use
     */
    @JsonProperty(value = "force_build")
    private Boolean forceBuild;

    /**
     * Get the forceBuild property: Indicates whether to force a build of app from source even if an existing cached
     * build is suitable for re-use.
     *
     * @return the forceBuild value.
     */
    public Boolean isForceBuild() {
        return this.forceBuild;
    }

    /**
     * Set the forceBuild property: Indicates whether to force a build of app from source even if an existing cached
     * build is suitable for re-use.
     *
     * @param forceBuild the forceBuild value to set.
     * @return the AppsCreateDeploymentRequest object itself.
     */
    public AppsCreateDeploymentRequest setForceBuild(Boolean forceBuild) {
        this.forceBuild = forceBuild;
        return this;
    }
}
