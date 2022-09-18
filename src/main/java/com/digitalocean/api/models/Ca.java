package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Ca model.
 */
@Immutable
public final class Ca {
    /*
     * base64 encoding of the certificate used to secure database connections
     */
    @JsonProperty(value = "certificate", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String certificate;

    /**
     * Get the certificate property: base64 encoding of the certificate used to secure database connections.
     * 
     * @return the certificate value.
     */
    public String getCertificate() {
        return this.certificate;
    }
}
