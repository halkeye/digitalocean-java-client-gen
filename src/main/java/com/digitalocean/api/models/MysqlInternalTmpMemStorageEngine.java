package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The storage engine for in-memory internal temporary tables. */
public final class MysqlInternalTmpMemStorageEngine extends ExpandableStringEnum<MysqlInternalTmpMemStorageEngine> {
    /** Static value TempTable for MysqlInternalTmpMemStorageEngine. */
    public static final MysqlInternalTmpMemStorageEngine TEMP_TABLE = fromString("TempTable");

    /** Static value MEMORY for MysqlInternalTmpMemStorageEngine. */
    public static final MysqlInternalTmpMemStorageEngine MEMORY = fromString("MEMORY");

    /**
     * Creates or finds a MysqlInternalTmpMemStorageEngine from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MysqlInternalTmpMemStorageEngine.
     */
    @JsonCreator
    public static MysqlInternalTmpMemStorageEngine fromString(String name) {
        return fromString(name, MysqlInternalTmpMemStorageEngine.class);
    }

    /**
     * Gets known MysqlInternalTmpMemStorageEngine values.
     *
     * @return known MysqlInternalTmpMemStorageEngine values.
     */
    public static Collection<MysqlInternalTmpMemStorageEngine> values() {
        return values(MysqlInternalTmpMemStorageEngine.class);
    }
}
