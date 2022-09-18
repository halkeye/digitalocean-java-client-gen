package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Type of billing history entry.
 */
public final class BillingHistoryType extends ExpandableStringEnum<BillingHistoryType> {
    /**
     * Static value ACHFailure for BillingHistoryType.
     */
    public static final BillingHistoryType ACHFAILURE = fromString("ACHFailure");

    /**
     * Static value Adjustment for BillingHistoryType.
     */
    public static final BillingHistoryType ADJUSTMENT = fromString("Adjustment");

    /**
     * Static value AttemptFailed for BillingHistoryType.
     */
    public static final BillingHistoryType ATTEMPT_FAILED = fromString("AttemptFailed");

    /**
     * Static value Chargeback for BillingHistoryType.
     */
    public static final BillingHistoryType CHARGEBACK = fromString("Chargeback");

    /**
     * Static value Credit for BillingHistoryType.
     */
    public static final BillingHistoryType CREDIT = fromString("Credit");

    /**
     * Static value CreditExpiration for BillingHistoryType.
     */
    public static final BillingHistoryType CREDIT_EXPIRATION = fromString("CreditExpiration");

    /**
     * Static value Invoice for BillingHistoryType.
     */
    public static final BillingHistoryType INVOICE = fromString("Invoice");

    /**
     * Static value Payment for BillingHistoryType.
     */
    public static final BillingHistoryType PAYMENT = fromString("Payment");

    /**
     * Static value Refund for BillingHistoryType.
     */
    public static final BillingHistoryType REFUND = fromString("Refund");

    /**
     * Static value Reversal for BillingHistoryType.
     */
    public static final BillingHistoryType REVERSAL = fromString("Reversal");

    /**
     * Creates or finds a BillingHistoryType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BillingHistoryType.
     */
    @JsonCreator
    public static BillingHistoryType fromString(String name) {
        return fromString(name, BillingHistoryType.class);
    }

    /**
     * Gets known BillingHistoryType values.
     * 
     * @return known BillingHistoryType values.
     */
    public static Collection<BillingHistoryType> values() {
        return values(BillingHistoryType.class);
    }
}
