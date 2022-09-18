package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components1Le3PgsResponsesAllCertificatesContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class Components1Le3PgsResponsesAllCertificatesContentApplicationJsonSchemaAllof0 {
    /*
     * The certificates property.
     */
    @JsonProperty(value = "certificates")
    private List<Certificate> certificates;

    /**
     * Get the certificates property: The certificates property.
     * 
     * @return the certificates value.
     */
    public List<Certificate> getCertificates() {
        return this.certificates;
    }

    /**
     * Set the certificates property: The certificates property.
     * 
     * @param certificates the certificates value to set.
     * @return the Components1Le3PgsResponsesAllCertificatesContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Le3PgsResponsesAllCertificatesContentApplicationJsonSchemaAllof0 setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
        return this;
    }
}
