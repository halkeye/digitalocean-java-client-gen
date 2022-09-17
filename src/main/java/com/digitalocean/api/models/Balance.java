package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The Balance model. */
@Fluent
public final class Balance {
    /*
     * Balance as of the `generated_at` time.  This value includes the `account_balance` and `month_to_date_usage`.
     */
    @JsonProperty(value = "month_to_date_balance")
    private String monthToDateBalance;

    /*
     * Current balance of the customer's most recent billing activity.  Does not reflect `month_to_date_usage`.
     */
    @JsonProperty(value = "account_balance")
    private String accountBalance;

    /*
     * Amount used in the current billing period as of the `generated_at` time.
     */
    @JsonProperty(value = "month_to_date_usage")
    private String monthToDateUsage;

    /*
     * The time at which balances were most recently generated.
     */
    @JsonProperty(value = "generated_at")
    private OffsetDateTime generatedAt;

    /**
     * Get the monthToDateBalance property: Balance as of the `generated_at` time. This value includes the
     * `account_balance` and `month_to_date_usage`.
     *
     * @return the monthToDateBalance value.
     */
    public String getMonthToDateBalance() {
        return this.monthToDateBalance;
    }

    /**
     * Set the monthToDateBalance property: Balance as of the `generated_at` time. This value includes the
     * `account_balance` and `month_to_date_usage`.
     *
     * @param monthToDateBalance the monthToDateBalance value to set.
     * @return the Balance object itself.
     */
    public Balance setMonthToDateBalance(String monthToDateBalance) {
        this.monthToDateBalance = monthToDateBalance;
        return this;
    }

    /**
     * Get the accountBalance property: Current balance of the customer's most recent billing activity. Does not reflect
     * `month_to_date_usage`.
     *
     * @return the accountBalance value.
     */
    public String getAccountBalance() {
        return this.accountBalance;
    }

    /**
     * Set the accountBalance property: Current balance of the customer's most recent billing activity. Does not reflect
     * `month_to_date_usage`.
     *
     * @param accountBalance the accountBalance value to set.
     * @return the Balance object itself.
     */
    public Balance setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }

    /**
     * Get the monthToDateUsage property: Amount used in the current billing period as of the `generated_at` time.
     *
     * @return the monthToDateUsage value.
     */
    public String getMonthToDateUsage() {
        return this.monthToDateUsage;
    }

    /**
     * Set the monthToDateUsage property: Amount used in the current billing period as of the `generated_at` time.
     *
     * @param monthToDateUsage the monthToDateUsage value to set.
     * @return the Balance object itself.
     */
    public Balance setMonthToDateUsage(String monthToDateUsage) {
        this.monthToDateUsage = monthToDateUsage;
        return this;
    }

    /**
     * Get the generatedAt property: The time at which balances were most recently generated.
     *
     * @return the generatedAt value.
     */
    public OffsetDateTime getGeneratedAt() {
        return this.generatedAt;
    }

    /**
     * Set the generatedAt property: The time at which balances were most recently generated.
     *
     * @param generatedAt the generatedAt value to set.
     * @return the Balance object itself.
     */
    public Balance setGeneratedAt(OffsetDateTime generatedAt) {
        this.generatedAt = generatedAt;
        return this;
    }
}
