package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * An attribute indicating how and if requests from a client will be persistently served by the same backend Droplet. The possible values are `cookies` or `none`.
 */
public final class StickySessionsType extends ExpandableStringEnum<StickySessionsType> {
    /**
     * Static value cookies for StickySessionsType.
     */
    public static final StickySessionsType COOKIES = fromString("cookies");

    /**
     * Static value none for StickySessionsType.
     */
    public static final StickySessionsType NONE = fromString("none");

    /**
     * Creates or finds a StickySessionsType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding StickySessionsType.
     */
    @JsonCreator
    public static StickySessionsType fromString(String name) {
        return fromString(name, StickySessionsType.class);
    }

    /**
     * Gets known StickySessionsType values.
     * 
     * @return known StickySessionsType values.
     */
    public static Collection<StickySessionsType> values() {
        return values(StickySessionsType.class);
    }
}
