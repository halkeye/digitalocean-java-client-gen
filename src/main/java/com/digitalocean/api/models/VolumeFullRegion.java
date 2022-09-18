package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The VolumeFullRegion model.
 */
@Fluent
public final class VolumeFullRegion extends Region {
    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeFullRegion setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeFullRegion setSlug(String slug) {
        super.setSlug(slug);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeFullRegion setFeatures(Object features) {
        super.setFeatures(features);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeFullRegion setAvailable(boolean available) {
        super.setAvailable(available);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeFullRegion setSizes(Object sizes) {
        super.setSizes(sizes);
        return this;
    }
}
