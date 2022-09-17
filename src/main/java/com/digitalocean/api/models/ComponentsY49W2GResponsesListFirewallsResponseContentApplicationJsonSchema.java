package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchema
        extends ComponentsAb9K5AResponsesListFirewallsResponseContentApplicationJsonSchemaAllof0 {
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
     * @return the ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchema object itself.
     */
    public ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchema setLinks(PageLinks links) {
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
     * @return the ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchema object itself.
     */
    public ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchema setMeta(MetaMeta meta) {
        this.meta = meta;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComponentsY49W2GResponsesListFirewallsResponseContentApplicationJsonSchema setFirewalls(
            List<Firewall> firewalls) {
        super.setFirewalls(firewalls);
        return this;
    }
}
