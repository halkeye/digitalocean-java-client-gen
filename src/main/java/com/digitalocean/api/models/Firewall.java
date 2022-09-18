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
 * The Firewall model.
 */
@Fluent
public class Firewall extends FirewallRules {
    /*
     * A unique ID that can be used to identify and reference a firewall.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * A status string indicating the current state of the firewall. This can be "waiting", "succeeded", or "failed".
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private FirewallStatus status;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the firewall was created.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * An array of objects each containing the fields "droplet_id", "removing", and "status". It is provided to detail
     * exactly which Droplets are having their security policies updated. When empty, all changes have been
     * successfully applied.
     */
    @JsonProperty(value = "pending_changes", access = JsonProperty.Access.WRITE_ONLY)
    private List<FirewallPendingChangesItem> pendingChanges;

    /*
     * A human-readable name for a firewall. The name must begin with an alphanumeric character. Subsequent characters
     * must either be alphanumeric characters, a period (.), or a dash (-).
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * An array containing the IDs of the Droplets assigned to the firewall.
     */
    @JsonProperty(value = "droplet_ids")
    private List<Integer> dropletIds;

    /*
     * Any object
     */
    @JsonProperty(value = "tags")
    private Object tags;

    /**
     * Get the id property: A unique ID that can be used to identify and reference a firewall.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the status property: A status string indicating the current state of the firewall. This can be "waiting",
     * "succeeded", or "failed".
     * 
     * @return the status value.
     */
    public FirewallStatus getStatus() {
        return this.status;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * firewall was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the pendingChanges property: An array of objects each containing the fields "droplet_id", "removing", and
     * "status". It is provided to detail exactly which Droplets are having their security policies updated. When
     * empty, all changes have been successfully applied.
     * 
     * @return the pendingChanges value.
     */
    public List<FirewallPendingChangesItem> getPendingChanges() {
        return this.pendingChanges;
    }

    /**
     * Get the name property: A human-readable name for a firewall. The name must begin with an alphanumeric character.
     * Subsequent characters must either be alphanumeric characters, a period (.), or a dash (-).
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A human-readable name for a firewall. The name must begin with an alphanumeric character.
     * Subsequent characters must either be alphanumeric characters, a period (.), or a dash (-).
     * 
     * @param name the name value to set.
     * @return the Firewall object itself.
     */
    public Firewall setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the dropletIds property: An array containing the IDs of the Droplets assigned to the firewall.
     * 
     * @return the dropletIds value.
     */
    public List<Integer> getDropletIds() {
        return this.dropletIds;
    }

    /**
     * Set the dropletIds property: An array containing the IDs of the Droplets assigned to the firewall.
     * 
     * @param dropletIds the dropletIds value to set.
     * @return the Firewall object itself.
     */
    public Firewall setDropletIds(List<Integer> dropletIds) {
        this.dropletIds = dropletIds;
        return this;
    }

    /**
     * Get the tags property: Any object.
     * 
     * @return the tags value.
     */
    public Object getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Any object.
     * 
     * @param tags the tags value to set.
     * @return the Firewall object itself.
     */
    public Firewall setTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Firewall setInboundRules(List<FirewallRulesInboundRulesItem> inboundRules) {
        super.setInboundRules(inboundRules);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Firewall setOutboundRules(List<FirewallRulesOutboundRulesItem> outboundRules) {
        super.setOutboundRules(outboundRules);
        return this;
    }
}
