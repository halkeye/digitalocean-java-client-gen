package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The DropletSnapshot model.
 */
@Fluent
public final class DropletSnapshot extends SnapshotsBase {
    /*
     * Describes the kind of image. It may be one of `snapshot` or `backup`. This specifies whether an image is a
     * user-generated Droplet snapshot or automatically created Droplet backup.
     */
    @JsonProperty(value = "type", required = true)
    private DropletSnapshotType type;

    /**
     * Get the type property: Describes the kind of image. It may be one of `snapshot` or `backup`. This specifies
     * whether an image is a user-generated Droplet snapshot or automatically created Droplet backup.
     * 
     * @return the type value.
     */
    public DropletSnapshotType getType() {
        return this.type;
    }

    /**
     * Set the type property: Describes the kind of image. It may be one of `snapshot` or `backup`. This specifies
     * whether an image is a user-generated Droplet snapshot or automatically created Droplet backup.
     * 
     * @param type the type value to set.
     * @return the DropletSnapshot object itself.
     */
    public DropletSnapshot setType(DropletSnapshotType type) {
        this.type = type;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSnapshot setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSnapshot setCreatedAt(OffsetDateTime createdAt) {
        super.setCreatedAt(createdAt);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSnapshot setRegions(List<String> regions) {
        super.setRegions(regions);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSnapshot setMinDiskSize(int minDiskSize) {
        super.setMinDiskSize(minDiskSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropletSnapshot setSizeGigabytes(float sizeGigabytes) {
        super.setSizeGigabytes(sizeGigabytes);
        return this;
    }
}
