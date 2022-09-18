package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of resource that the snapshot originated from.
 */
public final class SnapshotsResourceType extends ExpandableStringEnum<SnapshotsResourceType> {
    /**
     * Static value droplet for SnapshotsResourceType.
     */
    public static final SnapshotsResourceType DROPLET = fromString("droplet");

    /**
     * Static value volume for SnapshotsResourceType.
     */
    public static final SnapshotsResourceType VOLUME = fromString("volume");

    /**
     * Creates or finds a SnapshotsResourceType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SnapshotsResourceType.
     */
    @JsonCreator
    public static SnapshotsResourceType fromString(String name) {
        return fromString(name, SnapshotsResourceType.class);
    }

    /**
     * Gets known SnapshotsResourceType values.
     * 
     * @return known SnapshotsResourceType values.
     */
    public static Collection<SnapshotsResourceType> values() {
        return values(SnapshotsResourceType.class);
    }
}
