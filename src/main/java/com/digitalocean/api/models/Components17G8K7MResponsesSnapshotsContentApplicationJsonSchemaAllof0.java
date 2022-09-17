package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Components17G8K7MResponsesSnapshotsContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class Components17G8K7MResponsesSnapshotsContentApplicationJsonSchemaAllof0 {
    /*
     * The snapshots property.
     */
    @JsonProperty(value = "snapshots")
    private List<Snapshots> snapshots;

    /**
     * Get the snapshots property: The snapshots property.
     *
     * @return the snapshots value.
     */
    public List<Snapshots> getSnapshots() {
        return this.snapshots;
    }

    /**
     * Set the snapshots property: The snapshots property.
     *
     * @param snapshots the snapshots value to set.
     * @return the Components17G8K7MResponsesSnapshotsContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components17G8K7MResponsesSnapshotsContentApplicationJsonSchemaAllof0 setSnapshots(
            List<Snapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
}
