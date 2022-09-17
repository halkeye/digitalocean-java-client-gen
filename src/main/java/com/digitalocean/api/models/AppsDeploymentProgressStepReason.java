package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppsDeploymentProgressStepReason model. */
@Fluent
public final class AppsDeploymentProgressStepReason {
    /*
     * The error code
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The error message
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code property: The error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: The error code.
     *
     * @param code the code value to set.
     * @return the AppsDeploymentProgressStepReason object itself.
     */
    public AppsDeploymentProgressStepReason setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The error message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The error message.
     *
     * @param message the message value to set.
     * @return the AppsDeploymentProgressStepReason object itself.
     */
    public AppsDeploymentProgressStepReason setMessage(String message) {
        this.message = message;
        return this;
    }
}
