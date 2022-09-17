package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;

/** The MetaMeta model. */
@Fluent
public final class MetaMeta extends MetaProperties {
    /** {@inheritDoc} */
    @Override
    public MetaMeta setTotal(Integer total) {
        super.setTotal(total);
        return this;
    }
}
