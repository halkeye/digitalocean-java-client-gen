package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;

/**
 * An object containing information about a resource scheduled for deletion.
 */
@Fluent
public final class DestroyedAssociatedResource {
    /*
     * The unique identifier for the resource scheduled for deletion.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the resource scheduled for deletion.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A time value given in ISO8601 combined date and time format indicating when the resource was destroyed if the
     * request was successful.
     */
    @JsonProperty(value = "destroyed_at")
    private OffsetDateTime destroyedAt;

    /*
     * A string indicating that the resource was not successfully destroyed and providing additional information.
     */
    @JsonProperty(value = "error_message")
    private String errorMessage;

    /**
     * Get the id property: The unique identifier for the resource scheduled for deletion.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The unique identifier for the resource scheduled for deletion.
     * 
     * @param id the id value to set.
     * @return the DestroyedAssociatedResource object itself.
     */
    public DestroyedAssociatedResource setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the resource scheduled for deletion.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource scheduled for deletion.
     * 
     * @param name the name value to set.
     * @return the DestroyedAssociatedResource object itself.
     */
    public DestroyedAssociatedResource setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the destroyedAt property: A time value given in ISO8601 combined date and time format indicating when the
     * resource was destroyed if the request was successful.
     * 
     * @return the destroyedAt value.
     */
    public OffsetDateTime getDestroyedAt() {
        return this.destroyedAt;
    }

    /**
     * Set the destroyedAt property: A time value given in ISO8601 combined date and time format indicating when the
     * resource was destroyed if the request was successful.
     * 
     * @param destroyedAt the destroyedAt value to set.
     * @return the DestroyedAssociatedResource object itself.
     */
    public DestroyedAssociatedResource setDestroyedAt(OffsetDateTime destroyedAt) {
        this.destroyedAt = destroyedAt;
        return this;
    }

    /**
     * Get the errorMessage property: A string indicating that the resource was not successfully destroyed and
     * providing additional information.
     * 
     * @return the errorMessage value.
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: A string indicating that the resource was not successfully destroyed and
     * providing additional information.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the DestroyedAssociatedResource object itself.
     */
    public DestroyedAssociatedResource setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
}
