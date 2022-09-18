package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The MetaMeta model.
 */
@Fluent
public final class MetaMeta extends MetaProperties {
    /**
     * {@inheritDoc}
     */
    @Override
    public MetaMeta setTotal(Integer total) {
        super.setTotal(total);
        return this;
    }
}
