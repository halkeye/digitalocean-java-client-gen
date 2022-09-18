package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The ClusterlintResultsDiagnosticsItem model.
 */
@Fluent
public final class ClusterlintResultsDiagnosticsItem {
    /*
     * The clusterlint check that resulted in the diagnostic.
     */
    @JsonProperty(value = "check_name")
    private String checkName;

    /*
     * Can be one of error, warning or suggestion.
     */
    @JsonProperty(value = "severity")
    private String severity;

    /*
     * Feedback about the object for users to fix.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Metadata about the Kubernetes API object the diagnostic is reported on.
     */
    @JsonProperty(value = "object")
    private ClusterlintResultsDiagnosticsItemObject object;

    /**
     * Get the checkName property: The clusterlint check that resulted in the diagnostic.
     * 
     * @return the checkName value.
     */
    public String getCheckName() {
        return this.checkName;
    }

    /**
     * Set the checkName property: The clusterlint check that resulted in the diagnostic.
     * 
     * @param checkName the checkName value to set.
     * @return the ClusterlintResultsDiagnosticsItem object itself.
     */
    public ClusterlintResultsDiagnosticsItem setCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * Get the severity property: Can be one of error, warning or suggestion.
     * 
     * @return the severity value.
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * Set the severity property: Can be one of error, warning or suggestion.
     * 
     * @param severity the severity value to set.
     * @return the ClusterlintResultsDiagnosticsItem object itself.
     */
    public ClusterlintResultsDiagnosticsItem setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the message property: Feedback about the object for users to fix.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Feedback about the object for users to fix.
     * 
     * @param message the message value to set.
     * @return the ClusterlintResultsDiagnosticsItem object itself.
     */
    public ClusterlintResultsDiagnosticsItem setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the object property: Metadata about the Kubernetes API object the diagnostic is reported on.
     * 
     * @return the object value.
     */
    public ClusterlintResultsDiagnosticsItemObject getObject() {
        return this.object;
    }

    /**
     * Set the object property: Metadata about the Kubernetes API object the diagnostic is reported on.
     * 
     * @param object the object value to set.
     * @return the ClusterlintResultsDiagnosticsItem object itself.
     */
    public ClusterlintResultsDiagnosticsItem setObject(ClusterlintResultsDiagnosticsItemObject object) {
        this.object = object;
        return this;
    }
}
