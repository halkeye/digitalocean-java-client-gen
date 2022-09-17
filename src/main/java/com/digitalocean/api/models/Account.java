package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Account model. */
@Fluent
public final class Account {
    /*
     * The total number of Droplets current user or team may have active at one time.
     */
    @JsonProperty(value = "droplet_limit", required = true)
    private int dropletLimit;

    /*
     * The total number of Floating IPs the current user or team may have.
     */
    @JsonProperty(value = "floating_ip_limit", required = true)
    private int floatingIpLimit;

    /*
     * The email address used by the current user to register for DigitalOcean.
     */
    @JsonProperty(value = "email", required = true)
    private String email;

    /*
     * The unique universal identifier for the current user.
     */
    @JsonProperty(value = "uuid", required = true)
    private String uuid;

    /*
     * If true, the user has verified their account via email. False otherwise.
     */
    @JsonProperty(value = "email_verified", required = true)
    private boolean emailVerified;

    /*
     * This value is one of "active", "warning" or "locked".
     */
    @JsonProperty(value = "status", required = true)
    private AccountStatus status;

    /*
     * A human-readable message giving more details about the status of the account.
     */
    @JsonProperty(value = "status_message", required = true)
    private String statusMessage;

    /*
     * When authorized in a team context, includes information about the current team.
     */
    @JsonProperty(value = "team")
    private AccountTeam team;

    /**
     * Get the dropletLimit property: The total number of Droplets current user or team may have active at one time.
     *
     * @return the dropletLimit value.
     */
    public int getDropletLimit() {
        return this.dropletLimit;
    }

    /**
     * Set the dropletLimit property: The total number of Droplets current user or team may have active at one time.
     *
     * @param dropletLimit the dropletLimit value to set.
     * @return the Account object itself.
     */
    public Account setDropletLimit(int dropletLimit) {
        this.dropletLimit = dropletLimit;
        return this;
    }

    /**
     * Get the floatingIpLimit property: The total number of Floating IPs the current user or team may have.
     *
     * @return the floatingIpLimit value.
     */
    public int getFloatingIpLimit() {
        return this.floatingIpLimit;
    }

    /**
     * Set the floatingIpLimit property: The total number of Floating IPs the current user or team may have.
     *
     * @param floatingIpLimit the floatingIpLimit value to set.
     * @return the Account object itself.
     */
    public Account setFloatingIpLimit(int floatingIpLimit) {
        this.floatingIpLimit = floatingIpLimit;
        return this;
    }

    /**
     * Get the email property: The email address used by the current user to register for DigitalOcean.
     *
     * @return the email value.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Set the email property: The email address used by the current user to register for DigitalOcean.
     *
     * @param email the email value to set.
     * @return the Account object itself.
     */
    public Account setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the uuid property: The unique universal identifier for the current user.
     *
     * @return the uuid value.
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * Set the uuid property: The unique universal identifier for the current user.
     *
     * @param uuid the uuid value to set.
     * @return the Account object itself.
     */
    public Account setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get the emailVerified property: If true, the user has verified their account via email. False otherwise.
     *
     * @return the emailVerified value.
     */
    public boolean isEmailVerified() {
        return this.emailVerified;
    }

    /**
     * Set the emailVerified property: If true, the user has verified their account via email. False otherwise.
     *
     * @param emailVerified the emailVerified value to set.
     * @return the Account object itself.
     */
    public Account setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
        return this;
    }

    /**
     * Get the status property: This value is one of "active", "warning" or "locked".
     *
     * @return the status value.
     */
    public AccountStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: This value is one of "active", "warning" or "locked".
     *
     * @param status the status value to set.
     * @return the Account object itself.
     */
    public Account setStatus(AccountStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusMessage property: A human-readable message giving more details about the status of the account.
     *
     * @return the statusMessage value.
     */
    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * Set the statusMessage property: A human-readable message giving more details about the status of the account.
     *
     * @param statusMessage the statusMessage value to set.
     * @return the Account object itself.
     */
    public Account setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Get the team property: When authorized in a team context, includes information about the current team.
     *
     * @return the team value.
     */
    public AccountTeam getTeam() {
        return this.team;
    }

    /**
     * Set the team property: When authorized in a team context, includes information about the current team.
     *
     * @param team the team value to set.
     * @return the Account object itself.
     */
    public Account setTeam(AccountTeam team) {
        this.team = team;
        return this;
    }
}
