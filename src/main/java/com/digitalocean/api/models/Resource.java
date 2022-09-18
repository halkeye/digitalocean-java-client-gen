package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The Resource model.
 */
@Fluent
public final class Resource {
    /*
     * The uniform resource name (URN) for the resource in the format do:resource_type:resource_id.
     */
    @JsonProperty(value = "urn")
    private String urn;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the project was created.
     */
    @JsonProperty(value = "assigned_at")
    private OffsetDateTime assignedAt;

    /*
     * The links object contains the `self` object, which contains the resource relationship.
     */
    @JsonProperty(value = "links")
    private ResourceLinks links;

    /*
     * The status of assigning and fetching the resources.
     */
    @JsonProperty(value = "status")
    private ResourceStatus status;

    /**
     * Get the urn property: The uniform resource name (URN) for the resource in the format
     * do:resource_type:resource_id.
     * 
     * @return the urn value.
     */
    public String getUrn() {
        return this.urn;
    }

    /**
     * Set the urn property: The uniform resource name (URN) for the resource in the format
     * do:resource_type:resource_id.
     * 
     * @param urn the urn value to set.
     * @return the Resource object itself.
     */
    public Resource setUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * Get the assignedAt property: A time value given in ISO8601 combined date and time format that represents when
     * the project was created.
     * 
     * @return the assignedAt value.
     */
    public OffsetDateTime getAssignedAt() {
        return this.assignedAt;
    }

    /**
     * Set the assignedAt property: A time value given in ISO8601 combined date and time format that represents when
     * the project was created.
     * 
     * @param assignedAt the assignedAt value to set.
     * @return the Resource object itself.
     */
    public Resource setAssignedAt(OffsetDateTime assignedAt) {
        this.assignedAt = assignedAt;
        return this;
    }

    /**
     * Get the links property: The links object contains the `self` object, which contains the resource relationship.
     * 
     * @return the links value.
     */
    public ResourceLinks getLinks() {
        return this.links;
    }

    /**
     * Set the links property: The links object contains the `self` object, which contains the resource relationship.
     * 
     * @param links the links value to set.
     * @return the Resource object itself.
     */
    public Resource setLinks(ResourceLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get the status property: The status of assigning and fetching the resources.
     * 
     * @return the status value.
     */
    public ResourceStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of assigning and fetching the resources.
     * 
     * @param status the status value to set.
     * @return the Resource object itself.
     */
    public Resource setStatus(ResourceStatus status) {
        this.status = status;
        return this;
    }
}
