package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppsInstanceSize model. */
@Fluent
public final class AppsInstanceSize {
    /*
     * - SHARED: Shared vCPU cores
     * - DEDICATED: Dedicated vCPU cores
     */
    @JsonProperty(value = "cpu_type")
    private InstanceSizeCpuType cpuType;

    /*
     * The number of allotted vCPU cores
     */
    @JsonProperty(value = "cpus")
    private String cpus;

    /*
     * The allotted memory in bytes
     */
    @JsonProperty(value = "memory_bytes")
    private String memoryBytes;

    /*
     * A human-readable name of the instance size
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The slug of the instance size
     */
    @JsonProperty(value = "slug")
    private String slug;

    /*
     * The slug of the corresponding downgradable instance size on the lower tier
     */
    @JsonProperty(value = "tier_downgrade_to")
    private String tierDowngradeTo;

    /*
     * The slug of the tier to which this instance size belongs
     */
    @JsonProperty(value = "tier_slug")
    private String tierSlug;

    /*
     * The slug of the corresponding upgradable instance size on the higher tier
     */
    @JsonProperty(value = "tier_upgrade_to")
    private String tierUpgradeTo;

    /*
     * The cost of this instance size in USD per month
     */
    @JsonProperty(value = "usd_per_month")
    private String usdPerMonth;

    /*
     * The cost of this instance size in USD per second
     */
    @JsonProperty(value = "usd_per_second")
    private String usdPerSecond;

    /**
     * Get the cpuType property: - SHARED: Shared vCPU cores - DEDICATED: Dedicated vCPU cores.
     *
     * @return the cpuType value.
     */
    public InstanceSizeCpuType getCpuType() {
        return this.cpuType;
    }

    /**
     * Set the cpuType property: - SHARED: Shared vCPU cores - DEDICATED: Dedicated vCPU cores.
     *
     * @param cpuType the cpuType value to set.
     * @return the AppsInstanceSize object itself.
     */
    public AppsInstanceSize setCpuType(InstanceSizeCpuType cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    /**
     * Get the cpus property: The number of allotted vCPU cores.
     *
     * @return the cpus value.
     */
    public String getCpus() {
        return this.cpus;
    }

    /**
     * Set the cpus property: The number of allotted vCPU cores.
     *
     * @param cpus the cpus value to set.
     * @return the AppsInstanceSize object itself.
     */
    public AppsInstanceSize setCpus(String cpus) {
        this.cpus = cpus;
        return this;
    }

    /**
     * Get the memoryBytes property: The allotted memory in bytes.
     *
     * @return the memoryBytes value.
     */
    public String getMemoryBytes() {
        return this.memoryBytes;
    }

    /**
     * Set the memoryBytes property: The allotted memory in bytes.
     *
     * @param memoryBytes the memoryBytes value to set.
     * @return the AppsInstanceSize object itself.
     */
    public AppsInstanceSize setMemoryBytes(String memoryBytes) {
        this.memoryBytes = memoryBytes;
        return this;
    }

    /**
     * Get the name property: A human-readable name of the instance size.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A human-readable name of the instance size.
     *
     * @param name the name value to set.
     * @return the AppsInstanceSize object itself.
     */
    public AppsInstanceSize setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the slug property: The slug of the instance size.
     *
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: The slug of the instance size.
     *
     * @param slug the slug value to set.
     * @return the AppsInstanceSize object itself.
     */
    public AppsInstanceSize setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get the tierDowngradeTo property: The slug of the corresponding downgradable instance size on the lower tier.
     *
     * @return the tierDowngradeTo value.
     */
    public String getTierDowngradeTo() {
        return this.tierDowngradeTo;
    }

    /**
     * Set the tierDowngradeTo property: The slug of the corresponding downgradable instance size on the lower tier.
     *
     * @param tierDowngradeTo the tierDowngradeTo value to set.
     * @return the AppsInstanceSize object itself.
     */
    public AppsInstanceSize setTierDowngradeTo(String tierDowngradeTo) {
        this.tierDowngradeTo = tierDowngradeTo;
        return this;
    }

    /**
     * Get the tierSlug property: The slug of the tier to which this instance size belongs.
     *
     * @return the tierSlug value.
     */
    public String getTierSlug() {
        return this.tierSlug;
    }

    /**
     * Set the tierSlug property: The slug of the tier to which this instance size belongs.
     *
     * @param tierSlug the tierSlug value to set.
     * @return the AppsInstanceSize object itself.
     */
    public AppsInstanceSize setTierSlug(String tierSlug) {
        this.tierSlug = tierSlug;
        return this;
    }

    /**
     * Get the tierUpgradeTo property: The slug of the corresponding upgradable instance size on the higher tier.
     *
     * @return the tierUpgradeTo value.
     */
    public String getTierUpgradeTo() {
        return this.tierUpgradeTo;
    }

    /**
     * Set the tierUpgradeTo property: The slug of the corresponding upgradable instance size on the higher tier.
     *
     * @param tierUpgradeTo the tierUpgradeTo value to set.
     * @return the AppsInstanceSize object itself.
     */
    public AppsInstanceSize setTierUpgradeTo(String tierUpgradeTo) {
        this.tierUpgradeTo = tierUpgradeTo;
        return this;
    }

    /**
     * Get the usdPerMonth property: The cost of this instance size in USD per month.
     *
     * @return the usdPerMonth value.
     */
    public String getUsdPerMonth() {
        return this.usdPerMonth;
    }

    /**
     * Set the usdPerMonth property: The cost of this instance size in USD per month.
     *
     * @param usdPerMonth the usdPerMonth value to set.
     * @return the AppsInstanceSize object itself.
     */
    public AppsInstanceSize setUsdPerMonth(String usdPerMonth) {
        this.usdPerMonth = usdPerMonth;
        return this;
    }

    /**
     * Get the usdPerSecond property: The cost of this instance size in USD per second.
     *
     * @return the usdPerSecond value.
     */
    public String getUsdPerSecond() {
        return this.usdPerSecond;
    }

    /**
     * Set the usdPerSecond property: The cost of this instance size in USD per second.
     *
     * @param usdPerSecond the usdPerSecond value to set.
     * @return the AppsInstanceSize object itself.
     */
    public AppsInstanceSize setUsdPerSecond(String usdPerSecond) {
        this.usdPerSecond = usdPerSecond;
        return this;
    }
}
