package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AlertPolicyType. */
public final class AlertPolicyType extends ExpandableStringEnum<AlertPolicyType> {
    /** Static value v1/insights/droplet/load_1 for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_DROPLET_LOAD1 = fromString("v1/insights/droplet/load_1");

    /** Static value v1/insights/droplet/load_5 for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_DROPLET_LOAD5 = fromString("v1/insights/droplet/load_5");

    /** Static value v1/insights/droplet/load_15 for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_DROPLET_LOAD15 = fromString("v1/insights/droplet/load_15");

    /** Static value v1/insights/droplet/memory_utilization_percent for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_DROPLET_MEMORY_UTILIZATION_PERCENT =
            fromString("v1/insights/droplet/memory_utilization_percent");

    /** Static value v1/insights/droplet/disk_utilization_percent for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_DROPLET_DISK_UTILIZATION_PERCENT =
            fromString("v1/insights/droplet/disk_utilization_percent");

    /** Static value v1/insights/droplet/cpu for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_DROPLET_CPU = fromString("v1/insights/droplet/cpu");

    /** Static value v1/insights/droplet/disk_read for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_DROPLET_DISK_READ = fromString("v1/insights/droplet/disk_read");

    /** Static value v1/insights/droplet/disk_write for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_DROPLET_DISK_WRITE = fromString("v1/insights/droplet/disk_write");

    /** Static value v1/insights/droplet/public_outbound_bandwidth for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_DROPLET_PUBLIC_OUTBOUND_BANDWIDTH =
            fromString("v1/insights/droplet/public_outbound_bandwidth");

    /** Static value v1/insights/droplet/public_inbound_bandwidth for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_DROPLET_PUBLIC_INBOUND_BANDWIDTH =
            fromString("v1/insights/droplet/public_inbound_bandwidth");

    /** Static value v1/insights/droplet/private_outbound_bandwidth for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_DROPLET_PRIVATE_OUTBOUND_BANDWIDTH =
            fromString("v1/insights/droplet/private_outbound_bandwidth");

    /** Static value v1/insights/droplet/private_inbound_bandwidth for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_DROPLET_PRIVATE_INBOUND_BANDWIDTH =
            fromString("v1/insights/droplet/private_inbound_bandwidth");

    /** Static value v1/insights/lbaas/avg_cpu_utilization_percent for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_LBAAS_AVG_CPU_UTILIZATION_PERCENT =
            fromString("v1/insights/lbaas/avg_cpu_utilization_percent");

    /** Static value v1/insights/lbaas/connection_utilization_percent for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_LBAAS_CONNECTION_UTILIZATION_PERCENT =
            fromString("v1/insights/lbaas/connection_utilization_percent");

    /** Static value v1/insights/lbaas/droplet_health for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_LBAAS_DROPLET_HEALTH =
            fromString("v1/insights/lbaas/droplet_health");

    /** Static value v1/insights/lbaas/tls_connections_per_second_utilization_percent for AlertPolicyType. */
    public static final AlertPolicyType V1INSIGHTS_LBAAS_TLS_CONNECTIONS_PER_SECOND_UTILIZATION_PERCENT =
            fromString("v1/insights/lbaas/tls_connections_per_second_utilization_percent");

    /**
     * Creates or finds a AlertPolicyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertPolicyType.
     */
    @JsonCreator
    public static AlertPolicyType fromString(String name) {
        return fromString(name, AlertPolicyType.class);
    }

    /**
     * Gets known AlertPolicyType values.
     *
     * @return known AlertPolicyType values.
     */
    public static Collection<AlertPolicyType> values() {
        return values(AlertPolicyType.class);
    }
}
