package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsJxo43DResponsesTagsAllContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class ComponentsJxo43DResponsesTagsAllContentApplicationJsonSchemaAllof0 {
    /*
     * The tags property.
     */
    @JsonProperty(value = "tags")
    private List<Tags> tags;

    /**
     * Get the tags property: The tags property.
     * 
     * @return the tags value.
     */
    public List<Tags> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags property.
     * 
     * @param tags the tags value to set.
     * @return the ComponentsJxo43DResponsesTagsAllContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsJxo43DResponsesTagsAllContentApplicationJsonSchemaAllof0 setTags(List<Tags> tags) {
        this.tags = tags;
        return this;
    }
}
