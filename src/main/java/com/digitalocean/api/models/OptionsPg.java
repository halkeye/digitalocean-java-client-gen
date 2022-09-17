package com.digitalocean.api.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OptionsPg model. */
@Immutable
public final class OptionsPg extends DatabaseRegionOptions {
    /*
     * An array of strings containing the names of available regions
     */
    @JsonProperty(value = "versions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> versions;

    /*
     * An array of objects, each indicating the node sizes (otherwise referred to as slugs) that are available with
     * various numbers of nodes in the database cluster. Each slugs denotes the node's identifier, CPU, and RAM (in
     * that order).
     */
    @JsonProperty(value = "layouts", access = JsonProperty.Access.WRITE_ONLY)
    private List<DatabaseLayoutOption> layouts;

    /**
     * Get the versions property: An array of strings containing the names of available regions.
     *
     * @return the versions value.
     */
    public List<String> getVersions() {
        return this.versions;
    }

    /**
     * Get the layouts property: An array of objects, each indicating the node sizes (otherwise referred to as slugs)
     * that are available with various numbers of nodes in the database cluster. Each slugs denotes the node's
     * identifier, CPU, and RAM (in that order).
     *
     * @return the layouts value.
     */
    public List<DatabaseLayoutOption> getLayouts() {
        return this.layouts;
    }
}
