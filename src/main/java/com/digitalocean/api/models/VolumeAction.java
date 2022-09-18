package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The VolumeAction model.
 */
@Fluent
public final class VolumeAction extends Action {
    /*
     * This is the type of action that the object represents. For example, this could be "attach_volume" to represent
     * the state of a volume attach action.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The resource_id property.
     */
    @JsonProperty(value = "resource_id")
    private Integer resourceId;

    /**
     * Get the type property: This is the type of action that the object represents. For example, this could be
     * "attach_volume" to represent the state of a volume attach action.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: This is the type of action that the object represents. For example, this could be
     * "attach_volume" to represent the state of a volume attach action.
     * 
     * @param type the type value to set.
     * @return the VolumeAction object itself.
     */
    public VolumeAction setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the resourceId property: The resource_id property.
     * 
     * @return the resourceId value.
     */
    public Integer getResourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource_id property.
     * 
     * @param resourceId the resourceId value to set.
     * @return the VolumeAction object itself.
     */
    public VolumeAction setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeAction setId(Integer id) {
        super.setId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeAction setStatus(ActionStatus status) {
        super.setStatus(status);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeAction setStartedAt(OffsetDateTime startedAt) {
        super.setStartedAt(startedAt);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeAction setCompletedAt(OffsetDateTime completedAt) {
        super.setCompletedAt(completedAt);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeAction setResourceType(String resourceType) {
        super.setResourceType(resourceType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeAction setRegion(Region region) {
        super.setRegion(region);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeAction setRegionSlug(Object regionSlug) {
        super.setRegionSlug(regionSlug);
        return this;
    }
}
