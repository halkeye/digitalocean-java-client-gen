package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DropletActionChangeKernel model. */
@Fluent
public final class DropletActionChangeKernel extends DropletAction {
    /*
     * A unique number used to identify and reference a specific kernel.
     */
    @JsonProperty(value = "kernel")
    private Integer kernel;

    /**
     * Get the kernel property: A unique number used to identify and reference a specific kernel.
     *
     * @return the kernel value.
     */
    public Integer getKernel() {
        return this.kernel;
    }

    /**
     * Set the kernel property: A unique number used to identify and reference a specific kernel.
     *
     * @param kernel the kernel value to set.
     * @return the DropletActionChangeKernel object itself.
     */
    public DropletActionChangeKernel setKernel(Integer kernel) {
        this.kernel = kernel;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DropletActionChangeKernel setType(DropletActionType type) {
        super.setType(type);
        return this;
    }
}
