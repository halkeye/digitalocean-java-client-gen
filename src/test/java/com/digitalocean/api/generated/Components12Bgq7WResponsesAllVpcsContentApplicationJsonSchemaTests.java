package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components12Bgq7WResponsesAllVpcsContentApplicationJsonSchema;
import com.digitalocean.api.models.Components1Mgw0OqResponsesAllVpcsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Vpc;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components12Bgq7WResponsesAllVpcsContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components12Bgq7WResponsesAllVpcsContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":2011761513},\"vpcs\":[{\"region\":\"utbuvedwu\",\"ip_range\":\"bmenxcqs\",\"default\":true,\"urn\":\"kcrudekkbnjre\",\"created_at\":\"2021-02-18T22:16:20Z\",\"name\":\"edeuenthshnf\",\"description\":\"gpgpkkhpjnglaqlm\"},{\"region\":\"nmtrd\",\"ip_range\":\"xiw\",\"default\":true,\"urn\":\"vfpnrzikvoxloeoh\",\"created_at\":\"2021-07-14T13:19:21Z\",\"name\":\"xdifbwblijhp\",\"description\":\"kxgoyxontb\"},{\"region\":\"qrxrosuqrrldxfu\",\"ip_range\":\"fewxatktwjrppi\",\"default\":true,\"urn\":\"velrmdcizhvk\",\"created_at\":\"2021-01-21T22:12:23Z\",\"name\":\"klwjpz\",\"description\":\"ncw\"},{\"region\":\"mpyeyzolbf\",\"ip_range\":\"lytfxudui\",\"default\":true,\"urn\":\"swkq\",\"created_at\":\"2020-12-22T15:07:02Z\",\"name\":\"snliyzn\",\"description\":\"uqzgpdglkfv\"}]}").toObject(Components12Bgq7WResponsesAllVpcsContentApplicationJsonSchema.class);
        Assertions.assertEquals("edeuenthshnf", model.getVpcs().get(0).getName());
        Assertions.assertEquals("gpgpkkhpjnglaqlm", model.getVpcs().get(0).getDescription());
        Assertions.assertEquals("utbuvedwu", model.getVpcs().get(0).getRegion());
        Assertions.assertEquals("bmenxcqs", model.getVpcs().get(0).getIpRange());
        Assertions.assertEquals(true, model.getVpcs().get(0).isDefaultProperty());
        Assertions.assertEquals("kcrudekkbnjre", model.getVpcs().get(0).getUrn());
        Assertions.assertEquals(2011761513, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components12Bgq7WResponsesAllVpcsContentApplicationJsonSchema model = new Components12Bgq7WResponsesAllVpcsContentApplicationJsonSchema().setVpcs(Arrays.asList(new Vpc().setName("edeuenthshnf").setDescription("gpgpkkhpjnglaqlm").setRegion("utbuvedwu").setIpRange("bmenxcqs").setDefaultProperty(true).setUrn("kcrudekkbnjre"), new Vpc().setName("xdifbwblijhp").setDescription("kxgoyxontb").setRegion("nmtrd").setIpRange("xiw").setDefaultProperty(true).setUrn("vfpnrzikvoxloeoh"), new Vpc().setName("klwjpz").setDescription("ncw").setRegion("qrxrosuqrrldxfu").setIpRange("fewxatktwjrppi").setDefaultProperty(true).setUrn("velrmdcizhvk"), new Vpc().setName("snliyzn").setDescription("uqzgpdglkfv").setRegion("mpyeyzolbf").setIpRange("lytfxudui").setDefaultProperty(true).setUrn("swkq"))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(2011761513));
        model = BinaryData.fromObject(model).toObject(Components12Bgq7WResponsesAllVpcsContentApplicationJsonSchema.class);
        Assertions.assertEquals("edeuenthshnf", model.getVpcs().get(0).getName());
        Assertions.assertEquals("gpgpkkhpjnglaqlm", model.getVpcs().get(0).getDescription());
        Assertions.assertEquals("utbuvedwu", model.getVpcs().get(0).getRegion());
        Assertions.assertEquals("bmenxcqs", model.getVpcs().get(0).getIpRange());
        Assertions.assertEquals(true, model.getVpcs().get(0).isDefaultProperty());
        Assertions.assertEquals("kcrudekkbnjre", model.getVpcs().get(0).getUrn());
        Assertions.assertEquals(2011761513, model.getMeta().getTotal());
    }
}
