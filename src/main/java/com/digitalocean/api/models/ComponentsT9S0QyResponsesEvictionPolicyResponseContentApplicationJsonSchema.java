package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The ComponentsT9S0QyResponsesEvictionPolicyResponseContentApplicationJsonSchema model.
 */
@Fluent
public final class ComponentsT9S0QyResponsesEvictionPolicyResponseContentApplicationJsonSchema {
    /*
     * A string specifying the desired eviction policy for the Redis cluster.
     * 
     * - `noeviction`: Don't evict any data, returns error when memory limit is reached.
     * - `allkeys_lru:` Evict any key, least recently used (LRU) first.
     * - `allkeys_random`: Evict keys in a random order.
     * - `volatile_lru`: Evict keys with expiration only, least recently used (LRU) first.
     * - `volatile_random`: Evict keys with expiration only in a random order.
     * - `volatile_ttl`: Evict keys with expiration only, shortest time-to-live (TTL) first.
     */
    @JsonProperty(value = "eviction_policy", required = true)
    private EvictionPolicyModel evictionPolicy;

    /**
     * Get the evictionPolicy property: A string specifying the desired eviction policy for the Redis cluster.
     * 
     * - `noeviction`: Don't evict any data, returns error when memory limit is reached.
     * - `allkeys_lru:` Evict any key, least recently used (LRU) first.
     * - `allkeys_random`: Evict keys in a random order.
     * - `volatile_lru`: Evict keys with expiration only, least recently used (LRU) first.
     * - `volatile_random`: Evict keys with expiration only in a random order.
     * - `volatile_ttl`: Evict keys with expiration only, shortest time-to-live (TTL) first.
     * 
     * @return the evictionPolicy value.
     */
    public EvictionPolicyModel getEvictionPolicy() {
        return this.evictionPolicy;
    }

    /**
     * Set the evictionPolicy property: A string specifying the desired eviction policy for the Redis cluster.
     * 
     * - `noeviction`: Don't evict any data, returns error when memory limit is reached.
     * - `allkeys_lru:` Evict any key, least recently used (LRU) first.
     * - `allkeys_random`: Evict keys in a random order.
     * - `volatile_lru`: Evict keys with expiration only, least recently used (LRU) first.
     * - `volatile_random`: Evict keys with expiration only in a random order.
     * - `volatile_ttl`: Evict keys with expiration only, shortest time-to-live (TTL) first.
     * 
     * @param evictionPolicy the evictionPolicy value to set.
     * @return the ComponentsT9S0QyResponsesEvictionPolicyResponseContentApplicationJsonSchema object itself.
     */
    public ComponentsT9S0QyResponsesEvictionPolicyResponseContentApplicationJsonSchema setEvictionPolicy(EvictionPolicyModel evictionPolicy) {
        this.evictionPolicy = evictionPolicy;
        return this;
    }
}
