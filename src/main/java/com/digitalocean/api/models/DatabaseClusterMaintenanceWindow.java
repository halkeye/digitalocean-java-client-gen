package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The DatabaseClusterMaintenanceWindow model.
 */
@Fluent
public final class DatabaseClusterMaintenanceWindow extends DatabaseMaintenanceWindow {
    /**
     * {@inheritDoc}
     */
    @Override
    public DatabaseClusterMaintenanceWindow setDay(String day) {
        super.setDay(day);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabaseClusterMaintenanceWindow setHour(String hour) {
        super.setHour(hour);
        return this;
    }
}
