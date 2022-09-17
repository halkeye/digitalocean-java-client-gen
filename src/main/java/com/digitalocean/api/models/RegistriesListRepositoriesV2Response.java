package com.digitalocean.api.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the listRepositoriesV2 operation. */
public final class RegistriesListRepositoriesV2Response
        extends ResponseBase<RegistriesListRepositoriesV2Headers, Object> {
    /**
     * Creates an instance of RegistriesListRepositoriesV2Response.
     *
     * @param request the request which resulted in this RegistriesListRepositoriesV2Response.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public RegistriesListRepositoriesV2Response(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Object value,
            RegistriesListRepositoriesV2Headers headers) {
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
