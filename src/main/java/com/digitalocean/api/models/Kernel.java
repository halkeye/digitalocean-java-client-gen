package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * **Note**: All Droplets created after March 2017 use internal kernels by default.
 * These Droplets will have this attribute set to `null`.
 * 
 * The current [kernel](https://www.digitalocean.com/docs/droplets/how-to/kernel/)
 * for Droplets with externally managed kernels. This will initially be set to
 * the kernel of the base image when the Droplet is created.
 */
@Fluent
public final class Kernel {
    /*
     * A unique number used to identify and reference a specific kernel.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /*
     * The display name of the kernel. This is shown in the web UI and is generally a descriptive title for the kernel
     * in question.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A standard kernel version string representing the version, patch, and release information.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the id property: A unique number used to identify and reference a specific kernel.
     * 
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Set the id property: A unique number used to identify and reference a specific kernel.
     * 
     * @param id the id value to set.
     * @return the Kernel object itself.
     */
    public Kernel setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The display name of the kernel. This is shown in the web UI and is generally a
     * descriptive title for the kernel in question.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The display name of the kernel. This is shown in the web UI and is generally a
     * descriptive title for the kernel in question.
     * 
     * @param name the name value to set.
     * @return the Kernel object itself.
     */
    public Kernel setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version property: A standard kernel version string representing the version, patch, and release
     * information.
     * 
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: A standard kernel version string representing the version, patch, and release
     * information.
     * 
     * @param version the version value to set.
     * @return the Kernel object itself.
     */
    public Kernel setVersion(String version) {
        this.version = version;
        return this;
    }
}
