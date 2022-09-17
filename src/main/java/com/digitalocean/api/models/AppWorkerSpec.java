package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AppWorkerSpec model. */
@Fluent
public final class AppWorkerSpec extends AppComponentBase {
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
     * @return the AppWorkerSpec object itself.
     */
    public AppWorkerSpec setInstanceCount(Long instanceCount) {
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
     * @return the AppWorkerSpec object itself.
     */
    public AppWorkerSpec setInstanceSizeSlug(AppComponentInstanceBaseInstanceSizeSlug instanceSizeSlug) {
        this.instanceSizeSlug = instanceSizeSlug;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppWorkerSpec setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppWorkerSpec setGit(AppsGitSourceSpec git) {
        super.setGit(git);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppWorkerSpec setGithub(AppsGithubSourceSpec github) {
        super.setGithub(github);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppWorkerSpec setGitlab(AppsGitlabSourceSpec gitlab) {
        super.setGitlab(gitlab);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppWorkerSpec setImage(AppsImageSourceSpec image) {
        super.setImage(image);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppWorkerSpec setDockerfilePath(String dockerfilePath) {
        super.setDockerfilePath(dockerfilePath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppWorkerSpec setBuildCommand(String buildCommand) {
        super.setBuildCommand(buildCommand);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppWorkerSpec setRunCommand(String runCommand) {
        super.setRunCommand(runCommand);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppWorkerSpec setSourceDir(String sourceDir) {
        super.setSourceDir(sourceDir);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppWorkerSpec setEnvs(List<AppVariableDefinition> envs) {
        super.setEnvs(envs);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppWorkerSpec setEnvironmentSlug(String environmentSlug) {
        super.setEnvironmentSlug(environmentSlug);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppWorkerSpec setLogDestinations(AppLogDestinationDefinition logDestinations) {
        super.setLogDestinations(logDestinations);
        return this;
    }
}
