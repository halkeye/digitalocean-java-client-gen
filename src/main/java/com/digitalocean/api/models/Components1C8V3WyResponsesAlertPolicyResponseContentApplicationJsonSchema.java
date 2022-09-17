package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1C8V3WyResponsesAlertPolicyResponseContentApplicationJsonSchema model. */
@Fluent
public final class Components1C8V3WyResponsesAlertPolicyResponseContentApplicationJsonSchema {
    /*
     * The policy property.
     */
    @JsonProperty(value = "policy")
    private AlertPolicy policy;

    /**
     * Get the policy property: The policy property.
     *
     * @return the policy value.
     */
    public AlertPolicy getPolicy() {
        return this.policy;
    }

    /**
     * Set the policy property: The policy property.
     *
     * @param policy the policy value to set.
     * @return the Components1C8V3WyResponsesAlertPolicyResponseContentApplicationJsonSchema object itself.
     */
    public Components1C8V3WyResponsesAlertPolicyResponseContentApplicationJsonSchema setPolicy(AlertPolicy policy) {
        this.policy = policy;
        return this;
    }
}
