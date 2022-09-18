package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.UpdateEndpoint;
import com.digitalocean.api.models.UpdateEndpointTtl;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdateEndpointTests {
    @Test
    public void testDeserialize() {
        UpdateEndpoint model = BinaryData.fromString("{\"ttl\":3600,\"custom_domain\":\"dgxvco\"}").toObject(UpdateEndpoint.class);
        Assertions.assertEquals(UpdateEndpointTtl.THREE_THOUSAND_SIX_HUNDRED, model.getTtl());
        Assertions.assertEquals("dgxvco", model.getCustomDomain());
    }

    @Test
    public void testSerialize() {
        UpdateEndpoint model = new UpdateEndpoint().setTtl(UpdateEndpointTtl.THREE_THOUSAND_SIX_HUNDRED).setCustomDomain("dgxvco");
        model = BinaryData.fromObject(model).toObject(UpdateEndpoint.class);
        Assertions.assertEquals(UpdateEndpointTtl.THREE_THOUSAND_SIX_HUNDRED, model.getTtl());
        Assertions.assertEquals("dgxvco", model.getCustomDomain());
    }
}
