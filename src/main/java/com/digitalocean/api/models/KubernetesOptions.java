package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KubernetesOptions model. */
@Fluent
public final class KubernetesOptions {
    /*
     * The options property.
     */
    @JsonProperty(value = "options")
    private KubernetesOptionsOptions options;

    /**
     * Get the options property: The options property.
     *
     * @return the options value.
     */
    public KubernetesOptionsOptions getOptions() {
        return this.options;
    }

    /**
     * Set the options property: The options property.
     *
     * @param options the options value to set.
     * @return the KubernetesOptions object itself.
     */
    public KubernetesOptions setOptions(KubernetesOptionsOptions options) {
        this.options = options;
        return this;
    }
}
