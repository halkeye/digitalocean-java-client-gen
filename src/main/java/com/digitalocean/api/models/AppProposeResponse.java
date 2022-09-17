package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppProposeResponse model. */
@Fluent
public final class AppProposeResponse {
    /*
     * Indicates whether the app is a static app.
     */
    @JsonProperty(value = "app_is_static")
    private Boolean appIsStatic;

    /*
     * Indicates whether the app name is available.
     */
    @JsonProperty(value = "app_name_available")
    private Boolean appNameAvailable;

    /*
     * The suggested name if the proposed app name is unavailable.
     */
    @JsonProperty(value = "app_name_suggestion")
    private String appNameSuggestion;

    /*
     * The maximum number of free static apps the account can have. We will charge you for any additional static apps.
     */
    @JsonProperty(value = "existing_static_apps")
    private String existingStaticApps;

    /*
     * AppSpec
     *
     * The desired configuration of an application.
     */
    @JsonProperty(value = "spec")
    private AppSpec spec;

    /*
     * The monthly cost of the proposed app in USD using the next pricing plan tier. For example, if you propose an app
     * that uses the Basic tier, the `app_tier_upgrade_cost` field displays the monthly cost of the app if it were to
     * use the Professional tier. If the proposed app already uses the most expensive tier, the field is empty.
     */
    @JsonProperty(value = "app_cost")
    private Integer appCost;

    /*
     * The monthly cost of the proposed app in USD using the previous pricing plan tier. For example, if you propose an
     * app that uses the Professional tier, the `app_tier_downgrade_cost` field displays the monthly cost of the app if
     * it were to use the Basic tier. If the proposed app already uses the lest expensive tier, the field is empty.
     */
    @JsonProperty(value = "app_tier_downgrade_cost")
    private Integer appTierDowngradeCost;

    /**
     * Get the appIsStatic property: Indicates whether the app is a static app.
     *
     * @return the appIsStatic value.
     */
    public Boolean isAppIsStatic() {
        return this.appIsStatic;
    }

    /**
     * Set the appIsStatic property: Indicates whether the app is a static app.
     *
     * @param appIsStatic the appIsStatic value to set.
     * @return the AppProposeResponse object itself.
     */
    public AppProposeResponse setAppIsStatic(Boolean appIsStatic) {
        this.appIsStatic = appIsStatic;
        return this;
    }

    /**
     * Get the appNameAvailable property: Indicates whether the app name is available.
     *
     * @return the appNameAvailable value.
     */
    public Boolean isAppNameAvailable() {
        return this.appNameAvailable;
    }

    /**
     * Set the appNameAvailable property: Indicates whether the app name is available.
     *
     * @param appNameAvailable the appNameAvailable value to set.
     * @return the AppProposeResponse object itself.
     */
    public AppProposeResponse setAppNameAvailable(Boolean appNameAvailable) {
        this.appNameAvailable = appNameAvailable;
        return this;
    }

    /**
     * Get the appNameSuggestion property: The suggested name if the proposed app name is unavailable.
     *
     * @return the appNameSuggestion value.
     */
    public String getAppNameSuggestion() {
        return this.appNameSuggestion;
    }

    /**
     * Set the appNameSuggestion property: The suggested name if the proposed app name is unavailable.
     *
     * @param appNameSuggestion the appNameSuggestion value to set.
     * @return the AppProposeResponse object itself.
     */
    public AppProposeResponse setAppNameSuggestion(String appNameSuggestion) {
        this.appNameSuggestion = appNameSuggestion;
        return this;
    }

    /**
     * Get the existingStaticApps property: The maximum number of free static apps the account can have. We will charge
     * you for any additional static apps.
     *
     * @return the existingStaticApps value.
     */
    public String getExistingStaticApps() {
        return this.existingStaticApps;
    }

    /**
     * Set the existingStaticApps property: The maximum number of free static apps the account can have. We will charge
     * you for any additional static apps.
     *
     * @param existingStaticApps the existingStaticApps value to set.
     * @return the AppProposeResponse object itself.
     */
    public AppProposeResponse setExistingStaticApps(String existingStaticApps) {
        this.existingStaticApps = existingStaticApps;
        return this;
    }

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
     * @return the AppProposeResponse object itself.
     */
    public AppProposeResponse setSpec(AppSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * Get the appCost property: The monthly cost of the proposed app in USD using the next pricing plan tier. For
     * example, if you propose an app that uses the Basic tier, the `app_tier_upgrade_cost` field displays the monthly
     * cost of the app if it were to use the Professional tier. If the proposed app already uses the most expensive
     * tier, the field is empty.
     *
     * @return the appCost value.
     */
    public Integer getAppCost() {
        return this.appCost;
    }

    /**
     * Set the appCost property: The monthly cost of the proposed app in USD using the next pricing plan tier. For
     * example, if you propose an app that uses the Basic tier, the `app_tier_upgrade_cost` field displays the monthly
     * cost of the app if it were to use the Professional tier. If the proposed app already uses the most expensive
     * tier, the field is empty.
     *
     * @param appCost the appCost value to set.
     * @return the AppProposeResponse object itself.
     */
    public AppProposeResponse setAppCost(Integer appCost) {
        this.appCost = appCost;
        return this;
    }

    /**
     * Get the appTierDowngradeCost property: The monthly cost of the proposed app in USD using the previous pricing
     * plan tier. For example, if you propose an app that uses the Professional tier, the `app_tier_downgrade_cost`
     * field displays the monthly cost of the app if it were to use the Basic tier. If the proposed app already uses the
     * lest expensive tier, the field is empty.
     *
     * @return the appTierDowngradeCost value.
     */
    public Integer getAppTierDowngradeCost() {
        return this.appTierDowngradeCost;
    }

    /**
     * Set the appTierDowngradeCost property: The monthly cost of the proposed app in USD using the previous pricing
     * plan tier. For example, if you propose an app that uses the Professional tier, the `app_tier_downgrade_cost`
     * field displays the monthly cost of the app if it were to use the Basic tier. If the proposed app already uses the
     * lest expensive tier, the field is empty.
     *
     * @param appTierDowngradeCost the appTierDowngradeCost value to set.
     * @return the AppProposeResponse object itself.
     */
    public AppProposeResponse setAppTierDowngradeCost(Integer appTierDowngradeCost) {
        this.appTierDowngradeCost = appTierDowngradeCost;
        return this;
    }
}
