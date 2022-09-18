package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The ComponentsOispf1ResponsesNewCertificateContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsOispf1ResponsesNewCertificateContentApplicationJsonSchema {
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
     * @return the ComponentsOispf1ResponsesNewCertificateContentApplicationJsonSchema object itself.
     */
    public ComponentsOispf1ResponsesNewCertificateContentApplicationJsonSchema setCertificate(Certificate certificate) {
        this.certificate = certificate;
        return this;
    }
}
