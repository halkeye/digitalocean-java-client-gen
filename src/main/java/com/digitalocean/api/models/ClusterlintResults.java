package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The ClusterlintResults model. */
@Fluent
public final class ClusterlintResults {
    /*
     * Id of the clusterlint run that can be used later to fetch the diagnostics.
     */
    @JsonProperty(value = "run_id")
    private String runId;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the schedule clusterlint run
     * request was made.
     */
    @JsonProperty(value = "requested_at")
    private OffsetDateTime requestedAt;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the schedule clusterlint run
     * request was completed.
     */
    @JsonProperty(value = "completed_at")
    private OffsetDateTime completedAt;

    /*
     * An array of diagnostics reporting potential problems for the given cluster.
     */
    @JsonProperty(value = "diagnostics")
    private List<ClusterlintResultsDiagnosticsItem> diagnostics;

    /**
     * Get the runId property: Id of the clusterlint run that can be used later to fetch the diagnostics.
     *
     * @return the runId value.
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * Set the runId property: Id of the clusterlint run that can be used later to fetch the diagnostics.
     *
     * @param runId the runId value to set.
     * @return the ClusterlintResults object itself.
     */
    public ClusterlintResults setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get the requestedAt property: A time value given in ISO8601 combined date and time format that represents when
     * the schedule clusterlint run request was made.
     *
     * @return the requestedAt value.
     */
    public OffsetDateTime getRequestedAt() {
        return this.requestedAt;
    }

    /**
     * Set the requestedAt property: A time value given in ISO8601 combined date and time format that represents when
     * the schedule clusterlint run request was made.
     *
     * @param requestedAt the requestedAt value to set.
     * @return the ClusterlintResults object itself.
     */
    public ClusterlintResults setRequestedAt(OffsetDateTime requestedAt) {
        this.requestedAt = requestedAt;
        return this;
    }

    /**
     * Get the completedAt property: A time value given in ISO8601 combined date and time format that represents when
     * the schedule clusterlint run request was completed.
     *
     * @return the completedAt value.
     */
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
     * Set the completedAt property: A time value given in ISO8601 combined date and time format that represents when
     * the schedule clusterlint run request was completed.
     *
     * @param completedAt the completedAt value to set.
     * @return the ClusterlintResults object itself.
     */
    public ClusterlintResults setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * Get the diagnostics property: An array of diagnostics reporting potential problems for the given cluster.
     *
     * @return the diagnostics value.
     */
    public List<ClusterlintResultsDiagnosticsItem> getDiagnostics() {
        return this.diagnostics;
    }

    /**
     * Set the diagnostics property: An array of diagnostics reporting potential problems for the given cluster.
     *
     * @param diagnostics the diagnostics value to set.
     * @return the ClusterlintResults object itself.
     */
    public ClusterlintResults setDiagnostics(List<ClusterlintResultsDiagnosticsItem> diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }
}
