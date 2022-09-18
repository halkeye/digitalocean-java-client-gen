package com.digitalocean.api.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the getOptions operation.
 */
public final class RegistriesGetOptionsResponse extends ResponseBase<RegistriesGetOptionsHeaders, Object> {
    /**
     * Creates an instance of RegistriesGetOptionsResponse.
     * 
     * @param request the request which resulted in this RegistriesGetOptionsResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public RegistriesGetOptionsResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Object value, RegistriesGetOptionsHeaders headers) {
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
