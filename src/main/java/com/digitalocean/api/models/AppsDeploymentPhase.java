package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for AppsDeploymentPhase.
 */
public final class AppsDeploymentPhase extends ExpandableStringEnum<AppsDeploymentPhase> {
    /**
     * Static value UNKNOWN for AppsDeploymentPhase.
     */
    public static final AppsDeploymentPhase UNKNOWN = fromString("UNKNOWN");

    /**
     * Static value PENDING_BUILD for AppsDeploymentPhase.
     */
    public static final AppsDeploymentPhase PENDING_BUILD = fromString("PENDING_BUILD");

    /**
     * Static value BUILDING for AppsDeploymentPhase.
     */
    public static final AppsDeploymentPhase BUILDING = fromString("BUILDING");

    /**
     * Static value PENDING_DEPLOY for AppsDeploymentPhase.
     */
    public static final AppsDeploymentPhase PENDING_DEPLOY = fromString("PENDING_DEPLOY");

    /**
     * Static value DEPLOYING for AppsDeploymentPhase.
     */
    public static final AppsDeploymentPhase DEPLOYING = fromString("DEPLOYING");

    /**
     * Static value ACTIVE for AppsDeploymentPhase.
     */
    public static final AppsDeploymentPhase ACTIVE = fromString("ACTIVE");

    /**
     * Static value SUPERSEDED for AppsDeploymentPhase.
     */
    public static final AppsDeploymentPhase SUPERSEDED = fromString("SUPERSEDED");

    /**
     * Static value ERROR for AppsDeploymentPhase.
     */
    public static final AppsDeploymentPhase ERROR = fromString("ERROR");

    /**
     * Static value CANCELED for AppsDeploymentPhase.
     */
    public static final AppsDeploymentPhase CANCELED = fromString("CANCELED");

    /**
     * Creates or finds a AppsDeploymentPhase from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AppsDeploymentPhase.
     */
    @JsonCreator
    public static AppsDeploymentPhase fromString(String name) {
        return fromString(name, AppsDeploymentPhase.class);
    }

    /**
     * Gets known AppsDeploymentPhase values.
     * 
     * @return known AppsDeploymentPhase values.
     */
    public static Collection<AppsDeploymentPhase> values() {
        return values(AppsDeploymentPhase.class);
    }
}
