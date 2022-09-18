package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The AppsCorsPolicy model.
 */
@Fluent
public final class AppsCorsPolicy {
    /*
     * The set of allowed CORS origins.
     */
    @JsonProperty(value = "allow_origins")
    private List<AppsStringMatch> allowOrigins;

    /*
     * The set of allowed HTTP methods. This configures the `Access-Control-Allow-Methods` header.
     */
    @JsonProperty(value = "allow_methods")
    private List<String> allowMethods;

    /*
     * The set of allowed HTTP request headers. This configures the `Access-Control-Allow-Headers` header.
     */
    @JsonProperty(value = "allow_headers")
    private List<String> allowHeaders;

    /*
     * The set of HTTP response headers that browsers are allowed to access. This configures the
     * `Access-Control-Expose-Headers` header.
     */
    @JsonProperty(value = "expose_headers")
    private List<String> exposeHeaders;

    /*
     * An optional duration specifying how long browsers can cache the results of a preflight request. This configures
     * the `Access-Control-Max-Age` header.
     */
    @JsonProperty(value = "max_age")
    private String maxAge;

    /*
     * Whether browsers should expose the response to the client-side JavaScript code when the request’s credentials
     * mode is include. This configures the `Access-Control-Allow-Credentials` header.
     */
    @JsonProperty(value = "allow_credentials")
    private Boolean allowCredentials;

    /**
     * Get the allowOrigins property: The set of allowed CORS origins.
     * 
     * @return the allowOrigins value.
     */
    public List<AppsStringMatch> getAllowOrigins() {
        return this.allowOrigins;
    }

    /**
     * Set the allowOrigins property: The set of allowed CORS origins.
     * 
     * @param allowOrigins the allowOrigins value to set.
     * @return the AppsCorsPolicy object itself.
     */
    public AppsCorsPolicy setAllowOrigins(List<AppsStringMatch> allowOrigins) {
        this.allowOrigins = allowOrigins;
        return this;
    }

    /**
     * Get the allowMethods property: The set of allowed HTTP methods. This configures the
     * `Access-Control-Allow-Methods` header.
     * 
     * @return the allowMethods value.
     */
    public List<String> getAllowMethods() {
        return this.allowMethods;
    }

    /**
     * Set the allowMethods property: The set of allowed HTTP methods. This configures the
     * `Access-Control-Allow-Methods` header.
     * 
     * @param allowMethods the allowMethods value to set.
     * @return the AppsCorsPolicy object itself.
     */
    public AppsCorsPolicy setAllowMethods(List<String> allowMethods) {
        this.allowMethods = allowMethods;
        return this;
    }

    /**
     * Get the allowHeaders property: The set of allowed HTTP request headers. This configures the
     * `Access-Control-Allow-Headers` header.
     * 
     * @return the allowHeaders value.
     */
    public List<String> getAllowHeaders() {
        return this.allowHeaders;
    }

    /**
     * Set the allowHeaders property: The set of allowed HTTP request headers. This configures the
     * `Access-Control-Allow-Headers` header.
     * 
     * @param allowHeaders the allowHeaders value to set.
     * @return the AppsCorsPolicy object itself.
     */
    public AppsCorsPolicy setAllowHeaders(List<String> allowHeaders) {
        this.allowHeaders = allowHeaders;
        return this;
    }

    /**
     * Get the exposeHeaders property: The set of HTTP response headers that browsers are allowed to access. This
     * configures the `Access-Control-Expose-Headers` header.
     * 
     * @return the exposeHeaders value.
     */
    public List<String> getExposeHeaders() {
        return this.exposeHeaders;
    }

    /**
     * Set the exposeHeaders property: The set of HTTP response headers that browsers are allowed to access. This
     * configures the `Access-Control-Expose-Headers` header.
     * 
     * @param exposeHeaders the exposeHeaders value to set.
     * @return the AppsCorsPolicy object itself.
     */
    public AppsCorsPolicy setExposeHeaders(List<String> exposeHeaders) {
        this.exposeHeaders = exposeHeaders;
        return this;
    }

    /**
     * Get the maxAge property: An optional duration specifying how long browsers can cache the results of a preflight
     * request. This configures the `Access-Control-Max-Age` header.
     * 
     * @return the maxAge value.
     */
    public String getMaxAge() {
        return this.maxAge;
    }

    /**
     * Set the maxAge property: An optional duration specifying how long browsers can cache the results of a preflight
     * request. This configures the `Access-Control-Max-Age` header.
     * 
     * @param maxAge the maxAge value to set.
     * @return the AppsCorsPolicy object itself.
     */
    public AppsCorsPolicy setMaxAge(String maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    /**
     * Get the allowCredentials property: Whether browsers should expose the response to the client-side JavaScript
     * code when the request’s credentials mode is include. This configures the `Access-Control-Allow-Credentials`
     * header.
     * 
     * @return the allowCredentials value.
     */
    public Boolean isAllowCredentials() {
        return this.allowCredentials;
    }

    /**
     * Set the allowCredentials property: Whether browsers should expose the response to the client-side JavaScript
     * code when the request’s credentials mode is include. This configures the `Access-Control-Allow-Credentials`
     * header.
     * 
     * @param allowCredentials the allowCredentials value to set.
     * @return the AppsCorsPolicy object itself.
     */
    public AppsCorsPolicy setAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
        return this;
    }
}
