package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppComponentInstanceBase model. */
@Fluent
public class AppComponentInstanceBase {
    /*
     * The amount of instances that this component should be scaled to. Default: 1
     */
    @JsonProperty(value = "instance_count")
    private Long instanceCount;

    /*
     * The instance size to use for this component. Default: `basic-xxs`
     */
    @JsonProperty(value = "instance_size_slug")
    private AppComponentInstanceBaseInstanceSizeSlug instanceSizeSlug;

    /**
     * Get the instanceCount property: The amount of instances that this component should be scaled to. Default: 1.
     *
     * @return the instanceCount value.
     */
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: The amount of instances that this component should be scaled to. Default: 1.
     *
     * @param instanceCount the instanceCount value to set.
     * @return the AppComponentInstanceBase object itself.
     */
    public AppComponentInstanceBase setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Get the instanceSizeSlug property: The instance size to use for this component. Default: `basic-xxs`.
     *
     * @return the instanceSizeSlug value.
     */
    public AppComponentInstanceBaseInstanceSizeSlug getInstanceSizeSlug() {
        return this.instanceSizeSlug;
    }

    /**
     * Set the instanceSizeSlug property: The instance size to use for this component. Default: `basic-xxs`.
     *
     * @param instanceSizeSlug the instanceSizeSlug value to set.
     * @return the AppComponentInstanceBase object itself.
     */
    public AppComponentInstanceBase setInstanceSizeSlug(AppComponentInstanceBaseInstanceSizeSlug instanceSizeSlug) {
        this.instanceSizeSlug = instanceSizeSlug;
        return this;
    }
}
