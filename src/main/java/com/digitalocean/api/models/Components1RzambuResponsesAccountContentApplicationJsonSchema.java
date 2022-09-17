package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1RzambuResponsesAccountContentApplicationJsonSchema model. */
@Fluent
public final class Components1RzambuResponsesAccountContentApplicationJsonSchema {
    /*
     * The account property.
     */
    @JsonProperty(value = "account")
    private Account account;

    /**
     * Get the account property: The account property.
     *
     * @return the account value.
     */
    public Account getAccount() {
        return this.account;
    }

    /**
     * Set the account property: The account property.
     *
     * @param account the account value to set.
     * @return the Components1RzambuResponsesAccountContentApplicationJsonSchema object itself.
     */
    public Components1RzambuResponsesAccountContentApplicationJsonSchema setAccount(Account account) {
        this.account = account;
        return this;
    }
}
