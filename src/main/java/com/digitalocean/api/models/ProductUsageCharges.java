package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ProductUsageCharges model.
 */
@Fluent
public class ProductUsageCharges {
    /*
     * Description of usage charges
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Total amount charged
     */
    @JsonProperty(value = "amount")
    private String amount;

    /*
     * List of amount, and grouped aggregates by resource type.
     */
    @JsonProperty(value = "items")
    private List<ProductChargeItem> items;

    /**
     * Get the name property: Description of usage charges.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Description of usage charges.
     * 
     * @param name the name value to set.
     * @return the ProductUsageCharges object itself.
     */
    public ProductUsageCharges setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the amount property: Total amount charged.
     * 
     * @return the amount value.
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * Set the amount property: Total amount charged.
     * 
     * @param amount the amount value to set.
     * @return the ProductUsageCharges object itself.
     */
    public ProductUsageCharges setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get the items property: List of amount, and grouped aggregates by resource type.
     * 
     * @return the items value.
     */
    public List<ProductChargeItem> getItems() {
        return this.items;
    }

    /**
     * Set the items property: List of amount, and grouped aggregates by resource type.
     * 
     * @param items the items value to set.
     * @return the ProductUsageCharges object itself.
     */
    public ProductUsageCharges setItems(List<ProductChargeItem> items) {
        this.items = items;
        return this;
    }
}
