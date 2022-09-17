package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AccountTeam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AccountTeamTests {
    @Test
    public void testDeserialize() {
        AccountTeam model =
                BinaryData.fromString("{\"uuid\":\"smy\",\"name\":\"kdtmlxhekuk\"}").toObject(AccountTeam.class);
        Assertions.assertEquals("smy", model.getUuid());
        Assertions.assertEquals("kdtmlxhekuk", model.getName());
    }

    @Test
    public void testSerialize() {
        AccountTeam model = new AccountTeam().setUuid("smy").setName("kdtmlxhekuk");
        model = BinaryData.fromObject(model).toObject(AccountTeam.class);
        Assertions.assertEquals("smy", model.getUuid());
        Assertions.assertEquals("kdtmlxhekuk", model.getName());
    }
}
