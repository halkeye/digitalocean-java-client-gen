package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The AppsDomainProgress model.
 */
@Fluent
public final class AppsDomainProgress {
    /*
     * The steps of the domain's progress
     */
    @JsonProperty(value = "steps")
    private List<Object> steps;

    /**
     * Get the steps property: The steps of the domain's progress.
     * 
     * @return the steps value.
     */
    public List<Object> getSteps() {
        return this.steps;
    }

    /**
     * Set the steps property: The steps of the domain's progress.
     * 
     * @param steps the steps value to set.
     * @return the AppsDomainProgress object itself.
     */
    public AppsDomainProgress setSteps(List<Object> steps) {
        this.steps = steps;
        return this;
    }
}
