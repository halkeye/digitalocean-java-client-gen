package com.digitalocean.api.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the updateEvictionPolicy operation.
 */
public final class DatabasesUpdateEvictionPolicyResponse extends ResponseBase<DatabasesUpdateEvictionPolicyHeaders, Error> {
    /**
     * Creates an instance of DatabasesUpdateEvictionPolicyResponse.
     * 
     * @param request the request which resulted in this DatabasesUpdateEvictionPolicyResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DatabasesUpdateEvictionPolicyResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Error value, DatabasesUpdateEvictionPolicyHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     * 
     * @return the deserialized response body.
     */
    @Override
    public Error getValue() {
        return super.getValue();
    }
}
