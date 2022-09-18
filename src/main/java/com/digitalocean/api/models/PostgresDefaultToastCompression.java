package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the default TOAST compression method for values of compressible columns (the default is lz4).
 */
public final class PostgresDefaultToastCompression extends ExpandableStringEnum<PostgresDefaultToastCompression> {
    /**
     * Static value lz4 for PostgresDefaultToastCompression.
     */
    public static final PostgresDefaultToastCompression LZ4 = fromString("lz4");

    /**
     * Static value pglz for PostgresDefaultToastCompression.
     */
    public static final PostgresDefaultToastCompression PGLZ = fromString("pglz");

    /**
     * Creates or finds a PostgresDefaultToastCompression from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PostgresDefaultToastCompression.
     */
    @JsonCreator
    public static PostgresDefaultToastCompression fromString(String name) {
        return fromString(name, PostgresDefaultToastCompression.class);
    }

    /**
     * Gets known PostgresDefaultToastCompression values.
     * 
     * @return known PostgresDefaultToastCompression values.
     */
    public static Collection<PostgresDefaultToastCompression> values() {
        return values(PostgresDefaultToastCompression.class);
    }
}
