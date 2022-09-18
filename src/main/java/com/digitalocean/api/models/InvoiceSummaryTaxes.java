package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The InvoiceSummaryTaxes model.
 */
@Fluent
public final class InvoiceSummaryTaxes extends SimpleCharge {
    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryTaxes setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryTaxes setAmount(String amount) {
        super.setAmount(amount);
        return this;
    }
}
