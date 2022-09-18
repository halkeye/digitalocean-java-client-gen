package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Account;
import com.digitalocean.api.models.AccountStatus;
import com.digitalocean.api.models.AccountTeam;
import com.digitalocean.api.models.Components1RzambuResponsesAccountContentApplicationJsonSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1RzambuResponsesAccountContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1RzambuResponsesAccountContentApplicationJsonSchema model = BinaryData.fromString("{\"account\":{\"droplet_limit\":1080301009,\"floating_ip_limit\":1931850121,\"email\":\"sqe\",\"uuid\":\"aagdfmg\",\"email_verified\":true,\"status\":\"locked\",\"status_message\":\"hjxri\",\"team\":{\"uuid\":\"mrvktsizntoc\",\"name\":\"a\"}}}").toObject(Components1RzambuResponsesAccountContentApplicationJsonSchema.class);
        Assertions.assertEquals(1080301009, model.getAccount().getDropletLimit());
        Assertions.assertEquals(1931850121, model.getAccount().getFloatingIpLimit());
        Assertions.assertEquals("sqe", model.getAccount().getEmail());
        Assertions.assertEquals("aagdfmg", model.getAccount().getUuid());
        Assertions.assertEquals(true, model.getAccount().isEmailVerified());
        Assertions.assertEquals(AccountStatus.LOCKED, model.getAccount().getStatus());
        Assertions.assertEquals("hjxri", model.getAccount().getStatusMessage());
        Assertions.assertEquals("mrvktsizntoc", model.getAccount().getTeam().getUuid());
        Assertions.assertEquals("a", model.getAccount().getTeam().getName());
    }

    @Test
    public void testSerialize() {
        Components1RzambuResponsesAccountContentApplicationJsonSchema model = new Components1RzambuResponsesAccountContentApplicationJsonSchema().setAccount(new Account().setDropletLimit(1080301009).setFloatingIpLimit(1931850121).setEmail("sqe").setUuid("aagdfmg").setEmailVerified(true).setStatus(AccountStatus.LOCKED).setStatusMessage("hjxri").setTeam(new AccountTeam().setUuid("mrvktsizntoc").setName("a")));
        model = BinaryData.fromObject(model).toObject(Components1RzambuResponsesAccountContentApplicationJsonSchema.class);
        Assertions.assertEquals(1080301009, model.getAccount().getDropletLimit());
        Assertions.assertEquals(1931850121, model.getAccount().getFloatingIpLimit());
        Assertions.assertEquals("sqe", model.getAccount().getEmail());
        Assertions.assertEquals("aagdfmg", model.getAccount().getUuid());
        Assertions.assertEquals(true, model.getAccount().isEmailVerified());
        Assertions.assertEquals(AccountStatus.LOCKED, model.getAccount().getStatus());
        Assertions.assertEquals("hjxri", model.getAccount().getStatusMessage());
        Assertions.assertEquals("mrvktsizntoc", model.getAccount().getTeam().getUuid());
        Assertions.assertEquals("a", model.getAccount().getTeam().getName());
    }
}
