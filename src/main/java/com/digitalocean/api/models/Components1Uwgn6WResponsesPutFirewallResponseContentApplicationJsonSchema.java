package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Components1Uwgn6WResponsesPutFirewallResponseContentApplicationJsonSchema model.
 */
@Fluent
public final class Components1Uwgn6WResponsesPutFirewallResponseContentApplicationJsonSchema {
    /*
     * The firewall property.
     */
    @JsonProperty(value = "firewall")
    private Firewall firewall;

    /**
     * Get the firewall property: The firewall property.
     * 
     * @return the firewall value.
     */
    public Firewall getFirewall() {
        return this.firewall;
    }

    /**
     * Set the firewall property: The firewall property.
     * 
     * @param firewall the firewall value to set.
     * @return the Components1Uwgn6WResponsesPutFirewallResponseContentApplicationJsonSchema object itself.
     */
    public Components1Uwgn6WResponsesPutFirewallResponseContentApplicationJsonSchema setFirewall(Firewall firewall) {
        this.firewall = firewall;
        return this;
    }
}
