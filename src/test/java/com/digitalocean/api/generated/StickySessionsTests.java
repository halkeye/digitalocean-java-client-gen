package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.StickySessions;
import com.digitalocean.api.models.StickySessionsType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class StickySessionsTests {
    @Test
    public void testDeserialize() {
        StickySessions model =
                BinaryData.fromString(
                                "{\"type\":\"none\",\"cookie_name\":\"gjzscueza\",\"cookie_ttl_seconds\":1749500004}")
                        .toObject(StickySessions.class);
        Assertions.assertEquals(StickySessionsType.NONE, model.getType());
        Assertions.assertEquals("gjzscueza", model.getCookieName());
        Assertions.assertEquals(1749500004, model.getCookieTtlSeconds());
    }

    @Test
    public void testSerialize() {
        StickySessions model =
                new StickySessions()
                        .setType(StickySessionsType.NONE)
                        .setCookieName("gjzscueza")
                        .setCookieTtlSeconds(1749500004);
        model = BinaryData.fromObject(model).toObject(StickySessions.class);
        Assertions.assertEquals(StickySessionsType.NONE, model.getType());
        Assertions.assertEquals("gjzscueza", model.getCookieName());
        Assertions.assertEquals(1749500004, model.getCookieTtlSeconds());
    }
}
