package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Single Droplet Request.
 */
@Fluent
public final class DropletSingleCreate extends DropletCreate {
    /*
     * The human-readable string you wish to use when displaying the Droplet name. The name, if set to a domain name
     * managed in the DigitalOcean DNS management system, will configure a PTR record for the Droplet. The name set
     * during creation will also determine the hostname for the Droplet in its internal configuration.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the name property: The human-readable string you wish to use when displaying the Droplet name. The name, if
     * set to a domain name managed in the DigitalOcean DNS management system, will configure a PTR record for the
     * Droplet. The name set during creation will also determine the hostname for the Droplet in its internal
     * configuration.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The human-readable string you wish to use when displaying the Droplet name. The name, if
     * set to a domain name managed in the DigitalOcean DNS management system, will configure a PTR record for the
     * Droplet. The name set during creation will also determine the hostname for the Droplet in its internal
     * configuration.
     * 
     * @param name the name value to set.
     * @return the DropletSingleCreate object itself.
     */
    public DropletSingleCreate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSingleCreate setRegion(String region) {
        super.setRegion(region);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSingleCreate setSize(String size) {
        super.setSize(size);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSingleCreate setImage(Object image) {
        super.setImage(image);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSingleCreate setSshKeys(List<Object> sshKeys) {
        super.setSshKeys(sshKeys);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSingleCreate setBackups(Boolean backups) {
        super.setBackups(backups);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSingleCreate setIpv6(Boolean ipv6) {
        super.setIpv6(ipv6);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSingleCreate setMonitoring(Boolean monitoring) {
        super.setMonitoring(monitoring);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSingleCreate setTags(List<String> tags) {
        super.setTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSingleCreate setUserData(String userData) {
        super.setUserData(userData);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSingleCreate setPrivateNetworking(Boolean privateNetworking) {
        super.setPrivateNetworking(privateNetworking);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSingleCreate setVpcUuid(String vpcUuid) {
        super.setVpcUuid(vpcUuid);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSingleCreate setWithDropletAgent(Boolean withDropletAgent) {
        super.setWithDropletAgent(withDropletAgent);
        return this;
    }
}
