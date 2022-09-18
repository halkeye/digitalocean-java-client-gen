package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsKa40RcResponsesInvoiceContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class ComponentsKa40RcResponsesInvoiceContentApplicationJsonSchemaAllof0 {
    /*
     * The invoice_items property.
     */
    @JsonProperty(value = "invoice_items")
    private List<InvoiceItem> invoiceItems;

    /**
     * Get the invoiceItems property: The invoice_items property.
     * 
     * @return the invoiceItems value.
     */
    public List<InvoiceItem> getInvoiceItems() {
        return this.invoiceItems;
    }

    /**
     * Set the invoiceItems property: The invoice_items property.
     * 
     * @param invoiceItems the invoiceItems value to set.
     * @return the ComponentsKa40RcResponsesInvoiceContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsKa40RcResponsesInvoiceContentApplicationJsonSchemaAllof0 setInvoiceItems(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
        return this;
    }
}
