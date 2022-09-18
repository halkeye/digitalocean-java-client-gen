package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Components11La32SResponsesReservedIpCreatedContentApplicationJsonSchema model.
 */
@Fluent
public final class Components11La32SResponsesReservedIpCreatedContentApplicationJsonSchema {
    /*
     * The reserved_ip property.
     */
    @JsonProperty(value = "reserved_ip")
    private ReservedIp reservedIp;

    /*
     * The links property.
     */
    @JsonProperty(value = "links")
    private ReservedIpCreatedApplicationJsonProperties links;

    /**
     * Get the reservedIp property: The reserved_ip property.
     * 
     * @return the reservedIp value.
     */
    public ReservedIp getReservedIp() {
        return this.reservedIp;
    }

    /**
     * Set the reservedIp property: The reserved_ip property.
     * 
     * @param reservedIp the reservedIp value to set.
     * @return the Components11La32SResponsesReservedIpCreatedContentApplicationJsonSchema object itself.
     */
    public Components11La32SResponsesReservedIpCreatedContentApplicationJsonSchema setReservedIp(ReservedIp reservedIp) {
        this.reservedIp = reservedIp;
        return this;
    }

    /**
     * Get the links property: The links property.
     * 
     * @return the links value.
     */
    public ReservedIpCreatedApplicationJsonProperties getLinks() {
        return this.links;
    }

    /**
     * Set the links property: The links property.
     * 
     * @param links the links value to set.
     * @return the Components11La32SResponsesReservedIpCreatedContentApplicationJsonSchema object itself.
     */
    public Components11La32SResponsesReservedIpCreatedContentApplicationJsonSchema setLinks(ReservedIpCreatedApplicationJsonProperties links) {
        this.links = links;
        return this;
    }
}
