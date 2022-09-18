package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * A criterion for routing HTTP traffic to a component.
 */
@Fluent
public final class AppRouteSpec {
    /*
     * An HTTP path prefix. Paths must start with / and must be unique across all components within an app.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * An optional flag to preserve the path that is forwarded to the backend service. By default, the HTTP request
     * path will be trimmed from the left when forwarded to the component. For example, a component with `path=/api`
     * will have requests to `/api/list` trimmed to `/list`. If this value is `true`, the path will remain `/api/list`.
     */
    @JsonProperty(value = "preserve_path_prefix")
    private Boolean preservePathPrefix;

    /**
     * Get the path property: An HTTP path prefix. Paths must start with / and must be unique across all components
     * within an app.
     * 
     * @return the path value.
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Set the path property: An HTTP path prefix. Paths must start with / and must be unique across all components
     * within an app.
     * 
     * @param path the path value to set.
     * @return the AppRouteSpec object itself.
     */
    public AppRouteSpec setPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the preservePathPrefix property: An optional flag to preserve the path that is forwarded to the backend
     * service. By default, the HTTP request path will be trimmed from the left when forwarded to the component. For
     * example, a component with `path=/api` will have requests to `/api/list` trimmed to `/list`. If this value is
     * `true`, the path will remain `/api/list`.
     * 
     * @return the preservePathPrefix value.
     */
    public Boolean isPreservePathPrefix() {
        return this.preservePathPrefix;
    }

    /**
     * Set the preservePathPrefix property: An optional flag to preserve the path that is forwarded to the backend
     * service. By default, the HTTP request path will be trimmed from the left when forwarded to the component. For
     * example, a component with `path=/api` will have requests to `/api/list` trimmed to `/list`. If this value is
     * `true`, the path will remain `/api/list`.
     * 
     * @param preservePathPrefix the preservePathPrefix value to set.
     * @return the AppRouteSpec object itself.
     */
    public AppRouteSpec setPreservePathPrefix(Boolean preservePathPrefix) {
        this.preservePathPrefix = preservePathPrefix;
        return this;
    }
}
