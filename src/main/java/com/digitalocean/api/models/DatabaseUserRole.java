package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A string representing the database user's role. The value will be either
 * "primary" or "normal".
 */
public final class DatabaseUserRole extends ExpandableStringEnum<DatabaseUserRole> {
    /**
     * Static value primary for DatabaseUserRole.
     */
    public static final DatabaseUserRole PRIMARY = fromString("primary");

    /**
     * Static value normal for DatabaseUserRole.
     */
    public static final DatabaseUserRole NORMAL = fromString("normal");

    /**
     * Creates or finds a DatabaseUserRole from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DatabaseUserRole.
     */
    @JsonCreator
    public static DatabaseUserRole fromString(String name) {
        return fromString(name, DatabaseUserRole.class);
    }

    /**
     * Gets known DatabaseUserRole values.
     * 
     * @return known DatabaseUserRole values.
     */
    public static Collection<DatabaseUserRole> values() {
        return values(DatabaseUserRole.class);
    }
}
