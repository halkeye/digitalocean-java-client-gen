package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Dwt4B3ResponsesAllSizesContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Size;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Dwt4B3ResponsesAllSizesContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1Dwt4B3ResponsesAllSizesContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"sizes\":[{\"slug\":\"okbskkyporsy\",\"memory\":1954269151,\"vcpus\":1951033413,\"disk\":312128009,\"transfer\":62.39318,\"price_monthly\":63.910526,\"price_hourly\":37.518074,\"regions\":[\"lgfaphwuu\",\"wtsaynrtvj\"],\"available\":false,\"description\":\"reeoxvq\"},{\"slug\":\"mrnblihs\",\"memory\":674933903,\"vcpus\":1523081330,\"disk\":1240124586,\"transfer\":11.70538,\"price_monthly\":98.72064,\"price_hourly\":55.852104,\"regions\":[\"i\",\"zhpjgqz\"],\"available\":true,\"description\":\"aoawea\"}]}")
                        .toObject(Components1Dwt4B3ResponsesAllSizesContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("okbskkyporsy", model.getSizes().get(0).getSlug());
        Assertions.assertEquals(1954269151, model.getSizes().get(0).getMemory());
        Assertions.assertEquals(1951033413, model.getSizes().get(0).getVcpus());
        Assertions.assertEquals(312128009, model.getSizes().get(0).getDisk());
        Assertions.assertEquals(62.39318f, model.getSizes().get(0).getTransfer());
        Assertions.assertEquals(63.910526f, model.getSizes().get(0).getPriceMonthly());
        Assertions.assertEquals(37.518074f, model.getSizes().get(0).getPriceHourly());
        Assertions.assertEquals("lgfaphwuu", model.getSizes().get(0).getRegions().get(0));
        Assertions.assertEquals(false, model.getSizes().get(0).isAvailable());
        Assertions.assertEquals("reeoxvq", model.getSizes().get(0).getDescription());
    }

    @Test
    public void testSerialize() {
        Components1Dwt4B3ResponsesAllSizesContentApplicationJsonSchemaAllof0 model =
                new Components1Dwt4B3ResponsesAllSizesContentApplicationJsonSchemaAllof0()
                        .setSizes(
                                Arrays.asList(
                                        new Size()
                                                .setSlug("okbskkyporsy")
                                                .setMemory(1954269151)
                                                .setVcpus(1951033413)
                                                .setDisk(312128009)
                                                .setTransfer(62.39318f)
                                                .setPriceMonthly(63.910526f)
                                                .setPriceHourly(37.518074f)
                                                .setRegions(Arrays.asList("lgfaphwuu", "wtsaynrtvj"))
                                                .setAvailable(false)
                                                .setDescription("reeoxvq"),
                                        new Size()
                                                .setSlug("mrnblihs")
                                                .setMemory(674933903)
                                                .setVcpus(1523081330)
                                                .setDisk(1240124586)
                                                .setTransfer(11.70538f)
                                                .setPriceMonthly(98.72064f)
                                                .setPriceHourly(55.852104f)
                                                .setRegions(Arrays.asList("i", "zhpjgqz"))
                                                .setAvailable(true)
                                                .setDescription("aoawea")));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Dwt4B3ResponsesAllSizesContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("okbskkyporsy", model.getSizes().get(0).getSlug());
        Assertions.assertEquals(1954269151, model.getSizes().get(0).getMemory());
        Assertions.assertEquals(1951033413, model.getSizes().get(0).getVcpus());
        Assertions.assertEquals(312128009, model.getSizes().get(0).getDisk());
        Assertions.assertEquals(62.39318f, model.getSizes().get(0).getTransfer());
        Assertions.assertEquals(63.910526f, model.getSizes().get(0).getPriceMonthly());
        Assertions.assertEquals(37.518074f, model.getSizes().get(0).getPriceHourly());
        Assertions.assertEquals("lgfaphwuu", model.getSizes().get(0).getRegions().get(0));
        Assertions.assertEquals(false, model.getSizes().get(0).isAvailable());
        Assertions.assertEquals("reeoxvq", model.getSizes().get(0).getDescription());
    }
}
