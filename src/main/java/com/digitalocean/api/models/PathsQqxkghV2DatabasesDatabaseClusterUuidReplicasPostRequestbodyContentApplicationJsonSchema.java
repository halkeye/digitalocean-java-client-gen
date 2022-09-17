package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/** The PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema
        extends DatabaseReplica {
    /** {@inheritDoc} */
    @Override
    public PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema setName(
            String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema setRegion(
            String region) {
        super.setRegion(region);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema setSize(
            String size) {
        super.setSize(size);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema setTags(
            List<String> tags) {
        super.setTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema
            setPrivateNetworkUuid(String privateNetworkUuid) {
        super.setPrivateNetworkUuid(privateNetworkUuid);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema setConnection(
            DatabaseReplicaConnection connection) {
        super.setConnection(connection);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema
            setPrivateConnection(DatabaseReplicaPrivateConnection privateConnection) {
        super.setPrivateConnection(privateConnection);
        return this;
    }
}
