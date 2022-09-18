package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The Action model.
 */
@Fluent
public class Action {
    /*
     * A unique numeric ID that can be used to identify and reference an action.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /*
     * The current status of the action. This can be "in-progress", "completed", or "errored".
     */
    @JsonProperty(value = "status")
    private ActionStatus status;

    /*
     * This is the type of action that the object represents. For example, this could be "transfer" to represent the
     * state of an image transfer action.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the action was initiated.
     */
    @JsonProperty(value = "started_at")
    private OffsetDateTime startedAt;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the action was completed.
     */
    @JsonProperty(value = "completed_at")
    private OffsetDateTime completedAt;

    /*
     * A unique identifier for the resource that the action is associated with.
     */
    @JsonProperty(value = "resource_id")
    private Integer resourceId;

    /*
     * The type of resource that the action is associated with.
     */
    @JsonProperty(value = "resource_type")
    private String resourceType;

    /*
     * The region property.
     */
    @JsonProperty(value = "region")
    private Region region;

    /*
     * Any object
     */
    @JsonProperty(value = "region_slug")
    private Object regionSlug;

    /**
     * Get the id property: A unique numeric ID that can be used to identify and reference an action.
     * 
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Set the id property: A unique numeric ID that can be used to identify and reference an action.
     * 
     * @param id the id value to set.
     * @return the Action object itself.
     */
    public Action setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the status property: The current status of the action. This can be "in-progress", "completed", or "errored".
     * 
     * @return the status value.
     */
    public ActionStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The current status of the action. This can be "in-progress", "completed", or "errored".
     * 
     * @param status the status value to set.
     * @return the Action object itself.
     */
    public Action setStatus(ActionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the type property: This is the type of action that the object represents. For example, this could be
     * "transfer" to represent the state of an image transfer action.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: This is the type of action that the object represents. For example, this could be
     * "transfer" to represent the state of an image transfer action.
     * 
     * @param type the type value to set.
     * @return the Action object itself.
     */
    public Action setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the startedAt property: A time value given in ISO8601 combined date and time format that represents when the
     * action was initiated.
     * 
     * @return the startedAt value.
     */
    public OffsetDateTime getStartedAt() {
        return this.startedAt;
    }

    /**
     * Set the startedAt property: A time value given in ISO8601 combined date and time format that represents when the
     * action was initiated.
     * 
     * @param startedAt the startedAt value to set.
     * @return the Action object itself.
     */
    public Action setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get the completedAt property: A time value given in ISO8601 combined date and time format that represents when
     * the action was completed.
     * 
     * @return the completedAt value.
     */
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
     * Set the completedAt property: A time value given in ISO8601 combined date and time format that represents when
     * the action was completed.
     * 
     * @param completedAt the completedAt value to set.
     * @return the Action object itself.
     */
    public Action setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * Get the resourceId property: A unique identifier for the resource that the action is associated with.
     * 
     * @return the resourceId value.
     */
    public Integer getResourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: A unique identifier for the resource that the action is associated with.
     * 
     * @param resourceId the resourceId value to set.
     * @return the Action object itself.
     */
    public Action setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the resourceType property: The type of resource that the action is associated with.
     * 
     * @return the resourceType value.
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The type of resource that the action is associated with.
     * 
     * @param resourceType the resourceType value to set.
     * @return the Action object itself.
     */
    public Action setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the region property: The region property.
     * 
     * @return the region value.
     */
    public Region getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The region property.
     * 
     * @param region the region value to set.
     * @return the Action object itself.
     */
    public Action setRegion(Region region) {
        this.region = region;
        return this;
    }

    /**
     * Get the regionSlug property: Any object.
     * 
     * @return the regionSlug value.
     */
    public Object getRegionSlug() {
        return this.regionSlug;
    }

    /**
     * Set the regionSlug property: Any object.
     * 
     * @param regionSlug the regionSlug value to set.
     * @return the Action object itself.
     */
    public Action setRegionSlug(Object regionSlug) {
        this.regionSlug = regionSlug;
        return this;
    }
}
