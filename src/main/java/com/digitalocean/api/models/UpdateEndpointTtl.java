package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The amount of time the content is cached by the CDN's edge servers in seconds. TTL must be one of 60, 600, 3600,
 * 86400, or 604800. Defaults to 3600 (one hour) when excluded.
 */
public final class UpdateEndpointTtl extends ExpandableStringEnum<UpdateEndpointTtl> {
    /** Static value 60 for UpdateEndpointTtl. */
    public static final UpdateEndpointTtl SIXTY = fromInt(60);

    /** Static value 600 for UpdateEndpointTtl. */
    public static final UpdateEndpointTtl SIX_HUNDRED = fromInt(600);

    /** Static value 3600 for UpdateEndpointTtl. */
    public static final UpdateEndpointTtl THREE_THOUSAND_SIX_HUNDRED = fromInt(3600);

    /** Static value 86400 for UpdateEndpointTtl. */
    public static final UpdateEndpointTtl EIGHTY_SIX_THOUSAND_FOUR_HUNDRED = fromInt(86400);

    /** Static value 604800 for UpdateEndpointTtl. */
    public static final UpdateEndpointTtl SIX_HUNDRED_FOUR_THOUSAND_EIGHT_HUNDRED = fromInt(604800);

    /**
     * Creates or finds a UpdateEndpointTtl from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpdateEndpointTtl.
     */
    @JsonCreator
    public static UpdateEndpointTtl fromInt(int name) {
        return fromString(String.valueOf(name), UpdateEndpointTtl.class);
    }

    /**
     * Gets known UpdateEndpointTtl values.
     *
     * @return known UpdateEndpointTtl values.
     */
    public static Collection<UpdateEndpointTtl> values() {
        return values(UpdateEndpointTtl.class);
    }
}
