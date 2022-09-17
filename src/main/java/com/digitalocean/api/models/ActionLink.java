package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The linked actions can be used to check the status of a Droplet's create event. */
@Fluent
public final class ActionLink {
    /*
     * A unique numeric ID that can be used to identify and reference an action.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /*
     * A string specifying the type of the related action.
     */
    @JsonProperty(value = "rel")
    private String rel;

    /*
     * A URL that can be used to access the action.
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * Get the id property: A unique numeric ID that can be used to identify and reference an action.
     *
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Set the id property: A unique numeric ID that can be used to identify and reference an action.
     *
     * @param id the id value to set.
     * @return the ActionLink object itself.
     */
    public ActionLink setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the rel property: A string specifying the type of the related action.
     *
     * @return the rel value.
     */
    public String getRel() {
        return this.rel;
    }

    /**
     * Set the rel property: A string specifying the type of the related action.
     *
     * @param rel the rel value to set.
     * @return the ActionLink object itself.
     */
    public ActionLink setRel(String rel) {
        this.rel = rel;
        return this;
    }

    /**
     * Get the href property: A URL that can be used to access the action.
     *
     * @return the href value.
     */
    public String getHref() {
        return this.href;
    }

    /**
     * Set the href property: A URL that can be used to access the action.
     *
     * @param href the href value to set.
     * @return the ActionLink object itself.
     */
    public ActionLink setHref(String href) {
        this.href = href;
        return this;
    }
}
