package com.digitalocean.api.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the recycleNodePool operation. */
public final class KubernetesRecycleNodePoolResponse extends ResponseBase<KubernetesRecycleNodePoolHeaders, Error> {
    /**
     * Creates an instance of KubernetesRecycleNodePoolResponse.
     *
     * @param request the request which resulted in this KubernetesRecycleNodePoolResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public KubernetesRecycleNodePoolResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Error value,
            KubernetesRecycleNodePoolHeaders headers) {
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
