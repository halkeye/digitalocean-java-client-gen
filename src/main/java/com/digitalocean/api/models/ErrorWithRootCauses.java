package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ErrorWithRootCauses model.
 */
@Fluent
public final class ErrorWithRootCauses {
    /*
     * A message providing information about the error.
     */
    @JsonProperty(value = "error", required = true)
    private String error;

    /*
     * A list of legacy error messages.
     */
    @JsonProperty(value = "messages")
    private List<String> messages;

    /*
     * A list of underlying causes for the error, including details to help  resolve it when possible.
     */
    @JsonProperty(value = "root_causes", required = true)
    private List<String> rootCauses;

    /**
     * Get the error property: A message providing information about the error.
     * 
     * @return the error value.
     */
    public String getError() {
        return this.error;
    }

    /**
     * Set the error property: A message providing information about the error.
     * 
     * @param error the error value to set.
     * @return the ErrorWithRootCauses object itself.
     */
    public ErrorWithRootCauses setError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get the messages property: A list of legacy error messages.
     * 
     * @return the messages value.
     */
    public List<String> getMessages() {
        return this.messages;
    }

    /**
     * Set the messages property: A list of legacy error messages.
     * 
     * @param messages the messages value to set.
     * @return the ErrorWithRootCauses object itself.
     */
    public ErrorWithRootCauses setMessages(List<String> messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Get the rootCauses property: A list of underlying causes for the error, including details to help  resolve it
     * when possible.
     * 
     * @return the rootCauses value.
     */
    public List<String> getRootCauses() {
        return this.rootCauses;
    }

    /**
     * Set the rootCauses property: A list of underlying causes for the error, including details to help  resolve it
     * when possible.
     * 
     * @param rootCauses the rootCauses value to set.
     * @return the ErrorWithRootCauses object itself.
     */
    public ErrorWithRootCauses setRootCauses(List<String> rootCauses) {
        this.rootCauses = rootCauses;
        return this;
    }
}
