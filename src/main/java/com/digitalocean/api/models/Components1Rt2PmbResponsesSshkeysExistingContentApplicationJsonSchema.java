package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1Rt2PmbResponsesSshkeysExistingContentApplicationJsonSchema model. */
@Fluent
public final class Components1Rt2PmbResponsesSshkeysExistingContentApplicationJsonSchema {
    /*
     * The ssh_key property.
     */
    @JsonProperty(value = "ssh_key")
    private SshKeys sshKey;

    /**
     * Get the sshKey property: The ssh_key property.
     *
     * @return the sshKey value.
     */
    public SshKeys getSshKey() {
        return this.sshKey;
    }

    /**
     * Set the sshKey property: The ssh_key property.
     *
     * @param sshKey the sshKey value to set.
     * @return the Components1Rt2PmbResponsesSshkeysExistingContentApplicationJsonSchema object itself.
     */
    public Components1Rt2PmbResponsesSshkeysExistingContentApplicationJsonSchema setSshKey(SshKeys sshKey) {
        this.sshKey = sshKey;
        return this;
    }
}
