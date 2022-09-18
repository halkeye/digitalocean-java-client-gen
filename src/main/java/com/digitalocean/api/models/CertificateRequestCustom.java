package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Custom Certificate Request.
 */
@Fluent
public final class CertificateRequestCustom extends CertificateCreateBase {
    /*
     * The contents of a PEM-formatted private-key corresponding to the SSL certificate.
     */
    @JsonProperty(value = "private_key", required = true)
    private String privateKey;

    /*
     * The contents of a PEM-formatted public SSL certificate.
     */
    @JsonProperty(value = "leaf_certificate", required = true)
    private String leafCertificate;

    /*
     * The full PEM-formatted trust chain between the certificate authority's certificate and your domain's SSL
     * certificate.
     */
    @JsonProperty(value = "certificate_chain")
    private String certificateChain;

    /**
     * Get the privateKey property: The contents of a PEM-formatted private-key corresponding to the SSL certificate.
     * 
     * @return the privateKey value.
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * Set the privateKey property: The contents of a PEM-formatted private-key corresponding to the SSL certificate.
     * 
     * @param privateKey the privateKey value to set.
     * @return the CertificateRequestCustom object itself.
     */
    public CertificateRequestCustom setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Get the leafCertificate property: The contents of a PEM-formatted public SSL certificate.
     * 
     * @return the leafCertificate value.
     */
    public String getLeafCertificate() {
        return this.leafCertificate;
    }

    /**
     * Set the leafCertificate property: The contents of a PEM-formatted public SSL certificate.
     * 
     * @param leafCertificate the leafCertificate value to set.
     * @return the CertificateRequestCustom object itself.
     */
    public CertificateRequestCustom setLeafCertificate(String leafCertificate) {
        this.leafCertificate = leafCertificate;
        return this;
    }

    /**
     * Get the certificateChain property: The full PEM-formatted trust chain between the certificate authority's
     * certificate and your domain's SSL certificate.
     * 
     * @return the certificateChain value.
     */
    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * Set the certificateChain property: The full PEM-formatted trust chain between the certificate authority's
     * certificate and your domain's SSL certificate.
     * 
     * @param certificateChain the certificateChain value to set.
     * @return the CertificateRequestCustom object itself.
     */
    public CertificateRequestCustom setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificateRequestCustom setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificateRequestCustom setType(CertificateCreateBaseType type) {
        super.setType(type);
        return this;
    }
}
