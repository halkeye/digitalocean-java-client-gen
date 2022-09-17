package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Describes the kind of image. It may be one of `base`, `snapshot`, `backup`, `custom`, or `admin`. Respectively, this
 * specifies whether an image is a DigitalOcean base OS image, user-generated Droplet snapshot, automatically created
 * Droplet backup, user-provided virtual machine image, or an image used for DigitalOcean managed resources (e.g. DOKS
 * worker nodes).
 */
public final class ImageType extends ExpandableStringEnum<ImageType> {
    /** Static value base for ImageType. */
    public static final ImageType BASE = fromString("base");

    /** Static value snapshot for ImageType. */
    public static final ImageType SNAPSHOT = fromString("snapshot");

    /** Static value backup for ImageType. */
    public static final ImageType BACKUP = fromString("backup");

    /** Static value custom for ImageType. */
    public static final ImageType CUSTOM = fromString("custom");

    /** Static value admin for ImageType. */
    public static final ImageType ADMIN = fromString("admin");

    /**
     * Creates or finds a ImageType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImageType.
     */
    @JsonCreator
    public static ImageType fromString(String name) {
        return fromString(name, ImageType.class);
    }

    /**
     * Gets known ImageType values.
     *
     * @return known ImageType values.
     */
    public static Collection<ImageType> values() {
        return values(ImageType.class);
    }
}
