package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;

/** The InvoiceSummaryCreditsAndAdjustments model. */
@Fluent
public final class InvoiceSummaryCreditsAndAdjustments extends SimpleCharge {
    /** {@inheritDoc} */
    @Override
    public InvoiceSummaryCreditsAndAdjustments setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InvoiceSummaryCreditsAndAdjustments setAmount(String amount) {
        super.setAmount(amount);
        return this;
    }
}
