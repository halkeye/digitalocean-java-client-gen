package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The AppsAlertResponse model.
 */
@Fluent
public final class AppsAlertResponse {
    /*
     * The alert property.
     */
    @JsonProperty(value = "alert")
    private AppAlert alert;

    /**
     * Get the alert property: The alert property.
     * 
     * @return the alert value.
     */
    public AppAlert getAlert() {
        return this.alert;
    }

    /**
     * Set the alert property: The alert property.
     * 
     * @param alert the alert value to set.
     * @return the AppsAlertResponse object itself.
     */
    public AppsAlertResponse setAlert(AppAlert alert) {
        this.alert = alert;
        return this;
    }
}
