package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;

/** The DatabaseClusterMaintenanceWindow model. */
@Fluent
public final class DatabaseClusterMaintenanceWindow extends DatabaseMaintenanceWindow {
    /** {@inheritDoc} */
    @Override
    public DatabaseClusterMaintenanceWindow setDay(String day) {
        super.setDay(day);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabaseClusterMaintenanceWindow setHour(String hour) {
        super.setHour(hour);
        return this;
    }
}
