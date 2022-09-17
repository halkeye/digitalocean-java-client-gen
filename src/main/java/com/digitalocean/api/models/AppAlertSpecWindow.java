package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AppAlertSpecWindow. */
public final class AppAlertSpecWindow extends ExpandableStringEnum<AppAlertSpecWindow> {
    /** Static value UNSPECIFIED_WINDOW for AppAlertSpecWindow. */
    public static final AppAlertSpecWindow UNSPECIFIED_WINDOW = fromString("UNSPECIFIED_WINDOW");

    /** Static value FIVE_MINUTES for AppAlertSpecWindow. */
    public static final AppAlertSpecWindow FIVE_MINUTES = fromString("FIVE_MINUTES");

    /** Static value TEN_MINUTES for AppAlertSpecWindow. */
    public static final AppAlertSpecWindow TENMINUTES = fromString("TEN_MINUTES");

    /** Static value THIRTY_MINUTES for AppAlertSpecWindow. */
    public static final AppAlertSpecWindow THIRTY_MINUTES = fromString("THIRTY_MINUTES");

    /** Static value ONE_HOUR for AppAlertSpecWindow. */
    public static final AppAlertSpecWindow ONEHOUR = fromString("ONE_HOUR");

    /**
     * Creates or finds a AppAlertSpecWindow from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AppAlertSpecWindow.
     */
    @JsonCreator
    public static AppAlertSpecWindow fromString(String name) {
        return fromString(name, AppAlertSpecWindow.class);
    }

    /**
     * Gets known AppAlertSpecWindow values.
     *
     * @return known AppAlertSpecWindow values.
     */
    public static Collection<AppAlertSpecWindow> values() {
        return values(AppAlertSpecWindow.class);
    }
}
