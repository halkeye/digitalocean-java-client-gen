package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * - DEFAULT: The default `.ondigitalocean.app` domain assigned to this app
 * - PRIMARY: The primary domain for this app that is displayed as the default in the control panel, used in bindable environment variables, and any other places that reference an app's live URL. Only one domain may be set as primary.
 * - ALIAS: A non-primary domain.
 */
public final class AppDomainSpecType extends ExpandableStringEnum<AppDomainSpecType> {
    /**
     * Static value UNSPECIFIED for AppDomainSpecType.
     */
    public static final AppDomainSpecType UNSPECIFIED = fromString("UNSPECIFIED");

    /**
     * Static value DEFAULT for AppDomainSpecType.
     */
    public static final AppDomainSpecType DEFAULT = fromString("DEFAULT");

    /**
     * Static value PRIMARY for AppDomainSpecType.
     */
    public static final AppDomainSpecType PRIMARY = fromString("PRIMARY");

    /**
     * Static value ALIAS for AppDomainSpecType.
     */
    public static final AppDomainSpecType ALIAS = fromString("ALIAS");

    /**
     * Creates or finds a AppDomainSpecType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AppDomainSpecType.
     */
    @JsonCreator
    public static AppDomainSpecType fromString(String name) {
        return fromString(name, AppDomainSpecType.class);
    }

    /**
     * Gets known AppDomainSpecType values.
     * 
     * @return known AppDomainSpecType values.
     */
    public static Collection<AppDomainSpecType> values() {
        return values(AppDomainSpecType.class);
    }
}
