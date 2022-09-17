package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.CdnEndpoint;
import com.digitalocean.api.models.CdnEndpointTtl;
import com.digitalocean.api.models.Components1Odkfm1ResponsesAllCdnEndpointsContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Odkfm1ResponsesAllCdnEndpointsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Odkfm1ResponsesAllCdnEndpointsContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":1674325825},\"endpoints\":[{\"origin\":\"vkcqhr\",\"endpoint\":\"xk\",\"ttl\":3600,\"custom_domain\":\"mmkyu\",\"created_at\":\"2021-10-19T14:58:02Z\"}]}")
                        .toObject(Components1Odkfm1ResponsesAllCdnEndpointsContentApplicationJsonSchema.class);
        Assertions.assertEquals("vkcqhr", model.getEndpoints().get(0).getOrigin());
        Assertions.assertEquals(CdnEndpointTtl.THREE_THOUSAND_SIX_HUNDRED, model.getEndpoints().get(0).getTtl());
        Assertions.assertEquals("mmkyu", model.getEndpoints().get(0).getCustomDomain());
        Assertions.assertEquals(1674325825, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components1Odkfm1ResponsesAllCdnEndpointsContentApplicationJsonSchema model =
                new Components1Odkfm1ResponsesAllCdnEndpointsContentApplicationJsonSchema()
                        .setEndpoints(
                                Arrays.asList(
                                        new CdnEndpoint()
                                                .setOrigin("vkcqhr")
                                                .setTtl(CdnEndpointTtl.THREE_THOUSAND_SIX_HUNDRED)
                                                .setCustomDomain("mmkyu")))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(1674325825));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Odkfm1ResponsesAllCdnEndpointsContentApplicationJsonSchema.class);
        Assertions.assertEquals("vkcqhr", model.getEndpoints().get(0).getOrigin());
        Assertions.assertEquals(CdnEndpointTtl.THREE_THOUSAND_SIX_HUNDRED, model.getEndpoints().get(0).getTtl());
        Assertions.assertEquals("mmkyu", model.getEndpoints().get(0).getCustomDomain());
        Assertions.assertEquals(1674325825, model.getMeta().getTotal());
    }
}
