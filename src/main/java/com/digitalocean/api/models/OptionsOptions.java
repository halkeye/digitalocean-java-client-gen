package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OptionsOptions model. */
@Fluent
public final class OptionsOptions {
    /*
     * The mongodb property.
     */
    @JsonProperty(value = "mongodb")
    private OptionsMongodb mongodb;

    /*
     * The pg property.
     */
    @JsonProperty(value = "pg")
    private OptionsPg pg;

    /*
     * The mysql property.
     */
    @JsonProperty(value = "mysql")
    private OptionsMysql mysql;

    /*
     * The redis property.
     */
    @JsonProperty(value = "redis")
    private OptionsRedis redis;

    /**
     * Get the mongodb property: The mongodb property.
     *
     * @return the mongodb value.
     */
    public OptionsMongodb getMongodb() {
        return this.mongodb;
    }

    /**
     * Set the mongodb property: The mongodb property.
     *
     * @param mongodb the mongodb value to set.
     * @return the OptionsOptions object itself.
     */
    public OptionsOptions setMongodb(OptionsMongodb mongodb) {
        this.mongodb = mongodb;
        return this;
    }

    /**
     * Get the pg property: The pg property.
     *
     * @return the pg value.
     */
    public OptionsPg getPg() {
        return this.pg;
    }

    /**
     * Set the pg property: The pg property.
     *
     * @param pg the pg value to set.
     * @return the OptionsOptions object itself.
     */
    public OptionsOptions setPg(OptionsPg pg) {
        this.pg = pg;
        return this;
    }

    /**
     * Get the mysql property: The mysql property.
     *
     * @return the mysql value.
     */
    public OptionsMysql getMysql() {
        return this.mysql;
    }

    /**
     * Set the mysql property: The mysql property.
     *
     * @param mysql the mysql value to set.
     * @return the OptionsOptions object itself.
     */
    public OptionsOptions setMysql(OptionsMysql mysql) {
        this.mysql = mysql;
        return this;
    }

    /**
     * Get the redis property: The redis property.
     *
     * @return the redis value.
     */
    public OptionsRedis getRedis() {
        return this.redis;
    }

    /**
     * Set the redis property: The redis property.
     *
     * @param redis the redis value to set.
     * @return the OptionsOptions object itself.
     */
    public OptionsOptions setRedis(OptionsRedis redis) {
        this.redis = redis;
        return this;
    }
}
