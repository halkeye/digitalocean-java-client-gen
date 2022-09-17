package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PGBouncer connection pooling settings. */
@Fluent
public final class Pgbouncer {
    /*
     * Run server_reset_query (DISCARD ALL) in all pooling modes.
     */
    @JsonProperty(value = "server_reset_query_always")
    private Boolean serverResetQueryAlways;

    /*
     * List of parameters to ignore when given in startup packet.
     */
    @JsonProperty(value = "ignore_startup_parameters")
    private List<PgbouncerIgnoreStartupParametersItem> ignoreStartupParameters;

    /*
     * If current server connections are below this number, adds more. Improves behavior when usual load comes suddenly
     * back after period of total inactivity. The value is effectively capped at the pool size.
     */
    @JsonProperty(value = "min_pool_size")
    private Integer minPoolSize;

    /*
     * The pooler closes any unused server connection that has been connected longer than this amount of seconds.
     */
    @JsonProperty(value = "server_lifetime")
    private Integer serverLifetime;

    /*
     * Drops server connections if they have been idle more than this many seconds.  If 0, timeout is disabled.
     */
    @JsonProperty(value = "server_idle_timeout")
    private Integer serverIdleTimeout;

    /*
     * If non-zero, automatically creates a pool of that size per user when a pool doesn't exist.
     */
    @JsonProperty(value = "autodb_pool_size")
    private Integer autodbPoolSize;

    /*
     * PGBouncer pool mode
     */
    @JsonProperty(value = "autodb_pool_mode")
    private PgbouncerAutodbPoolMode autodbPoolMode;

    /*
     * Only allows a maximum this many server connections per database (regardless of user). If 0, allows unlimited
     * connections.
     */
    @JsonProperty(value = "autodb_max_db_connections")
    private Integer autodbMaxDbConnections;

    /*
     * If the automatically-created database pools have been unused this many seconds, they are freed. If 0, timeout is
     * disabled.
     */
    @JsonProperty(value = "autodb_idle_timeout")
    private Integer autodbIdleTimeout;

    /**
     * Get the serverResetQueryAlways property: Run server_reset_query (DISCARD ALL) in all pooling modes.
     *
     * @return the serverResetQueryAlways value.
     */
    public Boolean isServerResetQueryAlways() {
        return this.serverResetQueryAlways;
    }

    /**
     * Set the serverResetQueryAlways property: Run server_reset_query (DISCARD ALL) in all pooling modes.
     *
     * @param serverResetQueryAlways the serverResetQueryAlways value to set.
     * @return the Pgbouncer object itself.
     */
    public Pgbouncer setServerResetQueryAlways(Boolean serverResetQueryAlways) {
        this.serverResetQueryAlways = serverResetQueryAlways;
        return this;
    }

    /**
     * Get the ignoreStartupParameters property: List of parameters to ignore when given in startup packet.
     *
     * @return the ignoreStartupParameters value.
     */
    public List<PgbouncerIgnoreStartupParametersItem> getIgnoreStartupParameters() {
        return this.ignoreStartupParameters;
    }

    /**
     * Set the ignoreStartupParameters property: List of parameters to ignore when given in startup packet.
     *
     * @param ignoreStartupParameters the ignoreStartupParameters value to set.
     * @return the Pgbouncer object itself.
     */
    public Pgbouncer setIgnoreStartupParameters(List<PgbouncerIgnoreStartupParametersItem> ignoreStartupParameters) {
        this.ignoreStartupParameters = ignoreStartupParameters;
        return this;
    }

    /**
     * Get the minPoolSize property: If current server connections are below this number, adds more. Improves behavior
     * when usual load comes suddenly back after period of total inactivity. The value is effectively capped at the pool
     * size.
     *
     * @return the minPoolSize value.
     */
    public Integer getMinPoolSize() {
        return this.minPoolSize;
    }

    /**
     * Set the minPoolSize property: If current server connections are below this number, adds more. Improves behavior
     * when usual load comes suddenly back after period of total inactivity. The value is effectively capped at the pool
     * size.
     *
     * @param minPoolSize the minPoolSize value to set.
     * @return the Pgbouncer object itself.
     */
    public Pgbouncer setMinPoolSize(Integer minPoolSize) {
        this.minPoolSize = minPoolSize;
        return this;
    }

