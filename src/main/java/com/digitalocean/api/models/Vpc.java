package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/** The Vpc model. */
@Fluent
public final class Vpc extends VpcUpdatable {
    /*
     * The slug identifier for the region where the VPC will be created.
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * The range of IP addresses in the VPC in CIDR notation. Network ranges cannot overlap with other networks in the
     * same account and must be in range of private addresses as defined in RFC1918. It may not be smaller than `/28`
     * nor larger than `/16`. If no IP range is specified, a `/20` network range is generated that won't conflict with
     * other VPC networks in your account.
     */
    @JsonProperty(value = "ip_range")
    private String ipRange;

    /*
     * A boolean value indicating whether or not the VPC is the default network for the region. All applicable
     * resources are placed into the default VPC network unless otherwise specified during their creation. The
     * `default` field cannot be unset from `true`. If you want to set a new default VPC network, update the `default`
     * field of another VPC network in the same region. The previous network's `default` field will be set to `false`
     * when a new default VPC has been defined.
     */
    @JsonProperty(value = "default")
    private Boolean defaultProperty;

    /*
     * A unique ID that can be used to identify and reference the VPC.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /*
     * The uniform resource name (URN) for the resource in the format do:resource_type:resource_id.
     */
    @JsonProperty(value = "urn")
    private String urn;

    /*
     * A time value given in ISO8601 combined date and time format.
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /**
     * Get the region property: The slug identifier for the region where the VPC will be created.
     *
     * @return the region value.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The slug identifier for the region where the VPC will be created.
     *
     * @param region the region value to set.
     * @return the Vpc object itself.
     */
    public Vpc setRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the ipRange property: The range of IP addresses in the VPC in CIDR notation. Network ranges cannot overlap
     * with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may
     * not be smaller than `/28` nor larger than `/16`. If no IP range is specified, a `/20` network range is generated
     * that won't conflict with other VPC networks in your account.
     *
     * @return the ipRange value.
     */
    public String getIpRange() {
        return this.ipRange;
    }

    /**
     * Set the ipRange property: The range of IP addresses in the VPC in CIDR notation. Network ranges cannot overlap
     * with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may
     * not be smaller than `/28` nor larger than `/16`. If no IP range is specified, a `/20` network range is generated
     * that won't conflict with other VPC networks in your account.
     *
     * @param ipRange the ipRange value to set.
     * @return the Vpc object itself.
     */
    public Vpc setIpRange(String ipRange) {
        this.ipRange = ipRange;
        return this;
    }

    /**
     * Get the defaultProperty property: A boolean value indicating whether or not the VPC is the default network for
     * the region. All applicable resources are placed into the default VPC network unless otherwise specified during
     * their creation. The `default` field cannot be unset from `true`. If you want to set a new default VPC network,
     * update the `default` field of another VPC network in the same region. The previous network's `default` field will
     * be set to `false` when a new default VPC has been defined.
     *
     * @return the defaultProperty value.
     */
    public Boolean isDefaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: A boolean value indicating whether or not the VPC is the default network for
     * the region. All applicable resources are placed into the default VPC network unless otherwise specified during
     * their creation. The `default` field cannot be unset from `true`. If you want to set a new default VPC network,
     * update the `default` field of another VPC network in the same region. The previous network's `default` field will
     * be set to `false` when a new default VPC has been defined.
     *
     * @param defaultProperty the defaultProperty value to set.
     * @return the Vpc object itself.
     */
    public Vpc setDefaultProperty(Boolean defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the id property: A unique ID that can be used to identify and reference the VPC.
     *
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Get the urn property: The uniform resource name (URN) for the resource in the format
     * do:resource_type:resource_id.
     *
     * @return the urn value.
     */
    public String getUrn() {
        return this.urn;
    }

    /**
     * Set the urn property: The uniform resource name (URN) for the resource in the format
     * do:resource_type:resource_id.
     *
     * @param urn the urn value to set.
     * @return the Vpc object itself.
     */
    public Vpc setUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /** {@inheritDoc} */
    @Override
    public Vpc setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Vpc setDescription(String description) {
        super.setDescription(description);
        return this;
    }
}
