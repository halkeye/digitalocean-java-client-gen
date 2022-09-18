package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DropletNetworks;
import com.digitalocean.api.models.NetworkV4;
import com.digitalocean.api.models.NetworkV4Type;
import com.digitalocean.api.models.NetworkV6;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletNetworksTests {
    @Test
    public void testDeserialize() {
        DropletNetworks model = BinaryData.fromString("{\"v4\":[{\"ip_address\":\"rukizyhgsqt\",\"netmask\":\"s\",\"gateway\":\"xqfpj\",\"type\":\"private\"},{\"ip_address\":\"weeiwdhdmnc\",\"netmask\":\"fzuscstun\",\"gateway\":\"hxdfbkl\",\"type\":\"public\"},{\"ip_address\":\"hgjsysmvxo\",\"netmask\":\"wxfkzsifcuvbdujg\",\"gateway\":\"xvecbbwjt\",\"type\":\"private\"},{\"ip_address\":\"izagbbgiar\",\"netmask\":\"ykpgd\",\"gateway\":\"wabzr\",\"type\":\"private\"}],\"v6\":[{\"ip_address\":\"ac\",\"netmask\":487908700,\"gateway\":\"sqkptjqgkifm\"},{\"ip_address\":\"inwhed\",\"netmask\":295145185,\"gateway\":\"qwuntob\"},{\"ip_address\":\"z\",\"netmask\":1704378858,\"gateway\":\"lw\"},{\"ip_address\":\"ydjufbnklbl\",\"netmask\":632583114,\"gateway\":\"gjwdab\"}]}").toObject(DropletNetworks.class);
        Assertions.assertEquals("rukizyhgsqt", model.getV4().get(0).getIpAddress());
        Assertions.assertEquals("s", model.getV4().get(0).getNetmask());
        Assertions.assertEquals("xqfpj", model.getV4().get(0).getGateway());
        Assertions.assertEquals(NetworkV4Type.PRIVATE, model.getV4().get(0).getType());
        Assertions.assertEquals("ac", model.getV6().get(0).getIpAddress());
        Assertions.assertEquals(487908700, model.getV6().get(0).getNetmask());
        Assertions.assertEquals("sqkptjqgkifm", model.getV6().get(0).getGateway());
    }

    @Test
    public void testSerialize() {
        DropletNetworks model = new DropletNetworks().setV4(Arrays.asList(new NetworkV4().setIpAddress("rukizyhgsqt").setNetmask("s").setGateway("xqfpj").setType(NetworkV4Type.PRIVATE), new NetworkV4().setIpAddress("weeiwdhdmnc").setNetmask("fzuscstun").setGateway("hxdfbkl").setType(NetworkV4Type.PUBLIC), new NetworkV4().setIpAddress("hgjsysmvxo").setNetmask("wxfkzsifcuvbdujg").setGateway("xvecbbwjt").setType(NetworkV4Type.PRIVATE), new NetworkV4().setIpAddress("izagbbgiar").setNetmask("ykpgd").setGateway("wabzr").setType(NetworkV4Type.PRIVATE))).setV6(Arrays.asList(new NetworkV6().setIpAddress("ac").setNetmask(487908700).setGateway("sqkptjqgkifm"), new NetworkV6().setIpAddress("inwhed").setNetmask(295145185).setGateway("qwuntob"), new NetworkV6().setIpAddress("z").setNetmask(1704378858).setGateway("lw"), new NetworkV6().setIpAddress("ydjufbnklbl").setNetmask(632583114).setGateway("gjwdab")));
        model = BinaryData.fromObject(model).toObject(DropletNetworks.class);
        Assertions.assertEquals("rukizyhgsqt", model.getV4().get(0).getIpAddress());
        Assertions.assertEquals("s", model.getV4().get(0).getNetmask());
        Assertions.assertEquals("xqfpj", model.getV4().get(0).getGateway());
        Assertions.assertEquals(NetworkV4Type.PRIVATE, model.getV4().get(0).getType());
        Assertions.assertEquals("ac", model.getV6().get(0).getIpAddress());
        Assertions.assertEquals(487908700, model.getV6().get(0).getNetmask());
        Assertions.assertEquals("sqkptjqgkifm", model.getV6().get(0).getGateway());
    }
}
