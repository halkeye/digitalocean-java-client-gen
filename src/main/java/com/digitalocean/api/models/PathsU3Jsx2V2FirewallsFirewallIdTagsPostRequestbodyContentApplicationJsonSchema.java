package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema {
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
     * @return the PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public PathsU3Jsx2V2FirewallsFirewallIdTagsPostRequestbodyContentApplicationJsonSchema setTags(Object tags) {
        this.tags = tags;
        return this;
    }
}
