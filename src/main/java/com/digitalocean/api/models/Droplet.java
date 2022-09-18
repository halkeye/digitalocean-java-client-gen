package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The Droplet model.
 */
@Fluent
public final class Droplet {
    /*
     * A unique identifier for each Droplet instance. This is automatically generated upon Droplet creation.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /*
     * The human-readable name set for the Droplet instance.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Memory of the Droplet in megabytes.
     */
    @JsonProperty(value = "memory", required = true)
    private int memory;

    /*
     * The number of virtual CPUs.
     */
    @JsonProperty(value = "vcpus", required = true)
    private int vcpus;

    /*
     * The size of the Droplet's disk in gigabytes.
     */
    @JsonProperty(value = "disk", required = true)
    private int disk;

    /*
     * A boolean value indicating whether the Droplet has been locked, preventing actions by users.
     */
    @JsonProperty(value = "locked", required = true)
    private boolean locked;

    /*
     * A status string indicating the state of the Droplet instance. This may be "new", "active", "off", or "archive".
     */
    @JsonProperty(value = "status", required = true)
    private DropletStatus status;

    /*
     * **Note**: All Droplets created after March 2017 use internal kernels by default.
     * These Droplets will have this attribute set to `null`.
     * 
     * The current [kernel](https://www.digitalocean.com/docs/droplets/how-to/kernel/)
     * for Droplets with externally managed kernels. This will initially be set to
     * the kernel of the base image when the Droplet is created.
     * 
     */
    @JsonProperty(value = "kernel")
    private Kernel kernel;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the Droplet was created.
     */
    @JsonProperty(value = "created_at", required = true)
    private OffsetDateTime createdAt;

    /*
     * An array of features enabled on this Droplet.
     */
    @JsonProperty(value = "features", required = true)
    private List<String> features;

    /*
     * An array of backup IDs of any backups that have been taken of the Droplet instance.  Droplet backups are enabled
     * at the time of the instance creation.
     */
    @JsonProperty(value = "backup_ids", required = true)
    private List<Integer> backupIds;

    /*
     * The details of the Droplet's backups feature, if backups are configured for the Droplet. This object contains
     * keys for the start and end times of the window during which the backup will start.
     */
    @JsonProperty(value = "next_backup_window", required = true)
    private DropletNextBackupWindow nextBackupWindow;

    /*
     * An array of snapshot IDs of any snapshots created from the Droplet instance.
     */
    @JsonProperty(value = "snapshot_ids", required = true)
    private List<Integer> snapshotIds;

    /*
     * The image property.
     */
    @JsonProperty(value = "image", required = true)
    private Image image;

    /*
     * A flat array including the unique identifier for each Block Storage volume attached to the Droplet.
     */
    @JsonProperty(value = "volume_ids", required = true)
    private List<String> volumeIds;

    /*
     * The size property.
     */
    @JsonProperty(value = "size", required = true)
    private Size size;

    /*
     * The unique slug identifier for the size of this Droplet.
     */
    @JsonProperty(value = "size_slug", required = true)
    private String sizeSlug;

    /*
     * The details of the network that are configured for the Droplet instance.  This is an object that contains keys
     * for IPv4 and IPv6.  The value of each of these is an array that contains objects describing an individual IP
     * resource allocated to the Droplet.  These will define attributes like the IP address, netmask, and gateway of
     * the specific network depending on the type of network it is.
     */
    @JsonProperty(value = "networks", required = true)
    private DropletNetworks networks;

    /*
     * The region property.
     */
    @JsonProperty(value = "region", required = true)
    private Region region;

    /*
     * An array of Tags the Droplet has been tagged with.
     */
    @JsonProperty(value = "tags", required = true)
    private List<String> tags;

    /*
     * A string specifying the UUID of the VPC to which the Droplet is assigned.
     */
    @JsonProperty(value = "vpc_uuid")
    private String vpcUuid;

    /**
     * Get the id property: A unique identifier for each Droplet instance. This is automatically generated upon Droplet
     * creation.
     * 
     * @return the id value.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set the id property: A unique identifier for each Droplet instance. This is automatically generated upon Droplet
     * creation.
     * 
     * @param id the id value to set.
     * @return the Droplet object itself.
     */
    public Droplet setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The human-readable name set for the Droplet instance.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The human-readable name set for the Droplet instance.
     * 
     * @param name the name value to set.
     * @return the Droplet object itself.
     */
    public Droplet setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the memory property: Memory of the Droplet in megabytes.
     * 
     * @return the memory value.
     */
    public int getMemory() {
        return this.memory;
    }

