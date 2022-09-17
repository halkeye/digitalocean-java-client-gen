package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A code identifier that represents the failing condition.
 *
 * <p>Failing conditions: - `incompatible_phase` - indicates that the deployment's phase is not suitable for rollback. -
 * `incompatible_result` - indicates that the deployment's result is not suitable for rollback. -
 * `exceeded_revision_limit` - indicates that the app has exceeded the rollback revision limits for its tier. -
 * `app_pinned` - indicates that there is already a rollback in progress and the app is pinned. -
 * `database_config_conflict` - indicates that the deployment's database config is different than the current config. -
 * `region_conflict` - indicates that the deployment's region differs from the current app region.
 *
 * <p>Warning conditions: - `static_site_requires_rebuild` - indicates that the deployment contains at least one static
 * site that will require a rebuild. - `image_source_missing_digest` - indicates that the deployment contains at least
 * one component with an image source that is missing a digest.
 */
public final class AppRollbackValidationConditionCode extends ExpandableStringEnum<AppRollbackValidationConditionCode> {
    /** Static value incompatible_phase for AppRollbackValidationConditionCode. */
    public static final AppRollbackValidationConditionCode INCOMPATIBLE_PHASE = fromString("incompatible_phase");

    /** Static value incompatible_result for AppRollbackValidationConditionCode. */
    public static final AppRollbackValidationConditionCode INCOMPATIBLE_RESULT = fromString("incompatible_result");

    /** Static value exceeded_revision_limit for AppRollbackValidationConditionCode. */
    public static final AppRollbackValidationConditionCode EXCEEDED_REVISION_LIMIT =
            fromString("exceeded_revision_limit");

    /** Static value app_pinned for AppRollbackValidationConditionCode. */
    public static final AppRollbackValidationConditionCode APP_PINNED = fromString("app_pinned");

    /** Static value database_config_conflict for AppRollbackValidationConditionCode. */
    public static final AppRollbackValidationConditionCode DATABASE_CONFIG_CONFLICT =
            fromString("database_config_conflict");

    /** Static value region_conflict for AppRollbackValidationConditionCode. */
    public static final AppRollbackValidationConditionCode REGION_CONFLICT = fromString("region_conflict");

    /** Static value static_site_requires_rebuild for AppRollbackValidationConditionCode. */
    public static final AppRollbackValidationConditionCode STATIC_SITE_REQUIRES_REBUILD =
            fromString("static_site_requires_rebuild");

    /** Static value image_source_missing_digest for AppRollbackValidationConditionCode. */
    public static final AppRollbackValidationConditionCode IMAGE_SOURCE_MISSING_DIGEST =
            fromString("image_source_missing_digest");

    /**
     * Creates or finds a AppRollbackValidationConditionCode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AppRollbackValidationConditionCode.
     */
    @JsonCreator
    public static AppRollbackValidationConditionCode fromString(String name) {
        return fromString(name, AppRollbackValidationConditionCode.class);
    }

    /**
     * Gets known AppRollbackValidationConditionCode values.
     *
     * @return known AppRollbackValidationConditionCode values.
     */
    public static Collection<AppRollbackValidationConditionCode> values() {
        return values(AppRollbackValidationConditionCode.class);
    }
}
