package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComponentsQd2GxzResponsesVolumesnapshotsContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class ComponentsQd2GxzResponsesVolumesnapshotsContentApplicationJsonSchemaAllof0 {
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
     * @return the ComponentsQd2GxzResponsesVolumesnapshotsContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsQd2GxzResponsesVolumesnapshotsContentApplicationJsonSchemaAllof0 setSnapshots(
            List<Snapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
}
