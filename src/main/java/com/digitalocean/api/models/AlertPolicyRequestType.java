package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AlertPolicyRequestType. */
public final class AlertPolicyRequestType extends ExpandableStringEnum<AlertPolicyRequestType> {
    /** Static value v1/insights/droplet/load_1 for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_DROPLET_LOAD1 = fromString("v1/insights/droplet/load_1");

    /** Static value v1/insights/droplet/load_5 for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_DROPLET_LOAD5 = fromString("v1/insights/droplet/load_5");

    /** Static value v1/insights/droplet/load_15 for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_DROPLET_LOAD15 = fromString("v1/insights/droplet/load_15");

    /** Static value v1/insights/droplet/memory_utilization_percent for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_DROPLET_MEMORY_UTILIZATION_PERCENT =
            fromString("v1/insights/droplet/memory_utilization_percent");

    /** Static value v1/insights/droplet/disk_utilization_percent for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_DROPLET_DISK_UTILIZATION_PERCENT =
            fromString("v1/insights/droplet/disk_utilization_percent");

    /** Static value v1/insights/droplet/cpu for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_DROPLET_CPU = fromString("v1/insights/droplet/cpu");

    /** Static value v1/insights/droplet/disk_read for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_DROPLET_DISK_READ =
            fromString("v1/insights/droplet/disk_read");

    /** Static value v1/insights/droplet/disk_write for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_DROPLET_DISK_WRITE =
            fromString("v1/insights/droplet/disk_write");

    /** Static value v1/insights/droplet/public_outbound_bandwidth for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_DROPLET_PUBLIC_OUTBOUND_BANDWIDTH =
            fromString("v1/insights/droplet/public_outbound_bandwidth");

    /** Static value v1/insights/droplet/public_inbound_bandwidth for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_DROPLET_PUBLIC_INBOUND_BANDWIDTH =
            fromString("v1/insights/droplet/public_inbound_bandwidth");

    /** Static value v1/insights/droplet/private_outbound_bandwidth for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_DROPLET_PRIVATE_OUTBOUND_BANDWIDTH =
            fromString("v1/insights/droplet/private_outbound_bandwidth");

    /** Static value v1/insights/droplet/private_inbound_bandwidth for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_DROPLET_PRIVATE_INBOUND_BANDWIDTH =
            fromString("v1/insights/droplet/private_inbound_bandwidth");

    /** Static value v1/insights/lbaas/avg_cpu_utilization_percent for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_LBAAS_AVG_CPU_UTILIZATION_PERCENT =
            fromString("v1/insights/lbaas/avg_cpu_utilization_percent");

    /** Static value v1/insights/lbaas/connection_utilization_percent for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_LBAAS_CONNECTION_UTILIZATION_PERCENT =
            fromString("v1/insights/lbaas/connection_utilization_percent");

    /** Static value v1/insights/lbaas/droplet_health for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_LBAAS_DROPLET_HEALTH =
            fromString("v1/insights/lbaas/droplet_health");

    /** Static value v1/insights/lbaas/tls_connections_per_second_utilization_percent for AlertPolicyRequestType. */
    public static final AlertPolicyRequestType V1INSIGHTS_LBAAS_TLS_CONNECTIONS_PER_SECOND_UTILIZATION_PERCENT =
            fromString("v1/insights/lbaas/tls_connections_per_second_utilization_percent");

    /**
     * Creates or finds a AlertPolicyRequestType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertPolicyRequestType.
     */
    @JsonCreator
    public static AlertPolicyRequestType fromString(String name) {
        return fromString(name, AlertPolicyRequestType.class);
    }

    /**
     * Gets known AlertPolicyRequestType values.
     *
     * @return known AlertPolicyRequestType values.
     */
    public static Collection<AlertPolicyRequestType> values() {
        return values(AlertPolicyRequestType.class);
    }
}
