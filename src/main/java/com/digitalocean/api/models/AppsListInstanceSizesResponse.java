package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AppsListInstanceSizesResponse model. */
@Fluent
public final class AppsListInstanceSizesResponse {
    /*
     * The discount_percent property.
     */
    @JsonProperty(value = "discount_percent")
    private Float discountPercent;

    /*
     * The instance_sizes property.
     */
    @JsonProperty(value = "instance_sizes")
    private List<AppsInstanceSize> instanceSizes;

    /**
     * Get the discountPercent property: The discount_percent property.
     *
     * @return the discountPercent value.
     */
    public Float getDiscountPercent() {
        return this.discountPercent;
    }

    /**
     * Set the discountPercent property: The discount_percent property.
     *
     * @param discountPercent the discountPercent value to set.
     * @return the AppsListInstanceSizesResponse object itself.
     */
    public AppsListInstanceSizesResponse setDiscountPercent(Float discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }

    /**
     * Get the instanceSizes property: The instance_sizes property.
     *
     * @return the instanceSizes value.
     */
    public List<AppsInstanceSize> getInstanceSizes() {
        return this.instanceSizes;
    }

    /**
     * Set the instanceSizes property: The instance_sizes property.
     *
     * @param instanceSizes the instanceSizes value to set.
     * @return the AppsListInstanceSizesResponse object itself.
     */
    public AppsListInstanceSizesResponse setInstanceSizes(List<AppsInstanceSize> instanceSizes) {
        this.instanceSizes = instanceSizes;
        return this;
    }
}
