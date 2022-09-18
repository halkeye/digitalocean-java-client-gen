package com.digitalocean.api;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * Initializes a new instance of the GeneratedClient type.
 */
public final class GeneratedClient {
    /**
     * server parameter.
     */
    private final String host;

    /**
     * Gets server parameter.
     * 
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The OneClicksOperations object to access its operations.
     */
    private final OneClicksOperations oneClicksOperations;

    /**
     * Gets the OneClicksOperations object to access its operations.
     * 
     * @return the OneClicksOperations object.
     */
    public OneClicksOperations getOneClicksOperations() {
        return this.oneClicksOperations;
    }

    /**
     * The Accounts object to access its operations.
     */
    private final Accounts accounts;

    /**
     * Gets the Accounts object to access its operations.
     * 
     * @return the Accounts object.
     */
    public Accounts getAccounts() {
        return this.accounts;
    }

    /**
     * The SshKeysOperations object to access its operations.
     */
    private final SshKeysOperations sshKeysOperations;

    /**
     * Gets the SshKeysOperations object to access its operations.
     * 
     * @return the SshKeysOperations object.
     */
    public SshKeysOperations getSshKeysOperations() {
        return this.sshKeysOperations;
    }

    /**
     * The Actions object to access its operations.
     */
    private final Actions actions;

    /**
     * Gets the Actions object to access its operations.
     * 
     * @return the Actions object.
     */
    public Actions getActions() {
        return this.actions;
    }

    /**
     * The Apps object to access its operations.
     */
    private final Apps apps;

    /**
     * Gets the Apps object to access its operations.
     * 
     * @return the Apps object.
     */
    public Apps getApps() {
        return this.apps;
    }

    /**
     * The Cdns object to access its operations.
     */
    private final Cdns cdns;

    /**
     * Gets the Cdns object to access its operations.
     * 
     * @return the Cdns object.
     */
    public Cdns getCdns() {
        return this.cdns;
    }

    /**
     * The Certificates object to access its operations.
     */
    private final Certificates certificates;

    /**
     * Gets the Certificates object to access its operations.
     * 
     * @return the Certificates object.
     */
    public Certificates getCertificates() {
        return this.certificates;
    }

    /**
     * The Balances object to access its operations.
     */
    private final Balances balances;

    /**
     * Gets the Balances object to access its operations.
     * 
     * @return the Balances object.
     */
    public Balances getBalances() {
        return this.balances;
    }

    /**
     * The BillingHistories object to access its operations.
     */
    private final BillingHistories billingHistories;

    /**
     * Gets the BillingHistories object to access its operations.
     * 
     * @return the BillingHistories object.
     */
    public BillingHistories getBillingHistories() {
        return this.billingHistories;
    }

    /**
     * The Invoices object to access its operations.
     */
    private final Invoices invoices;

    /**
     * Gets the Invoices object to access its operations.
     * 
     * @return the Invoices object.
     */
    public Invoices getInvoices() {
        return this.invoices;
    }

    /**
     * The Databases object to access its operations.
     */
    private final Databases databases;

    /**
     * Gets the Databases object to access its operations.
     * 
     * @return the Databases object.
     */
    public Databases getDatabases() {
        return this.databases;
    }

    /**
     * The Domains object to access its operations.
     */
    private final Domains domains;

    /**
     * Gets the Domains object to access its operations.
     * 
     * @return the Domains object.
     */
    public Domains getDomains() {
        return this.domains;
    }

    /**
     * The Droplets object to access its operations.
     */
    private final Droplets droplets;

    /**
     * Gets the Droplets object to access its operations.
     * 
     * @return the Droplets object.
     */
    public Droplets getDroplets() {
        return this.droplets;
    }

    /**
     * The DropletActions object to access its operations.
     */
    private final DropletActions dropletActions;

    /**
     * Gets the DropletActions object to access its operations.
     * 
     * @return the DropletActions object.
     */
    public DropletActions getDropletActions() {
        return this.dropletActions;
    }

    /**
     * The Firewalls object to access its operations.
     */
    private final Firewalls firewalls;

    /**
     * Gets the Firewalls object to access its operations.
     * 
     * @return the Firewalls object.
     */
    public Firewalls getFirewalls() {
        return this.firewalls;
    }

    /**
     * The Images object to access its operations.
     */
    private final Images images;

    /**
     * Gets the Images object to access its operations.
     * 
     * @return the Images object.
     */
    public Images getImages() {
        return this.images;
    }

    /**
     * The ImageActions object to access its operations.
     */
    private final ImageActions imageActions;

    /**
     * Gets the ImageActions object to access its operations.
     * 
     * @return the ImageActions object.
     */
    public ImageActions getImageActions() {
        return this.imageActions;
    }

    /**
     * The Kubernetes object to access its operations.
     */
    private final Kubernetes kubernetes;

    /**
     * Gets the Kubernetes object to access its operations.
     * 
     * @return the Kubernetes object.
     */
    public Kubernetes getKubernetes() {
        return this.kubernetes;
    }

    /**
     * The LoadBalancers object to access its operations.
     */
    private final LoadBalancers loadBalancers;

    /**
     * Gets the LoadBalancers object to access its operations.
     * 
     * @return the LoadBalancers object.
     */
    public LoadBalancers getLoadBalancers() {
        return this.loadBalancers;
    }

    /**
     * The Monitorings object to access its operations.
     */
    private final Monitorings monitorings;

    /**
     * Gets the Monitorings object to access its operations.
     * 
     * @return the Monitorings object.
     */
    public Monitorings getMonitorings() {
        return this.monitorings;
    }

