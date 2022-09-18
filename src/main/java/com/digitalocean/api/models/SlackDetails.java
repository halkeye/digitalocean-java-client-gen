package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The SlackDetails model.
 */
@Fluent
public final class SlackDetails {
    /*
     * Slack channel to notify of an alert trigger.
     */
    @JsonProperty(value = "channel", required = true)
    private String channel;

    /*
     * Slack Webhook URL.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /**
     * Get the channel property: Slack channel to notify of an alert trigger.
     * 
     * @return the channel value.
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * Set the channel property: Slack channel to notify of an alert trigger.
     * 
     * @param channel the channel value to set.
     * @return the SlackDetails object itself.
     */
    public SlackDetails setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Get the url property: Slack Webhook URL.
     * 
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: Slack Webhook URL.
     * 
     * @param url the url value to set.
     * @return the SlackDetails object itself.
     */
    public SlackDetails setUrl(String url) {
        this.url = url;
        return this;
    }
}
