package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppLogDestinationDatadogSpec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppLogDestinationDatadogSpecTests {
    @Test
    public void testDeserialize() {
        AppLogDestinationDatadogSpec model =
                BinaryData.fromString("{\"endpoint\":\"vhxnk\",\"api_key\":\"mtk\"}")
                        .toObject(AppLogDestinationDatadogSpec.class);
        Assertions.assertEquals("vhxnk", model.getEndpoint());
        Assertions.assertEquals("mtk", model.getApiKey());
    }

    @Test
    public void testSerialize() {
        AppLogDestinationDatadogSpec model = new AppLogDestinationDatadogSpec().setEndpoint("vhxnk").setApiKey("mtk");
        model = BinaryData.fromObject(model).toObject(AppLogDestinationDatadogSpec.class);
        Assertions.assertEquals("vhxnk", model.getEndpoint());
        Assertions.assertEquals("mtk", model.getApiKey());
    }
}
