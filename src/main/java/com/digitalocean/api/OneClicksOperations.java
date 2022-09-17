package com.digitalocean.api;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.digitalocean.api.models.Enum0;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.OneClicksCreate;
import com.digitalocean.api.models.OneClicksInstallKubernetesResponse;
import com.digitalocean.api.models.OneClicksListResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in OneClicksOperations. */
public final class OneClicksOperations {
    /** The proxy service used to perform REST calls. */
    private final OneClicksService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of OneClicksOperations.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OneClicksOperations(GeneratedClient client) {
        this.service =
                RestProxy.create(OneClicksService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientOneClicksOperations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientOneCl")
    private interface OneClicksService {
        @Get("/v2/1-clicks")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<OneClicksListResponse> list(
                @HostParam("$host") String host, @QueryParam("type") Enum0 type, @HeaderParam("Accept") String accept);

        @Post("/v2/1-clicks/kubernetes")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<OneClicksInstallKubernetesResponse> installKubernetes(
                @HostParam("$host") String host,
                @BodyParam("application/json") OneClicksCreate body,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List 1-Click Applications
     *
     * <p>To list all available 1-Click applications, send a GET request to `/v2/1-clicks`. The `type` may be provided
     * as query paramater in order to restrict results to a certain type of 1-Click, for example:
     * `/v2/1-clicks?type=droplet`. Current supported types are `kubernetes` and `droplet`.
     *
     * <p>The response will be a JSON object with a key called `1_clicks`. This will be set to an array of 1-Click
     * application data, each of which will contain the the slug and type for the 1-Click.
     *
     * @param type Restrict results to a certain type of 1-Click.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OneClicksListResponse> listWithResponseAsync(Enum0 type) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), type, accept);
    }

    /**
     * List 1-Click Applications
     *
     * <p>To list all available 1-Click applications, send a GET request to `/v2/1-clicks`. The `type` may be provided
     * as query paramater in order to restrict results to a certain type of 1-Click, for example:
     * `/v2/1-clicks?type=droplet`. Current supported types are `kubernetes` and `droplet`.
     *
     * <p>The response will be a JSON object with a key called `1_clicks`. This will be set to an array of 1-Click
     * application data, each of which will contain the the slug and type for the 1-Click.
     *
     * @param type Restrict results to a certain type of 1-Click.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync(Enum0 type) {
        return listWithResponseAsync(type).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Install Kubernetes 1-Click Applications
     *
     * <p>To install a Kubernetes 1-Click application on a cluster, send a POST request to `/v2/1-clicks/kubernetes`.
     * The `addon_slugs` and `cluster_uuid` must be provided as body parameter in order to specify which 1-Click
     * application(s) to install. To list all available 1-Click Kubernetes applications, send a request to
     * `/v2/1-clicks?type=kubernetes`.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OneClicksInstallKubernetesResponse> installKubernetesWithResponseAsync(OneClicksCreate body) {
        final String accept = "application/json";
        return service.installKubernetes(this.client.getHost(), body, accept);
    }

    /**
     * Install Kubernetes 1-Click Applications
     *
     * <p>To install a Kubernetes 1-Click application on a cluster, send a POST request to `/v2/1-clicks/kubernetes`.
     * The `addon_slugs` and `cluster_uuid` must be provided as body parameter in order to specify which 1-Click
     * application(s) to install. To list all available 1-Click Kubernetes applications, send a request to
     * `/v2/1-clicks?type=kubernetes`.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> installKubernetesAsync(OneClicksCreate body) {
        return installKubernetesWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
