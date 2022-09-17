package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The slug form of the geographical origin of the app. Default: `nearest available`. */
public final class AppSpecRegion extends ExpandableStringEnum<AppSpecRegion> {
    /** Static value ams for AppSpecRegion. */
    public static final AppSpecRegion AMS = fromString("ams");

    /** Static value nyc for AppSpecRegion. */
    public static final AppSpecRegion NYC = fromString("nyc");

    /** Static value fra for AppSpecRegion. */
    public static final AppSpecRegion FRA = fromString("fra");

    /**
     * Creates or finds a AppSpecRegion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AppSpecRegion.
     */
    @JsonCreator
    public static AppSpecRegion fromString(String name) {
        return fromString(name, AppSpecRegion.class);
    }

    /**
     * Gets known AppSpecRegion values.
     *
     * @return known AppSpecRegion values.
     */
    public static Collection<AppSpecRegion> values() {
        return values(AppSpecRegion.class);
    }
}
