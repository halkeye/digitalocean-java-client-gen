package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The DockerCredentialsAuths model.
 */
@Fluent
public final class DockerCredentialsAuths {
    /*
     * The registry.digitalocean.com property.
     */
    @JsonProperty(value = "registry.digitalocean.com")
    private DockerCredentialsAuthsRegistryDigitaloceanCom registryDigitaloceanCom;

    /**
     * Get the registryDigitaloceanCom property: The registry.digitalocean.com property.
     * 
     * @return the registryDigitaloceanCom value.
     */
    public DockerCredentialsAuthsRegistryDigitaloceanCom getRegistryDigitaloceanCom() {
        return this.registryDigitaloceanCom;
    }

    /**
     * Set the registryDigitaloceanCom property: The registry.digitalocean.com property.
     * 
     * @param registryDigitaloceanCom the registryDigitaloceanCom value to set.
     * @return the DockerCredentialsAuths object itself.
     */
    public DockerCredentialsAuths setRegistryDigitaloceanCom(DockerCredentialsAuthsRegistryDigitaloceanCom registryDigitaloceanCom) {
        this.registryDigitaloceanCom = registryDigitaloceanCom;
        return this;
    }
}
