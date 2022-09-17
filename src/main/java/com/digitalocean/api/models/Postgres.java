package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Postgres model. */
@Fluent
public final class Postgres {
    /*
     * Specifies the maximum age (in transactions) that a table's pg_class.relfrozenxid field can attain before a
     * VACUUM operation is forced to prevent transaction ID wraparound within the table. Note that the system will
     * launch autovacuum processes to prevent wraparound even when autovacuum is otherwise disabled. This parameter
     * will cause the server to be restarted.
     */
    @JsonProperty(value = "autovacuum_freeze_max_age")
    private Integer autovacuumFreezeMaxAge;

    /*
     * Specifies the maximum number of autovacuum processes (other than the autovacuum launcher) that may be running at
     * any one time. The default is three. This parameter can only be set at server start.
     */
    @JsonProperty(value = "autovacuum_max_workers")
    private Integer autovacuumMaxWorkers;

    /*
     * Specifies the minimum delay, in seconds, between autovacuum runs on any given database. The default is one
     * minute.
     */
    @JsonProperty(value = "autovacuum_naptime")
    private Integer autovacuumNaptime;

    /*
     * Specifies the minimum number of updated or deleted tuples needed to trigger a VACUUM in any one table. The
     * default is 50 tuples.
     */
    @JsonProperty(value = "autovacuum_vacuum_threshold")
    private Integer autovacuumVacuumThreshold;

    /*
     * Specifies the minimum number of inserted, updated, or deleted tuples needed to trigger an ANALYZE in any one
     * table. The default is 50 tuples.
     */
    @JsonProperty(value = "autovacuum_analyze_threshold")
    private Integer autovacuumAnalyzeThreshold;

    /*
     * Specifies a fraction, in a decimal value, of the table size to add to autovacuum_vacuum_threshold when deciding
     * whether to trigger a VACUUM. The default is 0.2 (20% of table size).
     */
    @JsonProperty(value = "autovacuum_vacuum_scale_factor")
    private Float autovacuumVacuumScaleFactor;

    /*
     * Specifies a fraction, in a decimal value, of the table size to add to autovacuum_analyze_threshold when deciding
     * whether to trigger an ANALYZE. The default is 0.2 (20% of table size).
     */
    @JsonProperty(value = "autovacuum_analyze_scale_factor")
    private Float autovacuumAnalyzeScaleFactor;

    /*
     * Specifies the cost delay value, in milliseconds, that will be used in automatic VACUUM operations. If -1, uses
     * the regular vacuum_cost_delay value, which is 20 milliseconds.
     */
    @JsonProperty(value = "autovacuum_vacuum_cost_delay")
    private Integer autovacuumVacuumCostDelay;

    /*
     * Specifies the cost limit value that will be used in automatic VACUUM operations. If -1 is specified (which is
     * the default), the regular vacuum_cost_limit value will be used.
     */
    @JsonProperty(value = "autovacuum_vacuum_cost_limit")
    private Integer autovacuumVacuumCostLimit;

    /*
     * The hour of day (in UTC) when backup for the service starts. New backup only starts if previous backup has
     * already completed.
     */
    @JsonProperty(value = "backup_hour")
    private Integer backupHour;

    /*
     * The minute of the backup hour when backup for the service starts. New backup is only started if previous backup
     * has already completed.
     */
    @JsonProperty(value = "backup_minute")
    private Integer backupMinute;

    /*
     * Specifies the delay, in milliseconds, between activity rounds for the background writer. Default is 200 ms.
     */
    @JsonProperty(value = "bgwriter_delay")
    private Integer bgwriterDelay;

    /*
     * The amount of kilobytes that need to be written by the background writer before attempting to force the OS to
     * issue these writes to underlying storage. Specified in kilobytes, default is 512.  Setting of 0 disables forced
     * writeback.
     */
    @JsonProperty(value = "bgwriter_flush_after")
    private Integer bgwriterFlushAfter;

    /*
     * The maximum number of buffers that the background writer can write. Setting this to zero disables background
     * writing. Default is 100.
     */
    @JsonProperty(value = "bgwriter_lru_maxpages")
    private Integer bgwriterLruMaxpages;

    /*
     * The average recent need for new buffers is multiplied by bgwriter_lru_multiplier to arrive at an estimate of the
     * number that will be needed during the next round, (up to bgwriter_lru_maxpages). 1.0 represents a “just in time”
     * policy of writing exactly the number of buffers predicted to be needed. Larger values provide some cushion
     * against spikes in demand, while smaller values intentionally leave writes to be done by server processes. The
     * default is 2.0.
     */
    @JsonProperty(value = "bgwriter_lru_multiplier")
    private Float bgwriterLruMultiplier;

    /*
     * The amount of time, in milliseconds, to wait on a lock before checking to see if there is a deadlock condition.
     */
    @JsonProperty(value = "deadlock_timeout")
    private Integer deadlockTimeout;

    /*
     * Specifies the default TOAST compression method for values of compressible columns (the default is lz4).
     */
    @JsonProperty(value = "default_toast_compression")
    private PostgresDefaultToastCompression defaultToastCompression;

    /*
     * Time out sessions with open transactions after this number of milliseconds
     */
    @JsonProperty(value = "idle_in_transaction_session_timeout")
    private Integer idleInTransactionSessionTimeout;

    /*
     * Activates, in a boolean, the system-wide use of Just-in-Time Compilation (JIT).
     */
    @JsonProperty(value = "jit")
    private Boolean jit;

    /*
     * Causes each action executed by autovacuum to be logged if it ran for at least the specified number of
     * milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the default) disables logging
     * autovacuum actions.
     */
    @JsonProperty(value = "log_autovacuum_min_duration")
    private Integer logAutovacuumMinDuration;

    /*
     * Controls the amount of detail written in the server log for each message that is logged.
     */
    @JsonProperty(value = "log_error_verbosity")
    private PostgresLogErrorVerbosity logErrorVerbosity;

    /*
     * Selects one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze, etc.
     */
    @JsonProperty(value = "log_line_prefix")
    private PostfixLogLinePrefix logLinePrefix;

    /*
     * Log statements that take more than this number of milliseconds to run. If -1, disables.
     */
    @JsonProperty(value = "log_min_duration_statement")
    private Integer logMinDurationStatement;

    /*
     * PostgreSQL maximum number of files that can be open per process.
     */
    @JsonProperty(value = "max_files_per_process")
    private Integer maxFilesPerProcess;

    /*
     * PostgreSQL maximum prepared transactions.
     */
    @JsonProperty(value = "max_prepared_transactions")
    private Integer maxPreparedTransactions;

