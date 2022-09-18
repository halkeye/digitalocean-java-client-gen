package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * Configurations for external logging.
 */
@Fluent
public final class AppLogDestinationDefinition {
    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Papertrail configuration.
     */
    @JsonProperty(value = "papertrail")
    private AppLogDestinationPapertrailSpec papertrail;

    /*
     * DataDog configuration.
     */
    @JsonProperty(value = "datadog")
    private AppLogDestinationDatadogSpec datadog;

    /*
     * Logtail configuration.
     */
    @JsonProperty(value = "logtail")
    private AppLogDestinationLogtailSpec logtail;

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the AppLogDestinationDefinition object itself.
     */
    public AppLogDestinationDefinition setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the papertrail property: Papertrail configuration.
     * 
     * @return the papertrail value.
     */
    public AppLogDestinationPapertrailSpec getPapertrail() {
        return this.papertrail;
    }

    /**
     * Set the papertrail property: Papertrail configuration.
     * 
     * @param papertrail the papertrail value to set.
     * @return the AppLogDestinationDefinition object itself.
     */
    public AppLogDestinationDefinition setPapertrail(AppLogDestinationPapertrailSpec papertrail) {
        this.papertrail = papertrail;
        return this;
    }

    /**
     * Get the datadog property: DataDog configuration.
     * 
     * @return the datadog value.
     */
    public AppLogDestinationDatadogSpec getDatadog() {
        return this.datadog;
    }

    /**
     * Set the datadog property: DataDog configuration.
     * 
     * @param datadog the datadog value to set.
     * @return the AppLogDestinationDefinition object itself.
     */
    public AppLogDestinationDefinition setDatadog(AppLogDestinationDatadogSpec datadog) {
        this.datadog = datadog;
        return this;
    }

    /**
     * Get the logtail property: Logtail configuration.
     * 
     * @return the logtail value.
     */
    public AppLogDestinationLogtailSpec getLogtail() {
        return this.logtail;
    }

    /**
     * Set the logtail property: Logtail configuration.
     * 
     * @param logtail the logtail value to set.
     * @return the AppLogDestinationDefinition object itself.
     */
    public AppLogDestinationDefinition setLogtail(AppLogDestinationLogtailSpec logtail) {
        this.logtail = logtail;
        return this;
    }
}
