package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CertificateCreateBase model. */
@Fluent
public class CertificateCreateBase {
    /*
     * A unique human-readable name referring to a certificate.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A string representing the type of the certificate. The value will be `custom` for a user-uploaded certificate or
     * `lets_encrypt` for one automatically generated with Let's Encrypt.
     */
    @JsonProperty(value = "type")
    private CertificateCreateBaseType type;

    /**
     * Get the name property: A unique human-readable name referring to a certificate.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A unique human-readable name referring to a certificate.
     *
     * @param name the name value to set.
     * @return the CertificateCreateBase object itself.
     */
    public CertificateCreateBase setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: A string representing the type of the certificate. The value will be `custom` for a
     * user-uploaded certificate or `lets_encrypt` for one automatically generated with Let's Encrypt.
     *
     * @return the type value.
     */
    public CertificateCreateBaseType getType() {
        return this.type;
    }

    /**
     * Set the type property: A string representing the type of the certificate. The value will be `custom` for a
     * user-uploaded certificate or `lets_encrypt` for one automatically generated with Let's Encrypt.
     *
     * @param type the type value to set.
     * @return the CertificateCreateBase object itself.
     */
    public CertificateCreateBase setType(CertificateCreateBaseType type) {
        this.type = type;
        return this;
    }
}
