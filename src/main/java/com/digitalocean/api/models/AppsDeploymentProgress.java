package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The AppsDeploymentProgress model.
 */
@Fluent
public final class AppsDeploymentProgress {
    /*
     * Number of unsuccessful steps
     */
    @JsonProperty(value = "error_steps")
    private Integer errorSteps;

    /*
     * Number of pending steps
     */
    @JsonProperty(value = "pending_steps")
    private Integer pendingSteps;

    /*
     * Number of currently running steps
     */
    @JsonProperty(value = "running_steps")
    private Integer runningSteps;

    /*
     * The deployment's steps
     */
    @JsonProperty(value = "steps")
    private List<AppsDeploymentProgressStep> steps;

    /*
     * Number of successful steps
     */
    @JsonProperty(value = "success_steps")
    private Integer successSteps;

    /*
     * A flattened summary of the steps
     */
    @JsonProperty(value = "summary_steps")
    private List<AppsDeploymentProgressStep> summarySteps;

    /*
     * Total number of steps
     */
    @JsonProperty(value = "total_steps")
    private Integer totalSteps;

    /**
     * Get the errorSteps property: Number of unsuccessful steps.
     * 
     * @return the errorSteps value.
     */
    public Integer getErrorSteps() {
        return this.errorSteps;
    }

    /**
     * Set the errorSteps property: Number of unsuccessful steps.
     * 
     * @param errorSteps the errorSteps value to set.
     * @return the AppsDeploymentProgress object itself.
     */
    public AppsDeploymentProgress setErrorSteps(Integer errorSteps) {
        this.errorSteps = errorSteps;
        return this;
    }

    /**
     * Get the pendingSteps property: Number of pending steps.
     * 
     * @return the pendingSteps value.
     */
    public Integer getPendingSteps() {
        return this.pendingSteps;
    }

    /**
     * Set the pendingSteps property: Number of pending steps.
     * 
     * @param pendingSteps the pendingSteps value to set.
     * @return the AppsDeploymentProgress object itself.
     */
    public AppsDeploymentProgress setPendingSteps(Integer pendingSteps) {
        this.pendingSteps = pendingSteps;
        return this;
    }

    /**
     * Get the runningSteps property: Number of currently running steps.
     * 
     * @return the runningSteps value.
     */
    public Integer getRunningSteps() {
        return this.runningSteps;
    }

    /**
     * Set the runningSteps property: Number of currently running steps.
     * 
     * @param runningSteps the runningSteps value to set.
     * @return the AppsDeploymentProgress object itself.
     */
    public AppsDeploymentProgress setRunningSteps(Integer runningSteps) {
        this.runningSteps = runningSteps;
        return this;
    }

    /**
     * Get the steps property: The deployment's steps.
     * 
     * @return the steps value.
     */
    public List<AppsDeploymentProgressStep> getSteps() {
        return this.steps;
    }

    /**
     * Set the steps property: The deployment's steps.
     * 
     * @param steps the steps value to set.
     * @return the AppsDeploymentProgress object itself.
     */
    public AppsDeploymentProgress setSteps(List<AppsDeploymentProgressStep> steps) {
        this.steps = steps;
        return this;
    }

    /**
     * Get the successSteps property: Number of successful steps.
     * 
     * @return the successSteps value.
     */
    public Integer getSuccessSteps() {
        return this.successSteps;
    }

    /**
     * Set the successSteps property: Number of successful steps.
     * 
     * @param successSteps the successSteps value to set.
     * @return the AppsDeploymentProgress object itself.
     */
    public AppsDeploymentProgress setSuccessSteps(Integer successSteps) {
        this.successSteps = successSteps;
        return this;
    }

    /**
     * Get the summarySteps property: A flattened summary of the steps.
     * 
     * @return the summarySteps value.
     */
    public List<AppsDeploymentProgressStep> getSummarySteps() {
        return this.summarySteps;
    }

    /**
     * Set the summarySteps property: A flattened summary of the steps.
     * 
     * @param summarySteps the summarySteps value to set.
     * @return the AppsDeploymentProgress object itself.
     */
    public AppsDeploymentProgress setSummarySteps(List<AppsDeploymentProgressStep> summarySteps) {
        this.summarySteps = summarySteps;
        return this;
    }

    /**
     * Get the totalSteps property: Total number of steps.
     * 
     * @return the totalSteps value.
     */
    public Integer getTotalSteps() {
        return this.totalSteps;
    }

    /**
     * Set the totalSteps property: Total number of steps.
     * 
     * @param totalSteps the totalSteps value to set.
     * @return the AppsDeploymentProgress object itself.
     */
    public AppsDeploymentProgress setTotalSteps(Integer totalSteps) {
        this.totalSteps = totalSteps;
        return this;
    }
}
