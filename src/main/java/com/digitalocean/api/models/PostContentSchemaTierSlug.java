package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The slug of the subscription tier to sign up for. */
public final class PostContentSchemaTierSlug extends ExpandableStringEnum<PostContentSchemaTierSlug> {
    /** Static value starter for PostContentSchemaTierSlug. */
    public static final PostContentSchemaTierSlug STARTER = fromString("starter");

    /** Static value basic for PostContentSchemaTierSlug. */
    public static final PostContentSchemaTierSlug BASIC = fromString("basic");

    /** Static value professional for PostContentSchemaTierSlug. */
    public static final PostContentSchemaTierSlug PROFESSIONAL = fromString("professional");

    /**
     * Creates or finds a PostContentSchemaTierSlug from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PostContentSchemaTierSlug.
     */
    @JsonCreator
    public static PostContentSchemaTierSlug fromString(String name) {
        return fromString(name, PostContentSchemaTierSlug.class);
    }

    /**
     * Gets known PostContentSchemaTierSlug values.
     *
     * @return known PostContentSchemaTierSlug values.
     */
    public static Collection<PostContentSchemaTierSlug> values() {
        return values(PostContentSchemaTierSlug.class);
    }
}
