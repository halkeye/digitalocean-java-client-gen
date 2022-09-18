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
import com.azure.core.util.Context;
import com.digitalocean.api.models.AccountsGetResponse;
import com.digitalocean.api.models.ErrorException;
import java.util.Objects;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Accounts.
 */
public final class Accounts {
    /**
     * The proxy service used to perform REST calls.
     */
    private final AccountsService service;

    /**
     * The service client containing this operation class.
     */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Accounts.
     * 
     * @param client the instance of the service client containing this operation class.
     */
     Accounts(GeneratedClient client) {
        this.service = RestProxy.create(AccountsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientAccounts to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientAccou")
    private interface AccountsService {
        @Get("/v2/account")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<AccountsGetResponse> get(@HostParam("$host") String host, @HeaderParam("Accept") String accept);
    }

    /**
     * Get User Information
     * 
     * To show information about the current user account, send a GET request to `/v2/account`.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AccountsGetResponse> getWithResponseAsync() {
        final String accept = "application/json";
        return service.get(this.client.getHost(), accept);
    }

    /**
     * Get User Information
     * 
     * To show information about the current user account, send a GET request to `/v2/account`.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync() {
        return getWithResponseAsync()
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}
}
