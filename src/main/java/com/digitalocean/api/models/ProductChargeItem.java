package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ProductChargeItem model. */
@Fluent
public final class ProductChargeItem {
    /*
     * Amount of the charge
     */
    @JsonProperty(value = "amount")
    private String amount;

    /*
     * Description of the charge
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Number of times the charge was applied
     */
    @JsonProperty(value = "count")
    private String count;

    /**
     * Get the amount property: Amount of the charge.
     *
     * @return the amount value.
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * Set the amount property: Amount of the charge.
     *
     * @param amount the amount value to set.
     * @return the ProductChargeItem object itself.
     */
    public ProductChargeItem setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get the name property: Description of the charge.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Description of the charge.
     *
     * @param name the name value to set.
     * @return the ProductChargeItem object itself.
     */
    public ProductChargeItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the count property: Number of times the charge was applied.
     *
     * @return the count value.
     */
    public String getCount() {
        return this.count;
    }

    /**
     * Set the count property: Number of times the charge was applied.
     *
     * @param count the count value to set.
     * @return the ProductChargeItem object itself.
     */
    public ProductChargeItem setCount(String count) {
        this.count = count;
        return this;
    }
}
