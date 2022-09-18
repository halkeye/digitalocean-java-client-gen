package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The InvoiceSummaryProductCharges model.
 */
@Fluent
public final class InvoiceSummaryProductCharges extends ProductUsageCharges {
    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryProductCharges setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryProductCharges setAmount(String amount) {
        super.setAmount(amount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryProductCharges setItems(List<ProductChargeItem> items) {
        super.setItems(items);
        return this;
    }
}
