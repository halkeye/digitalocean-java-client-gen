package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The current status of this garbage collection.
 */
public final class GarbageCollectionStatus extends ExpandableStringEnum<GarbageCollectionStatus> {
    /**
     * Static value requested for GarbageCollectionStatus.
     */
    public static final GarbageCollectionStatus REQUESTED = fromString("requested");

    /**
     * Static value waiting for write JWTs to expire for GarbageCollectionStatus.
     */
    public static final GarbageCollectionStatus WAITING_FOR_WRITE_JWTS_TO_EXPIRE = fromString("waiting for write JWTs to expire");

    /**
     * Static value scanning manifests for GarbageCollectionStatus.
     */
    public static final GarbageCollectionStatus SCANNING_MANIFESTS = fromString("scanning manifests");

    /**
     * Static value deleting unreferenced blobs for GarbageCollectionStatus.
     */
    public static final GarbageCollectionStatus DELETING_UNREFERENCED_BLOBS = fromString("deleting unreferenced blobs");

    /**
     * Static value cancelling for GarbageCollectionStatus.
     */
    public static final GarbageCollectionStatus CANCELLING = fromString("cancelling");

    /**
     * Static value failed for GarbageCollectionStatus.
     */
    public static final GarbageCollectionStatus FAILED = fromString("failed");

    /**
     * Static value succeeded for GarbageCollectionStatus.
     */
    public static final GarbageCollectionStatus SUCCEEDED = fromString("succeeded");

    /**
     * Static value cancelled for GarbageCollectionStatus.
     */
    public static final GarbageCollectionStatus CANCELLED = fromString("cancelled");

    /**
     * Creates or finds a GarbageCollectionStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding GarbageCollectionStatus.
     */
    @JsonCreator
    public static GarbageCollectionStatus fromString(String name) {
        return fromString(name, GarbageCollectionStatus.class);
    }

    /**
     * Gets known GarbageCollectionStatus values.
     * 
     * @return known GarbageCollectionStatus values.
     */
    public static Collection<GarbageCollectionStatus> values() {
        return values(GarbageCollectionStatus.class);
    }
}
