package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for Enum48.
 */
public final class Enum48 extends ExpandableStringEnum<Enum48> {
    /**
     * Static value A for Enum48.
     */
    public static final Enum48 A = fromString("A");

    /**
     * Static value AAAA for Enum48.
     */
    public static final Enum48 AAAA = fromString("AAAA");

    /**
     * Static value CAA for Enum48.
     */
    public static final Enum48 CAA = fromString("CAA");

    /**
     * Static value CNAME for Enum48.
     */
    public static final Enum48 CNAME = fromString("CNAME");

    /**
     * Static value MX for Enum48.
     */
    public static final Enum48 MX = fromString("MX");

    /**
     * Static value NS for Enum48.
     */
    public static final Enum48 NS = fromString("NS");

    /**
     * Static value SOA for Enum48.
     */
    public static final Enum48 SOA = fromString("SOA");

    /**
     * Static value SRV for Enum48.
     */
    public static final Enum48 SRV = fromString("SRV");

    /**
     * Static value TXT for Enum48.
     */
    public static final Enum48 TXT = fromString("TXT");

    /**
     * Creates or finds a Enum48 from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Enum48.
     */
    @JsonCreator
    public static Enum48 fromString(String name) {
        return fromString(name, Enum48.class);
    }

    /**
     * Gets known Enum48 values.
     * 
     * @return known Enum48 values.
     */
    public static Collection<Enum48> values() {
        return values(Enum48.class);
    }
}
