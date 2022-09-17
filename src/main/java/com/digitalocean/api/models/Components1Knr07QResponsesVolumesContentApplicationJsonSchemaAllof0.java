package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Components1Knr07QResponsesVolumesContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class Components1Knr07QResponsesVolumesContentApplicationJsonSchemaAllof0 {
    /*
     * Array of volumes.
     */
    @JsonProperty(value = "volumes", required = true)
    private List<VolumeFull> volumes;

    /**
     * Get the volumes property: Array of volumes.
     *
     * @return the volumes value.
     */
    public List<VolumeFull> getVolumes() {
        return this.volumes;
    }

    /**
     * Set the volumes property: Array of volumes.
     *
     * @param volumes the volumes value to set.
     * @return the Components1Knr07QResponsesVolumesContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Knr07QResponsesVolumesContentApplicationJsonSchemaAllof0 setVolumes(List<VolumeFull> volumes) {
        this.volumes = volumes;
        return this;
    }
}
