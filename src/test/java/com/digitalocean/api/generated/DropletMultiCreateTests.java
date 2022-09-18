package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DropletCreate;
import com.digitalocean.api.models.DropletMultiCreate;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletMultiCreateTests {
    @Test
    public void testDeserialize() {
        DropletMultiCreate model = BinaryData.fromString("{\"names\":[\"nfy\",\"avfrb\"],\"region\":\"picdbk\",\"size\":\"dj\",\"ssh_keys\":[],\"backups\":false,\"ipv6\":false,\"monitoring\":true,\"tags\":[\"gonjhxshthmgpczq\",\"lptkbvc\",\"xt\",\"higqqbtimpkjbl\"],\"user_data\":\"nsihqhudsm\",\"private_networking\":false,\"vpc_uuid\":\"awja\",\"with_droplet_agent\":false}").toObject(DropletMultiCreate.class);
        Assertions.assertEquals("picdbk", model.getRegion());
        Assertions.assertEquals("dj", model.getSize());
        Assertions.assertEquals(false, model.isBackups());
        Assertions.assertEquals(false, model.isIpv6());
        Assertions.assertEquals(true, model.isMonitoring());
        Assertions.assertEquals("gonjhxshthmgpczq", model.getTags().get(0));
        Assertions.assertEquals("nsihqhudsm", model.getUserData());
        Assertions.assertEquals(false, model.isPrivateNetworking());
        Assertions.assertEquals("awja", model.getVpcUuid());
        Assertions.assertEquals(false, model.isWithDropletAgent());
        Assertions.assertEquals("nfy", model.getNames().get(0));
    }

    @Test
    public void testSerialize() {
        DropletMultiCreate model = new DropletMultiCreate().setRegion("picdbk").setSize("dj").setSshKeys(Arrays.asList()).setBackups(false).setIpv6(false).setMonitoring(true).setTags(Arrays.asList("gonjhxshthmgpczq", "lptkbvc", "xt", "higqqbtimpkjbl")).setUserData("nsihqhudsm").setPrivateNetworking(false).setVpcUuid("awja").setWithDropletAgent(false).setNames(Arrays.asList("nfy", "avfrb"));
        model = BinaryData.fromObject(model).toObject(DropletMultiCreate.class);
        Assertions.assertEquals("picdbk", model.getRegion());
        Assertions.assertEquals("dj", model.getSize());
        Assertions.assertEquals(false, model.isBackups());
        Assertions.assertEquals(false, model.isIpv6());
        Assertions.assertEquals(true, model.isMonitoring());
        Assertions.assertEquals("gonjhxshthmgpczq", model.getTags().get(0));
        Assertions.assertEquals("nsihqhudsm", model.getUserData());
        Assertions.assertEquals(false, model.isPrivateNetworking());
        Assertions.assertEquals("awja", model.getVpcUuid());
        Assertions.assertEquals(false, model.isWithDropletAgent());
        Assertions.assertEquals("nfy", model.getNames().get(0));
    }
}
