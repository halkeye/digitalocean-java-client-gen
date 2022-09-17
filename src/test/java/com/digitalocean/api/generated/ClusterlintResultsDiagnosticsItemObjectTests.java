package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ClusterlintResultsDiagnosticsItemObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterlintResultsDiagnosticsItemObjectTests {
    @Test
    public void testDeserialize() {
        ClusterlintResultsDiagnosticsItemObject model =
                BinaryData.fromString("{\"name\":\"ssnqe\",\"kind\":\"otbptg\",\"namespace\":\"manxx\"}")
                        .toObject(ClusterlintResultsDiagnosticsItemObject.class);
        Assertions.assertEquals("ssnqe", model.getName());
        Assertions.assertEquals("otbptg", model.getKind());
        Assertions.assertEquals("manxx", model.getNamespace());
    }

    @Test
    public void testSerialize() {
        ClusterlintResultsDiagnosticsItemObject model =
                new ClusterlintResultsDiagnosticsItemObject().setName("ssnqe").setKind("otbptg").setNamespace("manxx");
        model = BinaryData.fromObject(model).toObject(ClusterlintResultsDiagnosticsItemObject.class);
        Assertions.assertEquals("ssnqe", model.getName());
        Assertions.assertEquals("otbptg", model.getKind());
        Assertions.assertEquals("manxx", model.getNamespace());
    }
}
