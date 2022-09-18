package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The AppComponentBase model.
 */
@Fluent
public class AppComponentBase {
    /*
     * The name. Must be unique across all components within the same app.
     */
    @JsonProperty(value = "name")
    private String name;

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
     * The image property.
     */
    @JsonProperty(value = "image")
    private AppsImageSourceSpec image;

    /*
     * The path to the Dockerfile relative to the root of the repo. If set, it will be used to build this component.
     * Otherwise, App Platform will attempt to build it using buildpacks.
     */
    @JsonProperty(value = "dockerfile_path")
    private String dockerfilePath;

    /*
     * An optional build command to run while building this component from source.
     */
    @JsonProperty(value = "build_command")
    private String buildCommand;

    /*
     * An optional run command to override the component's default.
     */
    @JsonProperty(value = "run_command")
    private String runCommand;

    /*
     * An optional path to the working directory to use for the build. For Dockerfile builds, this will be used as the
     * build context. Must be relative to the root of the repo.
     */
    @JsonProperty(value = "source_dir")
    private String sourceDir;

    /*
     * A list of environment variables made available to the component.
     */
    @JsonProperty(value = "envs")
    private List<AppVariableDefinition> envs;

    /*
     * An environment slug describing the type of this app. For a full list, please refer to [the product
     * documentation](https://www.digitalocean.com/docs/app-platform/).
     */
    @JsonProperty(value = "environment_slug")
    private String environmentSlug;

    /*
     * Configurations for external logging.
     */
    @JsonProperty(value = "log_destinations")
    private AppLogDestinationDefinition logDestinations;

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
     * @return the AppComponentBase object itself.
     */
    public AppComponentBase setName(String name) {
        this.name = name;
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
     * @return the AppComponentBase object itself.
     */
    public AppComponentBase setGit(AppsGitSourceSpec git) {
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
     * @return the AppComponentBase object itself.
     */
    public AppComponentBase setGithub(AppsGithubSourceSpec github) {
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
     * @return the AppComponentBase object itself.
     */
    public AppComponentBase setGitlab(AppsGitlabSourceSpec gitlab) {
        this.gitlab = gitlab;
        return this;
    }

    /**
     * Get the image property: The image property.
     * 
     * @return the image value.
     */
    public AppsImageSourceSpec getImage() {
        return this.image;
    }

    /**
     * Set the image property: The image property.
     * 
     * @param image the image value to set.
     * @return the AppComponentBase object itself.
     */
    public AppComponentBase setImage(AppsImageSourceSpec image) {
        this.image = image;
        return this;
    }

    /**
     * Get the dockerfilePath property: The path to the Dockerfile relative to the root of the repo. If set, it will be
     * used to build this component. Otherwise, App Platform will attempt to build it using buildpacks.
     * 
     * @return the dockerfilePath value.
     */
    public String getDockerfilePath() {
        return this.dockerfilePath;
    }

    /**
     * Set the dockerfilePath property: The path to the Dockerfile relative to the root of the repo. If set, it will be
     * used to build this component. Otherwise, App Platform will attempt to build it using buildpacks.
     * 
     * @param dockerfilePath the dockerfilePath value to set.
     * @return the AppComponentBase object itself.
     */
    public AppComponentBase setDockerfilePath(String dockerfilePath) {
        this.dockerfilePath = dockerfilePath;
        return this;
    }

    /**
     * Get the buildCommand property: An optional build command to run while building this component from source.
     * 
     * @return the buildCommand value.
     */
    public String getBuildCommand() {
        return this.buildCommand;
    }

    /**
     * Set the buildCommand property: An optional build command to run while building this component from source.
     * 
     * @param buildCommand the buildCommand value to set.
     * @return the AppComponentBase object itself.
     */
    public AppComponentBase setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }

    /**
     * Get the runCommand property: An optional run command to override the component's default.
     * 
     * @return the runCommand value.
     */
    public String getRunCommand() {
        return this.runCommand;
    }

    /**
     * Set the runCommand property: An optional run command to override the component's default.
     * 
     * @param runCommand the runCommand value to set.
     * @return the AppComponentBase object itself.
     */
    public AppComponentBase setRunCommand(String runCommand) {
        this.runCommand = runCommand;
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
     * @return the AppComponentBase object itself.
     */
    public AppComponentBase setSourceDir(String sourceDir) {
        this.sourceDir = sourceDir;
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
     * @return the AppComponentBase object itself.
     */
    public AppComponentBase setEnvs(List<AppVariableDefinition> envs) {
        this.envs = envs;
        return this;
    }

    /**
     * Get the environmentSlug property: An environment slug describing the type of this app. For a full list, please
     * refer to [the product documentation](https://www.digitalocean.com/docs/app-platform/).
     * 
     * @return the environmentSlug value.
     */
    public String getEnvironmentSlug() {
        return this.environmentSlug;
    }

    /**
     * Set the environmentSlug property: An environment slug describing the type of this app. For a full list, please
     * refer to [the product documentation](https://www.digitalocean.com/docs/app-platform/).
     * 
     * @param environmentSlug the environmentSlug value to set.
     * @return the AppComponentBase object itself.
     */
    public AppComponentBase setEnvironmentSlug(String environmentSlug) {
        this.environmentSlug = environmentSlug;
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
     * @return the AppComponentBase object itself.
     */
    public AppComponentBase setLogDestinations(AppLogDestinationDefinition logDestinations) {
        this.logDestinations = logDestinations;
        return this;
    }
}
