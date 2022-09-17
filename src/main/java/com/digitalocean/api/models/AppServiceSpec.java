package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AppServiceSpec model. */
@Fluent
public final class AppServiceSpec extends AppComponentBase {
    /*
     * The cors property.
     */
    @JsonProperty(value = "cors")
    private AppsCorsPolicy cors;

    /*
     * The health_check property.
     */
    @JsonProperty(value = "health_check")
    private AppServiceSpecHealthCheck healthCheck;

    /*
     * The internal port on which this service's run command will listen. Default: 8080
     * If there is not an environment variable with the name `PORT`, one will be automatically added with its value set
     * to the value of this field.
     */
    @JsonProperty(value = "http_port")
    private Long httpPort;

    /*
     * The ports on which this service will listen for internal traffic.
     */
    @JsonProperty(value = "internal_ports")
    private List<Long> internalPorts;

    /*
     * A list of HTTP routes that should be routed to this component.
     */
    @JsonProperty(value = "routes")
    private List<AppRouteSpec> routes;

    /*
     * The amount of instances that this component should be scaled to. Default: 1
     */
    @JsonProperty(value = "instance_count")
    private Long instanceCount;

    /*
     * The instance size to use for this component. Default: `basic-xxs`
     */
    @JsonProperty(value = "instance_size_slug")
    private AppComponentInstanceBaseInstanceSizeSlug instanceSizeSlug;

    /**
     * Get the cors property: The cors property.
     *
     * @return the cors value.
     */
    public AppsCorsPolicy getCors() {
        return this.cors;
    }

    /**
     * Set the cors property: The cors property.
     *
     * @param cors the cors value to set.
     * @return the AppServiceSpec object itself.
     */
    public AppServiceSpec setCors(AppsCorsPolicy cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the healthCheck property: The health_check property.
     *
     * @return the healthCheck value.
     */
    public AppServiceSpecHealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * Set the healthCheck property: The health_check property.
     *
     * @param healthCheck the healthCheck value to set.
     * @return the AppServiceSpec object itself.
     */
    public AppServiceSpec setHealthCheck(AppServiceSpecHealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    /**
     * Get the httpPort property: The internal port on which this service's run command will listen. Default: 8080 If
     * there is not an environment variable with the name `PORT`, one will be automatically added with its value set to
     * the value of this field.
     *
     * @return the httpPort value.
     */
    public Long getHttpPort() {
        return this.httpPort;
    }

    /**
     * Set the httpPort property: The internal port on which this service's run command will listen. Default: 8080 If
     * there is not an environment variable with the name `PORT`, one will be automatically added with its value set to
     * the value of this field.
     *
     * @param httpPort the httpPort value to set.
     * @return the AppServiceSpec object itself.
     */
    public AppServiceSpec setHttpPort(Long httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * Get the internalPorts property: The ports on which this service will listen for internal traffic.
     *
     * @return the internalPorts value.
     */
    public List<Long> getInternalPorts() {
        return this.internalPorts;
    }

    /**
     * Set the internalPorts property: The ports on which this service will listen for internal traffic.
     *
     * @param internalPorts the internalPorts value to set.
     * @return the AppServiceSpec object itself.
     */
    public AppServiceSpec setInternalPorts(List<Long> internalPorts) {
        this.internalPorts = internalPorts;
        return this;
    }

    /**
     * Get the routes property: A list of HTTP routes that should be routed to this component.
     *
     * @return the routes value.
     */
    public List<AppRouteSpec> getRoutes() {
        return this.routes;
    }

    /**
     * Set the routes property: A list of HTTP routes that should be routed to this component.
     *
     * @param routes the routes value to set.
     * @return the AppServiceSpec object itself.
     */
    public AppServiceSpec setRoutes(List<AppRouteSpec> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the instanceCount property: The amount of instances that this component should be scaled to. Default: 1.
     *
     * @return the instanceCount value.
     */
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: The amount of instances that this component should be scaled to. Default: 1.
     *
     * @param instanceCount the instanceCount value to set.
     * @return the AppServiceSpec object itself.
     */
    public AppServiceSpec setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Get the instanceSizeSlug property: The instance size to use for this component. Default: `basic-xxs`.
     *
     * @return the instanceSizeSlug value.
     */
    public AppComponentInstanceBaseInstanceSizeSlug getInstanceSizeSlug() {
        return this.instanceSizeSlug;
    }

    /**
     * Set the instanceSizeSlug property: The instance size to use for this component. Default: `basic-xxs`.
     *
     * @param instanceSizeSlug the instanceSizeSlug value to set.
     * @return the AppServiceSpec object itself.
     */
    public AppServiceSpec setInstanceSizeSlug(AppComponentInstanceBaseInstanceSizeSlug instanceSizeSlug) {
        this.instanceSizeSlug = instanceSizeSlug;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceSpec setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceSpec setGit(AppsGitSourceSpec git) {
        super.setGit(git);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceSpec setGithub(AppsGithubSourceSpec github) {
        super.setGithub(github);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceSpec setGitlab(AppsGitlabSourceSpec gitlab) {
        super.setGitlab(gitlab);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceSpec setImage(AppsImageSourceSpec image) {
        super.setImage(image);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceSpec setDockerfilePath(String dockerfilePath) {
        super.setDockerfilePath(dockerfilePath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceSpec setBuildCommand(String buildCommand) {
        super.setBuildCommand(buildCommand);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceSpec setRunCommand(String runCommand) {
        super.setRunCommand(runCommand);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceSpec setSourceDir(String sourceDir) {
        super.setSourceDir(sourceDir);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceSpec setEnvs(List<AppVariableDefinition> envs) {
        super.setEnvs(envs);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceSpec setEnvironmentSlug(String environmentSlug) {
        super.setEnvironmentSlug(environmentSlug);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceSpec setLogDestinations(AppLogDestinationDefinition logDestinations) {
        super.setLogDestinations(logDestinations);
        return this;
    }
}
