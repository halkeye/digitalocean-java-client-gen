package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppAlertSlackWebhook;
import com.digitalocean.api.models.AppsAssignAppAlertDestinationsRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsAssignAppAlertDestinationsRequestTests {
    @Test
    public void testDeserialize() {
        AppsAssignAppAlertDestinationsRequest model = BinaryData.fromString("{\"emails\":[\"exjddvjsaqwot\",\"mwllcolsrsxapt\",\"f\"],\"slack_webhooks\":[{\"url\":\"gjokjljnhvlqjbek\",\"channel\":\"eksnbksdqhjvyk\"},{\"url\":\"eslk\",\"channel\":\"ustcpoq\"},{\"url\":\"vnwqjwgo\",\"channel\":\"lejjjkxy\"},{\"url\":\"fdb\",\"channel\":\"bztensvkzykjtj\"}]}").toObject(AppsAssignAppAlertDestinationsRequest.class);
        Assertions.assertEquals("exjddvjsaqwot", model.getEmails().get(0));
        Assertions.assertEquals("gjokjljnhvlqjbek", model.getSlackWebhooks().get(0).getUrl());
        Assertions.assertEquals("eksnbksdqhjvyk", model.getSlackWebhooks().get(0).getChannel());
    }

    @Test
    public void testSerialize() {
        AppsAssignAppAlertDestinationsRequest model = new AppsAssignAppAlertDestinationsRequest().setEmails(Arrays.asList("exjddvjsaqwot", "mwllcolsrsxapt", "f")).setSlackWebhooks(Arrays.asList(new AppAlertSlackWebhook().setUrl("gjokjljnhvlqjbek").setChannel("eksnbksdqhjvyk"), new AppAlertSlackWebhook().setUrl("eslk").setChannel("ustcpoq"), new AppAlertSlackWebhook().setUrl("vnwqjwgo").setChannel("lejjjkxy"), new AppAlertSlackWebhook().setUrl("fdb").setChannel("bztensvkzykjtj")));
        model = BinaryData.fromObject(model).toObject(AppsAssignAppAlertDestinationsRequest.class);
        Assertions.assertEquals("exjddvjsaqwot", model.getEmails().get(0));
        Assertions.assertEquals("gjokjljnhvlqjbek", model.getSlackWebhooks().get(0).getUrl());
        Assertions.assertEquals("eksnbksdqhjvyk", model.getSlackWebhooks().get(0).getChannel());
    }
}
