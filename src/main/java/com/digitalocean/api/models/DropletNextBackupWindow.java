package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The details of the Droplet's backups feature, if backups are configured for the Droplet. This object contains keys
 * for the start and end times of the window during which the backup will start.
 */
@Fluent
public final class DropletNextBackupWindow {
    /*
     * A time value given in ISO8601 combined date and time format specifying the start of the Droplet's backup window.
     */
    @JsonProperty(value = "start")
    private OffsetDateTime start;

    /*
     * A time value given in ISO8601 combined date and time format specifying the end of the Droplet's backup window.
     */
    @JsonProperty(value = "end")
    private OffsetDateTime end;

    /**
     * Get the start property: A time value given in ISO8601 combined date and time format specifying the start of the
     * Droplet's backup window.
     *
     * @return the start value.
     */
    public OffsetDateTime getStart() {
        return this.start;
    }

    /**
     * Set the start property: A time value given in ISO8601 combined date and time format specifying the start of the
     * Droplet's backup window.
     *
     * @param start the start value to set.
     * @return the DropletNextBackupWindow object itself.
     */
    public DropletNextBackupWindow setStart(OffsetDateTime start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end property: A time value given in ISO8601 combined date and time format specifying the end of the
     * Droplet's backup window.
     *
     * @return the end value.
     */
    public OffsetDateTime getEnd() {
        return this.end;
    }

    /**
     * Set the end property: A time value given in ISO8601 combined date and time format specifying the end of the
     * Droplet's backup window.
     *
     * @param end the end value to set.
     * @return the DropletNextBackupWindow object itself.
     */
    public DropletNextBackupWindow setEnd(OffsetDateTime end) {
        this.end = end;
        return this;
    }
}
