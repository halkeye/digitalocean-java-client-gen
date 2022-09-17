package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsListRegionsResponse;
import com.digitalocean.api.models.AppsRegion;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public final class AppsListRegionsResponseTests {
    @Test
    public void testDeserialize() {
        AppsListRegionsResponse model =
                BinaryData.fromString(
                                "{\"regions\":[{\"continent\":\"mrutznabaobnsluj\",\"data_centers\":[\"tymkmvguihywart\",\"pphkixkykxds\",\"j\",\"emmucfxh\"],\"default\":false,\"disabled\":true,\"flag\":\"mymyincqlhri\",\"label\":\"sl\",\"reason\":\"iiovgqcgxu\",\"slug\":\"qkctotiowlxte\"},{\"continent\":\"ptjgwdt\",\"data_centers\":[\"ranblwphqlkccu\",\"gygqwah\",\"iul\",\"gniiprglvaw\"],\"default\":false,\"disabled\":false,\"flag\":\"ypivlsbb\",\"label\":\"mcub\",\"reason\":\"ifoxxkubvphav\",\"slug\":\"h\"}]}")
                        .toObject(AppsListRegionsResponse.class);
    }

    @Test
    public void testSerialize() {
        AppsListRegionsResponse model =
                new AppsListRegionsResponse().setRegions(Arrays.asList(new AppsRegion(), new AppsRegion()));
        model = BinaryData.fromObject(model).toObject(AppsListRegionsResponse.class);
    }
}
