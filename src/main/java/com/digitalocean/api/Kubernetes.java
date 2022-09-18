package com.digitalocean.api;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.digitalocean.api.models.Cluster;
import com.digitalocean.api.models.ClusterlintRequest;
import com.digitalocean.api.models.ClusterRegistries;
import com.digitalocean.api.models.ClusterUpdate;
import com.digitalocean.api.models.DestroyAssociatedKubernetesResources;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.KubernetesAddNodePoolResponse;
import com.digitalocean.api.models.KubernetesAddRegistryResponse;
import com.digitalocean.api.models.KubernetesCreateClusterResponse;
import com.digitalocean.api.models.KubernetesDeleteClusterResponse;
import com.digitalocean.api.models.KubernetesDeleteNodePoolResponse;
import com.digitalocean.api.models.KubernetesDeleteNodeResponse;
import com.digitalocean.api.models.KubernetesDestroyAssociatedResourcesDangerousResponse;
import com.digitalocean.api.models.KubernetesDestroyAssociatedResourcesSelectiveResponse;
import com.digitalocean.api.models.KubernetesGetAvailableUpgradesResponse;
import com.digitalocean.api.models.KubernetesGetClusterLintResultsResponse;
import com.digitalocean.api.models.KubernetesGetClusterResponse;
import com.digitalocean.api.models.KubernetesGetClusterUserResponse;
import com.digitalocean.api.models.KubernetesGetCredentialsResponse;
import com.digitalocean.api.models.KubernetesGetKubeconfigResponse;
import com.digitalocean.api.models.KubernetesGetNodePoolResponse;
import com.digitalocean.api.models.KubernetesListAssociatedResourcesResponse;
import com.digitalocean.api.models.KubernetesListClustersResponse;
import com.digitalocean.api.models.KubernetesListNodePoolsResponse;
import com.digitalocean.api.models.KubernetesListOptionsResponse;
import com.digitalocean.api.models.KubernetesNodePool;
import com.digitalocean.api.models.KubernetesNodePoolUpdate;
import com.digitalocean.api.models.KubernetesRecycleNodePoolResponse;
import com.digitalocean.api.models.KubernetesRemoveRegistryResponse;
import com.digitalocean.api.models.KubernetesRunClusterLintResponse;
import com.digitalocean.api.models.KubernetesUpdateClusterResponse;
import com.digitalocean.api.models.KubernetesUpdateNodePoolResponse;
import com.digitalocean.api.models.KubernetesUpgradeClusterResponse;
import com.digitalocean.api.models.Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Kubernetes.
 */
public final class Kubernetes {
    /**
     * The proxy service used to perform REST calls.
     */
    private final KubernetesService service;

