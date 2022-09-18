package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The InvoiceSummaryUserBillingAddress model.
 */
@Fluent
public final class InvoiceSummaryUserBillingAddress extends BillingAddress {
    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryUserBillingAddress setAddressLine1(String addressLine1) {
        super.setAddressLine1(addressLine1);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryUserBillingAddress setAddressLine2(String addressLine2) {
        super.setAddressLine2(addressLine2);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryUserBillingAddress setCity(String city) {
        super.setCity(city);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryUserBillingAddress setRegion(String region) {
        super.setRegion(region);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryUserBillingAddress setPostalCode(String postalCode) {
        super.setPostalCode(postalCode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryUserBillingAddress setCountryIso2Code(String countryIso2Code) {
        super.setCountryIso2Code(countryIso2Code);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryUserBillingAddress setCreatedAt(String createdAt) {
        super.setCreatedAt(createdAt);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceSummaryUserBillingAddress setUpdatedAt(String updatedAt) {
        super.setUpdatedAt(updatedAt);
        return this;
    }
}