    /**
     * Set the memory property: Memory of the Droplet in megabytes.
     * 
     * @param memory the memory value to set.
     * @return the Droplet object itself.
     */
    public Droplet setMemory(int memory) {
        this.memory = memory;
        return this;
    }

    /**
     * Get the vcpus property: The number of virtual CPUs.
     * 
     * @return the vcpus value.
     */
    public int getVcpus() {
        return this.vcpus;
    }

    /**
     * Set the vcpus property: The number of virtual CPUs.
     * 
     * @param vcpus the vcpus value to set.
     * @return the Droplet object itself.
     */
    public Droplet setVcpus(int vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * Get the disk property: The size of the Droplet's disk in gigabytes.
     * 
     * @return the disk value.
     */
    public int getDisk() {
        return this.disk;
    }

    /**
     * Set the disk property: The size of the Droplet's disk in gigabytes.
     * 
     * @param disk the disk value to set.
     * @return the Droplet object itself.
     */
    public Droplet setDisk(int disk) {
        this.disk = disk;
        return this;
    }

    /**
     * Get the locked property: A boolean value indicating whether the Droplet has been locked, preventing actions by
     * users.
     * 
     * @return the locked value.
     */
    public boolean isLocked() {
        return this.locked;
    }

    /**
     * Set the locked property: A boolean value indicating whether the Droplet has been locked, preventing actions by
     * users.
     * 
     * @param locked the locked value to set.
     * @return the Droplet object itself.
     */
    public Droplet setLocked(boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * Get the status property: A status string indicating the state of the Droplet instance. This may be "new",
     * "active", "off", or "archive".
     * 
     * @return the status value.
     */
    public DropletStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: A status string indicating the state of the Droplet instance. This may be "new",
     * "active", "off", or "archive".
     * 
     * @param status the status value to set.
     * @return the Droplet object itself.
     */
    public Droplet setStatus(DropletStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the kernel property: **Note**: All Droplets created after March 2017 use internal kernels by default.
     * These Droplets will have this attribute set to `null`.
     * 
     * The current [kernel](https://www.digitalocean.com/docs/droplets/how-to/kernel/)
     * for Droplets with externally managed kernels. This will initially be set to
     * the kernel of the base image when the Droplet is created.
     * 
     * @return the kernel value.
     */
    public Kernel getKernel() {
        return this.kernel;
    }

    /**
     * Set the kernel property: **Note**: All Droplets created after March 2017 use internal kernels by default.
     * These Droplets will have this attribute set to `null`.
     * 
     * The current [kernel](https://www.digitalocean.com/docs/droplets/how-to/kernel/)
     * for Droplets with externally managed kernels. This will initially be set to
     * the kernel of the base image when the Droplet is created.
     * 
     * @param kernel the kernel value to set.
     * @return the Droplet object itself.
     */
    public Droplet setKernel(Kernel kernel) {
        this.kernel = kernel;
        return this;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * Droplet was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * Droplet was created.
     * 
     * @param createdAt the createdAt value to set.
     * @return the Droplet object itself.
     */
    public Droplet setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the features property: An array of features enabled on this Droplet.
     * 
     * @return the features value.
     */
    public List<String> getFeatures() {
        return this.features;
    }

    /**
     * Set the features property: An array of features enabled on this Droplet.
     * 
     * @param features the features value to set.
     * @return the Droplet object itself.
     */
    public Droplet setFeatures(List<String> features) {
        this.features = features;
        return this;
    }

    /**
     * Get the backupIds property: An array of backup IDs of any backups that have been taken of the Droplet instance. 
     * Droplet backups are enabled at the time of the instance creation.
     * 
     * @return the backupIds value.
     */
    public List<Integer> getBackupIds() {
        return this.backupIds;
    }

    /**
     * Set the backupIds property: An array of backup IDs of any backups that have been taken of the Droplet instance. 
     * Droplet backups are enabled at the time of the instance creation.
     * 
     * @param backupIds the backupIds value to set.
     * @return the Droplet object itself.
     */
    public Droplet setBackupIds(List<Integer> backupIds) {
        this.backupIds = backupIds;
        return this;
    }

    /**
     * Get the nextBackupWindow property: The details of the Droplet's backups feature, if backups are configured for
     * the Droplet. This object contains keys for the start and end times of the window during which the backup will
     * start.
     * 
     * @return the nextBackupWindow value.
     */
    public DropletNextBackupWindow getNextBackupWindow() {
        return this.nextBackupWindow;
    }

    /**
     * Set the nextBackupWindow property: The details of the Droplet's backups feature, if backups are configured for
     * the Droplet. This object contains keys for the start and end times of the window during which the backup will
     * start.
     * 
     * @param nextBackupWindow the nextBackupWindow value to set.
     * @return the Droplet object itself.
     */
    public Droplet setNextBackupWindow(DropletNextBackupWindow nextBackupWindow) {
        this.nextBackupWindow = nextBackupWindow;
        return this;
    }

    /**
     * Get the snapshotIds property: An array of snapshot IDs of any snapshots created from the Droplet instance.
     * 
     * @return the snapshotIds value.
     */
    public List<Integer> getSnapshotIds() {
        return this.snapshotIds;
    }

    /**
     * Set the snapshotIds property: An array of snapshot IDs of any snapshots created from the Droplet instance.
     * 
     * @param snapshotIds the snapshotIds value to set.
     * @return the Droplet object itself.
     */
    public Droplet setSnapshotIds(List<Integer> snapshotIds) {
        this.snapshotIds = snapshotIds;
        return this;
    }

    /**
     * Get the image property: The image property.
     * 
     * @return the image value.
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * Set the image property: The image property.
     * 
     * @param image the image value to set.
     * @return the Droplet object itself.
     */
    public Droplet setImage(Image image) {
        this.image = image;
        return this;
    }

    /**
     * Get the volumeIds property: A flat array including the unique identifier for each Block Storage volume attached
     * to the Droplet.
     * 
     * @return the volumeIds value.
     */
    public List<String> getVolumeIds() {
        return this.volumeIds;
    }

    /**
     * Set the volumeIds property: A flat array including the unique identifier for each Block Storage volume attached
     * to the Droplet.
     * 
     * @param volumeIds the volumeIds value to set.
     * @return the Droplet object itself.
     */
    public Droplet setVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    /**
     * Get the size property: The size property.
     * 
     * @return the size value.
     */
    public Size getSize() {
        return this.size;
    }

    /**
     * Set the size property: The size property.
     * 
     * @param size the size value to set.
     * @return the Droplet object itself.
     */
    public Droplet setSize(Size size) {
        this.size = size;
        return this;
    }

    /**
     * Get the sizeSlug property: The unique slug identifier for the size of this Droplet.
     * 
     * @return the sizeSlug value.
     */
    public String getSizeSlug() {
        return this.sizeSlug;
    }

    /**
     * Set the sizeSlug property: The unique slug identifier for the size of this Droplet.
     * 
     * @param sizeSlug the sizeSlug value to set.
     * @return the Droplet object itself.
     */
    public Droplet setSizeSlug(String sizeSlug) {
        this.sizeSlug = sizeSlug;
        return this;
    }

    /**
     * Get the networks property: The details of the network that are configured for the Droplet instance.  This is an
     * object that contains keys for IPv4 and IPv6.  The value of each of these is an array that contains objects
     * describing an individual IP resource allocated to the Droplet.  These will define attributes like the IP
     * address, netmask, and gateway of the specific network depending on the type of network it is.
     * 
     * @return the networks value.
     */
    public DropletNetworks getNetworks() {
        return this.networks;
    }

    /**
     * Set the networks property: The details of the network that are configured for the Droplet instance.  This is an
     * object that contains keys for IPv4 and IPv6.  The value of each of these is an array that contains objects
     * describing an individual IP resource allocated to the Droplet.  These will define attributes like the IP
     * address, netmask, and gateway of the specific network depending on the type of network it is.
     * 
     * @param networks the networks value to set.
     * @return the Droplet object itself.
     */
    public Droplet setNetworks(DropletNetworks networks) {
        this.networks = networks;
        return this;
    }

    /**
     * Get the region property: The region property.
     * 
     * @return the region value.
     */
    public Region getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The region property.
     * 
     * @param region the region value to set.
     * @return the Droplet object itself.
     */
    public Droplet setRegion(Region region) {
        this.region = region;
        return this;
    }

    /**
     * Get the tags property: An array of Tags the Droplet has been tagged with.
     * 
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: An array of Tags the Droplet has been tagged with.
     * 
     * @param tags the tags value to set.
     * @return the Droplet object itself.
     */
    public Droplet setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the vpcUuid property: A string specifying the UUID of the VPC to which the Droplet is assigned.
     * 
     * @return the vpcUuid value.
     */
    public String getVpcUuid() {
        return this.vpcUuid;
    }

    /**
     * Set the vpcUuid property: A string specifying the UUID of the VPC to which the Droplet is assigned.
     * 
     * @param vpcUuid the vpcUuid value to set.
     * @return the Droplet object itself.
     */
    public Droplet setVpcUuid(String vpcUuid) {
        this.vpcUuid = vpcUuid;
        return this;
    }
}
