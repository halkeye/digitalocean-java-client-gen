package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Geographical information about an app origin.
 */
@Immutable
public final class AppsRegion {
    /*
     * The continent that this region is in
     */
    @JsonProperty(value = "continent", access = JsonProperty.Access.WRITE_ONLY)
    private String continent;

    /*
     * Data centers that are in this region
     */
    @JsonProperty(value = "data_centers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> dataCenters;

    /*
     * Whether or not the region is presented as the default.
     */
    @JsonProperty(value = "default", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean defaultProperty;

    /*
     * Whether or not the region is open for new apps
     */
    @JsonProperty(value = "disabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean disabled;

    /*
     * The flag of this region
     */
    @JsonProperty(value = "flag", access = JsonProperty.Access.WRITE_ONLY)
    private String flag;

    /*
     * A human-readable name of the region
     */
    @JsonProperty(value = "label", access = JsonProperty.Access.WRITE_ONLY)
    private String label;

    /*
     * Reason that this region is not available
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private String reason;

    /*
     * The slug form of the region name
     */
    @JsonProperty(value = "slug", access = JsonProperty.Access.WRITE_ONLY)
    private String slug;

    /**
     * Get the continent property: The continent that this region is in.
     * 
     * @return the continent value.
     */
    public String getContinent() {
        return this.continent;
    }

    /**
     * Get the dataCenters property: Data centers that are in this region.
     * 
     * @return the dataCenters value.
     */
    public List<String> getDataCenters() {
        return this.dataCenters;
    }

    /**
     * Get the defaultProperty property: Whether or not the region is presented as the default.
     * 
     * @return the defaultProperty value.
     */
    public Boolean isDefaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Get the disabled property: Whether or not the region is open for new apps.
     * 
     * @return the disabled value.
     */
    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * Get the flag property: The flag of this region.
     * 
     * @return the flag value.
     */
    public String getFlag() {
        return this.flag;
    }

    /**
     * Get the label property: A human-readable name of the region.
     * 
     * @return the label value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Get the reason property: Reason that this region is not available.
     * 
     * @return the reason value.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Get the slug property: The slug form of the region name.
     * 
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }
}
