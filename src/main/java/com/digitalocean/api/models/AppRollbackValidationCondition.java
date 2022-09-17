package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AppRollbackValidationCondition model. */
@Fluent
public class AppRollbackValidationCondition {
    /*
     * A code identifier that represents the failing condition.
     *
     * Failing conditions:
     * - `incompatible_phase` - indicates that the deployment's phase is not suitable for rollback.
     * - `incompatible_result` - indicates that the deployment's result is not suitable for rollback.
     * - `exceeded_revision_limit` - indicates that the app has exceeded the rollback revision limits for its tier.
     * - `app_pinned` - indicates that there is already a rollback in progress and the app is pinned.
     * - `database_config_conflict` - indicates that the deployment's database config is different than the current
     * config.
     * - `region_conflict` - indicates that the deployment's region differs from the current app region.
     *
     * Warning conditions:
     * - `static_site_requires_rebuild` - indicates that the deployment contains at least one static site that will
     * require a rebuild.
     * - `image_source_missing_digest` - indicates that the deployment contains at least one component with an image
     * source that is missing a digest.
     *
     */
    @JsonProperty(value = "code")
    private AppRollbackValidationConditionCode code;

    /*
     * A human-readable message describing the failing condition.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The components property.
     */
    @JsonProperty(value = "components")
    private List<String> components;

    /**
     * Get the code property: A code identifier that represents the failing condition.
     *
     * <p>Failing conditions: - `incompatible_phase` - indicates that the deployment's phase is not suitable for
     * rollback. - `incompatible_result` - indicates that the deployment's result is not suitable for rollback. -
     * `exceeded_revision_limit` - indicates that the app has exceeded the rollback revision limits for its tier. -
     * `app_pinned` - indicates that there is already a rollback in progress and the app is pinned. -
     * `database_config_conflict` - indicates that the deployment's database config is different than the current
     * config. - `region_conflict` - indicates that the deployment's region differs from the current app region.
     *
     * <p>Warning conditions: - `static_site_requires_rebuild` - indicates that the deployment contains at least one
     * static site that will require a rebuild. - `image_source_missing_digest` - indicates that the deployment contains
     * at least one component with an image source that is missing a digest.
     *
     * @return the code value.
     */
    public AppRollbackValidationConditionCode getCode() {
        return this.code;
    }

    /**
     * Set the code property: A code identifier that represents the failing condition.
     *
     * <p>Failing conditions: - `incompatible_phase` - indicates that the deployment's phase is not suitable for
     * rollback. - `incompatible_result` - indicates that the deployment's result is not suitable for rollback. -
     * `exceeded_revision_limit` - indicates that the app has exceeded the rollback revision limits for its tier. -
     * `app_pinned` - indicates that there is already a rollback in progress and the app is pinned. -
     * `database_config_conflict` - indicates that the deployment's database config is different than the current
     * config. - `region_conflict` - indicates that the deployment's region differs from the current app region.
     *
     * <p>Warning conditions: - `static_site_requires_rebuild` - indicates that the deployment contains at least one
     * static site that will require a rebuild. - `image_source_missing_digest` - indicates that the deployment contains
     * at least one component with an image source that is missing a digest.
     *
     * @param code the code value to set.
     * @return the AppRollbackValidationCondition object itself.
     */
    public AppRollbackValidationCondition setCode(AppRollbackValidationConditionCode code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: A human-readable message describing the failing condition.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: A human-readable message describing the failing condition.
     *
     * @param message the message value to set.
     * @return the AppRollbackValidationCondition object itself.
     */
    public AppRollbackValidationCondition setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the components property: The components property.
     *
     * @return the components value.
     */
    public List<String> getComponents() {
        return this.components;
    }

    /**
     * Set the components property: The components property.
     *
     * @param components the components value to set.
     * @return the AppRollbackValidationCondition object itself.
     */
    public AppRollbackValidationCondition setComponents(List<String> components) {
        this.components = components;
        return this;
    }
}
