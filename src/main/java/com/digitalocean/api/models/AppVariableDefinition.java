package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The AppVariableDefinition model.
 */
@Fluent
public final class AppVariableDefinition {
    /*
     * The variable name
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /*
     * - RUN_TIME: Made available only at run-time
     * - BUILD_TIME: Made available only at build-time
     * - RUN_AND_BUILD_TIME: Made available at both build and run-time
     */
    @JsonProperty(value = "scope")
    private AppVariableDefinitionScope scope;

    /*
     * - GENERAL: A plain-text environment variable
     * - SECRET: A secret encrypted environment variable
     */
    @JsonProperty(value = "type")
    private AppVariableDefinitionType type;

    /*
     * The value. If the type is `SECRET`, the value will be encrypted on first submission. On following submissions,
     * the encrypted value should be used.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the key property: The variable name.
     * 
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The variable name.
     * 
     * @param key the key value to set.
     * @return the AppVariableDefinition object itself.
     */
    public AppVariableDefinition setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the scope property: - RUN_TIME: Made available only at run-time
     * - BUILD_TIME: Made available only at build-time
     * - RUN_AND_BUILD_TIME: Made available at both build and run-time.
     * 
     * @return the scope value.
     */
    public AppVariableDefinitionScope getScope() {
        return this.scope;
    }

    /**
     * Set the scope property: - RUN_TIME: Made available only at run-time
     * - BUILD_TIME: Made available only at build-time
     * - RUN_AND_BUILD_TIME: Made available at both build and run-time.
     * 
     * @param scope the scope value to set.
     * @return the AppVariableDefinition object itself.
     */
    public AppVariableDefinition setScope(AppVariableDefinitionScope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the type property: - GENERAL: A plain-text environment variable
     * - SECRET: A secret encrypted environment variable.
     * 
     * @return the type value.
     */
    public AppVariableDefinitionType getType() {
        return this.type;
    }

    /**
     * Set the type property: - GENERAL: A plain-text environment variable
     * - SECRET: A secret encrypted environment variable.
     * 
     * @param type the type value to set.
     * @return the AppVariableDefinition object itself.
     */
    public AppVariableDefinition setType(AppVariableDefinitionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: The value. If the type is `SECRET`, the value will be encrypted on first submission. On
     * following submissions, the encrypted value should be used.
     * 
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value. If the type is `SECRET`, the value will be encrypted on first submission. On
     * following submissions, the encrypted value should be used.
     * 
     * @param value the value value to set.
     * @return the AppVariableDefinition object itself.
     */
    public AppVariableDefinition setValue(String value) {
        this.value = value;
        return this;
    }
}
