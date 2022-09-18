package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The AppAlert model.
 */
@Fluent
public final class AppAlert {
    /*
     * The ID of the alert
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Name of component the alert belongs to
     */
    @JsonProperty(value = "component_name")
    private String componentName;

    /*
     * The spec property.
     */
    @JsonProperty(value = "spec")
    private AppAlertSpec spec;

    /*
     * Emails for alerts to go to
     */
    @JsonProperty(value = "emails")
    private List<String> emails;

    /*
     * Slack Webhooks to send alerts to
     */
    @JsonProperty(value = "slack_webhooks")
    private List<AppAlertSlackWebhook> slackWebhooks;

    /*
     * The phase property.
     */
    @JsonProperty(value = "phase")
    private AppAlertPhase phase;

    /*
     * The progress property.
     */
    @JsonProperty(value = "progress")
    private AppAlertProgress progress;

    /**
     * Get the id property: The ID of the alert.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the componentName property: Name of component the alert belongs to.
     * 
     * @return the componentName value.
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * Set the componentName property: Name of component the alert belongs to.
     * 
     * @param componentName the componentName value to set.
     * @return the AppAlert object itself.
     */
    public AppAlert setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * Get the spec property: The spec property.
     * 
     * @return the spec value.
     */
    public AppAlertSpec getSpec() {
        return this.spec;
    }

    /**
     * Set the spec property: The spec property.
     * 
     * @param spec the spec value to set.
     * @return the AppAlert object itself.
     */
    public AppAlert setSpec(AppAlertSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * Get the emails property: Emails for alerts to go to.
     * 
     * @return the emails value.
     */
    public List<String> getEmails() {
        return this.emails;
    }

    /**
     * Set the emails property: Emails for alerts to go to.
     * 
     * @param emails the emails value to set.
     * @return the AppAlert object itself.
     */
    public AppAlert setEmails(List<String> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Get the slackWebhooks property: Slack Webhooks to send alerts to.
     * 
     * @return the slackWebhooks value.
     */
    public List<AppAlertSlackWebhook> getSlackWebhooks() {
        return this.slackWebhooks;
    }

    /**
     * Set the slackWebhooks property: Slack Webhooks to send alerts to.
     * 
     * @param slackWebhooks the slackWebhooks value to set.
     * @return the AppAlert object itself.
     */
    public AppAlert setSlackWebhooks(List<AppAlertSlackWebhook> slackWebhooks) {
        this.slackWebhooks = slackWebhooks;
        return this;
    }

    /**
     * Get the phase property: The phase property.
     * 
     * @return the phase value.
     */
    public AppAlertPhase getPhase() {
        return this.phase;
    }

    /**
     * Set the phase property: The phase property.
     * 
     * @param phase the phase value to set.
     * @return the AppAlert object itself.
     */
    public AppAlert setPhase(AppAlertPhase phase) {
        this.phase = phase;
        return this;
    }

    /**
     * Get the progress property: The progress property.
     * 
     * @return the progress value.
     */
    public AppAlertProgress getProgress() {
        return this.progress;
    }

    /**
     * Set the progress property: The progress property.
     * 
     * @param progress the progress value to set.
     * @return the AppAlert object itself.
     */
    public AppAlert setProgress(AppAlertProgress progress) {
        this.progress = progress;
        return this;
    }
}
