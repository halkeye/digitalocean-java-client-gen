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
 * The AppPinnedDeployment model.
 */
@Fluent
public final class AppPinnedDeployment extends AppsDeployment {
    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setCause(String cause) {
        super.setCause(cause);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setClonedFrom(String clonedFrom) {
        super.setClonedFrom(clonedFrom);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setCreatedAt(OffsetDateTime createdAt) {
        super.setCreatedAt(createdAt);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setId(String id) {
        super.setId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setJobs(List<AppsDeploymentJob> jobs) {
        super.setJobs(jobs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setFunctions(List<AppsDeploymentFunctions> functions) {
        super.setFunctions(functions);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setPhase(AppsDeploymentPhase phase) {
        super.setPhase(phase);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setPhaseLastUpdatedAt(OffsetDateTime phaseLastUpdatedAt) {
        super.setPhaseLastUpdatedAt(phaseLastUpdatedAt);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setProgress(AppsDeploymentProgress progress) {
        super.setProgress(progress);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setServices(List<AppsDeploymentService> services) {
        super.setServices(services);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setSpec(AppSpec spec) {
        super.setSpec(spec);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setStaticSites(List<AppsDeploymentStaticSite> staticSites) {
        super.setStaticSites(staticSites);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setUpdatedAt(OffsetDateTime updatedAt) {
        super.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppPinnedDeployment setWorkers(List<AppsDeploymentWorker> workers) {
        super.setWorkers(workers);
        return this;
    }
}
