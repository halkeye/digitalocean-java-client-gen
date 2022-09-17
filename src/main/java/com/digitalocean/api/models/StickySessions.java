package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object specifying sticky sessions settings for the load balancer. */
@Fluent
public final class StickySessions {
    /*
     * An attribute indicating how and if requests from a client will be persistently served by the same backend
     * Droplet. The possible values are `cookies` or `none`.
     */
    @JsonProperty(value = "type")
    private StickySessionsType type;

    /*
     * The name of the cookie sent to the client. This attribute is only returned when using `cookies` for the sticky
     * sessions type.
     */
    @JsonProperty(value = "cookie_name")
    private String cookieName;

    /*
     * The number of seconds until the cookie set by the load balancer expires. This attribute is only returned when
     * using `cookies` for the sticky sessions type.
     */
    @JsonProperty(value = "cookie_ttl_seconds")
    private Integer cookieTtlSeconds;

    /**
     * Get the type property: An attribute indicating how and if requests from a client will be persistently served by
     * the same backend Droplet. The possible values are `cookies` or `none`.
     *
     * @return the type value.
     */
    public StickySessionsType getType() {
        return this.type;
    }

    /**
     * Set the type property: An attribute indicating how and if requests from a client will be persistently served by
     * the same backend Droplet. The possible values are `cookies` or `none`.
     *
     * @param type the type value to set.
     * @return the StickySessions object itself.
     */
    public StickySessions setType(StickySessionsType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the cookieName property: The name of the cookie sent to the client. This attribute is only returned when
     * using `cookies` for the sticky sessions type.
     *
     * @return the cookieName value.
     */
    public String getCookieName() {
        return this.cookieName;
    }

    /**
     * Set the cookieName property: The name of the cookie sent to the client. This attribute is only returned when
     * using `cookies` for the sticky sessions type.
     *
     * @param cookieName the cookieName value to set.
     * @return the StickySessions object itself.
     */
    public StickySessions setCookieName(String cookieName) {
        this.cookieName = cookieName;
        return this;
    }

    /**
     * Get the cookieTtlSeconds property: The number of seconds until the cookie set by the load balancer expires. This
     * attribute is only returned when using `cookies` for the sticky sessions type.
     *
     * @return the cookieTtlSeconds value.
     */
    public Integer getCookieTtlSeconds() {
        return this.cookieTtlSeconds;
    }

    /**
     * Set the cookieTtlSeconds property: The number of seconds until the cookie set by the load balancer expires. This
     * attribute is only returned when using `cookies` for the sticky sessions type.
     *
     * @param cookieTtlSeconds the cookieTtlSeconds value to set.
     * @return the StickySessions object itself.
     */
    public StickySessions setCookieTtlSeconds(Integer cookieTtlSeconds) {
        this.cookieTtlSeconds = cookieTtlSeconds;
        return this;
    }
}
