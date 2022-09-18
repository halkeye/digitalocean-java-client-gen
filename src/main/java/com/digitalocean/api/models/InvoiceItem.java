package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The InvoiceItem model.
 */
@Fluent
public final class InvoiceItem {
    /*
     * Name of the product being billed in the invoice item.
     */
    @JsonProperty(value = "product")
    private String product;

    /*
     * UUID of the resource billing in the invoice item if available.
     */
    @JsonProperty(value = "resource_uuid")
    private String resourceUuid;

    /*
     * ID of the resource billing in the invoice item if available.
     */
    @JsonProperty(value = "resource_id")
    private String resourceId;

    /*
     * Description of the invoice item when it is a grouped set of usage, such  as DOKS or databases.
     */
    @JsonProperty(value = "group_description")
    private String groupDescription;

    /*
     * Description of the invoice item.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Billed amount of this invoice item. Billed in USD.
     */
    @JsonProperty(value = "amount")
    private String amount;

    /*
     * Duration of time this invoice item was used and subsequently billed.
     */
    @JsonProperty(value = "duration")
    private String duration;

    /*
     * Unit of time for duration.
     */
    @JsonProperty(value = "duration_unit")
    private String durationUnit;

    /*
     * Time the invoice item began to be billed for usage.
     */
    @JsonProperty(value = "start_time")
    private String startTime;

    /*
     * Time the invoice item stoped being billed for usage.
     */
    @JsonProperty(value = "end_time")
    private String endTime;

    /*
     * Name of the DigitalOcean Project this resource belongs to.
     */
    @JsonProperty(value = "project_name")
    private String projectName;

    /**
     * Get the product property: Name of the product being billed in the invoice item.
     * 
     * @return the product value.
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * Set the product property: Name of the product being billed in the invoice item.
     * 
     * @param product the product value to set.
     * @return the InvoiceItem object itself.
     */
    public InvoiceItem setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the resourceUuid property: UUID of the resource billing in the invoice item if available.
     * 
     * @return the resourceUuid value.
     */
    public String getResourceUuid() {
        return this.resourceUuid;
    }

    /**
     * Set the resourceUuid property: UUID of the resource billing in the invoice item if available.
     * 
     * @param resourceUuid the resourceUuid value to set.
     * @return the InvoiceItem object itself.
     */
    public InvoiceItem setResourceUuid(String resourceUuid) {
        this.resourceUuid = resourceUuid;
        return this;
    }

    /**
     * Get the resourceId property: ID of the resource billing in the invoice item if available.
     * 
     * @return the resourceId value.
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: ID of the resource billing in the invoice item if available.
     * 
     * @param resourceId the resourceId value to set.
     * @return the InvoiceItem object itself.
     */
    public InvoiceItem setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the groupDescription property: Description of the invoice item when it is a grouped set of usage, such  as
     * DOKS or databases.
     * 
     * @return the groupDescription value.
     */
    public String getGroupDescription() {
        return this.groupDescription;
    }

    /**
     * Set the groupDescription property: Description of the invoice item when it is a grouped set of usage, such  as
     * DOKS or databases.
     * 
     * @param groupDescription the groupDescription value to set.
     * @return the InvoiceItem object itself.
     */
    public InvoiceItem setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
        return this;
    }

    /**
     * Get the description property: Description of the invoice item.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Description of the invoice item.
     * 
     * @param description the description value to set.
     * @return the InvoiceItem object itself.
     */
    public InvoiceItem setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the amount property: Billed amount of this invoice item. Billed in USD.
     * 
     * @return the amount value.
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * Set the amount property: Billed amount of this invoice item. Billed in USD.
     * 
     * @param amount the amount value to set.
     * @return the InvoiceItem object itself.
     */
    public InvoiceItem setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get the duration property: Duration of time this invoice item was used and subsequently billed.
     * 
     * @return the duration value.
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * Set the duration property: Duration of time this invoice item was used and subsequently billed.
     * 
     * @param duration the duration value to set.
     * @return the InvoiceItem object itself.
     */
    public InvoiceItem setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the durationUnit property: Unit of time for duration.
     * 
     * @return the durationUnit value.
     */
    public String getDurationUnit() {
        return this.durationUnit;
    }

    /**
     * Set the durationUnit property: Unit of time for duration.
     * 
     * @param durationUnit the durationUnit value to set.
     * @return the InvoiceItem object itself.
     */
    public InvoiceItem setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
        return this;
    }

    /**
     * Get the startTime property: Time the invoice item began to be billed for usage.
     * 
     * @return the startTime value.
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Time the invoice item began to be billed for usage.
     * 
     * @param startTime the startTime value to set.
     * @return the InvoiceItem object itself.
     */
    public InvoiceItem setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: Time the invoice item stoped being billed for usage.
     * 
     * @return the endTime value.
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: Time the invoice item stoped being billed for usage.
     * 
     * @param endTime the endTime value to set.
     * @return the InvoiceItem object itself.
     */
    public InvoiceItem setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the projectName property: Name of the DigitalOcean Project this resource belongs to.
     * 
     * @return the projectName value.
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * Set the projectName property: Name of the DigitalOcean Project this resource belongs to.
     * 
     * @param projectName the projectName value to set.
     * @return the InvoiceItem object itself.
     */
    public InvoiceItem setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
}
