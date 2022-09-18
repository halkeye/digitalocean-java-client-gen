package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The DockerCredentials model.
 */
@Fluent
public final class DockerCredentials {
    /*
     * The auths property.
     */
    @JsonProperty(value = "auths")
    private DockerCredentialsAuths auths;

    /**
     * Get the auths property: The auths property.
     * 
     * @return the auths value.
     */
    public DockerCredentialsAuths getAuths() {
        return this.auths;
    }

    /**
     * Set the auths property: The auths property.
     * 
     * @param auths the auths value to set.
     * @return the DockerCredentials object itself.
     */
    public DockerCredentials setAuths(DockerCredentialsAuths auths) {
        this.auths = auths;
        return this;
    }
}
