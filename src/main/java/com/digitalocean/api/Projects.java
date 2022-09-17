package com.digitalocean.api;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.Project;
import com.digitalocean.api.models.ProjectAssignment;
import com.digitalocean.api.models.ProjectsAssignResourcesDefaultResponse;
import com.digitalocean.api.models.ProjectsAssignResourcesResponse;
import com.digitalocean.api.models.ProjectsCreateResponse;
import com.digitalocean.api.models.ProjectsDeleteResponse;
import com.digitalocean.api.models.ProjectsGetDefaultResponse;
import com.digitalocean.api.models.ProjectsGetResponse;
import com.digitalocean.api.models.ProjectsListResourcesDefaultResponse;
import com.digitalocean.api.models.ProjectsListResourcesResponse;
import com.digitalocean.api.models.ProjectsListResponse;
import com.digitalocean.api.models.ProjectsPatchDefaultResponse;
import com.digitalocean.api.models.ProjectsPatchResponse;
import com.digitalocean.api.models.ProjectsUpdateDefaultResponse;
import com.digitalocean.api.models.ProjectsUpdateResponse;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Projects. */
public final class Projects {
    /** The proxy service used to perform REST calls. */
    private final ProjectsService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Projects.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Projects(GeneratedClient client) {
        this.service = RestProxy.create(ProjectsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientProjects to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientProje")
    private interface ProjectsService {
        @Get("/v2/projects")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ProjectsListResponse> list(@HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Post("/v2/projects")
        @ExpectedResponses({201, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ProjectsCreateResponse> create(
                @HostParam("$host") String host,
                @BodyParam("application/json") Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/projects/default")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ProjectsGetDefaultResponse> getDefault(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Put("/v2/projects/default")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ProjectsUpdateDefaultResponse> updateDefault(
                @HostParam("$host") String host,
                @BodyParam("application/json")
                        Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Patch("/v2/projects/default")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ProjectsPatchDefaultResponse> patchDefault(
                @HostParam("$host") String host,
                @BodyParam("application/json") Project body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/projects/{project_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ProjectsGetResponse> get(
                @HostParam("$host") String host,
                @PathParam("project_id") UUID projectId,
                @HeaderParam("Accept") String accept);

        @Put("/v2/projects/{project_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ProjectsUpdateResponse> update(
                @HostParam("$host") String host,
                @PathParam("project_id") UUID projectId,
                @BodyParam("application/json")
                        PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Patch("/v2/projects/{project_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ProjectsPatchResponse> patch(
                @HostParam("$host") String host,
                @PathParam("project_id") UUID projectId,
                @BodyParam("application/json") Project body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/projects/{project_id}")
        @ExpectedResponses({204, 401, 404, 412, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ProjectsDeleteResponse> delete(
                @HostParam("$host") String host,
                @PathParam("project_id") UUID projectId,
                @HeaderParam("Accept") String accept);

        @Get("/v2/projects/{project_id}/resources")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ProjectsListResourcesResponse> listResources(
                @HostParam("$host") String host,
                @PathParam("project_id") UUID projectId,
                @HeaderParam("Accept") String accept);

        @Post("/v2/projects/{project_id}/resources")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ProjectsAssignResourcesResponse> assignResources(
                @HostParam("$host") String host,
                @PathParam("project_id") UUID projectId,
                @BodyParam("application/json") ProjectAssignment body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/projects/default/resources")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ProjectsListResourcesDefaultResponse> listResourcesDefault(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Post("/v2/projects/default/resources")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ProjectsAssignResourcesDefaultResponse> assignResourcesDefault(
                @HostParam("$host") String host,
                @BodyParam("application/json") ProjectAssignment body,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List All Projects
     *
     * <p>To list all your projects, send a GET request to `/v2/projects`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProjectsListResponse> listWithResponseAsync() {
        final String accept = "application/json";
        return service.list(this.client.getHost(), accept);
    }

    /**
     * List All Projects
     *
     * <p>To list all your projects, send a GET request to `/v2/projects`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync() {
        return listWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a Project
     *
     * <p>To create a project, send a POST request to `/v2/projects`.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProjectsCreateResponse> createWithResponseAsync(
            Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), body, accept);
    }

    /**
     * Create a Project
     *
     * <p>To create a project, send a POST request to `/v2/projects`.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAsync(Paths1RzpbdoV2ProjectsPostRequestbodyContentApplicationJsonSchema body) {
        return createWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve the Default Project
     *
     * <p>To get your default project, send a GET request to `/v2/projects/default`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProjectsGetDefaultResponse> getDefaultWithResponseAsync() {
        final String accept = "application/json";
        return service.getDefault(this.client.getHost(), accept);
    }

    /**
     * Retrieve the Default Project
     *
     * <p>To get your default project, send a GET request to `/v2/projects/default`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getDefaultAsync() {
        return getDefaultWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update the Default Project
     *
     * <p>To update you default project, send a PUT request to `/v2/projects/default`. All of the following attributes
     * must be sent.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProjectsUpdateDefaultResponse> updateDefaultWithResponseAsync(
            Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.updateDefault(this.client.getHost(), body, accept);
    }

    /**
     * Update the Default Project
     *
     * <p>To update you default project, send a PUT request to `/v2/projects/default`. All of the following attributes
     * must be sent.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateDefaultAsync(
            Paths1Ns9Sb3V2ProjectsDefaultPutRequestbodyContentApplicationJsonSchema body) {
        return updateDefaultWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Patch the Default Project
     *
     * <p>To update only specific attributes of your default project, send a PATCH request to `/v2/projects/default`. At
     * least one of the following attributes needs to be sent.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProjectsPatchDefaultResponse> patchDefaultWithResponseAsync(Project body) {
        final String accept = "application/json";
        return service.patchDefault(this.client.getHost(), body, accept);
    }

    /**
     * Patch the Default Project
     *
     * <p>To update only specific attributes of your default project, send a PATCH request to `/v2/projects/default`. At
     * least one of the following attributes needs to be sent.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> patchDefaultAsync(Project body) {
        return patchDefaultWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Project
     *
     * <p>To get a project, send a GET request to `/v2/projects/$PROJECT_ID`.
     *
     * @param projectId A unique identifier for a project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProjectsGetResponse> getWithResponseAsync(UUID projectId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), projectId, accept);
    }

    /**
     * Retrieve an Existing Project
     *
     * <p>To get a project, send a GET request to `/v2/projects/$PROJECT_ID`.
     *
     * @param projectId A unique identifier for a project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(UUID projectId) {
        return getWithResponseAsync(projectId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update a Project
     *
     * <p>To update a project, send a PUT request to `/v2/projects/$PROJECT_ID`. All of the following attributes must be
     * sent.
     *
     * @param projectId A unique identifier for a project.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProjectsUpdateResponse> updateWithResponseAsync(
            UUID projectId, PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.update(this.client.getHost(), projectId, body, accept);
    }

    /**
     * Update a Project
     *
     * <p>To update a project, send a PUT request to `/v2/projects/$PROJECT_ID`. All of the following attributes must be
     * sent.
     *
     * @param projectId A unique identifier for a project.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateAsync(
            UUID projectId, PathsUzekzV2ProjectsProjectIdPutRequestbodyContentApplicationJsonSchema body) {
        return updateWithResponseAsync(projectId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Patch a Project
     *
     * <p>To update only specific attributes of a project, send a PATCH request to `/v2/projects/$PROJECT_ID`. At least
     * one of the following attributes needs to be sent.
     *
     * @param projectId A unique identifier for a project.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProjectsPatchResponse> patchWithResponseAsync(UUID projectId, Project body) {
        final String accept = "application/json";
        return service.patch(this.client.getHost(), projectId, body, accept);
    }

    /**
     * Patch a Project
     *
     * <p>To update only specific attributes of a project, send a PATCH request to `/v2/projects/$PROJECT_ID`. At least
     * one of the following attributes needs to be sent.
     *
     * @param projectId A unique identifier for a project.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> patchAsync(UUID projectId, Project body) {
        return patchWithResponseAsync(projectId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete an Existing Project
     *
     * <p>To delete a project, send a DELETE request to `/v2/projects/$PROJECT_ID`. To be deleted, a project must not
     * have any resources assigned to it. Any existing resources must first be reassigned or destroyed, or you will
     * receive a 412 error.
     *
     * <p>A successful request will receive a 204 status code with no body in response. This indicates that the request
     * was processed successfully.
     *
     * @param projectId A unique identifier for a project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProjectsDeleteResponse> deleteWithResponseAsync(UUID projectId) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), projectId, accept);
    }

    /**
     * Delete an Existing Project
     *
     * <p>To delete a project, send a DELETE request to `/v2/projects/$PROJECT_ID`. To be deleted, a project must not
     * have any resources assigned to it. Any existing resources must first be reassigned or destroyed, or you will
     * receive a 412 error.
     *
     * <p>A successful request will receive a 204 status code with no body in response. This indicates that the request
     * was processed successfully.
     *
     * @param projectId A unique identifier for a project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync(UUID projectId) {
        return deleteWithResponseAsync(projectId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Project Resources
     *
     * <p>To list all your resources in a project, send a GET request to `/v2/projects/$PROJECT_ID/resources`.
     *
     * @param projectId A unique identifier for a project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProjectsListResourcesResponse> listResourcesWithResponseAsync(UUID projectId) {
        final String accept = "application/json";
        return service.listResources(this.client.getHost(), projectId, accept);
    }

    /**
     * List Project Resources
     *
     * <p>To list all your resources in a project, send a GET request to `/v2/projects/$PROJECT_ID/resources`.
     *
     * @param projectId A unique identifier for a project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listResourcesAsync(UUID projectId) {
        return listResourcesWithResponseAsync(projectId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Assign Resources to a Project
     *
     * <p>To assign resources to a project, send a POST request to `/v2/projects/$PROJECT_ID/resources`.
     *
     * @param projectId A unique identifier for a project.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProjectsAssignResourcesResponse> assignResourcesWithResponseAsync(
            UUID projectId, ProjectAssignment body) {
        final String accept = "application/json";
        return service.assignResources(this.client.getHost(), projectId, body, accept);
    }

    /**
     * Assign Resources to a Project
     *
     * <p>To assign resources to a project, send a POST request to `/v2/projects/$PROJECT_ID/resources`.
     *
     * @param projectId A unique identifier for a project.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> assignResourcesAsync(UUID projectId, ProjectAssignment body) {
        return assignResourcesWithResponseAsync(projectId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Default Project Resources
     *
     * <p>To list all your resources in your default project, send a GET request to `/v2/projects/default/resources`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProjectsListResourcesDefaultResponse> listResourcesDefaultWithResponseAsync() {
        final String accept = "application/json";
        return service.listResourcesDefault(this.client.getHost(), accept);
    }

    /**
     * List Default Project Resources
     *
     * <p>To list all your resources in your default project, send a GET request to `/v2/projects/default/resources`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listResourcesDefaultAsync() {
        return listResourcesDefaultWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Assign Resources to Default Project
     *
     * <p>To assign resources to your default project, send a POST request to `/v2/projects/default/resources`.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProjectsAssignResourcesDefaultResponse> assignResourcesDefaultWithResponseAsync(
            ProjectAssignment body) {
        final String accept = "application/json";
        return service.assignResourcesDefault(this.client.getHost(), body, accept);
    }

    /**
     * Assign Resources to Default Project
     *
     * <p>To assign resources to your default project, send a POST request to `/v2/projects/default/resources`.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> assignResourcesDefaultAsync(ProjectAssignment body) {
        return assignResourcesDefaultWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
