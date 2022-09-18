package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components1P7VxhlResponsesRepositoryTagsContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class Components1P7VxhlResponsesRepositoryTagsContentApplicationJsonSchemaAllof0 {
    /*
     * The tags property.
     */
    @JsonProperty(value = "tags")
    private List<RepositoryTag> tags;

    /**
     * Get the tags property: The tags property.
     * 
     * @return the tags value.
     */
    public List<RepositoryTag> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags property.
     * 
     * @param tags the tags value to set.
     * @return the Components1P7VxhlResponsesRepositoryTagsContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1P7VxhlResponsesRepositoryTagsContentApplicationJsonSchemaAllof0 setTags(List<RepositoryTag> tags) {
        this.tags = tags;
        return this;
    }
}
