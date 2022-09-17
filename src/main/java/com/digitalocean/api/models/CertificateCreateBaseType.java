package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A string representing the type of the certificate. The value will be `custom` for a user-uploaded certificate or
 * `lets_encrypt` for one automatically generated with Let's Encrypt.
 */
public final class CertificateCreateBaseType extends ExpandableStringEnum<CertificateCreateBaseType> {
    /** Static value custom for CertificateCreateBaseType. */
    public static final CertificateCreateBaseType CUSTOM = fromString("custom");

    /** Static value lets_encrypt for CertificateCreateBaseType. */
    public static final CertificateCreateBaseType LETS_ENCRYPT = fromString("lets_encrypt");

    /**
     * Creates or finds a CertificateCreateBaseType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CertificateCreateBaseType.
     */
    @JsonCreator
    public static CertificateCreateBaseType fromString(String name) {
        return fromString(name, CertificateCreateBaseType.class);
    }

    /**
     * Gets known CertificateCreateBaseType values.
     *
     * @return known CertificateCreateBaseType values.
     */
    public static Collection<CertificateCreateBaseType> values() {
        return values(CertificateCreateBaseType.class);
    }
}
