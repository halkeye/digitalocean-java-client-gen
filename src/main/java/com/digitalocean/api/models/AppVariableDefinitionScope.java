package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * - RUN_TIME: Made available only at run-time - BUILD_TIME: Made available only at build-time - RUN_AND_BUILD_TIME:
 * Made available at both build and run-time.
 */
public final class AppVariableDefinitionScope extends ExpandableStringEnum<AppVariableDefinitionScope> {
    /** Static value UNSET for AppVariableDefinitionScope. */
    public static final AppVariableDefinitionScope UNSET = fromString("UNSET");

    /** Static value RUN_TIME for AppVariableDefinitionScope. */
    public static final AppVariableDefinitionScope RUNTIME = fromString("RUN_TIME");

    /** Static value BUILD_TIME for AppVariableDefinitionScope. */
    public static final AppVariableDefinitionScope BUILD_TIME = fromString("BUILD_TIME");

    /** Static value RUN_AND_BUILD_TIME for AppVariableDefinitionScope. */
    public static final AppVariableDefinitionScope RUNANDBUILD_TIME = fromString("RUN_AND_BUILD_TIME");

    /**
     * Creates or finds a AppVariableDefinitionScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AppVariableDefinitionScope.
     */
    @JsonCreator
    public static AppVariableDefinitionScope fromString(String name) {
        return fromString(name, AppVariableDefinitionScope.class);
    }

    /**
     * Gets known AppVariableDefinitionScope values.
     *
     * @return known AppVariableDefinitionScope values.
     */
    public static Collection<AppVariableDefinitionScope> values() {
        return values(AppVariableDefinitionScope.class);
    }
}