    /*
     * PostgreSQL maximum predicate locks per transaction.
     */
    @JsonProperty(value = "max_pred_locks_per_transaction")
    private Integer maxPredLocksPerTransaction;

    /*
     * PostgreSQL maximum locks per transaction.
     */
    @JsonProperty(value = "max_locks_per_transaction")
    private Integer maxLocksPerTransaction;

    /*
     * Maximum depth of the stack in bytes.
     */
    @JsonProperty(value = "max_stack_depth")
    private Integer maxStackDepth;

    /*
     * Max standby archive delay in milliseconds.
     */
    @JsonProperty(value = "max_standby_archive_delay")
    private Integer maxStandbyArchiveDelay;

    /*
     * Max standby streaming delay in milliseconds.
     */
    @JsonProperty(value = "max_standby_streaming_delay")
    private Integer maxStandbyStreamingDelay;

    /*
     * PostgreSQL maximum replication slots.
     */
    @JsonProperty(value = "max_replication_slots")
    private Integer maxReplicationSlots;

    /*
     * PostgreSQL maximum logical replication workers (taken from the pool of max_parallel_workers).
     */
    @JsonProperty(value = "max_logical_replication_workers")
    private Integer maxLogicalReplicationWorkers;

    /*
     * Sets the maximum number of workers that the system can support for parallel queries.
     */
    @JsonProperty(value = "max_parallel_workers")
    private Integer maxParallelWorkers;

    /*
     * Sets the maximum number of workers that can be started by a single Gather or Gather Merge node.
     */
    @JsonProperty(value = "max_parallel_workers_per_gather")
    private Integer maxParallelWorkersPerGather;

    /*
     * Sets the maximum number of background processes that the system can support.
     */
    @JsonProperty(value = "max_worker_processes")
    private Integer maxWorkerProcesses;

    /*
     * Controls which role to use for pg_partman's scheduled background tasks. Must consist of alpha-numeric
     * characters, dots, underscores, or dashes. May not start with dash or dot. Maximum of 64 characters.
     */
    @JsonProperty(value = "pg_partman_bgw.role")
    private String pgPartmanBgwRole;

    /*
     * Sets the time interval to run pg_partman's scheduled tasks.
     */
    @JsonProperty(value = "pg_partman_bgw.interval")
    private Integer pgPartmanBgwInterval;

    /*
     * Controls which statements are counted. Specify 'top' to track top-level statements (those issued directly by
     * clients), 'all' to also track nested statements (such as statements invoked within functions), or 'none' to
     * disable statement statistics collection. The default value is top.
     */
    @JsonProperty(value = "pg_stat_statements.track")
    private PostgresPgStatStatementsTrack pgStatStatementsTrack;

    /*
     * PostgreSQL temporary file limit in KiB. If -1, sets to unlimited.
     */
    @JsonProperty(value = "temp_file_limit")
    private Integer tempFileLimit;

    /*
     * PostgreSQL service timezone
     */
    @JsonProperty(value = "timezone")
    private String timezone;

    /*
     * Specifies the number of bytes reserved to track the currently executing command for each active session.
     */
    @JsonProperty(value = "track_activity_query_size")
    private Integer trackActivityQuerySize;

    /*
     * Record commit time of transactions.
     */
    @JsonProperty(value = "track_commit_timestamp")
    private PostgresTrackCommitTimestamp trackCommitTimestamp;

    /*
     * Enables tracking of function call counts and time used.
     */
    @JsonProperty(value = "track_functions")
    private PostgresTrackFunctions trackFunctions;

    /*
     * Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the
     * operating system for the current time, which may cause significant overhead on some platforms.
     */
    @JsonProperty(value = "track_io_timing")
    private PostgresTrackIoTiming trackIoTiming;

    /*
     * PostgreSQL maximum WAL senders
     */
    @JsonProperty(value = "max_wal_senders")
    private Integer maxWalSenders;

    /*
     * Terminate replication connections that are inactive for longer than this amount of time, in milliseconds.
     * Setting this value to zero disables the timeout. Must be either 0 or between 5000 and 10800000.
     */
    @JsonProperty(value = "wal_sender_timeout")
    private Integer walSenderTimeout;

    /*
     * WAL flush interval in milliseconds. Note that setting this value to lower than the default 200ms may negatively
     * impact performance
     */
    @JsonProperty(value = "wal_writer_delay")
    private Integer walWriterDelay;

    /*
     * Percentage of total RAM that the database server uses for shared memory buffers.  Valid range is 20-60 (float),
     * which corresponds to 20% - 60%.  This setting adjusts the shared_buffers configuration value.
     */
    @JsonProperty(value = "shared_buffers_percentage")
    private Float sharedBuffersPercentage;

    /*
     * PGBouncer connection pooling settings
     */
    @JsonProperty(value = "pgbouncer")
    private Pgbouncer pgbouncer;

    /*
     * The maximum amount of memory, in MB, used by a query operation (such as a sort or hash table) before writing to
     * temporary disk files. Default is 1MB + 0.075% of total RAM (up to 32MB).
     */
    @JsonProperty(value = "work_mem")
    private Integer workMem;

    /*
     * TimescaleDB extension configuration values
     */
    @JsonProperty(value = "timescaledb")
    private Timescaledb timescaledb;

    /*
     * Synchronous replication type. Note that the service plan also needs to support synchronous replication.
     */
    @JsonProperty(value = "synchronous_replication")
    private PostgresSynchronousReplication synchronousReplication;

    /*
     * Enable the pg_stat_monitor extension. <b>Enabling this extension will cause the cluster to be restarted.</b>
     * When this extension is enabled, pg_stat_statements results for utility commands are unreliable.
     */
    @JsonProperty(value = "stat_monitor_enable")
    private Boolean statMonitorEnable;

    /**
     * Get the autovacuumFreezeMaxAge property: Specifies the maximum age (in transactions) that a table's
     * pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound
     * within the table. Note that the system will launch autovacuum processes to prevent wraparound even when
     * autovacuum is otherwise disabled. This parameter will cause the server to be restarted.
     *
     * @return the autovacuumFreezeMaxAge value.
     */
    public Integer getAutovacuumFreezeMaxAge() {
        return this.autovacuumFreezeMaxAge;
    }

    /**
     * Set the autovacuumFreezeMaxAge property: Specifies the maximum age (in transactions) that a table's
     * pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound
     * within the table. Note that the system will launch autovacuum processes to prevent wraparound even when
     * autovacuum is otherwise disabled. This parameter will cause the server to be restarted.
     *
     * @param autovacuumFreezeMaxAge the autovacuumFreezeMaxAge value to set.
     * @return the Postgres object itself.
     */
    public Postgres setAutovacuumFreezeMaxAge(Integer autovacuumFreezeMaxAge) {
        this.autovacuumFreezeMaxAge = autovacuumFreezeMaxAge;
        return this;
    }

