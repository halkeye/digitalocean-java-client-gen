package com.digitalocean.api.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the getAvailableUpgrades operation.
 */
public final class KubernetesGetAvailableUpgradesResponse extends ResponseBase<KubernetesGetAvailableUpgradesHeaders, Object> {
    /**
     * Creates an instance of KubernetesGetAvailableUpgradesResponse.
     * 
     * @param request the request which resulted in this KubernetesGetAvailableUpgradesResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public KubernetesGetAvailableUpgradesResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Object value, KubernetesGetAvailableUpgradesHeaders headers) {
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
