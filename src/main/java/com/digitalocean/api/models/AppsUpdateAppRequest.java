package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppsUpdateAppRequest model. */
@Fluent
public final class AppsUpdateAppRequest {
    /*
     * AppSpec
     *
     * The desired configuration of an application.
     */
    @JsonProperty(value = "spec", required = true)
    private AppSpec spec;

    /**
     * Get the spec property: AppSpec
     *
     * <p>The desired configuration of an application.
     *
     * @return the spec value.
     */
    public AppSpec getSpec() {
        return this.spec;
    }

    /**
     * Set the spec property: AppSpec
     *
     * <p>The desired configuration of an application.
     *
     * @param spec the spec value to set.
     * @return the AppsUpdateAppRequest object itself.
     */
    public AppsUpdateAppRequest setSpec(AppSpec spec) {
        this.spec = spec;
        return this;
    }
}
