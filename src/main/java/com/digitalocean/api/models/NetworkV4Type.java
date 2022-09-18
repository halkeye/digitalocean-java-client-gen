package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of the IPv4 network interface.
 */
public final class NetworkV4Type extends ExpandableStringEnum<NetworkV4Type> {
    /**
     * Static value public for NetworkV4Type.
     */
    public static final NetworkV4Type PUBLIC = fromString("public");

    /**
     * Static value private for NetworkV4Type.
     */
    public static final NetworkV4Type PRIVATE = fromString("private");

    /**
     * Creates or finds a NetworkV4Type from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NetworkV4Type.
     */
    @JsonCreator
    public static NetworkV4Type fromString(String name) {
        return fromString(name, NetworkV4Type.class);
    }

    /**
     * Gets known NetworkV4Type values.
     * 
     * @return known NetworkV4Type values.
     */
    public static Collection<NetworkV4Type> values() {
        return values(NetworkV4Type.class);
    }
}
