package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppComponentInstanceBase;
import com.digitalocean.api.models.AppComponentInstanceBaseInstanceSizeSlug;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppComponentInstanceBaseTests {
    @Test
    public void testDeserialize() {
        AppComponentInstanceBase model =
                BinaryData.fromString(
                                "{\"instance_count\":3555735761282593799,\"instance_size_slug\":\"professional-1l\"}")
                        .toObject(AppComponentInstanceBase.class);
        Assertions.assertEquals(3555735761282593799L, model.getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL1L, model.getInstanceSizeSlug());
    }

    @Test
    public void testSerialize() {
        AppComponentInstanceBase model =
                new AppComponentInstanceBase()
                        .setInstanceCount(3555735761282593799L)
                        .setInstanceSizeSlug(AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL1L);
        model = BinaryData.fromObject(model).toObject(AppComponentInstanceBase.class);
        Assertions.assertEquals(3555735761282593799L, model.getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL1L, model.getInstanceSizeSlug());
    }
}
