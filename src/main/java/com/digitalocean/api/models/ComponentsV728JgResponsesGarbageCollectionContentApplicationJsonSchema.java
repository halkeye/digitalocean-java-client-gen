package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsV728JgResponsesGarbageCollectionContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsV728JgResponsesGarbageCollectionContentApplicationJsonSchema {
    /*
     * The garbage_collection property.
     */
    @JsonProperty(value = "garbage_collection")
    private GarbageCollection garbageCollection;

    /**
     * Get the garbageCollection property: The garbage_collection property.
     *
     * @return the garbageCollection value.
     */
    public GarbageCollection getGarbageCollection() {
        return this.garbageCollection;
    }

    /**
     * Set the garbageCollection property: The garbage_collection property.
     *
     * @param garbageCollection the garbageCollection value to set.
     * @return the ComponentsV728JgResponsesGarbageCollectionContentApplicationJsonSchema object itself.
     */
    public ComponentsV728JgResponsesGarbageCollectionContentApplicationJsonSchema setGarbageCollection(
            GarbageCollection garbageCollection) {
        this.garbageCollection = garbageCollection;
        return this;
    }
}
