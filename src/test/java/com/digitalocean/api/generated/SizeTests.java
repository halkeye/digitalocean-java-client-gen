package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Size;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SizeTests {
    @Test
    public void testDeserialize() {
        Size model =
                BinaryData.fromString(
                                "{\"slug\":\"jpewpyjlfx\",\"memory\":34873333,\"vcpus\":1857968528,\"disk\":1111869311,\"transfer\":25.711292,\"price_monthly\":80.83503,\"price_hourly\":63.810665,\"regions\":[\"euqxbpiatwfa\"],\"available\":false,\"description\":\"egqdtadrakgd\"}")
                        .toObject(Size.class);
        Assertions.assertEquals("jpewpyjlfx", model.getSlug());
        Assertions.assertEquals(34873333, model.getMemory());
        Assertions.assertEquals(1857968528, model.getVcpus());
        Assertions.assertEquals(1111869311, model.getDisk());
        Assertions.assertEquals(25.711292f, model.getTransfer());
        Assertions.assertEquals(80.83503f, model.getPriceMonthly());
        Assertions.assertEquals(63.810665f, model.getPriceHourly());
        Assertions.assertEquals("euqxbpiatwfa", model.getRegions().get(0));
        Assertions.assertEquals(false, model.isAvailable());
        Assertions.assertEquals("egqdtadrakgd", model.getDescription());
    }

    @Test
    public void testSerialize() {
        Size model =
                new Size()
                        .setSlug("jpewpyjlfx")
                        .setMemory(34873333)
                        .setVcpus(1857968528)
                        .setDisk(1111869311)
                        .setTransfer(25.711292f)
                        .setPriceMonthly(80.83503f)
                        .setPriceHourly(63.810665f)
                        .setRegions(Arrays.asList("euqxbpiatwfa"))
                        .setAvailable(false)
                        .setDescription("egqdtadrakgd");
        model = BinaryData.fromObject(model).toObject(Size.class);
        Assertions.assertEquals("jpewpyjlfx", model.getSlug());
        Assertions.assertEquals(34873333, model.getMemory());
        Assertions.assertEquals(1857968528, model.getVcpus());
        Assertions.assertEquals(1111869311, model.getDisk());
        Assertions.assertEquals(25.711292f, model.getTransfer());
        Assertions.assertEquals(80.83503f, model.getPriceMonthly());
        Assertions.assertEquals(63.810665f, model.getPriceHourly());
        Assertions.assertEquals("euqxbpiatwfa", model.getRegions().get(0));
        Assertions.assertEquals(false, model.isAvailable());
        Assertions.assertEquals("egqdtadrakgd", model.getDescription());
    }
}
