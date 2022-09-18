package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The invoice preview.
 */
@Fluent
public final class InvoicePreview {
    /*
     * The UUID of the invoice. The canonical reference for the invoice.
     */
    @JsonProperty(value = "invoice_uuid")
    private String invoiceUuid;

    /*
     * Total amount of the invoice, in USD.  This will reflect month-to-date usage in the invoice preview.
     */
    @JsonProperty(value = "amount")
    private String amount;

    /*
     * Billing period of usage for which the invoice is issued, in `YYYY-MM`  format.
     */
    @JsonProperty(value = "invoice_period")
    private String invoicePeriod;

    /*
     * Time the invoice was last updated.  This is only included with the invoice preview.
     */
    @JsonProperty(value = "updated_at")
    private String updatedAt;

    /**
     * Get the invoiceUuid property: The UUID of the invoice. The canonical reference for the invoice.
     * 
     * @return the invoiceUuid value.
     */
    public String getInvoiceUuid() {
        return this.invoiceUuid;
    }

    /**
     * Set the invoiceUuid property: The UUID of the invoice. The canonical reference for the invoice.
     * 
     * @param invoiceUuid the invoiceUuid value to set.
     * @return the InvoicePreview object itself.
     */
    public InvoicePreview setInvoiceUuid(String invoiceUuid) {
        this.invoiceUuid = invoiceUuid;
        return this;
    }

    /**
     * Get the amount property: Total amount of the invoice, in USD.  This will reflect month-to-date usage in the
     * invoice preview.
     * 
     * @return the amount value.
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * Set the amount property: Total amount of the invoice, in USD.  This will reflect month-to-date usage in the
     * invoice preview.
     * 
     * @param amount the amount value to set.
     * @return the InvoicePreview object itself.
     */
    public InvoicePreview setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get the invoicePeriod property: Billing period of usage for which the invoice is issued, in `YYYY-MM`  format.
     * 
     * @return the invoicePeriod value.
     */
    public String getInvoicePeriod() {
        return this.invoicePeriod;
    }

    /**
     * Set the invoicePeriod property: Billing period of usage for which the invoice is issued, in `YYYY-MM`  format.
     * 
     * @param invoicePeriod the invoicePeriod value to set.
     * @return the InvoicePreview object itself.
     */
    public InvoicePreview setInvoicePeriod(String invoicePeriod) {
        this.invoicePeriod = invoicePeriod;
        return this;
    }

    /**
     * Get the updatedAt property: Time the invoice was last updated.  This is only included with the invoice preview.
     * 
     * @return the updatedAt value.
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the updatedAt property: Time the invoice was last updated.  This is only included with the invoice preview.
     * 
     * @param updatedAt the updatedAt value to set.
     * @return the InvoicePreview object itself.
     */
    public InvoicePreview setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
