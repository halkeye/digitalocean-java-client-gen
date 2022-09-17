package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.EvictionPolicyModel;
import com.digitalocean.api.models.Redis;
import com.digitalocean.api.models.RedisAclChannelsDefault;
import com.digitalocean.api.models.RedisPersistence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RedisTests {
    @Test
    public void testDeserialize() {
        Redis model =
                BinaryData.fromString(
                                "{\"redis_maxmemory_policy\":\"noeviction\",\"redis_pubsub_client_output_buffer_limit\":1592088200,\"redis_number_of_databases\":1326617013,\"redis_io_threads\":193764352,\"redis_lfu_log_factor\":1701063526,\"redis_lfu_decay_time\":1908224692,\"redis_ssl\":true,\"redis_timeout\":154919279,\"redis_notify_keyspace_events\":\"vsqw\",\"redis_persistence\":\"rdb\",\"redis_acl_channels_default\":\"resetchannels\"}")
                        .toObject(Redis.class);
        Assertions.assertEquals(EvictionPolicyModel.NOEVICTION, model.getRedisMaxmemoryPolicy());
        Assertions.assertEquals(1592088200, model.getRedisPubsubClientOutputBufferLimit());
        Assertions.assertEquals(1326617013, model.getRedisNumberOfDatabases());
        Assertions.assertEquals(193764352, model.getRedisIoThreads());
        Assertions.assertEquals(1701063526, model.getRedisLfuLogFactor());
        Assertions.assertEquals(1908224692, model.getRedisLfuDecayTime());
        Assertions.assertEquals(true, model.isRedisSsl());
        Assertions.assertEquals(154919279, model.getRedisTimeout());
        Assertions.assertEquals("vsqw", model.getRedisNotifyKeyspaceEvents());
        Assertions.assertEquals(RedisPersistence.RDB, model.getRedisPersistence());
        Assertions.assertEquals(RedisAclChannelsDefault.RESETCHANNELS, model.getRedisAclChannelsDefault());
    }

    @Test
    public void testSerialize() {
        Redis model =
                new Redis()
                        .setRedisMaxmemoryPolicy(EvictionPolicyModel.NOEVICTION)
                        .setRedisPubsubClientOutputBufferLimit(1592088200)
                        .setRedisNumberOfDatabases(1326617013)
                        .setRedisIoThreads(193764352)
                        .setRedisLfuLogFactor(1701063526)
                        .setRedisLfuDecayTime(1908224692)
                        .setRedisSsl(true)
                        .setRedisTimeout(154919279)
                        .setRedisNotifyKeyspaceEvents("vsqw")
                        .setRedisPersistence(RedisPersistence.RDB)
                        .setRedisAclChannelsDefault(RedisAclChannelsDefault.RESETCHANNELS);
        model = BinaryData.fromObject(model).toObject(Redis.class);
        Assertions.assertEquals(EvictionPolicyModel.NOEVICTION, model.getRedisMaxmemoryPolicy());
        Assertions.assertEquals(1592088200, model.getRedisPubsubClientOutputBufferLimit());
        Assertions.assertEquals(1326617013, model.getRedisNumberOfDatabases());
        Assertions.assertEquals(193764352, model.getRedisIoThreads());
        Assertions.assertEquals(1701063526, model.getRedisLfuLogFactor());
        Assertions.assertEquals(1908224692, model.getRedisLfuDecayTime());
        Assertions.assertEquals(true, model.isRedisSsl());
        Assertions.assertEquals(154919279, model.getRedisTimeout());
        Assertions.assertEquals("vsqw", model.getRedisNotifyKeyspaceEvents());
        Assertions.assertEquals(RedisPersistence.RDB, model.getRedisPersistence());
        Assertions.assertEquals(RedisAclChannelsDefault.RESETCHANNELS, model.getRedisAclChannelsDefault());
    }
}
