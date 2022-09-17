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
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.digitalocean.api.models.Domain;
import com.digitalocean.api.models.DomainRecord;
import com.digitalocean.api.models.DomainsCreateRecordResponse;
import com.digitalocean.api.models.DomainsCreateResponse;
import com.digitalocean.api.models.DomainsDeleteRecordResponse;
import com.digitalocean.api.models.DomainsDeleteResponse;
import com.digitalocean.api.models.DomainsGetRecordResponse;
import com.digitalocean.api.models.DomainsGetResponse;
import com.digitalocean.api.models.DomainsListRecordsResponse;
import com.digitalocean.api.models.DomainsListResponse;
import com.digitalocean.api.models.DomainsPatchRecordResponse;
import com.digitalocean.api.models.DomainsUpdateRecordResponse;
import com.digitalocean.api.models.Enum48;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Domains. */
public final class Domains {
    /** The proxy service used to perform REST calls. */
    private final DomainsService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Domains.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Domains(GeneratedClient client) {
        this.service = RestProxy.create(DomainsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientDomains to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientDomai")
    private interface DomainsService {
        @Get("/v2/domains")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DomainsListResponse> list(@HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Post("/v2/domains")
        @ExpectedResponses({201, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DomainsCreateResponse> create(
                @HostParam("$host") String host,
                @BodyParam("application/json") Domain body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/domains/{domain_name}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DomainsGetResponse> get(
                @HostParam("$host") String host,
                @PathParam("domain_name") String domainName,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/domains/{domain_name}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DomainsDeleteResponse> delete(
                @HostParam("$host") String host,
                @PathParam("domain_name") String domainName,
                @HeaderParam("Accept") String accept);

        @Get("/v2/domains/{domain_name}/records")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DomainsListRecordsResponse> listRecords(
                @HostParam("$host") String host,
                @PathParam("domain_name") String domainName,
                @QueryParam("name") String name,
                @QueryParam("type") Enum48 type,
                @HeaderParam("Accept") String accept);

        @Post("/v2/domains/{domain_name}/records")
        @ExpectedResponses({201, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DomainsCreateRecordResponse> createRecord(
                @HostParam("$host") String host,
                @PathParam("domain_name") String domainName,
                @BodyParam("application/json") Object body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/domains/{domain_name}/records/{domain_record_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DomainsGetRecordResponse> getRecord(
                @HostParam("$host") String host,
                @PathParam("domain_name") String domainName,
                @PathParam("domain_record_id") int domainRecordId,
                @HeaderParam("Accept") String accept);

        @Patch("/v2/domains/{domain_name}/records/{domain_record_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DomainsPatchRecordResponse> patchRecord(
                @HostParam("$host") String host,
                @PathParam("domain_name") String domainName,
                @PathParam("domain_record_id") int domainRecordId,
                @BodyParam("application/json") DomainRecord body,
                @HeaderParam("Accept") String accept);

        @Put("/v2/domains/{domain_name}/records/{domain_record_id}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DomainsUpdateRecordResponse> updateRecord(
                @HostParam("$host") String host,
                @PathParam("domain_name") String domainName,
                @PathParam("domain_record_id") int domainRecordId,
                @BodyParam("application/json") DomainRecord body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/domains/{domain_name}/records/{domain_record_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DomainsDeleteRecordResponse> deleteRecord(
                @HostParam("$host") String host,
                @PathParam("domain_name") String domainName,
                @PathParam("domain_record_id") int domainRecordId,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List All Domains
     *
     * <p>To retrieve a list of all of the domains in your account, send a GET request to `/v2/domains`.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DomainsListResponse> listWithResponseAsync() {
        final String accept = "application/json";
        return service.list(this.client.getHost(), accept);
    }

    /**
     * List All Domains
     *
     * <p>To retrieve a list of all of the domains in your account, send a GET request to `/v2/domains`.
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
     * Create a New Domain
     *
     * <p>To create a new domain, send a POST request to `/v2/domains`. Set the "name" attribute to the domain name you
     * are adding. Optionally, you may set the "ip_address" attribute, and an A record will be automatically created
     * pointing to the apex domain.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DomainsCreateResponse> createWithResponseAsync(Domain body) {
        final String accept = "application/json";
        return service.create(this.client.getHost(), body, accept);
    }

    /**
     * Create a New Domain
     *
     * <p>To create a new domain, send a POST request to `/v2/domains`. Set the "name" attribute to the domain name you
     * are adding. Optionally, you may set the "ip_address" attribute, and an A record will be automatically created
     * pointing to the apex domain.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createAsync(Domain body) {
        return createWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Domain
     *
     * <p>To get details about a specific domain, send a GET request to `/v2/domains/$DOMAIN_NAME`.
     *
     * @param domainName The name of the domain itself.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DomainsGetResponse> getWithResponseAsync(String domainName) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), domainName, accept);
    }

    /**
     * Retrieve an Existing Domain
     *
     * <p>To get details about a specific domain, send a GET request to `/v2/domains/$DOMAIN_NAME`.
     *
     * @param domainName The name of the domain itself.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(String domainName) {
        return getWithResponseAsync(domainName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete a Domain
     *
     * <p>To delete a domain, send a DELETE request to `/v2/domains/$DOMAIN_NAME`.
     *
     * @param domainName The name of the domain itself.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DomainsDeleteResponse> deleteWithResponseAsync(String domainName) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), domainName, accept);
    }

    /**
     * Delete a Domain
     *
     * <p>To delete a domain, send a DELETE request to `/v2/domains/$DOMAIN_NAME`.
     *
     * @param domainName The name of the domain itself.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync(String domainName) {
        return deleteWithResponseAsync(domainName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List All Domain Records
     *
     * <p>To get a listing of all records configured for a domain, send a GET request to
     * `/v2/domains/$DOMAIN_NAME/records`. The list of records returned can be filtered by using the `name` and `type`
     * query parameters. For example, to only include A records for a domain, send a GET request to
     * `/v2/domains/$DOMAIN_NAME/records?type=A`. `name` must be a fully qualified record name. For example, to only
     * include records matching `sub.example.com`, send a GET request to
     * `/v2/domains/$DOMAIN_NAME/records?name=sub.example.com`. Both name and type may be used together.
     *
     * @param domainName The name of the domain itself.
     * @param name A fully qualified record name. For example, to only include records matching sub.example.com, send a
     *     GET request to `/v2/domains/$DOMAIN_NAME/records?name=sub.example.com`.
     * @param type The type of the DNS record. For example: A, CNAME, TXT, ...
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DomainsListRecordsResponse> listRecordsWithResponseAsync(String domainName, String name, Enum48 type) {
        final String accept = "application/json";
        return service.listRecords(this.client.getHost(), domainName, name, type, accept);
    }

    /**
     * List All Domain Records
     *
     * <p>To get a listing of all records configured for a domain, send a GET request to
     * `/v2/domains/$DOMAIN_NAME/records`. The list of records returned can be filtered by using the `name` and `type`
     * query parameters. For example, to only include A records for a domain, send a GET request to
     * `/v2/domains/$DOMAIN_NAME/records?type=A`. `name` must be a fully qualified record name. For example, to only
     * include records matching `sub.example.com`, send a GET request to
     * `/v2/domains/$DOMAIN_NAME/records?name=sub.example.com`. Both name and type may be used together.
     *
     * @param domainName The name of the domain itself.
     * @param name A fully qualified record name. For example, to only include records matching sub.example.com, send a
     *     GET request to `/v2/domains/$DOMAIN_NAME/records?name=sub.example.com`.
     * @param type The type of the DNS record. For example: A, CNAME, TXT, ...
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listRecordsAsync(String domainName, String name, Enum48 type) {
        return listRecordsWithResponseAsync(domainName, name, type).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a New Domain Record
     *
     * <p>To create a new record to a domain, send a POST request to `/v2/domains/$DOMAIN_NAME/records`.
     *
     * <p>The request must include all of the required fields for the domain record type being added.
     *
     * <p>See the [attribute table](#tag/Domain-Records) for details regarding record types and their respective
     * required attributes.
     *
     * @param domainName The name of the domain itself.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DomainsCreateRecordResponse> createRecordWithResponseAsync(String domainName, Object body) {
        final String accept = "application/json";
        return service.createRecord(this.client.getHost(), domainName, body, accept);
    }

    /**
     * Create a New Domain Record
     *
     * <p>To create a new record to a domain, send a POST request to `/v2/domains/$DOMAIN_NAME/records`.
     *
     * <p>The request must include all of the required fields for the domain record type being added.
     *
     * <p>See the [attribute table](#tag/Domain-Records) for details regarding record types and their respective
     * required attributes.
     *
     * @param domainName The name of the domain itself.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createRecordAsync(String domainName, Object body) {
        return createRecordWithResponseAsync(domainName, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Domain Record
     *
     * <p>To retrieve a specific domain record, send a GET request to `/v2/domains/$DOMAIN_NAME/records/$RECORD_ID`.
     *
     * @param domainName The name of the domain itself.
     * @param domainRecordId The unique identifier of the domain record.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DomainsGetRecordResponse> getRecordWithResponseAsync(String domainName, int domainRecordId) {
        final String accept = "application/json";
        return service.getRecord(this.client.getHost(), domainName, domainRecordId, accept);
    }

    /**
     * Retrieve an Existing Domain Record
     *
     * <p>To retrieve a specific domain record, send a GET request to `/v2/domains/$DOMAIN_NAME/records/$RECORD_ID`.
     *
     * @param domainName The name of the domain itself.
     * @param domainRecordId The unique identifier of the domain record.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getRecordAsync(String domainName, int domainRecordId) {
        return getRecordWithResponseAsync(domainName, domainRecordId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update a Domain Record
     *
     * <p>To update an existing record, send a PATCH request to `/v2/domains/$DOMAIN_NAME/records/$DOMAIN_RECORD_ID`.
     * Any attribute valid for the record type can be set to a new value for the record.
     *
     * <p>See the [attribute table](#tag/Domain-Records) for details regarding record types and their respective
     * attributes.
     *
     * @param domainName The name of the domain itself.
     * @param domainRecordId The unique identifier of the domain record.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DomainsPatchRecordResponse> patchRecordWithResponseAsync(
            String domainName, int domainRecordId, DomainRecord body) {
        final String accept = "application/json";
        return service.patchRecord(this.client.getHost(), domainName, domainRecordId, body, accept);
    }

    /**
     * Update a Domain Record
     *
     * <p>To update an existing record, send a PATCH request to `/v2/domains/$DOMAIN_NAME/records/$DOMAIN_RECORD_ID`.
     * Any attribute valid for the record type can be set to a new value for the record.
     *
     * <p>See the [attribute table](#tag/Domain-Records) for details regarding record types and their respective
     * attributes.
     *
     * @param domainName The name of the domain itself.
     * @param domainRecordId The unique identifier of the domain record.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> patchRecordAsync(String domainName, int domainRecordId, DomainRecord body) {
        return patchRecordWithResponseAsync(domainName, domainRecordId, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update a Domain Record
     *
     * <p>To update an existing record, send a PUT request to `/v2/domains/$DOMAIN_NAME/records/$DOMAIN_RECORD_ID`. Any
     * attribute valid for the record type can be set to a new value for the record.
     *
     * <p>See the [attribute table](#tag/Domain-Records) for details regarding record types and their respective
     * attributes.
     *
     * @param domainName The name of the domain itself.
     * @param domainRecordId The unique identifier of the domain record.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DomainsUpdateRecordResponse> updateRecordWithResponseAsync(
            String domainName, int domainRecordId, DomainRecord body) {
        final String accept = "application/json";
        return service.updateRecord(this.client.getHost(), domainName, domainRecordId, body, accept);
    }

    /**
     * Update a Domain Record
     *
     * <p>To update an existing record, send a PUT request to `/v2/domains/$DOMAIN_NAME/records/$DOMAIN_RECORD_ID`. Any
     * attribute valid for the record type can be set to a new value for the record.
     *
     * <p>See the [attribute table](#tag/Domain-Records) for details regarding record types and their respective
     * attributes.
     *
     * @param domainName The name of the domain itself.
     * @param domainRecordId The unique identifier of the domain record.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateRecordAsync(String domainName, int domainRecordId, DomainRecord body) {
        return updateRecordWithResponseAsync(domainName, domainRecordId, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete a Domain Record
     *
     * <p>To delete a record for a domain, send a DELETE request to
     * `/v2/domains/$DOMAIN_NAME/records/$DOMAIN_RECORD_ID`.
     *
     * <p>The record will be deleted and the response status will be a 204. This indicates a successful request with no
     * body returned.
     *
     * @param domainName The name of the domain itself.
     * @param domainRecordId The unique identifier of the domain record.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DomainsDeleteRecordResponse> deleteRecordWithResponseAsync(String domainName, int domainRecordId) {
        final String accept = "application/json";
        return service.deleteRecord(this.client.getHost(), domainName, domainRecordId, accept);
    }

    /**
     * Delete a Domain Record
     *
     * <p>To delete a record for a domain, send a DELETE request to
     * `/v2/domains/$DOMAIN_NAME/records/$DOMAIN_RECORD_ID`.
     *
     * <p>The record will be deleted and the response status will be a 204. This indicates a successful request with no
     * body returned.
     *
     * @param domainName The name of the domain itself.
     * @param domainRecordId The unique identifier of the domain record.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteRecordAsync(String domainName, int domainRecordId) {
        return deleteRecordWithResponseAsync(domainName, domainRecordId)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
