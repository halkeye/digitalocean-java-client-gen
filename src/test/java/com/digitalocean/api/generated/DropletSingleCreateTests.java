package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DropletCreate;
import com.digitalocean.api.models.DropletSingleCreate;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletSingleCreateTests {
    @Test
    public void testDeserialize() {
        DropletSingleCreate model = BinaryData.fromString("{\"name\":\"gpterdiu\",\"region\":\"kirkskw\",\"size\":\"tsdetjygowifcq\",\"ssh_keys\":[],\"backups\":false,\"ipv6\":false,\"monitoring\":true,\"tags\":[\"yybzoxlvoc\",\"tvdxxhe\"],\"user_data\":\"mlil\",\"private_networking\":true,\"vpc_uuid\":\"jhjvmabzzbw\",\"with_droplet_agent\":false}").toObject(DropletSingleCreate.class);
        Assertions.assertEquals("kirkskw", model.getRegion());
        Assertions.assertEquals("tsdetjygowifcq", model.getSize());
        Assertions.assertEquals(false, model.isBackups());
        Assertions.assertEquals(false, model.isIpv6());
        Assertions.assertEquals(true, model.isMonitoring());
        Assertions.assertEquals("yybzoxlvoc", model.getTags().get(0));
        Assertions.assertEquals("mlil", model.getUserData());
        Assertions.assertEquals(true, model.isPrivateNetworking());
        Assertions.assertEquals("jhjvmabzzbw", model.getVpcUuid());
        Assertions.assertEquals(false, model.isWithDropletAgent());
        Assertions.assertEquals("gpterdiu", model.getName());
    }

    @Test
    public void testSerialize() {
        DropletSingleCreate model = new DropletSingleCreate().setRegion("kirkskw").setSize("tsdetjygowifcq").setSshKeys(Arrays.asList()).setBackups(false).setIpv6(false).setMonitoring(true).setTags(Arrays.asList("yybzoxlvoc", "tvdxxhe")).setUserData("mlil").setPrivateNetworking(true).setVpcUuid("jhjvmabzzbw").setWithDropletAgent(false).setName("gpterdiu");
        model = BinaryData.fromObject(model).toObject(DropletSingleCreate.class);
        Assertions.assertEquals("kirkskw", model.getRegion());
        Assertions.assertEquals("tsdetjygowifcq", model.getSize());
        Assertions.assertEquals(false, model.isBackups());
        Assertions.assertEquals(false, model.isIpv6());
        Assertions.assertEquals(true, model.isMonitoring());
        Assertions.assertEquals("yybzoxlvoc", model.getTags().get(0));
        Assertions.assertEquals("mlil", model.getUserData());
        Assertions.assertEquals(true, model.isPrivateNetworking());
        Assertions.assertEquals("jhjvmabzzbw", model.getVpcUuid());
        Assertions.assertEquals(false, model.isWithDropletAgent());
        Assertions.assertEquals("gpterdiu", model.getName());
    }
}
