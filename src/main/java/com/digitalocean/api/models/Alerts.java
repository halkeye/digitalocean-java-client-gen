package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Alerts model. */
@Fluent
public final class Alerts {
    /*
     * An email to notify on an alert trigger.
     */
    @JsonProperty(value = "email", required = true)
    private List<String> email;

    /*
     * Slack integration details.
     */
    @JsonProperty(value = "slack", required = true)
    private List<SlackDetails> slack;

    /**
     * Get the email property: An email to notify on an alert trigger.
     *
     * @return the email value.
     */
    public List<String> getEmail() {
        return this.email;
    }

    /**
     * Set the email property: An email to notify on an alert trigger.
     *
     * @param email the email value to set.
     * @return the Alerts object itself.
     */
    public Alerts setEmail(List<String> email) {
        this.email = email;
        return this;
    }

    /**
     * Get the slack property: Slack integration details.
     *
     * @return the slack value.
     */
    public List<SlackDetails> getSlack() {
        return this.slack;
    }

    /**
     * Set the slack property: Slack integration details.
     *
     * @param slack the slack value to set.
     * @return the Alerts object itself.
     */
    public Alerts setSlack(List<SlackDetails> slack) {
        this.slack = slack;
        return this;
    }
}
