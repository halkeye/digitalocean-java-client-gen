package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The FirewallRule model.
 */
@Fluent
public final class FirewallRule {
    /*
     * A unique ID for the firewall rule itself.
     */
    @JsonProperty(value = "uuid")
    private String uuid;

    /*
     * A unique ID for the database cluster to which the rule is applied.
     */
    @JsonProperty(value = "cluster_uuid")
    private String clusterUuid;

    /*
     * The type of resource that the firewall rule allows to access the database cluster.
     */
    @JsonProperty(value = "type", required = true)
    private FirewallRuleType type;

    /*
     * The ID of the specific resource, the name of a tag applied to a group of resources, or the IP address that the
     * firewall rule allows to access the database cluster.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the firewall rule was created.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /**
     * Get the uuid property: A unique ID for the firewall rule itself.
     * 
     * @return the uuid value.
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * Set the uuid property: A unique ID for the firewall rule itself.
     * 
     * @param uuid the uuid value to set.
     * @return the FirewallRule object itself.
     */
    public FirewallRule setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get the clusterUuid property: A unique ID for the database cluster to which the rule is applied.
     * 
     * @return the clusterUuid value.
     */
    public String getClusterUuid() {
        return this.clusterUuid;
    }

    /**
     * Set the clusterUuid property: A unique ID for the database cluster to which the rule is applied.
     * 
     * @param clusterUuid the clusterUuid value to set.
     * @return the FirewallRule object itself.
     */
    public FirewallRule setClusterUuid(String clusterUuid) {
        this.clusterUuid = clusterUuid;
        return this;
    }

    /**
     * Get the type property: The type of resource that the firewall rule allows to access the database cluster.
     * 
     * @return the type value.
     */
    public FirewallRuleType getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of resource that the firewall rule allows to access the database cluster.
     * 
     * @param type the type value to set.
     * @return the FirewallRule object itself.
     */
    public FirewallRule setType(FirewallRuleType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: The ID of the specific resource, the name of a tag applied to a group of resources, or
     * the IP address that the firewall rule allows to access the database cluster.
     * 
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The ID of the specific resource, the name of a tag applied to a group of resources, or
     * the IP address that the firewall rule allows to access the database cluster.
     * 
     * @param value the value value to set.
     * @return the FirewallRule object itself.
     */
    public FirewallRule setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * firewall rule was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
}
