package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** A status string indicating the state of the Droplet instance. This may be "new", "active", "off", or "archive". */
public final class DropletStatus extends ExpandableStringEnum<DropletStatus> {
    /** Static value new for DropletStatus. */
    public static final DropletStatus NEW = fromString("new");

    /** Static value active for DropletStatus. */
    public static final DropletStatus ACTIVE = fromString("active");

    /** Static value off for DropletStatus. */
    public static final DropletStatus OFF = fromString("off");

    /** Static value archive for DropletStatus. */
    public static final DropletStatus ARCHIVE = fromString("archive");

    /**
     * Creates or finds a DropletStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DropletStatus.
     */
    @JsonCreator
    public static DropletStatus fromString(String name) {
        return fromString(name, DropletStatus.class);
    }

    /**
     * Gets known DropletStatus values.
     *
     * @return known DropletStatus values.
     */
    public static Collection<DropletStatus> values() {
        return values(DropletStatus.class);
    }
}
