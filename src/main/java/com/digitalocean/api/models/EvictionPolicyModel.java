package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A string specifying the desired eviction policy for the Redis cluster.
 * 
 * - `noeviction`: Don't evict any data, returns error when memory limit is reached.
 * - `allkeys_lru:` Evict any key, least recently used (LRU) first.
 * - `allkeys_random`: Evict keys in a random order.
 * - `volatile_lru`: Evict keys with expiration only, least recently used (LRU) first.
 * - `volatile_random`: Evict keys with expiration only in a random order.
 * - `volatile_ttl`: Evict keys with expiration only, shortest time-to-live (TTL) first.
 */
public final class EvictionPolicyModel extends ExpandableStringEnum<EvictionPolicyModel> {
    /**
     * Static value noeviction for EvictionPolicyModel.
     */
    public static final EvictionPolicyModel NOEVICTION = fromString("noeviction");

    /**
     * Static value allkeys_lru for EvictionPolicyModel.
     */
    public static final EvictionPolicyModel ALLKEYS_LRU = fromString("allkeys_lru");

    /**
     * Static value allkeys_random for EvictionPolicyModel.
     */
    public static final EvictionPolicyModel ALLKEYS_RANDOM = fromString("allkeys_random");

    /**
     * Static value volatile_lru for EvictionPolicyModel.
     */
    public static final EvictionPolicyModel VOLATILE_LRU = fromString("volatile_lru");

    /**
     * Static value volatile_random for EvictionPolicyModel.
     */
    public static final EvictionPolicyModel VOLATILE_RANDOM = fromString("volatile_random");

    /**
     * Static value volatile_ttl for EvictionPolicyModel.
     */
    public static final EvictionPolicyModel VOLATILE_TTL = fromString("volatile_ttl");

    /**
     * Creates or finds a EvictionPolicyModel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EvictionPolicyModel.
     */
    @JsonCreator
    public static EvictionPolicyModel fromString(String name) {
        return fromString(name, EvictionPolicyModel.class);
    }

    /**
     * Gets known EvictionPolicyModel values.
     * 
     * @return known EvictionPolicyModel values.
     */
    public static Collection<EvictionPolicyModel> values() {
        return values(EvictionPolicyModel.class);
    }
}
