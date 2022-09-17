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
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.digitalocean.api.models.CertificatesCreateResponse;
import com.digitalocean.api.models.CertificatesDeleteResponse;
import com.digitalocean.api.models.CertificatesGetResponse;
import com.digitalocean.api.models.CertificatesListResponse;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Certificates. */
public final class Certificates {
    /** The proxy service used to perform REST calls. */
    private final CertificatesService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Certificates.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Certificates(GeneratedClient client) {
        this.service =
                RestProxy.create(CertificatesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientCertificates to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientCerti")
    private interface CertificatesService {
        @Get("/v2/certificates")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<CertificatesListResponse> list(
                @HostParam("$host") String host,
                @QueryParam("per_page") Integer perPage,
                @QueryParam("page") Integer page,
                @HeaderParam("Accept") String accept);

        @Post("/v2/certificates")
        @ExpectedResponses({201, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<CertificatesCreateResponse> create(
                @HostParam("$host") String host,
                @BodyParam("application/json") Object body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/certificates/{certificate_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<CertificatesGetResponse> get(
                @HostParam("$host") String host,
                @PathParam("certificate_id") UUID certificateId,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/certificates/{certificate_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<CertificatesDeleteResponse> delete(
                @HostParam("$host") String host,
                @PathParam("certificate_id") UUID certificateId,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List All Certificates
     *
     * <p>To list all of the certificates available on your account, send a GET request to `/v2/certificates`.
     *
     * @param perPage Number of items returned per page.
     * @param page Which 'page' of paginated results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CertificatesListResponse> listWithResponseAsync(Integer perPage, Integer page) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), perPage, page, accept);
    }

    /**
     * List All Certificates
     *
     * <p>To list all of the certificates available on your account, send a GET request to `/v2/certificates`.
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
     * Create a New Certificate
     *
     * <p>To upload new SSL certificate which you have previously generated, send a POST request to `/v2/certificates`.
     *
     * <p>When uploading a user-generated certificate, the `private_key`, `leaf_certificate`, and optionally the
     * `certificate_chain` attributes should be provided. The type must be set to `custom`.
     *
     * <p>When using Let's Encrypt to create a certificate, the `dns_names` attribute must be provided, and the type
     * must be set to `lets_encrypt`.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CertificatesCreateResponse> createWithResponseAsync(Object body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), body, accept);
    }

    /**
     * Create a New Certificate
     *
     * <p>To upload new SSL certificate which you have previously generated, send a POST request to `/v2/certificates`.
     *
     * <p>When uploading a user-generated certificate, the `private_key`, `leaf_certificate`, and optionally the
     * `certificate_chain` attributes should be provided. The type must be set to `custom`.
     *
     * <p>When using Let's Encrypt to create a certificate, the `dns_names` attribute must be provided, and the type
     * must be set to `lets_encrypt`.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAsync(Object body) {
        return createWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Certificate
     *
     * <p>To show information about an existing certificate, send a GET request to `/v2/certificates/$CERTIFICATE_ID`.
     *
     * @param certificateId A unique identifier for a certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CertificatesGetResponse> getWithResponseAsync(UUID certificateId) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), certificateId, accept);
    }

    /**
     * Retrieve an Existing Certificate
     *
     * <p>To show information about an existing certificate, send a GET request to `/v2/certificates/$CERTIFICATE_ID`.
     *
     * @param certificateId A unique identifier for a certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(UUID certificateId) {
        return getWithResponseAsync(certificateId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete a Certificate
     *
     * <p>To delete a specific certificate, send a DELETE request to `/v2/certificates/$CERTIFICATE_ID`.
     *
     * @param certificateId A unique identifier for a certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CertificatesDeleteResponse> deleteWithResponseAsync(UUID certificateId) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), certificateId, accept);
    }

    /**
     * Delete a Certificate
     *
     * <p>To delete a specific certificate, send a DELETE request to `/v2/certificates/$CERTIFICATE_ID`.
     *
     * @param certificateId A unique identifier for a certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync(UUID certificateId) {
        return deleteWithResponseAsync(certificateId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
