package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of the resource.
 */
public final class TagsResourceResourcesItemResourceType extends ExpandableStringEnum<TagsResourceResourcesItemResourceType> {
    /**
     * Static value droplet for TagsResourceResourcesItemResourceType.
     */
    public static final TagsResourceResourcesItemResourceType DROPLET = fromString("droplet");

    /**
     * Static value image for TagsResourceResourcesItemResourceType.
     */
    public static final TagsResourceResourcesItemResourceType IMAGE = fromString("image");

    /**
     * Static value volume for TagsResourceResourcesItemResourceType.
     */
    public static final TagsResourceResourcesItemResourceType VOLUME = fromString("volume");

    /**
     * Static value volume_snapshot for TagsResourceResourcesItemResourceType.
     */
    public static final TagsResourceResourcesItemResourceType VOLUME_SNAPSHOT = fromString("volume_snapshot");

    /**
     * Creates or finds a TagsResourceResourcesItemResourceType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TagsResourceResourcesItemResourceType.
     */
    @JsonCreator
    public static TagsResourceResourcesItemResourceType fromString(String name) {
        return fromString(name, TagsResourceResourcesItemResourceType.class);
    }

    /**
     * Gets known TagsResourceResourcesItemResourceType values.
     * 
     * @return known TagsResourceResourcesItemResourceType values.
     */
    public static Collection<TagsResourceResourcesItemResourceType> values() {
        return values(TagsResourceResourcesItemResourceType.class);
    }
}