    /**
     * Get the autovacuumMaxWorkers property: Specifies the maximum number of autovacuum processes (other than the
     * autovacuum launcher) that may be running at any one time. The default is three. This parameter can only be set at
     * server start.
     *
     * @return the autovacuumMaxWorkers value.
     */
    public Integer getAutovacuumMaxWorkers() {
        return this.autovacuumMaxWorkers;
    }

    /**
     * Set the autovacuumMaxWorkers property: Specifies the maximum number of autovacuum processes (other than the
     * autovacuum launcher) that may be running at any one time. The default is three. This parameter can only be set at
     * server start.
     *
     * @param autovacuumMaxWorkers the autovacuumMaxWorkers value to set.
     * @return the Postgres object itself.
     */
    public Postgres setAutovacuumMaxWorkers(Integer autovacuumMaxWorkers) {
        this.autovacuumMaxWorkers = autovacuumMaxWorkers;
        return this;
    }

    /**
     * Get the autovacuumNaptime property: Specifies the minimum delay, in seconds, between autovacuum runs on any given
     * database. The default is one minute.
     *
     * @return the autovacuumNaptime value.
     */
    public Integer getAutovacuumNaptime() {
        return this.autovacuumNaptime;
    }

    /**
     * Set the autovacuumNaptime property: Specifies the minimum delay, in seconds, between autovacuum runs on any given
     * database. The default is one minute.
     *
     * @param autovacuumNaptime the autovacuumNaptime value to set.
     * @return the Postgres object itself.
     */
    public Postgres setAutovacuumNaptime(Integer autovacuumNaptime) {
        this.autovacuumNaptime = autovacuumNaptime;
        return this;
    }

    /**
     * Get the autovacuumVacuumThreshold property: Specifies the minimum number of updated or deleted tuples needed to
     * trigger a VACUUM in any one table. The default is 50 tuples.
     *
     * @return the autovacuumVacuumThreshold value.
     */
    public Integer getAutovacuumVacuumThreshold() {
        return this.autovacuumVacuumThreshold;
    }

    /**
     * Set the autovacuumVacuumThreshold property: Specifies the minimum number of updated or deleted tuples needed to
     * trigger a VACUUM in any one table. The default is 50 tuples.
     *
     * @param autovacuumVacuumThreshold the autovacuumVacuumThreshold value to set.
     * @return the Postgres object itself.
     */
    public Postgres setAutovacuumVacuumThreshold(Integer autovacuumVacuumThreshold) {
        this.autovacuumVacuumThreshold = autovacuumVacuumThreshold;
        return this;
    }

    /**
     * Get the autovacuumAnalyzeThreshold property: Specifies the minimum number of inserted, updated, or deleted tuples
     * needed to trigger an ANALYZE in any one table. The default is 50 tuples.
     *
     * @return the autovacuumAnalyzeThreshold value.
     */
    public Integer getAutovacuumAnalyzeThreshold() {
        return this.autovacuumAnalyzeThreshold;
    }

    /**
     * Set the autovacuumAnalyzeThreshold property: Specifies the minimum number of inserted, updated, or deleted tuples
     * needed to trigger an ANALYZE in any one table. The default is 50 tuples.
     *
     * @param autovacuumAnalyzeThreshold the autovacuumAnalyzeThreshold value to set.
     * @return the Postgres object itself.
     */
    public Postgres setAutovacuumAnalyzeThreshold(Integer autovacuumAnalyzeThreshold) {
        this.autovacuumAnalyzeThreshold = autovacuumAnalyzeThreshold;
        return this;
    }

    /**
     * Get the autovacuumVacuumScaleFactor property: Specifies a fraction, in a decimal value, of the table size to add
     * to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM. The default is 0.2 (20% of table size).
     *
     * @return the autovacuumVacuumScaleFactor value.
     */
    public Float getAutovacuumVacuumScaleFactor() {
        return this.autovacuumVacuumScaleFactor;
    }

    /**
     * Set the autovacuumVacuumScaleFactor property: Specifies a fraction, in a decimal value, of the table size to add
     * to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM. The default is 0.2 (20% of table size).
     *
     * @param autovacuumVacuumScaleFactor the autovacuumVacuumScaleFactor value to set.
     * @return the Postgres object itself.
     */
    public Postgres setAutovacuumVacuumScaleFactor(Float autovacuumVacuumScaleFactor) {
        this.autovacuumVacuumScaleFactor = autovacuumVacuumScaleFactor;
        return this;
    }

    /**
     * Get the autovacuumAnalyzeScaleFactor property: Specifies a fraction, in a decimal value, of the table size to add
     * to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE. The default is 0.2 (20% of table
     * size).
     *
     * @return the autovacuumAnalyzeScaleFactor value.
     */
    public Float getAutovacuumAnalyzeScaleFactor() {
        return this.autovacuumAnalyzeScaleFactor;
    }

    /**
     * Set the autovacuumAnalyzeScaleFactor property: Specifies a fraction, in a decimal value, of the table size to add
     * to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE. The default is 0.2 (20% of table
     * size).
     *
     * @param autovacuumAnalyzeScaleFactor the autovacuumAnalyzeScaleFactor value to set.
     * @return the Postgres object itself.
     */
    public Postgres setAutovacuumAnalyzeScaleFactor(Float autovacuumAnalyzeScaleFactor) {
        this.autovacuumAnalyzeScaleFactor = autovacuumAnalyzeScaleFactor;
        return this;
    }

    /**
     * Get the autovacuumVacuumCostDelay property: Specifies the cost delay value, in milliseconds, that will be used in
     * automatic VACUUM operations. If -1, uses the regular vacuum_cost_delay value, which is 20 milliseconds.
     *
     * @return the autovacuumVacuumCostDelay value.
     */
    public Integer getAutovacuumVacuumCostDelay() {
        return this.autovacuumVacuumCostDelay;
    }

    /**
     * Set the autovacuumVacuumCostDelay property: Specifies the cost delay value, in milliseconds, that will be used in
     * automatic VACUUM operations. If -1, uses the regular vacuum_cost_delay value, which is 20 milliseconds.
     *
     * @param autovacuumVacuumCostDelay the autovacuumVacuumCostDelay value to set.
     * @return the Postgres object itself.
     */
    public Postgres setAutovacuumVacuumCostDelay(Integer autovacuumVacuumCostDelay) {
        this.autovacuumVacuumCostDelay = autovacuumVacuumCostDelay;
        return this;
    }

