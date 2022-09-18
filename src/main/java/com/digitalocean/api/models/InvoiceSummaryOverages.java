package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The InvoiceSummaryOverages model.
 */
@Fluent
public final class InvoiceSummaryOverages extends SimpleCharge {
    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryOverages setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryOverages setAmount(String amount) {
        super.setAmount(amount);
        return this;
    }
}
