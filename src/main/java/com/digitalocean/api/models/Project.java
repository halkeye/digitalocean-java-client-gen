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
 * The Project model.
 */
@Fluent
public class Project extends ProjectBase {
    /*
     * If true, all resources will be added to this project if no project is specified.
     */
    @JsonProperty(value = "is_default")
    private Boolean isDefault;

    /**
     * Get the isDefault property: If true, all resources will be added to this project if no project is specified.
     * 
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set the isDefault property: If true, all resources will be added to this project if no project is specified.
     * 
     * @param isDefault the isDefault value to set.
     * @return the Project object itself.
     */
    public Project setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Project setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Project setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Project setPurpose(String purpose) {
        super.setPurpose(purpose);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Project setEnvironment(ProjectBaseEnvironment environment) {
        super.setEnvironment(environment);
        return this;
    }
}
