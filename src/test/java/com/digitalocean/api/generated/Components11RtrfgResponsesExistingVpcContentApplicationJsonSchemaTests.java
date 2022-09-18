package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components11RtrfgResponsesExistingVpcContentApplicationJsonSchema;
import com.digitalocean.api.models.Vpc;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components11RtrfgResponsesExistingVpcContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components11RtrfgResponsesExistingVpcContentApplicationJsonSchema model = BinaryData.fromString("{\"vpc\":{\"region\":\"neli\",\"ip_range\":\"tibtkqjqjcaj\",\"default\":true,\"urn\":\"khhk\",\"created_at\":\"2021-05-12T08:19:46Z\",\"name\":\"kxeojtdyulglhel\",\"description\":\"uklfqfxspxgogy\"}}").toObject(Components11RtrfgResponsesExistingVpcContentApplicationJsonSchema.class);
        Assertions.assertEquals("kxeojtdyulglhel", model.getVpc().getName());
        Assertions.assertEquals("uklfqfxspxgogy", model.getVpc().getDescription());
        Assertions.assertEquals("neli", model.getVpc().getRegion());
        Assertions.assertEquals("tibtkqjqjcaj", model.getVpc().getIpRange());
        Assertions.assertEquals(true, model.getVpc().isDefaultProperty());
        Assertions.assertEquals("khhk", model.getVpc().getUrn());
    }

    @Test
    public void testSerialize() {
        Components11RtrfgResponsesExistingVpcContentApplicationJsonSchema model = new Components11RtrfgResponsesExistingVpcContentApplicationJsonSchema().setVpc(new Vpc().setName("kxeojtdyulglhel").setDescription("uklfqfxspxgogy").setRegion("neli").setIpRange("tibtkqjqjcaj").setDefaultProperty(true).setUrn("khhk"));
        model = BinaryData.fromObject(model).toObject(Components11RtrfgResponsesExistingVpcContentApplicationJsonSchema.class);
        Assertions.assertEquals("kxeojtdyulglhel", model.getVpc().getName());
        Assertions.assertEquals("uklfqfxspxgogy", model.getVpc().getDescription());
        Assertions.assertEquals("neli", model.getVpc().getRegion());
        Assertions.assertEquals("tibtkqjqjcaj", model.getVpc().getIpRange());
        Assertions.assertEquals(true, model.getVpc().isDefaultProperty());
        Assertions.assertEquals("khhk", model.getVpc().getUrn());
    }
}
