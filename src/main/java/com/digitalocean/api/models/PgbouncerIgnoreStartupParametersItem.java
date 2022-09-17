package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enum of parameters to ignore when given in startup packet. */
public final class PgbouncerIgnoreStartupParametersItem
        extends ExpandableStringEnum<PgbouncerIgnoreStartupParametersItem> {
    /** Static value extra_float_digits for PgbouncerIgnoreStartupParametersItem. */
    public static final PgbouncerIgnoreStartupParametersItem EXTRA_FLOAT_DIGITS = fromString("extra_float_digits");

    /** Static value search_path for PgbouncerIgnoreStartupParametersItem. */
    public static final PgbouncerIgnoreStartupParametersItem SEARCH_PATH = fromString("search_path");

    /**
     * Creates or finds a PgbouncerIgnoreStartupParametersItem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PgbouncerIgnoreStartupParametersItem.
     */
    @JsonCreator
    public static PgbouncerIgnoreStartupParametersItem fromString(String name) {
        return fromString(name, PgbouncerIgnoreStartupParametersItem.class);
    }

    /**
     * Gets known PgbouncerIgnoreStartupParametersItem values.
     *
     * @return known PgbouncerIgnoreStartupParametersItem values.
     */
    public static Collection<PgbouncerIgnoreStartupParametersItem> values() {
        return values(PgbouncerIgnoreStartupParametersItem.class);
    }
}
