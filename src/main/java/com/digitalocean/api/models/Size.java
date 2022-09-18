package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Size model.
 */
@Fluent
public final class Size {
    /*
     * A human-readable string that is used to uniquely identify each size.
     */
    @JsonProperty(value = "slug", required = true)
    private String slug;

    /*
     * The amount of RAM allocated to Droplets created of this size. The value is represented in megabytes.
     */
    @JsonProperty(value = "memory", required = true)
    private int memory;

    /*
     * The integer of number CPUs allocated to Droplets of this size.
     */
    @JsonProperty(value = "vcpus", required = true)
    private int vcpus;

    /*
     * The amount of disk space set aside for Droplets of this size. The value is represented in gigabytes.
     */
    @JsonProperty(value = "disk", required = true)
    private int disk;

    /*
     * The amount of transfer bandwidth that is available for Droplets created in this size. This only counts traffic
     * on the public interface. The value is given in terabytes.
     */
    @JsonProperty(value = "transfer", required = true)
    private float transfer;

    /*
     * This attribute describes the monthly cost of this Droplet size if the Droplet is kept for an entire month. The
     * value is measured in US dollars.
     */
    @JsonProperty(value = "price_monthly", required = true)
    private float priceMonthly;

    /*
     * This describes the price of the Droplet size as measured hourly. The value is measured in US dollars.
     */
    @JsonProperty(value = "price_hourly", required = true)
    private float priceHourly;

    /*
     * An array containing the region slugs where this size is available for Droplet creates.
     */
    @JsonProperty(value = "regions", required = true)
    private List<String> regions;

    /*
     * This is a boolean value that represents whether new Droplets can be created with this size.
     */
    @JsonProperty(value = "available", required = true)
    private boolean available;

    /*
     * A string describing the class of Droplets created from this size. For example: Basic, General Purpose,
     * CPU-Optimized, Memory-Optimized, or Storage-Optimized.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * Get the slug property: A human-readable string that is used to uniquely identify each size.
     * 
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: A human-readable string that is used to uniquely identify each size.
     * 
     * @param slug the slug value to set.
     * @return the Size object itself.
     */
    public Size setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get the memory property: The amount of RAM allocated to Droplets created of this size. The value is represented
     * in megabytes.
     * 
     * @return the memory value.
     */
    public int getMemory() {
        return this.memory;
    }

    /**
     * Set the memory property: The amount of RAM allocated to Droplets created of this size. The value is represented
     * in megabytes.
     * 
     * @param memory the memory value to set.
     * @return the Size object itself.
     */
    public Size setMemory(int memory) {
        this.memory = memory;
        return this;
    }

    /**
     * Get the vcpus property: The integer of number CPUs allocated to Droplets of this size.
     * 
     * @return the vcpus value.
     */
    public int getVcpus() {
        return this.vcpus;
    }

    /**
     * Set the vcpus property: The integer of number CPUs allocated to Droplets of this size.
     * 
     * @param vcpus the vcpus value to set.
     * @return the Size object itself.
     */
    public Size setVcpus(int vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * Get the disk property: The amount of disk space set aside for Droplets of this size. The value is represented in
     * gigabytes.
     * 
     * @return the disk value.
     */
    public int getDisk() {
        return this.disk;
    }

    /**
     * Set the disk property: The amount of disk space set aside for Droplets of this size. The value is represented in
     * gigabytes.
     * 
     * @param disk the disk value to set.
     * @return the Size object itself.
     */
    public Size setDisk(int disk) {
        this.disk = disk;
        return this;
    }

    /**
     * Get the transfer property: The amount of transfer bandwidth that is available for Droplets created in this size.
     * This only counts traffic on the public interface. The value is given in terabytes.
     * 
     * @return the transfer value.
     */
    public float getTransfer() {
        return this.transfer;
    }

    /**
     * Set the transfer property: The amount of transfer bandwidth that is available for Droplets created in this size.
     * This only counts traffic on the public interface. The value is given in terabytes.
     * 
     * @param transfer the transfer value to set.
     * @return the Size object itself.
     */
    public Size setTransfer(float transfer) {
        this.transfer = transfer;
        return this;
    }

    /**
     * Get the priceMonthly property: This attribute describes the monthly cost of this Droplet size if the Droplet is
     * kept for an entire month. The value is measured in US dollars.
     * 
     * @return the priceMonthly value.
     */
    public float getPriceMonthly() {
        return this.priceMonthly;
    }

    /**
     * Set the priceMonthly property: This attribute describes the monthly cost of this Droplet size if the Droplet is
     * kept for an entire month. The value is measured in US dollars.
     * 
     * @param priceMonthly the priceMonthly value to set.
     * @return the Size object itself.
     */
    public Size setPriceMonthly(float priceMonthly) {
        this.priceMonthly = priceMonthly;
        return this;
    }

    /**
     * Get the priceHourly property: This describes the price of the Droplet size as measured hourly. The value is
     * measured in US dollars.
     * 
     * @return the priceHourly value.
     */
    public float getPriceHourly() {
        return this.priceHourly;
    }

    /**
     * Set the priceHourly property: This describes the price of the Droplet size as measured hourly. The value is
     * measured in US dollars.
     * 
     * @param priceHourly the priceHourly value to set.
     * @return the Size object itself.
     */
    public Size setPriceHourly(float priceHourly) {
        this.priceHourly = priceHourly;
        return this;
    }

    /**
     * Get the regions property: An array containing the region slugs where this size is available for Droplet creates.
     * 
     * @return the regions value.
     */
    public List<String> getRegions() {
        return this.regions;
    }

    /**
     * Set the regions property: An array containing the region slugs where this size is available for Droplet creates.
     * 
     * @param regions the regions value to set.
     * @return the Size object itself.
     */
    public Size setRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Get the available property: This is a boolean value that represents whether new Droplets can be created with
     * this size.
     * 
     * @return the available value.
     */
    public boolean isAvailable() {
        return this.available;
    }

    /**
     * Set the available property: This is a boolean value that represents whether new Droplets can be created with
     * this size.
     * 
     * @param available the available value to set.
     * @return the Size object itself.
     */
    public Size setAvailable(boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Get the description property: A string describing the class of Droplets created from this size. For example:
     * Basic, General Purpose, CPU-Optimized, Memory-Optimized, or Storage-Optimized.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: A string describing the class of Droplets created from this size. For example:
     * Basic, General Purpose, CPU-Optimized, Memory-Optimized, or Storage-Optimized.
     * 
     * @param description the description value to set.
     * @return the Size object itself.
     */
    public Size setDescription(String description) {
        this.description = description;
        return this;
    }
}
