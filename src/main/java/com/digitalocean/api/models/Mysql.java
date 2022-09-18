package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The Mysql model.
 */
@Fluent
public final class Mysql {
    /*
     * The hour of day (in UTC) when backup for the service starts. New backup only starts if previous backup has
     * already completed.
     */
    @JsonProperty(value = "backup_hour")
    private Integer backupHour;

    /*
     * The minute of the backup hour when backup for the service starts. New backup  only starts if previous backup has
     * already completed.
     */
    @JsonProperty(value = "backup_minute")
    private Integer backupMinute;

    /*
     * Global SQL mode. If empty, uses MySQL server defaults. Must only include uppercase alphabetic characters,
     * underscores, and commas.
     */
    @JsonProperty(value = "sql_mode")
    private String sqlMode;

    /*
     * The number of seconds that the mysqld server waits for a connect packet before responding with bad handshake.
     */
    @JsonProperty(value = "connect_timeout")
    private Integer connectTimeout;

    /*
     * Default server time zone, in the form of an offset from UTC (from -12:00 to +12:00), a time zone name (EST), or
     * 'SYSTEM' to use the MySQL server default.
     */
    @JsonProperty(value = "default_time_zone")
    private String defaultTimeZone;

    /*
     * The maximum permitted result length, in bytes, for the GROUP_CONCAT() function.
     */
    @JsonProperty(value = "group_concat_max_len")
    private Integer groupConcatMaxLen;

    /*
     * The time, in seconds, before cached statistics expire.
     */
    @JsonProperty(value = "information_schema_stats_expiry")
    private Integer informationSchemaStatsExpiry;

    /*
     * The minimum length of words that an InnoDB FULLTEXT index stores.
     */
    @JsonProperty(value = "innodb_ft_min_token_size")
    private Integer innodbFtMinTokenSize;

    /*
     * The InnoDB FULLTEXT index stopword list for all InnoDB tables.
     */
    @JsonProperty(value = "innodb_ft_server_stopword_table")
    private String innodbFtServerStopwordTable;

    /*
     * The time, in seconds, that an InnoDB transaction waits for a row lock. before giving up.
     */
    @JsonProperty(value = "innodb_lock_wait_timeout")
    private Integer innodbLockWaitTimeout;

    /*
     * The size of the buffer, in bytes, that InnoDB uses to write to the log files. on disk.
     */
    @JsonProperty(value = "innodb_log_buffer_size")
    private Integer innodbLogBufferSize;

    /*
     * The upper limit, in bytes, of the size of the temporary log files used during online DDL operations for InnoDB
     * tables.
     */
    @JsonProperty(value = "innodb_online_alter_log_max_size")
    private Integer innodbOnlineAlterLogMaxSize;

    /*
     * When enabled, records information about all deadlocks in InnoDB user transactions  in the error log. Disabled by
     * default.
     */
    @JsonProperty(value = "innodb_print_all_deadlocks")
    private Boolean innodbPrintAllDeadlocks;

    /*
     * When enabled, transaction timeouts cause InnoDB to abort and roll back the entire transaction.
     */
    @JsonProperty(value = "innodb_rollback_on_timeout")
    private Boolean innodbRollbackOnTimeout;

    /*
     * The time, in seconds, the server waits for activity on an interactive. connection before closing it.
     */
    @JsonProperty(value = "interactive_timeout")
    private Integer interactiveTimeout;

    /*
     * The storage engine for in-memory internal temporary tables.
     */
    @JsonProperty(value = "internal_tmp_mem_storage_engine")
    private MysqlInternalTmpMemStorageEngine internalTmpMemStorageEngine;

    /*
     * The time, in seconds, to wait for more data from an existing connection. aborting the read.
     */
    @JsonProperty(value = "net_read_timeout")
    private Integer netReadTimeout;

    /*
     * The number of seconds to wait for a block to be written to a connection before aborting the write.
     */
    @JsonProperty(value = "net_write_timeout")
    private Integer netWriteTimeout;

    /*
     * Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It
     * is recommended to always have primary keys because various functionality may break if any large table is missing
     * them.
     */
    @JsonProperty(value = "sql_require_primary_key")
    private Boolean sqlRequirePrimaryKey;

