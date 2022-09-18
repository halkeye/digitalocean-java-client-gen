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
 * The PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema model.
 */
@Fluent
public final class PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema extends Project {
    /**
     * {@inheritDoc}
     */
    @Override
    public PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema setIsDefault(Boolean isDefault) {
        super.setIsDefault(isDefault);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema setPurpose(String purpose) {
        super.setPurpose(purpose);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema setEnvironment(ProjectBaseEnvironment environment) {
        super.setEnvironment(environment);
        return this;
    }
}
