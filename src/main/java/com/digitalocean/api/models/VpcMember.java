package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VpcMember model. */
@Fluent
public final class VpcMember {
    /*
     * The name of the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The uniform resource name (URN) for the resource in the format do:resource_type:resource_id.
     */
    @JsonProperty(value = "urn")
    private String urn;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the resource was created.
     */
    @JsonProperty(value = "created_at")
    private String createdAt;

    /**
     * Get the name property: The name of the resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource.
     *
     * @param name the name value to set.
     * @return the VpcMember object itself.
     */
    public VpcMember setName(String name) {
        this.name = name;
        return this;
    }

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
     * @return the VpcMember object itself.
     */
    public VpcMember setUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * resource was created.
     *
     * @return the createdAt value.
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * resource was created.
     *
     * @param createdAt the createdAt value to set.
     * @return the VpcMember object itself.
     */
    public VpcMember setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
