package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsZ0C3NiResponsesSnapshotsExistingContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsZ0C3NiResponsesSnapshotsExistingContentApplicationJsonSchema {
    /*
     * The snapshot property.
     */
    @JsonProperty(value = "snapshot")
    private Snapshots snapshot;

    /**
     * Get the snapshot property: The snapshot property.
     *
     * @return the snapshot value.
     */
    public Snapshots getSnapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The snapshot property.
     *
     * @param snapshot the snapshot value to set.
     * @return the ComponentsZ0C3NiResponsesSnapshotsExistingContentApplicationJsonSchema object itself.
     */
    public ComponentsZ0C3NiResponsesSnapshotsExistingContentApplicationJsonSchema setSnapshot(Snapshots snapshot) {
        this.snapshot = snapshot;
        return this;
    }
}
