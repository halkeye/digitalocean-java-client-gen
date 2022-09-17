package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.KubernetesVersion;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class KubernetesVersionTests {
    @Test
    public void testDeserialize() {
        KubernetesVersion model =
                BinaryData.fromString(
                                "{\"slug\":\"rpqphkvyyzad\",\"kubernetes_version\":\"xylaypdtyzvelffo\",\"supported_features\":[\"iwhjdfrwpsshrmn\",\"cclpct\",\"ogkscxj\"]}")
                        .toObject(KubernetesVersion.class);
        Assertions.assertEquals("rpqphkvyyzad", model.getSlug());
        Assertions.assertEquals("xylaypdtyzvelffo", model.getKubernetesVersion());
        Assertions.assertEquals("iwhjdfrwpsshrmn", model.getSupportedFeatures().get(0));
    }

    @Test
    public void testSerialize() {
        KubernetesVersion model =
                new KubernetesVersion()
                        .setSlug("rpqphkvyyzad")
                        .setKubernetesVersion("xylaypdtyzvelffo")
                        .setSupportedFeatures(Arrays.asList("iwhjdfrwpsshrmn", "cclpct", "ogkscxj"));
        model = BinaryData.fromObject(model).toObject(KubernetesVersion.class);
        Assertions.assertEquals("rpqphkvyyzad", model.getSlug());
        Assertions.assertEquals("xylaypdtyzvelffo", model.getKubernetesVersion());
        Assertions.assertEquals("iwhjdfrwpsshrmn", model.getSupportedFeatures().get(0));
    }
}
