package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KubernetesNodePoolTaint model. */
@Fluent
public final class KubernetesNodePoolTaint {
    /*
     * An arbitrary string. The `key` and `value` fields of the `taint` object form a key-value pair. For example, if
     * the value of the `key` field is "special" and the value of the `value` field is "gpu", the key value pair would
     * be `special=gpu`.
     */
    @JsonProperty(value = "key")
    private String key;

    /*
     * An arbitrary string. The `key` and `value` fields of the `taint` object form a key-value pair. For example, if
     * the value of the `key` field is "special" and the value of the `value` field is "gpu", the key value pair would
     * be `special=gpu`.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * How the node reacts to pods that it won't tolerate. Available effect values are `NoSchedule`,
     * `PreferNoSchedule`, and `NoExecute`.
     */
    @JsonProperty(value = "effect")
    private KubernetesNodePoolTaintEffect effect;

    /**
     * Get the key property: An arbitrary string. The `key` and `value` fields of the `taint` object form a key-value
     * pair. For example, if the value of the `key` field is "special" and the value of the `value` field is "gpu", the
     * key value pair would be `special=gpu`.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: An arbitrary string. The `key` and `value` fields of the `taint` object form a key-value
     * pair. For example, if the value of the `key` field is "special" and the value of the `value` field is "gpu", the
     * key value pair would be `special=gpu`.
     *
     * @param key the key value to set.
     * @return the KubernetesNodePoolTaint object itself.
     */
    public KubernetesNodePoolTaint setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: An arbitrary string. The `key` and `value` fields of the `taint` object form a key-value
     * pair. For example, if the value of the `key` field is "special" and the value of the `value` field is "gpu", the
     * key value pair would be `special=gpu`.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: An arbitrary string. The `key` and `value` fields of the `taint` object form a key-value
     * pair. For example, if the value of the `key` field is "special" and the value of the `value` field is "gpu", the
     * key value pair would be `special=gpu`.
     *
     * @param value the value value to set.
     * @return the KubernetesNodePoolTaint object itself.
     */
    public KubernetesNodePoolTaint setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the effect property: How the node reacts to pods that it won't tolerate. Available effect values are
     * `NoSchedule`, `PreferNoSchedule`, and `NoExecute`.
     *
     * @return the effect value.
     */
    public KubernetesNodePoolTaintEffect getEffect() {
        return this.effect;
    }

    /**
     * Set the effect property: How the node reacts to pods that it won't tolerate. Available effect values are
     * `NoSchedule`, `PreferNoSchedule`, and `NoExecute`.
     *
     * @param effect the effect value to set.
     * @return the KubernetesNodePoolTaint object itself.
     */
    public KubernetesNodePoolTaint setEffect(KubernetesNodePoolTaintEffect effect) {
        this.effect = effect;
        return this;
    }
}
