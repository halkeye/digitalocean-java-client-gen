package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsO4VmziResponsesClusterlintRunContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsO4VmziResponsesClusterlintRunContentApplicationJsonSchema {
    /*
     * ID of the clusterlint run that can be used later to fetch the diagnostics.
     */
    @JsonProperty(value = "run_id")
    private String runId;

    /**
     * Get the runId property: ID of the clusterlint run that can be used later to fetch the diagnostics.
     *
     * @return the runId value.
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * Set the runId property: ID of the clusterlint run that can be used later to fetch the diagnostics.
     *
     * @param runId the runId value to set.
     * @return the ComponentsO4VmziResponsesClusterlintRunContentApplicationJsonSchema object itself.
     */
    public ComponentsO4VmziResponsesClusterlintRunContentApplicationJsonSchema setRunId(String runId) {
        this.runId = runId;
        return this;
    }
}
