package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Mysql;
import com.digitalocean.api.models.MysqlInternalTmpMemStorageEngine;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MysqlTests {
    @Test
    public void testDeserialize() {
        Mysql model = BinaryData.fromString("{\"backup_hour\":99360377,\"backup_minute\":206783599,\"sql_mode\":\"lctaeb\",\"connect_timeout\":807583540,\"default_time_zone\":\"ledjcustbvtqigd\",\"group_concat_max_len\":1899435614,\"information_schema_stats_expiry\":2021179432,\"innodb_ft_min_token_size\":2098110857,\"innodb_ft_server_stopword_table\":\"gfosehxlzsxez\",\"innodb_lock_wait_timeout\":911230871,\"innodb_log_buffer_size\":346065093,\"innodb_online_alter_log_max_size\":1228290805,\"innodb_print_all_deadlocks\":true,\"innodb_rollback_on_timeout\":true,\"interactive_timeout\":725661338,\"internal_tmp_mem_storage_engine\":\"TempTable\",\"net_read_timeout\":2091230179,\"net_write_timeout\":1259059473,\"sql_require_primary_key\":false,\"wait_timeout\":1119997590,\"max_allowed_packet\":2092040078,\"max_heap_table_size\":1825702886,\"sort_buffer_size\":1803184216,\"tmp_table_size\":951853917,\"slow_query_log\":false,\"long_query_time\":46.941013,\"binlog_retention_period\":10.291165}").toObject(Mysql.class);
        Assertions.assertEquals(99360377, model.getBackupHour());
        Assertions.assertEquals(206783599, model.getBackupMinute());
        Assertions.assertEquals("lctaeb", model.getSqlMode());
        Assertions.assertEquals(807583540, model.getConnectTimeout());
        Assertions.assertEquals("ledjcustbvtqigd", model.getDefaultTimeZone());
        Assertions.assertEquals(1899435614, model.getGroupConcatMaxLen());
        Assertions.assertEquals(2021179432, model.getInformationSchemaStatsExpiry());
        Assertions.assertEquals(2098110857, model.getInnodbFtMinTokenSize());
        Assertions.assertEquals("gfosehxlzsxez", model.getInnodbFtServerStopwordTable());
        Assertions.assertEquals(911230871, model.getInnodbLockWaitTimeout());
        Assertions.assertEquals(346065093, model.getInnodbLogBufferSize());
        Assertions.assertEquals(1228290805, model.getInnodbOnlineAlterLogMaxSize());
        Assertions.assertEquals(true, model.isInnodbPrintAllDeadlocks());
        Assertions.assertEquals(true, model.isInnodbRollbackOnTimeout());
        Assertions.assertEquals(725661338, model.getInteractiveTimeout());
        Assertions.assertEquals(MysqlInternalTmpMemStorageEngine.TEMP_TABLE, model.getInternalTmpMemStorageEngine());
        Assertions.assertEquals(2091230179, model.getNetReadTimeout());
        Assertions.assertEquals(1259059473, model.getNetWriteTimeout());
        Assertions.assertEquals(false, model.isSqlRequirePrimaryKey());
        Assertions.assertEquals(1119997590, model.getWaitTimeout());
        Assertions.assertEquals(2092040078, model.getMaxAllowedPacket());
        Assertions.assertEquals(1825702886, model.getMaxHeapTableSize());
        Assertions.assertEquals(1803184216, model.getSortBufferSize());
        Assertions.assertEquals(951853917, model.getTmpTableSize());
        Assertions.assertEquals(false, model.isSlowQueryLog());
        Assertions.assertEquals(46.941013F, model.getLongQueryTime());
        Assertions.assertEquals(10.291165F, model.getBinlogRetentionPeriod());
    }

    @Test
    public void testSerialize() {
        Mysql model = new Mysql().setBackupHour(99360377).setBackupMinute(206783599).setSqlMode("lctaeb").setConnectTimeout(807583540).setDefaultTimeZone("ledjcustbvtqigd").setGroupConcatMaxLen(1899435614).setInformationSchemaStatsExpiry(2021179432).setInnodbFtMinTokenSize(2098110857).setInnodbFtServerStopwordTable("gfosehxlzsxez").setInnodbLockWaitTimeout(911230871).setInnodbLogBufferSize(346065093).setInnodbOnlineAlterLogMaxSize(1228290805).setInnodbPrintAllDeadlocks(true).setInnodbRollbackOnTimeout(true).setInteractiveTimeout(725661338).setInternalTmpMemStorageEngine(MysqlInternalTmpMemStorageEngine.TEMP_TABLE).setNetReadTimeout(2091230179).setNetWriteTimeout(1259059473).setSqlRequirePrimaryKey(false).setWaitTimeout(1119997590).setMaxAllowedPacket(2092040078).setMaxHeapTableSize(1825702886).setSortBufferSize(1803184216).setTmpTableSize(951853917).setSlowQueryLog(false).setLongQueryTime(46.941013F).setBinlogRetentionPeriod(10.291165F);
        model = BinaryData.fromObject(model).toObject(Mysql.class);
        Assertions.assertEquals(99360377, model.getBackupHour());
        Assertions.assertEquals(206783599, model.getBackupMinute());
        Assertions.assertEquals("lctaeb", model.getSqlMode());
        Assertions.assertEquals(807583540, model.getConnectTimeout());
        Assertions.assertEquals("ledjcustbvtqigd", model.getDefaultTimeZone());
        Assertions.assertEquals(1899435614, model.getGroupConcatMaxLen());
        Assertions.assertEquals(2021179432, model.getInformationSchemaStatsExpiry());
        Assertions.assertEquals(2098110857, model.getInnodbFtMinTokenSize());
        Assertions.assertEquals("gfosehxlzsxez", model.getInnodbFtServerStopwordTable());
        Assertions.assertEquals(911230871, model.getInnodbLockWaitTimeout());
        Assertions.assertEquals(346065093, model.getInnodbLogBufferSize());
        Assertions.assertEquals(1228290805, model.getInnodbOnlineAlterLogMaxSize());
        Assertions.assertEquals(true, model.isInnodbPrintAllDeadlocks());
        Assertions.assertEquals(true, model.isInnodbRollbackOnTimeout());
        Assertions.assertEquals(725661338, model.getInteractiveTimeout());
        Assertions.assertEquals(MysqlInternalTmpMemStorageEngine.TEMP_TABLE, model.getInternalTmpMemStorageEngine());
        Assertions.assertEquals(2091230179, model.getNetReadTimeout());
        Assertions.assertEquals(1259059473, model.getNetWriteTimeout());
        Assertions.assertEquals(false, model.isSqlRequirePrimaryKey());
        Assertions.assertEquals(1119997590, model.getWaitTimeout());
        Assertions.assertEquals(2092040078, model.getMaxAllowedPacket());
        Assertions.assertEquals(1825702886, model.getMaxHeapTableSize());
        Assertions.assertEquals(1803184216, model.getSortBufferSize());
        Assertions.assertEquals(951853917, model.getTmpTableSize());
        Assertions.assertEquals(false, model.isSlowQueryLog());
        Assertions.assertEquals(46.941013F, model.getLongQueryTime());
        Assertions.assertEquals(10.291165F, model.getBinlogRetentionPeriod());
    }
}
