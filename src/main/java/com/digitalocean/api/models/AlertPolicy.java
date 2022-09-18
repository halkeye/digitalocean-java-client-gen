package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The AlertPolicy model.
 */
@Fluent
public final class AlertPolicy {
    /*
     * The alerts property.
     */
    @JsonProperty(value = "alerts", required = true)
    private Alerts alerts;

    /*
     * The compare property.
     */
    @JsonProperty(value = "compare", required = true)
    private AlertPolicyCompare compare;

    /*
     * The description property.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /*
     * The enabled property.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * The entities property.
     */
    @JsonProperty(value = "entities", required = true)
    private List<String> entities;

    /*
     * The tags property.
     */
    @JsonProperty(value = "tags", required = true)
    private List<String> tags;

    /*
     * The type property.
     */
    @JsonProperty(value = "type", required = true)
    private AlertPolicyType type;

    /*
     * The uuid property.
     */
    @JsonProperty(value = "uuid", required = true)
    private String uuid;

    /*
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private float value;

    /*
     * The window property.
     */
    @JsonProperty(value = "window", required = true)
    private AlertPolicyWindow window;

    /**
     * Get the alerts property: The alerts property.
     * 
     * @return the alerts value.
     */
    public Alerts getAlerts() {
        return this.alerts;
    }

    /**
     * Set the alerts property: The alerts property.
     * 
     * @param alerts the alerts value to set.
     * @return the AlertPolicy object itself.
     */
    public AlertPolicy setAlerts(Alerts alerts) {
        this.alerts = alerts;
        return this;
    }

    /**
     * Get the compare property: The compare property.
     * 
     * @return the compare value.
     */
    public AlertPolicyCompare getCompare() {
        return this.compare;
    }

    /**
     * Set the compare property: The compare property.
     * 
     * @param compare the compare value to set.
     * @return the AlertPolicy object itself.
     */
    public AlertPolicy setCompare(AlertPolicyCompare compare) {
        this.compare = compare;
        return this;
    }

    /**
     * Get the description property: The description property.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description property.
     * 
     * @param description the description value to set.
     * @return the AlertPolicy object itself.
     */
    public AlertPolicy setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the enabled property: The enabled property.
     * 
     * @return the enabled value.
     */
    public boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The enabled property.
     * 
     * @param enabled the enabled value to set.
     * @return the AlertPolicy object itself.
     */
    public AlertPolicy setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the entities property: The entities property.
     * 
     * @return the entities value.
     */
    public List<String> getEntities() {
        return this.entities;
    }

    /**
     * Set the entities property: The entities property.
     * 
     * @param entities the entities value to set.
     * @return the AlertPolicy object itself.
     */
    public AlertPolicy setEntities(List<String> entities) {
        this.entities = entities;
        return this;
    }

    /**
     * Get the tags property: The tags property.
     * 
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags property.
     * 
     * @param tags the tags value to set.
     * @return the AlertPolicy object itself.
     */
    public AlertPolicy setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    public AlertPolicyType getType() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     * 
     * @param type the type value to set.
     * @return the AlertPolicy object itself.
     */
    public AlertPolicy setType(AlertPolicyType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the uuid property: The uuid property.
     * 
     * @return the uuid value.
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * Set the uuid property: The uuid property.
     * 
     * @param uuid the uuid value to set.
     * @return the AlertPolicy object itself.
     */
    public AlertPolicy setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public float getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the AlertPolicy object itself.
     */
    public AlertPolicy setValue(float value) {
        this.value = value;
        return this;
    }

    /**
     * Get the window property: The window property.
     * 
     * @return the window value.
     */
    public AlertPolicyWindow getWindow() {
        return this.window;
    }

    /**
     * Set the window property: The window property.
     * 
     * @param window the window value to set.
     * @return the AlertPolicy object itself.
     */
    public AlertPolicy setWindow(AlertPolicyWindow window) {
        this.window = window;
        return this;
    }
}
