package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * Logtail configuration.
 */
@Fluent
public final class AppLogDestinationLogtailSpec {
    /*
     * Logtail token.
     */
    @JsonProperty(value = "token")
    private String token;

    /**
     * Get the token property: Logtail token.
     * 
     * @return the token value.
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Set the token property: Logtail token.
     * 
     * @param token the token value to set.
     * @return the AppLogDestinationLogtailSpec object itself.
     */
    public AppLogDestinationLogtailSpec setToken(String token) {
        this.token = token;
        return this;
    }
}
