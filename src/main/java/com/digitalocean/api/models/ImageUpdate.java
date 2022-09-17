package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ImageUpdate model. */
@Fluent
public class ImageUpdate {
    /*
     * The display name that has been given to an image.  This is what is shown in the control panel and is generally a
     * descriptive title for the image in question.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The name of a custom image's distribution. Currently, the valid values are  `Arch Linux`, `CentOS`, `CoreOS`,
     * `Debian`, `Fedora`, `Fedora Atomic`,  `FreeBSD`, `Gentoo`, `openSUSE`, `RancherOS`, `Rocky Linux`, `Ubuntu`, and
     * `Unknown`.  Any other value will be accepted but ignored, and `Unknown` will be used in its place.
     */
    @JsonProperty(value = "distribution")
    private Distribution distribution;

    /*
     * An optional free-form text field to describe an image.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the name property: The display name that has been given to an image. This is what is shown in the control
     * panel and is generally a descriptive title for the image in question.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The display name that has been given to an image. This is what is shown in the control
     * panel and is generally a descriptive title for the image in question.
     *
     * @param name the name value to set.
     * @return the ImageUpdate object itself.
     */
    public ImageUpdate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the distribution property: The name of a custom image's distribution. Currently, the valid values are `Arch
     * Linux`, `CentOS`, `CoreOS`, `Debian`, `Fedora`, `Fedora Atomic`, `FreeBSD`, `Gentoo`, `openSUSE`, `RancherOS`,
     * `Rocky Linux`, `Ubuntu`, and `Unknown`. Any other value will be accepted but ignored, and `Unknown` will be used
     * in its place.
     *
     * @return the distribution value.
     */
    public Distribution getDistribution() {
        return this.distribution;
    }

    /**
     * Set the distribution property: The name of a custom image's distribution. Currently, the valid values are `Arch
     * Linux`, `CentOS`, `CoreOS`, `Debian`, `Fedora`, `Fedora Atomic`, `FreeBSD`, `Gentoo`, `openSUSE`, `RancherOS`,
     * `Rocky Linux`, `Ubuntu`, and `Unknown`. Any other value will be accepted but ignored, and `Unknown` will be used
     * in its place.
     *
     * @param distribution the distribution value to set.
     * @return the ImageUpdate object itself.
     */
    public ImageUpdate setDistribution(Distribution distribution) {
        this.distribution = distribution;
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
     * @return the ImageUpdate object itself.
     */
    public ImageUpdate setDescription(String description) {
        this.description = description;
        return this;
    }
}
