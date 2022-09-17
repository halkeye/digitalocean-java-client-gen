package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComponentsVpcoyeResponsesRepositoryManifestsContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class ComponentsVpcoyeResponsesRepositoryManifestsContentApplicationJsonSchemaAllof0 {
    /*
     * The manifests property.
     */
    @JsonProperty(value = "manifests")
    private List<RepositoryManifest> manifests;

    /**
     * Get the manifests property: The manifests property.
     *
     * @return the manifests value.
     */
    public List<RepositoryManifest> getManifests() {
        return this.manifests;
    }

    /**
     * Set the manifests property: The manifests property.
     *
     * @param manifests the manifests value to set.
     * @return the ComponentsVpcoyeResponsesRepositoryManifestsContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsVpcoyeResponsesRepositoryManifestsContentApplicationJsonSchemaAllof0 setManifests(
            List<RepositoryManifest> manifests) {
        this.manifests = manifests;
        return this;
    }
}
