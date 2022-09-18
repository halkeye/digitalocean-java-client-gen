package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * The KubernetesNodePoolUpdate model.
 */
@Fluent
public final class KubernetesNodePoolUpdate extends KubernetesNodePoolBase {
    /**
     * {@inheritDoc}
     */
    @Override
    public KubernetesNodePoolUpdate setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KubernetesNodePoolUpdate setCount(Integer count) {
        super.setCount(count);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KubernetesNodePoolUpdate setTags(List<String> tags) {
        super.setTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KubernetesNodePoolUpdate setLabels(Object labels) {
        super.setLabels(labels);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KubernetesNodePoolUpdate setTaints(List<KubernetesNodePoolTaint> taints) {
        super.setTaints(taints);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KubernetesNodePoolUpdate setAutoScale(Boolean autoScale) {
        super.setAutoScale(autoScale);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KubernetesNodePoolUpdate setMinNodes(Integer minNodes) {
        super.setMinNodes(minNodes);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KubernetesNodePoolUpdate setMaxNodes(Integer maxNodes) {
        super.setMaxNodes(maxNodes);
        return this;
    }
}
