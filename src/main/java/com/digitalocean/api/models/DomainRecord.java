package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The DomainRecord model.
 */
@Fluent
public class DomainRecord {
    /*
     * A unique identifier for each domain record.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private Integer id;

    /*
     * The type of the DNS record. For example: A, CNAME, TXT, ...
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * The host name, alias, or service being defined by the record.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Variable data depending on record type. For example, the "data" value for an A record would be the IPv4 address
     * to which the domain will be mapped. For a CAA record, it would contain the domain name of the CA being granted
     * permission to issue certificates.
     */
    @JsonProperty(value = "data")
    private String data;

    /*
     * The priority for SRV and MX records.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * The port for SRV records.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * This value is the time to live for the record, in seconds. This defines the time frame that clients can cache
     * queried information before a refresh should be requested.
     */
    @JsonProperty(value = "ttl")
    private Integer ttl;

    /*
     * The weight for SRV records.
     */
    @JsonProperty(value = "weight")
    private Integer weight;

    /*
     * An unsigned integer between 0-255 used for CAA records.
     */
    @JsonProperty(value = "flags")
    private Integer flags;

    /*
     * The parameter tag for CAA records. Valid values are "issue", "issuewild", or "iodef"
     */
    @JsonProperty(value = "tag")
    private String tag;

    /**
     * Get the id property: A unique identifier for each domain record.
     * 
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Get the type property: The type of the DNS record. For example: A, CNAME, TXT, ...
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of the DNS record. For example: A, CNAME, TXT, ...
     * 
     * @param type the type value to set.
     * @return the DomainRecord object itself.
     */
    public DomainRecord setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The host name, alias, or service being defined by the record.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The host name, alias, or service being defined by the record.
     * 
     * @param name the name value to set.
     * @return the DomainRecord object itself.
     */
    public DomainRecord setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the data property: Variable data depending on record type. For example, the "data" value for an A record
     * would be the IPv4 address to which the domain will be mapped. For a CAA record, it would contain the domain name
     * of the CA being granted permission to issue certificates.
     * 
     * @return the data value.
     */
    public String getData() {
        return this.data;
    }

    /**
     * Set the data property: Variable data depending on record type. For example, the "data" value for an A record
     * would be the IPv4 address to which the domain will be mapped. For a CAA record, it would contain the domain name
     * of the CA being granted permission to issue certificates.
     * 
     * @param data the data value to set.
     * @return the DomainRecord object itself.
     */
    public DomainRecord setData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the priority property: The priority for SRV and MX records.
     * 
     * @return the priority value.
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Set the priority property: The priority for SRV and MX records.
     * 
     * @param priority the priority value to set.
     * @return the DomainRecord object itself.
     */
    public DomainRecord setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the port property: The port for SRV records.
     * 
     * @return the port value.
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * Set the port property: The port for SRV records.
     * 
     * @param port the port value to set.
     * @return the DomainRecord object itself.
     */
    public DomainRecord setPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the ttl property: This value is the time to live for the record, in seconds. This defines the time frame
     * that clients can cache queried information before a refresh should be requested.
     * 
     * @return the ttl value.
     */
    public Integer getTtl() {
        return this.ttl;
    }

    /**
     * Set the ttl property: This value is the time to live for the record, in seconds. This defines the time frame
     * that clients can cache queried information before a refresh should be requested.
     * 
     * @param ttl the ttl value to set.
     * @return the DomainRecord object itself.
     */
    public DomainRecord setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * Get the weight property: The weight for SRV records.
     * 
     * @return the weight value.
     */
    public Integer getWeight() {
        return this.weight;
    }

    /**
     * Set the weight property: The weight for SRV records.
     * 
     * @param weight the weight value to set.
     * @return the DomainRecord object itself.
     */
    public DomainRecord setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the flags property: An unsigned integer between 0-255 used for CAA records.
     * 
     * @return the flags value.
     */
    public Integer getFlags() {
        return this.flags;
    }

    /**
     * Set the flags property: An unsigned integer between 0-255 used for CAA records.
     * 
     * @param flags the flags value to set.
     * @return the DomainRecord object itself.
     */
    public DomainRecord setFlags(Integer flags) {
        this.flags = flags;
        return this;
    }

    /**
     * Get the tag property: The parameter tag for CAA records. Valid values are "issue", "issuewild", or "iodef".
     * 
     * @return the tag value.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: The parameter tag for CAA records. Valid values are "issue", "issuewild", or "iodef".
     * 
     * @param tag the tag value to set.
     * @return the DomainRecord object itself.
     */
    public DomainRecord setTag(String tag) {
        this.tag = tag;
        return this;
    }
}
