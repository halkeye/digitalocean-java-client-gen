package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** A step that is run as part of the deployment's lifecycle. */
@Fluent
public final class AppsDeploymentProgressStep {
    /*
     * The component name that this step is associated with
     */
    @JsonProperty(value = "component_name")
    private String componentName;

    /*
     * The end time of this step
     */
    @JsonProperty(value = "ended_at")
    private OffsetDateTime endedAt;

    /*
     * The base of a human-readable description of the step intended to be combined with the component name for
     * presentation. For example:
     *
     * `message_base` = "Building service"
     * `component_name` = "api"
     */
    @JsonProperty(value = "message_base")
    private String messageBase;

    /*
     * The name of this step
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The reason property.
     */
    @JsonProperty(value = "reason")
    private AppsDeploymentProgressStepReason reason;

    /*
     * The start time of this step
     */
    @JsonProperty(value = "started_at")
    private OffsetDateTime startedAt;

    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private AppsDeploymentProgressStepStatus status;

    /*
     * Child steps of this step
     */
    @JsonProperty(value = "steps")
    private List<Object> steps;

    /**
     * Get the componentName property: The component name that this step is associated with.
     *
     * @return the componentName value.
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * Set the componentName property: The component name that this step is associated with.
     *
     * @param componentName the componentName value to set.
     * @return the AppsDeploymentProgressStep object itself.
     */
    public AppsDeploymentProgressStep setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * Get the endedAt property: The end time of this step.
     *
     * @return the endedAt value.
     */
    public OffsetDateTime getEndedAt() {
        return this.endedAt;
    }

    /**
     * Set the endedAt property: The end time of this step.
     *
     * @param endedAt the endedAt value to set.
     * @return the AppsDeploymentProgressStep object itself.
     */
    public AppsDeploymentProgressStep setEndedAt(OffsetDateTime endedAt) {
        this.endedAt = endedAt;
        return this;
    }

    /**
     * Get the messageBase property: The base of a human-readable description of the step intended to be combined with
     * the component name for presentation. For example:
     *
     * <p>`message_base` = "Building service" `component_name` = "api".
     *
     * @return the messageBase value.
     */
    public String getMessageBase() {
        return this.messageBase;
    }

    /**
     * Set the messageBase property: The base of a human-readable description of the step intended to be combined with
     * the component name for presentation. For example:
     *
     * <p>`message_base` = "Building service" `component_name` = "api".
     *
     * @param messageBase the messageBase value to set.
     * @return the AppsDeploymentProgressStep object itself.
     */
    public AppsDeploymentProgressStep setMessageBase(String messageBase) {
        this.messageBase = messageBase;
        return this;
    }

    /**
     * Get the name property: The name of this step.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of this step.
     *
     * @param name the name value to set.
     * @return the AppsDeploymentProgressStep object itself.
     */
    public AppsDeploymentProgressStep setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the reason property: The reason property.
     *
     * @return the reason value.
     */
    public AppsDeploymentProgressStepReason getReason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason property.
     *
     * @param reason the reason value to set.
     * @return the AppsDeploymentProgressStep object itself.
     */
    public AppsDeploymentProgressStep setReason(AppsDeploymentProgressStepReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the startedAt property: The start time of this step.
     *
     * @return the startedAt value.
     */
    public OffsetDateTime getStartedAt() {
        return this.startedAt;
    }

    /**
     * Set the startedAt property: The start time of this step.
     *
     * @param startedAt the startedAt value to set.
     * @return the AppsDeploymentProgressStep object itself.
     */
    public AppsDeploymentProgressStep setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public AppsDeploymentProgressStepStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the AppsDeploymentProgressStep object itself.
     */
    public AppsDeploymentProgressStep setStatus(AppsDeploymentProgressStepStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the steps property: Child steps of this step.
     *
     * @return the steps value.
     */
    public List<Object> getSteps() {
        return this.steps;
    }

    /**
     * Set the steps property: Child steps of this step.
     *
     * @param steps the steps value to set.
     * @return the AppsDeploymentProgressStep object itself.
     */
    public AppsDeploymentProgressStep setSteps(List<Object> steps) {
        this.steps = steps;
        return this;
    }
}
