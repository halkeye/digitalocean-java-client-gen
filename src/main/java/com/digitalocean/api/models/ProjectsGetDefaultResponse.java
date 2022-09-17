package com.digitalocean.api.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the getDefault operation. */
public final class ProjectsGetDefaultResponse extends ResponseBase<ProjectsGetDefaultHeaders, Object> {
    /**
     * Creates an instance of ProjectsGetDefaultResponse.
     *
     * @param request the request which resulted in this ProjectsGetDefaultResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ProjectsGetDefaultResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Object value,
            ProjectsGetDefaultHeaders headers) {
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
