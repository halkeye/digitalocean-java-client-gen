package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AppsDeploymentsResponse model. */
@Fluent
public final class AppsDeploymentsResponse extends Pagination {
    /*
     * A list of deployments
     */
    @JsonProperty(value = "deployments")
    private List<AppsDeployment> deployments;

    /*
     * The meta property.
     */
    @JsonProperty(value = "meta", required = true)
    private MetaMeta meta;

    /**
     * Get the deployments property: A list of deployments.
     *
     * @return the deployments value.
     */
    public List<AppsDeployment> getDeployments() {
        return this.deployments;
    }

    /**
     * Set the deployments property: A list of deployments.
     *
     * @param deployments the deployments value to set.
     * @return the AppsDeploymentsResponse object itself.
     */
    public AppsDeploymentsResponse setDeployments(List<AppsDeployment> deployments) {
        this.deployments = deployments;
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
     * @return the AppsDeploymentsResponse object itself.
     */
    public AppsDeploymentsResponse setMeta(MetaMeta meta) {
        this.meta = meta;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppsDeploymentsResponse setLinks(PageLinks links) {
        super.setLinks(links);
        return this;
    }
}
