package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/** The Components11M9D34ResponsesNeighborDropletsContentApplicationJsonSchema model. */
@Fluent
public final class Components11M9D34ResponsesNeighborDropletsContentApplicationJsonSchema
        extends Components1E5Uoh1ResponsesNeighborDropletsContentApplicationJsonSchemaAllof0 {
    /** {@inheritDoc} */
    @Override
    public Components11M9D34ResponsesNeighborDropletsContentApplicationJsonSchema setDroplets(List<Droplet> droplets) {
        super.setDroplets(droplets);
        return this;
    }
}
