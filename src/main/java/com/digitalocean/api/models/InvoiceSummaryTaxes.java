package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;

/** The InvoiceSummaryTaxes model. */
@Fluent
public final class InvoiceSummaryTaxes extends SimpleCharge {
    /** {@inheritDoc} */
    @Override
    public InvoiceSummaryTaxes setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InvoiceSummaryTaxes setAmount(String amount) {
        super.setAmount(amount);
        return this;
    }
}