    /**
     * The service client containing this operation class.
     */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Kubernetes.
     * 
     * @param client the instance of the service client containing this operation class.
     */
     Kubernetes(GeneratedClient client) {
        this.service = RestProxy.create(KubernetesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientKubernetes to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientKuber")
    private interface KubernetesService {
        @Get("/v2/kubernetes/clusters")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesListClustersResponse> listClusters(@HostParam("$host") String host, @QueryParam("per_page") Integer perPage, @QueryParam("page") Integer page, @HeaderParam("Accept") String accept);

        @Post("/v2/kubernetes/clusters")
        @ExpectedResponses({201, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesCreateClusterResponse> createCluster(@HostParam("$host") String host, @BodyParam("application/json") Cluster body, @HeaderParam("Accept") String accept);

        @Get("/v2/kubernetes/clusters/{cluster_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesGetClusterResponse> getCluster(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @HeaderParam("Accept") String accept);

        @Put("/v2/kubernetes/clusters/{cluster_id}")
        @ExpectedResponses({202, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesUpdateClusterResponse> updateCluster(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @BodyParam("application/json") ClusterUpdate body, @HeaderParam("Accept") String accept);

        @Delete("/v2/kubernetes/clusters/{cluster_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesDeleteClusterResponse> deleteCluster(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @HeaderParam("Accept") String accept);

        @Get("/v2/kubernetes/clusters/{cluster_id}/destroy_with_associated_resources")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesListAssociatedResourcesResponse> listAssociatedResources(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @HeaderParam("Accept") String accept);

        @Delete("/v2/kubernetes/clusters/{cluster_id}/destroy_with_associated_resources/selective")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesDestroyAssociatedResourcesSelectiveResponse> destroyAssociatedResourcesSelective(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @BodyParam("application/json") DestroyAssociatedKubernetesResources body, @HeaderParam("Accept") String accept);

        @Delete("/v2/kubernetes/clusters/{cluster_id}/destroy_with_associated_resources/dangerous")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesDestroyAssociatedResourcesDangerousResponse> destroyAssociatedResourcesDangerous(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @HeaderParam("Accept") String accept);

        @Get("/v2/kubernetes/clusters/{cluster_id}/kubeconfig")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesGetKubeconfigResponse> getKubeconfig(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @QueryParam("expiry_seconds") Integer expirySeconds, @HeaderParam("Accept") String accept);

        @Get("/v2/kubernetes/clusters/{cluster_id}/credentials")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesGetCredentialsResponse> getCredentials(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @QueryParam("expiry_seconds") Integer expirySeconds, @HeaderParam("Accept") String accept);

        @Get("/v2/kubernetes/clusters/{cluster_id}/upgrades")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesGetAvailableUpgradesResponse> getAvailableUpgrades(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @HeaderParam("Accept") String accept);

        @Post("/v2/kubernetes/clusters/{cluster_id}/upgrade")
        @ExpectedResponses({202, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesUpgradeClusterResponse> upgradeCluster(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @BodyParam("application/json") Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);

        @Get("/v2/kubernetes/clusters/{cluster_id}/node_pools")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesListNodePoolsResponse> listNodePools(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @HeaderParam("Accept") String accept);

        @Post("/v2/kubernetes/clusters/{cluster_id}/node_pools")
        @ExpectedResponses({201, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesAddNodePoolResponse> addNodePool(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @BodyParam("application/json") KubernetesNodePool body, @HeaderParam("Accept") String accept);

        @Get("/v2/kubernetes/clusters/{cluster_id}/node_pools/{node_pool_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesGetNodePoolResponse> getNodePool(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @PathParam("node_pool_id") UUID nodePoolId, @HeaderParam("Accept") String accept);

        @Put("/v2/kubernetes/clusters/{cluster_id}/node_pools/{node_pool_id}")
        @ExpectedResponses({202, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesUpdateNodePoolResponse> updateNodePool(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @PathParam("node_pool_id") UUID nodePoolId, @BodyParam("application/json") KubernetesNodePoolUpdate body, @HeaderParam("Accept") String accept);

        @Delete("/v2/kubernetes/clusters/{cluster_id}/node_pools/{node_pool_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesDeleteNodePoolResponse> deleteNodePool(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @PathParam("node_pool_id") UUID nodePoolId, @HeaderParam("Accept") String accept);

        @Delete("/v2/kubernetes/clusters/{cluster_id}/node_pools/{node_pool_id}/nodes/{node_id}")
        @ExpectedResponses({202, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesDeleteNodeResponse> deleteNode(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @PathParam("node_pool_id") UUID nodePoolId, @PathParam("node_id") UUID nodeId, @QueryParam("skip_drain") Integer skipDrain, @QueryParam("replace") Integer replace, @HeaderParam("Accept") String accept);

        @Post("/v2/kubernetes/clusters/{cluster_id}/node_pools/{node_pool_id}/recycle")
        @ExpectedResponses({202, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesRecycleNodePoolResponse> recycleNodePool(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @PathParam("node_pool_id") UUID nodePoolId, @BodyParam("application/json") Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema body, @HeaderParam("Accept") String accept);

        @Get("/v2/kubernetes/clusters/{cluster_id}/user")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesGetClusterUserResponse> getClusterUser(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @HeaderParam("Accept") String accept);

        @Get("/v2/kubernetes/options")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesListOptionsResponse> listOptions(@HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Post("/v2/kubernetes/clusters/{cluster_id}/clusterlint")
        @ExpectedResponses({202, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesRunClusterLintResponse> runClusterLint(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @BodyParam("application/json") ClusterlintRequest body, @HeaderParam("Accept") String accept);

        @Get("/v2/kubernetes/clusters/{cluster_id}/clusterlint")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesGetClusterLintResultsResponse> getClusterLintResults(@HostParam("$host") String host, @PathParam("cluster_id") UUID clusterId, @QueryParam("run_id") UUID runId, @HeaderParam("Accept") String accept);

        @Post("/v2/kubernetes/registry")
        @ExpectedResponses({204, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesAddRegistryResponse> addRegistry(@HostParam("$host") String host, @BodyParam("application/json") ClusterRegistries body, @HeaderParam("Accept") String accept);

        @Delete("/v2/kubernetes/registry")
        @ExpectedResponses({204, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<KubernetesRemoveRegistryResponse> removeRegistry(@HostParam("$host") String host, @BodyParam("application/json") ClusterRegistries body, @HeaderParam("Accept") String accept);
    }

    /**
     * List All Kubernetes Clusters
     * 
     * To list all of the Kubernetes clusters on your account, send a GET request
     * to `/v2/kubernetes/clusters`.
     * 
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesListClustersResponse> listClustersWithResponseAsync(Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.listClusters(this.client.getHost(), perPage, page, accept);
    }

    /**
     * List All Kubernetes Clusters
     * 
     * To list all of the Kubernetes clusters on your account, send a GET request
     * to `/v2/kubernetes/clusters`.
     * 
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listClustersAsync(Integer perPage, Integer page) {
        return listClustersWithResponseAsync(perPage, page)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Create a New Kubernetes Cluster
     * 
     * To create a new Kubernetes cluster, send a POST request to
     * `/v2/kubernetes/clusters`. The request must contain at least one node pool
     * with at least one worker.
     * 
     * The request may contain a maintenance window policy describing a time period
     * when disruptive maintenance tasks may be carried out. Omitting the policy
     * implies that a window will be chosen automatically. See
     * [here](https://www.digitalocean.com/docs/kubernetes/how-to/upgrade-cluster/)
     * for details.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesCreateClusterResponse> createClusterWithResponseAsync(Cluster body) {
        final String accept = "application/json";
        return service.createCluster(this.client.getHost(), body, accept);
    }

    /**
     * Create a New Kubernetes Cluster
     * 
     * To create a new Kubernetes cluster, send a POST request to
     * `/v2/kubernetes/clusters`. The request must contain at least one node pool
     * with at least one worker.
     * 
     * The request may contain a maintenance window policy describing a time period
     * when disruptive maintenance tasks may be carried out. Omitting the policy
     * implies that a window will be chosen automatically. See
     * [here](https://www.digitalocean.com/docs/kubernetes/how-to/upgrade-cluster/)
     * for details.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createClusterAsync(Cluster body) {
        return createClusterWithResponseAsync(body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve an Existing Kubernetes Cluster
     * 
     * To show information about an existing Kubernetes cluster, send a GET request
     * to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID`.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesGetClusterResponse> getClusterWithResponseAsync(UUID clusterId) {
        final String accept = "application/json";
        return service.getCluster(this.client.getHost(), clusterId, accept);
    }

    /**
     * Retrieve an Existing Kubernetes Cluster
     * 
     * To show information about an existing Kubernetes cluster, send a GET request
     * to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID`.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getClusterAsync(UUID clusterId) {
        return getClusterWithResponseAsync(clusterId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Update a Kubernetes Cluster
     * 
     * To update a Kubernetes cluster, send a PUT request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID` and specify one or more of the
     * attributes below.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesUpdateClusterResponse> updateClusterWithResponseAsync(UUID clusterId, ClusterUpdate body) {
        final String accept = "application/json";
        return service.updateCluster(this.client.getHost(), clusterId, body, accept);
    }

    /**
     * Update a Kubernetes Cluster
     * 
     * To update a Kubernetes cluster, send a PUT request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID` and specify one or more of the
     * attributes below.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateClusterAsync(UUID clusterId, ClusterUpdate body) {
        return updateClusterWithResponseAsync(clusterId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Delete a Kubernetes Cluster
     * 
     * To delete a Kubernetes cluster and all services deployed to it, send a DELETE
     * request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID`.
     * 
     * A 204 status code with no body will be returned in response to a successful
     * request.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesDeleteClusterResponse> deleteClusterWithResponseAsync(UUID clusterId) {
        final String accept = "application/json";
        return service.deleteCluster(this.client.getHost(), clusterId, accept);
    }

    /**
     * Delete a Kubernetes Cluster
     * 
     * To delete a Kubernetes cluster and all services deployed to it, send a DELETE
     * request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID`.
     * 
     * A 204 status code with no body will be returned in response to a successful
     * request.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteClusterAsync(UUID clusterId) {
        return deleteClusterWithResponseAsync(clusterId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * List Associated Resources for Cluster Deletion
     * 
     * To list the associated billable resources that can be destroyed along with a cluster, send a GET request to the `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/destroy_with_associated_resources` endpoint.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object containing the IDs of resources associated with a Kubernetes cluster on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesListAssociatedResourcesResponse> listAssociatedResourcesWithResponseAsync(UUID clusterId) {
        final String accept = "application/json";
        return service.listAssociatedResources(this.client.getHost(), clusterId, accept);
    }

    /**
     * List Associated Resources for Cluster Deletion
     * 
     * To list the associated billable resources that can be destroyed along with a cluster, send a GET request to the `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/destroy_with_associated_resources` endpoint.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object containing the IDs of resources associated with a Kubernetes cluster on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAssociatedResourcesAsync(UUID clusterId) {
        return listAssociatedResourcesWithResponseAsync(clusterId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Selectively Delete a Cluster and its Associated Resources
     * 
     * To delete a Kubernetes cluster along with a subset of its associated resources,
     * send a DELETE request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/destroy_with_associated_resources/selective`.
     * 
     * The JSON body of the request should include `load_balancers`, `volumes`, or
     * `volume_snapshots` keys each set to an array of IDs for the associated
     * resources to be destroyed.
     * 
     * The IDs can be found by querying the cluster's associated resources endpoint.
     * Any associated resource not included in the request will remain and continue
     * to accrue changes on your account.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param body An object containing the IDs of resources to be destroyed along with their associated with a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesDestroyAssociatedResourcesSelectiveResponse> destroyAssociatedResourcesSelectiveWithResponseAsync(UUID clusterId, DestroyAssociatedKubernetesResources body) {
        final String accept = "application/json";
        return service.destroyAssociatedResourcesSelective(this.client.getHost(), clusterId, body, accept);
    }

    /**
     * Selectively Delete a Cluster and its Associated Resources
     * 
     * To delete a Kubernetes cluster along with a subset of its associated resources,
     * send a DELETE request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/destroy_with_associated_resources/selective`.
     * 
     * The JSON body of the request should include `load_balancers`, `volumes`, or
     * `volume_snapshots` keys each set to an array of IDs for the associated
     * resources to be destroyed.
     * 
     * The IDs can be found by querying the cluster's associated resources endpoint.
     * Any associated resource not included in the request will remain and continue
     * to accrue changes on your account.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param body An object containing the IDs of resources to be destroyed along with their associated with a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> destroyAssociatedResourcesSelectiveAsync(UUID clusterId, DestroyAssociatedKubernetesResources body) {
        return destroyAssociatedResourcesSelectiveWithResponseAsync(clusterId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Delete a Cluster and All of its Associated Resources (Dangerous)
     * 
     * To delete a Kubernetes cluster with all of its associated resources, send a
     * DELETE request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/destroy_with_associated_resources/dangerous`.
     * A 204 status code with no body will be returned in response to a successful request.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesDestroyAssociatedResourcesDangerousResponse> destroyAssociatedResourcesDangerousWithResponseAsync(UUID clusterId) {
        final String accept = "application/json";
        return service.destroyAssociatedResourcesDangerous(this.client.getHost(), clusterId, accept);
    }

    /**
     * Delete a Cluster and All of its Associated Resources (Dangerous)
     * 
     * To delete a Kubernetes cluster with all of its associated resources, send a
     * DELETE request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/destroy_with_associated_resources/dangerous`.
     * A 204 status code with no body will be returned in response to a successful request.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> destroyAssociatedResourcesDangerousAsync(UUID clusterId) {
        return destroyAssociatedResourcesDangerousWithResponseAsync(clusterId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve the kubeconfig for a Kubernetes Cluster
     * 
     * This endpoint returns a kubeconfig file in YAML format. It can be used to
     * connect to and administer the cluster using the Kubernetes command line tool,
     * `kubectl`, or other programs supporting kubeconfig files (e.g., client libraries).
     * 
     * The resulting kubeconfig file uses token-based authentication for clusters
     * supporting it, and certificate-based authentication otherwise. For a list of
     * supported versions and more information, see "[How to Connect to a DigitalOcean
     * Kubernetes Cluster with kubectl](https://www.digitalocean.com/docs/kubernetes/how-to/connect-with-kubectl/)".
     * 
     * To retrieve a kubeconfig file for use with a Kubernetes cluster, send a GET
     * request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/kubeconfig`.
     * 
     * Clusters supporting token-based authentication may define an expiration by
     * passing a duration in seconds as a query parameter to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/kubeconfig?expiry_seconds=$DURATION_IN_SECONDS`.
     * If not set or 0, then the token will have a 7 day expiry. The query parameter
     * has no impact in certificate-based authentication.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param expirySeconds The duration in seconds that the returned Kubernetes credentials will be valid. If not set or 0, the credentials will have a 7 day expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesGetKubeconfigResponse> getKubeconfigWithResponseAsync(UUID clusterId, Integer expirySeconds) {
        final String accept = "application/json";
        return service.getKubeconfig(this.client.getHost(), clusterId, expirySeconds, accept);
    }

    /**
     * Retrieve the kubeconfig for a Kubernetes Cluster
     * 
     * This endpoint returns a kubeconfig file in YAML format. It can be used to
     * connect to and administer the cluster using the Kubernetes command line tool,
     * `kubectl`, or other programs supporting kubeconfig files (e.g., client libraries).
     * 
     * The resulting kubeconfig file uses token-based authentication for clusters
     * supporting it, and certificate-based authentication otherwise. For a list of
     * supported versions and more information, see "[How to Connect to a DigitalOcean
     * Kubernetes Cluster with kubectl](https://www.digitalocean.com/docs/kubernetes/how-to/connect-with-kubectl/)".
     * 
     * To retrieve a kubeconfig file for use with a Kubernetes cluster, send a GET
     * request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/kubeconfig`.
     * 
     * Clusters supporting token-based authentication may define an expiration by
     * passing a duration in seconds as a query parameter to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/kubeconfig?expiry_seconds=$DURATION_IN_SECONDS`.
     * If not set or 0, then the token will have a 7 day expiry. The query parameter
     * has no impact in certificate-based authentication.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param expirySeconds The duration in seconds that the returned Kubernetes credentials will be valid. If not set or 0, the credentials will have a 7 day expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> getKubeconfigAsync(UUID clusterId, Integer expirySeconds) {
        return getKubeconfigWithResponseAsync(clusterId, expirySeconds)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve Credentials for a Kubernetes Cluster
     * 
     * This endpoint returns a JSON object . It can be used to programmatically
     * construct Kubernetes clients which cannot parse kubeconfig files.
     * 
     * The resulting JSON object contains token-based authentication for clusters
     * supporting it, and certificate-based authentication otherwise. For a list of
     * supported versions and more information, see "[How to Connect to a DigitalOcean
     * Kubernetes Cluster with kubectl](https://www.digitalocean.com/docs/kubernetes/how-to/connect-with-kubectl/)".
     * 
     * To retrieve credentials for accessing a Kubernetes cluster, send a GET
     * request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/credentials`.
     * 
     * Clusters supporting token-based authentication may define an expiration by
     * passing a duration in seconds as a query parameter to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/kubeconfig?expiry_seconds=$DURATION_IN_SECONDS`.
     * If not set or 0, then the token will have a 7 day expiry. The query parameter
     * has no impact in certificate-based authentication.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param expirySeconds The duration in seconds that the returned Kubernetes credentials will be valid. If not set or 0, the credentials will have a 7 day expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesGetCredentialsResponse> getCredentialsWithResponseAsync(UUID clusterId, Integer expirySeconds) {
        final String accept = "application/json";
        return service.getCredentials(this.client.getHost(), clusterId, expirySeconds, accept);
    }

    /**
     * Retrieve Credentials for a Kubernetes Cluster
     * 
     * This endpoint returns a JSON object . It can be used to programmatically
     * construct Kubernetes clients which cannot parse kubeconfig files.
     * 
     * The resulting JSON object contains token-based authentication for clusters
     * supporting it, and certificate-based authentication otherwise. For a list of
     * supported versions and more information, see "[How to Connect to a DigitalOcean
     * Kubernetes Cluster with kubectl](https://www.digitalocean.com/docs/kubernetes/how-to/connect-with-kubectl/)".
     * 
     * To retrieve credentials for accessing a Kubernetes cluster, send a GET
     * request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/credentials`.
     * 
     * Clusters supporting token-based authentication may define an expiration by
     * passing a duration in seconds as a query parameter to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/kubeconfig?expiry_seconds=$DURATION_IN_SECONDS`.
     * If not set or 0, then the token will have a 7 day expiry. The query parameter
     * has no impact in certificate-based authentication.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param expirySeconds The duration in seconds that the returned Kubernetes credentials will be valid. If not set or 0, the credentials will have a 7 day expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getCredentialsAsync(UUID clusterId, Integer expirySeconds) {
        return getCredentialsWithResponseAsync(clusterId, expirySeconds)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve Available Upgrades for an Existing Kubernetes Cluster
     * 
     * To determine whether a cluster can be upgraded, and the versions to which it
     * can be upgraded, send a GET request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/upgrades`.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesGetAvailableUpgradesResponse> getAvailableUpgradesWithResponseAsync(UUID clusterId) {
        final String accept = "application/json";
        return service.getAvailableUpgrades(this.client.getHost(), clusterId, accept);
    }

    /**
     * Retrieve Available Upgrades for an Existing Kubernetes Cluster
     * 
     * To determine whether a cluster can be upgraded, and the versions to which it
     * can be upgraded, send a GET request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/upgrades`.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAvailableUpgradesAsync(UUID clusterId) {
        return getAvailableUpgradesWithResponseAsync(clusterId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Upgrade a Kubernetes Cluster
     * 
     * To immediately upgrade a Kubernetes cluster to a newer patch release of
     * Kubernetes, send a POST request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/upgrade`.
     * The body of the request must specify a version attribute.
     * 
     * Available upgrade versions for a cluster can be fetched from
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/upgrades`.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesUpgradeClusterResponse> upgradeClusterWithResponseAsync(UUID clusterId, Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.upgradeCluster(this.client.getHost(), clusterId, body, accept);
    }

    /**
     * Upgrade a Kubernetes Cluster
     * 
     * To immediately upgrade a Kubernetes cluster to a newer patch release of
     * Kubernetes, send a POST request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/upgrade`.
     * The body of the request must specify a version attribute.
     * 
     * Available upgrade versions for a cluster can be fetched from
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/upgrades`.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> upgradeClusterAsync(UUID clusterId, Paths1Cfx96QV2KubernetesClustersClusterIdUpgradePostRequestbodyContentApplicationJsonSchema body) {
        return upgradeClusterWithResponseAsync(clusterId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * List All Node Pools in a Kubernetes Clusters
     * 
     * To list all of the node pools in a Kubernetes clusters, send a GET request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools`.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesListNodePoolsResponse> listNodePoolsWithResponseAsync(UUID clusterId) {
        final String accept = "application/json";
        return service.listNodePools(this.client.getHost(), clusterId, accept);
    }

    /**
     * List All Node Pools in a Kubernetes Clusters
     * 
     * To list all of the node pools in a Kubernetes clusters, send a GET request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools`.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listNodePoolsAsync(UUID clusterId) {
        return listNodePoolsWithResponseAsync(clusterId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Add a Node Pool to a Kubernetes Cluster
     * 
     * To add an additional node pool to a Kubernetes clusters, send a POST request
     * to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools` with the following
     * attributes.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesAddNodePoolResponse> addNodePoolWithResponseAsync(UUID clusterId, KubernetesNodePool body) {
        final String accept = "application/json";
        return service.addNodePool(this.client.getHost(), clusterId, body, accept);
    }

    /**
     * Add a Node Pool to a Kubernetes Cluster
     * 
     * To add an additional node pool to a Kubernetes clusters, send a POST request
     * to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools` with the following
     * attributes.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> addNodePoolAsync(UUID clusterId, KubernetesNodePool body) {
        return addNodePoolWithResponseAsync(clusterId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve a Node Pool for a Kubernetes Cluster
     * 
     * To show information about a specific node pool in a Kubernetes cluster, send
     * a GET request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools/$NODE_POOL_ID`.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param nodePoolId A unique ID that can be used to reference a Kubernetes node pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesGetNodePoolResponse> getNodePoolWithResponseAsync(UUID clusterId, UUID nodePoolId) {
        final String accept = "application/json";
        return service.getNodePool(this.client.getHost(), clusterId, nodePoolId, accept);
    }

    /**
     * Retrieve a Node Pool for a Kubernetes Cluster
     * 
     * To show information about a specific node pool in a Kubernetes cluster, send
     * a GET request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools/$NODE_POOL_ID`.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param nodePoolId A unique ID that can be used to reference a Kubernetes node pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getNodePoolAsync(UUID clusterId, UUID nodePoolId) {
        return getNodePoolWithResponseAsync(clusterId, nodePoolId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Update a Node Pool in a Kubernetes Cluster
     * 
     * To update the name of a node pool, edit the tags applied to it, or adjust its
     * number of nodes, send a PUT request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools/$NODE_POOL_ID` with the
     * following attributes.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param nodePoolId A unique ID that can be used to reference a Kubernetes node pool.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesUpdateNodePoolResponse> updateNodePoolWithResponseAsync(UUID clusterId, UUID nodePoolId, KubernetesNodePoolUpdate body) {
        final String accept = "application/json";
        return service.updateNodePool(this.client.getHost(), clusterId, nodePoolId, body, accept);
    }

    /**
     * Update a Node Pool in a Kubernetes Cluster
     * 
     * To update the name of a node pool, edit the tags applied to it, or adjust its
     * number of nodes, send a PUT request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools/$NODE_POOL_ID` with the
     * following attributes.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param nodePoolId A unique ID that can be used to reference a Kubernetes node pool.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateNodePoolAsync(UUID clusterId, UUID nodePoolId, KubernetesNodePoolUpdate body) {
        return updateNodePoolWithResponseAsync(clusterId, nodePoolId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Delete a Node Pool in a Kubernetes Cluster
     * 
     * To delete a node pool, send a DELETE request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools/$NODE_POOL_ID`.
     * 
     * A 204 status code with no body will be returned in response to a successful
     * request. Nodes in the pool will subsequently be drained and deleted.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param nodePoolId A unique ID that can be used to reference a Kubernetes node pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesDeleteNodePoolResponse> deleteNodePoolWithResponseAsync(UUID clusterId, UUID nodePoolId) {
        final String accept = "application/json";
        return service.deleteNodePool(this.client.getHost(), clusterId, nodePoolId, accept);
    }

    /**
     * Delete a Node Pool in a Kubernetes Cluster
     * 
     * To delete a node pool, send a DELETE request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools/$NODE_POOL_ID`.
     * 
     * A 204 status code with no body will be returned in response to a successful
     * request. Nodes in the pool will subsequently be drained and deleted.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param nodePoolId A unique ID that can be used to reference a Kubernetes node pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteNodePoolAsync(UUID clusterId, UUID nodePoolId) {
        return deleteNodePoolWithResponseAsync(clusterId, nodePoolId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Delete a Node in a Kubernetes Cluster
     * 
     * To delete a single node in a pool, send a DELETE request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools/$NODE_POOL_ID/nodes/$NODE_ID`.
     * 
     * Appending the `skip_drain=1` query parameter to the request causes node
     * draining to be skipped. Omitting the query parameter or setting its value to
     * `0` carries out draining prior to deletion.
     * 
     * Appending the `replace=1` query parameter to the request causes the node to
     * be replaced by a new one after deletion. Omitting the query parameter or
     * setting its value to `0` deletes without replacement.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param nodePoolId A unique ID that can be used to reference a Kubernetes node pool.
     * @param nodeId A unique ID that can be used to reference a node in a Kubernetes node pool.
     * @param skipDrain Specifies whether or not to drain workloads from a node before it is deleted. Setting it to `1` causes node draining to be skipped. Omitting the query parameter or setting its value to `0` carries out draining prior to deletion.
     * @param replace Specifies whether or not to replace a node after it has been deleted. Setting it to `1` causes the node to be replaced by a new one after deletion. Omitting the query parameter or setting its value to `0` deletes without replacement.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesDeleteNodeResponse> deleteNodeWithResponseAsync(UUID clusterId, UUID nodePoolId, UUID nodeId, Integer skipDrain, Integer replace) {
        final String accept = "application/json";
        return service.deleteNode(this.client.getHost(), clusterId, nodePoolId, nodeId, skipDrain, replace, accept);
    }

    /**
     * Delete a Node in a Kubernetes Cluster
     * 
     * To delete a single node in a pool, send a DELETE request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools/$NODE_POOL_ID/nodes/$NODE_ID`.
     * 
     * Appending the `skip_drain=1` query parameter to the request causes node
     * draining to be skipped. Omitting the query parameter or setting its value to
     * `0` carries out draining prior to deletion.
     * 
     * Appending the `replace=1` query parameter to the request causes the node to
     * be replaced by a new one after deletion. Omitting the query parameter or
     * setting its value to `0` deletes without replacement.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param nodePoolId A unique ID that can be used to reference a Kubernetes node pool.
     * @param nodeId A unique ID that can be used to reference a node in a Kubernetes node pool.
     * @param skipDrain Specifies whether or not to drain workloads from a node before it is deleted. Setting it to `1` causes node draining to be skipped. Omitting the query parameter or setting its value to `0` carries out draining prior to deletion.
     * @param replace Specifies whether or not to replace a node after it has been deleted. Setting it to `1` causes the node to be replaced by a new one after deletion. Omitting the query parameter or setting its value to `0` deletes without replacement.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteNodeAsync(UUID clusterId, UUID nodePoolId, UUID nodeId, Integer skipDrain, Integer replace) {
        return deleteNodeWithResponseAsync(clusterId, nodePoolId, nodeId, skipDrain, replace)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Recycle a Kubernetes Node Pool
     * 
     * The endpoint has been deprecated. Please use the DELETE
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools/$NODE_POOL_ID/nodes/$NODE_ID`
     * method instead.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param nodePoolId A unique ID that can be used to reference a Kubernetes node pool.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesRecycleNodePoolResponse> recycleNodePoolWithResponseAsync(UUID clusterId, UUID nodePoolId, Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.recycleNodePool(this.client.getHost(), clusterId, nodePoolId, body, accept);
    }

    /**
     * Recycle a Kubernetes Node Pool
     * 
     * The endpoint has been deprecated. Please use the DELETE
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/node_pools/$NODE_POOL_ID/nodes/$NODE_ID`
     * method instead.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param nodePoolId A unique ID that can be used to reference a Kubernetes node pool.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> recycleNodePoolAsync(UUID clusterId, UUID nodePoolId, Paths1YaighgV2KubernetesClustersClusterIdNodePoolsNodePoolIdRecyclePostRequestbodyContentApplicationJsonSchema body) {
        return recycleNodePoolWithResponseAsync(clusterId, nodePoolId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve User Information for a Kubernetes Cluster
     * 
     * To show information the user associated with a Kubernetes cluster, send a GET
     * request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/user`.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesGetClusterUserResponse> getClusterUserWithResponseAsync(UUID clusterId) {
        final String accept = "application/json";
        return service.getClusterUser(this.client.getHost(), clusterId, accept);
    }

    /**
     * Retrieve User Information for a Kubernetes Cluster
     * 
     * To show information the user associated with a Kubernetes cluster, send a GET
     * request to `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/user`.
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getClusterUserAsync(UUID clusterId) {
        return getClusterUserWithResponseAsync(clusterId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * List Available Regions, Node Sizes, and Versions of Kubernetes
     * 
     * To list the versions of Kubernetes available for use, the regions that support Kubernetes, and the available node sizes, send a GET request to `/v2/kubernetes/options`.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesListOptionsResponse> listOptionsWithResponseAsync() {
        final String accept = "application/json";
        return service.listOptions(this.client.getHost(), accept);
    }

    /**
     * List Available Regions, Node Sizes, and Versions of Kubernetes
     * 
     * To list the versions of Kubernetes available for use, the regions that support Kubernetes, and the available node sizes, send a GET request to `/v2/kubernetes/options`.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listOptionsAsync() {
        return listOptionsWithResponseAsync()
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Run Clusterlint Checks on a Kubernetes Cluster
     * 
     * Clusterlint helps operators conform to Kubernetes best practices around
     * resources, security and reliability to avoid common problems while operating
     * or upgrading the clusters.
     * 
     * To request a clusterlint run on your cluster, send a POST request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/clusterlint`. This will run all
     * checks present in the `doks` group by default, if a request body is not
     * specified. Optionally specify the below attributes.
     * 
     * For information about the available checks, please refer to
     * [the clusterlint check documentation](https://github.com/digitalocean/clusterlint/blob/master/checks.md).
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesRunClusterLintResponse> runClusterLintWithResponseAsync(UUID clusterId, ClusterlintRequest body) {
        final String accept = "application/json";
        return service.runClusterLint(this.client.getHost(), clusterId, body, accept);
    }

    /**
     * Run Clusterlint Checks on a Kubernetes Cluster
     * 
     * Clusterlint helps operators conform to Kubernetes best practices around
     * resources, security and reliability to avoid common problems while operating
     * or upgrading the clusters.
     * 
     * To request a clusterlint run on your cluster, send a POST request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/clusterlint`. This will run all
     * checks present in the `doks` group by default, if a request body is not
     * specified. Optionally specify the below attributes.
     * 
     * For information about the available checks, please refer to
     * [the clusterlint check documentation](https://github.com/digitalocean/clusterlint/blob/master/checks.md).
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> runClusterLintAsync(UUID clusterId, ClusterlintRequest body) {
        return runClusterLintWithResponseAsync(clusterId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Fetch Clusterlint Diagnostics for a Kubernetes Cluster
     * 
     * To request clusterlint diagnostics for your cluster, send a GET request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/clusterlint`. If the `run_id` query
     * parameter is provided, then the diagnostics for the specific run is fetched.
     * By default, the latest results are shown.
     * 
     * To find out how to address clusterlint feedback, please refer to
     * [the clusterlint check documentation](https://github.com/digitalocean/clusterlint/blob/master/checks.md).
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param runId Specifies the clusterlint run whose results will be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesGetClusterLintResultsResponse> getClusterLintResultsWithResponseAsync(UUID clusterId, UUID runId) {
        final String accept = "application/json";
        return service.getClusterLintResults(this.client.getHost(), clusterId, runId, accept);
    }

    /**
     * Fetch Clusterlint Diagnostics for a Kubernetes Cluster
     * 
     * To request clusterlint diagnostics for your cluster, send a GET request to
     * `/v2/kubernetes/clusters/$K8S_CLUSTER_ID/clusterlint`. If the `run_id` query
     * parameter is provided, then the diagnostics for the specific run is fetched.
     * By default, the latest results are shown.
     * 
     * To find out how to address clusterlint feedback, please refer to
     * [the clusterlint check documentation](https://github.com/digitalocean/clusterlint/blob/master/checks.md).
     * 
     * @param clusterId A unique ID that can be used to reference a Kubernetes cluster.
     * @param runId Specifies the clusterlint run whose results will be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getClusterLintResultsAsync(UUID clusterId, UUID runId) {
        return getClusterLintResultsWithResponseAsync(clusterId, runId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Add Container Registry to Kubernetes Clusters
     * 
     * To integrate the container registry with Kubernetes clusters, send a POST request to `/v2/kubernetes/registry`.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesAddRegistryResponse> addRegistryWithResponseAsync(ClusterRegistries body) {
        final String accept = "application/json";
        return service.addRegistry(this.client.getHost(), body, accept);
    }

    /**
     * Add Container Registry to Kubernetes Clusters
     * 
     * To integrate the container registry with Kubernetes clusters, send a POST request to `/v2/kubernetes/registry`.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> addRegistryAsync(ClusterRegistries body) {
        return addRegistryWithResponseAsync(body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Remove Container Registry from Kubernetes Clusters
     * 
     * To remove the container registry from Kubernetes clusters, send a DELETE request to `/v2/kubernetes/registry`.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KubernetesRemoveRegistryResponse> removeRegistryWithResponseAsync(ClusterRegistries body) {
        final String accept = "application/json";
        return service.removeRegistry(this.client.getHost(), body, accept);
    }

    /**
     * Remove Container Registry from Kubernetes Clusters
     * 
     * To remove the container registry from Kubernetes clusters, send a DELETE request to `/v2/kubernetes/registry`.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> removeRegistryAsync(ClusterRegistries body) {
        return removeRegistryWithResponseAsync(body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}
}
