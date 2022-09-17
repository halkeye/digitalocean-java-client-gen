package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AppAlertSpecOperator. */
public final class AppAlertSpecOperator extends ExpandableStringEnum<AppAlertSpecOperator> {
    /** Static value UNSPECIFIED_OPERATOR for AppAlertSpecOperator. */
    public static final AppAlertSpecOperator UNSPECIFIED_OPERATOR = fromString("UNSPECIFIED_OPERATOR");

    /** Static value GREATER_THAN for AppAlertSpecOperator. */
    public static final AppAlertSpecOperator GREATER_THAN = fromString("GREATER_THAN");

    /** Static value LESS_THAN for AppAlertSpecOperator. */
    public static final AppAlertSpecOperator LESS_THAN = fromString("LESS_THAN");

    /**
     * Creates or finds a AppAlertSpecOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AppAlertSpecOperator.
     */
    @JsonCreator
    public static AppAlertSpecOperator fromString(String name) {
        return fromString(name, AppAlertSpecOperator.class);
    }

    /**
     * Gets known AppAlertSpecOperator values.
     *
     * @return known AppAlertSpecOperator values.
     */
    public static Collection<AppAlertSpecOperator> values() {
        return values(AppAlertSpecOperator.class);
    }
}
