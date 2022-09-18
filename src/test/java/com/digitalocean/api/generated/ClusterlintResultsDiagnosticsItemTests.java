package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ClusterlintResultsDiagnosticsItem;
import com.digitalocean.api.models.ClusterlintResultsDiagnosticsItemObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterlintResultsDiagnosticsItemTests {
    @Test
    public void testDeserialize() {
        ClusterlintResultsDiagnosticsItem model = BinaryData.fromString("{\"check_name\":\"hmpmhef\",\"severity\":\"aphqeofytl\",\"message\":\"lowmcm\",\"object\":{\"name\":\"xuanccqvjfdgfq\",\"kind\":\"quxpjhcfaara\",\"namespace\":\"iovmufzgugrblwal\"}}").toObject(ClusterlintResultsDiagnosticsItem.class);
        Assertions.assertEquals("hmpmhef", model.getCheckName());
        Assertions.assertEquals("aphqeofytl", model.getSeverity());
        Assertions.assertEquals("lowmcm", model.getMessage());
        Assertions.assertEquals("xuanccqvjfdgfq", model.getObject().getName());
        Assertions.assertEquals("quxpjhcfaara", model.getObject().getKind());
        Assertions.assertEquals("iovmufzgugrblwal", model.getObject().getNamespace());
    }

    @Test
    public void testSerialize() {
        ClusterlintResultsDiagnosticsItem model = new ClusterlintResultsDiagnosticsItem().setCheckName("hmpmhef").setSeverity("aphqeofytl").setMessage("lowmcm").setObject(new ClusterlintResultsDiagnosticsItemObject().setName("xuanccqvjfdgfq").setKind("quxpjhcfaara").setNamespace("iovmufzgugrblwal"));
        model = BinaryData.fromObject(model).toObject(ClusterlintResultsDiagnosticsItem.class);
        Assertions.assertEquals("hmpmhef", model.getCheckName());
        Assertions.assertEquals("aphqeofytl", model.getSeverity());
        Assertions.assertEquals("lowmcm", model.getMessage());
        Assertions.assertEquals("xuanccqvjfdgfq", model.getObject().getName());
        Assertions.assertEquals("quxpjhcfaara", model.getObject().getKind());
        Assertions.assertEquals("iovmufzgugrblwal", model.getObject().getNamespace());
    }
}
