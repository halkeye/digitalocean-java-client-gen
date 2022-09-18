package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components1Mgw0OqResponsesAllVpcsContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class Components1Mgw0OqResponsesAllVpcsContentApplicationJsonSchemaAllof0 {
    /*
     * The vpcs property.
     */
    @JsonProperty(value = "vpcs")
    private List<Vpc> vpcs;

    /**
     * Get the vpcs property: The vpcs property.
     * 
     * @return the vpcs value.
     */
    public List<Vpc> getVpcs() {
        return this.vpcs;
    }

    /**
     * Set the vpcs property: The vpcs property.
     * 
     * @param vpcs the vpcs value to set.
     * @return the Components1Mgw0OqResponsesAllVpcsContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1Mgw0OqResponsesAllVpcsContentApplicationJsonSchemaAllof0 setVpcs(List<Vpc> vpcs) {
        this.vpcs = vpcs;
        return this;
    }
}
