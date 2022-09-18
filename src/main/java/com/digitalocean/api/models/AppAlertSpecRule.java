package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for AppAlertSpecRule.
 */
public final class AppAlertSpecRule extends ExpandableStringEnum<AppAlertSpecRule> {
    /**
     * Static value UNSPECIFIED_RULE for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule UNSPECIFIED_RULE = fromString("UNSPECIFIED_RULE");

    /**
     * Static value CPU_UTILIZATION for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule CPUUTILIZATION = fromString("CPU_UTILIZATION");

    /**
     * Static value MEM_UTILIZATION for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule MEMUTILIZATION = fromString("MEM_UTILIZATION");

    /**
     * Static value RESTART_COUNT for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule RESTART_COUNT = fromString("RESTART_COUNT");

    /**
     * Static value DEPLOYMENT_FAILED for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule DEPLOYMENT_FAILED = fromString("DEPLOYMENT_FAILED");

    /**
     * Static value DEPLOYMENT_LIVE for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule DEPLOYMENT_LIVE = fromString("DEPLOYMENT_LIVE");

    /**
     * Static value DOMAIN_FAILED for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule DOMAIN_FAILED = fromString("DOMAIN_FAILED");

    /**
     * Static value DOMAIN_LIVE for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule DOMAIN_LIVE = fromString("DOMAIN_LIVE");

    /**
     * Static value FUNCTIONS_ACTIVATION_COUNT for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule FUNCTIONS_ACTIVATION_COUNT = fromString("FUNCTIONS_ACTIVATION_COUNT");

    /**
     * Static value FUNCTIONS_AVERAGE_DURATION_MS for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule FUNCTIONS_AVERAGE_DURATION_MS = fromString("FUNCTIONS_AVERAGE_DURATION_MS");

    /**
     * Static value FUNCTIONS_ERROR_RATE_PER_MINUTE for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule FUNCTIONS_ERROR_RATE_PERMINUTE = fromString("FUNCTIONS_ERROR_RATE_PER_MINUTE");

    /**
     * Static value FUNCTIONS_AVERAGE_WAIT_TIME_MS for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule FUNCTIONS_AVERAGE_WAIT_TIME_MS = fromString("FUNCTIONS_AVERAGE_WAIT_TIME_MS");

    /**
     * Static value FUNCTIONS_ERROR_COUNT for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule FUNCTIONS_ERROR_COUNT = fromString("FUNCTIONS_ERROR_COUNT");

    /**
     * Static value FUNCTIONS_GB_RATE_PER_SECOND for AppAlertSpecRule.
     */
    public static final AppAlertSpecRule FUNCTIONS_GBRATE_PERSECOND = fromString("FUNCTIONS_GB_RATE_PER_SECOND");

    /**
     * Creates or finds a AppAlertSpecRule from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AppAlertSpecRule.
     */
    @JsonCreator
    public static AppAlertSpecRule fromString(String name) {
        return fromString(name, AppAlertSpecRule.class);
    }

    /**
     * Gets known AppAlertSpecRule values.
     * 
     * @return known AppAlertSpecRule values.
     */
    public static Collection<AppAlertSpecRule> values() {
        return values(AppAlertSpecRule.class);
    }
}
