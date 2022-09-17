package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * How the node reacts to pods that it won't tolerate. Available effect values are `NoSchedule`, `PreferNoSchedule`, and
 * `NoExecute`.
 */
public final class KubernetesNodePoolTaintEffect extends ExpandableStringEnum<KubernetesNodePoolTaintEffect> {
    /** Static value NoSchedule for KubernetesNodePoolTaintEffect. */
    public static final KubernetesNodePoolTaintEffect NO_SCHEDULE = fromString("NoSchedule");

    /** Static value PreferNoSchedule for KubernetesNodePoolTaintEffect. */
    public static final KubernetesNodePoolTaintEffect PREFER_NO_SCHEDULE = fromString("PreferNoSchedule");

    /** Static value NoExecute for KubernetesNodePoolTaintEffect. */
    public static final KubernetesNodePoolTaintEffect NO_EXECUTE = fromString("NoExecute");

    /**
     * Creates or finds a KubernetesNodePoolTaintEffect from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KubernetesNodePoolTaintEffect.
     */
    @JsonCreator
    public static KubernetesNodePoolTaintEffect fromString(String name) {
        return fromString(name, KubernetesNodePoolTaintEffect.class);
    }

    /**
     * Gets known KubernetesNodePoolTaintEffect values.
     *
     * @return known KubernetesNodePoolTaintEffect values.
     */
    public static Collection<KubernetesNodePoolTaintEffect> values() {
        return values(KubernetesNodePoolTaintEffect.class);
    }
}
