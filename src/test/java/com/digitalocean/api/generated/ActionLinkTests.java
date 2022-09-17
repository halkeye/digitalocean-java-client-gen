package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ActionLink;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ActionLinkTests {
    @Test
    public void testDeserialize() {
        ActionLink model =
                BinaryData.fromString("{\"id\":1624416011,\"rel\":\"ovu\",\"href\":\"xhmehjnhjiotif\"}")
                        .toObject(ActionLink.class);
        Assertions.assertEquals(1624416011, model.getId());
        Assertions.assertEquals("ovu", model.getRel());
        Assertions.assertEquals("xhmehjnhjiotif", model.getHref());
    }

    @Test
    public void testSerialize() {
        ActionLink model = new ActionLink().setId(1624416011).setRel("ovu").setHref("xhmehjnhjiotif");
        model = BinaryData.fromObject(model).toObject(ActionLink.class);
        Assertions.assertEquals(1624416011, model.getId());
        Assertions.assertEquals("ovu", model.getRel());
        Assertions.assertEquals("xhmehjnhjiotif", model.getHref());
    }
}
