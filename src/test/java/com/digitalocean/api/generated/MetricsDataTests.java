package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.MetricsData;
import com.digitalocean.api.models.MetricsResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MetricsDataTests {
    @Test
    public void testDeserialize() {
        MetricsData model =
                BinaryData.fromString(
                                "{\"result\":[{\"metric\":{\"ebznbznxsulout\":\"gckycjp\"},\"values\":[[],[],[]]},{\"metric\":{\"cdmwk\":\"oqohgp\",\"sl\":\"upf\"},\"values\":[[]]},{\"metric\":{\"iunyevdyzdsytc\":\"a\"},\"values\":[[],[],[],[]]},{\"metric\":{\"cgsfcmvh\":\"mwuynfx\",\"atvyrkljqkqws\":\"drp\",\"bypnkteiidlbov\":\"jtvjkowggxawwd\",\"cnerekyjul\":\"bclprgeganihk\"},\"values\":[[],[]]}]}")
                        .toObject(MetricsData.class);
        Assertions.assertEquals("gckycjp", model.getResult().get(0).getMetric().get("ebznbznxsulout"));
    }

    @Test
    public void testSerialize() {
        MetricsData model =
                new MetricsData()
                        .setResult(
                                Arrays.asList(
                                        new MetricsResult()
                                                .setMetric(mapOf("ebznbznxsulout", "gckycjp"))
                                                .setValues(
                                                        Arrays.asList(
                                                                Arrays.asList(), Arrays.asList(), Arrays.asList())),
                                        new MetricsResult()
                                                .setMetric(mapOf("cdmwk", "oqohgp", "sl", "upf"))
                                                .setValues(Arrays.asList(Arrays.asList())),
                                        new MetricsResult()
                                                .setMetric(mapOf("iunyevdyzdsytc", "a"))
                                                .setValues(
                                                        Arrays.asList(
                                                                Arrays.asList(),
                                                                Arrays.asList(),
                                                                Arrays.asList(),
                                                                Arrays.asList())),
                                        new MetricsResult()
                                                .setMetric(
                                                        mapOf(
                                                                "cgsfcmvh",
                                                                "mwuynfx",
                                                                "atvyrkljqkqws",
                                                                "drp",
                                                                "bypnkteiidlbov",
                                                                "jtvjkowggxawwd",
                                                                "cnerekyjul",
                                                                "bclprgeganihk"))
                                                .setValues(Arrays.asList(Arrays.asList(), Arrays.asList()))));
        model = BinaryData.fromObject(model).toObject(MetricsData.class);
        Assertions.assertEquals("gckycjp", model.getResult().get(0).getMetric().get("ebznbznxsulout"));
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
