package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Pgbouncer;
import com.digitalocean.api.models.PgbouncerAutodbPoolMode;
import com.digitalocean.api.models.PgbouncerIgnoreStartupParametersItem;
import com.digitalocean.api.models.PostfixLogLinePrefix;
import com.digitalocean.api.models.Postgres;
import com.digitalocean.api.models.PostgresDefaultToastCompression;
import com.digitalocean.api.models.PostgresLogErrorVerbosity;
import com.digitalocean.api.models.PostgresSynchronousReplication;
import com.digitalocean.api.models.PostgresTrackCommitTimestamp;
import com.digitalocean.api.models.PostgresTrackFunctions;
import com.digitalocean.api.models.PostgresTrackIoTiming;
import com.digitalocean.api.models.Timescaledb;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PostgresTests {
    @Test
    public void testDeserialize() {
        Postgres model =
                BinaryData.fromString(
                                "{\"autovacuum_freeze_max_age\":528311226,\"autovacuum_max_workers\":949473929,\"autovacuum_naptime\":326597676,\"autovacuum_vacuum_threshold\":123409428,\"autovacuum_analyze_threshold\":773354662,\"autovacuum_vacuum_scale_factor\":17.09538,\"autovacuum_analyze_scale_factor\":44.77819,\"autovacuum_vacuum_cost_delay\":1210825662,\"autovacuum_vacuum_cost_limit\":219493661,\"backup_hour\":2116437120,\"backup_minute\":265392201,\"bgwriter_delay\":1131906752,\"bgwriter_flush_after\":1256995489,\"bgwriter_lru_maxpages\":804788367,\"bgwriter_lru_multiplier\":72.10236,\"deadlock_timeout\":1975597968,\"default_toast_compression\":\"pglz\",\"idle_in_transaction_session_timeout\":1628725143,\"jit\":true,\"log_autovacuum_min_duration\":1885711244,\"log_error_verbosity\":\"DEFAULT\",\"log_line_prefix\":\"%t [%p]: [%l-1] user=%u,db=%d,app=%a,client=%h\",\"log_min_duration_statement\":272399578,\"max_files_per_process\":278178676,\"max_prepared_transactions\":831236288,\"max_pred_locks_per_transaction\":1206122541,\"max_locks_per_transaction\":907593320,\"max_stack_depth\":574659563,\"max_standby_archive_delay\":1956520273,\"max_standby_streaming_delay\":1906837795,\"max_replication_slots\":1036369649,\"max_logical_replication_workers\":1632010745,\"max_parallel_workers\":820093362,\"max_parallel_workers_per_gather\":1495842019,\"max_worker_processes\":498513980,\"pg_partman_bgw.role\":\"dw\",\"pg_partman_bgw.interval\":1754375162,\"pg_stat_statements.track\":\"all\",\"temp_file_limit\":859175922,\"timezone\":\"ovcxjs\",\"track_activity_query_size\":293987127,\"track_commit_timestamp\":\"off\",\"track_functions\":\"all\",\"track_io_timing\":\"on\",\"max_wal_senders\":1508387956,\"wal_sender_timeout\":94382196,\"wal_writer_delay\":993677532,\"shared_buffers_percentage\":41.015945,\"pgbouncer\":{\"server_reset_query_always\":false,\"ignore_startup_parameters\":[\"extra_float_digits\",\"search_path\",\"extra_float_digits\",\"extra_float_digits\"],\"min_pool_size\":331261766,\"server_lifetime\":1354347075,\"server_idle_timeout\":558739047,\"autodb_pool_size\":2044252438,\"autodb_pool_mode\":\"session\",\"autodb_max_db_connections\":1725953253,\"autodb_idle_timeout\":1382840208},\"work_mem\":91613263,\"timescaledb\":{\"max_background_workers\":1327858771},\"synchronous_replication\":\"off\",\"stat_monitor_enable\":false}")
                        .toObject(Postgres.class);
        Assertions.assertEquals(528311226, model.getAutovacuumFreezeMaxAge());
        Assertions.assertEquals(949473929, model.getAutovacuumMaxWorkers());
        Assertions.assertEquals(326597676, model.getAutovacuumNaptime());
        Assertions.assertEquals(123409428, model.getAutovacuumVacuumThreshold());
        Assertions.assertEquals(773354662, model.getAutovacuumAnalyzeThreshold());
        Assertions.assertEquals(17.09538F, model.getAutovacuumVacuumScaleFactor());
        Assertions.assertEquals(44.77819F, model.getAutovacuumAnalyzeScaleFactor());
        Assertions.assertEquals(1210825662, model.getAutovacuumVacuumCostDelay());
        Assertions.assertEquals(219493661, model.getAutovacuumVacuumCostLimit());
        Assertions.assertEquals(2116437120, model.getBackupHour());
        Assertions.assertEquals(265392201, model.getBackupMinute());
        Assertions.assertEquals(1131906752, model.getBgwriterDelay());
        Assertions.assertEquals(1256995489, model.getBgwriterFlushAfter());
        Assertions.assertEquals(804788367, model.getBgwriterLruMaxpages());
        Assertions.assertEquals(72.10236F, model.getBgwriterLruMultiplier());
        Assertions.assertEquals(1975597968, model.getDeadlockTimeout());
        Assertions.assertEquals(PostgresDefaultToastCompression.PGLZ, model.getDefaultToastCompression());
        Assertions.assertEquals(1628725143, model.getIdleInTransactionSessionTimeout());
        Assertions.assertEquals(true, model.isJit());
        Assertions.assertEquals(1885711244, model.getLogAutovacuumMinDuration());
        Assertions.assertEquals(PostgresLogErrorVerbosity.DEFAULT, model.getLogErrorVerbosity());
        Assertions.assertEquals(PostfixLogLinePrefix.THIRD_OPTION, model.getLogLinePrefix());
        Assertions.assertEquals(272399578, model.getLogMinDurationStatement());
        Assertions.assertEquals(278178676, model.getMaxFilesPerProcess());
        Assertions.assertEquals(831236288, model.getMaxPreparedTransactions());
        Assertions.assertEquals(1206122541, model.getMaxPredLocksPerTransaction());
        Assertions.assertEquals(907593320, model.getMaxLocksPerTransaction());
        Assertions.assertEquals(574659563, model.getMaxStackDepth());
        Assertions.assertEquals(1956520273, model.getMaxStandbyArchiveDelay());
        Assertions.assertEquals(1906837795, model.getMaxStandbyStreamingDelay());
        Assertions.assertEquals(1036369649, model.getMaxReplicationSlots());
        Assertions.assertEquals(1632010745, model.getMaxLogicalReplicationWorkers());
        Assertions.assertEquals(820093362, model.getMaxParallelWorkers());
        Assertions.assertEquals(1495842019, model.getMaxParallelWorkersPerGather());
        Assertions.assertEquals(498513980, model.getMaxWorkerProcesses());
        Assertions.assertEquals(859175922, model.getTempFileLimit());
        Assertions.assertEquals("ovcxjs", model.getTimezone());
        Assertions.assertEquals(293987127, model.getTrackActivityQuerySize());
        Assertions.assertEquals(PostgresTrackCommitTimestamp.OFF, model.getTrackCommitTimestamp());
        Assertions.assertEquals(PostgresTrackFunctions.ALL, model.getTrackFunctions());
        Assertions.assertEquals(PostgresTrackIoTiming.ON, model.getTrackIoTiming());
        Assertions.assertEquals(1508387956, model.getMaxWalSenders());
        Assertions.assertEquals(94382196, model.getWalSenderTimeout());
        Assertions.assertEquals(993677532, model.getWalWriterDelay());
        Assertions.assertEquals(41.015945F, model.getSharedBuffersPercentage());
        Assertions.assertEquals(false, model.getPgbouncer().isServerResetQueryAlways());
        Assertions.assertEquals(
                PgbouncerIgnoreStartupParametersItem.EXTRA_FLOAT_DIGITS,
                model.getPgbouncer().getIgnoreStartupParameters().get(0));
        Assertions.assertEquals(331261766, model.getPgbouncer().getMinPoolSize());
        Assertions.assertEquals(1354347075, model.getPgbouncer().getServerLifetime());
        Assertions.assertEquals(558739047, model.getPgbouncer().getServerIdleTimeout());
        Assertions.assertEquals(2044252438, model.getPgbouncer().getAutodbPoolSize());
        Assertions.assertEquals(PgbouncerAutodbPoolMode.SESSION, model.getPgbouncer().getAutodbPoolMode());
        Assertions.assertEquals(1725953253, model.getPgbouncer().getAutodbMaxDbConnections());
        Assertions.assertEquals(1382840208, model.getPgbouncer().getAutodbIdleTimeout());
        Assertions.assertEquals(91613263, model.getWorkMem());
        Assertions.assertEquals(1327858771, model.getTimescaledb().getMaxBackgroundWorkers());
        Assertions.assertEquals(PostgresSynchronousReplication.OFF, model.getSynchronousReplication());
        Assertions.assertEquals(false, model.isStatMonitorEnable());
    }

    @Test
    public void testSerialize() {
        Postgres model =
                new Postgres()
                        .setAutovacuumFreezeMaxAge(528311226)
                        .setAutovacuumMaxWorkers(949473929)
                        .setAutovacuumNaptime(326597676)
                        .setAutovacuumVacuumThreshold(123409428)
                        .setAutovacuumAnalyzeThreshold(773354662)
                        .setAutovacuumVacuumScaleFactor(17.09538F)
                        .setAutovacuumAnalyzeScaleFactor(44.77819F)
                        .setAutovacuumVacuumCostDelay(1210825662)
                        .setAutovacuumVacuumCostLimit(219493661)
                        .setBackupHour(2116437120)
                        .setBackupMinute(265392201)
                        .setBgwriterDelay(1131906752)
                        .setBgwriterFlushAfter(1256995489)
                        .setBgwriterLruMaxpages(804788367)
                        .setBgwriterLruMultiplier(72.10236F)
                        .setDeadlockTimeout(1975597968)
                        .setDefaultToastCompression(PostgresDefaultToastCompression.PGLZ)
                        .setIdleInTransactionSessionTimeout(1628725143)
                        .setJit(true)
                        .setLogAutovacuumMinDuration(1885711244)
                        .setLogErrorVerbosity(PostgresLogErrorVerbosity.DEFAULT)
                        .setLogLinePrefix(PostfixLogLinePrefix.THIRD_OPTION)
                        .setLogMinDurationStatement(272399578)
                        .setMaxFilesPerProcess(278178676)
                        .setMaxPreparedTransactions(831236288)
                        .setMaxPredLocksPerTransaction(1206122541)
                        .setMaxLocksPerTransaction(907593320)
                        .setMaxStackDepth(574659563)
                        .setMaxStandbyArchiveDelay(1956520273)
                        .setMaxStandbyStreamingDelay(1906837795)
                        .setMaxReplicationSlots(1036369649)
                        .setMaxLogicalReplicationWorkers(1632010745)
                        .setMaxParallelWorkers(820093362)
                        .setMaxParallelWorkersPerGather(1495842019)
                        .setMaxWorkerProcesses(498513980)
                        .setTempFileLimit(859175922)
                        .setTimezone("ovcxjs")
                        .setTrackActivityQuerySize(293987127)
                        .setTrackCommitTimestamp(PostgresTrackCommitTimestamp.OFF)
                        .setTrackFunctions(PostgresTrackFunctions.ALL)
                        .setTrackIoTiming(PostgresTrackIoTiming.ON)
                        .setMaxWalSenders(1508387956)
                        .setWalSenderTimeout(94382196)
                        .setWalWriterDelay(993677532)
                        .setSharedBuffersPercentage(41.015945F)
                        .setPgbouncer(
                                new Pgbouncer()
                                        .setServerResetQueryAlways(false)
                                        .setIgnoreStartupParameters(
                                                Arrays.asList(
                                                        PgbouncerIgnoreStartupParametersItem.EXTRA_FLOAT_DIGITS,
                                                        PgbouncerIgnoreStartupParametersItem.SEARCH_PATH,
                                                        PgbouncerIgnoreStartupParametersItem.EXTRA_FLOAT_DIGITS,
                                                        PgbouncerIgnoreStartupParametersItem.EXTRA_FLOAT_DIGITS))
                                        .setMinPoolSize(331261766)
                                        .setServerLifetime(1354347075)
                                        .setServerIdleTimeout(558739047)
                                        .setAutodbPoolSize(2044252438)
                                        .setAutodbPoolMode(PgbouncerAutodbPoolMode.SESSION)
                                        .setAutodbMaxDbConnections(1725953253)
                                        .setAutodbIdleTimeout(1382840208))
                        .setWorkMem(91613263)
                        .setTimescaledb(new Timescaledb().setMaxBackgroundWorkers(1327858771))
                        .setSynchronousReplication(PostgresSynchronousReplication.OFF)
                        .setStatMonitorEnable(false);
        model = BinaryData.fromObject(model).toObject(Postgres.class);
        Assertions.assertEquals(528311226, model.getAutovacuumFreezeMaxAge());
        Assertions.assertEquals(949473929, model.getAutovacuumMaxWorkers());
        Assertions.assertEquals(326597676, model.getAutovacuumNaptime());
        Assertions.assertEquals(123409428, model.getAutovacuumVacuumThreshold());
        Assertions.assertEquals(773354662, model.getAutovacuumAnalyzeThreshold());
        Assertions.assertEquals(17.09538F, model.getAutovacuumVacuumScaleFactor());
        Assertions.assertEquals(44.77819F, model.getAutovacuumAnalyzeScaleFactor());
        Assertions.assertEquals(1210825662, model.getAutovacuumVacuumCostDelay());
        Assertions.assertEquals(219493661, model.getAutovacuumVacuumCostLimit());
        Assertions.assertEquals(2116437120, model.getBackupHour());
        Assertions.assertEquals(265392201, model.getBackupMinute());
        Assertions.assertEquals(1131906752, model.getBgwriterDelay());
        Assertions.assertEquals(1256995489, model.getBgwriterFlushAfter());
        Assertions.assertEquals(804788367, model.getBgwriterLruMaxpages());
        Assertions.assertEquals(72.10236F, model.getBgwriterLruMultiplier());
        Assertions.assertEquals(1975597968, model.getDeadlockTimeout());
        Assertions.assertEquals(PostgresDefaultToastCompression.PGLZ, model.getDefaultToastCompression());
        Assertions.assertEquals(1628725143, model.getIdleInTransactionSessionTimeout());
        Assertions.assertEquals(true, model.isJit());
        Assertions.assertEquals(1885711244, model.getLogAutovacuumMinDuration());
        Assertions.assertEquals(PostgresLogErrorVerbosity.DEFAULT, model.getLogErrorVerbosity());
        Assertions.assertEquals(PostfixLogLinePrefix.THIRD_OPTION, model.getLogLinePrefix());
        Assertions.assertEquals(272399578, model.getLogMinDurationStatement());
        Assertions.assertEquals(278178676, model.getMaxFilesPerProcess());
        Assertions.assertEquals(831236288, model.getMaxPreparedTransactions());
        Assertions.assertEquals(1206122541, model.getMaxPredLocksPerTransaction());
        Assertions.assertEquals(907593320, model.getMaxLocksPerTransaction());
        Assertions.assertEquals(574659563, model.getMaxStackDepth());
        Assertions.assertEquals(1956520273, model.getMaxStandbyArchiveDelay());
        Assertions.assertEquals(1906837795, model.getMaxStandbyStreamingDelay());
        Assertions.assertEquals(1036369649, model.getMaxReplicationSlots());
        Assertions.assertEquals(1632010745, model.getMaxLogicalReplicationWorkers());
        Assertions.assertEquals(820093362, model.getMaxParallelWorkers());
        Assertions.assertEquals(1495842019, model.getMaxParallelWorkersPerGather());
        Assertions.assertEquals(498513980, model.getMaxWorkerProcesses());
        Assertions.assertEquals(859175922, model.getTempFileLimit());
        Assertions.assertEquals("ovcxjs", model.getTimezone());
        Assertions.assertEquals(293987127, model.getTrackActivityQuerySize());
        Assertions.assertEquals(PostgresTrackCommitTimestamp.OFF, model.getTrackCommitTimestamp());
        Assertions.assertEquals(PostgresTrackFunctions.ALL, model.getTrackFunctions());
        Assertions.assertEquals(PostgresTrackIoTiming.ON, model.getTrackIoTiming());
        Assertions.assertEquals(1508387956, model.getMaxWalSenders());
        Assertions.assertEquals(94382196, model.getWalSenderTimeout());
        Assertions.assertEquals(993677532, model.getWalWriterDelay());
        Assertions.assertEquals(41.015945F, model.getSharedBuffersPercentage());
        Assertions.assertEquals(false, model.getPgbouncer().isServerResetQueryAlways());
        Assertions.assertEquals(
                PgbouncerIgnoreStartupParametersItem.EXTRA_FLOAT_DIGITS,
                model.getPgbouncer().getIgnoreStartupParameters().get(0));
        Assertions.assertEquals(331261766, model.getPgbouncer().getMinPoolSize());
        Assertions.assertEquals(1354347075, model.getPgbouncer().getServerLifetime());
        Assertions.assertEquals(558739047, model.getPgbouncer().getServerIdleTimeout());
        Assertions.assertEquals(2044252438, model.getPgbouncer().getAutodbPoolSize());
        Assertions.assertEquals(PgbouncerAutodbPoolMode.SESSION, model.getPgbouncer().getAutodbPoolMode());
        Assertions.assertEquals(1725953253, model.getPgbouncer().getAutodbMaxDbConnections());
        Assertions.assertEquals(1382840208, model.getPgbouncer().getAutodbIdleTimeout());
        Assertions.assertEquals(91613263, model.getWorkMem());
        Assertions.assertEquals(1327858771, model.getTimescaledb().getMaxBackgroundWorkers());
        Assertions.assertEquals(PostgresSynchronousReplication.OFF, model.getSynchronousReplication());
        Assertions.assertEquals(false, model.isStatMonitorEnable());
    }
}
