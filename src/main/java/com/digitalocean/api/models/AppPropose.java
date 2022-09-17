package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppPropose model. */
@Fluent
public final class AppPropose {
    /*
     * AppSpec
     *
     * The desired configuration of an application.
     */
    @JsonProperty(value = "spec", required = true)
    private AppSpec spec;

    /*
     * An optional ID of an existing app. If set, the spec will be treated as a proposed update to the specified app.
     * The existing app is not modified using this method.
     */
    @JsonProperty(value = "app_id")
    private String appId;

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
     * @return the AppPropose object itself.
     */
    public AppPropose setSpec(AppSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * Get the appId property: An optional ID of an existing app. If set, the spec will be treated as a proposed update
     * to the specified app. The existing app is not modified using this method.
     *
     * @return the appId value.
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * Set the appId property: An optional ID of an existing app. If set, the spec will be treated as a proposed update
     * to the specified app. The existing app is not modified using this method.
     *
     * @param appId the appId value to set.
     * @return the AppPropose object itself.
     */
    public AppPropose setAppId(String appId) {
        this.appId = appId;
        return this;
    }
}