    /**
     * Get the autovacuumVacuumCostLimit property: Specifies the cost limit value that will be used in automatic VACUUM
     * operations. If -1 is specified (which is the default), the regular vacuum_cost_limit value will be used.
     *
     * @return the autovacuumVacuumCostLimit value.
     */
    public Integer getAutovacuumVacuumCostLimit() {
        return this.autovacuumVacuumCostLimit;
    }

    /**
     * Set the autovacuumVacuumCostLimit property: Specifies the cost limit value that will be used in automatic VACUUM
     * operations. If -1 is specified (which is the default), the regular vacuum_cost_limit value will be used.
     *
     * @param autovacuumVacuumCostLimit the autovacuumVacuumCostLimit value to set.
     * @return the Postgres object itself.
     */
    public Postgres setAutovacuumVacuumCostLimit(Integer autovacuumVacuumCostLimit) {
        this.autovacuumVacuumCostLimit = autovacuumVacuumCostLimit;
        return this;
    }

    /**
     * Get the backupHour property: The hour of day (in UTC) when backup for the service starts. New backup only starts
     * if previous backup has already completed.
     *
     * @return the backupHour value.
     */
    public Integer getBackupHour() {
        return this.backupHour;
    }

    /**
     * Set the backupHour property: The hour of day (in UTC) when backup for the service starts. New backup only starts
     * if previous backup has already completed.
     *
     * @param backupHour the backupHour value to set.
     * @return the Postgres object itself.
     */
    public Postgres setBackupHour(Integer backupHour) {
        this.backupHour = backupHour;
        return this;
    }

    /**
     * Get the backupMinute property: The minute of the backup hour when backup for the service starts. New backup is
     * only started if previous backup has already completed.
     *
     * @return the backupMinute value.
     */
    public Integer getBackupMinute() {
        return this.backupMinute;
    }

    /**
     * Set the backupMinute property: The minute of the backup hour when backup for the service starts. New backup is
     * only started if previous backup has already completed.
     *
     * @param backupMinute the backupMinute value to set.
     * @return the Postgres object itself.
     */
    public Postgres setBackupMinute(Integer backupMinute) {
        this.backupMinute = backupMinute;
        return this;
    }

    /**
     * Get the bgwriterDelay property: Specifies the delay, in milliseconds, between activity rounds for the background
     * writer. Default is 200 ms.
     *
     * @return the bgwriterDelay value.
     */
    public Integer getBgwriterDelay() {
        return this.bgwriterDelay;
    }

    /**
     * Set the bgwriterDelay property: Specifies the delay, in milliseconds, between activity rounds for the background
     * writer. Default is 200 ms.
     *
     * @param bgwriterDelay the bgwriterDelay value to set.
     * @return the Postgres object itself.
     */
    public Postgres setBgwriterDelay(Integer bgwriterDelay) {
        this.bgwriterDelay = bgwriterDelay;
        return this;
    }

    /**
     * Get the bgwriterFlushAfter property: The amount of kilobytes that need to be written by the background writer
     * before attempting to force the OS to issue these writes to underlying storage. Specified in kilobytes, default is
     * 512. Setting of 0 disables forced writeback.
     *
     * @return the bgwriterFlushAfter value.
     */
    public Integer getBgwriterFlushAfter() {
        return this.bgwriterFlushAfter;
    }

    /**
     * Set the bgwriterFlushAfter property: The amount of kilobytes that need to be written by the background writer
     * before attempting to force the OS to issue these writes to underlying storage. Specified in kilobytes, default is
     * 512. Setting of 0 disables forced writeback.
     *
     * @param bgwriterFlushAfter the bgwriterFlushAfter value to set.
     * @return the Postgres object itself.
     */
    public Postgres setBgwriterFlushAfter(Integer bgwriterFlushAfter) {
        this.bgwriterFlushAfter = bgwriterFlushAfter;
        return this;
    }

    /**
     * Get the bgwriterLruMaxpages property: The maximum number of buffers that the background writer can write. Setting
     * this to zero disables background writing. Default is 100.
     *
     * @return the bgwriterLruMaxpages value.
     */
    public Integer getBgwriterLruMaxpages() {
        return this.bgwriterLruMaxpages;
    }

    /**
     * Set the bgwriterLruMaxpages property: The maximum number of buffers that the background writer can write. Setting
     * this to zero disables background writing. Default is 100.
     *
     * @param bgwriterLruMaxpages the bgwriterLruMaxpages value to set.
     * @return the Postgres object itself.
     */
    public Postgres setBgwriterLruMaxpages(Integer bgwriterLruMaxpages) {
        this.bgwriterLruMaxpages = bgwriterLruMaxpages;
        return this;
    }

    /**
     * Get the bgwriterLruMultiplier property: The average recent need for new buffers is multiplied by
     * bgwriter_lru_multiplier to arrive at an estimate of the number that will be needed during the next round, (up to
     * bgwriter_lru_maxpages). 1.0 represents a “just in time” policy of writing exactly the number of buffers predicted
     * to be needed. Larger values provide some cushion against spikes in demand, while smaller values intentionally
     * leave writes to be done by server processes. The default is 2.0.
     *
     * @return the bgwriterLruMultiplier value.
     */
    public Float getBgwriterLruMultiplier() {
        return this.bgwriterLruMultiplier;
    }

    /**
     * Set the bgwriterLruMultiplier property: The average recent need for new buffers is multiplied by
     * bgwriter_lru_multiplier to arrive at an estimate of the number that will be needed during the next round, (up to
     * bgwriter_lru_maxpages). 1.0 represents a “just in time” policy of writing exactly the number of buffers predicted
     * to be needed. Larger values provide some cushion against spikes in demand, while smaller values intentionally
     * leave writes to be done by server processes. The default is 2.0.
     *
     * @param bgwriterLruMultiplier the bgwriterLruMultiplier value to set.
     * @return the Postgres object itself.
     */
    public Postgres setBgwriterLruMultiplier(Float bgwriterLruMultiplier) {
        this.bgwriterLruMultiplier = bgwriterLruMultiplier;
        return this;
    }

    /**
     * Get the deadlockTimeout property: The amount of time, in milliseconds, to wait on a lock before checking to see
     * if there is a deadlock condition.
     *
     * @return the deadlockTimeout value.
     */
    public Integer getDeadlockTimeout() {
        return this.deadlockTimeout;
    }

