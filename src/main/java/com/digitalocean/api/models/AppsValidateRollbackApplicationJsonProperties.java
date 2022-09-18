package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The AppsValidateRollbackApplicationJsonProperties model.
 */
@Fluent
public final class AppsValidateRollbackApplicationJsonProperties extends AppRollbackValidationCondition {
    /**
     * {@inheritDoc}
     */
    @Override
    public AppsValidateRollbackApplicationJsonProperties setCode(AppRollbackValidationConditionCode code) {
        super.setCode(code);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppsValidateRollbackApplicationJsonProperties setMessage(String message) {
        super.setMessage(message);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppsValidateRollbackApplicationJsonProperties setComponents(List<String> components) {
        super.setComponents(components);
        return this;
    }
}
