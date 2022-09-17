package com.digitalocean.api.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the removeDroplets operation. */
public final class LoadBalancersRemoveDropletsResponse extends ResponseBase<LoadBalancersRemoveDropletsHeaders, Error> {
    /**
     * Creates an instance of LoadBalancersRemoveDropletsResponse.
     *
     * @param request the request which resulted in this LoadBalancersRemoveDropletsResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public LoadBalancersRemoveDropletsResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Error value,
            LoadBalancersRemoveDropletsHeaders headers) {
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
