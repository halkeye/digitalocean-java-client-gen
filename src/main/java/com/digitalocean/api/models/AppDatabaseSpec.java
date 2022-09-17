package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppDatabaseSpec model. */
@Fluent
public final class AppDatabaseSpec {
    /*
     * The name of the underlying DigitalOcean DBaaS cluster. This is required for production databases. For dev
     * databases, if cluster_name is not set, a new cluster will be provisioned.
     */
    @JsonProperty(value = "cluster_name")
    private String clusterName;

    /*
     * The name of the MySQL or PostgreSQL database to configure.
     */
    @JsonProperty(value = "db_name")
    private String dbName;

    /*
     * The name of the MySQL or PostgreSQL user to configure.
     */
    @JsonProperty(value = "db_user")
    private String dbUser;

    /*
     * - MYSQL: MySQL
     * - PG: PostgreSQL
     * - REDIS: Redis
     */
    @JsonProperty(value = "engine")
    private AppDatabaseSpecEngine engine;

    /*
     * The name. Must be unique across all components within the same app.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Whether this is a production or dev database.
     */
    @JsonProperty(value = "production")
    private Boolean production;

    /*
     * The version of the database engine
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the clusterName property: The name of the underlying DigitalOcean DBaaS cluster. This is required for
     * production databases. For dev databases, if cluster_name is not set, a new cluster will be provisioned.
     *
     * @return the clusterName value.
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * Set the clusterName property: The name of the underlying DigitalOcean DBaaS cluster. This is required for
     * production databases. For dev databases, if cluster_name is not set, a new cluster will be provisioned.
     *
     * @param clusterName the clusterName value to set.
     * @return the AppDatabaseSpec object itself.
     */
    public AppDatabaseSpec setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * Get the dbName property: The name of the MySQL or PostgreSQL database to configure.
     *
     * @return the dbName value.
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * Set the dbName property: The name of the MySQL or PostgreSQL database to configure.
     *
     * @param dbName the dbName value to set.
     * @return the AppDatabaseSpec object itself.
     */
    public AppDatabaseSpec setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * Get the dbUser property: The name of the MySQL or PostgreSQL user to configure.
     *
     * @return the dbUser value.
     */
    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * Set the dbUser property: The name of the MySQL or PostgreSQL user to configure.
     *
     * @param dbUser the dbUser value to set.
     * @return the AppDatabaseSpec object itself.
     */
    public AppDatabaseSpec setDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * Get the engine property: - MYSQL: MySQL - PG: PostgreSQL - REDIS: Redis.
     *
     * @return the engine value.
     */
    public AppDatabaseSpecEngine getEngine() {
        return this.engine;
    }

    /**
     * Set the engine property: - MYSQL: MySQL - PG: PostgreSQL - REDIS: Redis.
     *
     * @param engine the engine value to set.
     * @return the AppDatabaseSpec object itself.
     */
    public AppDatabaseSpec setEngine(AppDatabaseSpecEngine engine) {
        this.engine = engine;
        return this;
    }

    /**
     * Get the name property: The name. Must be unique across all components within the same app.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name. Must be unique across all components within the same app.
     *
     * @param name the name value to set.
     * @return the AppDatabaseSpec object itself.
     */
    public AppDatabaseSpec setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the production property: Whether this is a production or dev database.
     *
     * @return the production value.
     */
    public Boolean isProduction() {
        return this.production;
    }

    /**
     * Set the production property: Whether this is a production or dev database.
     *
     * @param production the production value to set.
     * @return the AppDatabaseSpec object itself.
     */
    public AppDatabaseSpec setProduction(Boolean production) {
        this.production = production;
        return this;
    }

    /**
     * Get the version property: The version of the database engine.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the database engine.
     *
     * @param version the version value to set.
     * @return the AppDatabaseSpec object itself.
     */
    public AppDatabaseSpec setVersion(String version) {
        this.version = version;
        return this;
    }
}