    /**
     * The Projects object to access its operations.
     */
    private final Projects projects;

    /**
     * Gets the Projects object to access its operations.
     * 
     * @return the Projects object.
     */
    public Projects getProjects() {
        return this.projects;
    }

    /**
     * The Regions object to access its operations.
     */
    private final Regions regions;

    /**
     * Gets the Regions object to access its operations.
     * 
     * @return the Regions object.
     */
    public Regions getRegions() {
        return this.regions;
    }

    /**
     * The Registries object to access its operations.
     */
    private final Registries registries;

    /**
     * Gets the Registries object to access its operations.
     * 
     * @return the Registries object.
     */
    public Registries getRegistries() {
        return this.registries;
    }

    /**
     * The ReservedIPs object to access its operations.
     */
    private final ReservedIPs reservedIPs;

    /**
     * Gets the ReservedIPs object to access its operations.
     * 
     * @return the ReservedIPs object.
     */
    public ReservedIPs getReservedIPs() {
        return this.reservedIPs;
    }

    /**
     * The ReservedIPsActions object to access its operations.
     */
    private final ReservedIPsActions reservedIPsActions;

    /**
     * Gets the ReservedIPsActions object to access its operations.
     * 
     * @return the ReservedIPsActions object.
     */
    public ReservedIPsActions getReservedIPsActions() {
        return this.reservedIPsActions;
    }

    /**
     * The Sizes object to access its operations.
     */
    private final Sizes sizes;

    /**
     * Gets the Sizes object to access its operations.
     * 
     * @return the Sizes object.
     */
    public Sizes getSizes() {
        return this.sizes;
    }

    /**
     * The SnapshotsOperations object to access its operations.
     */
    private final SnapshotsOperations snapshotsOperations;

    /**
     * Gets the SnapshotsOperations object to access its operations.
     * 
     * @return the SnapshotsOperations object.
     */
    public SnapshotsOperations getSnapshotsOperations() {
        return this.snapshotsOperations;
    }

    /**
     * The TagsOperations object to access its operations.
     */
    private final TagsOperations tagsOperations;

    /**
     * Gets the TagsOperations object to access its operations.
     * 
     * @return the TagsOperations object.
     */
    public TagsOperations getTagsOperations() {
        return this.tagsOperations;
    }

    /**
     * The Volumes object to access its operations.
     */
    private final Volumes volumes;

    /**
     * Gets the Volumes object to access its operations.
     * 
     * @return the Volumes object.
     */
    public Volumes getVolumes() {
        return this.volumes;
    }

    /**
     * The VolumeActions object to access its operations.
     */
    private final VolumeActions volumeActions;

    /**
     * Gets the VolumeActions object to access its operations.
     * 
     * @return the VolumeActions object.
     */
    public VolumeActions getVolumeActions() {
        return this.volumeActions;
    }

    /**
     * The VolumeSnapshots object to access its operations.
     */
    private final VolumeSnapshots volumeSnapshots;

    /**
     * Gets the VolumeSnapshots object to access its operations.
     * 
     * @return the VolumeSnapshots object.
     */
    public VolumeSnapshots getVolumeSnapshots() {
        return this.volumeSnapshots;
    }

    /**
     * The Vpcs object to access its operations.
     */
    private final Vpcs vpcs;

    /**
     * Gets the Vpcs object to access its operations.
     * 
     * @return the Vpcs object.
     */
    public Vpcs getVpcs() {
        return this.vpcs;
    }

    /**
     * Initializes an instance of GeneratedClient client.
     * 
     * @param host server parameter.
     */
     GeneratedClient(String host) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build(), JacksonAdapter.createDefaultSerializerAdapter(), host);
    }

    /**
     * Initializes an instance of GeneratedClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param host server parameter.
     */
     GeneratedClient(HttpPipeline httpPipeline, String host) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), host);
    }

    /**
     * Initializes an instance of GeneratedClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param host server parameter.
     */
     GeneratedClient(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String host) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.host = host;
        this.oneClicksOperations = new OneClicksOperations(this);
        this.accounts = new Accounts(this);
        this.sshKeysOperations = new SshKeysOperations(this);
        this.actions = new Actions(this);
        this.apps = new Apps(this);
        this.cdns = new Cdns(this);
        this.certificates = new Certificates(this);
        this.balances = new Balances(this);
        this.billingHistories = new BillingHistories(this);
        this.invoices = new Invoices(this);
        this.databases = new Databases(this);
        this.domains = new Domains(this);
        this.droplets = new Droplets(this);
        this.dropletActions = new DropletActions(this);
        this.firewalls = new Firewalls(this);
        this.images = new Images(this);
        this.imageActions = new ImageActions(this);
        this.kubernetes = new Kubernetes(this);
        this.loadBalancers = new LoadBalancers(this);
        this.monitorings = new Monitorings(this);
        this.projects = new Projects(this);
        this.regions = new Regions(this);
        this.registries = new Registries(this);
        this.reservedIPs = new ReservedIPs(this);
        this.reservedIPsActions = new ReservedIPsActions(this);
        this.sizes = new Sizes(this);
        this.snapshotsOperations = new SnapshotsOperations(this);
        this.tagsOperations = new TagsOperations(this);
        this.volumes = new Volumes(this);
        this.volumeActions = new VolumeActions(this);
        this.volumeSnapshots = new VolumeSnapshots(this);
        this.vpcs = new Vpcs(this);
    }
}
