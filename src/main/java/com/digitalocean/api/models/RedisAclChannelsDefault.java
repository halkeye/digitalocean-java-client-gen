package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Determines default pub/sub channels' ACL for new users if ACL is not supplied. When this option is not defined,
 * all_channels is assumed to keep backward compatibility. This option doesn't affect Redis configuration
 * acl-pubsub-default.
 */
public final class RedisAclChannelsDefault extends ExpandableStringEnum<RedisAclChannelsDefault> {
    /** Static value allchannels for RedisAclChannelsDefault. */
    public static final RedisAclChannelsDefault ALLCHANNELS = fromString("allchannels");

    /** Static value resetchannels for RedisAclChannelsDefault. */
    public static final RedisAclChannelsDefault RESETCHANNELS = fromString("resetchannels");

    /**
     * Creates or finds a RedisAclChannelsDefault from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RedisAclChannelsDefault.
     */
    @JsonCreator
    public static RedisAclChannelsDefault fromString(String name) {
        return fromString(name, RedisAclChannelsDefault.class);
    }

    /**
     * Gets known RedisAclChannelsDefault values.
     *
     * @return known RedisAclChannelsDefault values.
     */
    public static Collection<RedisAclChannelsDefault> values() {
        return values(RedisAclChannelsDefault.class);
    }
}
