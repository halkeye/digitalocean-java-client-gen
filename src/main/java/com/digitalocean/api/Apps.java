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
import com.digitalocean.api.models.AppPropose;
import com.digitalocean.api.models.AppsAssignAlertDestinationsResponse;
import com.digitalocean.api.models.AppsAssignAppAlertDestinationsRequest;
import com.digitalocean.api.models.AppsCancelDeploymentResponse;
import com.digitalocean.api.models.AppsCommitRollbackResponse;
import com.digitalocean.api.models.AppsCreateAppRequest;
import com.digitalocean.api.models.AppsCreateDeploymentRequest;
import com.digitalocean.api.models.AppsCreateDeploymentResponse;
import com.digitalocean.api.models.AppsCreateResponse;
import com.digitalocean.api.models.AppsCreateRollbackResponse;
import com.digitalocean.api.models.AppsDeleteResponse;
import com.digitalocean.api.models.AppsGetDeploymentResponse;
import com.digitalocean.api.models.AppsGetInstanceSizeResponseResponse;
import com.digitalocean.api.models.AppsGetLogsAggregateResponse;
import com.digitalocean.api.models.AppsGetLogsResponseResponse;
import com.digitalocean.api.models.AppsGetResponse;
import com.digitalocean.api.models.AppsGetTierResponseResponse;
import com.digitalocean.api.models.AppsListAlertsResponseResponse;
import com.digitalocean.api.models.AppsListDeploymentsResponse;
import com.digitalocean.api.models.AppsListInstanceSizesResponseResponse;
import com.digitalocean.api.models.AppsListRegionsResponseResponse;
import com.digitalocean.api.models.AppsListResponse;
import com.digitalocean.api.models.AppsListTiersResponseResponse;
import com.digitalocean.api.models.AppsRevertRollbackResponse;
import com.digitalocean.api.models.AppsRollbackAppRequest;
import com.digitalocean.api.models.AppsUpdateAppRequest;
import com.digitalocean.api.models.AppsUpdateResponse;
import com.digitalocean.api.models.AppsValidateAppSpecResponse;
import com.digitalocean.api.models.AppsValidateRollbackResponse;
import com.digitalocean.api.models.Enum18;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Apps. */
public final class Apps {
    /** The proxy service used to perform REST calls. */
    private final AppsService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Apps.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Apps(GeneratedClient client) {
        this.service = RestProxy.create(AppsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientApps to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientApps")
    private interface AppsService {
        @Get("/v2/apps")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsListResponse> list(
                @HostParam("$host") String host,
                @QueryParam("page") Integer page,
                @QueryParam("per_page") Integer perPage,
                @HeaderParam("Accept") String accept);

        @Post("/v2/apps")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsCreateResponse> create(
                @HostParam("$host") String host,
                @BodyParam("application/json") AppsCreateAppRequest body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/apps/{id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsDeleteResponse> delete(
                @HostParam("$host") String host, @PathParam("id") String id, @HeaderParam("Accept") String accept);

        @Get("/v2/apps/{id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsGetResponse> get(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @QueryParam("name") String name,
                @HeaderParam("Accept") String accept);

        @Put("/v2/apps/{id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsUpdateResponse> update(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @BodyParam("application/json") AppsUpdateAppRequest body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/apps/{app_id}/deployments")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsListDeploymentsResponse> listDeployments(
                @HostParam("$host") String host,
                @PathParam("app_id") String appId,
                @QueryParam("page") Integer page,
                @QueryParam("per_page") Integer perPage,
                @HeaderParam("Accept") String accept);

        @Post("/v2/apps/{app_id}/deployments")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsCreateDeploymentResponse> createDeployment(
                @HostParam("$host") String host,
                @PathParam("app_id") String appId,
                @BodyParam("application/json") AppsCreateDeploymentRequest body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/apps/{app_id}/deployments/{deployment_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsGetDeploymentResponse> getDeployment(
                @HostParam("$host") String host,
                @PathParam("app_id") String appId,
                @PathParam("deployment_id") String deploymentId,
                @HeaderParam("Accept") String accept);

        @Post("/v2/apps/{app_id}/deployments/{deployment_id}/cancel")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsCancelDeploymentResponse> cancelDeployment(
                @HostParam("$host") String host,
                @PathParam("app_id") String appId,
                @PathParam("deployment_id") String deploymentId,
                @HeaderParam("Accept") String accept);

        @Get("/v2/apps/{app_id}/deployments/{deployment_id}/components/{component_name}/logs")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsGetLogsResponseResponse> getLogs(
                @HostParam("$host") String host,
                @PathParam("app_id") String appId,
                @PathParam("deployment_id") String deploymentId,
                @PathParam("component_name") String componentName,
                @QueryParam("follow") Boolean follow,
                @QueryParam("type") Enum18 type,
                @QueryParam("pod_connection_timeout") String podConnectionTimeout,
                @HeaderParam("Accept") String accept);

        @Get("/v2/apps/{app_id}/deployments/{deployment_id}/logs")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsGetLogsAggregateResponse> getLogsAggregate(
                @HostParam("$host") String host,
                @PathParam("app_id") String appId,
                @PathParam("deployment_id") String deploymentId,
                @QueryParam("follow") Boolean follow,
                @QueryParam("type") Enum18 type,
                @QueryParam("pod_connection_timeout") String podConnectionTimeout,
                @HeaderParam("Accept") String accept);

        @Get("/v2/apps/tiers")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsListTiersResponseResponse> listTiers(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Get("/v2/apps/tiers/{slug}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsGetTierResponseResponse> getTier(
                @HostParam("$host") String host, @PathParam("slug") String slug, @HeaderParam("Accept") String accept);

        @Get("/v2/apps/tiers/instance_sizes")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsListInstanceSizesResponseResponse> listInstanceSizes(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Get("/v2/apps/tiers/instance_sizes/{slug}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsGetInstanceSizeResponseResponse> getInstanceSize(
                @HostParam("$host") String host, @PathParam("slug") String slug, @HeaderParam("Accept") String accept);

        @Get("/v2/apps/regions")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsListRegionsResponseResponse> listRegions(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Post("/v2/apps/propose")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsValidateAppSpecResponse> validateAppSpec(
                @HostParam("$host") String host,
                @BodyParam("application/json") AppPropose body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/apps/{app_id}/alerts")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsListAlertsResponseResponse> listAlerts(
                @HostParam("$host") String host,
                @PathParam("app_id") String appId,
                @HeaderParam("Accept") String accept);

        @Post("/v2/apps/{app_id}/alerts/{alert_id}/destinations")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsAssignAlertDestinationsResponse> assignAlertDestinations(
                @HostParam("$host") String host,
                @PathParam("app_id") String appId,
                @PathParam("alert_id") String alertId,
                @BodyParam("application/json") AppsAssignAppAlertDestinationsRequest body,
                @HeaderParam("Accept") String accept);

        @Post("/v2/apps/{app_id}/rollback")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsCreateRollbackResponse> createRollback(
                @HostParam("$host") String host,
                @PathParam("app_id") String appId,
                @BodyParam("application/json") AppsRollbackAppRequest body,
                @HeaderParam("Accept") String accept);

        @Post("/v2/apps/{app_id}/rollback/validate")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsValidateRollbackResponse> validateRollback(
                @HostParam("$host") String host,
                @PathParam("app_id") String appId,
                @BodyParam("application/json") AppsRollbackAppRequest body,
                @HeaderParam("Accept") String accept);

        @Post("/v2/apps/{app_id}/rollback/commit")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsCommitRollbackResponse> commitRollback(
                @HostParam("$host") String host,
                @PathParam("app_id") String appId,
                @HeaderParam("Accept") String accept);

        @Post("/v2/apps/{app_id}/rollback/revert")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AppsRevertRollbackResponse> revertRollback(
                @HostParam("$host") String host,
                @PathParam("app_id") String appId,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List All Apps
     *
     * <p>List all apps on your account. Information about the current active deployment as well as any in progress ones
     * will also be included for each app.
     *
     * @param page Which 'page' of paginated results to return.
     * @param perPage Number of items returned per page.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsListResponse> listWithResponseAsync(Integer page, Integer perPage) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), page, perPage, accept);
    }

    /**
     * List All Apps
     *
     * <p>List all apps on your account. Information about the current active deployment as well as any in progress ones
     * will also be included for each app.
     *
     * @param page Which 'page' of paginated results to return.
     * @param perPage Number of items returned per page.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync(Integer page, Integer perPage) {
        return listWithResponseAsync(page, perPage).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a New App
     *
     * <p>Create a new app by submitting an app specification. For documentation on app specifications (`AppSpec`
     * objects), please refer to [the product
     * documentation](https://docs.digitalocean.com/products/app-platform/reference/app-spec/).
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsCreateResponse> createWithResponseAsync(AppsCreateAppRequest body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), body, accept);
    }

    /**
     * Create a New App
     *
     * <p>Create a new app by submitting an app specification. For documentation on app specifications (`AppSpec`
     * objects), please refer to [the product
     * documentation](https://docs.digitalocean.com/products/app-platform/reference/app-spec/).
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAsync(AppsCreateAppRequest body) {
        return createWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete an App
     *
     * <p>Delete an existing app. Once deleted, all active deployments will be permanently shut down and the app
     * deleted. If needed, be sure to back up your app specification so that you may re-create it at a later time.
     *
     * @param id The ID of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsDeleteResponse> deleteWithResponseAsync(String id) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), id, accept);
    }

    /**
     * Delete an App
     *
     * <p>Delete an existing app. Once deleted, all active deployments will be permanently shut down and the app
     * deleted. If needed, be sure to back up your app specification so that you may re-create it at a later time.
     *
     * @param id The ID of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> deleteAsync(String id) {
        return deleteWithResponseAsync(id).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing App
     *
     * <p>Retrieve details about an existing app by either its ID or name. To retrieve an app by its name, do not
     * include an ID in the request path. Information about the current active deployment as well as any in progress
     * ones will also be included in the response.
     *
     * @param id The ID of the app.
     * @param name The name of the app to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsGetResponse> getWithResponseAsync(String id, String name) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), id, name, accept);
    }

    /**
     * Retrieve an Existing App
     *
     * <p>Retrieve details about an existing app by either its ID or name. To retrieve an app by its name, do not
     * include an ID in the request path. Information about the current active deployment as well as any in progress
     * ones will also be included in the response.
     *
     * @param id The ID of the app.
     * @param name The name of the app to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(String id, String name) {
        return getWithResponseAsync(id, name).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update an App
     *
     * <p>Update an existing app by submitting a new app specification. For documentation on app specifications
     * (`AppSpec` objects), please refer to [the product
     * documentation](https://docs.digitalocean.com/products/app-platform/reference/app-spec/).
     *
     * @param id The ID of the app.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsUpdateResponse> updateWithResponseAsync(String id, AppsUpdateAppRequest body) {
        final String accept = "application/json";
        return service.update(this.client.getHost(), id, body, accept);
    }

    /**
     * Update an App
     *
     * <p>Update an existing app by submitting a new app specification. For documentation on app specifications
     * (`AppSpec` objects), please refer to [the product
     * documentation](https://docs.digitalocean.com/products/app-platform/reference/app-spec/).
     *
     * @param id The ID of the app.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateAsync(String id, AppsUpdateAppRequest body) {
        return updateWithResponseAsync(id, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List App Deployments
     *
     * <p>List all deployments of an app.
     *
     * @param appId The app ID.
     * @param page Which 'page' of paginated results to return.
     * @param perPage Number of items returned per page.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsListDeploymentsResponse> listDeploymentsWithResponseAsync(
            String appId, Integer page, Integer perPage) {
        final String accept = "application/json";
        return service.listDeployments(this.client.getHost(), appId, page, perPage, accept);
    }

    /**
     * List App Deployments
     *
     * <p>List all deployments of an app.
     *
     * @param appId The app ID.
     * @param page Which 'page' of paginated results to return.
     * @param perPage Number of items returned per page.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listDeploymentsAsync(String appId, Integer page, Integer perPage) {
        return listDeploymentsWithResponseAsync(appId, page, perPage).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create an App Deployment
     *
     * <p>Creating an app deployment will pull the latest changes from your repository and schedule a new deployment for
     * your app.
     *
     * @param appId The app ID.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsCreateDeploymentResponse> createDeploymentWithResponseAsync(
            String appId, AppsCreateDeploymentRequest body) {
        final String accept = "application/json";
        return service.createDeployment(this.client.getHost(), appId, body, accept);
    }

    /**
     * Create an App Deployment
     *
     * <p>Creating an app deployment will pull the latest changes from your repository and schedule a new deployment for
     * your app.
     *
     * @param appId The app ID.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createDeploymentAsync(String appId, AppsCreateDeploymentRequest body) {
        return createDeploymentWithResponseAsync(appId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an App Deployment
     *
     * <p>Retrieve information about an app deployment.
     *
     * @param appId The app ID.
     * @param deploymentId The deployment ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsGetDeploymentResponse> getDeploymentWithResponseAsync(String appId, String deploymentId) {
        final String accept = "application/json";
        return service.getDeployment(this.client.getHost(), appId, deploymentId, accept);
    }

    /**
     * Retrieve an App Deployment
     *
     * <p>Retrieve information about an app deployment.
     *
     * @param appId The app ID.
     * @param deploymentId The deployment ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDeploymentAsync(String appId, String deploymentId) {
        return getDeploymentWithResponseAsync(appId, deploymentId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Cancel a Deployment
     *
     * <p>Immediately cancel an in-progress deployment.
     *
     * @param appId The app ID.
     * @param deploymentId The deployment ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsCancelDeploymentResponse> cancelDeploymentWithResponseAsync(String appId, String deploymentId) {
        final String accept = "application/json";
        return service.cancelDeployment(this.client.getHost(), appId, deploymentId, accept);
    }

    /**
     * Cancel a Deployment
     *
     * <p>Immediately cancel an in-progress deployment.
     *
     * @param appId The app ID.
     * @param deploymentId The deployment ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> cancelDeploymentAsync(String appId, String deploymentId) {
        return cancelDeploymentWithResponseAsync(appId, deploymentId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve Deployment Logs
     *
     * <p>Retrieve the logs of a past, in-progress, or active deployment. If a component name is specified, the logs
     * will be limited to only that component. The response will include links to either real-time logs of an
     * in-progress or active deployment or archived logs of a past deployment.
     *
     * @param appId The app ID.
     * @param deploymentId The deployment ID.
     * @param componentName An optional component name. If set, logs will be limited to this component only.
     * @param type The type of logs to retrieve - BUILD: Build-time logs - DEPLOY: Deploy-time logs - RUN: Live run-time
     *     logs.
     * @param follow Whether the logs should follow live updates.
     * @param podConnectionTimeout An optional time duration to wait if the underlying component instance is not
     *     immediately available. Default: `3m`.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsGetLogsResponseResponse> getLogsWithResponseAsync(
            String appId,
            String deploymentId,
            String componentName,
            Enum18 type,
            Boolean follow,
            String podConnectionTimeout) {
        final String accept = "application/json";
        return service.getLogs(
                this.client.getHost(), appId, deploymentId, componentName, follow, type, podConnectionTimeout, accept);
    }

    /**
     * Retrieve Deployment Logs
     *
     * <p>Retrieve the logs of a past, in-progress, or active deployment. If a component name is specified, the logs
     * will be limited to only that component. The response will include links to either real-time logs of an
     * in-progress or active deployment or archived logs of a past deployment.
     *
     * @param appId The app ID.
     * @param deploymentId The deployment ID.
     * @param componentName An optional component name. If set, logs will be limited to this component only.
     * @param type The type of logs to retrieve - BUILD: Build-time logs - DEPLOY: Deploy-time logs - RUN: Live run-time
     *     logs.
     * @param follow Whether the logs should follow live updates.
     * @param podConnectionTimeout An optional time duration to wait if the underlying component instance is not
     *     immediately available. Default: `3m`.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getLogsAsync(
            String appId,
            String deploymentId,
            String componentName,
            Enum18 type,
            Boolean follow,
            String podConnectionTimeout) {
        return getLogsWithResponseAsync(appId, deploymentId, componentName, type, follow, podConnectionTimeout)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve Aggregate Deployment Logs
     *
     * <p>Retrieve the logs of a past, in-progress, or active deployment. If a component name is specified, the logs
     * will be limited to only that component. The response will include links to either real-time logs of an
     * in-progress or active deployment or archived logs of a past deployment.
     *
     * @param appId The app ID.
     * @param deploymentId The deployment ID.
     * @param type The type of logs to retrieve - BUILD: Build-time logs - DEPLOY: Deploy-time logs - RUN: Live run-time
     *     logs.
     * @param follow Whether the logs should follow live updates.
     * @param podConnectionTimeout An optional time duration to wait if the underlying component instance is not
     *     immediately available. Default: `3m`.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsGetLogsAggregateResponse> getLogsAggregateWithResponseAsync(
            String appId, String deploymentId, Enum18 type, Boolean follow, String podConnectionTimeout) {
        final String accept = "application/json";
        return service.getLogsAggregate(
                this.client.getHost(), appId, deploymentId, follow, type, podConnectionTimeout, accept);
    }

    /**
     * Retrieve Aggregate Deployment Logs
     *
     * <p>Retrieve the logs of a past, in-progress, or active deployment. If a component name is specified, the logs
     * will be limited to only that component. The response will include links to either real-time logs of an
     * in-progress or active deployment or archived logs of a past deployment.
     *
     * @param appId The app ID.
     * @param deploymentId The deployment ID.
     * @param type The type of logs to retrieve - BUILD: Build-time logs - DEPLOY: Deploy-time logs - RUN: Live run-time
     *     logs.
     * @param follow Whether the logs should follow live updates.
     * @param podConnectionTimeout An optional time duration to wait if the underlying component instance is not
     *     immediately available. Default: `3m`.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getLogsAggregateAsync(
            String appId, String deploymentId, Enum18 type, Boolean follow, String podConnectionTimeout) {
        return getLogsAggregateWithResponseAsync(appId, deploymentId, type, follow, podConnectionTimeout)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List App Tiers
     *
     * <p>List all app tiers.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsListTiersResponseResponse> listTiersWithResponseAsync() {
        final String accept = "application/json";
        return service.listTiers(this.client.getHost(), accept);
    }

    /**
     * List App Tiers
     *
     * <p>List all app tiers.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listTiersAsync() {
        return listTiersWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an App Tier
     *
     * <p>Retrieve information about a specific app tier.
     *
     * @param slug The slug of the tier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsGetTierResponseResponse> getTierWithResponseAsync(String slug) {
        final String accept = "application/json";
        return service.getTier(this.client.getHost(), slug, accept);
    }

    /**
     * Retrieve an App Tier
     *
     * <p>Retrieve information about a specific app tier.
     *
     * @param slug The slug of the tier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getTierAsync(String slug) {
        return getTierWithResponseAsync(slug).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Instance Sizes
     *
     * <p>List all instance sizes for `service`, `worker`, and `job` components.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsListInstanceSizesResponseResponse> listInstanceSizesWithResponseAsync() {
        final String accept = "application/json";
        return service.listInstanceSizes(this.client.getHost(), accept);
    }

    /**
     * List Instance Sizes
     *
     * <p>List all instance sizes for `service`, `worker`, and `job` components.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listInstanceSizesAsync() {
        return listInstanceSizesWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Instance Size
     *
     * <p>Retrieve information about a specific instance size for `service`, `worker`, and `job` components.
     *
     * @param slug The slug of the instance size.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsGetInstanceSizeResponseResponse> getInstanceSizeWithResponseAsync(String slug) {
        final String accept = "application/json";
        return service.getInstanceSize(this.client.getHost(), slug, accept);
    }

    /**
     * Retrieve an Instance Size
     *
     * <p>Retrieve information about a specific instance size for `service`, `worker`, and `job` components.
     *
     * @param slug The slug of the instance size.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getInstanceSizeAsync(String slug) {
        return getInstanceSizeWithResponseAsync(slug).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List App Regions
     *
     * <p>List all regions supported by App Platform.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsListRegionsResponseResponse> listRegionsWithResponseAsync() {
        final String accept = "application/json";
        return service.listRegions(this.client.getHost(), accept);
    }

    /**
     * List App Regions
     *
     * <p>List all regions supported by App Platform.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listRegionsAsync() {
        return listRegionsWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Propose an App Spec
     *
     * <p>To propose and validate a spec for a new or existing app, send a POST request to the `/v2/apps/propose`
     * endpoint. The request returns some information about the proposed app, including app cost and upgrade cost. If an
     * existing app ID is specified, the app spec is treated as a proposed update to the existing app.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsValidateAppSpecResponse> validateAppSpecWithResponseAsync(AppPropose body) {
        final String accept = "application/json";
        return service.validateAppSpec(this.client.getHost(), body, accept);
    }

    /**
     * Propose an App Spec
     *
     * <p>To propose and validate a spec for a new or existing app, send a POST request to the `/v2/apps/propose`
     * endpoint. The request returns some information about the proposed app, including app cost and upgrade cost. If an
     * existing app ID is specified, the app spec is treated as a proposed update to the existing app.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> validateAppSpecAsync(AppPropose body) {
        return validateAppSpecWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List all app alerts
     *
     * <p>List alerts associated to the app and any components. This includes configuration information about the alerts
     * including emails, slack webhooks, and triggering events or conditions.
     *
     * @param appId The app ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsListAlertsResponseResponse> listAlertsWithResponseAsync(String appId) {
        final String accept = "application/json";
        return service.listAlerts(this.client.getHost(), appId, accept);
    }

    /**
     * List all app alerts
     *
     * <p>List alerts associated to the app and any components. This includes configuration information about the alerts
     * including emails, slack webhooks, and triggering events or conditions.
     *
     * @param appId The app ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAlertsAsync(String appId) {
        return listAlertsWithResponseAsync(appId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update destinations for alerts
     *
     * <p>Updates the emails and slack webhook destinations for app alerts. Emails must be associated to a user with
     * access to the app.
     *
     * @param appId The app ID.
     * @param alertId The alert ID.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsAssignAlertDestinationsResponse> assignAlertDestinationsWithResponseAsync(
            String appId, String alertId, AppsAssignAppAlertDestinationsRequest body) {
        final String accept = "application/json";
        return service.assignAlertDestinations(this.client.getHost(), appId, alertId, body, accept);
    }

    /**
     * Update destinations for alerts
     *
     * <p>Updates the emails and slack webhook destinations for app alerts. Emails must be associated to a user with
     * access to the app.
     *
     * @param appId The app ID.
     * @param alertId The alert ID.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> assignAlertDestinationsAsync(
            String appId, String alertId, AppsAssignAppAlertDestinationsRequest body) {
        return assignAlertDestinationsWithResponseAsync(appId, alertId, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Rollback App
     *
     * <p>Rollback an app to a previous deployment. A new deployment will be created to perform the rollback. The app
     * will be pinned to the rollback deployment preventing any new deployments from being created, either manually or
     * through Auto Deploy on Push webhooks. To resume deployments, the rollback must be either committed or reverted.
     *
     * <p>It is recommended to use the Validate App Rollback endpoint to double check if the rollback is valid and if
     * there are any warnings.
     *
     * @param appId The app ID.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsCreateRollbackResponse> createRollbackWithResponseAsync(String appId, AppsRollbackAppRequest body) {
        final String accept = "application/json";
        return service.createRollback(this.client.getHost(), appId, body, accept);
    }

    /**
     * Rollback App
     *
     * <p>Rollback an app to a previous deployment. A new deployment will be created to perform the rollback. The app
     * will be pinned to the rollback deployment preventing any new deployments from being created, either manually or
     * through Auto Deploy on Push webhooks. To resume deployments, the rollback must be either committed or reverted.
     *
     * <p>It is recommended to use the Validate App Rollback endpoint to double check if the rollback is valid and if
     * there are any warnings.
     *
     * @param appId The app ID.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createRollbackAsync(String appId, AppsRollbackAppRequest body) {
        return createRollbackWithResponseAsync(appId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Validate App Rollback
     *
     * <p>Check whether an app can be rolled back to a specific deployment. This endpoint can also be used to check if
     * there are any warnings or validation conditions that will cause the rollback to proceed under unideal
     * circumstances. For example, if a component must be rebuilt as part of the rollback causing it to take longer than
     * usual.
     *
     * @param appId The app ID.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsValidateRollbackResponse> validateRollbackWithResponseAsync(
            String appId, AppsRollbackAppRequest body) {
        final String accept = "application/json";
        return service.validateRollback(this.client.getHost(), appId, body, accept);
    }

    /**
     * Validate App Rollback
     *
     * <p>Check whether an app can be rolled back to a specific deployment. This endpoint can also be used to check if
     * there are any warnings or validation conditions that will cause the rollback to proceed under unideal
     * circumstances. For example, if a component must be rebuilt as part of the rollback causing it to take longer than
     * usual.
     *
     * @param appId The app ID.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> validateRollbackAsync(String appId, AppsRollbackAppRequest body) {
        return validateRollbackWithResponseAsync(appId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Commit App Rollback
     *
     * <p>Commit an app rollback. This action permanently applies the rollback and unpins the app to resume new
     * deployments.
     *
     * @param appId The app ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsCommitRollbackResponse> commitRollbackWithResponseAsync(String appId) {
        final String accept = "application/json";
        return service.commitRollback(this.client.getHost(), appId, accept);
    }

    /**
     * Commit App Rollback
     *
     * <p>Commit an app rollback. This action permanently applies the rollback and unpins the app to resume new
     * deployments.
     *
     * @param appId The app ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> commitRollbackAsync(String appId) {
        return commitRollbackWithResponseAsync(appId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Revert App Rollback
     *
     * <p>Revert an app rollback. This action reverts the active rollback by creating a new deployment from the latest
     * app spec prior to the rollback and unpins the app to resume new deployments.
     *
     * @param appId The app ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppsRevertRollbackResponse> revertRollbackWithResponseAsync(String appId) {
        final String accept = "application/json";
        return service.revertRollback(this.client.getHost(), appId, accept);
    }

    /**
     * Revert App Rollback
     *
     * <p>Revert an app rollback. This action reverts the active rollback by creating a new deployment from the latest
     * app spec prior to the rollback and unpins the app to resume new deployments.
     *
     * @param appId The app ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> revertRollbackAsync(String appId) {
        return revertRollbackWithResponseAsync(appId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
