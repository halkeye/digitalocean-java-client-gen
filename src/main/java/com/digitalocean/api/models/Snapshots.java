package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The Snapshots model.
 */
@Fluent
public final class Snapshots extends SnapshotsBase {
    /*
     * The unique identifier for the resource that the snapshot originated from.
     */
    @JsonProperty(value = "resource_id", required = true)
    private String resourceId;

    /*
     * The type of resource that the snapshot originated from.
     */
    @JsonProperty(value = "resource_type", required = true)
    private SnapshotsResourceType resourceType;

    /*
     * An array of Tags the snapshot has been tagged with.
     */
    @JsonProperty(value = "tags", required = true)
    private List<String> tags;

    /**
     * Get the resourceId property: The unique identifier for the resource that the snapshot originated from.
     * 
     * @return the resourceId value.
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The unique identifier for the resource that the snapshot originated from.
     * 
     * @param resourceId the resourceId value to set.
     * @return the Snapshots object itself.
     */
    public Snapshots setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the resourceType property: The type of resource that the snapshot originated from.
     * 
     * @return the resourceType value.
     */
    public SnapshotsResourceType getResourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The type of resource that the snapshot originated from.
     * 
     * @param resourceType the resourceType value to set.
     * @return the Snapshots object itself.
     */
    public Snapshots setResourceType(SnapshotsResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the tags property: An array of Tags the snapshot has been tagged with.
     * 
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: An array of Tags the snapshot has been tagged with.
     * 
     * @param tags the tags value to set.
     * @return the Snapshots object itself.
     */
    public Snapshots setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Snapshots setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Snapshots setCreatedAt(OffsetDateTime createdAt) {
        super.setCreatedAt(createdAt);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Snapshots setRegions(List<String> regions) {
        super.setRegions(regions);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Snapshots setMinDiskSize(int minDiskSize) {
        super.setMinDiskSize(minDiskSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Snapshots setSizeGigabytes(float sizeGigabytes) {
        super.setSizeGigabytes(sizeGigabytes);
        return this;
    }
}
