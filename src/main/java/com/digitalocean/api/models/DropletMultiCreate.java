package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Multiple Droplet Request.
 */
@Fluent
public final class DropletMultiCreate extends DropletCreate {
    /*
     * An array of human human-readable strings you wish to use when displaying the Droplet name. Each name, if set to
     * a domain name managed in the DigitalOcean DNS management system, will configure a PTR record for the Droplet.
     * Each name set during creation will also determine the hostname for the Droplet in its internal configuration.
     */
    @JsonProperty(value = "names", required = true)
    private List<String> names;

    /**
     * Get the names property: An array of human human-readable strings you wish to use when displaying the Droplet
     * name. Each name, if set to a domain name managed in the DigitalOcean DNS management system, will configure a PTR
     * record for the Droplet. Each name set during creation will also determine the hostname for the Droplet in its
     * internal configuration.
     * 
     * @return the names value.
     */
    public List<String> getNames() {
        return this.names;
    }

    /**
     * Set the names property: An array of human human-readable strings you wish to use when displaying the Droplet
     * name. Each name, if set to a domain name managed in the DigitalOcean DNS management system, will configure a PTR
     * record for the Droplet. Each name set during creation will also determine the hostname for the Droplet in its
     * internal configuration.
     * 
     * @param names the names value to set.
     * @return the DropletMultiCreate object itself.
     */
    public DropletMultiCreate setNames(List<String> names) {
        this.names = names;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletMultiCreate setRegion(String region) {
        super.setRegion(region);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletMultiCreate setSize(String size) {
        super.setSize(size);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletMultiCreate setImage(Object image) {
        super.setImage(image);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletMultiCreate setSshKeys(List<Object> sshKeys) {
        super.setSshKeys(sshKeys);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletMultiCreate setBackups(Boolean backups) {
        super.setBackups(backups);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletMultiCreate setIpv6(Boolean ipv6) {
        super.setIpv6(ipv6);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletMultiCreate setMonitoring(Boolean monitoring) {
        super.setMonitoring(monitoring);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletMultiCreate setTags(List<String> tags) {
        super.setTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletMultiCreate setUserData(String userData) {
        super.setUserData(userData);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletMultiCreate setPrivateNetworking(Boolean privateNetworking) {
        super.setPrivateNetworking(privateNetworking);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletMultiCreate setVpcUuid(String vpcUuid) {
        super.setVpcUuid(vpcUuid);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletMultiCreate setWithDropletAgent(Boolean withDropletAgent) {
        super.setWithDropletAgent(withDropletAgent);
        return this;
    }
}
