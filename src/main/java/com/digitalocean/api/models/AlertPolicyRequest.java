package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AlertPolicyRequest model. */
@Fluent
public final class AlertPolicyRequest {
    /*
     * The alerts property.
     */
    @JsonProperty(value = "alerts", required = true)
    private Alerts alerts;

    /*
     * The compare property.
     */
    @JsonProperty(value = "compare", required = true)
    private AlertPolicyRequestCompare compare;

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
    private AlertPolicyRequestType type;

    /*
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private float value;

    /*
     * The window property.
     */
    @JsonProperty(value = "window", required = true)
    private AlertPolicyRequestWindow window;

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
     * @return the AlertPolicyRequest object itself.
     */
    public AlertPolicyRequest setAlerts(Alerts alerts) {
        this.alerts = alerts;
        return this;
    }

    /**
     * Get the compare property: The compare property.
     *
     * @return the compare value.
     */
    public AlertPolicyRequestCompare getCompare() {
        return this.compare;
    }

    /**
     * Set the compare property: The compare property.
     *
     * @param compare the compare value to set.
     * @return the AlertPolicyRequest object itself.
     */
    public AlertPolicyRequest setCompare(AlertPolicyRequestCompare compare) {
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
     * @return the AlertPolicyRequest object itself.
     */
    public AlertPolicyRequest setDescription(String description) {
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
     * @return the AlertPolicyRequest object itself.
     */
    public AlertPolicyRequest setEnabled(boolean enabled) {
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
     * @return the AlertPolicyRequest object itself.
     */
    public AlertPolicyRequest setEntities(List<String> entities) {
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
     * @return the AlertPolicyRequest object itself.
     */
    public AlertPolicyRequest setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public AlertPolicyRequestType getType() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     *
     * @param type the type value to set.
     * @return the AlertPolicyRequest object itself.
     */
    public AlertPolicyRequest setType(AlertPolicyRequestType type) {
        this.type = type;
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
     * @return the AlertPolicyRequest object itself.
     */
    public AlertPolicyRequest setValue(float value) {
        this.value = value;
        return this;
    }

    /**
     * Get the window property: The window property.
     *
     * @return the window value.
     */
    public AlertPolicyRequestWindow getWindow() {
        return this.window;
    }

    /**
     * Set the window property: The window property.
     *
     * @param window the window value to set.
     * @return the AlertPolicyRequest object itself.
     */
    public AlertPolicyRequest setWindow(AlertPolicyRequestWindow window) {
        this.window = window;
        return this;
    }
}
