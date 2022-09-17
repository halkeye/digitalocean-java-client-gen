package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppDomainSpec model. */
@Fluent
public final class AppDomainSpec {
    /*
     * The hostname for the domain
     */
    @JsonProperty(value = "domain", required = true)
    private String domain;

    /*
     * - DEFAULT: The default `.ondigitalocean.app` domain assigned to this app
     * - PRIMARY: The primary domain for this app that is displayed as the default in the control panel, used in
     * bindable environment variables, and any other places that reference an app's live URL. Only one domain may be
     * set as primary.
     * - ALIAS: A non-primary domain
     */
    @JsonProperty(value = "type")
    private AppDomainSpecType type;

    /*
     * Indicates whether the domain includes all sub-domains, in addition to the given domain
     */
    @JsonProperty(value = "wildcard")
    private Boolean wildcard;

    /*
     * Optional. If the domain uses DigitalOcean DNS and you would like App
     * Platform to automatically manage it for you, set this to the name of the
     * domain on your account.
     *
     * For example, If the domain you are adding is `app.domain.com`, the zone
     * could be `domain.com`.
     */
    @JsonProperty(value = "zone")
    private String zone;

    /*
     * The minimum version of TLS a client application can use to access resources for the domain.  Must be one of the
     * following values wrapped within quotations: `"1.2"` or `"1.3"`.
     */
    @JsonProperty(value = "minimum_tls_version")
    private AppDomainSpecMinimumTlsVersion minimumTlsVersion;

    /**
     * Get the domain property: The hostname for the domain.
     *
     * @return the domain value.
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * Set the domain property: The hostname for the domain.
     *
     * @param domain the domain value to set.
     * @return the AppDomainSpec object itself.
     */
    public AppDomainSpec setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the type property: - DEFAULT: The default `.ondigitalocean.app` domain assigned to this app - PRIMARY: The
     * primary domain for this app that is displayed as the default in the control panel, used in bindable environment
     * variables, and any other places that reference an app's live URL. Only one domain may be set as primary. - ALIAS:
     * A non-primary domain.
     *
     * @return the type value.
     */
    public AppDomainSpecType getType() {
        return this.type;
    }

    /**
     * Set the type property: - DEFAULT: The default `.ondigitalocean.app` domain assigned to this app - PRIMARY: The
     * primary domain for this app that is displayed as the default in the control panel, used in bindable environment
     * variables, and any other places that reference an app's live URL. Only one domain may be set as primary. - ALIAS:
     * A non-primary domain.
     *
     * @param type the type value to set.
     * @return the AppDomainSpec object itself.
     */
    public AppDomainSpec setType(AppDomainSpecType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the wildcard property: Indicates whether the domain includes all sub-domains, in addition to the given
     * domain.
     *
     * @return the wildcard value.
     */
    public Boolean isWildcard() {
        return this.wildcard;
    }

    /**
     * Set the wildcard property: Indicates whether the domain includes all sub-domains, in addition to the given
     * domain.
     *
     * @param wildcard the wildcard value to set.
     * @return the AppDomainSpec object itself.
     */
    public AppDomainSpec setWildcard(Boolean wildcard) {
        this.wildcard = wildcard;
        return this;
    }

    /**
     * Get the zone property: Optional. If the domain uses DigitalOcean DNS and you would like App Platform to
     * automatically manage it for you, set this to the name of the domain on your account.
     *
     * <p>For example, If the domain you are adding is `app.domain.com`, the zone could be `domain.com`.
     *
     * @return the zone value.
     */
    public String getZone() {
        return this.zone;
    }

    /**
     * Set the zone property: Optional. If the domain uses DigitalOcean DNS and you would like App Platform to
     * automatically manage it for you, set this to the name of the domain on your account.
     *
     * <p>For example, If the domain you are adding is `app.domain.com`, the zone could be `domain.com`.
     *
     * @param zone the zone value to set.
     * @return the AppDomainSpec object itself.
     */
    public AppDomainSpec setZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * Get the minimumTlsVersion property: The minimum version of TLS a client application can use to access resources
     * for the domain. Must be one of the following values wrapped within quotations: `"1.2"` or `"1.3"`.
     *
     * @return the minimumTlsVersion value.
     */
    public AppDomainSpecMinimumTlsVersion getMinimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimumTlsVersion property: The minimum version of TLS a client application can use to access resources
     * for the domain. Must be one of the following values wrapped within quotations: `"1.2"` or `"1.3"`.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the AppDomainSpec object itself.
     */
    public AppDomainSpec setMinimumTlsVersion(AppDomainSpecMinimumTlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }
}
