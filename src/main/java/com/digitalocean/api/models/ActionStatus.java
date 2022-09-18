package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The current status of the action. This can be "in-progress", "completed", or "errored".
 */
public final class ActionStatus extends ExpandableStringEnum<ActionStatus> {
    /**
     * Static value in-progress for ActionStatus.
     */
    public static final ActionStatus IN_PROGRESS = fromString("in-progress");

    /**
     * Static value completed for ActionStatus.
     */
    public static final ActionStatus COMPLETED = fromString("completed");

    /**
     * Static value errored for ActionStatus.
     */
    public static final ActionStatus ERRORED = fromString("errored");

    /**
     * Creates or finds a ActionStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ActionStatus.
     */
    @JsonCreator
    public static ActionStatus fromString(String name) {
        return fromString(name, ActionStatus.class);
    }

    /**
     * Gets known ActionStatus values.
     * 
     * @return known ActionStatus values.
     */
    public static Collection<ActionStatus> values() {
        return values(ActionStatus.class);
    }
}
