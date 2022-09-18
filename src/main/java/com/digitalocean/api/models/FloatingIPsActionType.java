package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of action to initiate for the floating IP.
 */
public final class FloatingIPsActionType extends ExpandableStringEnum<FloatingIPsActionType> {
    /**
     * Static value assign for FloatingIPsActionType.
     */
    public static final FloatingIPsActionType ASSIGN = fromString("assign");

    /**
     * Static value unassign for FloatingIPsActionType.
     */
    public static final FloatingIPsActionType UNASSIGN = fromString("unassign");

    /**
     * Creates or finds a FloatingIPsActionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FloatingIPsActionType.
     */
    @JsonCreator
    public static FloatingIPsActionType fromString(String name) {
        return fromString(name, FloatingIPsActionType.class);
    }

    /**
     * Gets known FloatingIPsActionType values.
     * 
     * @return known FloatingIPsActionType values.
     */
    public static Collection<FloatingIPsActionType> values() {
        return values(FloatingIPsActionType.class);
    }
}
