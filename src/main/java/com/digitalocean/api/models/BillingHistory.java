package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The BillingHistory model.
 */
@Fluent
public final class BillingHistory {
    /*
     * Description of the billing history entry.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Amount of the billing history entry.
     */
    @JsonProperty(value = "amount")
    private String amount;

    /*
     * ID of the invoice associated with the billing history entry, if  applicable.
     */
    @JsonProperty(value = "invoice_id")
    private String invoiceId;

    /*
     * UUID of the invoice associated with the billing history entry, if  applicable.
     */
    @JsonProperty(value = "invoice_uuid")
    private String invoiceUuid;

    /*
     * Time the billing history entry occured.
     */
    @JsonProperty(value = "date")
    private OffsetDateTime date;

    /*
     * Type of billing history entry.
     */
    @JsonProperty(value = "type")
    private BillingHistoryType type;

    /**
     * Get the description property: Description of the billing history entry.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Description of the billing history entry.
     * 
     * @param description the description value to set.
     * @return the BillingHistory object itself.
     */
    public BillingHistory setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the amount property: Amount of the billing history entry.
     * 
     * @return the amount value.
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * Set the amount property: Amount of the billing history entry.
     * 
     * @param amount the amount value to set.
     * @return the BillingHistory object itself.
     */
    public BillingHistory setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get the invoiceId property: ID of the invoice associated with the billing history entry, if  applicable.
     * 
     * @return the invoiceId value.
     */
    public String getInvoiceId() {
        return this.invoiceId;
    }

    /**
     * Set the invoiceId property: ID of the invoice associated with the billing history entry, if  applicable.
     * 
     * @param invoiceId the invoiceId value to set.
     * @return the BillingHistory object itself.
     */
    public BillingHistory setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }

    /**
     * Get the invoiceUuid property: UUID of the invoice associated with the billing history entry, if  applicable.
     * 
     * @return the invoiceUuid value.
     */
    public String getInvoiceUuid() {
        return this.invoiceUuid;
    }

    /**
     * Set the invoiceUuid property: UUID of the invoice associated with the billing history entry, if  applicable.
     * 
     * @param invoiceUuid the invoiceUuid value to set.
     * @return the BillingHistory object itself.
     */
    public BillingHistory setInvoiceUuid(String invoiceUuid) {
        this.invoiceUuid = invoiceUuid;
        return this;
    }

    /**
     * Get the date property: Time the billing history entry occured.
     * 
     * @return the date value.
     */
    public OffsetDateTime getDate() {
        return this.date;
    }

    /**
     * Set the date property: Time the billing history entry occured.
     * 
     * @param date the date value to set.
     * @return the BillingHistory object itself.
     */
    public BillingHistory setDate(OffsetDateTime date) {
        this.date = date;
        return this;
    }

    /**
     * Get the type property: Type of billing history entry.
     * 
     * @return the type value.
     */
    public BillingHistoryType getType() {
        return this.type;
    }

    /**
     * Set the type property: Type of billing history entry.
     * 
     * @param type the type value to set.
     * @return the BillingHistory object itself.
     */
    public BillingHistory setType(BillingHistoryType type) {
        this.type = type;
        return this;
    }
}
