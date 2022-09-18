package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The CdnEndpoint model.
 */
@Fluent
public final class CdnEndpoint {
    /*
     * A unique ID that can be used to identify and reference a CDN endpoint.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /*
     * The fully qualified domain name (FQDN) for the origin server which provides the content for the CDN. This is
     * currently restricted to a Space.
     */
    @JsonProperty(value = "origin", required = true)
    private String origin;

    /*
     * The fully qualified domain name (FQDN) from which the CDN-backed content is served.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /*
     * The amount of time the content is cached by the CDN's edge servers in seconds. TTL must be one of 60, 600, 3600,
     * 86400, or 604800. Defaults to 3600 (one hour) when excluded.
     */
    @JsonProperty(value = "ttl")
    private CdnEndpointTtl ttl;

    /*
     * The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
     */
    @JsonProperty(value = "certificate_id")
    private UUID certificateId;

    /*
     * The fully qualified domain name (FQDN) of the custom subdomain used with the CDN endpoint.
     */
    @JsonProperty(value = "custom_domain")
    private String customDomain;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the CDN endpoint was created.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /**
     * Get the id property: A unique ID that can be used to identify and reference a CDN endpoint.
     * 
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Get the origin property: The fully qualified domain name (FQDN) for the origin server which provides the content
     * for the CDN. This is currently restricted to a Space.
     * 
     * @return the origin value.
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Set the origin property: The fully qualified domain name (FQDN) for the origin server which provides the content
     * for the CDN. This is currently restricted to a Space.
     * 
     * @param origin the origin value to set.
     * @return the CdnEndpoint object itself.
     */
    public CdnEndpoint setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the endpoint property: The fully qualified domain name (FQDN) from which the CDN-backed content is served.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Get the ttl property: The amount of time the content is cached by the CDN's edge servers in seconds. TTL must be
     * one of 60, 600, 3600, 86400, or 604800. Defaults to 3600 (one hour) when excluded.
     * 
     * @return the ttl value.
     */
    public CdnEndpointTtl getTtl() {
        return this.ttl;
    }

    /**
     * Set the ttl property: The amount of time the content is cached by the CDN's edge servers in seconds. TTL must be
     * one of 60, 600, 3600, 86400, or 604800. Defaults to 3600 (one hour) when excluded.
     * 
     * @param ttl the ttl value to set.
     * @return the CdnEndpoint object itself.
     */
    public CdnEndpoint setTtl(CdnEndpointTtl ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * Get the certificateId property: The ID of a DigitalOcean managed TLS certificate used for SSL when a custom
     * subdomain is provided.
     * 
     * @return the certificateId value.
     */
    public UUID getCertificateId() {
        return this.certificateId;
    }

    /**
     * Set the certificateId property: The ID of a DigitalOcean managed TLS certificate used for SSL when a custom
     * subdomain is provided.
     * 
     * @param certificateId the certificateId value to set.
     * @return the CdnEndpoint object itself.
     */
    public CdnEndpoint setCertificateId(UUID certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * Get the customDomain property: The fully qualified domain name (FQDN) of the custom subdomain used with the CDN
     * endpoint.
     * 
     * @return the customDomain value.
     */
    public String getCustomDomain() {
        return this.customDomain;
    }

    /**
     * Set the customDomain property: The fully qualified domain name (FQDN) of the custom subdomain used with the CDN
     * endpoint.
     * 
     * @param customDomain the customDomain value to set.
     * @return the CdnEndpoint object itself.
     */
    public CdnEndpoint setCustomDomain(String customDomain) {
        this.customDomain = customDomain;
        return this;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * CDN endpoint was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
}
