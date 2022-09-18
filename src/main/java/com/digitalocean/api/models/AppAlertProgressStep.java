package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The AppAlertProgressStep model.
 */
@Fluent
public final class AppAlertProgressStep {
    /*
     * The name of this step
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private AppAlertProgressStepStatus status;

    /*
     * The start time of this step
     */
    @JsonProperty(value = "started_at")
    private OffsetDateTime startedAt;

    /*
     * The start time of this step
     */
    @JsonProperty(value = "ended_at")
    private OffsetDateTime endedAt;

    /*
     * The reason property.
     */
    @JsonProperty(value = "reason")
    private AppAlertProgressStepReason reason;

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
     * @return the AppAlertProgressStep object itself.
     */
    public AppAlertProgressStep setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status property: The status property.
     * 
     * @return the status value.
     */
    public AppAlertProgressStepStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     * 
     * @param status the status value to set.
     * @return the AppAlertProgressStep object itself.
     */
    public AppAlertProgressStep setStatus(AppAlertProgressStepStatus status) {
        this.status = status;
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
     * @return the AppAlertProgressStep object itself.
     */
    public AppAlertProgressStep setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get the endedAt property: The start time of this step.
     * 
     * @return the endedAt value.
     */
    public OffsetDateTime getEndedAt() {
        return this.endedAt;
    }

    /**
     * Set the endedAt property: The start time of this step.
     * 
     * @param endedAt the endedAt value to set.
     * @return the AppAlertProgressStep object itself.
     */
    public AppAlertProgressStep setEndedAt(OffsetDateTime endedAt) {
        this.endedAt = endedAt;
        return this;
    }

    /**
     * Get the reason property: The reason property.
     * 
     * @return the reason value.
     */
    public AppAlertProgressStepReason getReason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason property.
     * 
     * @param reason the reason value to set.
     * @return the AppAlertProgressStep object itself.
     */
    public AppAlertProgressStep setReason(AppAlertProgressStepReason reason) {
        this.reason = reason;
        return this;
    }
}
