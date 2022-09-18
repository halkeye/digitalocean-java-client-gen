package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * An embedded object containing key value pairs of resource type and resource statistics. It also includes a count of
 * the total number of resources tagged with the current tag as well as a `last_tagged_uri` attribute set to the last
 * resource tagged with the current tag.
 */
@Fluent
public final class TagsResources extends TagsMetadata {
    /*
     * Tagged Resource Statistics include metadata regarding the resource type that has been tagged.
     */
    @JsonProperty(value = "droplets")
    private TagsMetadata droplets;

    /*
     * Tagged Resource Statistics include metadata regarding the resource type that has been tagged.
     */
    @JsonProperty(value = "imgages")
    private TagsMetadata imgages;

    /*
     * Tagged Resource Statistics include metadata regarding the resource type that has been tagged.
     */
    @JsonProperty(value = "volumes")
    private TagsMetadata volumes;

    /*
     * Tagged Resource Statistics include metadata regarding the resource type that has been tagged.
     */
    @JsonProperty(value = "volume_snapshots")
    private TagsMetadata volumeSnapshots;

    /*
     * Tagged Resource Statistics include metadata regarding the resource type that has been tagged.
     */
    @JsonProperty(value = "databases")
    private TagsMetadata databases;

    /**
     * Get the droplets property: Tagged Resource Statistics include metadata regarding the resource type that has been
     * tagged.
     * 
     * @return the droplets value.
     */
    public TagsMetadata getDroplets() {
        return this.droplets;
    }

    /**
     * Set the droplets property: Tagged Resource Statistics include metadata regarding the resource type that has been
     * tagged.
     * 
     * @param droplets the droplets value to set.
     * @return the TagsResources object itself.
     */
    public TagsResources setDroplets(TagsMetadata droplets) {
        this.droplets = droplets;
        return this;
    }

    /**
     * Get the imgages property: Tagged Resource Statistics include metadata regarding the resource type that has been
     * tagged.
     * 
     * @return the imgages value.
     */
    public TagsMetadata getImgages() {
        return this.imgages;
    }

    /**
     * Set the imgages property: Tagged Resource Statistics include metadata regarding the resource type that has been
     * tagged.
     * 
     * @param imgages the imgages value to set.
     * @return the TagsResources object itself.
     */
    public TagsResources setImgages(TagsMetadata imgages) {
        this.imgages = imgages;
        return this;
    }

    /**
     * Get the volumes property: Tagged Resource Statistics include metadata regarding the resource type that has been
     * tagged.
     * 
     * @return the volumes value.
     */
    public TagsMetadata getVolumes() {
        return this.volumes;
    }

    /**
     * Set the volumes property: Tagged Resource Statistics include metadata regarding the resource type that has been
     * tagged.
     * 
     * @param volumes the volumes value to set.
     * @return the TagsResources object itself.
     */
    public TagsResources setVolumes(TagsMetadata volumes) {
        this.volumes = volumes;
        return this;
    }

    /**
     * Get the volumeSnapshots property: Tagged Resource Statistics include metadata regarding the resource type that
     * has been tagged.
     * 
     * @return the volumeSnapshots value.
     */
    public TagsMetadata getVolumeSnapshots() {
        return this.volumeSnapshots;
    }

    /**
     * Set the volumeSnapshots property: Tagged Resource Statistics include metadata regarding the resource type that
     * has been tagged.
     * 
     * @param volumeSnapshots the volumeSnapshots value to set.
     * @return the TagsResources object itself.
     */
    public TagsResources setVolumeSnapshots(TagsMetadata volumeSnapshots) {
        this.volumeSnapshots = volumeSnapshots;
        return this;
    }

    /**
     * Get the databases property: Tagged Resource Statistics include metadata regarding the resource type that has
     * been tagged.
     * 
     * @return the databases value.
     */
    public TagsMetadata getDatabases() {
        return this.databases;
    }

    /**
     * Set the databases property: Tagged Resource Statistics include metadata regarding the resource type that has
     * been tagged.
     * 
     * @param databases the databases value to set.
     * @return the TagsResources object itself.
     */
    public TagsResources setDatabases(TagsMetadata databases) {
        this.databases = databases;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagsResources setCount(Integer count) {
        super.setCount(count);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagsResources setLastTaggedUri(String lastTaggedUri) {
        super.setLastTaggedUri(lastTaggedUri);
        return this;
    }
}
