package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;

/** The InvoiceSummaryOverages model. */
@Fluent
public final class InvoiceSummaryOverages extends SimpleCharge {
    /** {@inheritDoc} */
    @Override
    public InvoiceSummaryOverages setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InvoiceSummaryOverages setAmount(String amount) {
        super.setAmount(amount);
        return this;
    }
}
