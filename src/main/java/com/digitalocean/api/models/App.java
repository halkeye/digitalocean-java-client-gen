package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.regex.Pattern;

/**
 * An application's configuration and status.
 */
@Fluent
public final class App {
    /*
     * An app deployment
     */
    @JsonProperty(value = "active_deployment")
    private AppsDeployment activeDeployment;

    /*
     * The creation time of the app
     */
    @JsonProperty(value = "created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * The default hostname on which the app is accessible
     */
    @JsonProperty(value = "default_ingress", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultIngress;

    /*
     * Contains all domains for the app
     */
    @JsonProperty(value = "domains", access = JsonProperty.Access.WRITE_ONLY)
    private List<AppsDomain> domains;

    /*
     * The ID of the application
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * An app deployment
     */
    @JsonProperty(value = "in_progress_deployment")
    private AppsDeployment inProgressDeployment;

    /*
     * The creation time of the last deployment
     */
    @JsonProperty(value = "last_deployment_created_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastDeploymentCreatedAt;

    /*
     * The live domain of the app
     */
    @JsonProperty(value = "live_domain", access = JsonProperty.Access.WRITE_ONLY)
    private String liveDomain;

    /*
     * The live URL of the app
     */
    @JsonProperty(value = "live_url", access = JsonProperty.Access.WRITE_ONLY)
    private String liveUrl;

    /*
     * The live URL base of the app, the URL excluding the path
     */
    @JsonProperty(value = "live_url_base", access = JsonProperty.Access.WRITE_ONLY)
    private String liveUrlBase;

    /*
     * The ID of the account to which the application belongs
     */
    @JsonProperty(value = "owner_uuid", access = JsonProperty.Access.WRITE_ONLY)
    private String ownerUuid;

    /*
     * Geographical information about an app origin
     */
    @JsonProperty(value = "region")
    private AppsRegion region;

    /*
     * AppSpec
     * 
     * The desired configuration of an application.
     */
    @JsonProperty(value = "spec", required = true)
    private AppSpec spec;

    /*
     * The current pricing tier slug of the app
     */
    @JsonProperty(value = "tier_slug", access = JsonProperty.Access.WRITE_ONLY)
    private String tierSlug;

    /*
     * Time of the app's last configuration update
     */
    @JsonProperty(value = "updated_at", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * The pinned_deployment property.
     */
    @JsonProperty(value = "pinned_deployment")
    private AppPinnedDeployment pinnedDeployment;

    /**
     * Get the activeDeployment property: An app deployment.
     * 
     * @return the activeDeployment value.
     */
    public AppsDeployment getActiveDeployment() {
        return this.activeDeployment;
    }

    /**
     * Set the activeDeployment property: An app deployment.
     * 
     * @param activeDeployment the activeDeployment value to set.
     * @return the App object itself.
     */
    public App setActiveDeployment(AppsDeployment activeDeployment) {
        this.activeDeployment = activeDeployment;
        return this;
    }

    /**
     * Get the createdAt property: The creation time of the app.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the defaultIngress property: The default hostname on which the app is accessible.
     * 
     * @return the defaultIngress value.
     */
    public String getDefaultIngress() {
        return this.defaultIngress;
    }

    /**
     * Get the domains property: Contains all domains for the app.
     * 
     * @return the domains value.
     */
    public List<AppsDomain> getDomains() {
        return this.domains;
    }

    /**
     * Get the id property: The ID of the application.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the inProgressDeployment property: An app deployment.
     * 
     * @return the inProgressDeployment value.
     */
    public AppsDeployment getInProgressDeployment() {
        return this.inProgressDeployment;
    }

    /**
     * Set the inProgressDeployment property: An app deployment.
     * 
     * @param inProgressDeployment the inProgressDeployment value to set.
     * @return the App object itself.
     */
    public App setInProgressDeployment(AppsDeployment inProgressDeployment) {
        this.inProgressDeployment = inProgressDeployment;
        return this;
    }

    /**
     * Get the lastDeploymentCreatedAt property: The creation time of the last deployment.
     * 
     * @return the lastDeploymentCreatedAt value.
     */
    public OffsetDateTime getLastDeploymentCreatedAt() {
        return this.lastDeploymentCreatedAt;
    }

    /**
     * Get the liveDomain property: The live domain of the app.
     * 
     * @return the liveDomain value.
     */
    public String getLiveDomain() {
        return this.liveDomain;
    }

    /**
     * Get the liveUrl property: The live URL of the app.
     * 
     * @return the liveUrl value.
     */
    public String getLiveUrl() {
        return this.liveUrl;
    }

    /**
     * Get the liveUrlBase property: The live URL base of the app, the URL excluding the path.
     * 
     * @return the liveUrlBase value.
     */
    public String getLiveUrlBase() {
        return this.liveUrlBase;
    }

    /**
     * Get the ownerUuid property: The ID of the account to which the application belongs.
     * 
     * @return the ownerUuid value.
     */
    public String getOwnerUuid() {
        return this.ownerUuid;
    }

    /**
     * Get the region property: Geographical information about an app origin.
     * 
     * @return the region value.
     */
    public AppsRegion getRegion() {
        return this.region;
    }

    /**
     * Set the region property: Geographical information about an app origin.
     * 
     * @param region the region value to set.
     * @return the App object itself.
     */
    public App setRegion(AppsRegion region) {
        this.region = region;
        return this;
    }

    /**
     * Get the spec property: AppSpec
     * 
     * The desired configuration of an application.
     * 
     * @return the spec value.
     */
    public AppSpec getSpec() {
        return this.spec;
    }

    /**
     * Set the spec property: AppSpec
     * 
     * The desired configuration of an application.
     * 
     * @param spec the spec value to set.
     * @return the App object itself.
     */
    public App setSpec(AppSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * Get the tierSlug property: The current pricing tier slug of the app.
     * 
     * @return the tierSlug value.
     */
    public String getTierSlug() {
        return this.tierSlug;
    }

    /**
     * Get the updatedAt property: Time of the app's last configuration update.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the pinnedDeployment property: The pinned_deployment property.
     * 
     * @return the pinnedDeployment value.
     */
    public AppPinnedDeployment getPinnedDeployment() {
        return this.pinnedDeployment;
    }

    /**
     * Set the pinnedDeployment property: The pinned_deployment property.
     * 
     * @param pinnedDeployment the pinnedDeployment value to set.
     * @return the App object itself.
     */
    public App setPinnedDeployment(AppPinnedDeployment pinnedDeployment) {
        this.pinnedDeployment = pinnedDeployment;
        return this;
    }
}
