package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AppsDomainPhase. */
public final class AppsDomainPhase extends ExpandableStringEnum<AppsDomainPhase> {
    /** Static value UNKNOWN for AppsDomainPhase. */
    public static final AppsDomainPhase UNKNOWN = fromString("UNKNOWN");

    /** Static value PENDING for AppsDomainPhase. */
    public static final AppsDomainPhase PENDING = fromString("PENDING");

    /** Static value CONFIGURING for AppsDomainPhase. */
    public static final AppsDomainPhase CONFIGURING = fromString("CONFIGURING");

    /** Static value ACTIVE for AppsDomainPhase. */
    public static final AppsDomainPhase ACTIVE = fromString("ACTIVE");

    /** Static value ERROR for AppsDomainPhase. */
    public static final AppsDomainPhase ERROR = fromString("ERROR");

    /**
     * Creates or finds a AppsDomainPhase from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AppsDomainPhase.
     */
    @JsonCreator
    public static AppsDomainPhase fromString(String name) {
        return fromString(name, AppsDomainPhase.class);
    }

    /**
     * Gets known AppsDomainPhase values.
     *
     * @return known AppsDomainPhase values.
     */
    public static Collection<AppsDomainPhase> values() {
        return values(AppsDomainPhase.class);
    }
}
