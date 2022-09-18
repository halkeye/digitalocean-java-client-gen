package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema model.
 */
@Fluent
public final class Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema extends Project {
    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema setIsDefault(Boolean isDefault) {
        super.setIsDefault(isDefault);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema setPurpose(String purpose) {
        super.setPurpose(purpose);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema setEnvironment(ProjectBaseEnvironment environment) {
        super.setEnvironment(environment);
        return this;
    }
}
