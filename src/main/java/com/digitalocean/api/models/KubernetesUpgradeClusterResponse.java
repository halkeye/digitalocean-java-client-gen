package com.digitalocean.api.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the upgradeCluster operation.
 */
public final class KubernetesUpgradeClusterResponse extends ResponseBase<KubernetesUpgradeClusterHeaders, Error> {
    /**
     * Creates an instance of KubernetesUpgradeClusterResponse.
     * 
     * @param request the request which resulted in this KubernetesUpgradeClusterResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public KubernetesUpgradeClusterResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Error value, KubernetesUpgradeClusterHeaders headers) {
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
