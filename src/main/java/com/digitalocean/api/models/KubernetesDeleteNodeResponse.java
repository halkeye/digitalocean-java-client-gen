package com.digitalocean.api.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the deleteNode operation.
 */
public final class KubernetesDeleteNodeResponse extends ResponseBase<KubernetesDeleteNodeHeaders, Error> {
    /**
     * Creates an instance of KubernetesDeleteNodeResponse.
     * 
     * @param request the request which resulted in this KubernetesDeleteNodeResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public KubernetesDeleteNodeResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Error value, KubernetesDeleteNodeHeaders headers) {
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
