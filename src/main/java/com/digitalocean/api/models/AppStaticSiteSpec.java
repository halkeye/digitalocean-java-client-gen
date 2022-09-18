package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The AppStaticSiteSpec model.
 */
@Fluent
public final class AppStaticSiteSpec extends AppComponentBase {
    /*
     * The name of the index document to use when serving this static site. Default: index.html
     */
    @JsonProperty(value = "index_document")
    private String indexDocument;

    /*
     * The name of the error document to use when serving this static site. Default: 404.html. If no such file exists
     * within the built assets, App Platform will supply one.
     */
    @JsonProperty(value = "error_document")
    private String errorDocument;

    /*
     * The name of the document to use as the fallback for any requests to documents that are not found when serving
     * this static site. Only 1 of `catchall_document` or `error_document` can be set.
     */
    @JsonProperty(value = "catchall_document")
    private String catchallDocument;

    /*
     * An optional path to where the built assets will be located, relative to the build context. If not set, App
     * Platform will automatically scan for these directory names: `_static`, `dist`, `public`, `build`.
     */
    @JsonProperty(value = "output_dir")
    private String outputDir;

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

    /**
     * Get the indexDocument property: The name of the index document to use when serving this static site. Default:
     * index.html.
     * 
     * @return the indexDocument value.
     */
    public String getIndexDocument() {
        return this.indexDocument;
    }

    /**
     * Set the indexDocument property: The name of the index document to use when serving this static site. Default:
     * index.html.
     * 
     * @param indexDocument the indexDocument value to set.
     * @return the AppStaticSiteSpec object itself.
     */
    public AppStaticSiteSpec setIndexDocument(String indexDocument) {
        this.indexDocument = indexDocument;
        return this;
    }

    /**
     * Get the errorDocument property: The name of the error document to use when serving this static site. Default:
     * 404.html. If no such file exists within the built assets, App Platform will supply one.
     * 
     * @return the errorDocument value.
     */
    public String getErrorDocument() {
        return this.errorDocument;
    }

    /**
     * Set the errorDocument property: The name of the error document to use when serving this static site. Default:
     * 404.html. If no such file exists within the built assets, App Platform will supply one.
     * 
     * @param errorDocument the errorDocument value to set.
     * @return the AppStaticSiteSpec object itself.
     */
    public AppStaticSiteSpec setErrorDocument(String errorDocument) {
        this.errorDocument = errorDocument;
        return this;
    }

    /**
     * Get the catchallDocument property: The name of the document to use as the fallback for any requests to documents
     * that are not found when serving this static site. Only 1 of `catchall_document` or `error_document` can be set.
     * 
     * @return the catchallDocument value.
     */
    public String getCatchallDocument() {
        return this.catchallDocument;
    }

    /**
     * Set the catchallDocument property: The name of the document to use as the fallback for any requests to documents
     * that are not found when serving this static site. Only 1 of `catchall_document` or `error_document` can be set.
     * 
     * @param catchallDocument the catchallDocument value to set.
     * @return the AppStaticSiteSpec object itself.
     */
    public AppStaticSiteSpec setCatchallDocument(String catchallDocument) {
        this.catchallDocument = catchallDocument;
        return this;
    }

    /**
     * Get the outputDir property: An optional path to where the built assets will be located, relative to the build
     * context. If not set, App Platform will automatically scan for these directory names: `_static`, `dist`,
     * `public`, `build`.
     * 
     * @return the outputDir value.
     */
    public String getOutputDir() {
        return this.outputDir;
    }

    /**
     * Set the outputDir property: An optional path to where the built assets will be located, relative to the build
     * context. If not set, App Platform will automatically scan for these directory names: `_static`, `dist`,
     * `public`, `build`.
     * 
     * @param outputDir the outputDir value to set.
     * @return the AppStaticSiteSpec object itself.
     */
    public AppStaticSiteSpec setOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

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
     * @return the AppStaticSiteSpec object itself.
     */
    public AppStaticSiteSpec setCors(AppsCorsPolicy cors) {
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
     * @return the AppStaticSiteSpec object itself.
     */
    public AppStaticSiteSpec setRoutes(List<AppRouteSpec> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppStaticSiteSpec setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppStaticSiteSpec setGit(AppsGitSourceSpec git) {
        super.setGit(git);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppStaticSiteSpec setGithub(AppsGithubSourceSpec github) {
        super.setGithub(github);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppStaticSiteSpec setGitlab(AppsGitlabSourceSpec gitlab) {
        super.setGitlab(gitlab);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppStaticSiteSpec setImage(AppsImageSourceSpec image) {
        super.setImage(image);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppStaticSiteSpec setDockerfilePath(String dockerfilePath) {
        super.setDockerfilePath(dockerfilePath);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppStaticSiteSpec setBuildCommand(String buildCommand) {
        super.setBuildCommand(buildCommand);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppStaticSiteSpec setRunCommand(String runCommand) {
        super.setRunCommand(runCommand);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppStaticSiteSpec setSourceDir(String sourceDir) {
        super.setSourceDir(sourceDir);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppStaticSiteSpec setEnvs(List<AppVariableDefinition> envs) {
        super.setEnvs(envs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppStaticSiteSpec setEnvironmentSlug(String environmentSlug) {
        super.setEnvironmentSlug(environmentSlug);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppStaticSiteSpec setLogDestinations(AppLogDestinationDefinition logDestinations) {
        super.setLogDestinations(logDestinations);
        return this;
    }
}
