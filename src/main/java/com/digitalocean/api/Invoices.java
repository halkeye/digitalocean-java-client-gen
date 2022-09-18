package com.digitalocean.api;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.InvoicesGetByUuidResponse;
import com.digitalocean.api.models.InvoicesGetCsvByUuidResponse;
import com.digitalocean.api.models.InvoicesGetPdfByUuidResponse;
import com.digitalocean.api.models.InvoicesGetSummaryByUuidResponse;
import com.digitalocean.api.models.InvoicesListResponse;
import java.util.Objects;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Invoices.
 */
public final class Invoices {
    /**
     * The proxy service used to perform REST calls.
     */
    private final InvoicesService service;

    /**
     * The service client containing this operation class.
     */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Invoices.
     * 
     * @param client the instance of the service client containing this operation class.
     */
     Invoices(GeneratedClient client) {
        this.service = RestProxy.create(InvoicesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientInvoices to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientInvoi")
    private interface InvoicesService {
        @Get("/v2/customers/my/invoices")
        @ExpectedResponses({200, 401, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<InvoicesListResponse> list(@HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Get("/v2/customers/my/invoices/{invoice_uuid}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<InvoicesGetByUuidResponse> getByUuid(@HostParam("$host") String host, @PathParam("invoice_uuid") String invoiceUuid, @HeaderParam("Accept") String accept);

        @Get("/v2/customers/my/invoices/{invoice_uuid}/csv")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<InvoicesGetCsvByUuidResponse> getCsvByUuid(@HostParam("$host") String host, @PathParam("invoice_uuid") String invoiceUuid, @HeaderParam("Accept") String accept);

        @Get("/v2/customers/my/invoices/{invoice_uuid}/pdf")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<InvoicesGetPdfByUuidResponse> getPdfByUuid(@HostParam("$host") String host, @PathParam("invoice_uuid") String invoiceUuid, @HeaderParam("Accept") String accept);

        @Get("/v2/customers/my/invoices/{invoice_uuid}/summary")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<InvoicesGetSummaryByUuidResponse> getSummaryByUuid(@HostParam("$host") String host, @PathParam("invoice_uuid") String invoiceUuid, @HeaderParam("Accept") String accept);
    }

    /**
     * List All Invoices
     * 
     * To retrieve a list of all invoices, send a GET request to `/v2/customers/my/invoices`.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InvoicesListResponse> listWithResponseAsync() {
        final String accept = "application/json";
        return service.list(this.client.getHost(), accept);
    }

    /**
     * List All Invoices
     * 
     * To retrieve a list of all invoices, send a GET request to `/v2/customers/my/invoices`.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync() {
        return listWithResponseAsync()
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve an Invoice by UUID
     * 
     * To retrieve the invoice items for an invoice, send a GET request to `/v2/customers/my/invoices/$INVOICE_UUID`.
     * 
     * @param invoiceUuid UUID of the invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InvoicesGetByUuidResponse> getByUuidWithResponseAsync(String invoiceUuid) {
        final String accept = "application/json";
        return service.getByUuid(this.client.getHost(), invoiceUuid, accept);
    }

    /**
     * Retrieve an Invoice by UUID
     * 
     * To retrieve the invoice items for an invoice, send a GET request to `/v2/customers/my/invoices/$INVOICE_UUID`.
     * 
     * @param invoiceUuid UUID of the invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getByUuidAsync(String invoiceUuid) {
        return getByUuidWithResponseAsync(invoiceUuid)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve an Invoice CSV by UUID
     * 
     * To retrieve a CSV for an invoice, send a GET request to `/v2/customers/my/invoices/$INVOICE_UUID/csv`.
     * 
     * @param invoiceUuid UUID of the invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InvoicesGetCsvByUuidResponse> getCsvByUuidWithResponseAsync(String invoiceUuid) {
        final String accept = "text/csv, application/json";
        return service.getCsvByUuid(this.client.getHost(), invoiceUuid, accept);
    }

    /**
     * Retrieve an Invoice CSV by UUID
     * 
     * To retrieve a CSV for an invoice, send a GET request to `/v2/customers/my/invoices/$INVOICE_UUID/csv`.
     * 
     * @param invoiceUuid UUID of the invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getCsvByUuidAsync(String invoiceUuid) {
        return getCsvByUuidWithResponseAsync(invoiceUuid)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve an Invoice PDF by UUID
     * 
     * To retrieve a PDF for an invoice, send a GET request to `/v2/customers/my/invoices/$INVOICE_UUID/pdf`.
     * 
     * @param invoiceUuid UUID of the invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InvoicesGetPdfByUuidResponse> getPdfByUuidWithResponseAsync(String invoiceUuid) {
        final String accept = "application/pdf, application/json";
        return service.getPdfByUuid(this.client.getHost(), invoiceUuid, accept);
    }

    /**
     * Retrieve an Invoice PDF by UUID
     * 
     * To retrieve a PDF for an invoice, send a GET request to `/v2/customers/my/invoices/$INVOICE_UUID/pdf`.
     * 
     * @param invoiceUuid UUID of the invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> getPdfByUuidAsync(String invoiceUuid) {
        return getPdfByUuidWithResponseAsync(invoiceUuid)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Retrieve an Invoice Summary by UUID
     * 
     * To retrieve a summary for an invoice, send a GET request to `/v2/customers/my/invoices/$INVOICE_UUID/summary`.
     * 
     * @param invoiceUuid UUID of the invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InvoicesGetSummaryByUuidResponse> getSummaryByUuidWithResponseAsync(String invoiceUuid) {
        final String accept = "application/json";
        return service.getSummaryByUuid(this.client.getHost(), invoiceUuid, accept);
    }

    /**
     * Retrieve an Invoice Summary by UUID
     * 
     * To retrieve a summary for an invoice, send a GET request to `/v2/customers/my/invoices/$INVOICE_UUID/summary`.
     * 
     * @param invoiceUuid UUID of the invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getSummaryByUuidAsync(String invoiceUuid) {
        return getSummaryByUuidWithResponseAsync(invoiceUuid)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}
}
