package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComponentsMf1I3YResponsesAllDropletSnapshotsContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class ComponentsMf1I3YResponsesAllDropletSnapshotsContentApplicationJsonSchemaAllof0 {
    /*
     * The snapshots property.
     */
    @JsonProperty(value = "snapshots")
    private List<DropletSnapshot> snapshots;

    /**
     * Get the snapshots property: The snapshots property.
     *
     * @return the snapshots value.
     */
    public List<DropletSnapshot> getSnapshots() {
        return this.snapshots;
    }

    /**
     * Set the snapshots property: The snapshots property.
     *
     * @param snapshots the snapshots value to set.
     * @return the ComponentsMf1I3YResponsesAllDropletSnapshotsContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsMf1I3YResponsesAllDropletSnapshotsContentApplicationJsonSchemaAllof0 setSnapshots(
            List<DropletSnapshot> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
}
