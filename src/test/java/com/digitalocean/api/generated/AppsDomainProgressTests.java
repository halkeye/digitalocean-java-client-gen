package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsDomainProgress;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public final class AppsDomainProgressTests {
    @Test
    public void testDeserialize() {
        AppsDomainProgress model = BinaryData.fromString("{\"steps\":[]}").toObject(AppsDomainProgress.class);
    }

    @Test
    public void testSerialize() {
        AppsDomainProgress model = new AppsDomainProgress().setSteps(Arrays.asList());
        model = BinaryData.fromObject(model).toObject(AppsDomainProgress.class);
    }
}
