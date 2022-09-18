package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ClusterlintRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterlintRequestTests {
    @Test
    public void testDeserialize() {
        ClusterlintRequest model = BinaryData.fromString("{\"include_groups\":[\"mepnqvxgvohdbthh\",\"moevvude\"],\"include_checks\":[\"hgannvwxqhpjhub\",\"hxvzgayb\",\"rhhogalgxnw\",\"mzvztauebpa\"],\"exclude_groups\":[\"fcssanybzzghvd\"],\"exclude_checks\":[\"myjsvcdhly\",\"kh\"]}").toObject(ClusterlintRequest.class);
        Assertions.assertEquals("mepnqvxgvohdbthh", model.getIncludeGroups().get(0));
        Assertions.assertEquals("hgannvwxqhpjhub", model.getIncludeChecks().get(0));
        Assertions.assertEquals("fcssanybzzghvd", model.getExcludeGroups().get(0));
        Assertions.assertEquals("myjsvcdhly", model.getExcludeChecks().get(0));
    }

    @Test
    public void testSerialize() {
        ClusterlintRequest model = new ClusterlintRequest().setIncludeGroups(Arrays.asList("mepnqvxgvohdbthh", "moevvude")).setIncludeChecks(Arrays.asList("hgannvwxqhpjhub", "hxvzgayb", "rhhogalgxnw", "mzvztauebpa")).setExcludeGroups(Arrays.asList("fcssanybzzghvd")).setExcludeChecks(Arrays.asList("myjsvcdhly", "kh"));
        model = BinaryData.fromObject(model).toObject(ClusterlintRequest.class);
        Assertions.assertEquals("mepnqvxgvohdbthh", model.getIncludeGroups().get(0));
        Assertions.assertEquals("hgannvwxqhpjhub", model.getIncludeChecks().get(0));
        Assertions.assertEquals("fcssanybzzghvd", model.getExcludeGroups().get(0));
        Assertions.assertEquals("myjsvcdhly", model.getExcludeChecks().get(0));
    }
}
