package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A string representing the current state of the certificate. It may be `pending`, `verified`, or `error`.
 */
public final class CertificateState extends ExpandableStringEnum<CertificateState> {
    /**
     * Static value pending for CertificateState.
     */
    public static final CertificateState PENDING = fromString("pending");

    /**
     * Static value verified for CertificateState.
     */
    public static final CertificateState VERIFIED = fromString("verified");

    /**
     * Static value error for CertificateState.
     */
    public static final CertificateState ERROR = fromString("error");

    /**
     * Creates or finds a CertificateState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CertificateState.
     */
    @JsonCreator
    public static CertificateState fromString(String name) {
        return fromString(name, CertificateState.class);
    }

    /**
     * Gets known CertificateState values.
     * 
     * @return known CertificateState values.
     */
    public static Collection<CertificateState> values() {
        return values(CertificateState.class);
    }
}
