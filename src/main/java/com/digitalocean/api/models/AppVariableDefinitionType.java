package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * - GENERAL: A plain-text environment variable
 * - SECRET: A secret encrypted environment variable.
 */
public final class AppVariableDefinitionType extends ExpandableStringEnum<AppVariableDefinitionType> {
    /**
     * Static value GENERAL for AppVariableDefinitionType.
     */
    public static final AppVariableDefinitionType GENERAL = fromString("GENERAL");

    /**
     * Static value SECRET for AppVariableDefinitionType.
     */
    public static final AppVariableDefinitionType SECRET = fromString("SECRET");

    /**
     * Creates or finds a AppVariableDefinitionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AppVariableDefinitionType.
     */
    @JsonCreator
    public static AppVariableDefinitionType fromString(String name) {
        return fromString(name, AppVariableDefinitionType.class);
    }

    /**
     * Gets known AppVariableDefinitionType values.
     * 
     * @return known AppVariableDefinitionType values.
     */
    public static Collection<AppVariableDefinitionType> values() {
        return values(AppVariableDefinitionType.class);
    }
}
