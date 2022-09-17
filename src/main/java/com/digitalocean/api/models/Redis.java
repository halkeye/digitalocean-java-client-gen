package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Redis model. */
@Fluent
public final class Redis {
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
    @JsonProperty(value = "redis_maxmemory_policy")
    private EvictionPolicyModel redisMaxmemoryPolicy;

    /*
     * Set output buffer limit for pub / sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the
     * hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
     */
    @JsonProperty(value = "redis_pubsub_client_output_buffer_limit")
    private Integer redisPubsubClientOutputBufferLimit;

    /*
     * Set number of redis databases. Changing this will cause a restart of redis service.
     */
    @JsonProperty(value = "redis_number_of_databases")
    private Integer redisNumberOfDatabases;

    /*
     * Redis IO thread count
     */
    @JsonProperty(value = "redis_io_threads")
    private Integer redisIoThreads;

    /*
     * Counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory-policies
     */
    @JsonProperty(value = "redis_lfu_log_factor")
    private Integer redisLfuLogFactor;

    /*
     * LFU maxmemory-policy counter decay time in minutes
     */
    @JsonProperty(value = "redis_lfu_decay_time")
    private Integer redisLfuDecayTime;

    /*
     * Require SSL to access Redis
     */
    @JsonProperty(value = "redis_ssl")
    private Boolean redisSsl;

    /*
     * Redis idle connection timeout in seconds
     */
    @JsonProperty(value = "redis_timeout")
    private Integer redisTimeout;

    /*
     * Set notify-keyspace-events option
     */
    @JsonProperty(value = "redis_notify_keyspace_events")
    private String redisNotifyKeyspaceEvents;

    /*
     * When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done
     * according to backup schedule for backup purposes. When persistence is 'off', no RDB dumps and backups are done,
     * so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also
     * service can't be forked.
     */
    @JsonProperty(value = "redis_persistence")
    private RedisPersistence redisPersistence;

    /*
     * Determines default pub/sub channels' ACL for new users if ACL is not supplied. When this option is not defined,
     * all_channels is assumed to keep backward compatibility. This option doesn't affect Redis configuration
     * acl-pubsub-default.
     */
    @JsonProperty(value = "redis_acl_channels_default")
    private RedisAclChannelsDefault redisAclChannelsDefault;

    /**
     * Get the redisMaxmemoryPolicy property: A string specifying the desired eviction policy for the Redis cluster.
     *
     * <p>- `noeviction`: Don't evict any data, returns error when memory limit is reached. - `allkeys_lru:` Evict any
     * key, least recently used (LRU) first. - `allkeys_random`: Evict keys in a random order. - `volatile_lru`: Evict
     * keys with expiration only, least recently used (LRU) first. - `volatile_random`: Evict keys with expiration only
     * in a random order. - `volatile_ttl`: Evict keys with expiration only, shortest time-to-live (TTL) first.
     *
     * @return the redisMaxmemoryPolicy value.
     */
    public EvictionPolicyModel getRedisMaxmemoryPolicy() {
        return this.redisMaxmemoryPolicy;
    }

    /**
     * Set the redisMaxmemoryPolicy property: A string specifying the desired eviction policy for the Redis cluster.
     *
     * <p>- `noeviction`: Don't evict any data, returns error when memory limit is reached. - `allkeys_lru:` Evict any
     * key, least recently used (LRU) first. - `allkeys_random`: Evict keys in a random order. - `volatile_lru`: Evict
     * keys with expiration only, least recently used (LRU) first. - `volatile_random`: Evict keys with expiration only
     * in a random order. - `volatile_ttl`: Evict keys with expiration only, shortest time-to-live (TTL) first.
     *
     * @param redisMaxmemoryPolicy the redisMaxmemoryPolicy value to set.
     * @return the Redis object itself.
     */
    public Redis setRedisMaxmemoryPolicy(EvictionPolicyModel redisMaxmemoryPolicy) {
        this.redisMaxmemoryPolicy = redisMaxmemoryPolicy;
        return this;
    }

    /**
     * Get the redisPubsubClientOutputBufferLimit property: Set output buffer limit for pub / sub clients in MB. The
     * value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the
     * available memory in the selected service plan.
     *
     * @return the redisPubsubClientOutputBufferLimit value.
     */
    public Integer getRedisPubsubClientOutputBufferLimit() {
        return this.redisPubsubClientOutputBufferLimit;
    }

    /**
     * Set the redisPubsubClientOutputBufferLimit property: Set output buffer limit for pub / sub clients in MB. The
     * value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the
     * available memory in the selected service plan.
     *
     * @param redisPubsubClientOutputBufferLimit the redisPubsubClientOutputBufferLimit value to set.
     * @return the Redis object itself.
     */
    public Redis setRedisPubsubClientOutputBufferLimit(Integer redisPubsubClientOutputBufferLimit) {
        this.redisPubsubClientOutputBufferLimit = redisPubsubClientOutputBufferLimit;
        return this;
    }

    /**
     * Get the redisNumberOfDatabases property: Set number of redis databases. Changing this will cause a restart of
     * redis service.
     *
     * @return the redisNumberOfDatabases value.
     */
    public Integer getRedisNumberOfDatabases() {
        return this.redisNumberOfDatabases;
    }

