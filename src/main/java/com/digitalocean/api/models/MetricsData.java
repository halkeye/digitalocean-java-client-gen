package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MetricsData model. */
@Fluent
public final class MetricsData {
    /*
     * Result of query.
     */
    @JsonProperty(value = "result", required = true)
    private List<MetricsResult> result;

    /*
     * The resultType property.
     */
    @JsonProperty(value = "resultType", required = true)
    private String resultType = "matrix";

    /** Creates an instance of MetricsData class. */
    public MetricsData() {
        resultType = "matrix";
    }

    /**
     * Get the result property: Result of query.
     *
     * @return the result value.
     */
    public List<MetricsResult> getResult() {
        return this.result;
    }

    /**
     * Set the result property: Result of query.
     *
     * @param result the result value to set.
     * @return the MetricsData object itself.
     */
    public MetricsData setResult(List<MetricsResult> result) {
        this.result = result;
        return this;
    }

    /**
     * Get the resultType property: The resultType property.
     *
     * @return the resultType value.
     */
    public String getResultType() {
        return this.resultType;
    }

    /**
     * Set the resultType property: The resultType property.
     *
     * @param resultType the resultType value to set.
     * @return the MetricsData object itself.
     */
    public MetricsData setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
}
