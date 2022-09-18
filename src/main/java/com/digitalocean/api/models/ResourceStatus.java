package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The status of assigning and fetching the resources.
 */
public final class ResourceStatus extends ExpandableStringEnum<ResourceStatus> {
    /**
     * Static value ok for ResourceStatus.
     */
    public static final ResourceStatus OK = fromString("ok");

    /**
     * Static value not_found for ResourceStatus.
     */
    public static final ResourceStatus NOT_FOUND = fromString("not_found");

    /**
     * Static value assigned for ResourceStatus.
     */
    public static final ResourceStatus ASSIGNED = fromString("assigned");

    /**
     * Static value already_assigned for ResourceStatus.
     */
    public static final ResourceStatus ALREADY_ASSIGNED = fromString("already_assigned");

    /**
     * Static value service_down for ResourceStatus.
     */
    public static final ResourceStatus SERVICE_DOWN = fromString("service_down");

    /**
     * Creates or finds a ResourceStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ResourceStatus.
     */
    @JsonCreator
    public static ResourceStatus fromString(String name) {
        return fromString(name, ResourceStatus.class);
    }

    /**
     * Gets known ResourceStatus values.
     * 
     * @return known ResourceStatus values.
     */
    public static Collection<ResourceStatus> values() {
        return values(ResourceStatus.class);
    }
}
