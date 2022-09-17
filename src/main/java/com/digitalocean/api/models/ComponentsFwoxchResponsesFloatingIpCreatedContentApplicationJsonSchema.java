package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsFwoxchResponsesFloatingIpCreatedContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsFwoxchResponsesFloatingIpCreatedContentApplicationJsonSchema {
    /*
     * The floating_ip property.
     */
    @JsonProperty(value = "floating_ip")
    private FloatingIp floatingIp;

    /*
     * The links property.
     */
    @JsonProperty(value = "links")
    private FloatingIpCreatedApplicationJsonProperties links;

    /**
     * Get the floatingIp property: The floating_ip property.
     *
     * @return the floatingIp value.
     */
    public FloatingIp getFloatingIp() {
        return this.floatingIp;
    }

    /**
     * Set the floatingIp property: The floating_ip property.
     *
     * @param floatingIp the floatingIp value to set.
     * @return the ComponentsFwoxchResponsesFloatingIpCreatedContentApplicationJsonSchema object itself.
     */
    public ComponentsFwoxchResponsesFloatingIpCreatedContentApplicationJsonSchema setFloatingIp(FloatingIp floatingIp) {
        this.floatingIp = floatingIp;
        return this;
    }

    /**
     * Get the links property: The links property.
     *
     * @return the links value.
     */
    public FloatingIpCreatedApplicationJsonProperties getLinks() {
        return this.links;
    }

    /**
     * Set the links property: The links property.
     *
     * @param links the links value to set.
     * @return the ComponentsFwoxchResponsesFloatingIpCreatedContentApplicationJsonSchema object itself.
     */
    public ComponentsFwoxchResponsesFloatingIpCreatedContentApplicationJsonSchema setLinks(
            FloatingIpCreatedApplicationJsonProperties links) {
        this.links = links;
        return this;
    }
}
