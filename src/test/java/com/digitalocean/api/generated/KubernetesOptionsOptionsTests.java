package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.KubernetesOptionsOptions;
import com.digitalocean.api.models.KubernetesRegion;
import com.digitalocean.api.models.KubernetesSize;
import com.digitalocean.api.models.KubernetesVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class KubernetesOptionsOptionsTests {
    @Test
    public void testDeserialize() {
        KubernetesOptionsOptions model = BinaryData.fromString("{\"regions\":[{\"name\":\"vwryvd\",\"slug\":\"kiikgpruccwmecbt\"},{\"name\":\"ytrtexegwmrq\",\"slug\":\"wi\"},{\"name\":\"vycfjncindi\",\"slug\":\"q\"}],\"versions\":[{\"slug\":\"juriarsbcl\",\"kubernetes_version\":\"nhzcknjxizb\",\"supported_features\":[\"ygzkztxfexwacyy\",\"mlxppdndzkfevuii\",\"iib\",\"kcj\"]},{\"slug\":\"qdcizeqqfopvnopm\",\"kubernetes_version\":\"ds\",\"supported_features\":[\"xqlyoazyfbkmvl\"]},{\"slug\":\"mxojzsvmaigbqk\",\"kubernetes_version\":\"yejthgeecb\",\"supported_features\":[\"gwlckihbamyqs\",\"kknpugzjw\"]}],\"sizes\":[{\"name\":\"rjixiujzkcsexg\",\"slug\":\"sw\"},{\"name\":\"ykkbxktxbbwl\",\"slug\":\"wzoknvu\"},{\"name\":\"d\",\"slug\":\"gbq\"}]}").toObject(KubernetesOptionsOptions.class);
        Assertions.assertEquals("vwryvd", model.getRegions().get(0).getName());
        Assertions.assertEquals("kiikgpruccwmecbt", model.getRegions().get(0).getSlug());
        Assertions.assertEquals("juriarsbcl", model.getVersions().get(0).getSlug());
        Assertions.assertEquals("nhzcknjxizb", model.getVersions().get(0).getKubernetesVersion());
        Assertions.assertEquals("ygzkztxfexwacyy", model.getVersions().get(0).getSupportedFeatures().get(0));
        Assertions.assertEquals("rjixiujzkcsexg", model.getSizes().get(0).getName());
        Assertions.assertEquals("sw", model.getSizes().get(0).getSlug());
    }

    @Test
    public void testSerialize() {
        KubernetesOptionsOptions model = new KubernetesOptionsOptions().setRegions(Arrays.asList(new KubernetesRegion().setName("vwryvd").setSlug("kiikgpruccwmecbt"), new KubernetesRegion().setName("ytrtexegwmrq").setSlug("wi"), new KubernetesRegion().setName("vycfjncindi").setSlug("q"))).setVersions(Arrays.asList(new KubernetesVersion().setSlug("juriarsbcl").setKubernetesVersion("nhzcknjxizb").setSupportedFeatures(Arrays.asList("ygzkztxfexwacyy", "mlxppdndzkfevuii", "iib", "kcj")), new KubernetesVersion().setSlug("qdcizeqqfopvnopm").setKubernetesVersion("ds").setSupportedFeatures(Arrays.asList("xqlyoazyfbkmvl")), new KubernetesVersion().setSlug("mxojzsvmaigbqk").setKubernetesVersion("yejthgeecb").setSupportedFeatures(Arrays.asList("gwlckihbamyqs", "kknpugzjw")))).setSizes(Arrays.asList(new KubernetesSize().setName("rjixiujzkcsexg").setSlug("sw"), new KubernetesSize().setName("ykkbxktxbbwl").setSlug("wzoknvu"), new KubernetesSize().setName("d").setSlug("gbq")));
        model = BinaryData.fromObject(model).toObject(KubernetesOptionsOptions.class);
        Assertions.assertEquals("vwryvd", model.getRegions().get(0).getName());
        Assertions.assertEquals("kiikgpruccwmecbt", model.getRegions().get(0).getSlug());
        Assertions.assertEquals("juriarsbcl", model.getVersions().get(0).getSlug());
        Assertions.assertEquals("nhzcknjxizb", model.getVersions().get(0).getKubernetesVersion());
        Assertions.assertEquals("ygzkztxfexwacyy", model.getVersions().get(0).getSupportedFeatures().get(0));
        Assertions.assertEquals("rjixiujzkcsexg", model.getSizes().get(0).getName());
        Assertions.assertEquals("sw", model.getSizes().get(0).getSlug());
    }
}
