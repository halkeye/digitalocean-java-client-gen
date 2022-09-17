package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The links object contains the `self` object, which contains the resource relationship. */
@Fluent
public final class ResourceLinks {
    /*
     * A URI that can be used to retrieve the resource.
     */
    @JsonProperty(value = "self")
    private String self;

    /**
     * Get the self property: A URI that can be used to retrieve the resource.
     *
     * @return the self value.
     */
    public String getSelf() {
        return this.self;
    }

    /**
     * Set the self property: A URI that can be used to retrieve the resource.
     *
     * @param self the self value to set.
     * @return the ResourceLinks object itself.
     */
    public ResourceLinks setSelf(String self) {
        this.self = self;
        return this;
    }
}
