package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Domain model.
 */
@Fluent
public final class Domain {
    /*
     * The name of the domain itself. This should follow the standard domain format of domain.TLD. For instance,
     * `example.com` is a valid domain name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * This optional attribute may contain an IP address. When provided, an A record will be automatically created
     * pointing to the apex domain.
     */
    @JsonProperty(value = "ip_address")
    private String ipAddress;

    /*
     * This value is the time to live for the records on this domain, in seconds. This defines the time frame that
     * clients can cache queried information before a refresh should be requested.
     */
    @JsonProperty(value = "ttl", access = JsonProperty.Access.WRITE_ONLY)
    private Integer ttl;

    /*
     * This attribute contains the complete contents of the zone file for the selected domain. Individual domain record
     * resources should be used to get more granular control over records. However, this attribute can also be used to
     * get information about the SOA record, which is created automatically and is not accessible as an individual
     * record resource.
     */
    @JsonProperty(value = "zone_file", access = JsonProperty.Access.WRITE_ONLY)
    private String zoneFile;

    /**
     * Get the name property: The name of the domain itself. This should follow the standard domain format of
     * domain.TLD. For instance, `example.com` is a valid domain name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the domain itself. This should follow the standard domain format of
     * domain.TLD. For instance, `example.com` is a valid domain name.
     * 
     * @param name the name value to set.
     * @return the Domain object itself.
     */
    public Domain setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the ipAddress property: This optional attribute may contain an IP address. When provided, an A record will
     * be automatically created pointing to the apex domain.
     * 
     * @return the ipAddress value.
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: This optional attribute may contain an IP address. When provided, an A record will
     * be automatically created pointing to the apex domain.
     * 
     * @param ipAddress the ipAddress value to set.
     * @return the Domain object itself.
     */
    public Domain setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the ttl property: This value is the time to live for the records on this domain, in seconds. This defines
     * the time frame that clients can cache queried information before a refresh should be requested.
     * 
     * @return the ttl value.
     */
    public Integer getTtl() {
        return this.ttl;
    }

    /**
     * Get the zoneFile property: This attribute contains the complete contents of the zone file for the selected
     * domain. Individual domain record resources should be used to get more granular control over records. However,
     * this attribute can also be used to get information about the SOA record, which is created automatically and is
     * not accessible as an individual record resource.
     * 
     * @return the zoneFile value.
     */
    public String getZoneFile() {
        return this.zoneFile;
    }
}
