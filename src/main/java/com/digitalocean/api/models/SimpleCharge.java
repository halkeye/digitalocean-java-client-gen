package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SimpleCharge model. */
@Fluent
public class SimpleCharge {
    /*
     * Name of the charge
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Total amount charged in USD
     */
    @JsonProperty(value = "amount")
    private String amount;

    /**
     * Get the name property: Name of the charge.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the charge.
     *
     * @param name the name value to set.
     * @return the SimpleCharge object itself.
     */
    public SimpleCharge setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the amount property: Total amount charged in USD.
     *
     * @return the amount value.
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * Set the amount property: Total amount charged in USD.
     *
     * @param amount the amount value to set.
     * @return the SimpleCharge object itself.
     */
    public SimpleCharge setAmount(String amount) {
        this.amount = amount;
        return this;
    }
}
