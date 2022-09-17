package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Balance;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BalanceTests {
    @Test
    public void testDeserialize() {
        Balance model =
                BinaryData.fromString(
                                "{\"month_to_date_balance\":\"wixvcpwnkwywzw\",\"account_balance\":\"alickduoi\",\"month_to_date_usage\":\"amt\",\"generated_at\":\"2021-07-28T03:33:13Z\"}")
                        .toObject(Balance.class);
        Assertions.assertEquals("wixvcpwnkwywzw", model.getMonthToDateBalance());
        Assertions.assertEquals("alickduoi", model.getAccountBalance());
        Assertions.assertEquals("amt", model.getMonthToDateUsage());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-28T03:33:13Z"), model.getGeneratedAt());
    }

    @Test
    public void testSerialize() {
        Balance model =
                new Balance()
                        .setMonthToDateBalance("wixvcpwnkwywzw")
                        .setAccountBalance("alickduoi")
                        .setMonthToDateUsage("amt")
                        .setGeneratedAt(OffsetDateTime.parse("2021-07-28T03:33:13Z"));
        model = BinaryData.fromObject(model).toObject(Balance.class);
        Assertions.assertEquals("wixvcpwnkwywzw", model.getMonthToDateBalance());
        Assertions.assertEquals("alickduoi", model.getAccountBalance());
        Assertions.assertEquals("amt", model.getMonthToDateUsage());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-28T03:33:13Z"), model.getGeneratedAt());
    }
}
