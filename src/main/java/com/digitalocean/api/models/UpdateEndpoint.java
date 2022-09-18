package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The UpdateEndpoint model.
 */
@Fluent
public final class UpdateEndpoint {
    /*
     * The amount of time the content is cached by the CDN's edge servers in seconds. TTL must be one of 60, 600, 3600,
     * 86400, or 604800. Defaults to 3600 (one hour) when excluded.
     */
    @JsonProperty(value = "ttl")
    private UpdateEndpointTtl ttl;

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

    /**
     * Get the ttl property: The amount of time the content is cached by the CDN's edge servers in seconds. TTL must be
     * one of 60, 600, 3600, 86400, or 604800. Defaults to 3600 (one hour) when excluded.
     * 
     * @return the ttl value.
     */
    public UpdateEndpointTtl getTtl() {
        return this.ttl;
    }

    /**
     * Set the ttl property: The amount of time the content is cached by the CDN's edge servers in seconds. TTL must be
     * one of 60, 600, 3600, 86400, or 604800. Defaults to 3600 (one hour) when excluded.
     * 
     * @param ttl the ttl value to set.
     * @return the UpdateEndpoint object itself.
     */
    public UpdateEndpoint setTtl(UpdateEndpointTtl ttl) {
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
     * @return the UpdateEndpoint object itself.
     */
    public UpdateEndpoint setCertificateId(UUID certificateId) {
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
     * @return the UpdateEndpoint object itself.
     */
    public UpdateEndpoint setCustomDomain(String customDomain) {
        this.customDomain = customDomain;
        return this;
    }
}
