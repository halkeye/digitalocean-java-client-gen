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
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.SshKeys;
import com.digitalocean.api.models.SshKeysCreateResponse;
import com.digitalocean.api.models.SshKeysDeleteResponse;
import com.digitalocean.api.models.SshKeysGetResponse;
import com.digitalocean.api.models.SshKeysListResponse;
import com.digitalocean.api.models.SshKeysUpdateResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SshKeysOperations. */
public final class SshKeysOperations {
    /** The proxy service used to perform REST calls. */
    private final SshKeysService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of SshKeysOperations.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SshKeysOperations(GeneratedClient client) {
        this.service = RestProxy.create(SshKeysService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientSshKeysOperations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientSshKe")
    private interface SshKeysService {
        @Get("/v2/account/keys")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SshKeysListResponse> list(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);

        @Post("/v2/account/keys")
        @ExpectedResponses({201, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SshKeysCreateResponse> create(
                @HostParam("$host") String host,
                @BodyParam("application/json") SshKeys body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/account/keys/{ssh_key_identifier}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SshKeysGetResponse> get(
                @HostParam("$host") String host,
                @PathParam("ssh_key_identifier") Object sshKeyIdentifier,
                @HeaderParam("Accept") String accept);

        @Put("/v2/account/keys/{ssh_key_identifier}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SshKeysUpdateResponse> update(
                @HostParam("$host") String host,
                @PathParam("ssh_key_identifier") Object sshKeyIdentifier,
                @BodyParam("application/json")
                        PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/account/keys/{ssh_key_identifier}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SshKeysDeleteResponse> delete(
                @HostParam("$host") String host,
                @PathParam("ssh_key_identifier") Object sshKeyIdentifier,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List All SSH Keys
     *
     * <p>To list all of the keys in your account, send a GET request to `/v2/account/keys`. The response will be a JSON
     * object with a key set to `ssh_keys`. The value of this will be an array of ssh_key objects, each of which
     * contains the standard ssh_key attributes.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SshKeysListResponse> listWithResponseAsync(Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), perPage, page, accept);
    }

    /**
     * List All SSH Keys
     *
     * <p>To list all of the keys in your account, send a GET request to `/v2/account/keys`. The response will be a JSON
     * object with a key set to `ssh_keys`. The value of this will be an array of ssh_key objects, each of which
     * contains the standard ssh_key attributes.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync(Integer perPage, Integer page) {
        return listWithResponseAsync(perPage, page).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a New SSH Key
     *
     * <p>To add a new SSH public key to your DigitalOcean account, send a POST request to `/v2/account/keys`. Set the
     * `name` attribute to the name you wish to use and the `public_key` attribute to the full public key you are
     * adding.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SshKeysCreateResponse> createWithResponseAsync(SshKeys body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), body, accept);
    }

    /**
     * Create a New SSH Key
     *
     * <p>To add a new SSH public key to your DigitalOcean account, send a POST request to `/v2/account/keys`. Set the
     * `name` attribute to the name you wish to use and the `public_key` attribute to the full public key you are
     * adding.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAsync(SshKeys body) {
        return createWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing SSH Key
     *
     * <p>To get information about a key, send a GET request to `/v2/account/keys/$KEY_ID` or
     * `/v2/account/keys/$KEY_FINGERPRINT`. The response will be a JSON object with the key `ssh_key` and value an
     * ssh_key object which contains the standard ssh_key attributes.
     *
     * @param sshKeyIdentifier Either the ID or the fingerprint of an existing SSH key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SshKeysGetResponse> getWithResponseAsync(Object sshKeyIdentifier) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), sshKeyIdentifier, accept);
    }

    /**
     * Retrieve an Existing SSH Key
     *
     * <p>To get information about a key, send a GET request to `/v2/account/keys/$KEY_ID` or
     * `/v2/account/keys/$KEY_FINGERPRINT`. The response will be a JSON object with the key `ssh_key` and value an
     * ssh_key object which contains the standard ssh_key attributes.
     *
     * @param sshKeyIdentifier Either the ID or the fingerprint of an existing SSH key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(Object sshKeyIdentifier) {
        return getWithResponseAsync(sshKeyIdentifier).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update an SSH Key's Name
     *
     * <p>To update the name of an SSH key, send a PUT request to either `/v2/account/keys/$SSH_KEY_ID` or
     * `/v2/account/keys/$SSH_KEY_FINGERPRINT`. Set the `name` attribute to the new name you want to use.
     *
     * @param sshKeyIdentifier Either the ID or the fingerprint of an existing SSH key.
     * @param body Set the `name` attribute to the new name you want to use.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SshKeysUpdateResponse> updateWithResponseAsync(
            Object sshKeyIdentifier,
            PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.update(this.client.getHost(), sshKeyIdentifier, body, accept);
    }

    /**
     * Update an SSH Key's Name
     *
     * <p>To update the name of an SSH key, send a PUT request to either `/v2/account/keys/$SSH_KEY_ID` or
     * `/v2/account/keys/$SSH_KEY_FINGERPRINT`. Set the `name` attribute to the new name you want to use.
     *
     * @param sshKeyIdentifier Either the ID or the fingerprint of an existing SSH key.
     * @param body Set the `name` attribute to the new name you want to use.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateAsync(
            Object sshKeyIdentifier,
            PathsEyeh4JV2AccountKeysSshKeyIdentifierPutRequestbodyContentApplicationJsonSchema body) {
        return updateWithResponseAsync(sshKeyIdentifier, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete an SSH Key
     *
     * <p>To destroy a public SSH key that you have in your account, send a DELETE request to `/v2/account/keys/$KEY_ID`
     * or `/v2/account/keys/$KEY_FINGERPRINT`. A 204 status will be returned, indicating that the action was successful
     * and that the response body is empty.
     *
     * @param sshKeyIdentifier Either the ID or the fingerprint of an existing SSH key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SshKeysDeleteResponse> deleteWithResponseAsync(Object sshKeyIdentifier) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), sshKeyIdentifier, accept);
    }

    /**
     * Delete an SSH Key
     *
     * <p>To destroy a public SSH key that you have in your account, send a DELETE request to `/v2/account/keys/$KEY_ID`
     * or `/v2/account/keys/$KEY_FINGERPRINT`. A 204 status will be returned, indicating that the action was successful
     * and that the response body is empty.
     *
     * @param sshKeyIdentifier Either the ID or the fingerprint of an existing SSH key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync(Object sshKeyIdentifier) {
        return deleteWithResponseAsync(sshKeyIdentifier).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
