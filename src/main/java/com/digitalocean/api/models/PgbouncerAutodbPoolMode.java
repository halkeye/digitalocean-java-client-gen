package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * PGBouncer pool mode.
 */
public final class PgbouncerAutodbPoolMode extends ExpandableStringEnum<PgbouncerAutodbPoolMode> {
    /**
     * Static value session for PgbouncerAutodbPoolMode.
     */
    public static final PgbouncerAutodbPoolMode SESSION = fromString("session");

    /**
     * Static value transaction for PgbouncerAutodbPoolMode.
     */
    public static final PgbouncerAutodbPoolMode TRANSACTION = fromString("transaction");

    /**
     * Static value statement for PgbouncerAutodbPoolMode.
     */
    public static final PgbouncerAutodbPoolMode STATEMENT = fromString("statement");

    /**
     * Creates or finds a PgbouncerAutodbPoolMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PgbouncerAutodbPoolMode.
     */
    @JsonCreator
    public static PgbouncerAutodbPoolMode fromString(String name) {
        return fromString(name, PgbouncerAutodbPoolMode.class);
    }

    /**
     * Gets known PgbouncerAutodbPoolMode values.
     * 
     * @return known PgbouncerAutodbPoolMode values.
     */
    public static Collection<PgbouncerAutodbPoolMode> values() {
        return values(PgbouncerAutodbPoolMode.class);
    }
}
