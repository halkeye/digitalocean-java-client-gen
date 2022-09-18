package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of action to initiate for the Droplet.
 */
public final class DropletActionType extends ExpandableStringEnum<DropletActionType> {
    /**
     * Static value enable_backups for DropletActionType.
     */
    public static final DropletActionType ENABLE_BACKUPS = fromString("enable_backups");

    /**
     * Static value disable_backups for DropletActionType.
     */
    public static final DropletActionType DISABLE_BACKUPS = fromString("disable_backups");

    /**
     * Static value reboot for DropletActionType.
     */
    public static final DropletActionType REBOOT = fromString("reboot");

    /**
     * Static value power_cycle for DropletActionType.
     */
    public static final DropletActionType POWER_CYCLE = fromString("power_cycle");

    /**
     * Static value shutdown for DropletActionType.
     */
    public static final DropletActionType SHUTDOWN = fromString("shutdown");

    /**
     * Static value power_off for DropletActionType.
     */
    public static final DropletActionType POWER_OFF = fromString("power_off");

    /**
     * Static value power_on for DropletActionType.
     */
    public static final DropletActionType POWER_ON = fromString("power_on");

    /**
     * Static value restore for DropletActionType.
     */
    public static final DropletActionType RESTORE = fromString("restore");

    /**
     * Static value password_reset for DropletActionType.
     */
    public static final DropletActionType PASSWORD_RESET = fromString("password_reset");

    /**
     * Static value resize for DropletActionType.
     */
    public static final DropletActionType RESIZE = fromString("resize");

    /**
     * Static value rebuild for DropletActionType.
     */
    public static final DropletActionType REBUILD = fromString("rebuild");

    /**
     * Static value rename for DropletActionType.
     */
    public static final DropletActionType RENAME = fromString("rename");

    /**
     * Static value change_kernel for DropletActionType.
     */
    public static final DropletActionType CHANGE_KERNEL = fromString("change_kernel");

    /**
     * Static value enable_ipv6 for DropletActionType.
     */
    public static final DropletActionType ENABLE_IPV6 = fromString("enable_ipv6");

    /**
     * Static value snapshot for DropletActionType.
     */
    public static final DropletActionType SNAPSHOT = fromString("snapshot");

    /**
     * Creates or finds a DropletActionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DropletActionType.
     */
    @JsonCreator
    public static DropletActionType fromString(String name) {
        return fromString(name, DropletActionType.class);
    }

    /**
     * Gets known DropletActionType values.
     * 
     * @return known DropletActionType values.
     */
    public static Collection<DropletActionType> values() {
        return values(DropletActionType.class);
    }
}
