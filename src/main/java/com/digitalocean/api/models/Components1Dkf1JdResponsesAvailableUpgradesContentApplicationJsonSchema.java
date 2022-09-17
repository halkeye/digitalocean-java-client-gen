package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Components1Dkf1JdResponsesAvailableUpgradesContentApplicationJsonSchema model. */
@Fluent
public final class Components1Dkf1JdResponsesAvailableUpgradesContentApplicationJsonSchema {
    /*
     * The available_upgrade_versions property.
     */
    @JsonProperty(value = "available_upgrade_versions")
    private List<KubernetesVersion> availableUpgradeVersions;

    /**
     * Get the availableUpgradeVersions property: The available_upgrade_versions property.
     *
     * @return the availableUpgradeVersions value.
     */
    public List<KubernetesVersion> getAvailableUpgradeVersions() {
        return this.availableUpgradeVersions;
    }

    /**
     * Set the availableUpgradeVersions property: The available_upgrade_versions property.
     *
     * @param availableUpgradeVersions the availableUpgradeVersions value to set.
     * @return the Components1Dkf1JdResponsesAvailableUpgradesContentApplicationJsonSchema object itself.
     */
    public Components1Dkf1JdResponsesAvailableUpgradesContentApplicationJsonSchema setAvailableUpgradeVersions(
            List<KubernetesVersion> availableUpgradeVersions) {
        this.availableUpgradeVersions = availableUpgradeVersions;
        return this;
    }
}