    /*
     * The number of seconds the server waits for activity on a noninteractive connection before closing it.
     */
    @JsonProperty(value = "wait_timeout")
    private Integer waitTimeout;

    /*
     * The size of the largest message, in bytes, that can be received by the server. Default is 67108864 (64M).
     */
    @JsonProperty(value = "max_allowed_packet")
    private Integer maxAllowedPacket;

    /*
     * The maximum size, in bytes, of internal in-memory tables. Also set tmp_table_size. Default is 16777216 (16M)
     */
    @JsonProperty(value = "max_heap_table_size")
    private Integer maxHeapTableSize;

    /*
     * The sort buffer size, in bytes, for ORDER BY optimization. Default is 262144. (256K).
     */
    @JsonProperty(value = "sort_buffer_size")
    private Integer sortBufferSize;

    /*
     * The maximum size, in bytes, of internal in-memory tables. Also set max_heap_table_size. Default is 16777216
     * (16M).
     */
    @JsonProperty(value = "tmp_table_size")
    private Integer tmpTableSize;

    /*
     * When enabled, captures slow queries. When disabled, also truncates the mysql.slow_log table. Default is false.
     */
    @JsonProperty(value = "slow_query_log")
    private Boolean slowQueryLog;

    /*
     * The time, in seconds, for a query to take to execute before  being captured by slow_query_logs. Default is 10
     * seconds.
     */
    @JsonProperty(value = "long_query_time")
    private Float longQueryTime;

    /*
     * The minimum amount of time, in seconds, to keep binlog entries before deletion.  This may be extended for
     * services that require binlog entries for longer than the default, for example if using the MySQL Debezium Kafka
     * connector.
     */
    @JsonProperty(value = "binlog_retention_period")
    private Float binlogRetentionPeriod;

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
     * @return the Mysql object itself.
     */
    public Mysql setBackupHour(Integer backupHour) {
        this.backupHour = backupHour;
        return this;
    }

    /**
     * Get the backupMinute property: The minute of the backup hour when backup for the service starts. New backup 
     * only starts if previous backup has already completed.
     * 
     * @return the backupMinute value.
     */
    public Integer getBackupMinute() {
        return this.backupMinute;
    }

    /**
     * Set the backupMinute property: The minute of the backup hour when backup for the service starts. New backup 
     * only starts if previous backup has already completed.
     * 
     * @param backupMinute the backupMinute value to set.
     * @return the Mysql object itself.
     */
    public Mysql setBackupMinute(Integer backupMinute) {
        this.backupMinute = backupMinute;
        return this;
    }

    /**
     * Get the sqlMode property: Global SQL mode. If empty, uses MySQL server defaults. Must only include uppercase
     * alphabetic characters, underscores, and commas.
     * 
     * @return the sqlMode value.
     */
    public String getSqlMode() {
        return this.sqlMode;
    }

