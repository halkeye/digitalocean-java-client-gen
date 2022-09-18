package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for AppAlertProgressStepStatus.
 */
public final class AppAlertProgressStepStatus extends ExpandableStringEnum<AppAlertProgressStepStatus> {
    /**
     * Static value UNKNOWN for AppAlertProgressStepStatus.
     */
    public static final AppAlertProgressStepStatus UNKNOWN = fromString("UNKNOWN");

    /**
     * Static value PENDING for AppAlertProgressStepStatus.
     */
    public static final AppAlertProgressStepStatus PENDING = fromString("PENDING");

    /**
     * Static value RUNNING for AppAlertProgressStepStatus.
     */
    public static final AppAlertProgressStepStatus RUNNING = fromString("RUNNING");

    /**
     * Static value ERROR for AppAlertProgressStepStatus.
     */
    public static final AppAlertProgressStepStatus ERROR = fromString("ERROR");

    /**
     * Static value SUCCESS for AppAlertProgressStepStatus.
     */
    public static final AppAlertProgressStepStatus SUCCESS = fromString("SUCCESS");

    /**
     * Creates or finds a AppAlertProgressStepStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AppAlertProgressStepStatus.
     */
    @JsonCreator
    public static AppAlertProgressStepStatus fromString(String name) {
        return fromString(name, AppAlertProgressStepStatus.class);
    }

    /**
     * Gets known AppAlertProgressStepStatus values.
     * 
     * @return known AppAlertProgressStepStatus values.
     */
    public static Collection<AppAlertProgressStepStatus> values() {
        return values(AppAlertProgressStepStatus.class);
    }
}
