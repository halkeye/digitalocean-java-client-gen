package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Let's Encrypt Certificate Request. */
@Fluent
public final class CertificateRequestLetsEncrypt extends CertificateCreateBase {
    /*
     * An array of fully qualified domain names (FQDNs) for which the certificate was issued. A certificate covering
     * all subdomains can be issued using a wildcard (e.g. `*.example.com`).
     */
    @JsonProperty(value = "dns_names", required = true)
    private List<String> dnsNames;

    /**
     * Get the dnsNames property: An array of fully qualified domain names (FQDNs) for which the certificate was issued.
     * A certificate covering all subdomains can be issued using a wildcard (e.g. `*.example.com`).
     *
     * @return the dnsNames value.
     */
    public List<String> getDnsNames() {
        return this.dnsNames;
    }

    /**
     * Set the dnsNames property: An array of fully qualified domain names (FQDNs) for which the certificate was issued.
     * A certificate covering all subdomains can be issued using a wildcard (e.g. `*.example.com`).
     *
     * @param dnsNames the dnsNames value to set.
     * @return the CertificateRequestLetsEncrypt object itself.
     */
    public CertificateRequestLetsEncrypt setDnsNames(List<String> dnsNames) {
        this.dnsNames = dnsNames;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CertificateRequestLetsEncrypt setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CertificateRequestLetsEncrypt setType(CertificateCreateBaseType type) {
        super.setType(type);
        return this;
    }
}