    /**
     * Set the sqlMode property: Global SQL mode. If empty, uses MySQL server defaults. Must only include uppercase
     * alphabetic characters, underscores, and commas.
     * 
     * @param sqlMode the sqlMode value to set.
     * @return the Mysql object itself.
     */
    public Mysql setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode;
        return this;
    }

    /**
     * Get the connectTimeout property: The number of seconds that the mysqld server waits for a connect packet before
     * responding with bad handshake.
     * 
     * @return the connectTimeout value.
     */
    public Integer getConnectTimeout() {
        return this.connectTimeout;
    }

    /**
     * Set the connectTimeout property: The number of seconds that the mysqld server waits for a connect packet before
     * responding with bad handshake.
     * 
     * @param connectTimeout the connectTimeout value to set.
     * @return the Mysql object itself.
     */
    public Mysql setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    /**
     * Get the defaultTimeZone property: Default server time zone, in the form of an offset from UTC (from -12:00 to
     * +12:00), a time zone name (EST), or 'SYSTEM' to use the MySQL server default.
     * 
     * @return the defaultTimeZone value.
     */
    public String getDefaultTimeZone() {
        return this.defaultTimeZone;
    }

    /**
     * Set the defaultTimeZone property: Default server time zone, in the form of an offset from UTC (from -12:00 to
     * +12:00), a time zone name (EST), or 'SYSTEM' to use the MySQL server default.
     * 
     * @param defaultTimeZone the defaultTimeZone value to set.
     * @return the Mysql object itself.
     */
    public Mysql setDefaultTimeZone(String defaultTimeZone) {
        this.defaultTimeZone = defaultTimeZone;
        return this;
    }

    /**
     * Get the groupConcatMaxLen property: The maximum permitted result length, in bytes, for the GROUP_CONCAT()
     * function.
     * 
     * @return the groupConcatMaxLen value.
     */
    public Integer getGroupConcatMaxLen() {
        return this.groupConcatMaxLen;
    }

    /**
     * Set the groupConcatMaxLen property: The maximum permitted result length, in bytes, for the GROUP_CONCAT()
     * function.
     * 
     * @param groupConcatMaxLen the groupConcatMaxLen value to set.
     * @return the Mysql object itself.
     */
    public Mysql setGroupConcatMaxLen(Integer groupConcatMaxLen) {
        this.groupConcatMaxLen = groupConcatMaxLen;
        return this;
    }

    /**
     * Get the informationSchemaStatsExpiry property: The time, in seconds, before cached statistics expire.
     * 
     * @return the informationSchemaStatsExpiry value.
     */
    public Integer getInformationSchemaStatsExpiry() {
        return this.informationSchemaStatsExpiry;
    }

    /**
     * Set the informationSchemaStatsExpiry property: The time, in seconds, before cached statistics expire.
     * 
     * @param informationSchemaStatsExpiry the informationSchemaStatsExpiry value to set.
     * @return the Mysql object itself.
     */
    public Mysql setInformationSchemaStatsExpiry(Integer informationSchemaStatsExpiry) {
        this.informationSchemaStatsExpiry = informationSchemaStatsExpiry;
        return this;
    }

    /**
     * Get the innodbFtMinTokenSize property: The minimum length of words that an InnoDB FULLTEXT index stores.
     * 
     * @return the innodbFtMinTokenSize value.
     */
    public Integer getInnodbFtMinTokenSize() {
        return this.innodbFtMinTokenSize;
    }

    /**
     * Set the innodbFtMinTokenSize property: The minimum length of words that an InnoDB FULLTEXT index stores.
     * 
     * @param innodbFtMinTokenSize the innodbFtMinTokenSize value to set.
     * @return the Mysql object itself.
     */
    public Mysql setInnodbFtMinTokenSize(Integer innodbFtMinTokenSize) {
        this.innodbFtMinTokenSize = innodbFtMinTokenSize;
        return this;
    }

    /**
     * Get the innodbFtServerStopwordTable property: The InnoDB FULLTEXT index stopword list for all InnoDB tables.
     * 
     * @return the innodbFtServerStopwordTable value.
     */
    public String getInnodbFtServerStopwordTable() {
        return this.innodbFtServerStopwordTable;
    }

    /**
     * Set the innodbFtServerStopwordTable property: The InnoDB FULLTEXT index stopword list for all InnoDB tables.
     * 
     * @param innodbFtServerStopwordTable the innodbFtServerStopwordTable value to set.
     * @return the Mysql object itself.
     */
    public Mysql setInnodbFtServerStopwordTable(String innodbFtServerStopwordTable) {
        this.innodbFtServerStopwordTable = innodbFtServerStopwordTable;
        return this;
    }

    /**
     * Get the innodbLockWaitTimeout property: The time, in seconds, that an InnoDB transaction waits for a row lock.
     * before giving up.
     * 
     * @return the innodbLockWaitTimeout value.
     */
    public Integer getInnodbLockWaitTimeout() {
        return this.innodbLockWaitTimeout;
    }

    /**
     * Set the innodbLockWaitTimeout property: The time, in seconds, that an InnoDB transaction waits for a row lock.
     * before giving up.
     * 
     * @param innodbLockWaitTimeout the innodbLockWaitTimeout value to set.
     * @return the Mysql object itself.
     */
    public Mysql setInnodbLockWaitTimeout(Integer innodbLockWaitTimeout) {
        this.innodbLockWaitTimeout = innodbLockWaitTimeout;
        return this;
    }

    /**
     * Get the innodbLogBufferSize property: The size of the buffer, in bytes, that InnoDB uses to write to the log
     * files. on disk.
     * 
     * @return the innodbLogBufferSize value.
     */
    public Integer getInnodbLogBufferSize() {
        return this.innodbLogBufferSize;
    }

    /**
     * Set the innodbLogBufferSize property: The size of the buffer, in bytes, that InnoDB uses to write to the log
     * files. on disk.
     * 
     * @param innodbLogBufferSize the innodbLogBufferSize value to set.
     * @return the Mysql object itself.
     */
    public Mysql setInnodbLogBufferSize(Integer innodbLogBufferSize) {
        this.innodbLogBufferSize = innodbLogBufferSize;
        return this;
    }

    /**
     * Get the innodbOnlineAlterLogMaxSize property: The upper limit, in bytes, of the size of the temporary log files
     * used during online DDL operations for InnoDB tables.
     * 
     * @return the innodbOnlineAlterLogMaxSize value.
     */
    public Integer getInnodbOnlineAlterLogMaxSize() {
        return this.innodbOnlineAlterLogMaxSize;
    }

    /**
     * Set the innodbOnlineAlterLogMaxSize property: The upper limit, in bytes, of the size of the temporary log files
     * used during online DDL operations for InnoDB tables.
     * 
     * @param innodbOnlineAlterLogMaxSize the innodbOnlineAlterLogMaxSize value to set.
     * @return the Mysql object itself.
     */
    public Mysql setInnodbOnlineAlterLogMaxSize(Integer innodbOnlineAlterLogMaxSize) {
        this.innodbOnlineAlterLogMaxSize = innodbOnlineAlterLogMaxSize;
        return this;
    }

    /**
     * Get the innodbPrintAllDeadlocks property: When enabled, records information about all deadlocks in InnoDB user
     * transactions  in the error log. Disabled by default.
     * 
     * @return the innodbPrintAllDeadlocks value.
     */
    public Boolean isInnodbPrintAllDeadlocks() {
        return this.innodbPrintAllDeadlocks;
    }

    /**
     * Set the innodbPrintAllDeadlocks property: When enabled, records information about all deadlocks in InnoDB user
     * transactions  in the error log. Disabled by default.
     * 
     * @param innodbPrintAllDeadlocks the innodbPrintAllDeadlocks value to set.
     * @return the Mysql object itself.
     */
    public Mysql setInnodbPrintAllDeadlocks(Boolean innodbPrintAllDeadlocks) {
        this.innodbPrintAllDeadlocks = innodbPrintAllDeadlocks;
        return this;
    }

    /**
     * Get the innodbRollbackOnTimeout property: When enabled, transaction timeouts cause InnoDB to abort and roll back
     * the entire transaction.
     * 
     * @return the innodbRollbackOnTimeout value.
     */
    public Boolean isInnodbRollbackOnTimeout() {
        return this.innodbRollbackOnTimeout;
    }

    /**
     * Set the innodbRollbackOnTimeout property: When enabled, transaction timeouts cause InnoDB to abort and roll back
     * the entire transaction.
     * 
     * @param innodbRollbackOnTimeout the innodbRollbackOnTimeout value to set.
     * @return the Mysql object itself.
     */
    public Mysql setInnodbRollbackOnTimeout(Boolean innodbRollbackOnTimeout) {
        this.innodbRollbackOnTimeout = innodbRollbackOnTimeout;
        return this;
    }

    /**
     * Get the interactiveTimeout property: The time, in seconds, the server waits for activity on an interactive.
     * connection before closing it.
     * 
     * @return the interactiveTimeout value.
     */
    public Integer getInteractiveTimeout() {
        return this.interactiveTimeout;
    }

    /**
     * Set the interactiveTimeout property: The time, in seconds, the server waits for activity on an interactive.
     * connection before closing it.
     * 
     * @param interactiveTimeout the interactiveTimeout value to set.
     * @return the Mysql object itself.
     */
    public Mysql setInteractiveTimeout(Integer interactiveTimeout) {
        this.interactiveTimeout = interactiveTimeout;
        return this;
    }

    /**
     * Get the internalTmpMemStorageEngine property: The storage engine for in-memory internal temporary tables.
     * 
     * @return the internalTmpMemStorageEngine value.
     */
    public MysqlInternalTmpMemStorageEngine getInternalTmpMemStorageEngine() {
        return this.internalTmpMemStorageEngine;
    }

    /**
     * Set the internalTmpMemStorageEngine property: The storage engine for in-memory internal temporary tables.
     * 
     * @param internalTmpMemStorageEngine the internalTmpMemStorageEngine value to set.
     * @return the Mysql object itself.
     */
    public Mysql setInternalTmpMemStorageEngine(MysqlInternalTmpMemStorageEngine internalTmpMemStorageEngine) {
        this.internalTmpMemStorageEngine = internalTmpMemStorageEngine;
        return this;
    }

    /**
     * Get the netReadTimeout property: The time, in seconds, to wait for more data from an existing connection.
     * aborting the read.
     * 
     * @return the netReadTimeout value.
     */
    public Integer getNetReadTimeout() {
        return this.netReadTimeout;
    }

    /**
     * Set the netReadTimeout property: The time, in seconds, to wait for more data from an existing connection.
     * aborting the read.
     * 
     * @param netReadTimeout the netReadTimeout value to set.
     * @return the Mysql object itself.
     */
    public Mysql setNetReadTimeout(Integer netReadTimeout) {
        this.netReadTimeout = netReadTimeout;
        return this;
    }

    /**
     * Get the netWriteTimeout property: The number of seconds to wait for a block to be written to a connection before
     * aborting the write.
     * 
     * @return the netWriteTimeout value.
     */
    public Integer getNetWriteTimeout() {
        return this.netWriteTimeout;
    }

    /**
     * Set the netWriteTimeout property: The number of seconds to wait for a block to be written to a connection before
     * aborting the write.
     * 
     * @param netWriteTimeout the netWriteTimeout value to set.
     * @return the Mysql object itself.
     */
    public Mysql setNetWriteTimeout(Integer netWriteTimeout) {
        this.netWriteTimeout = netWriteTimeout;
        return this;
    }

    /**
     * Get the sqlRequirePrimaryKey property: Require primary key to be defined for new tables or old tables modified
     * with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various
     * functionality may break if any large table is missing them.
     * 
     * @return the sqlRequirePrimaryKey value.
     */
    public Boolean isSqlRequirePrimaryKey() {
        return this.sqlRequirePrimaryKey;
    }

    /**
     * Set the sqlRequirePrimaryKey property: Require primary key to be defined for new tables or old tables modified
     * with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various
     * functionality may break if any large table is missing them.
     * 
     * @param sqlRequirePrimaryKey the sqlRequirePrimaryKey value to set.
     * @return the Mysql object itself.
     */
    public Mysql setSqlRequirePrimaryKey(Boolean sqlRequirePrimaryKey) {
        this.sqlRequirePrimaryKey = sqlRequirePrimaryKey;
        return this;
    }

    /**
     * Get the waitTimeout property: The number of seconds the server waits for activity on a noninteractive connection
     * before closing it.
     * 
     * @return the waitTimeout value.
     */
    public Integer getWaitTimeout() {
        return this.waitTimeout;
    }

    /**
     * Set the waitTimeout property: The number of seconds the server waits for activity on a noninteractive connection
     * before closing it.
     * 
     * @param waitTimeout the waitTimeout value to set.
     * @return the Mysql object itself.
     */
    public Mysql setWaitTimeout(Integer waitTimeout) {
        this.waitTimeout = waitTimeout;
        return this;
    }

    /**
     * Get the maxAllowedPacket property: The size of the largest message, in bytes, that can be received by the
     * server. Default is 67108864 (64M).
     * 
     * @return the maxAllowedPacket value.
     */
    public Integer getMaxAllowedPacket() {
        return this.maxAllowedPacket;
    }

    /**
     * Set the maxAllowedPacket property: The size of the largest message, in bytes, that can be received by the
     * server. Default is 67108864 (64M).
     * 
     * @param maxAllowedPacket the maxAllowedPacket value to set.
     * @return the Mysql object itself.
     */
    public Mysql setMaxAllowedPacket(Integer maxAllowedPacket) {
        this.maxAllowedPacket = maxAllowedPacket;
        return this;
    }

    /**
     * Get the maxHeapTableSize property: The maximum size, in bytes, of internal in-memory tables. Also set
     * tmp_table_size. Default is 16777216 (16M).
     * 
     * @return the maxHeapTableSize value.
     */
    public Integer getMaxHeapTableSize() {
        return this.maxHeapTableSize;
    }

    /**
     * Set the maxHeapTableSize property: The maximum size, in bytes, of internal in-memory tables. Also set
     * tmp_table_size. Default is 16777216 (16M).
     * 
     * @param maxHeapTableSize the maxHeapTableSize value to set.
     * @return the Mysql object itself.
     */
    public Mysql setMaxHeapTableSize(Integer maxHeapTableSize) {
        this.maxHeapTableSize = maxHeapTableSize;
        return this;
    }

    /**
     * Get the sortBufferSize property: The sort buffer size, in bytes, for ORDER BY optimization. Default is 262144.
     * (256K).
     * 
     * @return the sortBufferSize value.
     */
    public Integer getSortBufferSize() {
        return this.sortBufferSize;
    }

    /**
     * Set the sortBufferSize property: The sort buffer size, in bytes, for ORDER BY optimization. Default is 262144.
     * (256K).
     * 
     * @param sortBufferSize the sortBufferSize value to set.
     * @return the Mysql object itself.
     */
    public Mysql setSortBufferSize(Integer sortBufferSize) {
        this.sortBufferSize = sortBufferSize;
        return this;
    }

    /**
     * Get the tmpTableSize property: The maximum size, in bytes, of internal in-memory tables. Also set
     * max_heap_table_size. Default is 16777216 (16M).
     * 
     * @return the tmpTableSize value.
     */
    public Integer getTmpTableSize() {
        return this.tmpTableSize;
    }

    /**
     * Set the tmpTableSize property: The maximum size, in bytes, of internal in-memory tables. Also set
     * max_heap_table_size. Default is 16777216 (16M).
     * 
     * @param tmpTableSize the tmpTableSize value to set.
     * @return the Mysql object itself.
     */
    public Mysql setTmpTableSize(Integer tmpTableSize) {
        this.tmpTableSize = tmpTableSize;
        return this;
    }

    /**
     * Get the slowQueryLog property: When enabled, captures slow queries. When disabled, also truncates the
     * mysql.slow_log table. Default is false.
     * 
     * @return the slowQueryLog value.
     */
    public Boolean isSlowQueryLog() {
        return this.slowQueryLog;
    }

    /**
     * Set the slowQueryLog property: When enabled, captures slow queries. When disabled, also truncates the
     * mysql.slow_log table. Default is false.
     * 
     * @param slowQueryLog the slowQueryLog value to set.
     * @return the Mysql object itself.
     */
    public Mysql setSlowQueryLog(Boolean slowQueryLog) {
        this.slowQueryLog = slowQueryLog;
        return this;
    }

    /**
     * Get the longQueryTime property: The time, in seconds, for a query to take to execute before  being captured by
     * slow_query_logs. Default is 10 seconds.
     * 
     * @return the longQueryTime value.
     */
    public Float getLongQueryTime() {
        return this.longQueryTime;
    }

    /**
     * Set the longQueryTime property: The time, in seconds, for a query to take to execute before  being captured by
     * slow_query_logs. Default is 10 seconds.
     * 
     * @param longQueryTime the longQueryTime value to set.
     * @return the Mysql object itself.
     */
    public Mysql setLongQueryTime(Float longQueryTime) {
        this.longQueryTime = longQueryTime;
        return this;
    }

    /**
     * Get the binlogRetentionPeriod property: The minimum amount of time, in seconds, to keep binlog entries before
     * deletion.  This may be extended for services that require binlog entries for longer than the default, for
     * example if using the MySQL Debezium Kafka connector.
     * 
     * @return the binlogRetentionPeriod value.
     */
    public Float getBinlogRetentionPeriod() {
        return this.binlogRetentionPeriod;
    }

    /**
     * Set the binlogRetentionPeriod property: The minimum amount of time, in seconds, to keep binlog entries before
     * deletion.  This may be extended for services that require binlog entries for longer than the default, for
     * example if using the MySQL Debezium Kafka connector.
     * 
     * @param binlogRetentionPeriod the binlogRetentionPeriod value to set.
     * @return the Mysql object itself.
     */
    public Mysql setBinlogRetentionPeriod(Float binlogRetentionPeriod) {
        this.binlogRetentionPeriod = binlogRetentionPeriod;
        return this;
    }
}
