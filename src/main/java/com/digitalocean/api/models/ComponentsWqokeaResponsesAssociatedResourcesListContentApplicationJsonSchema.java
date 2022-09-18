package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchema extends Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 {
    /**
     * {@inheritDoc}
     */
    @Override
    public ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchema setReservedIps(List<AssociatedResource> reservedIps) {
        super.setReservedIps(reservedIps);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchema setFloatingIps(List<AssociatedResource> floatingIps) {
        super.setFloatingIps(floatingIps);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchema setSnapshots(List<AssociatedResource> snapshots) {
        super.setSnapshots(snapshots);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchema setVolumes(List<AssociatedResource> volumes) {
        super.setVolumes(volumes);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchema setVolumeSnapshots(List<AssociatedResource> volumeSnapshots) {
        super.setVolumeSnapshots(volumeSnapshots);
        return this;
    }
}
