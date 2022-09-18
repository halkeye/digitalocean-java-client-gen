package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * An app deployment.
 */
@Fluent
public class AppsDeployment {
    /*
     * What caused this deployment to be created
     */
    @JsonProperty(value = "cause")
    private String cause;

    /*
     * The ID of a previous deployment that this deployment was cloned from
     */
    @JsonProperty(value = "cloned_from")
    private String clonedFrom;

    /*
     * The creation time of the deployment
     */
    @JsonProperty(value = "created_at")
    private OffsetDateTime createdAt;

    /*
     * The ID of the deployment
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Job components that are part of this deployment
     */
    @JsonProperty(value = "jobs")
    private List<AppsDeploymentJob> jobs;

    /*
     * Functions components that are part of this deployment
     */
    @JsonProperty(value = "functions")
    private List<AppsDeploymentFunctions> functions;

    /*
     * The phase property.
     */
    @JsonProperty(value = "phase")
    private AppsDeploymentPhase phase;

    /*
     * When the deployment phase was last updated
     */
    @JsonProperty(value = "phase_last_updated_at")
    private OffsetDateTime phaseLastUpdatedAt;

    /*
     * The progress property.
     */
    @JsonProperty(value = "progress")
    private AppsDeploymentProgress progress;

    /*
     * Service components that are part of this deployment
     */
    @JsonProperty(value = "services")
    private List<AppsDeploymentService> services;

    /*
     * AppSpec
     * 
     * The desired configuration of an application.
     */
    @JsonProperty(value = "spec")
    private AppSpec spec;

    /*
     * Static Site components that are part of this deployment
     */
    @JsonProperty(value = "static_sites")
    private List<AppsDeploymentStaticSite> staticSites;

    /*
     * The current pricing tier slug of the deployment
     */
    @JsonProperty(value = "tier_slug", access = JsonProperty.Access.WRITE_ONLY)
    private String tierSlug;

    /*
     * When the deployment was last updated
     */
    @JsonProperty(value = "updated_at")
    private OffsetDateTime updatedAt;

    /*
     * Worker components that are part of this deployment
     */
    @JsonProperty(value = "workers")
    private List<AppsDeploymentWorker> workers;

    /**
     * Get the cause property: What caused this deployment to be created.
     * 
     * @return the cause value.
     */
    public String getCause() {
        return this.cause;
    }

    /**
     * Set the cause property: What caused this deployment to be created.
     * 
     * @param cause the cause value to set.
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setCause(String cause) {
        this.cause = cause;
        return this;
    }

    /**
     * Get the clonedFrom property: The ID of a previous deployment that this deployment was cloned from.
     * 
     * @return the clonedFrom value.
     */
    public String getClonedFrom() {
        return this.clonedFrom;
    }

    /**
     * Set the clonedFrom property: The ID of a previous deployment that this deployment was cloned from.
     * 
     * @param clonedFrom the clonedFrom value to set.
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setClonedFrom(String clonedFrom) {
        this.clonedFrom = clonedFrom;
        return this;
    }

    /**
     * Get the createdAt property: The creation time of the deployment.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: The creation time of the deployment.
     * 
     * @param createdAt the createdAt value to set.
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the id property: The ID of the deployment.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the deployment.
     * 
     * @param id the id value to set.
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the jobs property: Job components that are part of this deployment.
     * 
     * @return the jobs value.
     */
    public List<AppsDeploymentJob> getJobs() {
        return this.jobs;
    }

    /**
     * Set the jobs property: Job components that are part of this deployment.
     * 
     * @param jobs the jobs value to set.
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setJobs(List<AppsDeploymentJob> jobs) {
        this.jobs = jobs;
        return this;
    }

    /**
     * Get the functions property: Functions components that are part of this deployment.
     * 
     * @return the functions value.
     */
    public List<AppsDeploymentFunctions> getFunctions() {
        return this.functions;
    }

    /**
     * Set the functions property: Functions components that are part of this deployment.
     * 
     * @param functions the functions value to set.
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setFunctions(List<AppsDeploymentFunctions> functions) {
        this.functions = functions;
        return this;
    }

    /**
     * Get the phase property: The phase property.
     * 
     * @return the phase value.
     */
    public AppsDeploymentPhase getPhase() {
        return this.phase;
    }

    /**
     * Set the phase property: The phase property.
     * 
     * @param phase the phase value to set.
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setPhase(AppsDeploymentPhase phase) {
        this.phase = phase;
        return this;
    }

    /**
     * Get the phaseLastUpdatedAt property: When the deployment phase was last updated.
     * 
     * @return the phaseLastUpdatedAt value.
     */
    public OffsetDateTime getPhaseLastUpdatedAt() {
        return this.phaseLastUpdatedAt;
    }

    /**
     * Set the phaseLastUpdatedAt property: When the deployment phase was last updated.
     * 
     * @param phaseLastUpdatedAt the phaseLastUpdatedAt value to set.
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setPhaseLastUpdatedAt(OffsetDateTime phaseLastUpdatedAt) {
        this.phaseLastUpdatedAt = phaseLastUpdatedAt;
        return this;
    }

    /**
     * Get the progress property: The progress property.
     * 
     * @return the progress value.
     */
    public AppsDeploymentProgress getProgress() {
        return this.progress;
    }

    /**
     * Set the progress property: The progress property.
     * 
     * @param progress the progress value to set.
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setProgress(AppsDeploymentProgress progress) {
        this.progress = progress;
        return this;
    }

    /**
     * Get the services property: Service components that are part of this deployment.
     * 
     * @return the services value.
     */
    public List<AppsDeploymentService> getServices() {
        return this.services;
    }

    /**
     * Set the services property: Service components that are part of this deployment.
     * 
     * @param services the services value to set.
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setServices(List<AppsDeploymentService> services) {
        this.services = services;
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
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setSpec(AppSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * Get the staticSites property: Static Site components that are part of this deployment.
     * 
     * @return the staticSites value.
     */
    public List<AppsDeploymentStaticSite> getStaticSites() {
        return this.staticSites;
    }

    /**
     * Set the staticSites property: Static Site components that are part of this deployment.
     * 
     * @param staticSites the staticSites value to set.
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setStaticSites(List<AppsDeploymentStaticSite> staticSites) {
        this.staticSites = staticSites;
        return this;
    }

    /**
     * Get the tierSlug property: The current pricing tier slug of the deployment.
     * 
     * @return the tierSlug value.
     */
    public String getTierSlug() {
        return this.tierSlug;
    }

    /**
     * Get the updatedAt property: When the deployment was last updated.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the updatedAt property: When the deployment was last updated.
     * 
     * @param updatedAt the updatedAt value to set.
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get the workers property: Worker components that are part of this deployment.
     * 
     * @return the workers value.
     */
    public List<AppsDeploymentWorker> getWorkers() {
        return this.workers;
    }

    /**
     * Set the workers property: Worker components that are part of this deployment.
     * 
     * @param workers the workers value to set.
     * @return the AppsDeployment object itself.
     */
    public AppsDeployment setWorkers(List<AppsDeploymentWorker> workers) {
        this.workers = workers;
        return this;
    }
}
