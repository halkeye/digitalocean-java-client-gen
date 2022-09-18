package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of action to initiate for the reserved IP.
 */
public final class ReservedIpActionTypeType extends ExpandableStringEnum<ReservedIpActionTypeType> {
    /**
     * Static value assign for ReservedIpActionTypeType.
     */
    public static final ReservedIpActionTypeType ASSIGN = fromString("assign");

    /**
     * Static value unassign for ReservedIpActionTypeType.
     */
    public static final ReservedIpActionTypeType UNASSIGN = fromString("unassign");

    /**
     * Creates or finds a ReservedIpActionTypeType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ReservedIpActionTypeType.
     */
    @JsonCreator
    public static ReservedIpActionTypeType fromString(String name) {
        return fromString(name, ReservedIpActionTypeType.class);
    }

    /**
     * Gets known ReservedIpActionTypeType values.
     * 
     * @return known ReservedIpActionTypeType values.
     */
    public static Collection<ReservedIpActionTypeType> values() {
        return values(ReservedIpActionTypeType.class);
    }
}
