package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppAlertSlackWebhook model. */
@Fluent
public final class AppAlertSlackWebhook {
    /*
     * URL of the Slack webhook
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * Name of the Slack Webhook Channel
     */
    @JsonProperty(value = "channel")
    private String channel;

    /**
     * Get the url property: URL of the Slack webhook.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: URL of the Slack webhook.
     *
     * @param url the url value to set.
     * @return the AppAlertSlackWebhook object itself.
     */
    public AppAlertSlackWebhook setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the channel property: Name of the Slack Webhook Channel.
     *
     * @return the channel value.
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * Set the channel property: Name of the Slack Webhook Channel.
     *
     * @param channel the channel value to set.
     * @return the AppAlertSlackWebhook object itself.
     */
    public AppAlertSlackWebhook setChannel(String channel) {
        this.channel = channel;
        return this;
    }
}