    /**
     * Set the deadlockTimeout property: The amount of time, in milliseconds, to wait on a lock before checking to see
     * if there is a deadlock condition.
     *
     * @param deadlockTimeout the deadlockTimeout value to set.
     * @return the Postgres object itself.
     */
    public Postgres setDeadlockTimeout(Integer deadlockTimeout) {
        this.deadlockTimeout = deadlockTimeout;
        return this;
    }

    /**
     * Get the defaultToastCompression property: Specifies the default TOAST compression method for values of
     * compressible columns (the default is lz4).
     *
     * @return the defaultToastCompression value.
     */
    public PostgresDefaultToastCompression getDefaultToastCompression() {
        return this.defaultToastCompression;
    }

    /**
     * Set the defaultToastCompression property: Specifies the default TOAST compression method for values of
     * compressible columns (the default is lz4).
     *
     * @param defaultToastCompression the defaultToastCompression value to set.
     * @return the Postgres object itself.
     */
    public Postgres setDefaultToastCompression(PostgresDefaultToastCompression defaultToastCompression) {
        this.defaultToastCompression = defaultToastCompression;
        return this;
    }

    /**
     * Get the idleInTransactionSessionTimeout property: Time out sessions with open transactions after this number of
     * milliseconds.
     *
     * @return the idleInTransactionSessionTimeout value.
     */
    public Integer getIdleInTransactionSessionTimeout() {
        return this.idleInTransactionSessionTimeout;
    }

    /**
     * Set the idleInTransactionSessionTimeout property: Time out sessions with open transactions after this number of
     * milliseconds.
     *
     * @param idleInTransactionSessionTimeout the idleInTransactionSessionTimeout value to set.
     * @return the Postgres object itself.
     */
    public Postgres setIdleInTransactionSessionTimeout(Integer idleInTransactionSessionTimeout) {
        this.idleInTransactionSessionTimeout = idleInTransactionSessionTimeout;
        return this;
    }

    /**
     * Get the jit property: Activates, in a boolean, the system-wide use of Just-in-Time Compilation (JIT).
     *
     * @return the jit value.
     */
    public Boolean isJit() {
        return this.jit;
    }

    /**
     * Set the jit property: Activates, in a boolean, the system-wide use of Just-in-Time Compilation (JIT).
     *
     * @param jit the jit value to set.
     * @return the Postgres object itself.
     */
    public Postgres setJit(Boolean jit) {
        this.jit = jit;
        return this;
    }

    /**
     * Get the logAutovacuumMinDuration property: Causes each action executed by autovacuum to be logged if it ran for
     * at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the
     * default) disables logging autovacuum actions.
     *
     * @return the logAutovacuumMinDuration value.
     */
    public Integer getLogAutovacuumMinDuration() {
        return this.logAutovacuumMinDuration;
    }

    /**
     * Set the logAutovacuumMinDuration property: Causes each action executed by autovacuum to be logged if it ran for
     * at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the
     * default) disables logging autovacuum actions.
     *
     * @param logAutovacuumMinDuration the logAutovacuumMinDuration value to set.
     * @return the Postgres object itself.
     */
    public Postgres setLogAutovacuumMinDuration(Integer logAutovacuumMinDuration) {
        this.logAutovacuumMinDuration = logAutovacuumMinDuration;
        return this;
    }

    /**
     * Get the logErrorVerbosity property: Controls the amount of detail written in the server log for each message that
     * is logged.
     *
     * @return the logErrorVerbosity value.
     */
    public PostgresLogErrorVerbosity getLogErrorVerbosity() {
        return this.logErrorVerbosity;
    }

    /**
     * Set the logErrorVerbosity property: Controls the amount of detail written in the server log for each message that
     * is logged.
     *
     * @param logErrorVerbosity the logErrorVerbosity value to set.
     * @return the Postgres object itself.
     */
    public Postgres setLogErrorVerbosity(PostgresLogErrorVerbosity logErrorVerbosity) {
        this.logErrorVerbosity = logErrorVerbosity;
        return this;
    }

    /**
     * Get the logLinePrefix property: Selects one of the available log-formats. These can support popular log analyzers
     * like pgbadger, pganalyze, etc.
     *
     * @return the logLinePrefix value.
     */
    public PostfixLogLinePrefix getLogLinePrefix() {
        return this.logLinePrefix;
    }

    /**
     * Set the logLinePrefix property: Selects one of the available log-formats. These can support popular log analyzers
     * like pgbadger, pganalyze, etc.
     *
     * @param logLinePrefix the logLinePrefix value to set.
     * @return the Postgres object itself.
     */
    public Postgres setLogLinePrefix(PostfixLogLinePrefix logLinePrefix) {
        this.logLinePrefix = logLinePrefix;
        return this;
    }

    /**
     * Get the logMinDurationStatement property: Log statements that take more than this number of milliseconds to run.
     * If -1, disables.
     *
     * @return the logMinDurationStatement value.
     */
    public Integer getLogMinDurationStatement() {
        return this.logMinDurationStatement;
    }

    /**
     * Set the logMinDurationStatement property: Log statements that take more than this number of milliseconds to run.
     * If -1, disables.
     *
     * @param logMinDurationStatement the logMinDurationStatement value to set.
     * @return the Postgres object itself.
     */
    public Postgres setLogMinDurationStatement(Integer logMinDurationStatement) {
        this.logMinDurationStatement = logMinDurationStatement;
        return this;
    }

    /**
     * Get the maxFilesPerProcess property: PostgreSQL maximum number of files that can be open per process.
     *
     * @return the maxFilesPerProcess value.
     */
    public Integer getMaxFilesPerProcess() {
        return this.maxFilesPerProcess;
    }

    /**
     * Set the maxFilesPerProcess property: PostgreSQL maximum number of files that can be open per process.
     *
     * @param maxFilesPerProcess the maxFilesPerProcess value to set.
     * @return the Postgres object itself.
     */
    public Postgres setMaxFilesPerProcess(Integer maxFilesPerProcess) {
        this.maxFilesPerProcess = maxFilesPerProcess;
        return this;
    }

    /**
     * Get the maxPreparedTransactions property: PostgreSQL maximum prepared transactions.
     *
     * @return the maxPreparedTransactions value.
     */
    public Integer getMaxPreparedTransactions() {
        return this.maxPreparedTransactions;
    }

    /**
     * Set the maxPreparedTransactions property: PostgreSQL maximum prepared transactions.
     *
     * @param maxPreparedTransactions the maxPreparedTransactions value to set.
     * @return the Postgres object itself.
     */
    public Postgres setMaxPreparedTransactions(Integer maxPreparedTransactions) {
        this.maxPreparedTransactions = maxPreparedTransactions;
        return this;
    }

