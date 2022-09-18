package com.digitalocean.api.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the listTiers operation.
 */
public final class AppsListTiersResponseResponse extends ResponseBase<AppsListTiersHeaders, Object> {
    /**
     * Creates an instance of AppsListTiersResponseResponse.
     * 
     * @param request the request which resulted in this AppsListTiersResponseResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public AppsListTiersResponseResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Object value, AppsListTiersHeaders headers) {
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
