package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema model.
 */
@Fluent
public final class PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema {
    /*
     * Any object
     */
    @JsonProperty(value = "tags", required = true)
    private Object tags;

    /**
     * Get the tags property: Any object.
     * 
     * @return the tags value.
     */
    public Object getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Any object.
     * 
     * @param tags the tags value to set.
     * @return the PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema object itself.
     */
    public PathsUckfxvV2FirewallsFirewallIdTagsDeleteRequestbodyContentApplicationJsonSchema setTags(Object tags) {
        this.tags = tags;
        return this;
    }
}
