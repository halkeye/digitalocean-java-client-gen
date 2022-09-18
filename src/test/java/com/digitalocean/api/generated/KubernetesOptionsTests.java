package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.KubernetesOptions;
import com.digitalocean.api.models.KubernetesOptionsOptions;
import com.digitalocean.api.models.KubernetesRegion;
import com.digitalocean.api.models.KubernetesSize;
import com.digitalocean.api.models.KubernetesVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class KubernetesOptionsTests {
    @Test
    public void testDeserialize() {
        KubernetesOptions model = BinaryData.fromString("{\"options\":{\"regions\":[{\"name\":\"evrntfkn\",\"slug\":\"cycsyo\"},{\"name\":\"tkhfhfs\",\"slug\":\"vcsxrmhnmiz\"},{\"name\":\"prhqqwc\",\"slug\":\"lehhkplobzg\"},{\"name\":\"taksadzighmmt\",\"slug\":\"dvucfvvra\"}],\"versions\":[{\"slug\":\"rdeewl\",\"kubernetes_version\":\"xpcbwkdwjyjizn\",\"supported_features\":[]},{\"slug\":\"o\",\"kubernetes_version\":\"m\",\"supported_features\":[]},{\"slug\":\"spmcreihuftrnigh\",\"kubernetes_version\":\"nuwqxungro\",\"supported_features\":[]}],\"sizes\":[{\"name\":\"sxjwdy\",\"slug\":\"xmvzjow\"},{\"name\":\"geerclbl\",\"slug\":\"hpwachyeu\"}]}}").toObject(KubernetesOptions.class);
        Assertions.assertEquals("evrntfkn", model.getOptions().getRegions().get(0).getName());
        Assertions.assertEquals("cycsyo", model.getOptions().getRegions().get(0).getSlug());
        Assertions.assertEquals("rdeewl", model.getOptions().getVersions().get(0).getSlug());
        Assertions.assertEquals("xpcbwkdwjyjizn", model.getOptions().getVersions().get(0).getKubernetesVersion());
        Assertions.assertEquals("sxjwdy", model.getOptions().getSizes().get(0).getName());
        Assertions.assertEquals("xmvzjow", model.getOptions().getSizes().get(0).getSlug());
    }

    @Test
    public void testSerialize() {
        KubernetesOptions model = new KubernetesOptions().setOptions(new KubernetesOptionsOptions().setRegions(Arrays.asList(new KubernetesRegion().setName("evrntfkn").setSlug("cycsyo"), new KubernetesRegion().setName("tkhfhfs").setSlug("vcsxrmhnmiz"), new KubernetesRegion().setName("prhqqwc").setSlug("lehhkplobzg"), new KubernetesRegion().setName("taksadzighmmt").setSlug("dvucfvvra"))).setVersions(Arrays.asList(new KubernetesVersion().setSlug("rdeewl").setKubernetesVersion("xpcbwkdwjyjizn").setSupportedFeatures(Arrays.asList()), new KubernetesVersion().setSlug("o").setKubernetesVersion("m").setSupportedFeatures(Arrays.asList()), new KubernetesVersion().setSlug("spmcreihuftrnigh").setKubernetesVersion("nuwqxungro").setSupportedFeatures(Arrays.asList()))).setSizes(Arrays.asList(new KubernetesSize().setName("sxjwdy").setSlug("xmvzjow"), new KubernetesSize().setName("geerclbl").setSlug("hpwachyeu"))));
        model = BinaryData.fromObject(model).toObject(KubernetesOptions.class);
        Assertions.assertEquals("evrntfkn", model.getOptions().getRegions().get(0).getName());
        Assertions.assertEquals("cycsyo", model.getOptions().getRegions().get(0).getSlug());
        Assertions.assertEquals("rdeewl", model.getOptions().getVersions().get(0).getSlug());
        Assertions.assertEquals("xpcbwkdwjyjizn", model.getOptions().getVersions().get(0).getKubernetesVersion());
        Assertions.assertEquals("sxjwdy", model.getOptions().getSizes().get(0).getName());
        Assertions.assertEquals("xmvzjow", model.getOptions().getSizes().get(0).getSlug());
    }
}
