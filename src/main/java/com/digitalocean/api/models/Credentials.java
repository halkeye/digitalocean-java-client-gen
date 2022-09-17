package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The Credentials model. */
@Fluent
public final class Credentials {
    /*
     * The URL used to access the cluster API server.
     */
    @JsonProperty(value = "server")
    private String server;

    /*
     * A base64 encoding of bytes representing the certificate authority data for accessing the cluster.
     */
    @JsonProperty(value = "certificate_authority_data")
    private byte[] certificateAuthorityData;

    /*
     * A base64 encoding of bytes representing the x509 client
     * certificate data for access the cluster. This is only returned for clusters
     * without support for token-based authentication.
     *
     * Newly created Kubernetes clusters do not return credentials using
     * certificate-based authentication. For additional information,
     * [see here](https://www.digitalocean.com/docs/kubernetes/how-to/connect-to-cluster/#authenticate).
     *
     */
    @JsonProperty(value = "client_certificate_data")
    private byte[] clientCertificateData;

    /*
     * A base64 encoding of bytes representing the x509 client key
     * data for access the cluster. This is only returned for clusters without
     * support for token-based authentication.
     *
     * Newly created Kubernetes clusters do not return credentials using
     * certificate-based authentication. For additional information,
     * [see here](https://www.digitalocean.com/docs/kubernetes/how-to/connect-to-cluster/#authenticate).
     *
     */
    @JsonProperty(value = "client_key_data")
    private byte[] clientKeyData;

    /*
     * An access token used to authenticate with the cluster. This is only returned for clusters with support for
     * token-based authentication.
     */
    @JsonProperty(value = "token")
    private String token;

    /*
     * A time value given in ISO8601 combined date and time format that represents when the access token expires.
     */
    @JsonProperty(value = "expires_at")
    private OffsetDateTime expiresAt;

    /**
     * Get the server property: The URL used to access the cluster API server.
     *
     * @return the server value.
     */
    public String getServer() {
        return this.server;
    }

    /**
     * Set the server property: The URL used to access the cluster API server.
     *
     * @param server the server value to set.
     * @return the Credentials object itself.
     */
    public Credentials setServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * Get the certificateAuthorityData property: A base64 encoding of bytes representing the certificate authority data
     * for accessing the cluster.
     *
     * @return the certificateAuthorityData value.
     */
    public byte[] getCertificateAuthorityData() {
        return CoreUtils.clone(this.certificateAuthorityData);
    }

    /**
     * Set the certificateAuthorityData property: A base64 encoding of bytes representing the certificate authority data
     * for accessing the cluster.
     *
     * @param certificateAuthorityData the certificateAuthorityData value to set.
     * @return the Credentials object itself.
     */
    public Credentials setCertificateAuthorityData(byte[] certificateAuthorityData) {
        this.certificateAuthorityData = CoreUtils.clone(certificateAuthorityData);
        return this;
    }

    /**
     * Get the clientCertificateData property: A base64 encoding of bytes representing the x509 client certificate data
     * for access the cluster. This is only returned for clusters without support for token-based authentication.
     *
     * <p>Newly created Kubernetes clusters do not return credentials using certificate-based authentication. For
     * additional information, [see
     * here](https://www.digitalocean.com/docs/kubernetes/how-to/connect-to-cluster/#authenticate).
     *
     * @return the clientCertificateData value.
     */
    public byte[] getClientCertificateData() {
        return CoreUtils.clone(this.clientCertificateData);
    }

    /**
     * Set the clientCertificateData property: A base64 encoding of bytes representing the x509 client certificate data
     * for access the cluster. This is only returned for clusters without support for token-based authentication.
     *
     * <p>Newly created Kubernetes clusters do not return credentials using certificate-based authentication. For
     * additional information, [see
     * here](https://www.digitalocean.com/docs/kubernetes/how-to/connect-to-cluster/#authenticate).
     *
     * @param clientCertificateData the clientCertificateData value to set.
     * @return the Credentials object itself.
     */
    public Credentials setClientCertificateData(byte[] clientCertificateData) {
        this.clientCertificateData = CoreUtils.clone(clientCertificateData);
        return this;
    }

    /**
     * Get the clientKeyData property: A base64 encoding of bytes representing the x509 client key data for access the
     * cluster. This is only returned for clusters without support for token-based authentication.
     *
     * <p>Newly created Kubernetes clusters do not return credentials using certificate-based authentication. For
     * additional information, [see
     * here](https://www.digitalocean.com/docs/kubernetes/how-to/connect-to-cluster/#authenticate).
     *
     * @return the clientKeyData value.
     */
    public byte[] getClientKeyData() {
        return CoreUtils.clone(this.clientKeyData);
    }

    /**
     * Set the clientKeyData property: A base64 encoding of bytes representing the x509 client key data for access the
     * cluster. This is only returned for clusters without support for token-based authentication.
     *
     * <p>Newly created Kubernetes clusters do not return credentials using certificate-based authentication. For
     * additional information, [see
     * here](https://www.digitalocean.com/docs/kubernetes/how-to/connect-to-cluster/#authenticate).
     *
     * @param clientKeyData the clientKeyData value to set.
     * @return the Credentials object itself.
     */
    public Credentials setClientKeyData(byte[] clientKeyData) {
        this.clientKeyData = CoreUtils.clone(clientKeyData);
        return this;
    }

    /**
     * Get the token property: An access token used to authenticate with the cluster. This is only returned for clusters
     * with support for token-based authentication.
     *
     * @return the token value.
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Set the token property: An access token used to authenticate with the cluster. This is only returned for clusters
     * with support for token-based authentication.
     *
     * @param token the token value to set.
     * @return the Credentials object itself.
     */
    public Credentials setToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get the expiresAt property: A time value given in ISO8601 combined date and time format that represents when the
     * access token expires.
     *
     * @return the expiresAt value.
     */
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * Set the expiresAt property: A time value given in ISO8601 combined date and time format that represents when the
     * access token expires.
     *
     * @param expiresAt the expiresAt value to set.
     * @return the Credentials object itself.
     */
    public Credentials setExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
}
