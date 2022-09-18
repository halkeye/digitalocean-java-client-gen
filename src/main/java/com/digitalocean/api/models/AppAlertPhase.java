package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for AppAlertPhase.
 */
public final class AppAlertPhase extends ExpandableStringEnum<AppAlertPhase> {
    /**
     * Static value UNKNOWN for AppAlertPhase.
     */
    public static final AppAlertPhase UNKNOWN = fromString("UNKNOWN");

    /**
     * Static value PENDING for AppAlertPhase.
     */
    public static final AppAlertPhase PENDING = fromString("PENDING");

    /**
     * Static value CONFIGURING for AppAlertPhase.
     */
    public static final AppAlertPhase CONFIGURING = fromString("CONFIGURING");

    /**
     * Static value ACTIVE for AppAlertPhase.
     */
    public static final AppAlertPhase ACTIVE = fromString("ACTIVE");

    /**
     * Static value ERROR for AppAlertPhase.
     */
    public static final AppAlertPhase ERROR = fromString("ERROR");

    /**
     * Creates or finds a AppAlertPhase from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AppAlertPhase.
     */
    @JsonCreator
    public static AppAlertPhase fromString(String name) {
        return fromString(name, AppAlertPhase.class);
    }

    /**
     * Gets known AppAlertPhase values.
     * 
     * @return known AppAlertPhase values.
     */
    public static Collection<AppAlertPhase> values() {
        return values(AppAlertPhase.class);
    }
}
