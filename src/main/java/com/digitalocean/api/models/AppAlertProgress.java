package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AppAlertProgress model. */
@Fluent
public final class AppAlertProgress {
    /*
     * Steps of an alert's progress.
     */
    @JsonProperty(value = "steps")
    private List<AppAlertProgressStep> steps;

    /**
     * Get the steps property: Steps of an alert's progress.
     *
     * @return the steps value.
     */
    public List<AppAlertProgressStep> getSteps() {
        return this.steps;
    }

    /**
     * Set the steps property: Steps of an alert's progress.
     *
     * @param steps the steps value to set.
     * @return the AppAlertProgress object itself.
     */
    public AppAlertProgress setSteps(List<AppAlertProgressStep> steps) {
        this.steps = steps;
        return this;
    }
}
