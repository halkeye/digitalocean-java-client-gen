package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The DropletCreate model.
 */
@Fluent
public class DropletCreate {
    /*
     * The slug identifier for the region that you wish to deploy the Droplet in.
     */
    @JsonProperty(value = "region", required = true)
    private String region;

    /*
     * The slug identifier for the size that you wish to select for this Droplet.
     */
    @JsonProperty(value = "size", required = true)
    private String size;

    /*
     * The image ID of a public or private image or the slug identifier for a public image. This image will be the base
     * image for your Droplet.
     */
    @JsonProperty(value = "image", required = true)
    private Object image;

    /*
     * An array containing the IDs or fingerprints of the SSH keys that you wish to embed in the Droplet's root account
     * upon creation.
     */
    @JsonProperty(value = "ssh_keys")
    private List<Object> sshKeys;

    /*
     * A boolean indicating whether automated backups should be enabled for the Droplet.
     */
    @JsonProperty(value = "backups")
    private Boolean backups;

    /*
     * A boolean indicating whether to enable IPv6 on the Droplet.
     */
    @JsonProperty(value = "ipv6")
    private Boolean ipv6;

    /*
     * A boolean indicating whether to install the DigitalOcean agent for monitoring.
     */
    @JsonProperty(value = "monitoring")
    private Boolean monitoring;

    /*
     * A flat array of tag names as strings to apply to the Droplet after it is created. Tag names can either be
     * existing or new tags.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /*
     * A string containing 'user data' which may be used to configure the Droplet on first boot, often a 'cloud-config'
     * file or Bash script. It must be plain text and may not exceed 64 KiB in size.
     */
    @JsonProperty(value = "user_data")
    private String userData;

    /*
     * This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no
     * `vpc_uuid` is provided, the Droplet will be placed in your account's default VPC for the region.
     */
    @JsonProperty(value = "private_networking")
    private Boolean privateNetworking;

    /*
     * A string specifying the UUID of the VPC to which the Droplet will be assigned. If excluded, the Droplet will be
     * assigned to your account's default VPC for the region.
     */
    @JsonProperty(value = "vpc_uuid")
    private String vpcUuid;

    /*
     * A boolean indicating whether to install the DigitalOcean agent used for providing access to the Droplet web
     * console in the control panel. By default, the agent is installed on new Droplets but installation errors (i.e.
     * OS not supported) are ignored. To prevent it from being installed, set to `false`. To make installation errors
     * fatal, explicitly set it to `true`.
     */
    @JsonProperty(value = "with_droplet_agent")
    private Boolean withDropletAgent;

    /**
     * Get the region property: The slug identifier for the region that you wish to deploy the Droplet in.
     * 
     * @return the region value.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The slug identifier for the region that you wish to deploy the Droplet in.
     * 
     * @param region the region value to set.
     * @return the DropletCreate object itself.
     */
    public DropletCreate setRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the size property: The slug identifier for the size that you wish to select for this Droplet.
     * 
     * @return the size value.
     */
    public String getSize() {
        return this.size;
    }

    /**
     * Set the size property: The slug identifier for the size that you wish to select for this Droplet.
     * 
     * @param size the size value to set.
     * @return the DropletCreate object itself.
     */
    public DropletCreate setSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the image property: The image ID of a public or private image or the slug identifier for a public image.
     * This image will be the base image for your Droplet.
     * 
     * @return the image value.
     */
    public Object getImage() {
        return this.image;
    }

    /**
     * Set the image property: The image ID of a public or private image or the slug identifier for a public image.
     * This image will be the base image for your Droplet.
     * 
     * @param image the image value to set.
     * @return the DropletCreate object itself.
     */
    public DropletCreate setImage(Object image) {
        this.image = image;
        return this;
    }

    /**
     * Get the sshKeys property: An array containing the IDs or fingerprints of the SSH keys that you wish to embed in
     * the Droplet's root account upon creation.
     * 
     * @return the sshKeys value.
     */
    public List<Object> getSshKeys() {
        return this.sshKeys;
    }

    /**
     * Set the sshKeys property: An array containing the IDs or fingerprints of the SSH keys that you wish to embed in
     * the Droplet's root account upon creation.
     * 
     * @param sshKeys the sshKeys value to set.
     * @return the DropletCreate object itself.
     */
    public DropletCreate setSshKeys(List<Object> sshKeys) {
        this.sshKeys = sshKeys;
        return this;
    }

    /**
     * Get the backups property: A boolean indicating whether automated backups should be enabled for the Droplet.
     * 
     * @return the backups value.
     */
    public Boolean isBackups() {
        return this.backups;
    }

