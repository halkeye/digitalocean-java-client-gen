package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The MetricsResult model. */
@Fluent
public final class MetricsResult {
    /*
     * An object containing the metric labels.
     */
    @JsonProperty(value = "metric", required = true)
    private Map<String, String> metric;

    /*
     * The values property.
     */
    @JsonProperty(value = "values", required = true)
    private List<List<Object>> values;

    /**
     * Get the metric property: An object containing the metric labels.
     *
     * @return the metric value.
     */
    public Map<String, String> getMetric() {
        return this.metric;
    }

    /**
     * Set the metric property: An object containing the metric labels.
     *
     * @param metric the metric value to set.
     * @return the MetricsResult object itself.
     */
    public MetricsResult setMetric(Map<String, String> metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get the values property: The values property.
     *
     * @return the values value.
     */
    public List<List<Object>> getValues() {
        return this.values;
    }

    /**
     * Set the values property: The values property.
     *
     * @param values the values value to set.
     * @return the MetricsResult object itself.
     */
    public MetricsResult setValues(List<List<Object>> values) {
        this.values = values;
        return this;
    }
}