    /**
     * Get the serverLifetime property: The pooler closes any unused server connection that has been connected longer
     * than this amount of seconds.
     *
     * @return the serverLifetime value.
     */
    public Integer getServerLifetime() {
        return this.serverLifetime;
    }

    /**
     * Set the serverLifetime property: The pooler closes any unused server connection that has been connected longer
     * than this amount of seconds.
     *
     * @param serverLifetime the serverLifetime value to set.
     * @return the Pgbouncer object itself.
     */
    public Pgbouncer setServerLifetime(Integer serverLifetime) {
        this.serverLifetime = serverLifetime;
        return this;
    }

    /**
     * Get the serverIdleTimeout property: Drops server connections if they have been idle more than this many seconds.
     * If 0, timeout is disabled.
     *
     * @return the serverIdleTimeout value.
     */
    public Integer getServerIdleTimeout() {
        return this.serverIdleTimeout;
    }

    /**
     * Set the serverIdleTimeout property: Drops server connections if they have been idle more than this many seconds.
     * If 0, timeout is disabled.
     *
     * @param serverIdleTimeout the serverIdleTimeout value to set.
     * @return the Pgbouncer object itself.
     */
    public Pgbouncer setServerIdleTimeout(Integer serverIdleTimeout) {
        this.serverIdleTimeout = serverIdleTimeout;
        return this;
    }

    /**
     * Get the autodbPoolSize property: If non-zero, automatically creates a pool of that size per user when a pool
     * doesn't exist.
     *
     * @return the autodbPoolSize value.
     */
    public Integer getAutodbPoolSize() {
        return this.autodbPoolSize;
    }

    /**
     * Set the autodbPoolSize property: If non-zero, automatically creates a pool of that size per user when a pool
     * doesn't exist.
     *
     * @param autodbPoolSize the autodbPoolSize value to set.
     * @return the Pgbouncer object itself.
     */
    public Pgbouncer setAutodbPoolSize(Integer autodbPoolSize) {
        this.autodbPoolSize = autodbPoolSize;
        return this;
    }

    /**
     * Get the autodbPoolMode property: PGBouncer pool mode.
     *
     * @return the autodbPoolMode value.
     */
    public PgbouncerAutodbPoolMode getAutodbPoolMode() {
        return this.autodbPoolMode;
    }

    /**
     * Set the autodbPoolMode property: PGBouncer pool mode.
     *
     * @param autodbPoolMode the autodbPoolMode value to set.
     * @return the Pgbouncer object itself.
     */
    public Pgbouncer setAutodbPoolMode(PgbouncerAutodbPoolMode autodbPoolMode) {
        this.autodbPoolMode = autodbPoolMode;
        return this;
    }

    /**
     * Get the autodbMaxDbConnections property: Only allows a maximum this many server connections per database
     * (regardless of user). If 0, allows unlimited connections.
     *
     * @return the autodbMaxDbConnections value.
     */
    public Integer getAutodbMaxDbConnections() {
        return this.autodbMaxDbConnections;
    }

    /**
     * Set the autodbMaxDbConnections property: Only allows a maximum this many server connections per database
     * (regardless of user). If 0, allows unlimited connections.
     *
     * @param autodbMaxDbConnections the autodbMaxDbConnections value to set.
     * @return the Pgbouncer object itself.
     */
    public Pgbouncer setAutodbMaxDbConnections(Integer autodbMaxDbConnections) {
        this.autodbMaxDbConnections = autodbMaxDbConnections;
        return this;
    }

    /**
     * Get the autodbIdleTimeout property: If the automatically-created database pools have been unused this many
     * seconds, they are freed. If 0, timeout is disabled.
     *
     * @return the autodbIdleTimeout value.
     */
    public Integer getAutodbIdleTimeout() {
        return this.autodbIdleTimeout;
    }

    /**
     * Set the autodbIdleTimeout property: If the automatically-created database pools have been unused this many
     * seconds, they are freed. If 0, timeout is disabled.
     *
     * @param autodbIdleTimeout the autodbIdleTimeout value to set.
     * @return the Pgbouncer object itself.
     */
    public Pgbouncer setAutodbIdleTimeout(Integer autodbIdleTimeout) {
        this.autodbIdleTimeout = autodbIdleTimeout;
        return this;
    }
}
