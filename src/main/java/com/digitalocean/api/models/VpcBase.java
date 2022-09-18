package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * The VpcBase model.
 */
@Fluent
public class VpcBase {
    /*
     * A unique ID that can be used to identify and reference the VPC.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /*
     * The uniform resource name (URN) for the resource in the format do:resource_type:resource_id.
     */
    @JsonProperty(value = "urn")
    private String urn;

    /*
     * A time value given in ISO8601 combined date and time format.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /**
     * Get the id property: A unique ID that can be used to identify and reference the VPC.
     * 
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
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
     * @return the VpcBase object itself.
     */
    public VpcBase setUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
}
