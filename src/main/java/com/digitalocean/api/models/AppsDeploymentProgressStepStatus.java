package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for AppsDeploymentProgressStepStatus.
 */
public final class AppsDeploymentProgressStepStatus extends ExpandableStringEnum<AppsDeploymentProgressStepStatus> {
    /**
     * Static value UNKNOWN for AppsDeploymentProgressStepStatus.
     */
    public static final AppsDeploymentProgressStepStatus UNKNOWN = fromString("UNKNOWN");

    /**
     * Static value PENDING for AppsDeploymentProgressStepStatus.
     */
    public static final AppsDeploymentProgressStepStatus PENDING = fromString("PENDING");

    /**
     * Static value RUNNING for AppsDeploymentProgressStepStatus.
     */
    public static final AppsDeploymentProgressStepStatus RUNNING = fromString("RUNNING");

    /**
     * Static value ERROR for AppsDeploymentProgressStepStatus.
     */
    public static final AppsDeploymentProgressStepStatus ERROR = fromString("ERROR");

    /**
     * Static value SUCCESS for AppsDeploymentProgressStepStatus.
     */
    public static final AppsDeploymentProgressStepStatus SUCCESS = fromString("SUCCESS");

    /**
     * Creates or finds a AppsDeploymentProgressStepStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AppsDeploymentProgressStepStatus.
     */
    @JsonCreator
    public static AppsDeploymentProgressStepStatus fromString(String name) {
        return fromString(name, AppsDeploymentProgressStepStatus.class);
    }

    /**
     * Gets known AppsDeploymentProgressStepStatus values.
     * 
     * @return known AppsDeploymentProgressStepStatus values.
     */
    public static Collection<AppsDeploymentProgressStepStatus> values() {
        return values(AppsDeploymentProgressStepStatus.class);
    }
}
