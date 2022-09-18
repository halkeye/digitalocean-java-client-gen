package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The AppFunctionsSpec model.
 */
@Fluent
public final class AppFunctionsSpec {
    /*
     * The cors property.
     */
    @JsonProperty(value = "cors")
    private AppsCorsPolicy cors;

    /*
     * A list of HTTP routes that should be routed to this component.
     */
    @JsonProperty(value = "routes")
    private List<AppRouteSpec> routes;

    /*
     * The name. Must be unique across all components within the same app.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * An optional path to the working directory to use for the build. For Dockerfile builds, this will be used as the
     * build context. Must be relative to the root of the repo.
     */
    @JsonProperty(value = "source_dir")
    private String sourceDir;

    /*
     * The alerts property.
     */
    @JsonProperty(value = "alerts")
    private List<AppAlertSpec> alerts;

    /*
     * A list of environment variables made available to the component.
     */
    @JsonProperty(value = "envs")
    private List<AppVariableDefinition> envs;

    /*
     * The git property.
     */
    @JsonProperty(value = "git")
    private AppsGitSourceSpec git;

    /*
     * The github property.
     */
    @JsonProperty(value = "github")
    private AppsGithubSourceSpec github;

    /*
     * The gitlab property.
     */
    @JsonProperty(value = "gitlab")
    private AppsGitlabSourceSpec gitlab;

    /*
     * Configurations for external logging.
     */
    @JsonProperty(value = "log_destinations")
    private AppLogDestinationDefinition logDestinations;

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
     * @return the AppFunctionsSpec object itself.
     */
    public AppFunctionsSpec setCors(AppsCorsPolicy cors) {
        this.cors = cors;
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
     * @return the AppFunctionsSpec object itself.
     */
    public AppFunctionsSpec setRoutes(List<AppRouteSpec> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the name property: The name. Must be unique across all components within the same app.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name. Must be unique across all components within the same app.
     * 
     * @param name the name value to set.
     * @return the AppFunctionsSpec object itself.
     */
    public AppFunctionsSpec setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the sourceDir property: An optional path to the working directory to use for the build. For Dockerfile
     * builds, this will be used as the build context. Must be relative to the root of the repo.
     * 
     * @return the sourceDir value.
     */
    public String getSourceDir() {
        return this.sourceDir;
    }

    /**
     * Set the sourceDir property: An optional path to the working directory to use for the build. For Dockerfile
     * builds, this will be used as the build context. Must be relative to the root of the repo.
     * 
     * @param sourceDir the sourceDir value to set.
     * @return the AppFunctionsSpec object itself.
     */
    public AppFunctionsSpec setSourceDir(String sourceDir) {
        this.sourceDir = sourceDir;
        return this;
    }

    /**
     * Get the alerts property: The alerts property.
     * 
     * @return the alerts value.
     */
    public List<AppAlertSpec> getAlerts() {
        return this.alerts;
    }

    /**
     * Set the alerts property: The alerts property.
     * 
     * @param alerts the alerts value to set.
     * @return the AppFunctionsSpec object itself.
     */
    public AppFunctionsSpec setAlerts(List<AppAlertSpec> alerts) {
        this.alerts = alerts;
        return this;
    }

    /**
     * Get the envs property: A list of environment variables made available to the component.
     * 
     * @return the envs value.
     */
    public List<AppVariableDefinition> getEnvs() {
        return this.envs;
    }

    /**
     * Set the envs property: A list of environment variables made available to the component.
     * 
     * @param envs the envs value to set.
     * @return the AppFunctionsSpec object itself.
     */
    public AppFunctionsSpec setEnvs(List<AppVariableDefinition> envs) {
        this.envs = envs;
        return this;
    }

    /**
     * Get the git property: The git property.
     * 
     * @return the git value.
     */
    public AppsGitSourceSpec getGit() {
        return this.git;
    }

    /**
     * Set the git property: The git property.
     * 
     * @param git the git value to set.
     * @return the AppFunctionsSpec object itself.
     */
    public AppFunctionsSpec setGit(AppsGitSourceSpec git) {
        this.git = git;
        return this;
    }

    /**
     * Get the github property: The github property.
     * 
     * @return the github value.
     */
    public AppsGithubSourceSpec getGithub() {
        return this.github;
    }

    /**
     * Set the github property: The github property.
     * 
     * @param github the github value to set.
     * @return the AppFunctionsSpec object itself.
     */
    public AppFunctionsSpec setGithub(AppsGithubSourceSpec github) {
        this.github = github;
        return this;
    }

    /**
     * Get the gitlab property: The gitlab property.
     * 
     * @return the gitlab value.
     */
    public AppsGitlabSourceSpec getGitlab() {
        return this.gitlab;
    }

    /**
     * Set the gitlab property: The gitlab property.
     * 
     * @param gitlab the gitlab value to set.
     * @return the AppFunctionsSpec object itself.
     */
    public AppFunctionsSpec setGitlab(AppsGitlabSourceSpec gitlab) {
        this.gitlab = gitlab;
        return this;
    }

    /**
     * Get the logDestinations property: Configurations for external logging.
     * 
     * @return the logDestinations value.
     */
    public AppLogDestinationDefinition getLogDestinations() {
        return this.logDestinations;
    }

    /**
     * Set the logDestinations property: Configurations for external logging.
     * 
     * @param logDestinations the logDestinations value to set.
     * @return the AppFunctionsSpec object itself.
     */
    public AppFunctionsSpec setLogDestinations(AppLogDestinationDefinition logDestinations) {
        this.logDestinations = logDestinations;
        return this;
    }
}
