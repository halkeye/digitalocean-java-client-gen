package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Error;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ErrorTests {
    @Test
    public void testDeserialize() {
        Error model =
                BinaryData.fromString("{\"id\":\"tbmufpo\",\"message\":\"noi\",\"request_id\":\"wlrxyb\"}")
                        .toObject(Error.class);
        Assertions.assertEquals("tbmufpo", model.getId());
        Assertions.assertEquals("noi", model.getMessage());
        Assertions.assertEquals("wlrxyb", model.getRequestId());
    }

    @Test
    public void testSerialize() {
        Error model = new Error().setId("tbmufpo").setMessage("noi").setRequestId("wlrxyb");
        model = BinaryData.fromObject(model).toObject(Error.class);
        Assertions.assertEquals("tbmufpo", model.getId());
        Assertions.assertEquals("noi", model.getMessage());
        Assertions.assertEquals("wlrxyb", model.getRequestId());
    }
}
