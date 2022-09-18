package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * Metadata about the Kubernetes API object the diagnostic is reported on.
 */
@Fluent
public final class ClusterlintResultsDiagnosticsItemObject {
    /*
     * Name of the object
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The kind of Kubernetes API object
     */
    @JsonProperty(value = "kind")
    private String kind;

    /*
     * The namespace the object resides in the cluster.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /**
     * Get the name property: Name of the object.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the object.
     * 
     * @param name the name value to set.
     * @return the ClusterlintResultsDiagnosticsItemObject object itself.
     */
    public ClusterlintResultsDiagnosticsItemObject setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the kind property: The kind of Kubernetes API object.
     * 
     * @return the kind value.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of Kubernetes API object.
     * 
     * @param kind the kind value to set.
     * @return the ClusterlintResultsDiagnosticsItemObject object itself.
     */
    public ClusterlintResultsDiagnosticsItemObject setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the namespace property: The namespace the object resides in the cluster.
     * 
     * @return the namespace value.
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: The namespace the object resides in the cluster.
     * 
     * @param namespace the namespace value to set.
     * @return the ClusterlintResultsDiagnosticsItemObject object itself.
     */
    public ClusterlintResultsDiagnosticsItemObject setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
}
