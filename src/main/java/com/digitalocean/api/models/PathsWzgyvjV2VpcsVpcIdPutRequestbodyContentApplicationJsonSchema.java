package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema model.
 */
@Fluent
public final class PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema extends VpcUpdatable {
    /*
     * A boolean value indicating whether or not the VPC is the default network for the region. All applicable
     * resources are placed into the default VPC network unless otherwise specified during their creation. The
     * `default` field cannot be unset from `true`. If you want to set a new default VPC network, update the `default`
     * field of another VPC network in the same region. The previous network's `default` field will be set to `false`
     * when a new default VPC has been defined.
     */
    @JsonProperty(value = "default")
    private Boolean defaultProperty;

    /**
     * Get the defaultProperty property: A boolean value indicating whether or not the VPC is the default network for
     * the region. All applicable resources are placed into the default VPC network unless otherwise specified during
     * their creation. The `default` field cannot be unset from `true`. If you want to set a new default VPC network,
     * update the `default` field of another VPC network in the same region. The previous network's `default` field
     * will be set to `false` when a new default VPC has been defined.
     * 
     * @return the defaultProperty value.
     */
    public Boolean isDefaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: A boolean value indicating whether or not the VPC is the default network for
     * the region. All applicable resources are placed into the default VPC network unless otherwise specified during
     * their creation. The `default` field cannot be unset from `true`. If you want to set a new default VPC network,
     * update the `default` field of another VPC network in the same region. The previous network's `default` field
     * will be set to `false` when a new default VPC has been defined.
     * 
     * @param defaultProperty the defaultProperty value to set.
     * @return the PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema object itself.
     */
    public PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema setDefaultProperty(Boolean defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PathsWzgyvjV2VpcsVpcIdPutRequestbodyContentApplicationJsonSchema setDescription(String description) {
        super.setDescription(description);
        return this;
    }
}
