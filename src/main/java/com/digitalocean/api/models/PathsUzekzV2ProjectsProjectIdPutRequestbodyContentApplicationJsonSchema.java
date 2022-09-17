package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;

/** The PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema extends Project {
    /** {@inheritDoc} */
    @Override
    public PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema setIsDefault(Boolean isDefault) {
        super.setIsDefault(isDefault);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema setPurpose(String purpose) {
        super.setPurpose(purpose);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema setEnvironment(
            ProjectBaseEnvironment environment) {
        super.setEnvironment(environment);
        return this;
    }
}
