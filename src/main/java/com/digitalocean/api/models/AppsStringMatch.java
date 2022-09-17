package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppsStringMatch model. */
@Fluent
public final class AppsStringMatch {
    /*
     * Exact string match. Only 1 of `exact`, `prefix`, or `regex` must be set.
     */
    @JsonProperty(value = "exact")
    private String exact;

    /*
     * Prefix-based match. Only 1 of `exact`, `prefix`, or `regex` must be set.
     */
    @JsonProperty(value = "prefix")
    private String prefix;

    /*
     * RE2 style regex-based match. Only 1 of `exact`, `prefix`, or `regex` must be set. For more information about RE2
     * syntax, see: https://github.com/google/re2/wiki/Syntax
     */
    @JsonProperty(value = "regex")
    private String regex;

    /**
     * Get the exact property: Exact string match. Only 1 of `exact`, `prefix`, or `regex` must be set.
     *
     * @return the exact value.
     */
    public String getExact() {
        return this.exact;
    }

    /**
     * Set the exact property: Exact string match. Only 1 of `exact`, `prefix`, or `regex` must be set.
     *
     * @param exact the exact value to set.
     * @return the AppsStringMatch object itself.
     */
    public AppsStringMatch setExact(String exact) {
        this.exact = exact;
        return this;
    }

    /**
     * Get the prefix property: Prefix-based match. Only 1 of `exact`, `prefix`, or `regex` must be set.
     *
     * @return the prefix value.
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: Prefix-based match. Only 1 of `exact`, `prefix`, or `regex` must be set.
     *
     * @param prefix the prefix value to set.
     * @return the AppsStringMatch object itself.
     */
    public AppsStringMatch setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the regex property: RE2 style regex-based match. Only 1 of `exact`, `prefix`, or `regex` must be set. For
     * more information about RE2 syntax, see: https://github.com/google/re2/wiki/Syntax.
     *
     * @return the regex value.
     */
    public String getRegex() {
        return this.regex;
    }

    /**
     * Set the regex property: RE2 style regex-based match. Only 1 of `exact`, `prefix`, or `regex` must be set. For
     * more information about RE2 syntax, see: https://github.com/google/re2/wiki/Syntax.
     *
     * @param regex the regex value to set.
     * @return the AppsStringMatch object itself.
     */
    public AppsStringMatch setRegex(String regex) {
        this.regex = regex;
        return this;
    }
}
