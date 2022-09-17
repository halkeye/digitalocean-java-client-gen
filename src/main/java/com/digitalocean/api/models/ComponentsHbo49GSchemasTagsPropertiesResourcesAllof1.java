package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 model. */
@Fluent
public class ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 {
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
     * @return the ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 object itself.
     */
    public ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 setDroplets(TagsMetadata droplets) {
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
     * @return the ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 object itself.
     */
    public ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 setImgages(TagsMetadata imgages) {
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
     * @return the ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 object itself.
     */
    public ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 setVolumes(TagsMetadata volumes) {
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
     * @return the ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 object itself.
     */
    public ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 setVolumeSnapshots(TagsMetadata volumeSnapshots) {
        this.volumeSnapshots = volumeSnapshots;
        return this;
    }

    /**
     * Get the databases property: Tagged Resource Statistics include metadata regarding the resource type that has been
     * tagged.
     *
     * @return the databases value.
     */
    public TagsMetadata getDatabases() {
        return this.databases;
    }

    /**
     * Set the databases property: Tagged Resource Statistics include metadata regarding the resource type that has been
     * tagged.
     *
     * @param databases the databases value to set.
     * @return the ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 object itself.
     */
    public ComponentsHbo49GSchemasTagsPropertiesResourcesAllof1 setDatabases(TagsMetadata databases) {
        this.databases = databases;
        return this;
    }
}
