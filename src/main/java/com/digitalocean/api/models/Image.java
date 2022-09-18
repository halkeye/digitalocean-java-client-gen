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
 * The Image model.
 */
@Fluent
public final class Image {
    /*
     * A unique number that can be used to identify and reference a specific image.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private Integer id;

    /*
     * The display name that has been given to an image.  This is what is shown in the control panel and is generally a
     * descriptive title for the image in question.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Describes the kind of image. It may be one of `base`, `snapshot`, `backup`, `custom`, or `admin`. Respectively,
     * this specifies whether an image is a DigitalOcean base OS image, user-generated Droplet snapshot, automatically
     * created Droplet backup, user-provided virtual machine image, or an image used for DigitalOcean managed resources
     * (e.g. DOKS worker nodes).
     */
    @JsonProperty(value = "type")
    private ImageType type;

    /*
     * The name of a custom image's distribution. Currently, the valid values are  `Arch Linux`, `CentOS`, `CoreOS`,
     * `Debian`, `Fedora`, `Fedora Atomic`,  `FreeBSD`, `Gentoo`, `openSUSE`, `RancherOS`, `Rocky Linux`, `Ubuntu`, and
     * `Unknown`.  Any other value will be accepted but ignored, and `Unknown` will be used in its place.
     */
    @JsonProperty(value = "distribution")
    private Distribution distribution;

    /*
     * A uniquely identifying string that is associated with each of the DigitalOcean-provided public images. These can
     * be used to reference a public image as an alternative to the numeric id.
     */
    @JsonProperty(value = "slug")
    private String slug;

    /*
     * This is a boolean value that indicates whether the image in question is public or not. An image that is public
     * is available to all accounts. A non-public image is only accessible from your account.
     */
    @JsonProperty(value = "public")
    private Boolean publicProperty;

    /*
     * This attribute is an array of the regions that the image is available in. The regions are represented by their
     * identifying slug values.
     */
    @JsonProperty(value = "regions")
    private List<RegionSlug> regions;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the image was created.
     */
    @JsonProperty(value = "created_at")
    private OffsetDateTime createdAt;

    /*
     * The minimum disk size in GB required for a Droplet to use this image.
     */
    @JsonProperty(value = "min_disk_size")
    private Integer minDiskSize;

    /*
     * The size of the image in gigabytes.
     */
    @JsonProperty(value = "size_gigabytes")
    private Float sizeGigabytes;

    /*
     * An optional free-form text field to describe an image.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * A flat array of tag names as strings to be applied to the resource. Tag names may be for either existing or new
     * tags.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /*
     * A status string indicating the state of a custom image. This may be `NEW`,
     * `available`, `pending`, `deleted`, or `retired`.
     */
    @JsonProperty(value = "status")
    private ImageStatus status;

    /*
     * A string containing information about errors that may occur when importing
     * a custom image.
     */
    @JsonProperty(value = "error_message")
    private String errorMessage;

    /**
     * Get the id property: A unique number that can be used to identify and reference a specific image.
     * 
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Get the name property: The display name that has been given to an image.  This is what is shown in the control
     * panel and is generally a descriptive title for the image in question.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The display name that has been given to an image.  This is what is shown in the control
     * panel and is generally a descriptive title for the image in question.
     * 
     * @param name the name value to set.
     * @return the Image object itself.
     */
    public Image setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Describes the kind of image. It may be one of `base`, `snapshot`, `backup`, `custom`, or
     * `admin`. Respectively, this specifies whether an image is a DigitalOcean base OS image, user-generated Droplet
     * snapshot, automatically created Droplet backup, user-provided virtual machine image, or an image used for
     * DigitalOcean managed resources (e.g. DOKS worker nodes).
     * 
     * @return the type value.
     */
    public ImageType getType() {
        return this.type;
    }

