package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** The PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema extends DatabaseCluster {
    /*
     * The backup_restore property.
     */
    @JsonProperty(value = "backup_restore")
    private DatabaseBackup backupRestore;

    /**
     * Get the backupRestore property: The backup_restore property.
     *
     * @return the backupRestore value.
     */
    public DatabaseBackup getBackupRestore() {
        return this.backupRestore;
    }

    /**
     * Set the backupRestore property: The backup_restore property.
     *
     * @param backupRestore the backupRestore value to set.
     * @return the PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setBackupRestore(
            DatabaseBackup backupRestore) {
        this.backupRestore = backupRestore;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setEngine(DatabaseClusterEngine engine) {
        super.setEngine(engine);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setVersion(String version) {
        super.setVersion(version);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setNumNodes(int numNodes) {
        super.setNumNodes(numNodes);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setSize(String size) {
        super.setSize(size);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setRegion(String region) {
        super.setRegion(region);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setPrivateNetworkUuid(
            String privateNetworkUuid) {
        super.setPrivateNetworkUuid(privateNetworkUuid);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setTags(List<String> tags) {
        super.setTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setConnection(
            DatabaseClusterConnection connection) {
        super.setConnection(connection);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setPrivateConnection(
            DatabaseClusterPrivateConnection privateConnection) {
        super.setPrivateConnection(privateConnection);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setMaintenanceWindow(
            DatabaseClusterMaintenanceWindow maintenanceWindow) {
        super.setMaintenanceWindow(maintenanceWindow);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setProjectId(UUID projectId) {
        super.setProjectId(projectId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema setRules(List<FirewallRule> rules) {
        super.setRules(rules);
        return this;
    }
}