    /**
     * Set the redisNumberOfDatabases property: Set number of redis databases. Changing this will cause a restart of
     * redis service.
     *
     * @param redisNumberOfDatabases the redisNumberOfDatabases value to set.
     * @return the Redis object itself.
     */
    public Redis setRedisNumberOfDatabases(Integer redisNumberOfDatabases) {
        this.redisNumberOfDatabases = redisNumberOfDatabases;
        return this;
    }

    /**
     * Get the redisIoThreads property: Redis IO thread count.
     *
     * @return the redisIoThreads value.
     */
    public Integer getRedisIoThreads() {
        return this.redisIoThreads;
    }

    /**
     * Set the redisIoThreads property: Redis IO thread count.
     *
     * @param redisIoThreads the redisIoThreads value to set.
     * @return the Redis object itself.
     */
    public Redis setRedisIoThreads(Integer redisIoThreads) {
        this.redisIoThreads = redisIoThreads;
        return this;
    }

    /**
     * Get the redisLfuLogFactor property: Counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory-policies.
     *
     * @return the redisLfuLogFactor value.
     */
    public Integer getRedisLfuLogFactor() {
        return this.redisLfuLogFactor;
    }

    /**
     * Set the redisLfuLogFactor property: Counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory-policies.
     *
     * @param redisLfuLogFactor the redisLfuLogFactor value to set.
     * @return the Redis object itself.
     */
    public Redis setRedisLfuLogFactor(Integer redisLfuLogFactor) {
        this.redisLfuLogFactor = redisLfuLogFactor;
        return this;
    }

    /**
     * Get the redisLfuDecayTime property: LFU maxmemory-policy counter decay time in minutes.
     *
     * @return the redisLfuDecayTime value.
     */
    public Integer getRedisLfuDecayTime() {
        return this.redisLfuDecayTime;
    }

    /**
     * Set the redisLfuDecayTime property: LFU maxmemory-policy counter decay time in minutes.
     *
     * @param redisLfuDecayTime the redisLfuDecayTime value to set.
     * @return the Redis object itself.
     */
    public Redis setRedisLfuDecayTime(Integer redisLfuDecayTime) {
        this.redisLfuDecayTime = redisLfuDecayTime;
        return this;
    }

    /**
     * Get the redisSsl property: Require SSL to access Redis.
     *
     * @return the redisSsl value.
     */
    public Boolean isRedisSsl() {
        return this.redisSsl;
    }

    /**
     * Set the redisSsl property: Require SSL to access Redis.
     *
     * @param redisSsl the redisSsl value to set.
     * @return the Redis object itself.
     */
    public Redis setRedisSsl(Boolean redisSsl) {
        this.redisSsl = redisSsl;
        return this;
    }

    /**
     * Get the redisTimeout property: Redis idle connection timeout in seconds.
     *
     * @return the redisTimeout value.
     */
    public Integer getRedisTimeout() {
        return this.redisTimeout;
    }

    /**
     * Set the redisTimeout property: Redis idle connection timeout in seconds.
     *
     * @param redisTimeout the redisTimeout value to set.
     * @return the Redis object itself.
     */
    public Redis setRedisTimeout(Integer redisTimeout) {
        this.redisTimeout = redisTimeout;
        return this;
    }

    /**
     * Get the redisNotifyKeyspaceEvents property: Set notify-keyspace-events option.
     *
     * @return the redisNotifyKeyspaceEvents value.
     */
    public String getRedisNotifyKeyspaceEvents() {
        return this.redisNotifyKeyspaceEvents;
    }

    /**
     * Set the redisNotifyKeyspaceEvents property: Set notify-keyspace-events option.
     *
     * @param redisNotifyKeyspaceEvents the redisNotifyKeyspaceEvents value to set.
     * @return the Redis object itself.
     */
    public Redis setRedisNotifyKeyspaceEvents(String redisNotifyKeyspaceEvents) {
        this.redisNotifyKeyspaceEvents = redisNotifyKeyspaceEvents;
        return this;
    }

    /**
     * Get the redisPersistence property: When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is
     * changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is 'off', no
     * RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if
     * service is powered off. Also service can't be forked.
     *
     * @return the redisPersistence value.
     */
    public RedisPersistence getRedisPersistence() {
        return this.redisPersistence;
    }

    /**
     * Set the redisPersistence property: When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is
     * changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is 'off', no
     * RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if
     * service is powered off. Also service can't be forked.
     *
     * @param redisPersistence the redisPersistence value to set.
     * @return the Redis object itself.
     */
    public Redis setRedisPersistence(RedisPersistence redisPersistence) {
        this.redisPersistence = redisPersistence;
        return this;
    }

    /**
     * Get the redisAclChannelsDefault property: Determines default pub/sub channels' ACL for new users if ACL is not
     * supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option
     * doesn't affect Redis configuration acl-pubsub-default.
     *
     * @return the redisAclChannelsDefault value.
     */
    public RedisAclChannelsDefault getRedisAclChannelsDefault() {
        return this.redisAclChannelsDefault;
    }

    /**
     * Set the redisAclChannelsDefault property: Determines default pub/sub channels' ACL for new users if ACL is not
     * supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option
     * doesn't affect Redis configuration acl-pubsub-default.
     *
     * @param redisAclChannelsDefault the redisAclChannelsDefault value to set.
     * @return the Redis object itself.
     */
    public Redis setRedisAclChannelsDefault(RedisAclChannelsDefault redisAclChannelsDefault) {
        this.redisAclChannelsDefault = redisAclChannelsDefault;
        return this;
    }
}
