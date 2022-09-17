package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A status string indicating the state of a custom image. This may be `NEW`, `available`, `pending`, `deleted`, or
 * `retired`.
 */
public final class ImageStatus extends ExpandableStringEnum<ImageStatus> {
    /** Static value NEW for ImageStatus. */
    public static final ImageStatus NEW = fromString("NEW");

    /** Static value available for ImageStatus. */
    public static final ImageStatus AVAILABLE = fromString("available");

    /** Static value pending for ImageStatus. */
    public static final ImageStatus PENDING = fromString("pending");

    /** Static value deleted for ImageStatus. */
    public static final ImageStatus DELETED = fromString("deleted");

    /** Static value retired for ImageStatus. */
    public static final ImageStatus RETIRED = fromString("retired");

    /**
     * Creates or finds a ImageStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImageStatus.
     */
    @JsonCreator
    public static ImageStatus fromString(String name) {
        return fromString(name, ImageStatus.class);
    }

    /**
     * Gets known ImageStatus values.
     *
     * @return known ImageStatus values.
     */
    public static Collection<ImageStatus> values() {
        return values(ImageStatus.class);
    }
}
