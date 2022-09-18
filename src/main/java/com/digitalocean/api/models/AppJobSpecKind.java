package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * - UNSPECIFIED: Default job type, will auto-complete to POST_DEPLOY kind.
 * - PRE_DEPLOY: Indicates a job that runs before an app deployment.
 * - POST_DEPLOY: Indicates a job that runs after an app deployment.
 * - FAILED_DEPLOY: Indicates a job that runs after a component fails to deploy.
 */
public final class AppJobSpecKind extends ExpandableStringEnum<AppJobSpecKind> {
    /**
     * Static value UNSPECIFIED for AppJobSpecKind.
     */
    public static final AppJobSpecKind UNSPECIFIED = fromString("UNSPECIFIED");

    /**
     * Static value PRE_DEPLOY for AppJobSpecKind.
     */
    public static final AppJobSpecKind PREDEPLOY = fromString("PRE_DEPLOY");

    /**
     * Static value POST_DEPLOY for AppJobSpecKind.
     */
    public static final AppJobSpecKind POST_DEPLOY = fromString("POST_DEPLOY");

    /**
     * Static value FAILED_DEPLOY for AppJobSpecKind.
     */
    public static final AppJobSpecKind FAILED_DEPLOY = fromString("FAILED_DEPLOY");

    /**
     * Creates or finds a AppJobSpecKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AppJobSpecKind.
     */
    @JsonCreator
    public static AppJobSpecKind fromString(String name) {
        return fromString(name, AppJobSpecKind.class);
    }

    /**
     * Gets known AppJobSpecKind values.
     * 
     * @return known AppJobSpecKind values.
     */
    public static Collection<AppJobSpecKind> values() {
        return values(AppJobSpecKind.class);
    }
}
