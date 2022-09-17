package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Components1Sa8LwhResponsesBillingHistoryContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class Components1Sa8LwhResponsesBillingHistoryContentApplicationJsonSchemaAllof0 {
    /*
     * The billing_history property.
     */
    @JsonProperty(value = "billing_history")
    private List<BillingHistory> billingHistory;

    /**
     * Get the billingHistory property: The billing_history property.
     *
     * @return the billingHistory value.
     */
    public List<BillingHistory> getBillingHistory() {
        return this.billingHistory;
    }

    /**
     * Set the billingHistory property: The billing_history property.
     *
     * @param billingHistory the billingHistory value to set.
     * @return the Components1Sa8LwhResponsesBillingHistoryContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Sa8LwhResponsesBillingHistoryContentApplicationJsonSchemaAllof0 setBillingHistory(
            List<BillingHistory> billingHistory) {
        this.billingHistory = billingHistory;
        return this;
    }
}
