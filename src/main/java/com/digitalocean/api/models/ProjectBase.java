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
 * The ProjectBase model.
 */
@Fluent
public class ProjectBase {
    /*
     * The unique universal identifier of this project.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /*
     * The unique universal identifier of the project owner.
     */
    @JsonProperty(value = "owner_uuid", access = JsonProperty.Access.WRITE_ONLY)
    private String ownerUuid;

    /*
     * The integer id of the project owner.
     */
    @JsonProperty(value = "owner_id", access = JsonProperty.Access.WRITE_ONLY)
    private Integer ownerId;

    /*
     * The human-readable name for the project. The maximum length is 175 characters and the name must be unique.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The description of the project. The maximum length is 255 characters.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The purpose of the project. The maximum length is 255 characters. It can
     * have one of the following values:
     * 
     * - Just trying out DigitalOcean
     * - Class project / Educational purposes
     * - Website or blog
     * - Web Application
     * - Service or API
     * - Mobile Application
     * - Machine learning / AI / Data processing
     * - IoT
     * - Operational / Developer tooling
     * 
     * If another value for purpose is specified, for example, "your custom purpose",
     * your purpose will be stored as `Other: your custom purpose`.
     * 
     */
    @JsonProperty(value = "purpose")
    private String purpose;

    /*
     * The environment of the project's resources.
     */
    @JsonProperty(value = "environment")
    private ProjectBaseEnvironment environment;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the project was created.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the project was updated.
     */
    @JsonProperty(value = "updated_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /**
     * Get the id property: The unique universal identifier of this project.
     * 
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Get the ownerUuid property: The unique universal identifier of the project owner.
     * 
     * @return the ownerUuid value.
     */
    public String getOwnerUuid() {
        return this.ownerUuid;
    }

    /**
     * Get the ownerId property: The integer id of the project owner.
     * 
     * @return the ownerId value.
     */
    public Integer getOwnerId() {
        return this.ownerId;
    }

    /**
     * Get the name property: The human-readable name for the project. The maximum length is 175 characters and the
     * name must be unique.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The human-readable name for the project. The maximum length is 175 characters and the
     * name must be unique.
     * 
     * @param name the name value to set.
     * @return the ProjectBase object itself.
     */
    public ProjectBase setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: The description of the project. The maximum length is 255 characters.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the project. The maximum length is 255 characters.
     * 
     * @param description the description value to set.
     * @return the ProjectBase object itself.
     */
    public ProjectBase setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the purpose property: The purpose of the project. The maximum length is 255 characters. It can
     * have one of the following values:
     * 
     * - Just trying out DigitalOcean
     * - Class project / Educational purposes
     * - Website or blog
     * - Web Application
     * - Service or API
     * - Mobile Application
     * - Machine learning / AI / Data processing
     * - IoT
     * - Operational / Developer tooling
     * 
     * If another value for purpose is specified, for example, "your custom purpose",
     * your purpose will be stored as `Other: your custom purpose`.
     * 
     * @return the purpose value.
     */
    public String getPurpose() {
        return this.purpose;
    }

    /**
     * Set the purpose property: The purpose of the project. The maximum length is 255 characters. It can
     * have one of the following values:
     * 
     * - Just trying out DigitalOcean
     * - Class project / Educational purposes
     * - Website or blog
     * - Web Application
     * - Service or API
     * - Mobile Application
     * - Machine learning / AI / Data processing
     * - IoT
     * - Operational / Developer tooling
     * 
     * If another value for purpose is specified, for example, "your custom purpose",
     * your purpose will be stored as `Other: your custom purpose`.
     * 
     * @param purpose the purpose value to set.
     * @return the ProjectBase object itself.
     */
    public ProjectBase setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * Get the environment property: The environment of the project's resources.
     * 
     * @return the environment value.
     */
    public ProjectBaseEnvironment getEnvironment() {
        return this.environment;
    }

    /**
     * Set the environment property: The environment of the project's resources.
     * 
     * @param environment the environment value to set.
     * @return the ProjectBase object itself.
     */
    public ProjectBase setEnvironment(ProjectBaseEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * project was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: A time value given in ISO8601 combined date and time format that represents when the
     * project was updated.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
}
