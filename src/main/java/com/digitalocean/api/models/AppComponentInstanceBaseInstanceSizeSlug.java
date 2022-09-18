package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The instance size to use for this component. Default: `basic-xxs`.
 */
public final class AppComponentInstanceBaseInstanceSizeSlug extends ExpandableStringEnum<AppComponentInstanceBaseInstanceSizeSlug> {
    /**
     * Static value basic-xxs for AppComponentInstanceBaseInstanceSizeSlug.
     */
    public static final AppComponentInstanceBaseInstanceSizeSlug BASIC_XXS = fromString("basic-xxs");

    /**
     * Static value basic-xs for AppComponentInstanceBaseInstanceSizeSlug.
     */
    public static final AppComponentInstanceBaseInstanceSizeSlug BASIC_XS = fromString("basic-xs");

    /**
     * Static value basic-s for AppComponentInstanceBaseInstanceSizeSlug.
     */
    public static final AppComponentInstanceBaseInstanceSizeSlug BASICS = fromString("basic-s");

    /**
     * Static value basic-m for AppComponentInstanceBaseInstanceSizeSlug.
     */
    public static final AppComponentInstanceBaseInstanceSizeSlug BASICM = fromString("basic-m");

    /**
     * Static value professional-xs for AppComponentInstanceBaseInstanceSizeSlug.
     */
    public static final AppComponentInstanceBaseInstanceSizeSlug PROFESSIONAL_XS = fromString("professional-xs");

    /**
     * Static value professional-s for AppComponentInstanceBaseInstanceSizeSlug.
     */
    public static final AppComponentInstanceBaseInstanceSizeSlug PROFESSIONALS = fromString("professional-s");

    /**
     * Static value professional-m for AppComponentInstanceBaseInstanceSizeSlug.
     */
    public static final AppComponentInstanceBaseInstanceSizeSlug PROFESSIONALM = fromString("professional-m");

    /**
     * Static value professional-1l for AppComponentInstanceBaseInstanceSizeSlug.
     */
    public static final AppComponentInstanceBaseInstanceSizeSlug PROFESSIONAL1L = fromString("professional-1l");

    /**
     * Static value professional-l for AppComponentInstanceBaseInstanceSizeSlug.
     */
    public static final AppComponentInstanceBaseInstanceSizeSlug PROFESSIONALL = fromString("professional-l");

    /**
     * Static value professional-xl for AppComponentInstanceBaseInstanceSizeSlug.
     */
    public static final AppComponentInstanceBaseInstanceSizeSlug PROFESSIONAL_XL = fromString("professional-xl");

    /**
     * Creates or finds a AppComponentInstanceBaseInstanceSizeSlug from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AppComponentInstanceBaseInstanceSizeSlug.
     */
    @JsonCreator
    public static AppComponentInstanceBaseInstanceSizeSlug fromString(String name) {
        return fromString(name, AppComponentInstanceBaseInstanceSizeSlug.class);
    }

    /**
     * Gets known AppComponentInstanceBaseInstanceSizeSlug values.
     * 
     * @return known AppComponentInstanceBaseInstanceSizeSlug values.
     */
    public static Collection<AppComponentInstanceBaseInstanceSizeSlug> values() {
        return values(AppComponentInstanceBaseInstanceSizeSlug.class);
    }
}
