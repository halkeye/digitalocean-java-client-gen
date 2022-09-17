package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComponentsL46Y0QResponsesAllKernelsContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class ComponentsL46Y0QResponsesAllKernelsContentApplicationJsonSchemaAllof0 {
    /*
     * The kernels property.
     */
    @JsonProperty(value = "kernels")
    private List<Kernel> kernels;

    /**
     * Get the kernels property: The kernels property.
     *
     * @return the kernels value.
     */
    public List<Kernel> getKernels() {
        return this.kernels;
    }

    /**
     * Set the kernels property: The kernels property.
     *
     * @param kernels the kernels value to set.
     * @return the ComponentsL46Y0QResponsesAllKernelsContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsL46Y0QResponsesAllKernelsContentApplicationJsonSchemaAllof0 setKernels(List<Kernel> kernels) {
        this.kernels = kernels;
        return this;
    }
}
