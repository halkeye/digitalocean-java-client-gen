package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.CdnEndpoint;
import com.digitalocean.api.models.CdnEndpointTtl;
import com.digitalocean.api.models.ComponentsXghsoiResponsesAllCdnEndpointsContentApplicationJsonSchemaAllof0;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsXghsoiResponsesAllCdnEndpointsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsXghsoiResponsesAllCdnEndpointsContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"endpoints\":[{\"origin\":\"qjfkakfqfrkemyi\",\"endpoint\":\"udxjascowv\",\"ttl\":600,\"custom_domain\":\"dxphlk\",\"created_at\":\"2021-04-12T03:14:04Z\"},{\"origin\":\"gzv\",\"endpoint\":\"ij\",\"ttl\":60,\"custom_domain\":\"nwsithuqolyahluq\",\"created_at\":\"2021-09-29T05:28Z\"},{\"origin\":\"sutrjbhxykfhyqe\",\"endpoint\":\"qqug\",\"ttl\":600,\"custom_domain\":\"cvexreuqu\",\"created_at\":\"2021-02-11T13:26:34Z\"},{\"origin\":\"jv\",\"endpoint\":\"hreagk\",\"ttl\":3600,\"custom_domain\":\"qtvbczsu\",\"created_at\":\"2021-06-04T15:19:26Z\"}]}").toObject(ComponentsXghsoiResponsesAllCdnEndpointsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("qjfkakfqfrkemyi", model.getEndpoints().get(0).getOrigin());
        Assertions.assertEquals(CdnEndpointTtl.SIX_HUNDRED, model.getEndpoints().get(0).getTtl());
        Assertions.assertEquals("dxphlk", model.getEndpoints().get(0).getCustomDomain());
    }

    @Test
    public void testSerialize() {
        ComponentsXghsoiResponsesAllCdnEndpointsContentApplicationJsonSchemaAllof0 model = new ComponentsXghsoiResponsesAllCdnEndpointsContentApplicationJsonSchemaAllof0().setEndpoints(Arrays.asList(new CdnEndpoint().setOrigin("qjfkakfqfrkemyi").setTtl(CdnEndpointTtl.SIX_HUNDRED).setCustomDomain("dxphlk"), new CdnEndpoint().setOrigin("gzv").setTtl(CdnEndpointTtl.SIXTY).setCustomDomain("nwsithuqolyahluq"), new CdnEndpoint().setOrigin("sutrjbhxykfhyqe").setTtl(CdnEndpointTtl.SIX_HUNDRED).setCustomDomain("cvexreuqu"), new CdnEndpoint().setOrigin("jv").setTtl(CdnEndpointTtl.THREE_THOUSAND_SIX_HUNDRED).setCustomDomain("qtvbczsu")));
        model = BinaryData.fromObject(model).toObject(ComponentsXghsoiResponsesAllCdnEndpointsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("qjfkakfqfrkemyi", model.getEndpoints().get(0).getOrigin());
        Assertions.assertEquals(CdnEndpointTtl.SIX_HUNDRED, model.getEndpoints().get(0).getTtl());
        Assertions.assertEquals("dxphlk", model.getEndpoints().get(0).getCustomDomain());
    }
}
