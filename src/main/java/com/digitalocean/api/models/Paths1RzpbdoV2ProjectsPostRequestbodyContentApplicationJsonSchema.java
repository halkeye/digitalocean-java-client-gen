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
 * The Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema model.
 */
@Fluent
public final class Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema extends ProjectBase {
    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema setPurpose(String purpose) {
        super.setPurpose(purpose);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema setEnvironment(ProjectBaseEnvironment environment) {
        super.setEnvironment(environment);
        return this;
    }
}
