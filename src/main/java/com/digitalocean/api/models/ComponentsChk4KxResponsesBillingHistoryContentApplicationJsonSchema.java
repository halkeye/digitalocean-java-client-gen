package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchema
        extends Components1Sa8LwhResponsesBillingHistoryContentApplicationJsonSchemaAllof0 {
    /*
     * The links property.
     */
    @JsonProperty(value = "links")
    private PageLinks links;

    /*
     * Information about the response itself.
     */
    @JsonProperty(value = "meta", required = true)
    private MetaProperties meta;

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
     * @return the ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchema object itself.
     */
    public ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchema setLinks(PageLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get the meta property: Information about the response itself.
     *
     * @return the meta value.
     */
    public MetaProperties getMeta() {
        return this.meta;
    }

    /**
     * Set the meta property: Information about the response itself.
     *
     * @param meta the meta value to set.
     * @return the ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchema object itself.
     */
    public ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchema setMeta(MetaProperties meta) {
        this.meta = meta;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComponentsChk4KxResponsesBillingHistoryContentApplicationJsonSchema setBillingHistory(
            List<BillingHistory> billingHistory) {
        super.setBillingHistory(billingHistory);
        return this;
    }
}
