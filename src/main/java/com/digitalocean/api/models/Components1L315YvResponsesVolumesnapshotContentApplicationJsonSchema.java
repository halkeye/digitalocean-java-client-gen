package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1L315YvResponsesVolumesnapshotContentApplicationJsonSchema model. */
@Fluent
public final class Components1L315YvResponsesVolumesnapshotContentApplicationJsonSchema {
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
     * @return the Components1L315YvResponsesVolumesnapshotContentApplicationJsonSchema object itself.
     */
    public Components1L315YvResponsesVolumesnapshotContentApplicationJsonSchema setSnapshot(Snapshots snapshot) {
        this.snapshot = snapshot;
        return this;
    }
}
