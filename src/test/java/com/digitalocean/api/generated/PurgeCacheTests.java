package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.PurgeCache;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PurgeCacheTests {
    @Test
    public void testDeserialize() {
        PurgeCache model =
                BinaryData.fromString("{\"files\":[\"aswugyxpqitw\",\"ialwv\",\"kbuhzaca\"]}")
                        .toObject(PurgeCache.class);
        Assertions.assertEquals("aswugyxpqitw", model.getFiles().get(0));
    }

    @Test
    public void testSerialize() {
        PurgeCache model = new PurgeCache().setFiles(Arrays.asList("aswugyxpqitw", "ialwv", "kbuhzaca"));
        model = BinaryData.fromObject(model).toObject(PurgeCache.class);
        Assertions.assertEquals("aswugyxpqitw", model.getFiles().get(0));
    }
}
