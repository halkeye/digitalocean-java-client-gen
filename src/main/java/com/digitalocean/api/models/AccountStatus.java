package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** This value is one of "active", "warning" or "locked". */
public final class AccountStatus extends ExpandableStringEnum<AccountStatus> {
    /** Static value active for AccountStatus. */
    public static final AccountStatus ACTIVE = fromString("active");

    /** Static value warning for AccountStatus. */
    public static final AccountStatus WARNING = fromString("warning");

    /** Static value locked for AccountStatus. */
    public static final AccountStatus LOCKED = fromString("locked");

    /**
     * Creates or finds a AccountStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AccountStatus.
     */
    @JsonCreator
    public static AccountStatus fromString(String name) {
        return fromString(name, AccountStatus.class);
    }

    /**
     * Gets known AccountStatus values.
     *
     * @return known AccountStatus values.
     */
    public static Collection<AccountStatus> values() {
        return values(AccountStatus.class);
    }
}
