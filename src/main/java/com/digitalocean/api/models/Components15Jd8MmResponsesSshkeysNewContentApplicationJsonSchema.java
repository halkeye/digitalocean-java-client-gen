package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components15Jd8MmResponsesSshkeysNewContentApplicationJsonSchema model. */
@Fluent
public final class Components15Jd8MmResponsesSshkeysNewContentApplicationJsonSchema {
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
     * @return the Components15Jd8MmResponsesSshkeysNewContentApplicationJsonSchema object itself.
     */
    public Components15Jd8MmResponsesSshkeysNewContentApplicationJsonSchema setSshKey(SshKeys sshKey) {
        this.sshKey = sshKey;
        return this;
    }
}
