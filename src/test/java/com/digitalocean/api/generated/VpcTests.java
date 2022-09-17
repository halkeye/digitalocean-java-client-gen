package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Vpc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VpcTests {
    @Test
    public void testDeserialize() {
        Vpc model =
                BinaryData.fromString(
                                "{\"region\":\"wtvmijccpkkjl\",\"ip_range\":\"yvwpr\",\"default\":false,\"urn\":\"tnnlbhxjppcbq\",\"created_at\":\"2021-07-11T01:48:03Z\",\"name\":\"fppvolzayj\",\"description\":\"unj\"}")
                        .toObject(Vpc.class);
        Assertions.assertEquals("fppvolzayj", model.getName());
        Assertions.assertEquals("unj", model.getDescription());
        Assertions.assertEquals("wtvmijccpkkjl", model.getRegion());
        Assertions.assertEquals("yvwpr", model.getIpRange());
        Assertions.assertEquals(false, model.isDefaultProperty());
        Assertions.assertEquals("tnnlbhxjppcbq", model.getUrn());
    }

    @Test
    public void testSerialize() {
        Vpc model =
                new Vpc()
                        .setName("fppvolzayj")
                        .setDescription("unj")
                        .setRegion("wtvmijccpkkjl")
                        .setIpRange("yvwpr")
                        .setDefaultProperty(false)
                        .setUrn("tnnlbhxjppcbq");
        model = BinaryData.fromObject(model).toObject(Vpc.class);
        Assertions.assertEquals("fppvolzayj", model.getName());
        Assertions.assertEquals("unj", model.getDescription());
        Assertions.assertEquals("wtvmijccpkkjl", model.getRegion());
        Assertions.assertEquals("yvwpr", model.getIpRange());
        Assertions.assertEquals(false, model.isDefaultProperty());
        Assertions.assertEquals("tnnlbhxjppcbq", model.getUrn());
    }
}
