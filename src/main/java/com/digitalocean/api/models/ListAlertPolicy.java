package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ListAlertPolicy model. */
@Fluent
public class ListAlertPolicy {
    /*
     * The policies property.
     */
    @JsonProperty(value = "policies", required = true)
    private List<AlertPolicy> policies;

    /**
     * Get the policies property: The policies property.
     *
     * @return the policies value.
     */
    public List<AlertPolicy> getPolicies() {
        return this.policies;
    }

    /**
     * Set the policies property: The policies property.
     *
     * @param policies the policies value to set.
     * @return the ListAlertPolicy object itself.
     */
    public ListAlertPolicy setPolicies(List<AlertPolicy> policies) {
        this.policies = policies;
        return this;
    }
}
