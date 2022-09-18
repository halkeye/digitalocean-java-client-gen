package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The AppsListAlertsResponse model.
 */
@Fluent
public final class AppsListAlertsResponse {
    /*
     * The alerts property.
     */
    @JsonProperty(value = "alerts")
    private List<AppAlert> alerts;

    /**
     * Get the alerts property: The alerts property.
     * 
     * @return the alerts value.
     */
    public List<AppAlert> getAlerts() {
        return this.alerts;
    }

    /**
     * Set the alerts property: The alerts property.
     * 
     * @param alerts the alerts value to set.
     * @return the AppsListAlertsResponse object itself.
     */
    public AppsListAlertsResponse setAlerts(List<AppAlert> alerts) {
        this.alerts = alerts;
        return this;
    }
}
