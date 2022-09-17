package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AssociatedResource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AssociatedResourceTests {
    @Test
    public void testDeserialize() {
        AssociatedResource model =
                BinaryData.fromString("{\"id\":\"pryfmxmdutzfkgi\",\"name\":\"oudccgndjg\",\"cost\":\"r\"}")
                        .toObject(AssociatedResource.class);
        Assertions.assertEquals("pryfmxmdutzfkgi", model.getId());
        Assertions.assertEquals("oudccgndjg", model.getName());
        Assertions.assertEquals("r", model.getCost());
    }

    @Test
    public void testSerialize() {
        AssociatedResource model = new AssociatedResource().setId("pryfmxmdutzfkgi").setName("oudccgndjg").setCost("r");
        model = BinaryData.fromObject(model).toObject(AssociatedResource.class);
        Assertions.assertEquals("pryfmxmdutzfkgi", model.getId());
        Assertions.assertEquals("oudccgndjg", model.getName());
        Assertions.assertEquals("r", model.getCost());
    }
}
