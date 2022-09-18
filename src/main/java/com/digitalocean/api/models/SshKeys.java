package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The SshKeys model.
 */
@Fluent
public final class SshKeys {
    /*
     * A unique identification number for this key. Can be used to embed a  specific SSH key into a Droplet.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private Integer id;

    /*
     * A unique identifier that differentiates this key from other keys using  a format that SSH recognizes. The
     * fingerprint is created when the key is added to your account.
     */
    @JsonProperty(value = "fingerprint", access = JsonProperty.Access.WRITE_ONLY)
    private String fingerprint;

    /*
     * The entire public key string that was uploaded. Embedded into the root user's `authorized_keys` file if you
     * include this key during Droplet creation.
     */
    @JsonProperty(value = "public_key", required = true)
    private String publicKey;

    /*
     * A human-readable display name for this key, used to easily identify the SSH keys when they are displayed.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the id property: A unique identification number for this key. Can be used to embed a  specific SSH key into
     * a Droplet.
     * 
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Get the fingerprint property: A unique identifier that differentiates this key from other keys using  a format
     * that SSH recognizes. The fingerprint is created when the key is added to your account.
     * 
     * @return the fingerprint value.
     */
    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * Get the publicKey property: The entire public key string that was uploaded. Embedded into the root user's
     * `authorized_keys` file if you include this key during Droplet creation.
     * 
     * @return the publicKey value.
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * Set the publicKey property: The entire public key string that was uploaded. Embedded into the root user's
     * `authorized_keys` file if you include this key during Droplet creation.
     * 
     * @param publicKey the publicKey value to set.
     * @return the SshKeys object itself.
     */
    public SshKeys setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Get the name property: A human-readable display name for this key, used to easily identify the SSH keys when
     * they are displayed.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A human-readable display name for this key, used to easily identify the SSH keys when
     * they are displayed.
     * 
     * @param name the name value to set.
     * @return the SshKeys object itself.
     */
    public SshKeys setName(String name) {
        this.name = name;
        return this;
    }
}
