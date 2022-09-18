package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components1Dwt4B3ResponsesAllSizesContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class Components1Dwt4B3ResponsesAllSizesContentApplicationJsonSchemaAllof0 {
    /*
     * The sizes property.
     */
    @JsonProperty(value = "sizes", required = true)
    private List<Size> sizes;

    /**
     * Get the sizes property: The sizes property.
     * 
     * @return the sizes value.
     */
    public List<Size> getSizes() {
        return this.sizes;
    }

    /**
     * Set the sizes property: The sizes property.
     * 
     * @param sizes the sizes value to set.
     * @return the Components1Dwt4B3ResponsesAllSizesContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Dwt4B3ResponsesAllSizesContentApplicationJsonSchemaAllof0 setSizes(List<Size> sizes) {
        this.sizes = sizes;
        return this;
    }
}
