package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsGetLogsResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsGetLogsResponseTests {
    @Test
    public void testDeserialize() {
        AppsGetLogsResponse model =
                BinaryData.fromString("{\"historic_urls\":[\"c\",\"rkolawjm\"],\"live_url\":\"mwrokcdxfzzzwyja\"}")
                        .toObject(AppsGetLogsResponse.class);
        Assertions.assertEquals("c", model.getHistoricUrls().get(0));
        Assertions.assertEquals("mwrokcdxfzzzwyja", model.getLiveUrl());
    }

    @Test
    public void testSerialize() {
        AppsGetLogsResponse model =
                new AppsGetLogsResponse()
                        .setHistoricUrls(Arrays.asList("c", "rkolawjm"))
                        .setLiveUrl("mwrokcdxfzzzwyja");
        model = BinaryData.fromObject(model).toObject(AppsGetLogsResponse.class);
        Assertions.assertEquals("c", model.getHistoricUrls().get(0));
        Assertions.assertEquals("mwrokcdxfzzzwyja", model.getLiveUrl());
    }
}