    /**
     * Get the maxPredLocksPerTransaction property: PostgreSQL maximum predicate locks per transaction.
     *
     * @return the maxPredLocksPerTransaction value.
     */
    public Integer getMaxPredLocksPerTransaction() {
        return this.maxPredLocksPerTransaction;
    }

    /**
     * Set the maxPredLocksPerTransaction property: PostgreSQL maximum predicate locks per transaction.
     *
     * @param maxPredLocksPerTransaction the maxPredLocksPerTransaction value to set.
     * @return the Postgres object itself.
     */
    public Postgres setMaxPredLocksPerTransaction(Integer maxPredLocksPerTransaction) {
        this.maxPredLocksPerTransaction = maxPredLocksPerTransaction;
        return this;
    }

    /**
     * Get the maxLocksPerTransaction property: PostgreSQL maximum locks per transaction.
     *
     * @return the maxLocksPerTransaction value.
     */
    public Integer getMaxLocksPerTransaction() {
        return this.maxLocksPerTransaction;
    }

    /**
     * Set the maxLocksPerTransaction property: PostgreSQL maximum locks per transaction.
     *
     * @param maxLocksPerTransaction the maxLocksPerTransaction value to set.
     * @return the Postgres object itself.
     */
    public Postgres setMaxLocksPerTransaction(Integer maxLocksPerTransaction) {
        this.maxLocksPerTransaction = maxLocksPerTransaction;
        return this;
    }

    /**
     * Get the maxStackDepth property: Maximum depth of the stack in bytes.
     *
     * @return the maxStackDepth value.
     */
    public Integer getMaxStackDepth() {
        return this.maxStackDepth;
    }

    /**
     * Set the maxStackDepth property: Maximum depth of the stack in bytes.
     *
     * @param maxStackDepth the maxStackDepth value to set.
     * @return the Postgres object itself.
     */
    public Postgres setMaxStackDepth(Integer maxStackDepth) {
        this.maxStackDepth = maxStackDepth;
        return this;
    }

    /**
     * Get the maxStandbyArchiveDelay property: Max standby archive delay in milliseconds.
     *
     * @return the maxStandbyArchiveDelay value.
     */
    public Integer getMaxStandbyArchiveDelay() {
        return this.maxStandbyArchiveDelay;
    }

    /**
     * Set the maxStandbyArchiveDelay property: Max standby archive delay in milliseconds.
     *
     * @param maxStandbyArchiveDelay the maxStandbyArchiveDelay value to set.
     * @return the Postgres object itself.
     */
    public Postgres setMaxStandbyArchiveDelay(Integer maxStandbyArchiveDelay) {
        this.maxStandbyArchiveDelay = maxStandbyArchiveDelay;
        return this;
    }

    /**
     * Get the maxStandbyStreamingDelay property: Max standby streaming delay in milliseconds.
     *
     * @return the maxStandbyStreamingDelay value.
     */
    public Integer getMaxStandbyStreamingDelay() {
        return this.maxStandbyStreamingDelay;
    }

    /**
     * Set the maxStandbyStreamingDelay property: Max standby streaming delay in milliseconds.
     *
     * @param maxStandbyStreamingDelay the maxStandbyStreamingDelay value to set.
     * @return the Postgres object itself.
     */
    public Postgres setMaxStandbyStreamingDelay(Integer maxStandbyStreamingDelay) {
        this.maxStandbyStreamingDelay = maxStandbyStreamingDelay;
        return this;
    }

    /**
     * Get the maxReplicationSlots property: PostgreSQL maximum replication slots.
     *
     * @return the maxReplicationSlots value.
     */
    public Integer getMaxReplicationSlots() {
        return this.maxReplicationSlots;
    }

    /**
     * Set the maxReplicationSlots property: PostgreSQL maximum replication slots.
     *
     * @param maxReplicationSlots the maxReplicationSlots value to set.
     * @return the Postgres object itself.
     */
    public Postgres setMaxReplicationSlots(Integer maxReplicationSlots) {
        this.maxReplicationSlots = maxReplicationSlots;
        return this;
    }

    /**
     * Get the maxLogicalReplicationWorkers property: PostgreSQL maximum logical replication workers (taken from the
     * pool of max_parallel_workers).
     *
     * @return the maxLogicalReplicationWorkers value.
     */
    public Integer getMaxLogicalReplicationWorkers() {
        return this.maxLogicalReplicationWorkers;
    }

    /**
     * Set the maxLogicalReplicationWorkers property: PostgreSQL maximum logical replication workers (taken from the
     * pool of max_parallel_workers).
     *
     * @param maxLogicalReplicationWorkers the maxLogicalReplicationWorkers value to set.
     * @return the Postgres object itself.
     */
    public Postgres setMaxLogicalReplicationWorkers(Integer maxLogicalReplicationWorkers) {
        this.maxLogicalReplicationWorkers = maxLogicalReplicationWorkers;
        return this;
    }

    /**
     * Get the maxParallelWorkers property: Sets the maximum number of workers that the system can support for parallel
     * queries.
     *
     * @return the maxParallelWorkers value.
     */
    public Integer getMaxParallelWorkers() {
        return this.maxParallelWorkers;
    }

    /**
     * Set the maxParallelWorkers property: Sets the maximum number of workers that the system can support for parallel
     * queries.
     *
     * @param maxParallelWorkers the maxParallelWorkers value to set.
     * @return the Postgres object itself.
     */
    public Postgres setMaxParallelWorkers(Integer maxParallelWorkers) {
        this.maxParallelWorkers = maxParallelWorkers;
        return this;
    }

    /**
     * Get the maxParallelWorkersPerGather property: Sets the maximum number of workers that can be started by a single
     * Gather or Gather Merge node.
     *
     * @return the maxParallelWorkersPerGather value.
     */
    public Integer getMaxParallelWorkersPerGather() {
        return this.maxParallelWorkersPerGather;
    }

    /**
     * Set the maxParallelWorkersPerGather property: Sets the maximum number of workers that can be started by a single
     * Gather or Gather Merge node.
     *
     * @param maxParallelWorkersPerGather the maxParallelWorkersPerGather value to set.
     * @return the Postgres object itself.
     */
    public Postgres setMaxParallelWorkersPerGather(Integer maxParallelWorkersPerGather) {
        this.maxParallelWorkersPerGather = maxParallelWorkersPerGather;
        return this;
    }

    /**
     * Get the maxWorkerProcesses property: Sets the maximum number of background processes that the system can support.
     *
     * @return the maxWorkerProcesses value.
     */
    public Integer getMaxWorkerProcesses() {
        return this.maxWorkerProcesses;
    }

