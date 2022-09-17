package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;

/** The Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema extends ProjectBase {
    /** {@inheritDoc} */
    @Override
    public Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema setPurpose(String purpose) {
        super.setPurpose(purpose);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema setEnvironment(
            ProjectBaseEnvironment environment) {
        super.setEnvironment(environment);
        return this;
    }
}
