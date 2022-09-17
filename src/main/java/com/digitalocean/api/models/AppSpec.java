package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * AppSpec
 *
 * <p>The desired configuration of an application.
 */
@Fluent
public final class AppSpec {
    /*
     * The name of the app. Must be unique across all apps in the same account.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The slug form of the geographical origin of the app. Default: `nearest available`
     */
    @JsonProperty(value = "region")
    private AppSpecRegion region;

    /*
     * A set of hostnames where the application will be available.
     */
    @JsonProperty(value = "domains")
    private List<AppDomainSpec> domains;

    /*
     * Workloads which expose publicly-accessible HTTP services.
     */
    @JsonProperty(value = "services")
    private List<AppServiceSpec> services;

    /*
     * Content which can be rendered to static web assets.
     */
    @JsonProperty(value = "static_sites")
    private List<AppStaticSiteSpec> staticSites;

    /*
     * Pre and post deployment workloads which do not expose publicly-accessible HTTP routes.
     */
    @JsonProperty(value = "jobs")
    private List<AppJobSpec> jobs;

    /*
     * Workloads which do not expose publicly-accessible HTTP services.
     */
    @JsonProperty(value = "workers")
    private List<AppWorkerSpec> workers;

    /*
     * Workloads which expose publicly-accessible HTTP services via Functions Components.
     */
    @JsonProperty(value = "functions")
    private List<AppFunctionsSpec> functions;

    /*
     * Database instances which can provide persistence to workloads within the
     * application.
     */
    @JsonProperty(value = "databases")
    private List<AppDatabaseSpec> databases;

    /**
     * Get the name property: The name of the app. Must be unique across all apps in the same account.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the app. Must be unique across all apps in the same account.
     *
     * @param name the name value to set.
     * @return the AppSpec object itself.
     */
    public AppSpec setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the region property: The slug form of the geographical origin of the app. Default: `nearest available`.
     *
     * @return the region value.
     */
    public AppSpecRegion getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The slug form of the geographical origin of the app. Default: `nearest available`.
     *
     * @param region the region value to set.
     * @return the AppSpec object itself.
     */
    public AppSpec setRegion(AppSpecRegion region) {
        this.region = region;
        return this;
    }

    /**
     * Get the domains property: A set of hostnames where the application will be available.
     *
     * @return the domains value.
     */
    public List<AppDomainSpec> getDomains() {
        return this.domains;
    }

    /**
     * Set the domains property: A set of hostnames where the application will be available.
     *
     * @param domains the domains value to set.
     * @return the AppSpec object itself.
     */
    public AppSpec setDomains(List<AppDomainSpec> domains) {
        this.domains = domains;
        return this;
    }

    /**
     * Get the services property: Workloads which expose publicly-accessible HTTP services.
     *
     * @return the services value.
     */
    public List<AppServiceSpec> getServices() {
        return this.services;
    }

    /**
     * Set the services property: Workloads which expose publicly-accessible HTTP services.
     *
     * @param services the services value to set.
     * @return the AppSpec object itself.
     */
    public AppSpec setServices(List<AppServiceSpec> services) {
        this.services = services;
        return this;
    }

    /**
     * Get the staticSites property: Content which can be rendered to static web assets.
     *
     * @return the staticSites value.
     */
    public List<AppStaticSiteSpec> getStaticSites() {
        return this.staticSites;
    }

    /**
     * Set the staticSites property: Content which can be rendered to static web assets.
     *
     * @param staticSites the staticSites value to set.
     * @return the AppSpec object itself.
     */
    public AppSpec setStaticSites(List<AppStaticSiteSpec> staticSites) {
        this.staticSites = staticSites;
        return this;
    }

    /**
     * Get the jobs property: Pre and post deployment workloads which do not expose publicly-accessible HTTP routes.
     *
     * @return the jobs value.
     */
    public List<AppJobSpec> getJobs() {
        return this.jobs;
    }

    /**
     * Set the jobs property: Pre and post deployment workloads which do not expose publicly-accessible HTTP routes.
     *
     * @param jobs the jobs value to set.
     * @return the AppSpec object itself.
     */
    public AppSpec setJobs(List<AppJobSpec> jobs) {
        this.jobs = jobs;
        return this;
    }

    /**
     * Get the workers property: Workloads which do not expose publicly-accessible HTTP services.
     *
     * @return the workers value.
     */
    public List<AppWorkerSpec> getWorkers() {
        return this.workers;
    }

    /**
     * Set the workers property: Workloads which do not expose publicly-accessible HTTP services.
     *
     * @param workers the workers value to set.
     * @return the AppSpec object itself.
     */
    public AppSpec setWorkers(List<AppWorkerSpec> workers) {
        this.workers = workers;
        return this;
    }

    /**
     * Get the functions property: Workloads which expose publicly-accessible HTTP services via Functions Components.
     *
     * @return the functions value.
     */
    public List<AppFunctionsSpec> getFunctions() {
        return this.functions;
    }

    /**
     * Set the functions property: Workloads which expose publicly-accessible HTTP services via Functions Components.
     *
     * @param functions the functions value to set.
     * @return the AppSpec object itself.
     */
    public AppSpec setFunctions(List<AppFunctionsSpec> functions) {
        this.functions = functions;
        return this;
    }

    /**
     * Get the databases property: Database instances which can provide persistence to workloads within the application.
     *
     * @return the databases value.
     */
    public List<AppDatabaseSpec> getDatabases() {
        return this.databases;
    }

    /**
     * Set the databases property: Database instances which can provide persistence to workloads within the application.
     *
     * @param databases the databases value to set.
     * @return the AppSpec object itself.
     */
    public AppSpec setDatabases(List<AppDatabaseSpec> databases) {
        this.databases = databases;
        return this;
    }
}
