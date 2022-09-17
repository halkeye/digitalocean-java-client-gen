package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DatabaseMaintenanceWindow model. */
@Fluent
public class DatabaseMaintenanceWindow {
    /*
     * The day of the week on which to apply maintenance updates.
     */
    @JsonProperty(value = "day", required = true)
    private String day;

    /*
     * The hour in UTC at which maintenance updates will be applied in 24 hour format.
     */
    @JsonProperty(value = "hour", required = true)
    private String hour;

    /*
     * A boolean value indicating whether any maintenance is scheduled to be performed in the next window.
     */
    @JsonProperty(value = "pending", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean pending;

    /*
     * A list of strings, each containing information about a pending maintenance update.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> description;

    /**
     * Get the day property: The day of the week on which to apply maintenance updates.
     *
     * @return the day value.
     */
    public String getDay() {
        return this.day;
    }

    /**
     * Set the day property: The day of the week on which to apply maintenance updates.
     *
     * @param day the day value to set.
     * @return the DatabaseMaintenanceWindow object itself.
     */
    public DatabaseMaintenanceWindow setDay(String day) {
        this.day = day;
        return this;
    }

    /**
     * Get the hour property: The hour in UTC at which maintenance updates will be applied in 24 hour format.
     *
     * @return the hour value.
     */
    public String getHour() {
        return this.hour;
    }

    /**
     * Set the hour property: The hour in UTC at which maintenance updates will be applied in 24 hour format.
     *
     * @param hour the hour value to set.
     * @return the DatabaseMaintenanceWindow object itself.
     */
    public DatabaseMaintenanceWindow setHour(String hour) {
        this.hour = hour;
        return this;
    }

    /**
     * Get the pending property: A boolean value indicating whether any maintenance is scheduled to be performed in the
     * next window.
     *
     * @return the pending value.
     */
    public Boolean isPending() {
        return this.pending;
    }

    /**
     * Get the description property: A list of strings, each containing information about a pending maintenance update.
     *
     * @return the description value.
     */
    public List<String> getDescription() {
        return this.description;
    }
}
