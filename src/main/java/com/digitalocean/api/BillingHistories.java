package com.digitalocean.api;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.digitalocean.api.models.BillingHistoriesListResponse;
import com.digitalocean.api.models.ErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BillingHistories. */
public final class BillingHistories {
    /** The proxy service used to perform REST calls. */
    private final BillingHistoriesService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of BillingHistories.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BillingHistories(GeneratedClient client) {
        this.service =
                RestProxy.create(
                        BillingHistoriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientBillingHistories to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientBilli")
    private interface BillingHistoriesService {
        @Get("/v2/customers/my/billing_history")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<BillingHistoriesListResponse> list(@HostParam("$host") String host, @HeaderParam("Accept") String accept);
    }

    /**
     * List Billing History
     *
     * <p>To retrieve a list of all billing history entries, send a GET request to `/v2/customers/my/billing_history`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BillingHistoriesListResponse> listWithResponseAsync() {
        final String accept = "application/json";
        return service.list(this.client.getHost(), accept);
    }

    /**
     * List Billing History
     *
     * <p>To retrieve a list of all billing history entries, send a GET request to `/v2/customers/my/billing_history`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync() {
        return listWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
