package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.SimpleCharge;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SimpleChargeTests {
    @Test
    public void testDeserialize() {
        SimpleCharge model = BinaryData.fromString("{\"name\":\"n\",\"amount\":\"kiqaondjr\"}").toObject(SimpleCharge.class);
        Assertions.assertEquals("n", model.getName());
        Assertions.assertEquals("kiqaondjr", model.getAmount());
    }

    @Test
    public void testSerialize() {
        SimpleCharge model = new SimpleCharge().setName("n").setAmount("kiqaondjr");
        model = BinaryData.fromObject(model).toObject(SimpleCharge.class);
        Assertions.assertEquals("n", model.getName());
        Assertions.assertEquals("kiqaondjr", model.getAmount());
    }
}
