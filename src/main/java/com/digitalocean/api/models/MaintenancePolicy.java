package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * An object specifying the maintenance window policy for the Kubernetes cluster.
 */
@Fluent
public final class MaintenancePolicy {
    /*
     * The start time in UTC of the maintenance window policy in 24-hour clock format / HH:MM notation (e.g., `15:00`).
     */
    @JsonProperty(value = "start_time")
    private String startTime;

    /*
     * The duration of the maintenance window policy in human-readable format.
     */
    @JsonProperty(value = "duration", access = JsonProperty.Access.WRITE_ONLY)
    private String duration;

    /*
     * The day of the maintenance window policy. May be one of `monday` through `sunday`, or `any` to indicate an
     * arbitrary week day.
     */
    @JsonProperty(value = "day")
    private MaintenancePolicyDay day;

    /**
     * Get the startTime property: The start time in UTC of the maintenance window policy in 24-hour clock format /
     * HH:MM notation (e.g., `15:00`).
     * 
     * @return the startTime value.
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time in UTC of the maintenance window policy in 24-hour clock format /
     * HH:MM notation (e.g., `15:00`).
     * 
     * @param startTime the startTime value to set.
     * @return the MaintenancePolicy object itself.
     */
    public MaintenancePolicy setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the duration property: The duration of the maintenance window policy in human-readable format.
     * 
     * @return the duration value.
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * Get the day property: The day of the maintenance window policy. May be one of `monday` through `sunday`, or
     * `any` to indicate an arbitrary week day.
     * 
     * @return the day value.
     */
    public MaintenancePolicyDay getDay() {
        return this.day;
    }

    /**
     * Set the day property: The day of the maintenance window policy. May be one of `monday` through `sunday`, or
     * `any` to indicate an arbitrary week day.
     * 
     * @param day the day value to set.
     * @return the MaintenancePolicy object itself.
     */
    public MaintenancePolicy setDay(MaintenancePolicyDay day) {
        this.day = day;
        return this;
    }
}
