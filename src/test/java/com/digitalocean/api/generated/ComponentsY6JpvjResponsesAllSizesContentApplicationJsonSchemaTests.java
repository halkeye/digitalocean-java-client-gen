package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Dwt4B3ResponsesAllSizesContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.ComponentsY6JpvjResponsesAllSizesContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Size;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsY6JpvjResponsesAllSizesContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsY6JpvjResponsesAllSizesContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":184682673},\"sizes\":[{\"slug\":\"ytxnxrqx\",\"memory\":1257942619,\"vcpus\":524714647,\"disk\":1041229723,\"transfer\":81.11186,\"price_monthly\":92.17775,\"price_hourly\":67.804276,\"regions\":[\"fvkhbjhmv\"],\"available\":false,\"description\":\"xsdhweignybffq\"},{\"slug\":\"wwynepkt\",\"memory\":750201546,\"vcpus\":1108965700,\"disk\":997150616,\"transfer\":84.619865,\"price_monthly\":32.005383,\"price_hourly\":89.50867,\"regions\":[\"ysebjij\"],\"available\":true,\"description\":\"pxnikouoxf\"}]}").toObject(ComponentsY6JpvjResponsesAllSizesContentApplicationJsonSchema.class);
        Assertions.assertEquals("ytxnxrqx", model.getSizes().get(0).getSlug());
        Assertions.assertEquals(1257942619, model.getSizes().get(0).getMemory());
        Assertions.assertEquals(524714647, model.getSizes().get(0).getVcpus());
        Assertions.assertEquals(1041229723, model.getSizes().get(0).getDisk());
        Assertions.assertEquals(81.11186f, model.getSizes().get(0).getTransfer());
        Assertions.assertEquals(92.17775f, model.getSizes().get(0).getPriceMonthly());
        Assertions.assertEquals(67.804276f, model.getSizes().get(0).getPriceHourly());
        Assertions.assertEquals("fvkhbjhmv", model.getSizes().get(0).getRegions().get(0));
        Assertions.assertEquals(false, model.getSizes().get(0).isAvailable());
        Assertions.assertEquals("xsdhweignybffq", model.getSizes().get(0).getDescription());
        Assertions.assertEquals(184682673, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsY6JpvjResponsesAllSizesContentApplicationJsonSchema model = new ComponentsY6JpvjResponsesAllSizesContentApplicationJsonSchema().setSizes(Arrays.asList(new Size().setSlug("ytxnxrqx").setMemory(1257942619).setVcpus(524714647).setDisk(1041229723).setTransfer(81.11186f).setPriceMonthly(92.17775f).setPriceHourly(67.804276f).setRegions(Arrays.asList("fvkhbjhmv")).setAvailable(false).setDescription("xsdhweignybffq"), new Size().setSlug("wwynepkt").setMemory(750201546).setVcpus(1108965700).setDisk(997150616).setTransfer(84.619865f).setPriceMonthly(32.005383f).setPriceHourly(89.50867f).setRegions(Arrays.asList("ysebjij")).setAvailable(true).setDescription("pxnikouoxf"))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(184682673));
        model = BinaryData.fromObject(model).toObject(ComponentsY6JpvjResponsesAllSizesContentApplicationJsonSchema.class);
        Assertions.assertEquals("ytxnxrqx", model.getSizes().get(0).getSlug());
        Assertions.assertEquals(1257942619, model.getSizes().get(0).getMemory());
        Assertions.assertEquals(524714647, model.getSizes().get(0).getVcpus());
        Assertions.assertEquals(1041229723, model.getSizes().get(0).getDisk());
        Assertions.assertEquals(81.11186f, model.getSizes().get(0).getTransfer());
        Assertions.assertEquals(92.17775f, model.getSizes().get(0).getPriceMonthly());
        Assertions.assertEquals(67.804276f, model.getSizes().get(0).getPriceHourly());
        Assertions.assertEquals("fvkhbjhmv", model.getSizes().get(0).getRegions().get(0));
        Assertions.assertEquals(false, model.getSizes().get(0).isAvailable());
        Assertions.assertEquals("xsdhweignybffq", model.getSizes().get(0).getDescription());
        Assertions.assertEquals(184682673, model.getMeta().getTotal());
    }
}
