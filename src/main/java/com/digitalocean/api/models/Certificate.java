package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** The Certificate model. */
@Fluent
public final class Certificate {
    /*
     * A unique ID that can be used to identify and reference a certificate.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /*
     * A unique human-readable name referring to a certificate.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A time value given in ISO8601 combined date and time format that represents the certificate's expiration date.
     */
    @JsonProperty(value = "not_after", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime notAfter;

    /*
     * A unique identifier generated from the SHA-1 fingerprint of the certificate.
     */
    @JsonProperty(value = "sha1_fingerprint", access = JsonProperty.Access.WRITE_ONLY)
    private String sha1Fingerprint;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the certificate was created.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * An array of fully qualified domain names (FQDNs) for which the certificate was issued.
     */
    @JsonProperty(value = "dns_names")
    private List<String> dnsNames;

    /*
     * A string representing the current state of the certificate. It may be `pending`, `verified`, or `error`.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateState state;

    /*
     * A string representing the type of the certificate. The value will be `custom` for a user-uploaded certificate or
     * `lets_encrypt` for one automatically generated with Let's Encrypt.
     */
    @JsonProperty(value = "type")
    private CertificateType type;

    /**
     * Get the id property: A unique ID that can be used to identify and reference a certificate.
     *
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
    }

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
     * @return the Certificate object itself.
     */
    public Certificate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the notAfter property: A time value given in ISO8601 combined date and time format that represents the
     * certificate's expiration date.
     *
     * @return the notAfter value.
     */
    public OffsetDateTime getNotAfter() {
        return this.notAfter;
    }

    /**
     * Get the sha1Fingerprint property: A unique identifier generated from the SHA-1 fingerprint of the certificate.
     *
     * @return the sha1Fingerprint value.
     */
    public String getSha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * certificate was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the dnsNames property: An array of fully qualified domain names (FQDNs) for which the certificate was issued.
     *
     * @return the dnsNames value.
     */
    public List<String> getDnsNames() {
        return this.dnsNames;
    }

    /**
     * Set the dnsNames property: An array of fully qualified domain names (FQDNs) for which the certificate was issued.
     *
     * @param dnsNames the dnsNames value to set.
     * @return the Certificate object itself.
     */
    public Certificate setDnsNames(List<String> dnsNames) {
        this.dnsNames = dnsNames;
        return this;
    }

    /**
     * Get the state property: A string representing the current state of the certificate. It may be `pending`,
     * `verified`, or `error`.
     *
     * @return the state value.
     */
    public CertificateState getState() {
        return this.state;
    }

    /**
     * Get the type property: A string representing the type of the certificate. The value will be `custom` for a
     * user-uploaded certificate or `lets_encrypt` for one automatically generated with Let's Encrypt.
     *
     * @return the type value.
     */
    public CertificateType getType() {
        return this.type;
    }

    /**
     * Set the type property: A string representing the type of the certificate. The value will be `custom` for a
     * user-uploaded certificate or `lets_encrypt` for one automatically generated with Let's Encrypt.
     *
     * @param type the type value to set.
     * @return the Certificate object itself.
     */
    public Certificate setType(CertificateType type) {
        this.type = type;
        return this;
    }
}
