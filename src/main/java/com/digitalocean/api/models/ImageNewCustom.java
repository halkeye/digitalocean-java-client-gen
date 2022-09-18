package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The ImageNewCustom model.
 */
@Fluent
public final class ImageNewCustom extends ImageUpdate {
    /*
     * A URL from which the custom Linux virtual machine image may be retrieved.  The image it points to must be in the
     * raw, qcow2, vhdx, vdi, or vmdk format.  It may be compressed using gzip or bzip2 and must be smaller than 100 GB
     * after being decompressed.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /*
     * The slug identifier for the region where the resource will initially be  available.
     */
    @JsonProperty(value = "region", required = true)
    private RegionSlug region;

    /*
     * A flat array of tag names as strings to be applied to the resource. Tag names may be for either existing or new
     * tags.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /**
     * Get the url property: A URL from which the custom Linux virtual machine image may be retrieved.  The image it
     * points to must be in the raw, qcow2, vhdx, vdi, or vmdk format.  It may be compressed using gzip or bzip2 and
     * must be smaller than 100 GB after being decompressed.
     * 
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: A URL from which the custom Linux virtual machine image may be retrieved.  The image it
     * points to must be in the raw, qcow2, vhdx, vdi, or vmdk format.  It may be compressed using gzip or bzip2 and
     * must be smaller than 100 GB after being decompressed.
     * 
     * @param url the url value to set.
     * @return the ImageNewCustom object itself.
     */
    public ImageNewCustom setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the region property: The slug identifier for the region where the resource will initially be  available.
     * 
     * @return the region value.
     */
    public RegionSlug getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The slug identifier for the region where the resource will initially be  available.
     * 
     * @param region the region value to set.
     * @return the ImageNewCustom object itself.
     */
    public ImageNewCustom setRegion(RegionSlug region) {
        this.region = region;
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
     * @return the ImageNewCustom object itself.
     */
    public ImageNewCustom setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageNewCustom setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageNewCustom setDistribution(Distribution distribution) {
        super.setDistribution(distribution);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageNewCustom setDescription(String description) {
        super.setDescription(description);
        return this;
    }
}
