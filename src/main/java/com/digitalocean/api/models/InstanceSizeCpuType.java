package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** - SHARED: Shared vCPU cores - DEDICATED: Dedicated vCPU cores. */
public final class InstanceSizeCpuType extends ExpandableStringEnum<InstanceSizeCpuType> {
    /** Static value UNSPECIFIED for InstanceSizeCpuType. */
    public static final InstanceSizeCpuType UNSPECIFIED = fromString("UNSPECIFIED");

    /** Static value SHARED for InstanceSizeCpuType. */
    public static final InstanceSizeCpuType SHARED = fromString("SHARED");

    /** Static value DEDICATED for InstanceSizeCpuType. */
    public static final InstanceSizeCpuType DEDICATED = fromString("DEDICATED");

    /**
     * Creates or finds a InstanceSizeCpuType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InstanceSizeCpuType.
     */
    @JsonCreator
    public static InstanceSizeCpuType fromString(String name) {
        return fromString(name, InstanceSizeCpuType.class);
    }

    /**
     * Gets known InstanceSizeCpuType values.
     *
     * @return known InstanceSizeCpuType values.
     */
    public static Collection<InstanceSizeCpuType> values() {
        return values(InstanceSizeCpuType.class);
    }
}
