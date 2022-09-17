package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsHjzmbwResponsesExistingCertificateContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsHjzmbwResponsesExistingCertificateContentApplicationJsonSchema {
    /*
     * The certificate property.
     */
    @JsonProperty(value = "certificate")
    private Certificate certificate;

    /**
     * Get the certificate property: The certificate property.
     *
     * @return the certificate value.
     */
    public Certificate getCertificate() {
        return this.certificate;
    }

    /**
     * Set the certificate property: The certificate property.
     *
     * @param certificate the certificate value to set.
     * @return the ComponentsHjzmbwResponsesExistingCertificateContentApplicationJsonSchema object itself.
     */
    public ComponentsHjzmbwResponsesExistingCertificateContentApplicationJsonSchema setCertificate(
            Certificate certificate) {
        this.certificate = certificate;
        return this;
    }
}
