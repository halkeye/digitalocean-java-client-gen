package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppResponse model. */
@Fluent
public final class AppResponse {
    /*
     * An application's configuration and status.
     */
    @JsonProperty(value = "app")
    private App app;

    /**
     * Get the app property: An application's configuration and status.
     *
     * @return the app value.
     */
    public App getApp() {
        return this.app;
    }

    /**
     * Set the app property: An application's configuration and status.
     *
     * @param app the app value to set.
     * @return the AppResponse object itself.
     */
    public AppResponse setApp(App app) {
        this.app = app;
        return this;
    }
}
