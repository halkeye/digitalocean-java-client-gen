package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsKgjf4JResponsesResourcesListContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class ComponentsKgjf4JResponsesResourcesListContentApplicationJsonSchemaAllof0 {
    /*
     * The resources property.
     */
    @JsonProperty(value = "resources")
    private List<Resource> resources;

    /**
     * Get the resources property: The resources property.
     * 
     * @return the resources value.
     */
    public List<Resource> getResources() {
        return this.resources;
    }

    /**
     * Set the resources property: The resources property.
     * 
     * @param resources the resources value to set.
     * @return the ComponentsKgjf4JResponsesResourcesListContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsKgjf4JResponsesResourcesListContentApplicationJsonSchemaAllof0 setResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }
}
