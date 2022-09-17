package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done
 * according to backup schedule for backup purposes. When persistence is 'off', no RDB dumps and backups are done, so
 * data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service
 * can't be forked.
 */
public final class RedisPersistence extends ExpandableStringEnum<RedisPersistence> {
    /** Static value off for RedisPersistence. */
    public static final RedisPersistence OFF = fromString("off");

    /** Static value rdb for RedisPersistence. */
    public static final RedisPersistence RDB = fromString("rdb");

    /**
     * Creates or finds a RedisPersistence from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RedisPersistence.
     */
    @JsonCreator
    public static RedisPersistence fromString(String name) {
        return fromString(name, RedisPersistence.class);
    }

    /**
     * Gets known RedisPersistence values.
     *
     * @return known RedisPersistence values.
     */
    public static Collection<RedisPersistence> values() {
        return values(RedisPersistence.class);
    }
}
