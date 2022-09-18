package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema model.
 */
@Fluent
public final class Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema extends Components171RlqzResponsesInvoicesContentApplicationJsonSchemaAllof0 {
    /*
     * The links property.
     */
    @JsonProperty(value = "links")
    private PageLinks links;

    /*
     * The meta property.
     */
    @JsonProperty(value = "meta", required = true)
    private MetaMeta meta;

    /**
     * Get the links property: The links property.
     * 
     * @return the links value.
     */
    public PageLinks getLinks() {
        return this.links;
    }

    /**
     * Set the links property: The links property.
     * 
     * @param links the links value to set.
     * @return the Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema object itself.
     */
    public Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema setLinks(PageLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get the meta property: The meta property.
     * 
     * @return the meta value.
     */
    public MetaMeta getMeta() {
        return this.meta;
    }

    /**
     * Set the meta property: The meta property.
     * 
     * @param meta the meta value to set.
     * @return the Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema object itself.
     */
    public Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema setMeta(MetaMeta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema setInvoices(List<InvoicePreview> invoices) {
        super.setInvoices(invoices);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Components1Q4BgpwResponsesInvoicesContentApplicationJsonSchema setInvoicePreview(InvoicePreview invoicePreview) {
        super.setInvoicePreview(invoicePreview);
        return this;
    }
}