    /**
     * Set the type property: Describes the kind of image. It may be one of `base`, `snapshot`, `backup`, `custom`, or
     * `admin`. Respectively, this specifies whether an image is a DigitalOcean base OS image, user-generated Droplet
     * snapshot, automatically created Droplet backup, user-provided virtual machine image, or an image used for
     * DigitalOcean managed resources (e.g. DOKS worker nodes).
     * 
     * @param type the type value to set.
     * @return the Image object itself.
     */
    public Image setType(ImageType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the distribution property: The name of a custom image's distribution. Currently, the valid values are  `Arch
     * Linux`, `CentOS`, `CoreOS`, `Debian`, `Fedora`, `Fedora Atomic`,  `FreeBSD`, `Gentoo`, `openSUSE`, `RancherOS`,
     * `Rocky Linux`, `Ubuntu`, and `Unknown`.  Any other value will be accepted but ignored, and `Unknown` will be
     * used in its place.
     * 
     * @return the distribution value.
     */
    public Distribution getDistribution() {
        return this.distribution;
    }

    /**
     * Set the distribution property: The name of a custom image's distribution. Currently, the valid values are  `Arch
     * Linux`, `CentOS`, `CoreOS`, `Debian`, `Fedora`, `Fedora Atomic`,  `FreeBSD`, `Gentoo`, `openSUSE`, `RancherOS`,
     * `Rocky Linux`, `Ubuntu`, and `Unknown`.  Any other value will be accepted but ignored, and `Unknown` will be
     * used in its place.
     * 
     * @param distribution the distribution value to set.
     * @return the Image object itself.
     */
    public Image setDistribution(Distribution distribution) {
        this.distribution = distribution;
        return this;
    }

    /**
     * Get the slug property: A uniquely identifying string that is associated with each of the DigitalOcean-provided
     * public images. These can be used to reference a public image as an alternative to the numeric id.
     * 
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: A uniquely identifying string that is associated with each of the DigitalOcean-provided
     * public images. These can be used to reference a public image as an alternative to the numeric id.
     * 
     * @param slug the slug value to set.
     * @return the Image object itself.
     */
    public Image setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get the publicProperty property: This is a boolean value that indicates whether the image in question is public
     * or not. An image that is public is available to all accounts. A non-public image is only accessible from your
     * account.
     * 
     * @return the publicProperty value.
     */
    public Boolean isPublicProperty() {
        return this.publicProperty;
    }

    /**
     * Set the publicProperty property: This is a boolean value that indicates whether the image in question is public
     * or not. An image that is public is available to all accounts. A non-public image is only accessible from your
     * account.
     * 
     * @param publicProperty the publicProperty value to set.
     * @return the Image object itself.
     */
    public Image setPublicProperty(Boolean publicProperty) {
        this.publicProperty = publicProperty;
        return this;
    }

    /**
     * Get the regions property: This attribute is an array of the regions that the image is available in. The regions
     * are represented by their identifying slug values.
     * 
     * @return the regions value.
     */
    public List<RegionSlug> getRegions() {
        return this.regions;
    }

    /**
     * Set the regions property: This attribute is an array of the regions that the image is available in. The regions
     * are represented by their identifying slug values.
     * 
     * @param regions the regions value to set.
     * @return the Image object itself.
     */
    public Image setRegions(List<RegionSlug> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Get the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * image was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: A time value given in ISO8601 combined date and time format that represents when the
     * image was created.
     * 
     * @param createdAt the createdAt value to set.
     * @return the Image object itself.
     */
    public Image setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the minDiskSize property: The minimum disk size in GB required for a Droplet to use this image.
     * 
     * @return the minDiskSize value.
     */
    public Integer getMinDiskSize() {
        return this.minDiskSize;
    }

    /**
     * Set the minDiskSize property: The minimum disk size in GB required for a Droplet to use this image.
     * 
     * @param minDiskSize the minDiskSize value to set.
     * @return the Image object itself.
     */
    public Image setMinDiskSize(Integer minDiskSize) {
        this.minDiskSize = minDiskSize;
        return this;
    }

    /**
     * Get the sizeGigabytes property: The size of the image in gigabytes.
     * 
     * @return the sizeGigabytes value.
     */
    public Float getSizeGigabytes() {
        return this.sizeGigabytes;
    }

    /**
     * Set the sizeGigabytes property: The size of the image in gigabytes.
     * 
     * @param sizeGigabytes the sizeGigabytes value to set.
     * @return the Image object itself.
     */
    public Image setSizeGigabytes(Float sizeGigabytes) {
        this.sizeGigabytes = sizeGigabytes;
        return this;
    }

    /**
     * Get the description property: An optional free-form text field to describe an image.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: An optional free-form text field to describe an image.
     * 
     * @param description the description value to set.
     * @return the Image object itself.
     */
    public Image setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the tags property: A flat array of tag names as strings to be applied to the resource. Tag names may be for
     * either existing or new tags.
     * 
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: A flat array of tag names as strings to be applied to the resource. Tag names may be for
     * either existing or new tags.
     * 
     * @param tags the tags value to set.
     * @return the Image object itself.
     */
    public Image setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the status property: A status string indicating the state of a custom image. This may be `NEW`,
     * `available`, `pending`, `deleted`, or `retired`.
     * 
     * @return the status value.
     */
    public ImageStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: A status string indicating the state of a custom image. This may be `NEW`,
     * `available`, `pending`, `deleted`, or `retired`.
     * 
     * @param status the status value to set.
     * @return the Image object itself.
     */
    public Image setStatus(ImageStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the errorMessage property: A string containing information about errors that may occur when importing
     * a custom image.
     * 
     * @return the errorMessage value.
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: A string containing information about errors that may occur when importing
     * a custom image.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the Image object itself.
     */
    public Image setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
}
