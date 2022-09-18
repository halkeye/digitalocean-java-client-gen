package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsWmf624ResponsesGarbageCollectionsContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsWmf624ResponsesGarbageCollectionsContentApplicationJsonSchema {
    /*
     * The garbage_collections property.
     */
    @JsonProperty(value = "garbage_collections")
    private List<GarbageCollection> garbageCollections;

    /**
     * Get the garbageCollections property: The garbage_collections property.
     * 
     * @return the garbageCollections value.
     */
    public List<GarbageCollection> getGarbageCollections() {
        return this.garbageCollections;
    }

    /**
     * Set the garbageCollections property: The garbage_collections property.
     * 
     * @param garbageCollections the garbageCollections value to set.
     * @return the ComponentsWmf624ResponsesGarbageCollectionsContentApplicationJsonSchema object itself.
     */
    public ComponentsWmf624ResponsesGarbageCollectionsContentApplicationJsonSchema setGarbageCollections(List<GarbageCollection> garbageCollections) {
        this.garbageCollections = garbageCollections;
        return this;
    }
}
