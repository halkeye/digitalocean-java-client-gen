package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The UpdateRegistry model.
 */
@Fluent
public final class UpdateRegistry {
    /*
     * A boolean value indicating that the garbage collection should be cancelled.
     */
    @JsonProperty(value = "cancel")
    private Boolean cancel;

    /**
     * Get the cancel property: A boolean value indicating that the garbage collection should be cancelled.
     * 
     * @return the cancel value.
     */
    public Boolean isCancel() {
        return this.cancel;
    }

    /**
     * Set the cancel property: A boolean value indicating that the garbage collection should be cancelled.
     * 
     * @param cancel the cancel value to set.
     * @return the UpdateRegistry object itself.
     */
    public UpdateRegistry setCancel(Boolean cancel) {
        this.cancel = cancel;
        return this;
    }
}
