package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The DatabaseLayoutOptions model.
 */
@Immutable
public class DatabaseLayoutOptions {
    /*
     * An array of objects, each indicating the node sizes (otherwise referred to as slugs) that are available with
     * various numbers of nodes in the database cluster. Each slugs denotes the node's identifier, CPU, and RAM (in
     * that order).
     */
    @JsonProperty(value = "layouts", access = JsonProperty.Access.WRITE_ONLY)
    private List<DatabaseLayoutOption> layouts;

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
