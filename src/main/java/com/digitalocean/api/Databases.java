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
import com.digitalocean.api.models.ConnectionPool;
import com.digitalocean.api.models.Database;
import com.digitalocean.api.models.DatabaseClusterResize;
import com.digitalocean.api.models.DatabaseConfig;
import com.digitalocean.api.models.DatabaseMaintenanceWindow;
import com.digitalocean.api.models.DatabaseUser;
import com.digitalocean.api.models.DatabasesAddConnectionPoolResponse;
import com.digitalocean.api.models.DatabasesAddResponse;
import com.digitalocean.api.models.DatabasesAddUserResponse;
import com.digitalocean.api.models.DatabasesCreateClusterResponse;
import com.digitalocean.api.models.DatabasesCreateReplicaResponse;
import com.digitalocean.api.models.DatabasesDeleteConnectionPoolResponse;
import com.digitalocean.api.models.DatabasesDeleteOnlineMigrationResponse;
import com.digitalocean.api.models.DatabasesDeleteResponse;
import com.digitalocean.api.models.DatabasesDeleteUserResponse;
import com.digitalocean.api.models.DatabasesDestroyClusterResponse;
import com.digitalocean.api.models.DatabasesDestroyReplicaResponse;
import com.digitalocean.api.models.DatabasesGetCaResponse;
import com.digitalocean.api.models.DatabasesGetClusterResponse;
import com.digitalocean.api.models.DatabasesGetConfigResponse;
import com.digitalocean.api.models.DatabasesGetConnectionPoolResponse;
import com.digitalocean.api.models.DatabasesGetEvictionPolicyResponse;
import com.digitalocean.api.models.DatabasesGetMigrationStatusResponse;
import com.digitalocean.api.models.DatabasesGetReplicaResponse;
import com.digitalocean.api.models.DatabasesGetResponse;
import com.digitalocean.api.models.DatabasesGetSqlModeResponse;
import com.digitalocean.api.models.DatabasesGetUserResponse;
import com.digitalocean.api.models.DatabasesListBackupsResponse;
import com.digitalocean.api.models.DatabasesListClustersResponse;
import com.digitalocean.api.models.DatabasesListConnectionPoolsResponse;
import com.digitalocean.api.models.DatabasesListFirewallRulesResponse;
import com.digitalocean.api.models.DatabasesListOptionsResponse;
import com.digitalocean.api.models.DatabasesListReplicasResponse;
import com.digitalocean.api.models.DatabasesListResponse;
import com.digitalocean.api.models.DatabasesListUsersResponse;
import com.digitalocean.api.models.DatabasesPatchConfigResponse;
import com.digitalocean.api.models.DatabasesResetAuthResponse;
import com.digitalocean.api.models.DatabasesUpdateClusterSizeResponse;
import com.digitalocean.api.models.DatabasesUpdateEvictionPolicyResponse;
import com.digitalocean.api.models.DatabasesUpdateFirewallRulesResponse;
import com.digitalocean.api.models.DatabasesUpdateMaintenanceWindowResponse;
import com.digitalocean.api.models.DatabasesUpdateOnlineMigrationResponse;
import com.digitalocean.api.models.DatabasesUpdateRegionResponse;
import com.digitalocean.api.models.DatabasesUpdateSqlModeResponse;
import com.digitalocean.api.models.Error;
import com.digitalocean.api.models.ErrorException;
import com.digitalocean.api.models.Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.Paths8571FjV2DatabasesDatabaseClusterUuidEvictionPolicyPutRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.SourceDatabase;
import com.digitalocean.api.models.SqlMode;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Databases. */
public final class Databases {
    /** The proxy service used to perform REST calls. */
    private final DatabasesService service;

    /** The service client containing this operation class. */
    private final GeneratedClient client;

