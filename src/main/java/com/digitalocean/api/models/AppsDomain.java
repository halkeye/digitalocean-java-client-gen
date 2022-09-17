package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppsDomain model. */
@Fluent
public final class AppsDomain {
    /*
     * The ID of the domain
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The phase property.
     */
    @JsonProperty(value = "phase")
    private AppsDomainPhase phase;

    /*
     * The progress property.
     */
    @JsonProperty(value = "progress")
    private AppsDomainProgress progress;

    /*
     * The spec property.
     */
    @JsonProperty(value = "spec")
    private AppDomainSpec spec;

    /**
     * Get the id property: The ID of the domain.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the domain.
     *
     * @param id the id value to set.
     * @return the AppsDomain object itself.
     */
    public AppsDomain setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the phase property: The phase property.
     *
     * @return the phase value.
     */
    public AppsDomainPhase getPhase() {
        return this.phase;
    }

    /**
     * Set the phase property: The phase property.
     *
     * @param phase the phase value to set.
     * @return the AppsDomain object itself.
     */
    public AppsDomain setPhase(AppsDomainPhase phase) {
        this.phase = phase;
        return this;
    }

    /**
     * Get the progress property: The progress property.
     *
     * @return the progress value.
     */
    public AppsDomainProgress getProgress() {
        return this.progress;
    }

    /**
     * Set the progress property: The progress property.
     *
     * @param progress the progress value to set.
     * @return the AppsDomain object itself.
     */
    public AppsDomain setProgress(AppsDomainProgress progress) {
        this.progress = progress;
        return this;
    }

    /**
     * Get the spec property: The spec property.
     *
     * @return the spec value.
     */
    public AppDomainSpec getSpec() {
        return this.spec;
    }

    /**
     * Set the spec property: The spec property.
     *
     * @param spec the spec value to set.
     * @return the AppsDomain object itself.
     */
    public AppsDomain setSpec(AppDomainSpec spec) {
        this.spec = spec;
        return this;
    }
}
