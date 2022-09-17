package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The environment of the project's resources. */
public final class ProjectBaseEnvironment extends ExpandableStringEnum<ProjectBaseEnvironment> {
    /** Static value Development for ProjectBaseEnvironment. */
    public static final ProjectBaseEnvironment DEVELOPMENT = fromString("Development");

    /** Static value Staging for ProjectBaseEnvironment. */
    public static final ProjectBaseEnvironment STAGING = fromString("Staging");

    /** Static value Production for ProjectBaseEnvironment. */
    public static final ProjectBaseEnvironment PRODUCTION = fromString("Production");

    /**
     * Creates or finds a ProjectBaseEnvironment from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProjectBaseEnvironment.
     */
    @JsonCreator
    public static ProjectBaseEnvironment fromString(String name) {
        return fromString(name, ProjectBaseEnvironment.class);
    }

    /**
     * Gets known ProjectBaseEnvironment values.
     *
     * @return known ProjectBaseEnvironment values.
     */
    public static Collection<ProjectBaseEnvironment> values() {
        return values(ProjectBaseEnvironment.class);
    }
}
