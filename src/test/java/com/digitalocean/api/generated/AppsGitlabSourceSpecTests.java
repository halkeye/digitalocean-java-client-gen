package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsGitlabSourceSpec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsGitlabSourceSpecTests {
    @Test
    public void testDeserialize() {
        AppsGitlabSourceSpec model =
                BinaryData.fromString("{\"branch\":\"zriykhy\",\"deploy_on_push\":true,\"repo\":\"jlb\"}")
                        .toObject(AppsGitlabSourceSpec.class);
        Assertions.assertEquals("zriykhy", model.getBranch());
        Assertions.assertEquals(true, model.isDeployOnPush());
        Assertions.assertEquals("jlb", model.getRepo());
    }

    @Test
    public void testSerialize() {
        AppsGitlabSourceSpec model =
                new AppsGitlabSourceSpec().setBranch("zriykhy").setDeployOnPush(true).setRepo("jlb");
        model = BinaryData.fromObject(model).toObject(AppsGitlabSourceSpec.class);
        Assertions.assertEquals("zriykhy", model.getBranch());
        Assertions.assertEquals(true, model.isDeployOnPush());
        Assertions.assertEquals("jlb", model.getRepo());
    }
}
