package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AppsGetLogsResponse model. */
@Fluent
public final class AppsGetLogsResponse {
    /*
     * A list of URLs to archived log files
     */
    @JsonProperty(value = "historic_urls")
    private List<String> historicUrls;

    /*
     * A URL of the real-time live logs. This URL may use either the `https://` or `wss://` protocols and will keep
     * pushing live logs as they become available.
     */
    @JsonProperty(value = "live_url")
    private String liveUrl;

    /**
     * Get the historicUrls property: A list of URLs to archived log files.
     *
     * @return the historicUrls value.
     */
    public List<String> getHistoricUrls() {
        return this.historicUrls;
    }

    /**
     * Set the historicUrls property: A list of URLs to archived log files.
     *
     * @param historicUrls the historicUrls value to set.
     * @return the AppsGetLogsResponse object itself.
     */
    public AppsGetLogsResponse setHistoricUrls(List<String> historicUrls) {
        this.historicUrls = historicUrls;
        return this;
    }

    /**
     * Get the liveUrl property: A URL of the real-time live logs. This URL may use either the `https://` or `wss://`
     * protocols and will keep pushing live logs as they become available.
     *
     * @return the liveUrl value.
     */
    public String getLiveUrl() {
        return this.liveUrl;
    }

    /**
     * Set the liveUrl property: A URL of the real-time live logs. This URL may use either the `https://` or `wss://`
     * protocols and will keep pushing live logs as they become available.
     *
     * @param liveUrl the liveUrl value to set.
     * @return the AppsGetLogsResponse object itself.
     */
    public AppsGetLogsResponse setLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
        return this;
    }
}
