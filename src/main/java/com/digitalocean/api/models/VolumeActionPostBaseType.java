package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The volume action to initiate.
 */
public final class VolumeActionPostBaseType extends ExpandableStringEnum<VolumeActionPostBaseType> {
    /**
     * Static value attach for VolumeActionPostBaseType.
     */
    public static final VolumeActionPostBaseType ATTACH = fromString("attach");

    /**
     * Static value detach for VolumeActionPostBaseType.
     */
    public static final VolumeActionPostBaseType DETACH = fromString("detach");

    /**
     * Static value resize for VolumeActionPostBaseType.
     */
    public static final VolumeActionPostBaseType RESIZE = fromString("resize");

    /**
     * Creates or finds a VolumeActionPostBaseType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VolumeActionPostBaseType.
     */
    @JsonCreator
    public static VolumeActionPostBaseType fromString(String name) {
        return fromString(name, VolumeActionPostBaseType.class);
    }

    /**
     * Gets known VolumeActionPostBaseType values.
     * 
     * @return known VolumeActionPostBaseType values.
     */
    public static Collection<VolumeActionPostBaseType> values() {
        return values(VolumeActionPostBaseType.class);
    }
}
