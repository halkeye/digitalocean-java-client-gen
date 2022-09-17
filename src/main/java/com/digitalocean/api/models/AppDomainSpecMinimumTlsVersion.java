package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The minimum version of TLS a client application can use to access resources for the domain. Must be one of the
 * following values wrapped within quotations: `"1.2"` or `"1.3"`.
 */
public final class AppDomainSpecMinimumTlsVersion extends ExpandableStringEnum<AppDomainSpecMinimumTlsVersion> {
    /** Static value 1.2 for AppDomainSpecMinimumTlsVersion. */
    public static final AppDomainSpecMinimumTlsVersion ONE2 = fromString("1.2");

    /** Static value 1.3 for AppDomainSpecMinimumTlsVersion. */
    public static final AppDomainSpecMinimumTlsVersion ONE3 = fromString("1.3");

    /**
     * Creates or finds a AppDomainSpecMinimumTlsVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AppDomainSpecMinimumTlsVersion.
     */
    @JsonCreator
    public static AppDomainSpecMinimumTlsVersion fromString(String name) {
        return fromString(name, AppDomainSpecMinimumTlsVersion.class);
    }

    /**
     * Gets known AppDomainSpecMinimumTlsVersion values.
     *
     * @return known AppDomainSpecMinimumTlsVersion values.
     */
    public static Collection<AppDomainSpecMinimumTlsVersion> values() {
        return values(AppDomainSpecMinimumTlsVersion.class);
    }
}
