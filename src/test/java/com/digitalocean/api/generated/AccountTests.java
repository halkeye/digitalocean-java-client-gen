package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Account;
import com.digitalocean.api.models.AccountStatus;
import com.digitalocean.api.models.AccountTeam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AccountTests {
    @Test
    public void testDeserialize() {
        Account model =
                BinaryData.fromString(
                                "{\"droplet_limit\":1933182137,\"floating_ip_limit\":1823577017,\"email\":\"jpsq\",\"uuid\":\"cmpoyfdkfogkny\",\"email_verified\":false,\"status\":\"locked\",\"status_message\":\"fjddeqs\",\"team\":{\"uuid\":\"upewnwreitjzy\",\"name\":\"usarhmofc\"}}")
                        .toObject(Account.class);
        Assertions.assertEquals(1933182137, model.getDropletLimit());
        Assertions.assertEquals(1823577017, model.getFloatingIpLimit());
        Assertions.assertEquals("jpsq", model.getEmail());
        Assertions.assertEquals("cmpoyfdkfogkny", model.getUuid());
        Assertions.assertEquals(false, model.isEmailVerified());
        Assertions.assertEquals(AccountStatus.LOCKED, model.getStatus());
        Assertions.assertEquals("fjddeqs", model.getStatusMessage());
        Assertions.assertEquals("upewnwreitjzy", model.getTeam().getUuid());
        Assertions.assertEquals("usarhmofc", model.getTeam().getName());
    }

    @Test
    public void testSerialize() {
        Account model =
                new Account()
                        .setDropletLimit(1933182137)
                        .setFloatingIpLimit(1823577017)
                        .setEmail("jpsq")
                        .setUuid("cmpoyfdkfogkny")
                        .setEmailVerified(false)
                        .setStatus(AccountStatus.LOCKED)
                        .setStatusMessage("fjddeqs")
                        .setTeam(new AccountTeam().setUuid("upewnwreitjzy").setName("usarhmofc"));
        model = BinaryData.fromObject(model).toObject(Account.class);
        Assertions.assertEquals(1933182137, model.getDropletLimit());
        Assertions.assertEquals(1823577017, model.getFloatingIpLimit());
        Assertions.assertEquals("jpsq", model.getEmail());
        Assertions.assertEquals("cmpoyfdkfogkny", model.getUuid());
        Assertions.assertEquals(false, model.isEmailVerified());
        Assertions.assertEquals(AccountStatus.LOCKED, model.getStatus());
        Assertions.assertEquals("fjddeqs", model.getStatusMessage());
        Assertions.assertEquals("upewnwreitjzy", model.getTeam().getUuid());
        Assertions.assertEquals("usarhmofc", model.getTeam().getName());
    }
}
