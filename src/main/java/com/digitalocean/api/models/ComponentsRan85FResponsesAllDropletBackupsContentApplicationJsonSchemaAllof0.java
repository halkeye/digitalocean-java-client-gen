package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComponentsRan85FResponsesAllDropletBackupsContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class ComponentsRan85FResponsesAllDropletBackupsContentApplicationJsonSchemaAllof0 {
    /*
     * The backups property.
     */
    @JsonProperty(value = "backups")
    private List<DropletSnapshot> backups;

    /**
     * Get the backups property: The backups property.
     *
     * @return the backups value.
     */
    public List<DropletSnapshot> getBackups() {
        return this.backups;
    }

    /**
     * Set the backups property: The backups property.
     *
     * @param backups the backups value to set.
     * @return the ComponentsRan85FResponsesAllDropletBackupsContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsRan85FResponsesAllDropletBackupsContentApplicationJsonSchemaAllof0 setBackups(
            List<DropletSnapshot> backups) {
        this.backups = backups;
        return this;
    }
}
