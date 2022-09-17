package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Dkf1JdResponsesAvailableUpgradesContentApplicationJsonSchema;
import com.digitalocean.api.models.KubernetesVersion;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Dkf1JdResponsesAvailableUpgradesContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components1Dkf1JdResponsesAvailableUpgradesContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"available_upgrade_versions\":[{\"slug\":\"w\",\"kubernetes_version\":\"lkhczygpmgfjculo\",\"supported_features\":[\"ylxdevfiyymotuzb\",\"bwjmtftcveln\",\"rupkqnstpaqpi\",\"j\"]},{\"slug\":\"vswmehfxrtt\",\"kubernetes_version\":\"msennqfabqcama\",\"supported_features\":[\"tcxsfmbzdxmsyn\",\"kdnnyufxuzms\"]},{\"slug\":\"yqrbrnx\",\"kubernetes_version\":\"tlxfikjkxaravw\",\"supported_features\":[\"snjeglhtrxbozpcj\",\"nwjzbqblxrnwvdsv\",\"qizawwsds\"]},{\"slug\":\"gfhjxsawoo\",\"kubernetes_version\":\"ffhx\",\"supported_features\":[\"mwzrdqyoybmr\",\"otoc\",\"nzdaiovr\"]}]}")
                        .toObject(Components1Dkf1JdResponsesAvailableUpgradesContentApplicationJsonSchema.class);
        Assertions.assertEquals("w", model.getAvailableUpgradeVersions().get(0).getSlug());
        Assertions.assertEquals("lkhczygpmgfjculo", model.getAvailableUpgradeVersions().get(0).getKubernetesVersion());
        Assertions.assertEquals(
                "ylxdevfiyymotuzb", model.getAvailableUpgradeVersions().get(0).getSupportedFeatures().get(0));
    }

    @Test
    public void testSerialize() {
        Components1Dkf1JdResponsesAvailableUpgradesContentApplicationJsonSchema model =
                new Components1Dkf1JdResponsesAvailableUpgradesContentApplicationJsonSchema()
                        .setAvailableUpgradeVersions(
                                Arrays.asList(
                                        new KubernetesVersion()
                                                .setSlug("w")
                                                .setKubernetesVersion("lkhczygpmgfjculo")
                                                .setSupportedFeatures(
                                                        Arrays.asList(
                                                                "ylxdevfiyymotuzb",
                                                                "bwjmtftcveln",
                                                                "rupkqnstpaqpi",
                                                                "j")),
                                        new KubernetesVersion()
                                                .setSlug("vswmehfxrtt")
                                                .setKubernetesVersion("msennqfabqcama")
                                                .setSupportedFeatures(Arrays.asList("tcxsfmbzdxmsyn", "kdnnyufxuzms")),
                                        new KubernetesVersion()
                                                .setSlug("yqrbrnx")
                                                .setKubernetesVersion("tlxfikjkxaravw")
                                                .setSupportedFeatures(
                                                        Arrays.asList(
                                                                "snjeglhtrxbozpcj", "nwjzbqblxrnwvdsv", "qizawwsds")),
                                        new KubernetesVersion()
                                                .setSlug("gfhjxsawoo")
                                                .setKubernetesVersion("ffhx")
                                                .setSupportedFeatures(
                                                        Arrays.asList("mwzrdqyoybmr", "otoc", "nzdaiovr"))));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components1Dkf1JdResponsesAvailableUpgradesContentApplicationJsonSchema.class);
        Assertions.assertEquals("w", model.getAvailableUpgradeVersions().get(0).getSlug());
        Assertions.assertEquals("lkhczygpmgfjculo", model.getAvailableUpgradeVersions().get(0).getKubernetesVersion());
        Assertions.assertEquals(
                "ylxdevfiyymotuzb", model.getAvailableUpgradeVersions().get(0).getSupportedFeatures().get(0));
    }
}
