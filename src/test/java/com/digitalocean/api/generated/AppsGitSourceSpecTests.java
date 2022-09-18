package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsGitSourceSpec;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsGitSourceSpecTests {
    @Test
    public void testDeserialize() {
        AppsGitSourceSpec model = BinaryData.fromString("{\"branch\":\"ndtic\",\"repo_clone_url\":\"pvz\"}").toObject(AppsGitSourceSpec.class);
        Assertions.assertEquals("ndtic", model.getBranch());
        Assertions.assertEquals("pvz", model.getRepoCloneUrl());
    }

    @Test
    public void testSerialize() {
        AppsGitSourceSpec model = new AppsGitSourceSpec().setBranch("ndtic").setRepoCloneUrl("pvz");
        model = BinaryData.fromObject(model).toObject(AppsGitSourceSpec.class);
        Assertions.assertEquals("ndtic", model.getBranch());
        Assertions.assertEquals("pvz", model.getRepoCloneUrl());
    }
}
