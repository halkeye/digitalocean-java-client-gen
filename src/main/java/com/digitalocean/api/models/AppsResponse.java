package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AppsResponse model. */
@Fluent
public final class AppsResponse extends Pagination {
    /*
     * A list of apps
     */
    @JsonProperty(value = "apps")
    private List<App> apps;

    /*
     * The meta property.
     */
    @JsonProperty(value = "meta", required = true)
    private MetaMeta meta;

    /**
     * Get the apps property: A list of apps.
     *
     * @return the apps value.
     */
    public List<App> getApps() {
        return this.apps;
    }

    /**
     * Set the apps property: A list of apps.
     *
     * @param apps the apps value to set.
     * @return the AppsResponse object itself.
     */
    public AppsResponse setApps(List<App> apps) {
        this.apps = apps;
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
     * @return the AppsResponse object itself.
     */
    public AppsResponse setMeta(MetaMeta meta) {
        this.meta = meta;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppsResponse setLinks(PageLinks links) {
        super.setLinks(links);
        return this;
    }
}
