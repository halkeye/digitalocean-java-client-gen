package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The AppAlertSpec model.
 */
@Fluent
public final class AppAlertSpec {
    /*
     * The rule property.
     */
    @JsonProperty(value = "rule")
    private AppAlertSpecRule rule;

    /*
     * Is the alert disabled?
     */
    @JsonProperty(value = "disabled")
    private Boolean disabled;

    /*
     * The operator property.
     */
    @JsonProperty(value = "operator")
    private AppAlertSpecOperator operator;

    /*
     * Threshold value for alert
     */
    @JsonProperty(value = "value")
    private Float value;

    /*
     * The window property.
     */
    @JsonProperty(value = "window")
    private AppAlertSpecWindow window;

    /**
     * Get the rule property: The rule property.
     * 
     * @return the rule value.
     */
    public AppAlertSpecRule getRule() {
        return this.rule;
    }

    /**
     * Set the rule property: The rule property.
     * 
     * @param rule the rule value to set.
     * @return the AppAlertSpec object itself.
     */
    public AppAlertSpec setRule(AppAlertSpecRule rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Get the disabled property: Is the alert disabled?.
     * 
     * @return the disabled value.
     */
    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * Set the disabled property: Is the alert disabled?.
     * 
     * @param disabled the disabled value to set.
     * @return the AppAlertSpec object itself.
     */
    public AppAlertSpec setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Get the operator property: The operator property.
     * 
     * @return the operator value.
     */
    public AppAlertSpecOperator getOperator() {
        return this.operator;
    }

    /**
     * Set the operator property: The operator property.
     * 
     * @param operator the operator value to set.
     * @return the AppAlertSpec object itself.
     */
    public AppAlertSpec setOperator(AppAlertSpecOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the value property: Threshold value for alert.
     * 
     * @return the value value.
     */
    public Float getValue() {
        return this.value;
    }

    /**
     * Set the value property: Threshold value for alert.
     * 
     * @param value the value value to set.
     * @return the AppAlertSpec object itself.
     */
    public AppAlertSpec setValue(Float value) {
        this.value = value;
        return this;
    }

    /**
     * Get the window property: The window property.
     * 
     * @return the window value.
     */
    public AppAlertSpecWindow getWindow() {
        return this.window;
    }

    /**
     * Set the window property: The window property.
     * 
     * @param window the window value to set.
     * @return the AppAlertSpec object itself.
     */
    public AppAlertSpec setWindow(AppAlertSpecWindow window) {
        this.window = window;
        return this;
    }
}
