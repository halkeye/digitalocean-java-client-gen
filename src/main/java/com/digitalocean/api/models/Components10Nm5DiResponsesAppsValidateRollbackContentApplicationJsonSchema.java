package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema model.
 */
@Fluent
public final class Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema {
    /*
     * Indicates whether the app can be rolled back to the specified deployment.
     */
    @JsonProperty(value = "valid")
    private Boolean valid;

    /*
     * The error property.
     */
    @JsonProperty(value = "error")
    private AppsValidateRollbackApplicationJsonProperties error;

    /*
     * Contains a list of warnings that may cause the rollback to run under unideal circumstances.
     */
    @JsonProperty(value = "warnings")
    private List<AppRollbackValidationCondition> warnings;

    /**
     * Get the valid property: Indicates whether the app can be rolled back to the specified deployment.
     * 
     * @return the valid value.
     */
    public Boolean isValid() {
        return this.valid;
    }

    /**
     * Set the valid property: Indicates whether the app can be rolled back to the specified deployment.
     * 
     * @param valid the valid value to set.
     * @return the Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema object itself.
     */
    public Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }

    /**
     * Get the error property: The error property.
     * 
     * @return the error value.
     */
    public AppsValidateRollbackApplicationJsonProperties getError() {
        return this.error;
    }

    /**
     * Set the error property: The error property.
     * 
     * @param error the error value to set.
     * @return the Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema object itself.
     */
    public Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema setError(AppsValidateRollbackApplicationJsonProperties error) {
        this.error = error;
        return this;
    }

    /**
     * Get the warnings property: Contains a list of warnings that may cause the rollback to run under unideal
     * circumstances.
     * 
     * @return the warnings value.
     */
    public List<AppRollbackValidationCondition> getWarnings() {
        return this.warnings;
    }

    /**
     * Set the warnings property: Contains a list of warnings that may cause the rollback to run under unideal
     * circumstances.
     * 
     * @param warnings the warnings value to set.
     * @return the Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema object itself.
     */
    public Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema setWarnings(List<AppRollbackValidationCondition> warnings) {
        this.warnings = warnings;
        return this;
    }
}
