package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The FloatingIpRegion model.
 */
@Fluent
public final class FloatingIpRegion extends Region {
    /**
     * {@inheritDoc}
     */
    @Override
    public FloatingIpRegion setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FloatingIpRegion setSlug(String slug) {
        super.setSlug(slug);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FloatingIpRegion setFeatures(Object features) {
        super.setFeatures(features);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FloatingIpRegion setAvailable(boolean available) {
        super.setAvailable(available);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FloatingIpRegion setSizes(Object sizes) {
        super.setSizes(sizes);
        return this;
    }
}
