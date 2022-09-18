package com.digitalocean.api.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the listAlerts operation.
 */
public final class AppsListAlertsResponseResponse extends ResponseBase<AppsListAlertsHeaders, Object> {
    /**
     * Creates an instance of AppsListAlertsResponseResponse.
     * 
     * @param request the request which resulted in this AppsListAlertsResponseResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public AppsListAlertsResponseResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Object value, AppsListAlertsHeaders headers) {
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
