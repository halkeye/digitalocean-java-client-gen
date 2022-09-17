package com.digitalocean.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Selects one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze, etc. */
public enum PostfixLogLinePrefix {
    /** Enum value pid=%p,user=%u,db=%d,app=%a,client=%h. */
    FIRST_OPTION("pid=%p,user=%u,db=%d,app=%a,client=%h"),

    /** Enum value %m [%p] %q[user=%u,db=%d,app=%a]. */
    SECOND_OPTION("%m [%p] %q[user=%u,db=%d,app=%a]"),

    /** Enum value %t [%p]: [%l-1] user=%u,db=%d,app=%a,client=%h. */
    THIRD_OPTION("%t [%p]: [%l-1] user=%u,db=%d,app=%a,client=%h");

    /** The actual serialized value for a PostfixLogLinePrefix instance. */
    private final String value;

    PostfixLogLinePrefix(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PostfixLogLinePrefix instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PostfixLogLinePrefix object, or null if unable to parse.
     */
    @JsonCreator
    public static PostfixLogLinePrefix fromString(String value) {
        if (value == null) {
            return null;
        }
        PostfixLogLinePrefix[] items = PostfixLogLinePrefix.values();
        for (PostfixLogLinePrefix item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
