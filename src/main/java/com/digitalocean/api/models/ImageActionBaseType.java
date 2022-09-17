package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The action to be taken on the image. Can be either `convert` or `transfer`. */
public final class ImageActionBaseType extends ExpandableStringEnum<ImageActionBaseType> {
    /** Static value convert for ImageActionBaseType. */
    public static final ImageActionBaseType CONVERT = fromString("convert");

    /** Static value transfer for ImageActionBaseType. */
    public static final ImageActionBaseType TRANSFER = fromString("transfer");

    /**
     * Creates or finds a ImageActionBaseType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImageActionBaseType.
     */
    @JsonCreator
    public static ImageActionBaseType fromString(String name) {
        return fromString(name, ImageActionBaseType.class);
    }

    /**
     * Gets known ImageActionBaseType values.
     *
     * @return known ImageActionBaseType values.
     */
    public static Collection<ImageActionBaseType> values() {
        return values(ImageActionBaseType.class);
    }
}
