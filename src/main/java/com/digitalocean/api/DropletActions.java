package com.digitalocean.api;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.digitalocean.api.models.DropletActionsGetResponse;
import com.digitalocean.api.models.DropletActionsListResponse;
import com.digitalocean.api.models.DropletActionsPostByTagResponse;
import com.digitalocean.api.models.DropletActionsPostResponse;
import com.digitalocean.api.models.ErrorException;
import java.util.Objects;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in DropletActions.
 */
public final class DropletActions {
    /**
     * The proxy service used to perform REST calls.
     */
    private final DropletActionsService service;

    /**
     * The service client containing this operation class.
     */
    private final GeneratedClient client;

    /**
     * Initializes an instance of DropletActions.
     * 
     * @param client the instance of the service client containing this operation class.
     */
     DropletActions(GeneratedClient client) {
        this.service = RestProxy.create(DropletActionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientDropletActions to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientDropl")
    private interface DropletActionsService {
        @Get("/v2/droplets/{droplet_id}/actions")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletActionsListResponse> list(@HostParam("$host") String host, @PathParam("droplet_id") int dropletId, @QueryParam("per_page") Integer perPage, @QueryParam("page") Integer page, @HeaderParam("Accept") String accept);

        @Post("/v2/droplets/{droplet_id}/actions")
        @ExpectedResponses({201, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletActionsPostResponse> post(@HostParam("$host") String host, @PathParam("droplet_id") int dropletId, @BodyParam("application/json") Object body, @HeaderParam("Accept") String accept);

        @Post("/v2/droplets/actions")
        @ExpectedResponses({201, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletActionsPostByTagResponse> postByTag(@HostParam("$host") String host, @QueryParam("tag_name") String tagName, @BodyParam("application/json") Object body, @HeaderParam("Accept") String accept);

        @Get("/v2/droplets/{droplet_id}/actions/{action_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DropletActionsGetResponse> get(@HostParam("$host") String host, @PathParam("droplet_id") int dropletId, @PathParam("action_id") int actionId, @HeaderParam("Accept") String accept);
    }

    /**
     * List Actions for a Droplet
     * 
     * To retrieve a list of all actions that have been executed for a Droplet, send
     * a GET request to `/v2/droplets/$DROPLET_ID/actions`.
     * 
     * The results will be returned as a JSON object with an `actions` key. This will
     * be set to an array filled with `action` objects containing the standard
     * `action` attributes.
     * 
     * @param dropletId A unique identifier for a Droplet instance.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletActionsListResponse> listWithResponseAsync(int dropletId, Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), dropletId, perPage, page, accept);
    }

    /**
     * List Actions for a Droplet
     * 
     * To retrieve a list of all actions that have been executed for a Droplet, send
     * a GET request to `/v2/droplets/$DROPLET_ID/actions`.
     * 
     * The results will be returned as a JSON object with an `actions` key. This will
     * be set to an array filled with `action` objects containing the standard
     * `action` attributes.
     * 
     * @param dropletId A unique identifier for a Droplet instance.
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync(int dropletId, Integer perPage, Integer page) {
        return listWithResponseAsync(dropletId, perPage, page)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Initiate a Droplet Action
     * 
     * To initiate an action on a Droplet send a POST request to
     * `/v2/droplets/$DROPLET_ID/actions`. In the JSON body to the request,
     * set the `type` attribute to on of the supported action types:
     * 
     * | Action                                   | Details |
     * | ---------------------------------------- | ----------- |
     * | &lt;nobr&gt;`enable_backups`&lt;/nobr&gt;            | Enables backups for a Droplet |
     * | &lt;nobr&gt;`disable_backups`&lt;/nobr&gt;           | Disables backups for a Droplet |
     * | &lt;nobr&gt;`reboot`&lt;/nobr&gt;                    | Reboots a Droplet. A `reboot` action is an attempt to reboot the Droplet in a graceful way, similar to using the `reboot` command from the console. |
     * | &lt;nobr&gt;`power_cycle`&lt;/nobr&gt;               | Power cycles a Droplet. A `powercycle` action is similar to pushing the reset button on a physical machine, it's similar to booting from scratch. |
     * | &lt;nobr&gt;`shutdown`&lt;/nobr&gt;                  | Shutsdown a Droplet. A shutdown action is an attempt to shutdown the Droplet in a graceful way, similar to using the `shutdown` command from the console. Since a `shutdown` command can fail, this action guarantees that the command is issued, not that it succeeds. The preferred way to turn off a Droplet is to attempt a shutdown, with a reasonable timeout, followed by a `power_off` action to ensure the Droplet is off. |
     * | &lt;nobr&gt;`power_off`&lt;/nobr&gt;                 | Powers off a Droplet. A `power_off` event is a hard shutdown and should only be used if the `shutdown` action is not successful. It is similar to cutting the power on a server and could lead to complications. |
     * | &lt;nobr&gt;`power_on`&lt;/nobr&gt;                  | Powers on a Droplet. |
     * | &lt;nobr&gt;`restore`&lt;/nobr&gt;                   | Restore a Droplet using a backup image. The image ID that is passed in must be a backup of the current Droplet instance. The operation will leave any embedded SSH keys intact. |
     * | &lt;nobr&gt;`password_reset`&lt;/nobr&gt;            | Resets the root password for a Droplet. A new password will be provided via email. It must be changed after first use. |
     * | &lt;nobr&gt;`resize`&lt;/nobr&gt;                    | Resizes a Droplet. Set the `size` attribute to a size slug. If a permanent resize with disk changes included is desired, set the `disk` attribute to `true`. |
     * | &lt;nobr&gt;`rebuild`&lt;/nobr&gt;                   | Rebuilds a Droplet from a new base image. Set the `image` attribute to an image ID or slug. |
     * | &lt;nobr&gt;`rename`&lt;/nobr&gt;                    | Renames a Droplet. |
     * | &lt;nobr&gt;`change_kernel`&lt;/nobr&gt;             | Changes a Droplet's kernel. Only applies to Droplets with externally managed kernels. All Droplets created after March 2017 use internal kernels by default. |
     * | &lt;nobr&gt;`enable_ipv6`&lt;/nobr&gt;               | Enables IPv6 for a Droplet. |
     * | &lt;nobr&gt;`snapshot`&lt;/nobr&gt;                  | Takes a snapshot of a Droplet. |.
     * 
     * @param dropletId A unique identifier for a Droplet instance.
     * @param body The `type` attribute set in the request body will specify the  action that
     * will be taken on the Droplet. Some actions will require additional
     * attributes to be set as well.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletActionsPostResponse> postWithResponseAsync(int dropletId, Object body) {
        final String accept = "application/json";
        return service.post(this.client.getHost(), dropletId, body, accept);
    }

    /**
     * Initiate a Droplet Action
     * 
     * To initiate an action on a Droplet send a POST request to
     * `/v2/droplets/$DROPLET_ID/actions`. In the JSON body to the request,
     * set the `type` attribute to on of the supported action types:
     * 
     * | Action                                   | Details |
     * | ---------------------------------------- | ----------- |
     * | &lt;nobr&gt;`enable_backups`&lt;/nobr&gt;            | Enables backups for a Droplet |
     * | &lt;nobr&gt;`disable_backups`&lt;/nobr&gt;           | Disables backups for a Droplet |
     * | &lt;nobr&gt;`reboot`&lt;/nobr&gt;                    | Reboots a Droplet. A `reboot` action is an attempt to reboot the Droplet in a graceful way, similar to using the `reboot` command from the console. |
     * | &lt;nobr&gt;`power_cycle`&lt;/nobr&gt;               | Power cycles a Droplet. A `powercycle` action is similar to pushing the reset button on a physical machine, it's similar to booting from scratch. |
     * | &lt;nobr&gt;`shutdown`&lt;/nobr&gt;                  | Shutsdown a Droplet. A shutdown action is an attempt to shutdown the Droplet in a graceful way, similar to using the `shutdown` command from the console. Since a `shutdown` command can fail, this action guarantees that the command is issued, not that it succeeds. The preferred way to turn off a Droplet is to attempt a shutdown, with a reasonable timeout, followed by a `power_off` action to ensure the Droplet is off. |
     * | &lt;nobr&gt;`power_off`&lt;/nobr&gt;                 | Powers off a Droplet. A `power_off` event is a hard shutdown and should only be used if the `shutdown` action is not successful. It is similar to cutting the power on a server and could lead to complications. |
     * | &lt;nobr&gt;`power_on`&lt;/nobr&gt;                  | Powers on a Droplet. |
     * | &lt;nobr&gt;`restore`&lt;/nobr&gt;                   | Restore a Droplet using a backup image. The image ID that is passed in must be a backup of the current Droplet instance. The operation will leave any embedded SSH keys intact. |
     * | &lt;nobr&gt;`password_reset`&lt;/nobr&gt;            | Resets the root password for a Droplet. A new password will be provided via email. It must be changed after first use. |
     * | &lt;nobr&gt;`resize`&lt;/nobr&gt;                    | Resizes a Droplet. Set the `size` attribute to a size slug. If a permanent resize with disk changes included is desired, set the `disk` attribute to `true`. |
     * | &lt;nobr&gt;`rebuild`&lt;/nobr&gt;                   | Rebuilds a Droplet from a new base image. Set the `image` attribute to an image ID or slug. |
     * | &lt;nobr&gt;`rename`&lt;/nobr&gt;                    | Renames a Droplet. |
     * | &lt;nobr&gt;`change_kernel`&lt;/nobr&gt;             | Changes a Droplet's kernel. Only applies to Droplets with externally managed kernels. All Droplets created after March 2017 use internal kernels by default. |
     * | &lt;nobr&gt;`enable_ipv6`&lt;/nobr&gt;               | Enables IPv6 for a Droplet. |
     * | &lt;nobr&gt;`snapshot`&lt;/nobr&gt;                  | Takes a snapshot of a Droplet. |.
     * 
     * @param dropletId A unique identifier for a Droplet instance.
     * @param body The `type` attribute set in the request body will specify the  action that
     * will be taken on the Droplet. Some actions will require additional
     * attributes to be set as well.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> postAsync(int dropletId, Object body) {
        return postWithResponseAsync(dropletId, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Acting on Tagged Droplets
     * 
     * Some actions can be performed in bulk on tagged Droplets. The actions can be
     * initiated by sending a POST to `/v2/droplets/actions?tag_name=$TAG_NAME` with
     * the action arguments.
     * 
     * Only a sub-set of action types are supported:
     * 
     * - `power_cycle`
     * - `power_on`
     * - `power_off`
     * - `shutdown`
     * - `enable_ipv6`
     * - `enable_backups`
     * - `disable_backups`
     * - `snapshot`.
     * 
     * @param tagName Used to filter Droplets by a specific tag. Can not be combined with `name`.
     * @param body The `type` attribute set in the request body will specify the  action that
     * will be taken on the Droplet. Some actions will require additional
     * attributes to be set as well.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletActionsPostByTagResponse> postByTagWithResponseAsync(String tagName, Object body) {
        final String accept = "application/json";
        return service.postByTag(this.client.getHost(), tagName, body, accept);
    }

    /**
     * Acting on Tagged Droplets
     * 
     * Some actions can be performed in bulk on tagged Droplets. The actions can be
     * initiated by sending a POST to `/v2/droplets/actions?tag_name=$TAG_NAME` with
     * the action arguments.
     * 
     * Only a sub-set of action types are supported:
     * 
     * - `power_cycle`
     * - `power_on`
     * - `power_off`
     * - `shutdown`
     * - `enable_ipv6`
     * - `enable_backups`
     * - `disable_backups`
     * - `snapshot`.
     * 
     * @param tagName Used to filter Droplets by a specific tag. Can not be combined with `name`.
     * @param body The `type` attribute set in the request body will specify the  action that
     * will be taken on the Droplet. Some actions will require additional
     * attributes to be set as well.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> postByTagAsync(String tagName, Object body) {
        return postByTagWithResponseAsync(tagName, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve a Droplet Action
     * 
     * To retrieve a Droplet action, send a GET request to
     * `/v2/droplets/$DROPLET_ID/actions/$ACTION_ID`.
     * 
     * The response will be a JSON object with a key called `action`. The value will
     * be a Droplet action object.
     * 
     * @param dropletId A unique identifier for a Droplet instance.
     * @param actionId A unique numeric ID that can be used to identify and reference an action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DropletActionsGetResponse> getWithResponseAsync(int dropletId, int actionId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), dropletId, actionId, accept);
    }

    /**
     * Retrieve a Droplet Action
     * 
     * To retrieve a Droplet action, send a GET request to
     * `/v2/droplets/$DROPLET_ID/actions/$ACTION_ID`.
     * 
     * The response will be a JSON object with a key called `action`. The value will
     * be a Droplet action object.
     * 
     * @param dropletId A unique identifier for a Droplet instance.
     * @param actionId A unique numeric ID that can be used to identify and reference an action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(int dropletId, int actionId) {
        return getWithResponseAsync(dropletId, actionId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}
}
