package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** An objects containing information about a resources scheduled for deletion. */
@Fluent
public final class AssociatedResourceStatus {
    /*
     * An object containing information about a resource scheduled for deletion.
     */
    @JsonProperty(value = "droplet")
    private DestroyedAssociatedResource droplet;

    /*
     * An object containing additional information about resource related to a Droplet requested to be destroyed.
     */
    @JsonProperty(value = "resources")
    private AssociatedResourceStatusResources resources;

    /*
     * A time value given in ISO8601 combined date and time format indicating when the requested action was completed.
     */
    @JsonProperty(value = "completed_at")
    private OffsetDateTime completedAt;

    /*
     * A count of the associated resources that failed to be destroyed, if any.
     */
    @JsonProperty(value = "failures")
    private Integer failures;

    /**
     * Get the droplet property: An object containing information about a resource scheduled for deletion.
     *
     * @return the droplet value.
     */
    public DestroyedAssociatedResource getDroplet() {
        return this.droplet;
    }

    /**
     * Set the droplet property: An object containing information about a resource scheduled for deletion.
     *
     * @param droplet the droplet value to set.
     * @return the AssociatedResourceStatus object itself.
     */
    public AssociatedResourceStatus setDroplet(DestroyedAssociatedResource droplet) {
        this.droplet = droplet;
        return this;
    }

    /**
     * Get the resources property: An object containing additional information about resource related to a Droplet
     * requested to be destroyed.
     *
     * @return the resources value.
     */
    public AssociatedResourceStatusResources getResources() {
        return this.resources;
    }

    /**
     * Set the resources property: An object containing additional information about resource related to a Droplet
     * requested to be destroyed.
     *
     * @param resources the resources value to set.
     * @return the AssociatedResourceStatus object itself.
     */
    public AssociatedResourceStatus setResources(AssociatedResourceStatusResources resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the completedAt property: A time value given in ISO8601 combined date and time format indicating when the
     * requested action was completed.
     *
     * @return the completedAt value.
     */
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
     * Set the completedAt property: A time value given in ISO8601 combined date and time format indicating when the
     * requested action was completed.
     *
     * @param completedAt the completedAt value to set.
     * @return the AssociatedResourceStatus object itself.
     */
    public AssociatedResourceStatus setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * Get the failures property: A count of the associated resources that failed to be destroyed, if any.
     *
     * @return the failures value.
     */
    public Integer getFailures() {
        return this.failures;
    }

    /**
     * Set the failures property: A count of the associated resources that failed to be destroyed, if any.
     *
     * @param failures the failures value to set.
     * @return the AssociatedResourceStatus object itself.
     */
    public AssociatedResourceStatus setFailures(Integer failures) {
        this.failures = failures;
        return this;
    }
}
