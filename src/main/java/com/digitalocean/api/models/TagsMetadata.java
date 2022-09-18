package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * Tagged Resource Statistics include metadata regarding the resource type that has been tagged.
 */
@Fluent
public class TagsMetadata {
    /*
     * The number of tagged objects for this type of resource.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * The URI for the last tagged object for this type of resource.
     */
    @JsonProperty(value = "last_tagged_uri")
    private String lastTaggedUri;

    /**
     * Get the count property: The number of tagged objects for this type of resource.
     * 
     * @return the count value.
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Set the count property: The number of tagged objects for this type of resource.
     * 
     * @param count the count value to set.
     * @return the TagsMetadata object itself.
     */
    public TagsMetadata setCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the lastTaggedUri property: The URI for the last tagged object for this type of resource.
     * 
     * @return the lastTaggedUri value.
     */
    public String getLastTaggedUri() {
        return this.lastTaggedUri;
    }

    /**
     * Set the lastTaggedUri property: The URI for the last tagged object for this type of resource.
     * 
     * @param lastTaggedUri the lastTaggedUri value to set.
     * @return the TagsMetadata object itself.
     */
    public TagsMetadata setLastTaggedUri(String lastTaggedUri) {
        this.lastTaggedUri = lastTaggedUri;
        return this;
    }
}
