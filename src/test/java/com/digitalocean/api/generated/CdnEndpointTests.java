package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.CdnEndpoint;
import com.digitalocean.api.models.CdnEndpointTtl;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CdnEndpointTests {
    @Test
    public void testDeserialize() {
        CdnEndpoint model = BinaryData.fromString("{\"origin\":\"glmep\",\"endpoint\":\"fs\",\"ttl\":600,\"custom_domain\":\"angpszngafpgyl\",\"created_at\":\"2021-07-27T16:28:59Z\"}").toObject(CdnEndpoint.class);
        Assertions.assertEquals("glmep", model.getOrigin());
        Assertions.assertEquals(CdnEndpointTtl.SIX_HUNDRED, model.getTtl());
        Assertions.assertEquals("angpszngafpgyl", model.getCustomDomain());
    }

    @Test
    public void testSerialize() {
        CdnEndpoint model = new CdnEndpoint().setOrigin("glmep").setTtl(CdnEndpointTtl.SIX_HUNDRED).setCustomDomain("angpszngafpgyl");
        model = BinaryData.fromObject(model).toObject(CdnEndpoint.class);
        Assertions.assertEquals("glmep", model.getOrigin());
        Assertions.assertEquals(CdnEndpointTtl.SIX_HUNDRED, model.getTtl());
        Assertions.assertEquals("angpszngafpgyl", model.getCustomDomain());
    }
}
