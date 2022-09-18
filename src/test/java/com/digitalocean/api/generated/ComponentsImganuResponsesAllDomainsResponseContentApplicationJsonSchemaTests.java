package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsImganuResponsesAllDomainsResponseContentApplicationJsonSchema;
import com.digitalocean.api.models.ComponentsXsqptcResponsesAllDomainsResponseContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Domain;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsImganuResponsesAllDomainsResponseContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsImganuResponsesAllDomainsResponseContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":1543301093},\"domains\":[{\"name\":\"j\",\"ip_address\":\"yqwdqi\",\"ttl\":592679645,\"zone_file\":\"ginz\"},{\"name\":\"lujkhn\",\"ip_address\":\"mrnkfmkhcqtwml\",\"ttl\":1462784871,\"zone_file\":\"qtqea\"},{\"name\":\"e\",\"ip_address\":\"r\",\"ttl\":576727956,\"zone_file\":\"kddx\"},{\"name\":\"hhkvguavtptbk\",\"ip_address\":\"kqynspgbvo\",\"ttl\":46244419,\"zone_file\":\"kwvdxa\"}]}").toObject(ComponentsImganuResponsesAllDomainsResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("j", model.getDomains().get(0).getName());
        Assertions.assertEquals("yqwdqi", model.getDomains().get(0).getIpAddress());
        Assertions.assertEquals(1543301093, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsImganuResponsesAllDomainsResponseContentApplicationJsonSchema model = new ComponentsImganuResponsesAllDomainsResponseContentApplicationJsonSchema().setDomains(Arrays.asList(new Domain().setName("j").setIpAddress("yqwdqi"), new Domain().setName("lujkhn").setIpAddress("mrnkfmkhcqtwml"), new Domain().setName("e").setIpAddress("r"), new Domain().setName("hhkvguavtptbk").setIpAddress("kqynspgbvo"))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(1543301093));
        model = BinaryData.fromObject(model).toObject(ComponentsImganuResponsesAllDomainsResponseContentApplicationJsonSchema.class);
        Assertions.assertEquals("j", model.getDomains().get(0).getName());
        Assertions.assertEquals("yqwdqi", model.getDomains().get(0).getIpAddress());
        Assertions.assertEquals(1543301093, model.getMeta().getTotal());
    }
}