    /**
     * Set the maxWorkerProcesses property: Sets the maximum number of background processes that the system can support.
     *
     * @param maxWorkerProcesses the maxWorkerProcesses value to set.
     * @return the Postgres object itself.
     */
    public Postgres setMaxWorkerProcesses(Integer maxWorkerProcesses) {
        this.maxWorkerProcesses = maxWorkerProcesses;
        return this;
    }

    /**
     * Get the pgPartmanBgwRole property: Controls which role to use for pg_partman's scheduled background tasks. Must
     * consist of alpha-numeric characters, dots, underscores, or dashes. May not start with dash or dot. Maximum of 64
     * characters.
     *
     * @return the pgPartmanBgwRole value.
     */
    public String getPgPartmanBgwRole() {
        return this.pgPartmanBgwRole;
    }

    /**
     * Set the pgPartmanBgwRole property: Controls which role to use for pg_partman's scheduled background tasks. Must
     * consist of alpha-numeric characters, dots, underscores, or dashes. May not start with dash or dot. Maximum of 64
     * characters.
     *
     * @param pgPartmanBgwRole the pgPartmanBgwRole value to set.
     * @return the Postgres object itself.
     */
    public Postgres setPgPartmanBgwRole(String pgPartmanBgwRole) {
        this.pgPartmanBgwRole = pgPartmanBgwRole;
        return this;
    }

    /**
     * Get the pgPartmanBgwInterval property: Sets the time interval to run pg_partman's scheduled tasks.
     *
     * @return the pgPartmanBgwInterval value.
     */
    public Integer getPgPartmanBgwInterval() {
        return this.pgPartmanBgwInterval;
    }

    /**
     * Set the pgPartmanBgwInterval property: Sets the time interval to run pg_partman's scheduled tasks.
     *
     * @param pgPartmanBgwInterval the pgPartmanBgwInterval value to set.
     * @return the Postgres object itself.
     */
    public Postgres setPgPartmanBgwInterval(Integer pgPartmanBgwInterval) {
        this.pgPartmanBgwInterval = pgPartmanBgwInterval;
        return this;
    }

    /**
     * Get the pgStatStatementsTrack property: Controls which statements are counted. Specify 'top' to track top-level
     * statements (those issued directly by clients), 'all' to also track nested statements (such as statements invoked
     * within functions), or 'none' to disable statement statistics collection. The default value is top.
     *
     * @return the pgStatStatementsTrack value.
     */
    public PostgresPgStatStatementsTrack getPgStatStatementsTrack() {
        return this.pgStatStatementsTrack;
    }

    /**
     * Set the pgStatStatementsTrack property: Controls which statements are counted. Specify 'top' to track top-level
     * statements (those issued directly by clients), 'all' to also track nested statements (such as statements invoked
     * within functions), or 'none' to disable statement statistics collection. The default value is top.
     *
     * @param pgStatStatementsTrack the pgStatStatementsTrack value to set.
     * @return the Postgres object itself.
     */
    public Postgres setPgStatStatementsTrack(PostgresPgStatStatementsTrack pgStatStatementsTrack) {
        this.pgStatStatementsTrack = pgStatStatementsTrack;
        return this;
    }

    /**
     * Get the tempFileLimit property: PostgreSQL temporary file limit in KiB. If -1, sets to unlimited.
     *
     * @return the tempFileLimit value.
     */
    public Integer getTempFileLimit() {
        return this.tempFileLimit;
    }

    /**
     * Set the tempFileLimit property: PostgreSQL temporary file limit in KiB. If -1, sets to unlimited.
     *
     * @param tempFileLimit the tempFileLimit value to set.
     * @return the Postgres object itself.
     */
    public Postgres setTempFileLimit(Integer tempFileLimit) {
        this.tempFileLimit = tempFileLimit;
        return this;
    }

    /**
     * Get the timezone property: PostgreSQL service timezone.
     *
     * @return the timezone value.
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * Set the timezone property: PostgreSQL service timezone.
     *
     * @param timezone the timezone value to set.
     * @return the Postgres object itself.
     */
    public Postgres setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * Get the trackActivityQuerySize property: Specifies the number of bytes reserved to track the currently executing
     * command for each active session.
     *
     * @return the trackActivityQuerySize value.
     */
    public Integer getTrackActivityQuerySize() {
        return this.trackActivityQuerySize;
    }

    /**
     * Set the trackActivityQuerySize property: Specifies the number of bytes reserved to track the currently executing
     * command for each active session.
     *
     * @param trackActivityQuerySize the trackActivityQuerySize value to set.
     * @return the Postgres object itself.
     */
    public Postgres setTrackActivityQuerySize(Integer trackActivityQuerySize) {
        this.trackActivityQuerySize = trackActivityQuerySize;
        return this;
    }

    /**
     * Get the trackCommitTimestamp property: Record commit time of transactions.
     *
     * @return the trackCommitTimestamp value.
     */
    public PostgresTrackCommitTimestamp getTrackCommitTimestamp() {
        return this.trackCommitTimestamp;
    }

    /**
     * Set the trackCommitTimestamp property: Record commit time of transactions.
     *
     * @param trackCommitTimestamp the trackCommitTimestamp value to set.
     * @return the Postgres object itself.
     */
    public Postgres setTrackCommitTimestamp(PostgresTrackCommitTimestamp trackCommitTimestamp) {
        this.trackCommitTimestamp = trackCommitTimestamp;
        return this;
    }

    /**
     * Get the trackFunctions property: Enables tracking of function call counts and time used.
     *
     * @return the trackFunctions value.
     */
    public PostgresTrackFunctions getTrackFunctions() {
        return this.trackFunctions;
    }

    /**
     * Set the trackFunctions property: Enables tracking of function call counts and time used.
     *
     * @param trackFunctions the trackFunctions value to set.
     * @return the Postgres object itself.
     */
    public Postgres setTrackFunctions(PostgresTrackFunctions trackFunctions) {
        this.trackFunctions = trackFunctions;
        return this;
    }

    /**
     * Get the trackIoTiming property: Enables timing of database I/O calls. This parameter is off by default, because
     * it will repeatedly query the operating system for the current time, which may cause significant overhead on some
     * platforms.
     *
     * @return the trackIoTiming value.
     */
    public PostgresTrackIoTiming getTrackIoTiming() {
        return this.trackIoTiming;
    }

