package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsDeploymentStaticSite;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsDeploymentStaticSiteTests {
    @Test
    public void testDeserialize() {
        AppsDeploymentStaticSite model = BinaryData.fromString("{\"name\":\"wnhhtqlgehgppip\",\"source_commit_hash\":\"hpfeoajvgcxtxjc\"}").toObject(AppsDeploymentStaticSite.class);
        Assertions.assertEquals("wnhhtqlgehgppip", model.getName());
        Assertions.assertEquals("hpfeoajvgcxtxjc", model.getSourceCommitHash());
    }

    @Test
    public void testSerialize() {
        AppsDeploymentStaticSite model = new AppsDeploymentStaticSite().setName("wnhhtqlgehgppip").setSourceCommitHash("hpfeoajvgcxtxjc");
        model = BinaryData.fromObject(model).toObject(AppsDeploymentStaticSite.class);
        Assertions.assertEquals("wnhhtqlgehgppip", model.getName());
        Assertions.assertEquals("hpfeoajvgcxtxjc", model.getSourceCommitHash());
    }
}
