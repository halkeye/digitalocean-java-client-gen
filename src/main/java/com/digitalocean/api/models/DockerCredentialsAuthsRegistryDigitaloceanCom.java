package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The DockerCredentialsAuthsRegistryDigitaloceanCom model.
 */
@Fluent
public final class DockerCredentialsAuthsRegistryDigitaloceanCom {
    /*
     * A base64 encoded string containing credentials for the container registry.
     */
    @JsonProperty(value = "auth")
    private String auth;

    /**
     * Get the auth property: A base64 encoded string containing credentials for the container registry.
     * 
     * @return the auth value.
     */
    public String getAuth() {
        return this.auth;
    }

    /**
     * Set the auth property: A base64 encoded string containing credentials for the container registry.
     * 
     * @param auth the auth value to set.
     * @return the DockerCredentialsAuthsRegistryDigitaloceanCom object itself.
     */
    public DockerCredentialsAuthsRegistryDigitaloceanCom setAuth(String auth) {
        this.auth = auth;
        return this;
    }
}
