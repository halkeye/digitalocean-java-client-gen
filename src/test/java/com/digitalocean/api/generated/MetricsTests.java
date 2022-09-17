package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Metrics;
import com.digitalocean.api.models.MetricsData;
import com.digitalocean.api.models.MetricsResult;
import com.digitalocean.api.models.MetricsStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MetricsTests {
    @Test
    public void testDeserialize() {
        Metrics model =
                BinaryData.fromString(
                                "{\"data\":{\"result\":[{\"metric\":{},\"values\":[]},{\"metric\":{},\"values\":[]},{\"metric\":{},\"values\":[]}]},\"status\":\"success\"}")
                        .toObject(Metrics.class);
        Assertions.assertEquals(MetricsStatus.SUCCESS, model.getStatus());
    }

    @Test
    public void testSerialize() {
        Metrics model =
                new Metrics()
                        .setData(
                                new MetricsData()
                                        .setResult(
                                                Arrays.asList(
                                                        new MetricsResult()
                                                                .setMetric(mapOf())
                                                                .setValues(Arrays.asList()),
                                                        new MetricsResult()
                                                                .setMetric(mapOf())
                                                                .setValues(Arrays.asList()),
                                                        new MetricsResult()
                                                                .setMetric(mapOf())
                                                                .setValues(Arrays.asList()))))
                        .setStatus(MetricsStatus.SUCCESS);
        model = BinaryData.fromObject(model).toObject(Metrics.class);
        Assertions.assertEquals(MetricsStatus.SUCCESS, model.getStatus());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
