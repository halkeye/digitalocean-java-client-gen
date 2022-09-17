package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.OneClicksCreate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OneClicksCreateTests {
    @Test
    public void testDeserialize() {
        OneClicksCreate model =
                BinaryData.fromString(
                                "{\"addon_slugs\":[\"oqijgkdmbpaz\",\"obcu\"],\"cluster_uuid\":\"pdznrbtcqqjnqgl\"}")
                        .toObject(OneClicksCreate.class);
        Assertions.assertEquals("oqijgkdmbpaz", model.getAddonSlugs().get(0));
        Assertions.assertEquals("pdznrbtcqqjnqgl", model.getClusterUuid());
    }

    @Test
    public void testSerialize() {
        OneClicksCreate model =
                new OneClicksCreate()
                        .setAddonSlugs(Arrays.asList("oqijgkdmbpaz", "obcu"))
                        .setClusterUuid("pdznrbtcqqjnqgl");
        model = BinaryData.fromObject(model).toObject(OneClicksCreate.class);
        Assertions.assertEquals("oqijgkdmbpaz", model.getAddonSlugs().get(0));
        Assertions.assertEquals("pdznrbtcqqjnqgl", model.getClusterUuid());
    }
}
