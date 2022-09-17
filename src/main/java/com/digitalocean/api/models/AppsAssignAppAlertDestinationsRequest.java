package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AppsAssignAppAlertDestinationsRequest model. */
@Fluent
public final class AppsAssignAppAlertDestinationsRequest {
    /*
     * The emails property.
     */
    @JsonProperty(value = "emails")
    private List<String> emails;

    /*
     * The slack_webhooks property.
     */
    @JsonProperty(value = "slack_webhooks")
    private List<AppAlertSlackWebhook> slackWebhooks;

    /**
     * Get the emails property: The emails property.
     *
     * @return the emails value.
     */
    public List<String> getEmails() {
        return this.emails;
    }

    /**
     * Set the emails property: The emails property.
     *
     * @param emails the emails value to set.
     * @return the AppsAssignAppAlertDestinationsRequest object itself.
     */
    public AppsAssignAppAlertDestinationsRequest setEmails(List<String> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Get the slackWebhooks property: The slack_webhooks property.
     *
     * @return the slackWebhooks value.
     */
    public List<AppAlertSlackWebhook> getSlackWebhooks() {
        return this.slackWebhooks;
    }

    /**
     * Set the slackWebhooks property: The slack_webhooks property.
     *
     * @param slackWebhooks the slackWebhooks value to set.
     * @return the AppsAssignAppAlertDestinationsRequest object itself.
     */
    public AppsAssignAppAlertDestinationsRequest setSlackWebhooks(List<AppAlertSlackWebhook> slackWebhooks) {
        this.slackWebhooks = slackWebhooks;
        return this;
    }
}
