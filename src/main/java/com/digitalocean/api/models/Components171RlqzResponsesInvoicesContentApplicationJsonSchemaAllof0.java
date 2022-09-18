package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0 {
    /*
     * The invoices property.
     */
    @JsonProperty(value = "invoices")
    private List<InvoicePreview> invoices;

    /*
     * The invoice preview.
     */
    @JsonProperty(value = "invoice_preview")
    private InvoicePreview invoicePreview;

    /**
     * Get the invoices property: The invoices property.
     * 
     * @return the invoices value.
     */
    public List<InvoicePreview> getInvoices() {
        return this.invoices;
    }

    /**
     * Set the invoices property: The invoices property.
     * 
     * @param invoices the invoices value to set.
     * @return the Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0 setInvoices(List<InvoicePreview> invoices) {
        this.invoices = invoices;
        return this;
    }

    /**
     * Get the invoicePreview property: The invoice preview.
     * 
     * @return the invoicePreview value.
     */
    public InvoicePreview getInvoicePreview() {
        return this.invoicePreview;
    }

    /**
     * Set the invoicePreview property: The invoice preview.
     * 
     * @param invoicePreview the invoicePreview value to set.
     * @return the Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0 setInvoicePreview(InvoicePreview invoicePreview) {
        this.invoicePreview = invoicePreview;
        return this;
    }
}
