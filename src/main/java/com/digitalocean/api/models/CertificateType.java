package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A string representing the type of the certificate. The value will be `custom` for a user-uploaded certificate or
 * `lets_encrypt` for one automatically generated with Let's Encrypt.
 */
public final class CertificateType extends ExpandableStringEnum<CertificateType> {
    /** Static value custom for CertificateType. */
    public static final CertificateType CUSTOM = fromString("custom");

    /** Static value lets_encrypt for CertificateType. */
    public static final CertificateType LETS_ENCRYPT = fromString("lets_encrypt");

    /**
     * Creates or finds a CertificateType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CertificateType.
     */
    @JsonCreator
    public static CertificateType fromString(String name) {
        return fromString(name, CertificateType.class);
    }

    /**
     * Gets known CertificateType values.
     *
     * @return known CertificateType values.
     */
    public static Collection<CertificateType> values() {
        return values(CertificateType.class);
    }
}