    /**
     * Set the trackIoTiming property: Enables timing of database I/O calls. This parameter is off by default, because
     * it will repeatedly query the operating system for the current time, which may cause significant overhead on some
     * platforms.
     *
     * @param trackIoTiming the trackIoTiming value to set.
     * @return the Postgres object itself.
     */
    public Postgres setTrackIoTiming(PostgresTrackIoTiming trackIoTiming) {
        this.trackIoTiming = trackIoTiming;
        return this;
    }

    /**
     * Get the maxWalSenders property: PostgreSQL maximum WAL senders.
     *
     * @return the maxWalSenders value.
     */
    public Integer getMaxWalSenders() {
        return this.maxWalSenders;
    }

    /**
     * Set the maxWalSenders property: PostgreSQL maximum WAL senders.
     *
     * @param maxWalSenders the maxWalSenders value to set.
     * @return the Postgres object itself.
     */
    public Postgres setMaxWalSenders(Integer maxWalSenders) {
        this.maxWalSenders = maxWalSenders;
        return this;
    }

    /**
     * Get the walSenderTimeout property: Terminate replication connections that are inactive for longer than this
     * amount of time, in milliseconds. Setting this value to zero disables the timeout. Must be either 0 or between
     * 5000 and 10800000.
     *
     * @return the walSenderTimeout value.
     */
    public Integer getWalSenderTimeout() {
        return this.walSenderTimeout;
    }

    /**
     * Set the walSenderTimeout property: Terminate replication connections that are inactive for longer than this
     * amount of time, in milliseconds. Setting this value to zero disables the timeout. Must be either 0 or between
     * 5000 and 10800000.
     *
     * @param walSenderTimeout the walSenderTimeout value to set.
     * @return the Postgres object itself.
     */
    public Postgres setWalSenderTimeout(Integer walSenderTimeout) {
        this.walSenderTimeout = walSenderTimeout;
        return this;
    }

    /**
     * Get the walWriterDelay property: WAL flush interval in milliseconds. Note that setting this value to lower than
     * the default 200ms may negatively impact performance.
     *
     * @return the walWriterDelay value.
     */
    public Integer getWalWriterDelay() {
        return this.walWriterDelay;
    }

    /**
     * Set the walWriterDelay property: WAL flush interval in milliseconds. Note that setting this value to lower than
     * the default 200ms may negatively impact performance.
     *
     * @param walWriterDelay the walWriterDelay value to set.
     * @return the Postgres object itself.
     */
    public Postgres setWalWriterDelay(Integer walWriterDelay) {
        this.walWriterDelay = walWriterDelay;
        return this;
    }

    /**
     * Get the sharedBuffersPercentage property: Percentage of total RAM that the database server uses for shared memory
     * buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers
     * configuration value.
     *
     * @return the sharedBuffersPercentage value.
     */
    public Float getSharedBuffersPercentage() {
        return this.sharedBuffersPercentage;
    }

    /**
     * Set the sharedBuffersPercentage property: Percentage of total RAM that the database server uses for shared memory
     * buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers
     * configuration value.
     *
     * @param sharedBuffersPercentage the sharedBuffersPercentage value to set.
     * @return the Postgres object itself.
     */
    public Postgres setSharedBuffersPercentage(Float sharedBuffersPercentage) {
        this.sharedBuffersPercentage = sharedBuffersPercentage;
        return this;
    }

    /**
     * Get the pgbouncer property: PGBouncer connection pooling settings.
     *
     * @return the pgbouncer value.
     */
    public Pgbouncer getPgbouncer() {
        return this.pgbouncer;
    }

    /**
     * Set the pgbouncer property: PGBouncer connection pooling settings.
     *
     * @param pgbouncer the pgbouncer value to set.
     * @return the Postgres object itself.
     */
    public Postgres setPgbouncer(Pgbouncer pgbouncer) {
        this.pgbouncer = pgbouncer;
        return this;
    }

    /**
     * Get the workMem property: The maximum amount of memory, in MB, used by a query operation (such as a sort or hash
     * table) before writing to temporary disk files. Default is 1MB + 0.075% of total RAM (up to 32MB).
     *
     * @return the workMem value.
     */
    public Integer getWorkMem() {
        return this.workMem;
    }

    /**
     * Set the workMem property: The maximum amount of memory, in MB, used by a query operation (such as a sort or hash
     * table) before writing to temporary disk files. Default is 1MB + 0.075% of total RAM (up to 32MB).
     *
     * @param workMem the workMem value to set.
     * @return the Postgres object itself.
     */
    public Postgres setWorkMem(Integer workMem) {
        this.workMem = workMem;
        return this;
    }

    /**
     * Get the timescaledb property: TimescaleDB extension configuration values.
     *
     * @return the timescaledb value.
     */
    public Timescaledb getTimescaledb() {
        return this.timescaledb;
    }

    /**
     * Set the timescaledb property: TimescaleDB extension configuration values.
     *
     * @param timescaledb the timescaledb value to set.
     * @return the Postgres object itself.
     */
    public Postgres setTimescaledb(Timescaledb timescaledb) {
        this.timescaledb = timescaledb;
        return this;
    }

    /**
     * Get the synchronousReplication property: Synchronous replication type. Note that the service plan also needs to
     * support synchronous replication.
     *
     * @return the synchronousReplication value.
     */
    public PostgresSynchronousReplication getSynchronousReplication() {
        return this.synchronousReplication;
    }

    /**
     * Set the synchronousReplication property: Synchronous replication type. Note that the service plan also needs to
     * support synchronous replication.
     *
     * @param synchronousReplication the synchronousReplication value to set.
     * @return the Postgres object itself.
     */
    public Postgres setSynchronousReplication(PostgresSynchronousReplication synchronousReplication) {
        this.synchronousReplication = synchronousReplication;
        return this;
    }

    /**
     * Get the statMonitorEnable property: Enable the pg_stat_monitor extension. &lt;b&gt;Enabling this extension will
     * cause the cluster to be restarted.&lt;/b&gt; When this extension is enabled, pg_stat_statements results for
     * utility commands are unreliable.
     *
     * @return the statMonitorEnable value.
     */
    public Boolean isStatMonitorEnable() {
        return this.statMonitorEnable;
    }

    /**
     * Set the statMonitorEnable property: Enable the pg_stat_monitor extension. &lt;b&gt;Enabling this extension will
     * cause the cluster to be restarted.&lt;/b&gt; When this extension is enabled, pg_stat_statements results for
     * utility commands are unreliable.
     *
     * @param statMonitorEnable the statMonitorEnable value to set.
     * @return the Postgres object itself.
     */
    public Postgres setStatMonitorEnable(Boolean statMonitorEnable) {
        this.statMonitorEnable = statMonitorEnable;
        return this;
    }
}