    /**
     * Set the backups property: A boolean indicating whether automated backups should be enabled for the Droplet.
     * 
     * @param backups the backups value to set.
     * @return the DropletCreate object itself.
     */
    public DropletCreate setBackups(Boolean backups) {
        this.backups = backups;
        return this;
    }

    /**
     * Get the ipv6 property: A boolean indicating whether to enable IPv6 on the Droplet.
     * 
     * @return the ipv6 value.
     */
    public Boolean isIpv6() {
        return this.ipv6;
    }

    /**
     * Set the ipv6 property: A boolean indicating whether to enable IPv6 on the Droplet.
     * 
     * @param ipv6 the ipv6 value to set.
     * @return the DropletCreate object itself.
     */
    public DropletCreate setIpv6(Boolean ipv6) {
        this.ipv6 = ipv6;
        return this;
    }

    /**
     * Get the monitoring property: A boolean indicating whether to install the DigitalOcean agent for monitoring.
     * 
     * @return the monitoring value.
     */
    public Boolean isMonitoring() {
        return this.monitoring;
    }

    /**
     * Set the monitoring property: A boolean indicating whether to install the DigitalOcean agent for monitoring.
     * 
     * @param monitoring the monitoring value to set.
     * @return the DropletCreate object itself.
     */
    public DropletCreate setMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * Get the tags property: A flat array of tag names as strings to apply to the Droplet after it is created. Tag
     * names can either be existing or new tags.
     * 
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: A flat array of tag names as strings to apply to the Droplet after it is created. Tag
     * names can either be existing or new tags.
     * 
     * @param tags the tags value to set.
     * @return the DropletCreate object itself.
     */
    public DropletCreate setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the userData property: A string containing 'user data' which may be used to configure the Droplet on first
     * boot, often a 'cloud-config' file or Bash script. It must be plain text and may not exceed 64 KiB in size.
     * 
     * @return the userData value.
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * Set the userData property: A string containing 'user data' which may be used to configure the Droplet on first
     * boot, often a 'cloud-config' file or Bash script. It must be plain text and may not exceed 64 KiB in size.
     * 
     * @param userData the userData value to set.
     * @return the DropletCreate object itself.
     */
    public DropletCreate setUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Get the privateNetworking property: This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC
     * network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account's default VPC
     * for the region.
     * 
     * @return the privateNetworking value.
     */
    public Boolean isPrivateNetworking() {
        return this.privateNetworking;
    }

    /**
     * Set the privateNetworking property: This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC
     * network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account's default VPC
     * for the region.
     * 
     * @param privateNetworking the privateNetworking value to set.
     * @return the DropletCreate object itself.
     */
    public DropletCreate setPrivateNetworking(Boolean privateNetworking) {
        this.privateNetworking = privateNetworking;
        return this;
    }

    /**
     * Get the vpcUuid property: A string specifying the UUID of the VPC to which the Droplet will be assigned. If
     * excluded, the Droplet will be assigned to your account's default VPC for the region.
     * 
     * @return the vpcUuid value.
     */
    public String getVpcUuid() {
        return this.vpcUuid;
    }

    /**
     * Set the vpcUuid property: A string specifying the UUID of the VPC to which the Droplet will be assigned. If
     * excluded, the Droplet will be assigned to your account's default VPC for the region.
     * 
     * @param vpcUuid the vpcUuid value to set.
     * @return the DropletCreate object itself.
     */
    public DropletCreate setVpcUuid(String vpcUuid) {
        this.vpcUuid = vpcUuid;
        return this;
    }

    /**
     * Get the withDropletAgent property: A boolean indicating whether to install the DigitalOcean agent used for
     * providing access to the Droplet web console in the control panel. By default, the agent is installed on new
     * Droplets but installation errors (i.e. OS not supported) are ignored. To prevent it from being installed, set to
     * `false`. To make installation errors fatal, explicitly set it to `true`.
     * 
     * @return the withDropletAgent value.
     */
    public Boolean isWithDropletAgent() {
        return this.withDropletAgent;
    }

    /**
     * Set the withDropletAgent property: A boolean indicating whether to install the DigitalOcean agent used for
     * providing access to the Droplet web console in the control panel. By default, the agent is installed on new
     * Droplets but installation errors (i.e. OS not supported) are ignored. To prevent it from being installed, set to
     * `false`. To make installation errors fatal, explicitly set it to `true`.
     * 
     * @param withDropletAgent the withDropletAgent value to set.
     * @return the DropletCreate object itself.
     */
    public DropletCreate setWithDropletAgent(Boolean withDropletAgent) {
        this.withDropletAgent = withDropletAgent;
        return this;
    }
}
