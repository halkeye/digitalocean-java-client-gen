package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The AppsDeploymentResponse model.
 */
@Fluent
public final class AppsDeploymentResponse {
    /*
     * An app deployment
     */
    @JsonProperty(value = "deployment")
    private AppsDeployment deployment;

    /**
     * Get the deployment property: An app deployment.
     * 
     * @return the deployment value.
     */
    public AppsDeployment getDeployment() {
        return this.deployment;
    }

    /**
     * Set the deployment property: An app deployment.
     * 
     * @param deployment the deployment value to set.
     * @return the AppsDeploymentResponse object itself.
     */
    public AppsDeploymentResponse setDeployment(AppsDeployment deployment) {
        this.deployment = deployment;
        return this;
    }
}
