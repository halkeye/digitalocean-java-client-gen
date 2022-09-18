package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * - DOCKER_HUB: The DockerHub container registry type.
 * - DOCR: The DigitalOcean container registry type.
 */
public final class AppsImageSourceSpecRegistryType extends ExpandableStringEnum<AppsImageSourceSpecRegistryType> {
    /**
     * Static value DOCKER_HUB for AppsImageSourceSpecRegistryType.
     */
    public static final AppsImageSourceSpecRegistryType DOCKER_HUB = fromString("DOCKER_HUB");

    /**
     * Static value DOCR for AppsImageSourceSpecRegistryType.
     */
    public static final AppsImageSourceSpecRegistryType DOCR = fromString("DOCR");

    /**
     * Creates or finds a AppsImageSourceSpecRegistryType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AppsImageSourceSpecRegistryType.
     */
    @JsonCreator
    public static AppsImageSourceSpecRegistryType fromString(String name) {
        return fromString(name, AppsImageSourceSpecRegistryType.class);
    }

    /**
     * Gets known AppsImageSourceSpecRegistryType values.
     * 
     * @return known AppsImageSourceSpecRegistryType values.
     */
    public static Collection<AppsImageSourceSpecRegistryType> values() {
        return values(AppsImageSourceSpecRegistryType.class);
    }
}
