package com.digitalocean.api.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the getDropletLoad5Metrics operation. */
public final class MonitoringsGetDropletLoad5MetricsResponse
        extends ResponseBase<MonitoringsGetDropletLoad5MetricsHeaders, Object> {
    /**
     * Creates an instance of MonitoringsGetDropletLoad5MetricsResponse.
     *
     * @param request the request which resulted in this MonitoringsGetDropletLoad5MetricsResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public MonitoringsGetDropletLoad5MetricsResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Object value,
            MonitoringsGetDropletLoad5MetricsHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public Object getValue() {
        return super.getValue();
    }
}
