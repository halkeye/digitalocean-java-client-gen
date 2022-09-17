package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Describes the kind of image. It may be one of `snapshot` or `backup`. This specifies whether an image is a
 * user-generated Droplet snapshot or automatically created Droplet backup.
 */
public final class DropletSnapshotType extends ExpandableStringEnum<DropletSnapshotType> {
    /** Static value snapshot for DropletSnapshotType. */
    public static final DropletSnapshotType SNAPSHOT = fromString("snapshot");

    /** Static value backup for DropletSnapshotType. */
    public static final DropletSnapshotType BACKUP = fromString("backup");

    /**
     * Creates or finds a DropletSnapshotType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DropletSnapshotType.
     */
    @JsonCreator
    public static DropletSnapshotType fromString(String name) {
        return fromString(name, DropletSnapshotType.class);
    }

    /**
     * Gets known DropletSnapshotType values.
     *
     * @return known DropletSnapshotType values.
     */
    public static Collection<DropletSnapshotType> values() {
        return values(DropletSnapshotType.class);
    }
}
