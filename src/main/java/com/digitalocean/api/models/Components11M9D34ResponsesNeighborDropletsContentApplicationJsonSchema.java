package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components11M9D34ResponsesNeighborDropletsContentApplicationJsonSchema model.
 */
@Fluent
public final class Components11M9D34ResponsesNeighborDropletsContentApplicationJsonSchema extends Components1E5Uoh1ResponsesNeighborDropletsContentApplicationJsonSchemaAllof0 {
    /**
     * {@inheritDoc}
     */
    @Override
    public Components11M9D34ResponsesNeighborDropletsContentApplicationJsonSchema setDroplets(List<Droplet> droplets) {
        super.setDroplets(droplets);
        return this;
    }
}
