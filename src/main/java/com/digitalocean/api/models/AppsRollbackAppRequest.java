package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppsRollbackAppRequest model. */
@Fluent
public final class AppsRollbackAppRequest {
    /*
     * The ID of the deployment to rollback to.
     */
    @JsonProperty(value = "deployment_id")
    private String deploymentId;

    /*
     * Whether to skip pinning the rollback deployment. If false, the rollback deployment will be pinned and any new
     * deployments including Auto Deploy on Push hooks will be disabled until the rollback is either manually committed
     * or reverted via the CommitAppRollback or RevertAppRollback endpoints respectively. If true, the rollback will be
     * immediately committed and the app will remain unpinned.
     */
    @JsonProperty(value = "skip_pin")
    private Boolean skipPin;

    /**
     * Get the deploymentId property: The ID of the deployment to rollback to.
     *
     * @return the deploymentId value.
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * Set the deploymentId property: The ID of the deployment to rollback to.
     *
     * @param deploymentId the deploymentId value to set.
     * @return the AppsRollbackAppRequest object itself.
     */
    public AppsRollbackAppRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * Get the skipPin property: Whether to skip pinning the rollback deployment. If false, the rollback deployment will
     * be pinned and any new deployments including Auto Deploy on Push hooks will be disabled until the rollback is
     * either manually committed or reverted via the CommitAppRollback or RevertAppRollback endpoints respectively. If
     * true, the rollback will be immediately committed and the app will remain unpinned.
     *
     * @return the skipPin value.
     */
    public Boolean isSkipPin() {
        return this.skipPin;
    }

    /**
     * Set the skipPin property: Whether to skip pinning the rollback deployment. If false, the rollback deployment will
     * be pinned and any new deployments including Auto Deploy on Push hooks will be disabled until the rollback is
     * either manually committed or reverted via the CommitAppRollback or RevertAppRollback endpoints respectively. If
     * true, the rollback will be immediately committed and the app will remain unpinned.
     *
     * @param skipPin the skipPin value to set.
     * @return the AppsRollbackAppRequest object itself.
     */
    public AppsRollbackAppRequest setSkipPin(Boolean skipPin) {
        this.skipPin = skipPin;
        return this;
    }
}