    /**
     * Initializes an instance of Databases.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Databases(GeneratedClient client) {
        this.service =
                RestProxy.create(DatabasesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedClientDatabases to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeneratedClientDatab")
    private interface DatabasesService {
        @Get("/v2/databases/options")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesListOptionsResponse> listOptions(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Get("/v2/databases")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesListClustersResponse> listClusters(
                @HostParam("$host") String host,
                @QueryParam("tag_name") String tagName,
                @HeaderParam("Accept") String accept);

        @Post("/v2/databases")
        @ExpectedResponses({201, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesCreateClusterResponse> createCluster(
                @HostParam("$host") String host,
                @BodyParam("application/json") PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesGetClusterResponse> getCluster(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/databases/{database_cluster_uuid}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesDestroyClusterResponse> destroyCluster(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/config")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesGetConfigResponse> getConfig(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @HeaderParam("Accept") String accept);

        @Patch("/v2/databases/{database_cluster_uuid}/config")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesPatchConfigResponse> patchConfig(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @BodyParam("application/json") DatabaseConfig body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/ca")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesGetCaResponse> getCa(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/online-migration")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesGetMigrationStatusResponse> getMigrationStatus(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @HeaderParam("Accept") String accept);

        @Put("/v2/databases/{database_cluster_uuid}/online-migration")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesUpdateOnlineMigrationResponse> updateOnlineMigration(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @BodyParam("application/json") SourceDatabase body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/databases/{database_cluster_uuid}/online-migration/{migration_id}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesDeleteOnlineMigrationResponse> deleteOnlineMigration(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @PathParam("migration_id") String migrationId,
                @HeaderParam("Accept") String accept);

        @Put("/v2/databases/{database_cluster_uuid}/migrate")
        @ExpectedResponses({202, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesUpdateRegionResponse> updateRegion(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @BodyParam("application/json")
                        Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema
                                body,
                @HeaderParam("Accept") String accept);

        @Put("/v2/databases/{database_cluster_uuid}/resize")
        @ExpectedResponses({202, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesUpdateClusterSizeResponse> updateClusterSize(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @BodyParam("application/json") DatabaseClusterResize body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/firewall")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesListFirewallRulesResponse> listFirewallRules(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @HeaderParam("Accept") String accept);

        @Put("/v2/databases/{database_cluster_uuid}/firewall")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesUpdateFirewallRulesResponse> updateFirewallRules(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @BodyParam("application/json")
                        Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema
                                body,
                @HeaderParam("Accept") String accept);

        @Put("/v2/databases/{database_cluster_uuid}/maintenance")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesUpdateMaintenanceWindowResponse> updateMaintenanceWindow(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @BodyParam("application/json") DatabaseMaintenanceWindow body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/backups")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesListBackupsResponse> listBackups(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/replicas")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesListReplicasResponse> listReplicas(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @HeaderParam("Accept") String accept);

        @Post("/v2/databases/{database_cluster_uuid}/replicas")
        @ExpectedResponses({201, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesCreateReplicaResponse> createReplica(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @BodyParam("application/json")
                        PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema
                                body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/replicas/{replica_name}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesGetReplicaResponse> getReplica(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @PathParam("replica_name") String replicaName,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/databases/{database_cluster_uuid}/replicas/{replica_name}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesDestroyReplicaResponse> destroyReplica(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @PathParam("replica_name") String replicaName,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/users")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesListUsersResponse> listUsers(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @HeaderParam("Accept") String accept);

        @Post("/v2/databases/{database_cluster_uuid}/users")
        @ExpectedResponses({201, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesAddUserResponse> addUser(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @BodyParam("application/json") DatabaseUser body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/users/{username}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesGetUserResponse> getUser(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @PathParam("username") String username,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/databases/{database_cluster_uuid}/users/{username}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesDeleteUserResponse> deleteUser(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @PathParam("username") String username,
                @HeaderParam("Accept") String accept);

        @Post("/v2/databases/{database_cluster_uuid}/users/{username}/reset_auth")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesResetAuthResponse> resetAuth(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @PathParam("username") String username,
                @BodyParam("application/json")
                        PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema
                                body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/dbs")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesListResponse> list(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @HeaderParam("Accept") String accept);

        @Post("/v2/databases/{database_cluster_uuid}/dbs")
        @ExpectedResponses({201, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesAddResponse> add(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @BodyParam("application/json") Database body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/dbs/{database_name}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesGetResponse> get(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @PathParam("database_name") String databaseName,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/databases/{database_cluster_uuid}/dbs/{database_name}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesDeleteResponse> delete(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @PathParam("database_name") String databaseName,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/pools")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesListConnectionPoolsResponse> listConnectionPools(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @HeaderParam("Accept") String accept);

        @Post("/v2/databases/{database_cluster_uuid}/pools")
        @ExpectedResponses({201, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesAddConnectionPoolResponse> addConnectionPool(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @BodyParam("application/json") ConnectionPool body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/pools/{pool_name}")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesGetConnectionPoolResponse> getConnectionPool(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @PathParam("pool_name") String poolName,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/databases/{database_cluster_uuid}/pools/{pool_name}")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesDeleteConnectionPoolResponse> deleteConnectionPool(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @PathParam("pool_name") String poolName,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/eviction_policy")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesGetEvictionPolicyResponse> getEvictionPolicy(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @HeaderParam("Accept") String accept);

        @Put("/v2/databases/{database_cluster_uuid}/eviction_policy")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesUpdateEvictionPolicyResponse> updateEvictionPolicy(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @BodyParam("application/json")
                        Paths8571FjV2DatabasesDatabaseClusterUuidEvictionPolicyPutRequestbodyContentApplicationJsonSchema
                                body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/databases/{database_cluster_uuid}/sql_mode")
        @ExpectedResponses({200, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesGetSqlModeResponse> getSqlMode(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @HeaderParam("Accept") String accept);

        @Put("/v2/databases/{database_cluster_uuid}/sql_mode")
        @ExpectedResponses({204, 401, 404, 429, 500})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<DatabasesUpdateSqlModeResponse> updateSqlMode(
                @HostParam("$host") String host,
                @PathParam("database_cluster_uuid") UUID databaseClusterUuid,
                @BodyParam("application/json") SqlMode body,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List Database Options
     *
     * <p>To list all of the options available for the offered database engines, send a GET request to
     * `/v2/databases/options`. The result will be a JSON object with an `options` key.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesListOptionsResponse> listOptionsWithResponseAsync() {
        final String accept = "application/json";
        return service.listOptions(this.client.getHost(), accept);
    }

    /**
     * List Database Options
     *
     * <p>To list all of the options available for the offered database engines, send a GET request to
     * `/v2/databases/options`. The result will be a JSON object with an `options` key.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listOptionsAsync() {
        return listOptionsWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List All Database Clusters
     *
     * <p>To list all of the database clusters available on your account, send a GET request to `/v2/databases`. To
     * limit the results to database clusters with a specific tag, include the `tag_name` query parameter set to the
     * name of the tag. For example, `/v2/databases?tag_name=$TAG_NAME`. The result will be a JSON object with a
     * `databases` key. This will be set to an array of database objects, each of which will contain the standard
     * database attributes. The embedded `connection` and `private_connection` objects will contain the information
     * needed to access the database cluster: The embedded `maintenance_window` object will contain information about
     * any scheduled maintenance for the database cluster.
     *
     * @param tagName Limits the results to database clusters with a specific tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesListClustersResponse> listClustersWithResponseAsync(String tagName) {
        final String accept = "application/json";
        return service.listClusters(this.client.getHost(), tagName, accept);
    }

    /**
     * List All Database Clusters
     *
     * <p>To list all of the database clusters available on your account, send a GET request to `/v2/databases`. To
     * limit the results to database clusters with a specific tag, include the `tag_name` query parameter set to the
     * name of the tag. For example, `/v2/databases?tag_name=$TAG_NAME`. The result will be a JSON object with a
     * `databases` key. This will be set to an array of database objects, each of which will contain the standard
     * database attributes. The embedded `connection` and `private_connection` objects will contain the information
     * needed to access the database cluster: The embedded `maintenance_window` object will contain information about
     * any scheduled maintenance for the database cluster.
     *
     * @param tagName Limits the results to database clusters with a specific tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listClustersAsync(String tagName) {
        return listClustersWithResponseAsync(tagName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a New Database Cluster
     *
     * <p>To create a database cluster, send a POST request to `/v2/databases`. The response will be a JSON object with
     * a key called `database`. The value of this will be an object that contains the standard attributes associated
     * with a database cluster. The initial value of the database cluster's `status` attribute will be `creating`. When
     * the cluster is ready to receive traffic, this will transition to `online`. The embedded `connection` and
     * `private_connection` objects will contain the information needed to access the database cluster. DigitalOcean
     * managed PostgreSQL and MySQL database clusters take automated daily backups. To create a new database cluster
     * based on a backup of an exising cluster, send a POST request to `/v2/databases`. In addition to the standard
     * database cluster attributes, the JSON body must include a key named `backup_restore` with the name of the
     * original database cluster and the timestamp of the backup to be restored. Creating a database from a backup is
     * the same as forking a database in the control panel. Note: Backups are not supported for Redis clusters.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesCreateClusterResponse> createClusterWithResponseAsync(
            PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.createCluster(this.client.getHost(), body, accept);
    }

    /**
     * Create a New Database Cluster
     *
     * <p>To create a database cluster, send a POST request to `/v2/databases`. The response will be a JSON object with
     * a key called `database`. The value of this will be an object that contains the standard attributes associated
     * with a database cluster. The initial value of the database cluster's `status` attribute will be `creating`. When
     * the cluster is ready to receive traffic, this will transition to `online`. The embedded `connection` and
     * `private_connection` objects will contain the information needed to access the database cluster. DigitalOcean
     * managed PostgreSQL and MySQL database clusters take automated daily backups. To create a new database cluster
     * based on a backup of an exising cluster, send a POST request to `/v2/databases`. In addition to the standard
     * database cluster attributes, the JSON body must include a key named `backup_restore` with the name of the
     * original database cluster and the timestamp of the backup to be restored. Creating a database from a backup is
     * the same as forking a database in the control panel. Note: Backups are not supported for Redis clusters.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createClusterAsync(PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema body) {
        return createClusterWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Database Cluster
     *
     * <p>To show information about an existing database cluster, send a GET request to `/v2/databases/$DATABASE_ID`.
     * The response will be a JSON object with a database key. This will be set to an object containing the standard
     * database cluster attributes. The embedded connection and private_connection objects will contain the information
     * needed to access the database cluster. The embedded maintenance_window object will contain information about any
     * scheduled maintenance for the database cluster.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesGetClusterResponse> getClusterWithResponseAsync(UUID databaseClusterUuid) {
        final String accept = "application/json";
        return service.getCluster(this.client.getHost(), databaseClusterUuid, accept);
    }

    /**
     * Retrieve an Existing Database Cluster
     *
     * <p>To show information about an existing database cluster, send a GET request to `/v2/databases/$DATABASE_ID`.
     * The response will be a JSON object with a database key. This will be set to an object containing the standard
     * database cluster attributes. The embedded connection and private_connection objects will contain the information
     * needed to access the database cluster. The embedded maintenance_window object will contain information about any
     * scheduled maintenance for the database cluster.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getClusterAsync(UUID databaseClusterUuid) {
        return getClusterWithResponseAsync(databaseClusterUuid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Destroy a Database Cluster
     *
     * <p>To destroy a specific database, send a DELETE request to `/v2/databases/$DATABASE_ID`. A status of 204 will be
     * given. This indicates that the request was processed successfully, but that no response body is needed.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesDestroyClusterResponse> destroyClusterWithResponseAsync(UUID databaseClusterUuid) {
        final String accept = "application/json";
        return service.destroyCluster(this.client.getHost(), databaseClusterUuid, accept);
    }

    /**
     * Destroy a Database Cluster
     *
     * <p>To destroy a specific database, send a DELETE request to `/v2/databases/$DATABASE_ID`. A status of 204 will be
     * given. This indicates that the request was processed successfully, but that no response body is needed.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> destroyClusterAsync(UUID databaseClusterUuid) {
        return destroyClusterWithResponseAsync(databaseClusterUuid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Database Cluster Configuration
     *
     * <p>Shows configuration parameters for an existing database cluster by sending a GET request to
     * `/v2/databases/$DATABASE_ID/config`. The response is a JSON object with a `config` key, which is set to an object
     * containing any database configuration parameters.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesGetConfigResponse> getConfigWithResponseAsync(UUID databaseClusterUuid) {
        final String accept = "application/json";
        return service.getConfig(this.client.getHost(), databaseClusterUuid, accept);
    }

    /**
     * Retrieve an Existing Database Cluster Configuration
     *
     * <p>Shows configuration parameters for an existing database cluster by sending a GET request to
     * `/v2/databases/$DATABASE_ID/config`. The response is a JSON object with a `config` key, which is set to an object
     * containing any database configuration parameters.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getConfigAsync(UUID databaseClusterUuid) {
        return getConfigWithResponseAsync(databaseClusterUuid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update the Database Configuration for an Existing Database
     *
     * <p>To update the configuration for an existing database cluster, send a PATCH request to
     * `/v2/databases/$DATABASE_ID/config`.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesPatchConfigResponse> patchConfigWithResponseAsync(
            UUID databaseClusterUuid, DatabaseConfig body) {
        final String accept = "application/json";
        return service.patchConfig(this.client.getHost(), databaseClusterUuid, body, accept);
    }

    /**
     * Update the Database Configuration for an Existing Database
     *
     * <p>To update the configuration for an existing database cluster, send a PATCH request to
     * `/v2/databases/$DATABASE_ID/config`.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> patchConfigAsync(UUID databaseClusterUuid, DatabaseConfig body) {
        return patchConfigWithResponseAsync(databaseClusterUuid, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve the Public Certificate
     *
     * <p>To retrieve the public certificate used to secure the connection to the database cluster send a GET request to
     * `/v2/databases/$DATABASE_ID/ca`.
     *
     * <p>The response will be a JSON object with a `ca` key. This will be set to an object containing the base64
     * encoding of the public key certificate.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesGetCaResponse> getCaWithResponseAsync(UUID databaseClusterUuid) {
        final String accept = "application/json";
        return service.getCa(this.client.getHost(), databaseClusterUuid, accept);
    }

    /**
     * Retrieve the Public Certificate
     *
     * <p>To retrieve the public certificate used to secure the connection to the database cluster send a GET request to
     * `/v2/databases/$DATABASE_ID/ca`.
     *
     * <p>The response will be a JSON object with a `ca` key. This will be set to an object containing the base64
     * encoding of the public key certificate.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getCaAsync(UUID databaseClusterUuid) {
        return getCaWithResponseAsync(databaseClusterUuid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve the Status of an Online Migration
     *
     * <p>To retrieve the status of an online migration, send a GET request to
     * `/v2/databases/$DATABASE_ID/online-migration`. If a migration has completed, a 200 OK status is returned with no
     * response body.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesGetMigrationStatusResponse> getMigrationStatusWithResponseAsync(UUID databaseClusterUuid) {
        final String accept = "application/json";
        return service.getMigrationStatus(this.client.getHost(), databaseClusterUuid, accept);
    }

    /**
     * Retrieve the Status of an Online Migration
     *
     * <p>To retrieve the status of an online migration, send a GET request to
     * `/v2/databases/$DATABASE_ID/online-migration`. If a migration has completed, a 200 OK status is returned with no
     * response body.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getMigrationStatusAsync(UUID databaseClusterUuid) {
        return getMigrationStatusWithResponseAsync(databaseClusterUuid)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Start an Online Migration
     *
     * <p>To start an online migration, send a PUT request to `/v2/databases/$DATABASE_ID/online-migration` endpoint.
     * Migrating a cluster establishes a connection with an existing cluster and replicates its contents to the target
     * cluster. Online migration is only available for MySQL, PostgreSQL, and Redis clusters.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesUpdateOnlineMigrationResponse> updateOnlineMigrationWithResponseAsync(
            UUID databaseClusterUuid, SourceDatabase body) {
        final String accept = "application/json";
        return service.updateOnlineMigration(this.client.getHost(), databaseClusterUuid, body, accept);
    }

    /**
     * Start an Online Migration
     *
     * <p>To start an online migration, send a PUT request to `/v2/databases/$DATABASE_ID/online-migration` endpoint.
     * Migrating a cluster establishes a connection with an existing cluster and replicates its contents to the target
     * cluster. Online migration is only available for MySQL, PostgreSQL, and Redis clusters.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateOnlineMigrationAsync(UUID databaseClusterUuid, SourceDatabase body) {
        return updateOnlineMigrationWithResponseAsync(databaseClusterUuid, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Stop an Online Migration
     *
     * <p>To stop an online migration, send a DELETE request to
     * `/v2/databases/$DATABASE_ID/online-migration/$MIGRATION_ID`.
     *
     * <p>A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param migrationId A unique identifier assigned to the online migration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesDeleteOnlineMigrationResponse> deleteOnlineMigrationWithResponseAsync(
            UUID databaseClusterUuid, String migrationId) {
        final String accept = "application/json";
        return service.deleteOnlineMigration(this.client.getHost(), databaseClusterUuid, migrationId, accept);
    }

    /**
     * Stop an Online Migration
     *
     * <p>To stop an online migration, send a DELETE request to
     * `/v2/databases/$DATABASE_ID/online-migration/$MIGRATION_ID`.
     *
     * <p>A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param migrationId A unique identifier assigned to the online migration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteOnlineMigrationAsync(UUID databaseClusterUuid, String migrationId) {
        return deleteOnlineMigrationWithResponseAsync(databaseClusterUuid, migrationId)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Migrate a Database Cluster to a New Region
     *
     * <p>To migrate a database cluster to a new region, send a `PUT` request to `/v2/databases/$DATABASE_ID/migrate`.
     * The body of the request must specify a `region` attribute.
     *
     * <p>A successful request will receive a 202 Accepted status code with no body in response. Querying the database
     * cluster will show that its `status` attribute will now be set to `migrating`. This will transition back to
     * `online` when the migration has completed.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesUpdateRegionResponse> updateRegionWithResponseAsync(
            UUID databaseClusterUuid,
            Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.updateRegion(this.client.getHost(), databaseClusterUuid, body, accept);
    }

    /**
     * Migrate a Database Cluster to a New Region
     *
     * <p>To migrate a database cluster to a new region, send a `PUT` request to `/v2/databases/$DATABASE_ID/migrate`.
     * The body of the request must specify a `region` attribute.
     *
     * <p>A successful request will receive a 202 Accepted status code with no body in response. Querying the database
     * cluster will show that its `status` attribute will now be set to `migrating`. This will transition back to
     * `online` when the migration has completed.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> updateRegionAsync(
            UUID databaseClusterUuid,
            Paths1Fu1VqlV2DatabasesDatabaseClusterUuidMigratePutRequestbodyContentApplicationJsonSchema body) {
        return updateRegionWithResponseAsync(databaseClusterUuid, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Resize a Database Cluster
     *
     * <p>To resize a database cluster, send a PUT request to `/v2/databases/$DATABASE_ID/resize`. The body of the
     * request must specify both the size and num_nodes attributes. A successful request will receive a 202 Accepted
     * status code with no body in response. Querying the database cluster will show that its status attribute will now
     * be set to resizing. This will transition back to online when the resize operation has completed.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesUpdateClusterSizeResponse> updateClusterSizeWithResponseAsync(
            UUID databaseClusterUuid, DatabaseClusterResize body) {
        final String accept = "application/json";
        return service.updateClusterSize(this.client.getHost(), databaseClusterUuid, body, accept);
    }

    /**
     * Resize a Database Cluster
     *
     * <p>To resize a database cluster, send a PUT request to `/v2/databases/$DATABASE_ID/resize`. The body of the
     * request must specify both the size and num_nodes attributes. A successful request will receive a 202 Accepted
     * status code with no body in response. Querying the database cluster will show that its status attribute will now
     * be set to resizing. This will transition back to online when the resize operation has completed.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> updateClusterSizeAsync(UUID databaseClusterUuid, DatabaseClusterResize body) {
        return updateClusterSizeWithResponseAsync(databaseClusterUuid, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Firewall Rules (Trusted Sources) for a Database Cluster
     *
     * <p>To list all of a database cluster's firewall rules (known as "trusted sources" in the control panel), send a
     * GET request to `/v2/databases/$DATABASE_ID/firewall`. The result will be a JSON object with a `rules` key.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesListFirewallRulesResponse> listFirewallRulesWithResponseAsync(UUID databaseClusterUuid) {
        final String accept = "application/json";
        return service.listFirewallRules(this.client.getHost(), databaseClusterUuid, accept);
    }

    /**
     * List Firewall Rules (Trusted Sources) for a Database Cluster
     *
     * <p>To list all of a database cluster's firewall rules (known as "trusted sources" in the control panel), send a
     * GET request to `/v2/databases/$DATABASE_ID/firewall`. The result will be a JSON object with a `rules` key.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listFirewallRulesAsync(UUID databaseClusterUuid) {
        return listFirewallRulesWithResponseAsync(databaseClusterUuid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update Firewall Rules (Trusted Sources) for a Database
     *
     * <p>To update a database cluster's firewall rules (known as "trusted sources" in the control panel), send a PUT
     * request to `/v2/databases/$DATABASE_ID/firewall` specifying which resources should be able to open connections to
     * the database. You may limit connections to specific Droplets, Kubernetes clusters, or IP addresses. When a tag is
     * provided, any Droplet or Kubernetes node with that tag applied to it will have access. The firewall is limited to
     * 100 rules (or trusted sources). When possible, we recommend [placing your databases into a VPC
     * network](https://www.digitalocean.com/docs/networking/vpc/) to limit access to them instead of using a firewall.
     * A successful.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesUpdateFirewallRulesResponse> updateFirewallRulesWithResponseAsync(
            UUID databaseClusterUuid,
            Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.updateFirewallRules(this.client.getHost(), databaseClusterUuid, body, accept);
    }

    /**
     * Update Firewall Rules (Trusted Sources) for a Database
     *
     * <p>To update a database cluster's firewall rules (known as "trusted sources" in the control panel), send a PUT
     * request to `/v2/databases/$DATABASE_ID/firewall` specifying which resources should be able to open connections to
     * the database. You may limit connections to specific Droplets, Kubernetes clusters, or IP addresses. When a tag is
     * provided, any Droplet or Kubernetes node with that tag applied to it will have access. The firewall is limited to
     * 100 rules (or trusted sources). When possible, we recommend [placing your databases into a VPC
     * network](https://www.digitalocean.com/docs/networking/vpc/) to limit access to them instead of using a firewall.
     * A successful.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> updateFirewallRulesAsync(
            UUID databaseClusterUuid,
            Paths1QqskwcV2DatabasesDatabaseClusterUuidFirewallPutRequestbodyContentApplicationJsonSchema body) {
        return updateFirewallRulesWithResponseAsync(databaseClusterUuid, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Configure a Database Cluster's Maintenance Window
     *
     * <p>To configure the window when automatic maintenance should be performed for a database cluster, send a PUT
     * request to `/v2/databases/$DATABASE_ID/maintenance`. A successful request will receive a 204 No Content status
     * code with no body in response.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesUpdateMaintenanceWindowResponse> updateMaintenanceWindowWithResponseAsync(
            UUID databaseClusterUuid, DatabaseMaintenanceWindow body) {
        final String accept = "application/json";
        return service.updateMaintenanceWindow(this.client.getHost(), databaseClusterUuid, body, accept);
    }

    /**
     * Configure a Database Cluster's Maintenance Window
     *
     * <p>To configure the window when automatic maintenance should be performed for a database cluster, send a PUT
     * request to `/v2/databases/$DATABASE_ID/maintenance`. A successful request will receive a 204 No Content status
     * code with no body in response.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> updateMaintenanceWindowAsync(UUID databaseClusterUuid, DatabaseMaintenanceWindow body) {
        return updateMaintenanceWindowWithResponseAsync(databaseClusterUuid, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Backups for a Database Cluster
     *
     * <p>To list all of the available backups of a PostgreSQL or MySQL database cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/backups`. **Note**: Backups are not supported for Redis clusters. The result will be
     * a JSON object with a `backups key`. This will be set to an array of backup objects, each of which will contain
     * the size of the backup and the timestamp at which it was created.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesListBackupsResponse> listBackupsWithResponseAsync(UUID databaseClusterUuid) {
        final String accept = "application/json";
        return service.listBackups(this.client.getHost(), databaseClusterUuid, accept);
    }

    /**
     * List Backups for a Database Cluster
     *
     * <p>To list all of the available backups of a PostgreSQL or MySQL database cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/backups`. **Note**: Backups are not supported for Redis clusters. The result will be
     * a JSON object with a `backups key`. This will be set to an array of backup objects, each of which will contain
     * the size of the backup and the timestamp at which it was created.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listBackupsAsync(UUID databaseClusterUuid) {
        return listBackupsWithResponseAsync(databaseClusterUuid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List All Read-only Replicas
     *
     * <p>To list all of the read-only replicas associated with a database cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/replicas`. **Note**: Read-only replicas are not supported for Redis clusters. The
     * result will be a JSON object with a `replicas` key. This will be set to an array of database replica objects,
     * each of which will contain the standard database replica attributes.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesListReplicasResponse> listReplicasWithResponseAsync(UUID databaseClusterUuid) {
        final String accept = "application/json";
        return service.listReplicas(this.client.getHost(), databaseClusterUuid, accept);
    }

    /**
     * List All Read-only Replicas
     *
     * <p>To list all of the read-only replicas associated with a database cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/replicas`. **Note**: Read-only replicas are not supported for Redis clusters. The
     * result will be a JSON object with a `replicas` key. This will be set to an array of database replica objects,
     * each of which will contain the standard database replica attributes.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listReplicasAsync(UUID databaseClusterUuid) {
        return listReplicasWithResponseAsync(databaseClusterUuid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a Read-only Replica
     *
     * <p>To create a read-only replica for a PostgreSQL or MySQL database cluster, send a POST request to
     * `/v2/databases/$DATABASE_ID/replicas` specifying the name it should be given, the size of the node to be used,
     * and the region where it will be located. **Note**: Read-only replicas are not supported for Redis clusters. The
     * response will be a JSON object with a key called `replica`. The value of this will be an object that contains the
     * standard attributes associated with a database replica. The initial value of the read-only replica's `status`
     * attribute will be `forking`. When the replica is ready to receive traffic, this will transition to `active`.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesCreateReplicaResponse> createReplicaWithResponseAsync(
            UUID databaseClusterUuid,
            PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.createReplica(this.client.getHost(), databaseClusterUuid, body, accept);
    }

    /**
     * Create a Read-only Replica
     *
     * <p>To create a read-only replica for a PostgreSQL or MySQL database cluster, send a POST request to
     * `/v2/databases/$DATABASE_ID/replicas` specifying the name it should be given, the size of the node to be used,
     * and the region where it will be located. **Note**: Read-only replicas are not supported for Redis clusters. The
     * response will be a JSON object with a key called `replica`. The value of this will be an object that contains the
     * standard attributes associated with a database replica. The initial value of the read-only replica's `status`
     * attribute will be `forking`. When the replica is ready to receive traffic, this will transition to `active`.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createReplicaAsync(
            UUID databaseClusterUuid,
            PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema body) {
        return createReplicaWithResponseAsync(databaseClusterUuid, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Read-only Replica
     *
     * <p>To show information about an existing database replica, send a GET request to
     * `/v2/databases/$DATABASE_ID/replicas/$REPLICA_NAME`. **Note**: Read-only replicas are not supported for Redis
     * clusters. The response will be a JSON object with a `replica key`. This will be set to an object containing the
     * standard database replica attributes.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param replicaName The name of the database replica.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesGetReplicaResponse> getReplicaWithResponseAsync(UUID databaseClusterUuid, String replicaName) {
        final String accept = "application/json";
        return service.getReplica(this.client.getHost(), databaseClusterUuid, replicaName, accept);
    }

    /**
     * Retrieve an Existing Read-only Replica
     *
     * <p>To show information about an existing database replica, send a GET request to
     * `/v2/databases/$DATABASE_ID/replicas/$REPLICA_NAME`. **Note**: Read-only replicas are not supported for Redis
     * clusters. The response will be a JSON object with a `replica key`. This will be set to an object containing the
     * standard database replica attributes.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param replicaName The name of the database replica.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getReplicaAsync(UUID databaseClusterUuid, String replicaName) {
        return getReplicaWithResponseAsync(databaseClusterUuid, replicaName)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Destroy a Read-only Replica
     *
     * <p>To destroy a specific read-only replica, send a DELETE request to
     * `/v2/databases/$DATABASE_ID/replicas/$REPLICA_NAME`. **Note**: Read-only replicas are not supported for Redis
     * clusters. A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param replicaName The name of the database replica.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesDestroyReplicaResponse> destroyReplicaWithResponseAsync(
            UUID databaseClusterUuid, String replicaName) {
        final String accept = "application/json";
        return service.destroyReplica(this.client.getHost(), databaseClusterUuid, replicaName, accept);
    }

    /**
     * Destroy a Read-only Replica
     *
     * <p>To destroy a specific read-only replica, send a DELETE request to
     * `/v2/databases/$DATABASE_ID/replicas/$REPLICA_NAME`. **Note**: Read-only replicas are not supported for Redis
     * clusters. A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param replicaName The name of the database replica.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> destroyReplicaAsync(UUID databaseClusterUuid, String replicaName) {
        return destroyReplicaWithResponseAsync(databaseClusterUuid, replicaName)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List all Database Users
     *
     * <p>To list all of the users for your database cluster, send a GET request to `/v2/databases/$DATABASE_ID/users`.
     *
     * <p>Note: User management is not supported for Redis clusters.
     *
     * <p>The result will be a JSON object with a `users` key. This will be set to an array of database user objects,
     * each of which will contain the standard database user attributes.
     *
     * <p>For MySQL clusters, additional options will be contained in the mysql_settings object.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesListUsersResponse> listUsersWithResponseAsync(UUID databaseClusterUuid) {
        final String accept = "application/json";
        return service.listUsers(this.client.getHost(), databaseClusterUuid, accept);
    }

    /**
     * List all Database Users
     *
     * <p>To list all of the users for your database cluster, send a GET request to `/v2/databases/$DATABASE_ID/users`.
     *
     * <p>Note: User management is not supported for Redis clusters.
     *
     * <p>The result will be a JSON object with a `users` key. This will be set to an array of database user objects,
     * each of which will contain the standard database user attributes.
     *
     * <p>For MySQL clusters, additional options will be contained in the mysql_settings object.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listUsersAsync(UUID databaseClusterUuid) {
        return listUsersWithResponseAsync(databaseClusterUuid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Add a Database User
     *
     * <p>To add a new database user, send a POST request to `/v2/databases/$DATABASE_ID/users` with the desired
     * username.
     *
     * <p>Note: User management is not supported for Redis clusters.
     *
     * <p>When adding a user to a MySQL cluster, additional options can be configured in the `mysql_settings` object.
     *
     * <p>The response will be a JSON object with a key called `user`. The value of this will be an object that contains
     * the standard attributes associated with a database user including its randomly generated password.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesAddUserResponse> addUserWithResponseAsync(UUID databaseClusterUuid, DatabaseUser body) {
        final String accept = "application/json";
        return service.addUser(this.client.getHost(), databaseClusterUuid, body, accept);
    }

    /**
     * Add a Database User
     *
     * <p>To add a new database user, send a POST request to `/v2/databases/$DATABASE_ID/users` with the desired
     * username.
     *
     * <p>Note: User management is not supported for Redis clusters.
     *
     * <p>When adding a user to a MySQL cluster, additional options can be configured in the `mysql_settings` object.
     *
     * <p>The response will be a JSON object with a key called `user`. The value of this will be an object that contains
     * the standard attributes associated with a database user including its randomly generated password.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> addUserAsync(UUID databaseClusterUuid, DatabaseUser body) {
        return addUserWithResponseAsync(databaseClusterUuid, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Database User
     *
     * <p>To show information about an existing database user, send a GET request to
     * `/v2/databases/$DATABASE_ID/users/$USERNAME`.
     *
     * <p>Note: User management is not supported for Redis clusters.
     *
     * <p>The response will be a JSON object with a `user` key. This will be set to an object containing the standard
     * database user attributes.
     *
     * <p>For MySQL clusters, additional options will be contained in the mysql_settings object.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param username The name of the database user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesGetUserResponse> getUserWithResponseAsync(UUID databaseClusterUuid, String username) {
        final String accept = "application/json";
        return service.getUser(this.client.getHost(), databaseClusterUuid, username, accept);
    }

    /**
     * Retrieve an Existing Database User
     *
     * <p>To show information about an existing database user, send a GET request to
     * `/v2/databases/$DATABASE_ID/users/$USERNAME`.
     *
     * <p>Note: User management is not supported for Redis clusters.
     *
     * <p>The response will be a JSON object with a `user` key. This will be set to an object containing the standard
     * database user attributes.
     *
     * <p>For MySQL clusters, additional options will be contained in the mysql_settings object.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param username The name of the database user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getUserAsync(UUID databaseClusterUuid, String username) {
        return getUserWithResponseAsync(databaseClusterUuid, username).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Remove a Database User
     *
     * <p>To remove a specific database user, send a DELETE request to `/v2/databases/$DATABASE_ID/users/$USERNAME`.
     *
     * <p>A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * <p>Note: User management is not supported for Redis clusters.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param username The name of the database user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesDeleteUserResponse> deleteUserWithResponseAsync(UUID databaseClusterUuid, String username) {
        final String accept = "application/json";
        return service.deleteUser(this.client.getHost(), databaseClusterUuid, username, accept);
    }

    /**
     * Remove a Database User
     *
     * <p>To remove a specific database user, send a DELETE request to `/v2/databases/$DATABASE_ID/users/$USERNAME`.
     *
     * <p>A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * <p>Note: User management is not supported for Redis clusters.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param username The name of the database user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteUserAsync(UUID databaseClusterUuid, String username) {
        return deleteUserWithResponseAsync(databaseClusterUuid, username)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Reset a Database User's Password or Authentication Method
     *
     * <p>To reset the password for a database user, send a POST request to
     * `/v2/databases/$DATABASE_ID/users/$USERNAME/reset_auth`.
     *
     * <p>For `mysql` databases, the authentication method can be specifying by including a key in the JSON body called
     * `mysql_settings` with the `auth_plugin` value specified.
     *
     * <p>The response will be a JSON object with a `user` key. This will be set to an object containing the standard
     * database user attributes.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param username The name of the database user.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesResetAuthResponse> resetAuthWithResponseAsync(
            UUID databaseClusterUuid,
            String username,
            PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema
                    body) {
        final String accept = "application/json";
        return service.resetAuth(this.client.getHost(), databaseClusterUuid, username, body, accept);
    }

    /**
     * Reset a Database User's Password or Authentication Method
     *
     * <p>To reset the password for a database user, send a POST request to
     * `/v2/databases/$DATABASE_ID/users/$USERNAME/reset_auth`.
     *
     * <p>For `mysql` databases, the authentication method can be specifying by including a key in the JSON body called
     * `mysql_settings` with the `auth_plugin` value specified.
     *
     * <p>The response will be a JSON object with a `user` key. This will be set to an object containing the standard
     * database user attributes.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param username The name of the database user.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> resetAuthAsync(
            UUID databaseClusterUuid,
            String username,
            PathsQ9AxjgV2DatabasesDatabaseClusterUuidUsersUsernameResetAuthPostRequestbodyContentApplicationJsonSchema
                    body) {
        return resetAuthWithResponseAsync(databaseClusterUuid, username, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List All Databases
     *
     * <p>To list all of the databases in a clusters, send a GET request to `/v2/databases/$DATABASE_ID/dbs`.
     *
     * <p>The result will be a JSON object with a `dbs` key. This will be set to an array of database objects, each of
     * which will contain the standard database attributes.
     *
     * <p>Note: Database management is not supported for Redis clusters.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesListResponse> listWithResponseAsync(UUID databaseClusterUuid) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), databaseClusterUuid, accept);
    }

    /**
     * List All Databases
     *
     * <p>To list all of the databases in a clusters, send a GET request to `/v2/databases/$DATABASE_ID/dbs`.
     *
     * <p>The result will be a JSON object with a `dbs` key. This will be set to an array of database objects, each of
     * which will contain the standard database attributes.
     *
     * <p>Note: Database management is not supported for Redis clusters.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listAsync(UUID databaseClusterUuid) {
        return listWithResponseAsync(databaseClusterUuid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Add a New Database
     *
     * <p>To add a new database to an existing cluster, send a POST request to `/v2/databases/$DATABASE_ID/dbs`.
     *
     * <p>Note: Database management is not supported for Redis clusters.
     *
     * <p>The response will be a JSON object with a key called `db`. The value of this will be an object that contains
     * the standard attributes associated with a database.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesAddResponse> addWithResponseAsync(UUID databaseClusterUuid, Database body) {
        final String accept = "application/json";
        return service.add(this.client.getHost(), databaseClusterUuid, body, accept);
    }

    /**
     * Add a New Database
     *
     * <p>To add a new database to an existing cluster, send a POST request to `/v2/databases/$DATABASE_ID/dbs`.
     *
     * <p>Note: Database management is not supported for Redis clusters.
     *
     * <p>The response will be a JSON object with a key called `db`. The value of this will be an object that contains
     * the standard attributes associated with a database.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> addAsync(UUID databaseClusterUuid, Database body) {
        return addWithResponseAsync(databaseClusterUuid, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an Existing Database
     *
     * <p>To show information about an existing database cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/dbs/$DB_NAME`.
     *
     * <p>Note: Database management is not supported for Redis clusters.
     *
     * <p>The response will be a JSON object with a `db` key. This will be set to an object containing the standard
     * database attributes.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesGetResponse> getWithResponseAsync(UUID databaseClusterUuid, String databaseName) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), databaseClusterUuid, databaseName, accept);
    }

    /**
     * Retrieve an Existing Database
     *
     * <p>To show information about an existing database cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/dbs/$DB_NAME`.
     *
     * <p>Note: Database management is not supported for Redis clusters.
     *
     * <p>The response will be a JSON object with a `db` key. This will be set to an object containing the standard
     * database attributes.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAsync(UUID databaseClusterUuid, String databaseName) {
        return getWithResponseAsync(databaseClusterUuid, databaseName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete a Database
     *
     * <p>To delete a specific database, send a DELETE request to `/v2/databases/$DATABASE_ID/dbs/$DB_NAME`.
     *
     * <p>A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * <p>Note: Database management is not supported for Redis clusters.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesDeleteResponse> deleteWithResponseAsync(UUID databaseClusterUuid, String databaseName) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), databaseClusterUuid, databaseName, accept);
    }

    /**
     * Delete a Database
     *
     * <p>To delete a specific database, send a DELETE request to `/v2/databases/$DATABASE_ID/dbs/$DB_NAME`.
     *
     * <p>A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * <p>Note: Database management is not supported for Redis clusters.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteAsync(UUID databaseClusterUuid, String databaseName) {
        return deleteWithResponseAsync(databaseClusterUuid, databaseName)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Connection Pools (PostgreSQL)
     *
     * <p>To list all of the connection pools available to a PostgreSQL database cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/pools`. The result will be a JSON object with a `pools` key. This will be set to an
     * array of connection pool objects.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesListConnectionPoolsResponse> listConnectionPoolsWithResponseAsync(UUID databaseClusterUuid) {
        final String accept = "application/json";
        return service.listConnectionPools(this.client.getHost(), databaseClusterUuid, accept);
    }

    /**
     * List Connection Pools (PostgreSQL)
     *
     * <p>To list all of the connection pools available to a PostgreSQL database cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/pools`. The result will be a JSON object with a `pools` key. This will be set to an
     * array of connection pool objects.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listConnectionPoolsAsync(UUID databaseClusterUuid) {
        return listConnectionPoolsWithResponseAsync(databaseClusterUuid)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Add a New Connection Pool (PostgreSQL)
     *
     * <p>For PostgreSQL database clusters, connection pools can be used to allow a database to share its idle
     * connections. The popular PostgreSQL connection pooling utility PgBouncer is used to provide this service. [See
     * here for more
     * information](https://www.digitalocean.com/docs/databases/postgresql/how-to/manage-connection-pools/) about how
     * and why to use PgBouncer connection pooling including details about the available transaction modes.
     *
     * <p>To add a new connection pool to a PostgreSQL database cluster, send a POST request to
     * `/v2/databases/$DATABASE_ID/pools` specifying a name for the pool, the user to connect with, the database to
     * connect to, as well as its desired size and transaction mode.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesAddConnectionPoolResponse> addConnectionPoolWithResponseAsync(
            UUID databaseClusterUuid, ConnectionPool body) {
        final String accept = "application/json";
        return service.addConnectionPool(this.client.getHost(), databaseClusterUuid, body, accept);
    }

    /**
     * Add a New Connection Pool (PostgreSQL)
     *
     * <p>For PostgreSQL database clusters, connection pools can be used to allow a database to share its idle
     * connections. The popular PostgreSQL connection pooling utility PgBouncer is used to provide this service. [See
     * here for more
     * information](https://www.digitalocean.com/docs/databases/postgresql/how-to/manage-connection-pools/) about how
     * and why to use PgBouncer connection pooling including details about the available transaction modes.
     *
     * <p>To add a new connection pool to a PostgreSQL database cluster, send a POST request to
     * `/v2/databases/$DATABASE_ID/pools` specifying a name for the pool, the user to connect with, the database to
     * connect to, as well as its desired size and transaction mode.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> addConnectionPoolAsync(UUID databaseClusterUuid, ConnectionPool body) {
        return addConnectionPoolWithResponseAsync(databaseClusterUuid, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve Existing Connection Pool (PostgreSQL)
     *
     * <p>To show information about an existing connection pool for a PostgreSQL database cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/pools/$POOL_NAME`. The response will be a JSON object with a `pool` key.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param poolName The name used to identify the connection pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesGetConnectionPoolResponse> getConnectionPoolWithResponseAsync(
            UUID databaseClusterUuid, String poolName) {
        final String accept = "application/json";
        return service.getConnectionPool(this.client.getHost(), databaseClusterUuid, poolName, accept);
    }

    /**
     * Retrieve Existing Connection Pool (PostgreSQL)
     *
     * <p>To show information about an existing connection pool for a PostgreSQL database cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/pools/$POOL_NAME`. The response will be a JSON object with a `pool` key.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param poolName The name used to identify the connection pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getConnectionPoolAsync(UUID databaseClusterUuid, String poolName) {
        return getConnectionPoolWithResponseAsync(databaseClusterUuid, poolName)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Delete a Connection Pool (PostgreSQL)
     *
     * <p>To delete a specific connection pool for a PostgreSQL database cluster, send a DELETE request to
     * `/v2/databases/$DATABASE_ID/pools/$POOL_NAME`.
     *
     * <p>A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param poolName The name used to identify the connection pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesDeleteConnectionPoolResponse> deleteConnectionPoolWithResponseAsync(
            UUID databaseClusterUuid, String poolName) {
        final String accept = "application/json";
        return service.deleteConnectionPool(this.client.getHost(), databaseClusterUuid, poolName, accept);
    }

    /**
     * Delete a Connection Pool (PostgreSQL)
     *
     * <p>To delete a specific connection pool for a PostgreSQL database cluster, send a DELETE request to
     * `/v2/databases/$DATABASE_ID/pools/$POOL_NAME`.
     *
     * <p>A status of 204 will be given. This indicates that the request was processed successfully, but that no
     * response body is needed.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param poolName The name used to identify the connection pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> deleteConnectionPoolAsync(UUID databaseClusterUuid, String poolName) {
        return deleteConnectionPoolWithResponseAsync(databaseClusterUuid, poolName)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve the Eviction Policy for a Redis Cluster
     *
     * <p>To retrieve the configured eviction policy for an existing Redis cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/eviction_policy`. The response will be a JSON object with an `eviction_policy` key.
     * This will be set to a string representing the eviction policy.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesGetEvictionPolicyResponse> getEvictionPolicyWithResponseAsync(UUID databaseClusterUuid) {
        final String accept = "application/json";
        return service.getEvictionPolicy(this.client.getHost(), databaseClusterUuid, accept);
    }

    /**
     * Retrieve the Eviction Policy for a Redis Cluster
     *
     * <p>To retrieve the configured eviction policy for an existing Redis cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/eviction_policy`. The response will be a JSON object with an `eviction_policy` key.
     * This will be set to a string representing the eviction policy.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getEvictionPolicyAsync(UUID databaseClusterUuid) {
        return getEvictionPolicyWithResponseAsync(databaseClusterUuid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Configure the Eviction Policy for a Redis Cluster
     *
     * <p>To configure an eviction policy for an existing Redis cluster, send a PUT request to
     * `/v2/databases/$DATABASE_ID/eviction_policy` specifying the desired policy.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesUpdateEvictionPolicyResponse> updateEvictionPolicyWithResponseAsync(
            UUID databaseClusterUuid,
            Paths8571FjV2DatabasesDatabaseClusterUuidEvictionPolicyPutRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.updateEvictionPolicy(this.client.getHost(), databaseClusterUuid, body, accept);
    }

    /**
     * Configure the Eviction Policy for a Redis Cluster
     *
     * <p>To configure an eviction policy for an existing Redis cluster, send a PUT request to
     * `/v2/databases/$DATABASE_ID/eviction_policy` specifying the desired policy.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> updateEvictionPolicyAsync(
            UUID databaseClusterUuid,
            Paths8571FjV2DatabasesDatabaseClusterUuidEvictionPolicyPutRequestbodyContentApplicationJsonSchema body) {
        return updateEvictionPolicyWithResponseAsync(databaseClusterUuid, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve the SQL Modes for a MySQL Cluster
     *
     * <p>To retrieve the configured SQL modes for an existing MySQL cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/sql_mode`. The response will be a JSON object with a `sql_mode` key. This will be set
     * to a string representing the configured SQL modes.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesGetSqlModeResponse> getSqlModeWithResponseAsync(UUID databaseClusterUuid) {
        final String accept = "application/json";
        return service.getSqlMode(this.client.getHost(), databaseClusterUuid, accept);
    }

    /**
     * Retrieve the SQL Modes for a MySQL Cluster
     *
     * <p>To retrieve the configured SQL modes for an existing MySQL cluster, send a GET request to
     * `/v2/databases/$DATABASE_ID/sql_mode`. The response will be a JSON object with a `sql_mode` key. This will be set
     * to a string representing the configured SQL modes.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getSqlModeAsync(UUID databaseClusterUuid) {
        return getSqlModeWithResponseAsync(databaseClusterUuid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update SQL Mode for a Cluster
     *
     * <p>To configure the SQL modes for an existing MySQL cluster, send a PUT request to
     * `/v2/databases/$DATABASE_ID/sql_mode` specifying the desired modes. See the official MySQL 8 documentation for a
     * [full list of supported SQL modes](https://dev.mysql.com/doc/refman/8.0/en/sql-mode.html#sql-mode-full). A
     * successful request will receive a 204 No Content status code with no body in response.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabasesUpdateSqlModeResponse> updateSqlModeWithResponseAsync(UUID databaseClusterUuid, SqlMode body) {
        final String accept = "application/json";
        return service.updateSqlMode(this.client.getHost(), databaseClusterUuid, body, accept);
    }

    /**
     * Update SQL Mode for a Cluster
     *
     * <p>To configure the SQL modes for an existing MySQL cluster, send a PUT request to
     * `/v2/databases/$DATABASE_ID/sql_mode` specifying the desired modes. See the official MySQL 8 documentation for a
     * [full list of supported SQL modes](https://dev.mysql.com/doc/refman/8.0/en/sql-mode.html#sql-mode-full). A
     * successful request will receive a 204 No Content status code with no body in response.
     *
     * @param databaseClusterUuid A unique identifier for a database cluster.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Error> updateSqlModeAsync(UUID databaseClusterUuid, SqlMode body) {
        return updateSqlModeWithResponseAsync(databaseClusterUuid, body)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
