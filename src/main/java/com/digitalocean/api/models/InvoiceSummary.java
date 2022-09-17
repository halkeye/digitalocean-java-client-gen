package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InvoiceSummary model. */
@Fluent
public final class InvoiceSummary {
    /*
     * UUID of the invoice
     */
    @JsonProperty(value = "invoice_uuid")
    private String invoiceUuid;

    /*
     * Billing period of usage for which the invoice is issued, in `YYYY-MM`  format.
     */
    @JsonProperty(value = "billing_period")
    private String billingPeriod;

    /*
     * Total amount of the invoice, in USD.  This will reflect month-to-date usage in the invoice preview.
     */
    @JsonProperty(value = "amount")
    private String amount;

    /*
     * Name of the DigitalOcean customer being invoiced.
     */
    @JsonProperty(value = "user_name")
    private String userName;

    /*
     * The user_billing_address property.
     */
    @JsonProperty(value = "user_billing_address")
    private InvoiceSummaryUserBillingAddress userBillingAddress;

    /*
     * Company of the DigitalOcean customer being invoiced, if set.
     */
    @JsonProperty(value = "user_company")
    private String userCompany;

    /*
     * Email of the DigitalOcean customer being invoiced.
     */
    @JsonProperty(value = "user_email")
    private String userEmail;

    /*
     * The product_charges property.
     */
    @JsonProperty(value = "product_charges")
    private InvoiceSummaryProductCharges productCharges;

    /*
     * The overages property.
     */
    @JsonProperty(value = "overages")
    private InvoiceSummaryOverages overages;

    /*
     * The taxes property.
     */
    @JsonProperty(value = "taxes")
    private InvoiceSummaryTaxes taxes;

    /*
     * The credits_and_adjustments property.
     */
    @JsonProperty(value = "credits_and_adjustments")
    private InvoiceSummaryCreditsAndAdjustments creditsAndAdjustments;

    /**
     * Get the invoiceUuid property: UUID of the invoice.
     *
     * @return the invoiceUuid value.
     */
    public String getInvoiceUuid() {
        return this.invoiceUuid;
    }

    /**
     * Set the invoiceUuid property: UUID of the invoice.
     *
     * @param invoiceUuid the invoiceUuid value to set.
     * @return the InvoiceSummary object itself.
     */
    public InvoiceSummary setInvoiceUuid(String invoiceUuid) {
        this.invoiceUuid = invoiceUuid;
        return this;
    }

    /**
     * Get the billingPeriod property: Billing period of usage for which the invoice is issued, in `YYYY-MM` format.
     *
     * @return the billingPeriod value.
     */
    public String getBillingPeriod() {
        return this.billingPeriod;
    }

    /**
     * Set the billingPeriod property: Billing period of usage for which the invoice is issued, in `YYYY-MM` format.
     *
     * @param billingPeriod the billingPeriod value to set.
     * @return the InvoiceSummary object itself.
     */
    public InvoiceSummary setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
        return this;
    }

    /**
     * Get the amount property: Total amount of the invoice, in USD. This will reflect month-to-date usage in the
     * invoice preview.
     *
     * @return the amount value.
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * Set the amount property: Total amount of the invoice, in USD. This will reflect month-to-date usage in the
     * invoice preview.
     *
     * @param amount the amount value to set.
     * @return the InvoiceSummary object itself.
     */
    public InvoiceSummary setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get the userName property: Name of the DigitalOcean customer being invoiced.
     *
     * @return the userName value.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: Name of the DigitalOcean customer being invoiced.
     *
     * @param userName the userName value to set.
     * @return the InvoiceSummary object itself.
     */
    public InvoiceSummary setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the userBillingAddress property: The user_billing_address property.
     *
     * @return the userBillingAddress value.
     */
    public InvoiceSummaryUserBillingAddress getUserBillingAddress() {
        return this.userBillingAddress;
    }

    /**
     * Set the userBillingAddress property: The user_billing_address property.
     *
     * @param userBillingAddress the userBillingAddress value to set.
     * @return the InvoiceSummary object itself.
     */
    public InvoiceSummary setUserBillingAddress(InvoiceSummaryUserBillingAddress userBillingAddress) {
        this.userBillingAddress = userBillingAddress;
        return this;
    }

    /**
     * Get the userCompany property: Company of the DigitalOcean customer being invoiced, if set.
     *
     * @return the userCompany value.
     */
    public String getUserCompany() {
        return this.userCompany;
    }

    /**
     * Set the userCompany property: Company of the DigitalOcean customer being invoiced, if set.
     *
     * @param userCompany the userCompany value to set.
     * @return the InvoiceSummary object itself.
     */
    public InvoiceSummary setUserCompany(String userCompany) {
        this.userCompany = userCompany;
        return this;
    }

    /**
     * Get the userEmail property: Email of the DigitalOcean customer being invoiced.
     *
     * @return the userEmail value.
     */
    public String getUserEmail() {
        return this.userEmail;
    }

    /**
     * Set the userEmail property: Email of the DigitalOcean customer being invoiced.
     *
     * @param userEmail the userEmail value to set.
     * @return the InvoiceSummary object itself.
     */
    public InvoiceSummary setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * Get the productCharges property: The product_charges property.
     *
     * @return the productCharges value.
     */
    public InvoiceSummaryProductCharges getProductCharges() {
        return this.productCharges;
    }

    /**
     * Set the productCharges property: The product_charges property.
     *
     * @param productCharges the productCharges value to set.
     * @return the InvoiceSummary object itself.
     */
    public InvoiceSummary setProductCharges(InvoiceSummaryProductCharges productCharges) {
        this.productCharges = productCharges;
        return this;
    }

    /**
     * Get the overages property: The overages property.
     *
     * @return the overages value.
     */
    public InvoiceSummaryOverages getOverages() {
        return this.overages;
    }

    /**
     * Set the overages property: The overages property.
     *
     * @param overages the overages value to set.
     * @return the InvoiceSummary object itself.
     */
    public InvoiceSummary setOverages(InvoiceSummaryOverages overages) {
        this.overages = overages;
        return this;
    }

    /**
     * Get the taxes property: The taxes property.
     *
     * @return the taxes value.
     */
    public InvoiceSummaryTaxes getTaxes() {
        return this.taxes;
    }

    /**
     * Set the taxes property: The taxes property.
     *
     * @param taxes the taxes value to set.
     * @return the InvoiceSummary object itself.
     */
    public InvoiceSummary setTaxes(InvoiceSummaryTaxes taxes) {
        this.taxes = taxes;
        return this;
    }

    /**
     * Get the creditsAndAdjustments property: The credits_and_adjustments property.
     *
     * @return the creditsAndAdjustments value.
     */
    public InvoiceSummaryCreditsAndAdjustments getCreditsAndAdjustments() {
        return this.creditsAndAdjustments;
    }

    /**
     * Set the creditsAndAdjustments property: The credits_and_adjustments property.
     *
     * @param creditsAndAdjustments the creditsAndAdjustments value to set.
     * @return the InvoiceSummary object itself.
     */
    public InvoiceSummary setCreditsAndAdjustments(InvoiceSummaryCreditsAndAdjustments creditsAndAdjustments) {
        this.creditsAndAdjustments = creditsAndAdjustments;
        return this;
    }
}
