package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.UpdateEndpoint;
import com.digitalocean.api.models.UpdateEndpointTtl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdateEndpointTests {
    @Test
    public void testDeserialize() {
        UpdateEndpoint model =
                BinaryData.fromString("{\"ttl\":3600,\"custom_domain\":\"dgxvco\"}").toObject(UpdateEndpoint.class);
        Assertions.assertEquals(UpdateEndpointTtl.THREE_THOUSAND_SIX_HUNDRED, model.getTtl());
        Assertions.assertEquals("dgxvco", model.getCustomDomain());
    }

    @Test
    public void testSerialize() {
        UpdateEndpoint model =
                new UpdateEndpoint().setTtl(UpdateEndpointTtl.THREE_THOUSAND_SIX_HUNDRED).setCustomDomain("dgxvco");
        model = BinaryData.fromObject(model).toObject(UpdateEndpoint.class);
        Assertions.assertEquals(UpdateEndpointTtl.THREE_THOUSAND_SIX_HUNDRED, model.getTtl());
        Assertions.assertEquals("dgxvco", model.getCustomDomain());
    }
}
