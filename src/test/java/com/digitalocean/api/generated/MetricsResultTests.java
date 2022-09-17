package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.MetricsResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MetricsResultTests {
    @Test
    public void testDeserialize() {
        MetricsResult model =
                BinaryData.fromString("{\"metric\":{\"lqgpwxtvceba\":\"qh\"},\"values\":[[]]}")
                        .toObject(MetricsResult.class);
        Assertions.assertEquals("qh", model.getMetric().get("lqgpwxtvceba"));
    }

    @Test
    public void testSerialize() {
        MetricsResult model =
                new MetricsResult().setMetric(mapOf("lqgpwxtvceba", "qh")).setValues(Arrays.asList(Arrays.asList()));
        model = BinaryData.fromObject(model).toObject(MetricsResult.class);
        Assertions.assertEquals("qh", model.getMetric().get("lqgpwxtvceba"));
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
