package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The ReservedIpRegion model.
 */
@Fluent
public final class ReservedIpRegion extends Region {
    /**
     * {@inheritDoc}
     */
    @Override
    public ReservedIpRegion setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservedIpRegion setSlug(String slug) {
        super.setSlug(slug);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservedIpRegion setFeatures(Object features) {
        super.setFeatures(features);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservedIpRegion setAvailable(boolean available) {
        super.setAvailable(available);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservedIpRegion setSizes(Object sizes) {
        super.setSizes(sizes);
        return this;
    }
}
