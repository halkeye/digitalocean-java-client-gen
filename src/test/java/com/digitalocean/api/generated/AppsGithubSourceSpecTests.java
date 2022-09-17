package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsGithubSourceSpec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsGithubSourceSpecTests {
    @Test
    public void testDeserialize() {
        AppsGithubSourceSpec model =
                BinaryData.fromString("{\"branch\":\"qtmldgxo\",\"deploy_on_push\":false,\"repo\":\"clnpkci\"}")
                        .toObject(AppsGithubSourceSpec.class);
        Assertions.assertEquals("qtmldgxo", model.getBranch());
        Assertions.assertEquals(false, model.isDeployOnPush());
        Assertions.assertEquals("clnpkci", model.getRepo());
    }

    @Test
    public void testSerialize() {
        AppsGithubSourceSpec model =
                new AppsGithubSourceSpec().setBranch("qtmldgxo").setDeployOnPush(false).setRepo("clnpkci");
        model = BinaryData.fromObject(model).toObject(AppsGithubSourceSpec.class);
        Assertions.assertEquals("qtmldgxo", model.getBranch());
        Assertions.assertEquals(false, model.isDeployOnPush());
        Assertions.assertEquals("clnpkci", model.getRepo());
    }
}
