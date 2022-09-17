package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DropletCreate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletCreateTests {
    @Test
    public void testDeserialize() {
        DropletCreate model =
                BinaryData.fromString(
                                "{\"region\":\"fmdafbgymqtnap\",\"size\":\"eojxrjn\",\"ssh_keys\":[],\"backups\":false,\"ipv6\":false,\"monitoring\":false,\"tags\":[\"eychbji\",\"qf\",\"gnwdxz\"],\"user_data\":\"p\",\"private_networking\":false,\"vpc_uuid\":\"borx\",\"with_droplet_agent\":false}")
                        .toObject(DropletCreate.class);
        Assertions.assertEquals("fmdafbgymqtnap", model.getRegion());
        Assertions.assertEquals("eojxrjn", model.getSize());
        Assertions.assertEquals(false, model.isBackups());
        Assertions.assertEquals(false, model.isIpv6());
        Assertions.assertEquals(false, model.isMonitoring());
        Assertions.assertEquals("eychbji", model.getTags().get(0));
        Assertions.assertEquals("p", model.getUserData());
        Assertions.assertEquals(false, model.isPrivateNetworking());
        Assertions.assertEquals("borx", model.getVpcUuid());
        Assertions.assertEquals(false, model.isWithDropletAgent());
    }

    @Test
    public void testSerialize() {
        DropletCreate model =
                new DropletCreate()
                        .setRegion("fmdafbgymqtnap")
                        .setSize("eojxrjn")
                        .setSshKeys(Arrays.asList())
                        .setBackups(false)
                        .setIpv6(false)
                        .setMonitoring(false)
                        .setTags(Arrays.asList("eychbji", "qf", "gnwdxz"))
                        .setUserData("p")
                        .setPrivateNetworking(false)
                        .setVpcUuid("borx")
                        .setWithDropletAgent(false);
        model = BinaryData.fromObject(model).toObject(DropletCreate.class);
        Assertions.assertEquals("fmdafbgymqtnap", model.getRegion());
        Assertions.assertEquals("eojxrjn", model.getSize());
        Assertions.assertEquals(false, model.isBackups());
        Assertions.assertEquals(false, model.isIpv6());
        Assertions.assertEquals(false, model.isMonitoring());
        Assertions.assertEquals("eychbji", model.getTags().get(0));
        Assertions.assertEquals("p", model.getUserData());
        Assertions.assertEquals(false, model.isPrivateNetworking());
        Assertions.assertEquals("borx", model.getVpcUuid());
        Assertions.assertEquals(false, model.isWithDropletAgent());
    }
}
