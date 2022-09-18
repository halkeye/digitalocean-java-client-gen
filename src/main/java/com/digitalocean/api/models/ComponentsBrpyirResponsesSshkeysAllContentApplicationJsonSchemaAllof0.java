package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsBrpyirResponsesSshkeysAllContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class ComponentsBrpyirResponsesSshkeysAllContentApplicationJsonSchemaAllof0 {
    /*
     * The ssh_keys property.
     */
    @JsonProperty(value = "ssh_keys")
    private List<SshKeys> sshKeys;

    /**
     * Get the sshKeys property: The ssh_keys property.
     * 
     * @return the sshKeys value.
     */
    public List<SshKeys> getSshKeys() {
        return this.sshKeys;
    }

    /**
     * Set the sshKeys property: The ssh_keys property.
     * 
     * @param sshKeys the sshKeys value to set.
     * @return the ComponentsBrpyirResponsesSshkeysAllContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsBrpyirResponsesSshkeysAllContentApplicationJsonSchemaAllof0 setSshKeys(List<SshKeys> sshKeys) {
        this.sshKeys = sshKeys;
        return this;
    }
}
