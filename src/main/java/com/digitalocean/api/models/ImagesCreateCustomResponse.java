package com.digitalocean.api.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the createCustom operation. */
public final class ImagesCreateCustomResponse extends ResponseBase<ImagesCreateCustomHeaders, Object> {
    /**
     * Creates an instance of ImagesCreateCustomResponse.
     *
     * @param request the request which resulted in this ImagesCreateCustomResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ImagesCreateCustomResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Object value,
            ImagesCreateCustomHeaders headers) {
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
